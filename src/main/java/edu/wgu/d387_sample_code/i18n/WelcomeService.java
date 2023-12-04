package edu.wgu.d387_sample_code.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class WelcomeService implements Callable<String> {
    private Locale locale;

    public WelcomeService(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String call() throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcomeMessage");
    }
}
