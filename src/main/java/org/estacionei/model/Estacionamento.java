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

import org.estacionei.model.Localizacao;
import org.estacionei.model.Vaga;

/**
 * Estacionamento
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Estacionamento   {
  @JsonProperty("id_estacionanto")
  private String idEstacionanto;

  @JsonProperty("nome")
  private String nome;

  @JsonProperty("endereco")
  private String endereco;

  @JsonProperty("mapa")
  private Vaga mapa = null;

  @JsonProperty("entradas")
  @Valid
  private List<Localizacao> entradas = null;

  @JsonProperty("vagas")
  @Valid
  private List<Vaga> vagas = null;

  public Estacionamento idEstacionanto(String idEstacionanto) {
    this.idEstacionanto = idEstacionanto;
    return this;
  }

  /**
   * Get idEstacionanto
   * @return idEstacionanto
  */
  @ApiModelProperty(value = "")


  public String getIdEstacionanto() {
    return idEstacionanto;
  }

  public void setIdEstacionanto(String idEstacionanto) {
    this.idEstacionanto = idEstacionanto;
  }

  public Estacionamento nome(String nome) {
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

  public Estacionamento endereco(String endereco) {
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

  public Estacionamento mapa(Vaga mapa) {
    this.mapa = mapa;
    return this;
  }

  /**
   * Get mapa
   * @return mapa
  */
  @ApiModelProperty(value = "")

  @Valid

  public Vaga getMapa() {
    return mapa;
  }

  public void setMapa(Vaga mapa) {
    this.mapa = mapa;
  }

  public Estacionamento entradas(List<Localizacao> entradas) {
    this.entradas = entradas;
    return this;
  }

  public Estacionamento addEntradasItem(Localizacao entradasItem) {
    if (this.entradas == null) {
      this.entradas = new ArrayList<>();
    }
    this.entradas.add(entradasItem);
    return this;
  }

  /**
   * Get entradas
   * @return entradas
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Localizacao> getEntradas() {
    return entradas;
  }

  public void setEntradas(List<Localizacao> entradas) {
    this.entradas = entradas;
  }

  public Estacionamento vagas(List<Vaga> vagas) {
    this.vagas = vagas;
    return this;
  }

  public Estacionamento addVagasItem(Vaga vagasItem) {
    if (this.vagas == null) {
      this.vagas = new ArrayList<>();
    }
    this.vagas.add(vagasItem);
    return this;
  }

  /**
   * Get vagas
   * @return vagas
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Vaga> getVagas() {
    return vagas;
  }

  public void setVagas(List<Vaga> vagas) {
    this.vagas = vagas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Estacionamento estacionamento = (Estacionamento) o;
    return Objects.equals(this.idEstacionanto, estacionamento.idEstacionanto) &&
        Objects.equals(this.nome, estacionamento.nome) &&
        Objects.equals(this.endereco, estacionamento.endereco) &&
        Objects.equals(this.mapa, estacionamento.mapa) &&
        Objects.equals(this.entradas, estacionamento.entradas) &&
        Objects.equals(this.vagas, estacionamento.vagas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstacionanto, nome, endereco, mapa, entradas, vagas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Estacionamento {\n");
    
    sb.append("    idEstacionanto: ").append(toIndentedString(idEstacionanto)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    mapa: ").append(toIndentedString(mapa)).append("\n");
    sb.append("    entradas: ").append(toIndentedString(entradas)).append("\n");
    sb.append("    vagas: ").append(toIndentedString(vagas)).append("\n");
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

