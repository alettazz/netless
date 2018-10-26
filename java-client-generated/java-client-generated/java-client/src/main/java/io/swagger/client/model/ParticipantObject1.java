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
 * ParticipantObject1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-12T11:22:21.454Z")
public class ParticipantObject1 {
  @SerializedName("participantAddress")
  private String participantAddress = null;

  public ParticipantObject1 participantAddress(String participantAddress) {
    this.participantAddress = participantAddress;
    return this;
  }

   /**
   * Get participantAddress
   * @return participantAddress
  **/
  @ApiModelProperty(example = "sip:+358123456789@ims8.wirelessfuture.com", required = true, value = "")
  public String getParticipantAddress() {
    return participantAddress;
  }

  public void setParticipantAddress(String participantAddress) {
    this.participantAddress = participantAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantObject1 participantObject1 = (ParticipantObject1) o;
    return Objects.equals(this.participantAddress, participantObject1.participantAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantObject1 {\n");
    
    sb.append("    participantAddress: ").append(toIndentedString(participantAddress)).append("\n");
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

