package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CartaoCredito
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class CartaoCredito   {
  @JsonProperty("id_cartao_credito")
  private String idCartaoCredito;

  @JsonProperty("validade")
  private String validade;

  @JsonProperty("cvv")
  private String cvv;

  @JsonProperty("nome")
  private String nome;

  public CartaoCredito idCartaoCredito(String idCartaoCredito) {
    this.idCartaoCredito = idCartaoCredito;
    return this;
  }

  /**
   * Get idCartaoCredito
   * @return idCartaoCredito
  */
  @ApiModelProperty(value = "")


  public String getIdCartaoCredito() {
    return idCartaoCredito;
  }

  public void setIdCartaoCredito(String idCartaoCredito) {
    this.idCartaoCredito = idCartaoCredito;
  }

  public CartaoCredito validade(String validade) {
    this.validade = validade;
    return this;
  }

  /**
   * Get validade
   * @return validade
  */
  @ApiModelProperty(value = "")


  public String getValidade() {
    return validade;
  }

  public void setValidade(String validade) {
    this.validade = validade;
  }

  public CartaoCredito cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * Get cvv
   * @return cvv
  */
  @ApiModelProperty(value = "")


  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public CartaoCredito nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  */
  @ApiModelProperty(value = "")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoCredito cartaoCredito = (CartaoCredito) o;
    return Objects.equals(this.idCartaoCredito, cartaoCredito.idCartaoCredito) &&
        Objects.equals(this.validade, cartaoCredito.validade) &&
        Objects.equals(this.cvv, cartaoCredito.cvv) &&
        Objects.equals(this.nome, cartaoCredito.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartaoCredito, validade, cvv, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoCredito {\n");
    
    sb.append("    idCartaoCredito: ").append(toIndentedString(idCartaoCredito)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

