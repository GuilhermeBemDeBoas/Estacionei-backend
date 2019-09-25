package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pagamento
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Pagamento   {
  @JsonProperty("id_pagamento")
  private String idPagamento;

  @JsonProperty("valor")
  private String valor;

  @JsonProperty("status")
  private String status;

  /**
   * Gets or Sets formaPagamento
   */
  public enum FormaPagamentoEnum {
    CASH("cash"),
    
    CARTAO_CREDITO("cartao_credito");

    private String value;

    FormaPagamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormaPagamentoEnum fromValue(String text) {
      for (FormaPagamentoEnum b : FormaPagamentoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("forma_pagamento")
  private FormaPagamentoEnum formaPagamento;

  @JsonProperty("codigo_forma_pagamento")
  private String codigoFormaPagamento;

  public Pagamento idPagamento(String idPagamento) {
    this.idPagamento = idPagamento;
    return this;
  }

  /**
   * Get idPagamento
   * @return idPagamento
  */
  @ApiModelProperty(value = "")


  public String getIdPagamento() {
    return idPagamento;
  }

  public void setIdPagamento(String idPagamento) {
    this.idPagamento = idPagamento;
  }

  public Pagamento valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  */
  @ApiModelProperty(value = "")


  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public Pagamento status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Pagamento formaPagamento(FormaPagamentoEnum formaPagamento) {
    this.formaPagamento = formaPagamento;
    return this;
  }

  /**
   * Get formaPagamento
   * @return formaPagamento
  */
  @ApiModelProperty(value = "")


  public FormaPagamentoEnum getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public Pagamento codigoFormaPagamento(String codigoFormaPagamento) {
    this.codigoFormaPagamento = codigoFormaPagamento;
    return this;
  }

  /**
   * Get codigoFormaPagamento
   * @return codigoFormaPagamento
  */
  @ApiModelProperty(value = "")


  public String getCodigoFormaPagamento() {
    return codigoFormaPagamento;
  }

  public void setCodigoFormaPagamento(String codigoFormaPagamento) {
    this.codigoFormaPagamento = codigoFormaPagamento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagamento pagamento = (Pagamento) o;
    return Objects.equals(this.idPagamento, pagamento.idPagamento) &&
        Objects.equals(this.valor, pagamento.valor) &&
        Objects.equals(this.status, pagamento.status) &&
        Objects.equals(this.formaPagamento, pagamento.formaPagamento) &&
        Objects.equals(this.codigoFormaPagamento, pagamento.codigoFormaPagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPagamento, valor, status, formaPagamento, codigoFormaPagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagamento {\n");
    
    sb.append("    idPagamento: ").append(toIndentedString(idPagamento)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    formaPagamento: ").append(toIndentedString(formaPagamento)).append("\n");
    sb.append("    codigoFormaPagamento: ").append(toIndentedString(codigoFormaPagamento)).append("\n");
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

