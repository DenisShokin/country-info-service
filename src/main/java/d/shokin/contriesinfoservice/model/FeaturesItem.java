package d.shokin.contriesinfoservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FeaturesItem{
	@JsonProperty("C")
	private List<List<List<List<Integer>>>> coordinates;
	@JsonProperty("I")
	private String index;
	@JsonProperty("N")
	private String name;
}