package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.estacionei.model.CartaoCredito;

/**
 * Cliente
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Cliente   {
  @JsonProperty("id_cliente")
  private String idCliente;

  @JsonProperty("nome")
  private String nome;

  @JsonProperty("email")
  private String email;

  @JsonProperty("tipo_cliente")
  private String tipoCliente;

  @JsonProperty("senha")
  private String senha;

  @JsonProperty("endereco")
  private String endereco;

  @JsonProperty("saldo")
  private String saldo;

  @JsonProperty("cartoes")
  @Valid
  private List<CartaoCredito> cartoes = null;

  public Cliente idCliente(String idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * cpf/cnpj do cliente
   * @return idCliente
  */
  @ApiModelProperty(value = "cpf/cnpj do cliente")


  public String getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  public Cliente nome(String nome) {
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

  public Cliente email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Cliente tipoCliente(String tipoCliente) {
    this.tipoCliente = tipoCliente;
    return this;
  }

  /**
   * Get tipoCliente
   * @return tipoCliente
  */
  @ApiModelProperty(value = "")


  public String getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(String tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  public Cliente senha(String senha) {
    this.senha = senha;
    return this;
  }

  /**
   * Get senha
   * @return senha
  */
  @ApiModelProperty(value = "")


  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Cliente endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
  */
  @ApiModelProperty(value = "")


  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Cliente saldo(String saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Get saldo
   * @return saldo
  */
  @ApiModelProperty(value = "")


  public String getSaldo() {
    return saldo;
  }

  public void setSaldo(String saldo) {
    this.saldo = saldo;
  }

  public Cliente cartoes(List<CartaoCredito> cartoes) {
    this.cartoes = cartoes;
    return this;
  }

  public Cliente addCartoesItem(CartaoCredito cartoesItem) {
    if (this.cartoes == null) {
      this.cartoes = new ArrayList<>();
    }
    this.cartoes.add(cartoesItem);
    return this;
  }

  /**
   * Get cartoes
   * @return cartoes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CartaoCredito> getCartoes() {
    return cartoes;
  }

  public void setCartoes(List<CartaoCredito> cartoes) {
    this.cartoes = cartoes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.idCliente, cliente.idCliente) &&
        Objects.equals(this.nome, cliente.nome) &&
        Objects.equals(this.email, cliente.email) &&
        Objects.equals(this.tipoCliente, cliente.tipoCliente) &&
        Objects.equals(this.senha, cliente.senha) &&
        Objects.equals(this.endereco, cliente.endereco) &&
        Objects.equals(this.saldo, cliente.saldo) &&
        Objects.equals(this.cartoes, cliente.cartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCliente, nome, email, tipoCliente, senha, endereco, saldo, cartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tipoCliente: ").append(toIndentedString(tipoCliente)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    cartoes: ").append(toIndentedString(cartoes)).append("\n");
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

