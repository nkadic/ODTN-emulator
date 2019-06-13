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
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonServiceInterfacePoint;
import io.swagger.model.TapiPhotonicMediaMediaChannelServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaServiceInterfacePointAugmentation1;
import io.swagger.model.TapiPhotonicMediaServiceInterfacePointAugmentation2;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiCommonContextServiceInterfacePoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonContextServiceInterfacePoint   {
  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("supported-layer-protocol-qualifier")
  private List<String> supportedLayerProtocolQualifier = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("otsi-service-interface-point-spec")
  private TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec = null;

  @JsonProperty("tapi-photonic-media:media-channel-service-interface-point-spec")
  private TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec = null;

  public TapiCommonContextServiceInterfacePoint operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * none
   * @return operationalState
   **/
  @JsonProperty("operational-state")
  @ApiModelProperty(value = "none")
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiCommonContextServiceInterfacePoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * none
   * @return lifecycleState
   **/
  @JsonProperty("lifecycle-state")
  @ApiModelProperty(value = "none")
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiCommonContextServiceInterfacePoint administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * none
   * @return administrativeState
   **/
  @JsonProperty("administrative-state")
  @ApiModelProperty(value = "none")
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiCommonContextServiceInterfacePoint availableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

  /**
   * Capacity available to be assigned.
   * @return availableCapacity
   **/
  @JsonProperty("available-capacity")
  @ApiModelProperty(value = "Capacity available to be assigned.")
  public TapiCommonCapacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public TapiCommonContextServiceInterfacePoint totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

  /**
   * An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.
   * @return totalPotentialCapacity
   **/
  @JsonProperty("total-potential-capacity")
  @ApiModelProperty(value = "An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.")
  public TapiCommonCapacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }

  public TapiCommonContextServiceInterfacePoint name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiCommonContextServiceInterfacePoint addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiCommonContextServiceInterfacePoint uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiCommonContextServiceInterfacePoint supportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
    return this;
  }

  public TapiCommonContextServiceInterfacePoint addSupportedLayerProtocolQualifierItem(String supportedLayerProtocolQualifierItem) {
    if (this.supportedLayerProtocolQualifier == null) {
      this.supportedLayerProtocolQualifier = new ArrayList<String>();
    }
    this.supportedLayerProtocolQualifier.add(supportedLayerProtocolQualifierItem);
    return this;
  }

  /**
   * none
   * @return supportedLayerProtocolQualifier
   **/
  @JsonProperty("supported-layer-protocol-qualifier")
  @ApiModelProperty(value = "none")
  public List<String> getSupportedLayerProtocolQualifier() {
    return supportedLayerProtocolQualifier;
  }

  public void setSupportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
  }

  public TapiCommonContextServiceInterfacePoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Usage of layerProtocolName [&gt;1]  in the ServiceInterfacePoint should be considered experimental
   * @return layerProtocolName
   **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "Usage of layerProtocolName [>1]  in the ServiceInterfacePoint should be considered experimental")
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiCommonContextServiceInterfacePoint otsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
    return this;
  }

  /**
   * none
   * @return otsiServiceInterfacePointSpec
   **/
  @JsonProperty("otsi-service-interface-point-spec")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaOtsiServiceInterfacePointSpec getOtsiServiceInterfacePointSpec() {
    return otsiServiceInterfacePointSpec;
  }

  public void setOtsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
  }

  public TapiCommonContextServiceInterfacePoint mediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
    return this;
  }

  /**
   * none
   * @return mediaChannelServiceInterfacePointSpec
   **/
  @JsonProperty("tapi-photonic-media:media-channel-service-interface-point-spec")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaMediaChannelServiceInterfacePointSpec getMediaChannelServiceInterfacePointSpec() {
    return mediaChannelServiceInterfacePointSpec;
  }

  public void setMediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonContextServiceInterfacePoint tapiCommonContextServiceInterfacePoint = (TapiCommonContextServiceInterfacePoint) o;
    return Objects.equals(this.operationalState, tapiCommonContextServiceInterfacePoint.operationalState) &&
        Objects.equals(this.lifecycleState, tapiCommonContextServiceInterfacePoint.lifecycleState) &&
        Objects.equals(this.administrativeState, tapiCommonContextServiceInterfacePoint.administrativeState) &&
        Objects.equals(this.availableCapacity, tapiCommonContextServiceInterfacePoint.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiCommonContextServiceInterfacePoint.totalPotentialCapacity) &&
        Objects.equals(this.name, tapiCommonContextServiceInterfacePoint.name) &&
        Objects.equals(this.uuid, tapiCommonContextServiceInterfacePoint.uuid) &&
        Objects.equals(this.supportedLayerProtocolQualifier, tapiCommonContextServiceInterfacePoint.supportedLayerProtocolQualifier) &&
        Objects.equals(this.layerProtocolName, tapiCommonContextServiceInterfacePoint.layerProtocolName) &&
        Objects.equals(this.otsiServiceInterfacePointSpec, tapiCommonContextServiceInterfacePoint.otsiServiceInterfacePointSpec) &&
        Objects.equals(this.mediaChannelServiceInterfacePointSpec, tapiCommonContextServiceInterfacePoint.mediaChannelServiceInterfacePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, lifecycleState, administrativeState, availableCapacity, totalPotentialCapacity, name, uuid, supportedLayerProtocolQualifier, layerProtocolName, otsiServiceInterfacePointSpec, mediaChannelServiceInterfacePointSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonContextServiceInterfacePoint {\n");
    
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    supportedLayerProtocolQualifier: ").append(toIndentedString(supportedLayerProtocolQualifier)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    otsiServiceInterfacePointSpec: ").append(toIndentedString(otsiServiceInterfacePointSpec)).append("\n");
    sb.append("    mediaChannelServiceInterfacePointSpec: ").append(toIndentedString(mediaChannelServiceInterfacePointSpec)).append("\n");
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
