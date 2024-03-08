package co.develhope.Esercizio2.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {
    @GetMapping
    public Integer getSum(){
        Random random = new Random();
        Integer num1 = random.nextInt(100);
        Integer num2 = random.nextInt(100);
        return num1 + num2;
    }
}
