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
import io.swagger.client.model.CallSessionInformation1;

/**
 * ClickToCall1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-12T11:22:21.454Z")
public class ClickToCall1 {
  @SerializedName("callSessionInformation")
  private CallSessionInformation1 callSessionInformation = null;

  public ClickToCall1 callSessionInformation(CallSessionInformation1 callSessionInformation) {
    this.callSessionInformation = callSessionInformation;
    return this;
  }

   /**
   * Get callSessionInformation
   * @return callSessionInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public CallSessionInformation1 getCallSessionInformation() {
    return callSessionInformation;
  }

  public void setCallSessionInformation(CallSessionInformation1 callSessionInformation) {
    this.callSessionInformation = callSessionInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickToCall1 clickToCall1 = (ClickToCall1) o;
    return Objects.equals(this.callSessionInformation, clickToCall1.callSessionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSessionInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickToCall1 {\n");
    
    sb.append("    callSessionInformation: ").append(toIndentedString(callSessionInformation)).append("\n");
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
