package co.com.edu.uco.ing.software.project.transports.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-owner")
public class OwnerController {

  @GetMapping("/{test}")
  public String hello(@PathVariable("test") String name) {
    return "Hello " + name;
  }

}
