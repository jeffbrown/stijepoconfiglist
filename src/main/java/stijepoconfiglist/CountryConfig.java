package stijepoconfiglist;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import jakarta.inject.Inject;

import java.util.List;

@ConfigurationProperties("server")
public class CountryConfig {
    private List<CountryProps> list;

    public List<CountryProps> getList() {
        return list;
    }

    @Inject
    public void setList(List<CountryProps> list) {
        this.list = list;
    }

    @EachProperty(list=true, value = "settings")
    public static class CountryProps {
        private String country;
        private String host;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }
    }
}
