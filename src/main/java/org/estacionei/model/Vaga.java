package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.estacionei.model.Localizacao;

/**
 * Vaga
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Vaga   {
  @JsonProperty("id_vaga")
  private String idVaga;

  @JsonProperty("status")
  private Boolean status;

  /**
   * Gets or Sets tipoVaga
   */
  public enum TipoVagaEnum {
    NORMAL("normal");

    private String value;

    TipoVagaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoVagaEnum fromValue(String text) {
      for (TipoVagaEnum b : TipoVagaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("tipo_vaga")
  private TipoVagaEnum tipoVaga;

  @JsonProperty("preco_hora")
  private String precoHora;

  @JsonProperty("localizacao")
  private Localizacao localizacao = null;

  public Vaga idVaga(String idVaga) {
    this.idVaga = idVaga;
    return this;
  }

  /**
   * Get idVaga
   * @return idVaga
  */
  @ApiModelProperty(value = "")


  public String getIdVaga() {
    return idVaga;
  }

  public void setIdVaga(String idVaga) {
    this.idVaga = idVaga;
  }

  public Vaga status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Vaga tipoVaga(TipoVagaEnum tipoVaga) {
    this.tipoVaga = tipoVaga;
    return this;
  }

  /**
   * Get tipoVaga
   * @return tipoVaga
  */
  @ApiModelProperty(value = "")


  public TipoVagaEnum getTipoVaga() {
    return tipoVaga;
  }

  public void setTipoVaga(TipoVagaEnum tipoVaga) {
    this.tipoVaga = tipoVaga;
  }

  public Vaga precoHora(String precoHora) {
    this.precoHora = precoHora;
    return this;
  }

  /**
   * Get precoHora
   * @return precoHora
  */
  @ApiModelProperty(value = "")


  public String getPrecoHora() {
    return precoHora;
  }

  public void setPrecoHora(String precoHora) {
    this.precoHora = precoHora;
  }

  public Vaga localizacao(Localizacao localizacao) {
    this.localizacao = localizacao;
    return this;
  }

  /**
   * Get localizacao
   * @return localizacao
  */
  @ApiModelProperty(value = "")

  @Valid

  public Localizacao getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(Localizacao localizacao) {
    this.localizacao = localizacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vaga vaga = (Vaga) o;
    return Objects.equals(this.idVaga, vaga.idVaga) &&
        Objects.equals(this.status, vaga.status) &&
        Objects.equals(this.tipoVaga, vaga.tipoVaga) &&
        Objects.equals(this.precoHora, vaga.precoHora) &&
        Objects.equals(this.localizacao, vaga.localizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idVaga, status, tipoVaga, precoHora, localizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vaga {\n");
    
    sb.append("    idVaga: ").append(toIndentedString(idVaga)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tipoVaga: ").append(toIndentedString(tipoVaga)).append("\n");
    sb.append("    precoHora: ").append(toIndentedString(precoHora)).append("\n");
    sb.append("    localizacao: ").append(toIndentedString(localizacao)).append("\n");
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

