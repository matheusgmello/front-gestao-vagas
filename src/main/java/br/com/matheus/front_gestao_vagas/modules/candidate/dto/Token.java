package br.com.matheus.front_gestao_vagas.modules.candidate.dto;

public class Token {

  private String access_token;

  public String  getAccess_token(){
      return access_token;
  }

  public void setAccess_token(String access_token){
      this.access_token = access_token;
  }
}