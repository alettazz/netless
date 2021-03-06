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
import io.swagger.client.model.CallbackReference1;

/**
 * CallDirectionSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-12T11:22:21.454Z")
public class CallDirectionSubscription {
  @SerializedName("callbackReference")
  private CallbackReference1 callbackReference = null;

  @SerializedName("filter")
  private CallEventFilter1 filter = null;

  @SerializedName("clientCorrelator")
  private String clientCorrelator = null;

  public CallDirectionSubscription callbackReference(CallbackReference1 callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

   /**
   * Get callbackReference
   * @return callbackReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public CallbackReference1 getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(CallbackReference1 callbackReference) {
    this.callbackReference = callbackReference;
  }

  public CallDirectionSubscription filter(CallEventFilter1 filter) {
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

  public CallDirectionSubscription clientCorrelator(String clientCorrelator) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallDirectionSubscription callDirectionSubscription = (CallDirectionSubscription) o;
    return Objects.equals(this.callbackReference, callDirectionSubscription.callbackReference) &&
        Objects.equals(this.filter, callDirectionSubscription.filter) &&
        Objects.equals(this.clientCorrelator, callDirectionSubscription.clientCorrelator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackReference, filter, clientCorrelator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDirectionSubscription {\n");
    
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
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

