/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.webservice;

import com.newgen.webservice.objetos.obLogin;
import com.newgen.webservice.objetos.obToken;
import java.time.Instant;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Alves
 */
@WebService(serviceName = "Login")
@Stateless()
public class Login {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Online")
    public Boolean Online() {
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Login")
    public obToken Login(@WebParam(name = "login") obLogin login) {
        obToken token = new obToken(Date.from(Instant.MIN), "123456789");
        return token;
    }
}
