/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.webservice.objetos;

import java.util.Date;

/**
 *
 * @author Alves
 */
public class obToken {

    private Date validade;
    private String token;

    public obToken(Date validade, String token) {
        this.validade = validade;
        this.token = token;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
