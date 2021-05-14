package com.iqmsoft

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {

  

  @RequestMapping(Array("/"))
  def index(): String =
    String format (
      "Greetings from IQMSOFT Spring Boot 2.4.4 Scala 2.12.7"
      
    )

}
