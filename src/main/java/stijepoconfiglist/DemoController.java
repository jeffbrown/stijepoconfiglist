package stijepoconfiglist;

import io.micronaut.http.annotation.*;

@Controller("/demo")
public class DemoController {

    private final CountryConfig countryConfig;

    public DemoController(CountryConfig countryConfig) {
        this.countryConfig = countryConfig;
    }

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}