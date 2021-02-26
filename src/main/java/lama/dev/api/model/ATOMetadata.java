package lama.dev.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ATOMetadata {
    private int numIndividuals;
    private int numTaxableIndividuals;
    private int numNonTaxableIndividuals;
    private int numMales;
    private int numFemales;
    private int numOfResidents;
    private int numOfNonResidents;
}
