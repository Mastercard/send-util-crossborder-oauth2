## OAUTH2.0 Implementation for Token Generation

This is a OAUTH2.0 Client Utility application to generate the request token. Please see here for more details : [Mastercard Developers](https://developer.mastercard.com/cross-border-services/documentation/getting-started-oauth2/). 
This application illustrates the generation of request token required to connect with the cross-border APIs with oauth2 authentication method.

### Setup 
 
- Create an account at [Mastercard Developers](https://developer.mastercard.com/account/sign-up).
- Create a new project and add `Mastercard Cross-Border Services` API to your project. This project will provide access to APIs in sandbox the environment first.
- Download signing key(a zip file will get downloaded). These properties and file will be required in utility to generate request token. 
- Select .p12 file from zip, copy it to some folder and give its path with filename.

### Build and Run   

- Open OAUTH2 utility application in IDE and dependencies will be downloaded automatically. Open the maven window,
- Select MasterCard Cross-border Services - Oauth2Token - API
- Select Life cycle 
- Run clean and install

### Decoding Request token

|      Token Attributes     |                   Significance                    |                    Possible Values                       |
| --------------------------| --------------------------------------------------|----------------------------------------------------------|
|          x5t#S256         |                  Certificate thumbprint           |                   Signature public key
|           kid             |                  Consumer key of cert             |             Consumer Key which we will get from DevZone
|           cty             |                     Content Type                  |                            JWS
|           typ             |                   JOSE object type                |                            JWT
|           alg             |                    JWS Algorithm                  |                       RS256 / ES256
|           nbf             |                  Not before Date                  |                       auto populated
|           exp             |                   Expiry date                     |                       auto populated
|           iat             |                 Issued At date                    |                      auto populated
|           jti             |                  Unique JWT id                    |                      JWT Generated id

### Executing the use cases
**Generate a sample token**

- Go to [project folder](\src\test\java\com\mastercard\oauth2\requesttoken\generator), Open Oauth2RequestTokenGeneratorTest.java
- To generate sample token, pass required input parameters.
- Right click on testGenerateToken() method in the class and run. You will get the request token. 
