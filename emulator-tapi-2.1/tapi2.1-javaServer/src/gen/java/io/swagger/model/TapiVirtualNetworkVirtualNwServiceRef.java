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
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkVirtualNwServiceRef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiVirtualNetworkVirtualNwServiceRef   {
  @JsonProperty("virtual-nw-service-uuid")
  private String virtualNwServiceUuid = null;

  public TapiVirtualNetworkVirtualNwServiceRef virtualNwServiceUuid(String virtualNwServiceUuid) {
    this.virtualNwServiceUuid = virtualNwServiceUuid;
    return this;
  }

  /**
   * none
   * @return virtualNwServiceUuid
   **/
  @JsonProperty("virtual-nw-service-uuid")
  @ApiModelProperty(value = "none")
  public String getVirtualNwServiceUuid() {
    return virtualNwServiceUuid;
  }

  public void setVirtualNwServiceUuid(String virtualNwServiceUuid) {
    this.virtualNwServiceUuid = virtualNwServiceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNwServiceRef tapiVirtualNetworkVirtualNwServiceRef = (TapiVirtualNetworkVirtualNwServiceRef) o;
    return Objects.equals(this.virtualNwServiceUuid, tapiVirtualNetworkVirtualNwServiceRef.virtualNwServiceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNwServiceUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNwServiceRef {\n");
    
    sb.append("    virtualNwServiceUuid: ").append(toIndentedString(virtualNwServiceUuid)).append("\n");
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

