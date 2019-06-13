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
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiNotificationNotificationChannel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiNotificationNotificationChannel   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("next-sequence-no")
  private Integer nextSequenceNo = null;

  @JsonProperty("stream-address")
  private String streamAddress = null;

  public TapiNotificationNotificationChannel name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiNotificationNotificationChannel addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiNotificationNotificationChannel localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
   **/
  @JsonProperty("local-id")
  @ApiModelProperty(value = "none")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiNotificationNotificationChannel nextSequenceNo(Integer nextSequenceNo) {
    this.nextSequenceNo = nextSequenceNo;
    return this;
  }

  /**
   * The sequence number of the next notification that will be published on the channel
   * @return nextSequenceNo
   **/
  @JsonProperty("next-sequence-no")
  @ApiModelProperty(value = "The sequence number of the next notification that will be published on the channel")
  public Integer getNextSequenceNo() {
    return nextSequenceNo;
  }

  public void setNextSequenceNo(Integer nextSequenceNo) {
    this.nextSequenceNo = nextSequenceNo;
  }

  public TapiNotificationNotificationChannel streamAddress(String streamAddress) {
    this.streamAddress = streamAddress;
    return this;
  }

  /**
   * The address/location/URI of the channel/stream to which the subscribed notifications are published.                      This specifics of this is typically dependent on the implementation protocol &amp; mechanism and hence is typed as a string.
   * @return streamAddress
   **/
  @JsonProperty("stream-address")
  @ApiModelProperty(value = "The address/location/URI of the channel/stream to which the subscribed notifications are published.                      This specifics of this is typically dependent on the implementation protocol & mechanism and hence is typed as a string.")
  public String getStreamAddress() {
    return streamAddress;
  }

  public void setStreamAddress(String streamAddress) {
    this.streamAddress = streamAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNotificationChannel tapiNotificationNotificationChannel = (TapiNotificationNotificationChannel) o;
    return Objects.equals(this.name, tapiNotificationNotificationChannel.name) &&
        Objects.equals(this.localId, tapiNotificationNotificationChannel.localId) &&
        Objects.equals(this.nextSequenceNo, tapiNotificationNotificationChannel.nextSequenceNo) &&
        Objects.equals(this.streamAddress, tapiNotificationNotificationChannel.streamAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, nextSequenceNo, streamAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNotificationChannel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    nextSequenceNo: ").append(toIndentedString(nextSequenceNo)).append("\n");
    sb.append("    streamAddress: ").append(toIndentedString(streamAddress)).append("\n");
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
