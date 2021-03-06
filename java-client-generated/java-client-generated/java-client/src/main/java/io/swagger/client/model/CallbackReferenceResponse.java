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

/**
 * CallbackReferenceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-12T11:22:21.454Z")
public class CallbackReferenceResponse {
  @SerializedName("notifyURL")
  private String notifyURL = null;

  @SerializedName("notificationFormat")
  private String notificationFormat = null;

  public CallbackReferenceResponse notifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * NotifyURL
   * @return notifyURL
  **/
  @ApiModelProperty(example = "http://requestb.in/example", required = true, value = "NotifyURL")
  public String getNotifyURL() {
    return notifyURL;
  }

  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }

  public CallbackReferenceResponse notificationFormat(String notificationFormat) {
    this.notificationFormat = notificationFormat;
    return this;
  }

   /**
   * Get notificationFormat
   * @return notificationFormat
  **/
  @ApiModelProperty(example = "JSON", required = true, value = "")
  public String getNotificationFormat() {
    return notificationFormat;
  }

  public void setNotificationFormat(String notificationFormat) {
    this.notificationFormat = notificationFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackReferenceResponse callbackReferenceResponse = (CallbackReferenceResponse) o;
    return Objects.equals(this.notifyURL, callbackReferenceResponse.notifyURL) &&
        Objects.equals(this.notificationFormat, callbackReferenceResponse.notificationFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyURL, notificationFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackReferenceResponse {\n");
    
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
    sb.append("    notificationFormat: ").append(toIndentedString(notificationFormat)).append("\n");
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

