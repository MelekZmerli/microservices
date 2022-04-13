package tn.micros.Ducere;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {

      @Autowired
      Environment environment;

      @GetMapping("/data")
      public String getActorData() {

         return "data of Ducere, Running on port: "
           +environment.getProperty("local.server.port");
      }

      @GetMapping("/{id}")
      public Actor getActorById(@PathVariable Integer id) {
         return new Actor(id, "Fathi Haddaoui", "Tunisian");
      }

      @GetMapping("/all")
      public List<Actor> getAll(){
         return Arrays.asList(
                new Actor(501, "John Reno", "French"),
                new Actor(502, "Al Pacino", "American"),
                new Actor(503, "Tom Hardy", "British")
         );
      }

      @GetMapping("/entity")
      public ResponseEntity<String> getEntityData() {
         return new ResponseEntity<String>(
           "Hello from Ducere", 
            HttpStatus.OK);
      }
}