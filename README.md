## OAUTH2.0 Implementation for Token Generation

This is a OAUTH2.0 Client Utility application that is used to generate the request tokens. Please see here for more details : [Mastercard Developers](https://developer.mastercard.com/cross-border-services/documentation/getting-started-oauth2/). 
This utility application illustrates generating the request tokens require to connect with the cross-border APIs.

### Setup 
 
- Create an account at [Mastercard Developers](https://developer.mastercard.com/account/sign-up).
- Create a new project and add `Mastercard Cross-Border Services` API to your project. The project will generate the project keys required to use the APIs in each of the environments.
- Configure project and download signing key. It will download the zip file.
- To generate the request token we need oauthKeyFile, keyAlias, oauthKeyPassword, consumerKey which we can get from .p12 file.

### Build and Run   

- Open OAUTH2 utility application in IDE and dependencies will be downloaded automatically. Open the maven window,
- Select MasterCard Cross-border Services - Oauth2Token - API
- Select Life cycle 
- Run clean and install
- To generate request token use Oauth2RequestTokenGenerator class.
- The consumer key and the private certificate used for token generation(as shown below) is obtained as part of the setup described above.

|      Token Attributes     |                   Significance                    |                    Possible Values                       |
| --------------------------| --------------------------------------------------|----------------------------------------------------------|
|          x5t#S256         |                  Certificate thumbprint           |                   Signature public key
|            x5c            |                      Public cert                  |                  X.509 certificate chain 
|           kid             |                  Consumer key of cert             |             Consumer Key which we will get from DevZone
|           cty             |                     Content Type                  |                            JWS
|           typ             |                   JOSE object type                |                            JWT
|           alg             |                    JWS Algorithm                  |                       RS256 / ES256
|           nbf             |                  Not before Date                  |                       auto populated
|           grp             |                 Service group id                  |    [“PSP_PI_RO”]: This to be used for all payment related APIs
|           iss             |               Secure access issuer name           |                             SPM
|           exp             |                   Expiry date                     |                       auto populated
|           iat             |                 Issued At date                    |                      auto populated
|           jti             |                  Unique JWT id                    |                      JWT Generated id