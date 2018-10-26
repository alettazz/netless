# ClicktocallApi

All URIs are relative to *http://mn.developer.nokia.com/tasseeAPI*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clickToCall**](ClicktocallApi.md#clickToCall) | **POST** /callcontrol/v1/clicktocall | Create a click to call request


<a name="clickToCall"></a>
# **clickToCall**
> ClickToCallResponse1 clickToCall(clickToCall)

Create a click to call request



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClicktocallApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clickToCall** | [**ClickToCall1**](ClickToCall1.md)| Click to Call object that needs to be sent to the Nokia TAS |

### Return type

[**ClickToCallResponse1**](ClickToCallResponse1.md)

### Authorization

[nokia_mn_api_auth](../README.md#nokia_mn_api_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

