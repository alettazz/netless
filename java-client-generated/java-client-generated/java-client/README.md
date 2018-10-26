# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ClicktocallApi;

import java.io.File;
import java.util.*;

public class ClicktocallApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: nokia_mn_api_auth
        ApiKeyAuth nokia_mn_api_auth = (ApiKeyAuth) defaultClient.getAuthentication("nokia_mn_api_auth");
        nokia_mn_api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //nokia_mn_api_auth.setApiKeyPrefix("Token");

        ClicktocallApi apiInstance = new ClicktocallApi();
        ClickToCall1 clickToCall = new ClickToCall1(); // ClickToCall1 | Click to Call object that needs to be sent to the Nokia TAS
        try {
            ClickToCallResponse1 result = apiInstance.clickToCall(clickToCall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClicktocallApi#clickToCall");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://mn.developer.nokia.com/tasseeAPI*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClicktocallApi* | [**clickToCall**](docs/ClicktocallApi.md#clickToCall) | **POST** /callcontrol/v1/clicktocall | Create a click to call request
*SubscriptionApi* | [**createSubscription**](docs/SubscriptionApi.md#createSubscription) | **POST** /callnotification/v1/subscriptions/callDirection | Create a call direction subscription
*SubscriptionApi* | [**deleteSubscription**](docs/SubscriptionApi.md#deleteSubscription) | **DELETE** /callnotification/v1/subscriptions/callDirection/subs | Delete a call direction subscription
*SubscriptionApi* | [**getSubscription**](docs/SubscriptionApi.md#getSubscription) | **GET** /callnotification/v1/subscriptions/callDirection/subs | Read a call direction subscription


## Documentation for Models

 - [Address](docs/Address.md)
 - [AddressDirection](docs/AddressDirection.md)
 - [CallDirectionSubscription](docs/CallDirectionSubscription.md)
 - [CallDirectionSubscription1](docs/CallDirectionSubscription1.md)
 - [CallDirectionSubscriptionResponse](docs/CallDirectionSubscriptionResponse.md)
 - [CallDirectionSubscriptionResponse1](docs/CallDirectionSubscriptionResponse1.md)
 - [CallDirectionSubscriptionResponse1CallDirectionSubscription](docs/CallDirectionSubscriptionResponse1CallDirectionSubscription.md)
 - [CallDirectionSubscriptionWrapper](docs/CallDirectionSubscriptionWrapper.md)
 - [CallDirectionSubscriptionWrapper1](docs/CallDirectionSubscriptionWrapper1.md)
 - [CallEventFilter](docs/CallEventFilter.md)
 - [CallEventFilter1](docs/CallEventFilter1.md)
 - [CallEvents](docs/CallEvents.md)
 - [CallSessionInformation](docs/CallSessionInformation.md)
 - [CallSessionInformation1](docs/CallSessionInformation1.md)
 - [CallbackReference](docs/CallbackReference.md)
 - [CallbackReference1](docs/CallbackReference1.md)
 - [CallbackReferenceResponse](docs/CallbackReferenceResponse.md)
 - [CallbackReferenceResponse1](docs/CallbackReferenceResponse1.md)
 - [ClickToCall](docs/ClickToCall.md)
 - [ClickToCall1](docs/ClickToCall1.md)
 - [ClickToCallResponse](docs/ClickToCallResponse.md)
 - [ClickToCallResponse1](docs/ClickToCallResponse1.md)
 - [ClientCorrelator](docs/ClientCorrelator.md)
 - [NotificationFormat](docs/NotificationFormat.md)
 - [NotifyURL](docs/NotifyURL.md)
 - [Participant](docs/Participant.md)
 - [ParticipantObject](docs/ParticipantObject.md)
 - [ParticipantObject1](docs/ParticipantObject1.md)
 - [ResourceURL](docs/ResourceURL.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### nokia_mn_api_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

openapi.support@nokia.com

