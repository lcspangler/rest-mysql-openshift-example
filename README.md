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



#### Install and Populate MySQL Database


#### Source-to-Image Application Build and Deploy


```
$ mvn clean install
```

```
$ oc new-app openshift/jboss-eap-7/eap70-openshift~http://github.com/lcspangler/rest-mysql-openshift-example.git --context-dir=/demo-app-service --name=demo-app-service
```
