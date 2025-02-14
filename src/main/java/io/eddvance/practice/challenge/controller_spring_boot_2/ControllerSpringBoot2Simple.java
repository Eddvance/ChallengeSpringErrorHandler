package io.eddvance.practice.challenge.controller_spring_boot_2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/spring-boot-2")
public class ControllerSpringBoot2Simple {

    @GetMapping("/error-spring-boot2-handler")
    public String getErrorTestPage(Model model) {
        return "error-spring-boot2-handler";
    }

    @GetMapping("/error400")
    public ResponseEntity<String> error400() {
        return ResponseEntity.badRequest().body("erreur 400 = Bad Request : Erreur côté client (paramètre manquant, format incorrect, validation qui échoue).");
    }

    @GetMapping("/error401")
    public ResponseEntity<String> error401() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 401 = Unauthorized : Authentification nécessaire ou invalide.");
    }

    @GetMapping("/error403")
    public ResponseEntity<String> error403() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 403 = Forbidden : Accès refusé (droits insuffisants).");
    }

    @GetMapping("/error404")
    public ResponseEntity<String> error404() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 404 = Not Found : Ressource inexistante ou URL invalide.");
    }

    @GetMapping("/error409")
    public ResponseEntity<String> error409() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 409 = Conflict : Conflit de données (ex. doublon, violation d’intégrité).");
    }

    @GetMapping("/error422")
    public ResponseEntity<String> error422() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 422 = Unprocessable Entity : Parfois utilisé pour les erreurs de validation (au lieu de 400).");
    }

    @GetMapping("/error500")
    public ResponseEntity<String> error500() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("erreur 500 = 500 – Internal Server Error : Erreur non gérée côté serveur.");
    }

    @GetMapping("/error503")
    public ResponseEntity<String> error503() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur 503 = Service Unavailable : Service indisponible (ex. dépendance en panne).");
    }
}