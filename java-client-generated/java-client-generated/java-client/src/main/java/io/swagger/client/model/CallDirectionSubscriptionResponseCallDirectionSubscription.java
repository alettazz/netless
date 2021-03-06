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
import io.swagger.client.model.CallEventFilter;
import io.swagger.client.model.CallbackReferenceResponse;
import io.swagger.client.model.ClientCorrelator;
import io.swagger.client.model.ResourceURL;

/**
 * CallDirectionSubscriptionResponseCallDirectionSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T11:21:14.917Z")
public class CallDirectionSubscriptionResponseCallDirectionSubscription {
  @SerializedName("callbackReference")
  private CallbackReferenceResponse callbackReference = null;

  @SerializedName("filter")
  private CallEventFilter filter = null;

  @SerializedName("clientCorrelator")
  private ClientCorrelator clientCorrelator = null;

  @SerializedName("resourceURL")
  private ResourceURL resourceURL = null;

  public CallDirectionSubscriptionResponseCallDirectionSubscription callbackReference(CallbackReferenceResponse callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

   /**
   * Get callbackReference
   * @return callbackReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CallbackReferenceResponse getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(CallbackReferenceResponse callbackReference) {
    this.callbackReference = callbackReference;
  }

  public CallDirectionSubscriptionResponseCallDirectionSubscription filter(CallEventFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CallEventFilter getFilter() {
    return filter;
  }

  public void setFilter(CallEventFilter filter) {
    this.filter = filter;
  }

  public CallDirectionSubscriptionResponseCallDirectionSubscription clientCorrelator(ClientCorrelator clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
    return this;
  }

   /**
   * Get clientCorrelator
   * @return clientCorrelator
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ClientCorrelator getClientCorrelator() {
    return clientCorrelator;
  }

  public void setClientCorrelator(ClientCorrelator clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
  }

  public CallDirectionSubscriptionResponseCallDirectionSubscription resourceURL(ResourceURL resourceURL) {
    this.resourceURL = resourceURL;
    return this;
  }

   /**
   * Get resourceURL
   * @return resourceURL
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ResourceURL getResourceURL() {
    return resourceURL;
  }

  public void setResourceURL(ResourceURL resourceURL) {
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
    CallDirectionSubscriptionResponseCallDirectionSubscription callDirectionSubscriptionResponseCallDirectionSubscription = (CallDirectionSubscriptionResponseCallDirectionSubscription) o;
    return Objects.equals(this.callbackReference, callDirectionSubscriptionResponseCallDirectionSubscription.callbackReference) &&
        Objects.equals(this.filter, callDirectionSubscriptionResponseCallDirectionSubscription.filter) &&
        Objects.equals(this.clientCorrelator, callDirectionSubscriptionResponseCallDirectionSubscription.clientCorrelator) &&
        Objects.equals(this.resourceURL, callDirectionSubscriptionResponseCallDirectionSubscription.resourceURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackReference, filter, clientCorrelator, resourceURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDirectionSubscriptionResponseCallDirectionSubscription {\n");
    
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

