# SubscriptionApi

All URIs are relative to *http://mn.developer.nokia.com/tasseeAPI*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionApi.md#createSubscription) | **POST** /callnotification/v1/subscriptions/callDirection | Create a call direction subscription
[**deleteSubscription**](SubscriptionApi.md#deleteSubscription) | **DELETE** /callnotification/v1/subscriptions/callDirection/subs | Delete a call direction subscription
[**getSubscription**](SubscriptionApi.md#getSubscription) | **GET** /callnotification/v1/subscriptions/callDirection/subs | Read a call direction subscription


<a name="createSubscription"></a>
# **createSubscription**
> CallDirectionSubscriptionResponse1 createSubscription(callDirectionSubscription)

Create a call direction subscription



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: nokia_mn_api_auth
ApiKeyAuth nokia_mn_api_auth = (ApiKeyAuth) defaultClient.getAuthentication("nokia_mn_api_auth");
nokia_mn_api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//nokia_mn_api_auth.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
CallDirectionSubscriptionWrapper1 callDirectionSubscription = new CallDirectionSubscriptionWrapper1(); // CallDirectionSubscriptionWrapper1 | Call direction subscription object that needs to be sent to the Nokia TAS
try {
    CallDirectionSubscriptionResponse1 result = apiInstance.createSubscription(callDirectionSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callDirectionSubscription** | [**CallDirectionSubscriptionWrapper1**](CallDirectionSubscriptionWrapper1.md)| Call direction subscription object that needs to be sent to the Nokia TAS |

### Return type

[**CallDirectionSubscriptionResponse1**](CallDirectionSubscriptionResponse1.md)

### Authorization

[nokia_mn_api_auth](../README.md#nokia_mn_api_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(id, addr)

Delete a call direction subscription



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: nokia_mn_api_auth
ApiKeyAuth nokia_mn_api_auth = (ApiKeyAuth) defaultClient.getAuthentication("nokia_mn_api_auth");
nokia_mn_api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//nokia_mn_api_auth.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
String id = "id_example"; // String | Subscription identifier
String addr = "addr_example"; // String | Subscriber address (SIP address)
try {
    apiInstance.deleteSubscription(id, addr);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#deleteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription identifier |
 **addr** | **String**| Subscriber address (SIP address) |

### Return type

null (empty response body)

### Authorization

[nokia_mn_api_auth](../README.md#nokia_mn_api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getSubscription"></a>
# **getSubscription**
> CallDirectionSubscriptionResponse1 getSubscription(id, addr)

Read a call direction subscription



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: nokia_mn_api_auth
ApiKeyAuth nokia_mn_api_auth = (ApiKeyAuth) defaultClient.getAuthentication("nokia_mn_api_auth");
nokia_mn_api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//nokia_mn_api_auth.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
String id = "id_example"; // String | Subscription identifier
String addr = "addr_example"; // String | Subscriber address (SIP address)
try {
    CallDirectionSubscriptionResponse1 result = apiInstance.getSubscription(id, addr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription identifier |
 **addr** | **String**| Subscriber address (SIP address) |

### Return type

[**CallDirectionSubscriptionResponse1**](CallDirectionSubscriptionResponse1.md)

### Authorization

[nokia_mn_api_auth](../README.md#nokia_mn_api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

