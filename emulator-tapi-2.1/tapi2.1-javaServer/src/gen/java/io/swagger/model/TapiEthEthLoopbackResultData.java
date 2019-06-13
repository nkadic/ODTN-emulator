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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiEthEthLoopbackResultData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthLoopbackResultData   {
  @JsonProperty("ber-lbr-frames")
  private Integer berLbrFrames = null;

  @JsonProperty("crc-lbr-frames")
  private Integer crcLbrFrames = null;

  @JsonProperty("detected-peer-mep")
  private List<String> detectedPeerMep = null;

  @JsonProperty("sent-lbm-frames")
  private Integer sentLbmFrames = null;

  @JsonProperty("out-of-order-lbr-frames")
  private Integer outOfOrderLbrFrames = null;

  @JsonProperty("rec-lbr-frames")
  private Integer recLbrFrames = null;

  public TapiEthEthLoopbackResultData berLbrFrames(Integer berLbrFrames) {
    this.berLbrFrames = berLbrFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the number of LBR frames where there was a bit error in the pattern.
   * @return berLbrFrames
   **/
  @JsonProperty("ber-lbr-frames")
  @ApiModelProperty(value = "G.8052: This parameter returns the number of LBR frames where there was a bit error in the pattern.")
  public Integer getBerLbrFrames() {
    return berLbrFrames;
  }

  public void setBerLbrFrames(Integer berLbrFrames) {
    this.berLbrFrames = berLbrFrames;
  }

  public TapiEthEthLoopbackResultData crcLbrFrames(Integer crcLbrFrames) {
    this.crcLbrFrames = crcLbrFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the number of LBR frames where the CRC in the pattern failed.
   * @return crcLbrFrames
   **/
  @JsonProperty("crc-lbr-frames")
  @ApiModelProperty(value = "G.8052: This parameter returns the number of LBR frames where the CRC in the pattern failed.")
  public Integer getCrcLbrFrames() {
    return crcLbrFrames;
  }

  public void setCrcLbrFrames(Integer crcLbrFrames) {
    this.crcLbrFrames = crcLbrFrames;
  }

  public TapiEthEthLoopbackResultData detectedPeerMep(List<String> detectedPeerMep) {
    this.detectedPeerMep = detectedPeerMep;
    return this;
  }

  public TapiEthEthLoopbackResultData addDetectedPeerMepItem(String detectedPeerMepItem) {
    if (this.detectedPeerMep == null) {
      this.detectedPeerMep = new ArrayList<String>();
    }
    this.detectedPeerMep.add(detectedPeerMepItem);
    return this;
  }

  /**
   * G.8052: This parameter returns the MAC addresses of the discovered peer MEPs of the subject MEP.
   * @return detectedPeerMep
   **/
  @JsonProperty("detected-peer-mep")
  @ApiModelProperty(value = "G.8052: This parameter returns the MAC addresses of the discovered peer MEPs of the subject MEP.")
  public List<String> getDetectedPeerMep() {
    return detectedPeerMep;
  }

  public void setDetectedPeerMep(List<String> detectedPeerMep) {
    this.detectedPeerMep = detectedPeerMep;
  }

  public TapiEthEthLoopbackResultData sentLbmFrames(Integer sentLbmFrames) {
    this.sentLbmFrames = sentLbmFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the total number of sent LBM frames.
   * @return sentLbmFrames
   **/
  @JsonProperty("sent-lbm-frames")
  @ApiModelProperty(value = "G.8052: This parameter returns the total number of sent LBM frames.")
  public Integer getSentLbmFrames() {
    return sentLbmFrames;
  }

  public void setSentLbmFrames(Integer sentLbmFrames) {
    this.sentLbmFrames = sentLbmFrames;
  }

  public TapiEthEthLoopbackResultData outOfOrderLbrFrames(Integer outOfOrderLbrFrames) {
    this.outOfOrderLbrFrames = outOfOrderLbrFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the number of LBR traffic unites (messages) that were received out of order (OO).
   * @return outOfOrderLbrFrames
   **/
  @JsonProperty("out-of-order-lbr-frames")
  @ApiModelProperty(value = "G.8052: This parameter returns the number of LBR traffic unites (messages) that were received out of order (OO).")
  public Integer getOutOfOrderLbrFrames() {
    return outOfOrderLbrFrames;
  }

  public void setOutOfOrderLbrFrames(Integer outOfOrderLbrFrames) {
    this.outOfOrderLbrFrames = outOfOrderLbrFrames;
  }

  public TapiEthEthLoopbackResultData recLbrFrames(Integer recLbrFrames) {
    this.recLbrFrames = recLbrFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the total number of received LBR messages, including the out of order LBR frames.
   * @return recLbrFrames
   **/
  @JsonProperty("rec-lbr-frames")
  @ApiModelProperty(value = "G.8052: This parameter returns the total number of received LBR messages, including the out of order LBR frames.")
  public Integer getRecLbrFrames() {
    return recLbrFrames;
  }

  public void setRecLbrFrames(Integer recLbrFrames) {
    this.recLbrFrames = recLbrFrames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthLoopbackResultData tapiEthEthLoopbackResultData = (TapiEthEthLoopbackResultData) o;
    return Objects.equals(this.berLbrFrames, tapiEthEthLoopbackResultData.berLbrFrames) &&
        Objects.equals(this.crcLbrFrames, tapiEthEthLoopbackResultData.crcLbrFrames) &&
        Objects.equals(this.detectedPeerMep, tapiEthEthLoopbackResultData.detectedPeerMep) &&
        Objects.equals(this.sentLbmFrames, tapiEthEthLoopbackResultData.sentLbmFrames) &&
        Objects.equals(this.outOfOrderLbrFrames, tapiEthEthLoopbackResultData.outOfOrderLbrFrames) &&
        Objects.equals(this.recLbrFrames, tapiEthEthLoopbackResultData.recLbrFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(berLbrFrames, crcLbrFrames, detectedPeerMep, sentLbmFrames, outOfOrderLbrFrames, recLbrFrames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthLoopbackResultData {\n");
    
    sb.append("    berLbrFrames: ").append(toIndentedString(berLbrFrames)).append("\n");
    sb.append("    crcLbrFrames: ").append(toIndentedString(crcLbrFrames)).append("\n");
    sb.append("    detectedPeerMep: ").append(toIndentedString(detectedPeerMep)).append("\n");
    sb.append("    sentLbmFrames: ").append(toIndentedString(sentLbmFrames)).append("\n");
    sb.append("    outOfOrderLbrFrames: ").append(toIndentedString(outOfOrderLbrFrames)).append("\n");
    sb.append("    recLbrFrames: ").append(toIndentedString(recLbrFrames)).append("\n");
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
