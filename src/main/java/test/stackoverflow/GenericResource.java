/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stackoverflow;

import javax.enterprise.context.RequestScoped;
//import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author bitter_fox
 */
@Path("")
@RequestScoped
public class GenericResource {
    @GET
//    @Controller
    public String root() {
        return "hello.jsp";
    }
}
