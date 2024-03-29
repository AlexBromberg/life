package life.core;

import life.core.model.Protein;
import life.core.model.RnaSequence;
import life.organism.Gene;
import life.organism.OrganismUtil;
import life.organism.bacteria.TestBacteria;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class OrganismDnaRnaProteinTests {

    private static final File srcDnaTextFile = new File(OrganismDnaRnaProteinTests.class.getClassLoader().getResource("TestOrganismTemplateDnaStrand.txt").getFile());
    private static final File srcJsonFile = new File(OrganismDnaRnaProteinTests.class.getClassLoader().getResource("TestOrganism.json").getFile());

    @Test
    public void getGeneAndDnaAndRnaAndProtein() throws Exception {

        TestBacteria testBacteria = (TestBacteria) OrganismUtil.readOrganism(TestBacteria.class);
        Gene gene = testBacteria.getGeneById("5080");
        RnaSequence rna = testBacteria.getGeneRNA(gene);
        Assert.assertTrue("mRNA for Gene with id :" + gene.getId() + " should be : 'GACGAGAGGCCCC'", "GACGAGAGGCCCC".equals(rna.toString()));

        Gene gene0 = testBacteria.getGeneByName("GXP_5555555");
        RnaSequence rna0 = testBacteria.getGeneRNA(gene0);
        Assert.assertTrue("mRNA for Gene with name :" + gene.getName() + " should be : 'UCUACGGUAACAGGGGGCCGGAGGACGACG'", "UCUACGGUAACAGGGGGCCGGAGGACGACG".equals(rna0.toString()));

        Protein protein = new Protein(rna0);
        Assert.assertTrue("Protein for mRNA '" + rna0.toString() + "' should be : 'STVTGGRRTT'", "STVTGGRRTT".equals(protein.toString()));

        Gene gene2 = testBacteria.getGeneById("6000");
        RnaSequence rna2 = testBacteria.getGeneRNA(gene2);
        Assert.assertTrue("mRNA for Gene with name :" + gene2.getName() + " should be : 'UCUGGAAGAGGAGGACGUUUAUUUUGGAGUGGGUACUUACGAGUGCGUUCAAAUUAAUGUCUGGAC'", "UCUGGAAGAGGAGGACGUUUAUUUUGGAGUGGGUACUUACGAGUGCGUUCAAAUUAAUGUCUGGAC".equals(rna2.toString()));

        Protein protein1 = new Protein(rna2);
        Assert.assertTrue("Protein for mRNA '" + rna2.toString() + "' should be : 'SGRGGRLFWSGYLRVRSN'", "SGRGGRLFWSGYLRVRSN".equals(protein1.toString()));


    }


}
