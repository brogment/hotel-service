package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WelcomeController {

        @GetMapping("/welcome")
        public String[] getWelcomeMessages() throws Exception {
            ExecutorService executor = Executors.newFixedThreadPool(2);

            Future<String> englishMessage = executor.submit(new WelcomeService(Locale.US));
            Future<String> frenchMessage = executor.submit(new WelcomeService(Locale.CANADA_FRENCH));

            String[] messages = {englishMessage.get(), frenchMessage.get()};
            executor.shutdown();
            return messages;
        }
}
