package d.shokin.contriesinfoservice.controller;

import d.shokin.contriesinfoservice.model.Features;
import d.shokin.contriesinfoservice.service.CountryService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(info = @Info(title = "Описание API стран мира", version = "v1"))
@RequestMapping("/api/country/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Operation(summary = "Получить все страны")
    @GetMapping("/countries")
    public Features getCountries() {
        return countryService.getCountriesFromFile();
    }

}
