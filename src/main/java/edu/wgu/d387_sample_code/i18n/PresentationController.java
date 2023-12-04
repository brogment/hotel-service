package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PresentationController {
    private PresentationService presentationService;

    public PresentationController(){
        this.presentationService = new PresentationService();
    }
    @GetMapping("/presentation")
    public String getPresentation() {
        return presentationService.convertTime();
    }
}
