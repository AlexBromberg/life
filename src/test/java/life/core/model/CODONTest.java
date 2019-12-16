package life.core.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CODONTest {

    @Test
    public void testCODONEnumConstaractor1() {
        Assert.assertEquals(AMINO_ACID.T, CODON.getCodonBy3AminoAcids(AMINO_ACID.A, AMINO_ACID.C, AMINO_ACID.U).getAminoAcid());
    }

    @Test
    public void testCODONEnumConstaractor2() {
        Assert.assertEquals(AMINO_ACID.T, CODON.getCodonBy3AminoAcids(Arrays.asList(new AMINO_ACID[]{AMINO_ACID.A, AMINO_ACID.C, AMINO_ACID.U})).getAminoAcid());
    }

    @Test
    public void testCODONEnumSanity() {
        Assert.assertEquals(64, CODON.values().length);
        for (CODON codon : CODON.values()) {
            switch (codon) {
                case UAA:
                case UAG:
                case UGA:
                    Assert.assertEquals(true, codon.isStopCodon());
                    Assert.assertEquals(false, codon.isStartCodon());
                    break;
                case AUG:
                    Assert.assertEquals(false, codon.isStopCodon());
                    Assert.assertEquals(true, codon.isStartCodon());
                    break;
                default:
                    Assert.assertEquals(false, codon.isStopCodon());
                    Assert.assertEquals(false, codon.isStartCodon());
            }
        }
    }
}