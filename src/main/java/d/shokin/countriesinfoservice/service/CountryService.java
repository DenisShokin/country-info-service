package d.shokin.countriesinfoservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import d.shokin.countriesinfoservice.model.Features;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CountryService {

    public Features getCountriesFromFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
           return mapper.readValue(Files.readString(Path.of("src/main/resources/countries.json")), Features.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
