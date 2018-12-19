# rest-mysql-openshift-example


#### Start the Minishift VM and Enable Admin User

Start minishift with enough resources:
```
$ minishift start --cpus 4 --disk-size 100GB --memory 12GB
```

Once the Kubernetes cluster is running, login as admin user:
```
$ oc login -u system:admin
```

Enable the admin user so that you can login to the console as u:admin, p:admin
```
$ minishift addon apply admin-user
```

You should be able to login to the web console with user:admin, pass:admin



#### Source-to-Image Application Build and Deploy

Create a new OpenShift project for the new application.
```
$ oc new-project rest-mysql-demo
```

Build the project and run unit tests.
```
$ mvn clean install
```

Create the application for the rest service deployable in OpenShift.
```
$ oc new-app openshift/jboss-eap-7/eap70-openshift~http://github.com/lcspangler/rest-mysql-openshift-example.git --name=demo-app-service
```

Create a configmap for environment variables used by the application. In a real application, the login credentials should go into a secret instead of a configmap.
```
$ oc project mysql-demo
$ database_url=`oc get service mysql -o=jsonpath='{.spec.clusterIP}{"\n"}'`
$ database_url="${database_url}:3306"
$ oc project rest-mysql-demo
$ oc create configmap rest-mysql-demo-config \
            --from-literal=DATABASE_URL="${database_url}" \
            --from-literal=DATABASE_USER=user \
            --from-literal=DATABASE_PASS=pass
```

Apply the configmap to the deployment config.
```
oc set env dc/demo-app-service --from configmap/rest-mysql-demo-config
```



oc new-app openshift/wildfly-101-centos7~https://github.com/lcspangler/rest-mysql-openshift-example.git --name=demo-app-service






oc new-app jboss-eap-7-tech-preview/eap72-openshift~http://github.com/lcspangler/rest-mysql-openshift-example.git --name=demo-app-service
