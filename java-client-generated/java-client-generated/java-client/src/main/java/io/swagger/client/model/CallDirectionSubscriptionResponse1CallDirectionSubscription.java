/*
 * Nokia TAS Call Direction API
 * The first version of the Nokia TAS Call Direction API is an exciting step forward towards making it easier for developers to have open access to their operator's network.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: openapi.support@nokia.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallEventFilter1;
import io.swagger.client.model.CallbackReferenceResponse1;

/**
 * CallDirectionSubscriptionResponse1CallDirectionSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-12T11:22:21.454Z")
public class CallDirectionSubscriptionResponse1CallDirectionSubscription {
  @SerializedName("callbackReference")
  private CallbackReferenceResponse1 callbackReference = null;

  @SerializedName("filter")
  private CallEventFilter1 filter = null;

  @SerializedName("clientCorrelator")
  private String clientCorrelator = null;

  @SerializedName("resourceURL")
  private String resourceURL = null;

  public CallDirectionSubscriptionResponse1CallDirectionSubscription callbackReference(CallbackReferenceResponse1 callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

   /**
   * Get callbackReference
   * @return callbackReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public CallbackReferenceResponse1 getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(CallbackReferenceResponse1 callbackReference) {
    this.callbackReference = callbackReference;
  }

  public CallDirectionSubscriptionResponse1CallDirectionSubscription filter(CallEventFilter1 filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "")
  public CallEventFilter1 getFilter() {
    return filter;
  }

  public void setFilter(CallEventFilter1 filter) {
    this.filter = filter;
  }

  public CallDirectionSubscriptionResponse1CallDirectionSubscription clientCorrelator(String clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
    return this;
  }

   /**
   * ClientCorrelator
   * @return clientCorrelator
  **/
  @ApiModelProperty(example = "cc12345", required = true, value = "ClientCorrelator")
  public String getClientCorrelator() {
    return clientCorrelator;
  }

  public void setClientCorrelator(String clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
  }

  public CallDirectionSubscriptionResponse1CallDirectionSubscription resourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
    return this;
  }

   /**
   * ResourceURL
   * @return resourceURL
  **/
  @ApiModelProperty(example = "https://subdomain.domain.com/tassee/callnotification/v1/subscriptions/callDirection/subs?Id&#x3D;cc12345&amp;addr&#x3D;sip%3A%2B358123456789%40ims8.wirelessfuture.com", required = true, value = "ResourceURL")
  public String getResourceURL() {
    return resourceURL;
  }

  public void setResourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallDirectionSubscriptionResponse1CallDirectionSubscription callDirectionSubscriptionResponse1CallDirectionSubscription = (CallDirectionSubscriptionResponse1CallDirectionSubscription) o;
    return Objects.equals(this.callbackReference, callDirectionSubscriptionResponse1CallDirectionSubscription.callbackReference) &&
        Objects.equals(this.filter, callDirectionSubscriptionResponse1CallDirectionSubscription.filter) &&
        Objects.equals(this.clientCorrelator, callDirectionSubscriptionResponse1CallDirectionSubscription.clientCorrelator) &&
        Objects.equals(this.resourceURL, callDirectionSubscriptionResponse1CallDirectionSubscription.resourceURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackReference, filter, clientCorrelator, resourceURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDirectionSubscriptionResponse1CallDirectionSubscription {\n");
    
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
    sb.append("    resourceURL: ").append(toIndentedString(resourceURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

