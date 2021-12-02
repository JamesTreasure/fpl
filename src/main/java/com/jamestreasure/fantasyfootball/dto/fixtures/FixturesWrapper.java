package com.jamestreasure.fantasyfootball.dto.fixtures;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixturesWrapper {
  List<Fixtures> fixturesList;
}
