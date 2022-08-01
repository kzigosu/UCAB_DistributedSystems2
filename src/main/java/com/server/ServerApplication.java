package com.server;

import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServerApplication.class, args);
  }

  @GetMapping("/llenado")
  public Response llenado() {
    Response resp = new Response();
    resp.setOK(true);
    resp.setMessage("llenando");
    return resp;
  }

  @GetMapping("/consumo")
  public Response consumo() {
    Response resp = new Response();
    resp.setOK(true);
    resp.setMessage("consumiendo");
    return resp;
  }

  @GetMapping("/consulta")
  public Response consulta() {
    Response resp = new Response();
    resp.setOK(true);
    resp.setMessage("respuesta");
    return resp;
  }

  @GetMapping("/save")
  public Response save() {
    Response resp = new Response();
    resp.setOK(true);
    resp.setMessage("guardando");
    return resp;
  }

  @GetMapping("/reset")
  public Response reset() {
    Response resp = new Response();
    resp.setOK(true);
    resp.setMessage("restaurando");
    return resp;
  }
}
