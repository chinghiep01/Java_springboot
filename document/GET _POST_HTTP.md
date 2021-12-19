GET method and Post method of  HTTP 
GET Method  
What is GET 
 Get method is used to append data to the URL in name or value pair. Get method provides a limited length of URL. Get method let user view resources, without changing the content. Generally, Get method is better for the data which does not require any security, word doc, or image.
Important feature : 
+ Easy to bookmark data using GET method
+ The length restriction of GET method is limited
+ GET method let you store data easily 
+ GET request only used to request data from the address bar in the browser

POST  Method  
What is POST
POST Method is supported by HTTP to write and submit data to the identified resource. The data included in the body of the message will be accepted by the webserver. This method often being used by World Wide Web to send users generated data to the webserver or when users upload their files.

Important feature : 
+ POST method request gets input from the request body and query string.
+ Any parameters of POST method will not save in browser history 
+ No restriction in sending the length of data
+ POST cannot be bookmark 
+ POST request never cached


|                            |                   GET                 |             POST                     |
| ---------------------------|---------------------------------------|--------------------------------------| 
|   Backbutton/Reload       |            Harmeless                  | Data will be re-submit.Browser will alert the user that the data  are about to be resubmitted      |
|   Bookmarked              |      Can be bookmarked                |Cannot be bookemarked                       |
|   Cached                  |            Can be cached              |  Not cached                                |                             |
|   Encoding type            |   application/x-www-form-urlencoded   | 	application/x-www-form-urlencoded or multipart/form-data. Use multipart encoding for binary data  |
|   History                  | Parameters remain in browser history  |  Parameters are not saved in browser history.|              
| Restriction on data length |   The length of a URL is limited (maximum URL length is 2048 characters)      |        No restriction                            |
| Restrictions on data type  | Only ASCII characters allowed         |No restrictions. Binary data is also allowed|
| Security                   |GET is less secure compared to POST because data sent is part of the URL|POST is a little safer than GET because the parameters are not stored in browser history or in web server logs|
|Visibility                  |Data visible to everyone in the URL     |Data is not displayed in the URL|