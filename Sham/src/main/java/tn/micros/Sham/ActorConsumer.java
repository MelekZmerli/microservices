package tn.micros.Sham;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Ducere",url ="localhost:9000")
public interface ActorConsumer {

      @GetMapping("/actor/data")
      public String getActorData();

      @GetMapping("/actor/{id}")
      public Actor getActorById(@PathVariable Integer id);

      @GetMapping("/actor/all")
      public List<Actor> getAllActors();

      @GetMapping("/actor/entity")
      public ResponseEntity<String> getEntityData();
}