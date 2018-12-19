Feature: Stop Payment Field Validation


#==========================================================
Scenario Outline: Validate required Stop Payment fields

Given I have a Stop Payment with the following:
| Debit Card Number   | Stop Pay Amount   | Merchant Name   | Reason   | 
| <Debit Card Number> | <Stop Pay Amount> | <Merchant Name> | <Reason> | 
    
    
When I validate the Stop Payment

Then I expect the following validation errors:
| Error Code   | Error Description   | 
| <Error Code> | <Error Description> |

Examples:
| Debit Card Number | Stop Pay Amount | Merchant Name | Reason    | Error Code | Error Description         | 
| 1111000011110000  | 25.62           | Netflix       | Cancelled | ERR001     | Missing Debit Card Number |
| 1111000011110000  | 25.62           | Netflix       | Cancelled |            |                           |
| 1111000011110000  | 25.62           | Netflix       | Cancelled |            |                           |
| 1111000011110000  | 25.62           | Netflix       | Cancelled |            |                           |   