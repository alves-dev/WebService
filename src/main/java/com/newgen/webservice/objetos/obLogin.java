/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.webservice.objetos;

/**
 *
 * @author Alves
 */
public class obLogin {

    private String usuario;
    private String senha;
    private String cnpj;

    public String getUsuario() {
        return usuario;
        // alterado web
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public obLogin(String usuario, String senha, String cnpj) {
        this.usuario = usuario;
        this.senha = senha;
        this.cnpj = cnpj;
    }
}
