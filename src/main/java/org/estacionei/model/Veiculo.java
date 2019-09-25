package org.estacionei.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Veiculo
 */
@javax.annotation.Generated(value = "org.estacionei.codegen.languages.SpringCodegen", date = "2019-09-20T20:35:29.312-03:00[America/Sao_Paulo]")

public class Veiculo   {
  @JsonProperty("id_estacionamento")
  private String idEstacionamento;

  public Veiculo idEstacionamento(String idEstacionamento) {
    this.idEstacionamento = idEstacionamento;
    return this;
  }

  /**
   * Get idEstacionamento
   * @return idEstacionamento
  */
  @ApiModelProperty(value = "")


  public String getIdEstacionamento() {
    return idEstacionamento;
  }

  public void setIdEstacionamento(String idEstacionamento) {
    this.idEstacionamento = idEstacionamento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Veiculo veiculo = (Veiculo) o;
    return Objects.equals(this.idEstacionamento, veiculo.idEstacionamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstacionamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Veiculo {\n");
    
    sb.append("    idEstacionamento: ").append(toIndentedString(idEstacionamento)).append("\n");
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

