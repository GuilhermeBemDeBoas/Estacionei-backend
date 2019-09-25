package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Localizacao
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Localizacao   {
  @JsonProperty("latitude")
  private String latitude;

  @JsonProperty("longitude")
  private String longitude;

  @JsonProperty("andar")
  private String andar;

  public Localizacao latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  @ApiModelProperty(value = "")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Localizacao longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  @ApiModelProperty(value = "")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Localizacao andar(String andar) {
    this.andar = andar;
    return this;
  }

  /**
   * Get andar
   * @return andar
  */
  @ApiModelProperty(value = "")


  public String getAndar() {
    return andar;
  }

  public void setAndar(String andar) {
    this.andar = andar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Localizacao localizacao = (Localizacao) o;
    return Objects.equals(this.latitude, localizacao.latitude) &&
        Objects.equals(this.longitude, localizacao.longitude) &&
        Objects.equals(this.andar, localizacao.andar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, andar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Localizacao {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    andar: ").append(toIndentedString(andar)).append("\n");
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

