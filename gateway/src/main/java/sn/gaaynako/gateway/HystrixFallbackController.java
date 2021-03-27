package sn.gaaynako.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackController {
    @RequestMapping("/reservationFallback")
    public Mono<String> reservationServiceFallback(){
        return Mono.just("Le service reservation prend du temps à répondre. Veuillez réessayer ultérieurement.");
    }
    @RequestMapping("/voitureFallback")
    public Mono<String> voitureServiceFallback(){
        return Mono.just("Le service locattion prend du temps à répondre. Veuillez réessayer ultérieurement.");
    }
}
