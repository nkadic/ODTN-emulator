/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyProtectionType;
import io.swagger.model.TapiTopologyRestorationPolicy;
import javax.validation.constraints.*;

/**
 * TapiTopologyResilienceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiTopologyResilienceType   {
  @JsonProperty("restoration-policy")
  private TapiTopologyRestorationPolicy restorationPolicy = null;

  @JsonProperty("protection-type")
  private TapiTopologyProtectionType protectionType = null;

  public TapiTopologyResilienceType restorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
    return this;
  }

  /**
   * none
   * @return restorationPolicy
   **/
  @JsonProperty("restoration-policy")
  @ApiModelProperty(value = "none")
  public TapiTopologyRestorationPolicy getRestorationPolicy() {
    return restorationPolicy;
  }

  public void setRestorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
  }

  public TapiTopologyResilienceType protectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
    return this;
  }

  /**
   * none
   * @return protectionType
   **/
  @JsonProperty("protection-type")
  @ApiModelProperty(value = "none")
  public TapiTopologyProtectionType getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyResilienceType tapiTopologyResilienceType = (TapiTopologyResilienceType) o;
    return Objects.equals(this.restorationPolicy, tapiTopologyResilienceType.restorationPolicy) &&
        Objects.equals(this.protectionType, tapiTopologyResilienceType.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restorationPolicy, protectionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyResilienceType {\n");
    
    sb.append("    restorationPolicy: ").append(toIndentedString(restorationPolicy)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
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

