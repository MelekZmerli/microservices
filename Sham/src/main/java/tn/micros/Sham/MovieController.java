package tn.micros.Sham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

      @Autowired
      private ActorConsumer consumer;


      @GetMapping("/allActors")
      public String getActorsInfo() {
         return "Accessing from SHAM ==> " + consumer.getAllActors();
      }

      @GetMapping("/getOneActor/{id}")
      public String getOneActorForStd(@PathVariable Integer id) {
         return "Accessing from SHAM ==> " + consumer.getActorById(id); 
      }

      @GetMapping("/entityData")
      public String printEntityData() {
         ResponseEntity<String> resp = consumer.getEntityData();
         return "Accessing from SHAM ==> " + resp.getBody() +" , status is:" + resp.getStatusCode();
      }
}