package life.core.model;

import java.util.List;

public enum CODON {
    UGU(AMINO_ACID.C, false, false),
    UCU(AMINO_ACID.S, false, false),
    AUA(AMINO_ACID.I, false, false),
    CUA(AMINO_ACID.L, false, false),
    AUC(AMINO_ACID.I, false, false),
    CUC(AMINO_ACID.L, false, false),
    GUA(AMINO_ACID.V, false, false),
    AUG(AMINO_ACID.M, false, true),
    CUG(AMINO_ACID.L, false, false),
    GUC(AMINO_ACID.V, false, false),
    GUG(AMINO_ACID.V, false, false),
    UUA(AMINO_ACID.L, false, false),
    AUU(AMINO_ACID.I, false, false),
    AAA(AMINO_ACID.K, false, false),
    CAA(AMINO_ACID.Q, false, false),
    UUC(AMINO_ACID.F, false, false),
    CUU(AMINO_ACID.L, false, false),
    AAC(AMINO_ACID.N, false, false),
    CAC(AMINO_ACID.H, false, false),
    GAA(AMINO_ACID.E, false, false),
    UUG(AMINO_ACID.L, false, false),
    GUU(AMINO_ACID.V, false, false),
    AAG(AMINO_ACID.K, false, false),
    GAC(AMINO_ACID.D, false, false),
    CAG(AMINO_ACID.Q, false, false),
    GAG(AMINO_ACID.E, false, false),
    UUU(AMINO_ACID.F, false, false),
    AAU(AMINO_ACID.N, false, false),
    UAC(AMINO_ACID.Y, false, false),
    CAU(AMINO_ACID.H, false, false),
    GAU(AMINO_ACID.D, false, false),
    UAU(AMINO_ACID.Y, false, false),
    AGA(AMINO_ACID.R, false, false),
    CGA(AMINO_ACID.R, false, false),
    AGC(AMINO_ACID.S, false, false),
    CGC(AMINO_ACID.R, false, false),
    ACA(AMINO_ACID.T, false, false),
    CCA(AMINO_ACID.P, false, false),
    GGA(AMINO_ACID.G, false, false),
    AGG(AMINO_ACID.R, false, false),
    ACC(AMINO_ACID.T, false, false),
    CGG(AMINO_ACID.R, false, false),
    CCC(AMINO_ACID.P, false, false),
    GGC(AMINO_ACID.G, false, false),
    GCA(AMINO_ACID.A, false, false),
    ACG(AMINO_ACID.T, false, false),
    GCC(AMINO_ACID.A, false, false),
    CCG(AMINO_ACID.P, false, false),
    GGG(AMINO_ACID.G, false, false),
    GCG(AMINO_ACID.A, false, false),
    AGU(AMINO_ACID.S, false, false),
    CGU(AMINO_ACID.R, false, false),
    UGC(AMINO_ACID.C, false, false),
    UCA(AMINO_ACID.S, false, false),
    ACU(AMINO_ACID.T, false, false),
    UCC(AMINO_ACID.S, false, false),
    UGG(AMINO_ACID.W, false, false),
    CCU(AMINO_ACID.P, false, false),
    GGU(AMINO_ACID.G, false, false),
    GCU(AMINO_ACID.A, false, false),
    UCG(AMINO_ACID.S, false, false),
    UAA(null, true, false),
    UAG(null, true, false),
    UGA(null, true, false);

    private AMINO_ACID aminoAcid;
    private Boolean isStopCodon;
    private Boolean isStartCodon;

    CODON(AMINO_ACID aminoAcid, Boolean isStopCodon, Boolean isStartCodon) {
        this.aminoAcid = aminoAcid;
        this.isStopCodon = isStopCodon;
        this.isStartCodon = isStartCodon;
    }

    public static CODON getCodonBy3AminoAcids(List<AMINO_ACID> aminoAcids) {
        if (aminoAcids == null || aminoAcids.size() != 3) {
            throw new IllegalArgumentException("There should be 3 amino acids in the list");
        }
        return getCodonBy3AminoAcids(aminoAcids.get(0), aminoAcids.get(1), aminoAcids.get(2));
    }

    public static CODON getCodonBy3AminoAcids(AMINO_ACID firstAminoAcid, AMINO_ACID secondAminoAcid, AMINO_ACID thirdAminoAcid) {
        if (firstAminoAcid == null || secondAminoAcid == null || thirdAminoAcid == null) {
            throw new IllegalArgumentException("argument amino acid cannot be null");
        }
        return CODON.valueOf("" + firstAminoAcid.getOneLetterName() + secondAminoAcid.getOneLetterName() + thirdAminoAcid.getOneLetterName());
    }

    public AMINO_ACID getAminoAcid() {
        return this.aminoAcid;
    }

    ;

    public Boolean isStopCodon() {
        return this.isStopCodon;
    }

    public Boolean isStartCodon() {
        return isStartCodon;
    }

}