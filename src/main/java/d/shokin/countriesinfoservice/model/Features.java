package d.shokin.countriesinfoservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Features {
    @JsonProperty("features")
    private List<FeaturesItem> features;

}