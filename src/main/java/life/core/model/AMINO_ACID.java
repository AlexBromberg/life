package life.core.model;

public enum AMINO_ACID {

	A("Alanine", "Ala", 'A', life.core.model.SIDE_CHAIN_CLASS.ALIPHATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 1.8f, null, null, 89.094f, 8.76f),
	C("Cysteine", "Cys", 'C', life.core.model.SIDE_CHAIN_CLASS.SULFUR_CONTAINING, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 2.5f, new Integer[] {250}, new Float[] {0.3f}, 121.154f, 1.38f),
	D("Aspartic acid", "Asp", 'D', life.core.model.SIDE_CHAIN_CLASS.ACID, life.core.model.SIDE_CHAIN_POLARITY.ACIDIC_POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEGATIVE, -3.5f, null, null, 133.104f, 5.49f),
	E("Glutamic acid", "Glu", 'E', life.core.model.SIDE_CHAIN_CLASS.ACID, life.core.model.SIDE_CHAIN_POLARITY.ACIDIC_POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEGATIVE, -3.5f, null, null, 147.131f, 6.32f),
	F("Phenylalanine", "Phe", 'F', life.core.model.SIDE_CHAIN_CLASS.AROMATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 2.8f, new Integer[] {257,206,188}, new Float[] {0.2f,9.3f,60.0f}, 165.192f, 3.87f),
	G("Glycine", "Gly", 'G', life.core.model.SIDE_CHAIN_CLASS.ALIPHATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -0.4f, null, null, 75.067f, 7.03f),
	H("Histidine", "His", 'H', life.core.model.SIDE_CHAIN_CLASS.BASIC_AROMATIC, life.core.model.SIDE_CHAIN_POLARITY.BASIC_POLAR, life.core.model.SIDE_CHAIN_CHARGE.POSITIVE10_NEUTRAL90, -3.2f, new Integer[] {211}, new Float[] {5.9f}, 155.156f, 2.26f),
	I("Isoleucine", "Ile", 'I', life.core.model.SIDE_CHAIN_CLASS.ALIPHATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 4.5f, null, null, 131.175f, 5.49f),
	K("Lysine", "Lys", 'K', life.core.model.SIDE_CHAIN_CLASS.BASIC, life.core.model.SIDE_CHAIN_POLARITY.BASIC_POLAR, life.core.model.SIDE_CHAIN_CHARGE.POSITIVE, -3.9f, null, null, 146.189f, 5.19f),
	L("Leucine", "Leu", 'L', life.core.model.SIDE_CHAIN_CLASS.ALIPHATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 3.8f, null, null, 131.175f, 9.68f),
	M("Methionine", "Met", 'M', life.core.model.SIDE_CHAIN_CLASS.SULFUR_CONTAINING, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 1.9f, null, null, 149.208f, 2.32f),
	N("Asparagine", "Asn", 'N', life.core.model.SIDE_CHAIN_CLASS.AMIDE, life.core.model.SIDE_CHAIN_POLARITY.POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -3.5f, null, null, 132.119f, 3.93f),
	O("Pyrrolysine", "Ply", 'O', null, null, null, null, null, null, 255.313f, null),
	P("Proline", "Pro", 'P', life.core.model.SIDE_CHAIN_CLASS.CYCLIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -1.6f, null, null, 115.132f, 5.02f),
	Q("Glutamine", "Gln", 'Q', life.core.model.SIDE_CHAIN_CLASS.AMIDE, life.core.model.SIDE_CHAIN_POLARITY.POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -3.5f, null, null, 146.146f, 3.9f),
	R("Arginine", "Arg", 'R', life.core.model.SIDE_CHAIN_CLASS.BASIC, life.core.model.SIDE_CHAIN_POLARITY.BASIC_POLAR, life.core.model.SIDE_CHAIN_CHARGE.POSITIVE, -4.5f, null, null, 174.203f, 5.78f),
	S("Serine", "Ser", 'S', life.core.model.SIDE_CHAIN_CLASS.HYDROXYL_CONTAINING, life.core.model.SIDE_CHAIN_POLARITY.POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -0.8f, null, null, 105.093f, 7.14f),
	T("Threonine", "Thr", 'T', life.core.model.SIDE_CHAIN_CLASS.HYDROXYL_CONTAINING, life.core.model.SIDE_CHAIN_POLARITY.POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -0.7f, null, null, 119.119f, 5.53f),
	U("Selenocysteine", "Sec", 'U', null, null, null, null, null, null, 168.064f, null),
	V("Valine", "Val", 'V', life.core.model.SIDE_CHAIN_CLASS.ALIPHATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, 4.2f, null, null, 117.148f, 6.73f),
	W("Tryptophan", "Trp", 'W', life.core.model.SIDE_CHAIN_CLASS.AROMATIC, life.core.model.SIDE_CHAIN_POLARITY.NONPOLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -0.9f, new Integer[] {280,219}, new Float[] {5.6f,47.0f}, 204.228f, 1.25f),
	Y("Tyrosine", "Tyr", 'Y', life.core.model.SIDE_CHAIN_CLASS.AROMATIC, life.core.model.SIDE_CHAIN_POLARITY.POLAR, life.core.model.SIDE_CHAIN_CHARGE.NEUTRAL, -1.3f, new Integer[] {274,222,193}, new Float[] {1.4f,8.0f,48.0f}, 181.191f, 2.91f);

	private java.lang.String name;
	private java.lang.String threeLettersName;
	private java.lang.Character oneLetterName;
	private SIDE_CHAIN_CLASS sideChainClass;
	private SIDE_CHAIN_POLARITY sideChainPolarity;
	private SIDE_CHAIN_CHARGE sideChainCharge;
	private java.lang.Float hydropathyIndex;
	private Integer[] absorbance;
	private Float[] molarAttenuationCoefficient;
	private java.lang.Float molecularMass;
	private java.lang.Float occurrenceInProteins;

	AMINO_ACID (java.lang.String name,java.lang.String threeLettersName,java.lang.Character oneLetterName,SIDE_CHAIN_CLASS sideChainClass,SIDE_CHAIN_POLARITY sideChainPolarity,SIDE_CHAIN_CHARGE sideChainCharge,java.lang.Float hydropathyIndex,Integer[]absorbance,Float[]molarAttenuationCoefficient,java.lang.Float molecularMass,java.lang.Float occurrenceInProteins){
		this.name = name;
		this.threeLettersName = threeLettersName;
		this.oneLetterName = oneLetterName;
		this.sideChainClass = sideChainClass;
		this.sideChainPolarity = sideChainPolarity;
		this.sideChainCharge = sideChainCharge;
		this.hydropathyIndex = hydropathyIndex;
		this.absorbance = absorbance;
		this.molarAttenuationCoefficient = molarAttenuationCoefficient;
		this.molecularMass = molecularMass;
		this.occurrenceInProteins = occurrenceInProteins;
	}


	public java.lang.String getName(){
		return this.name;
	};

	public java.lang.String getThreeLettersName(){
		return this.threeLettersName;
	};

	public java.lang.Character getOneLetterName(){
		return this.oneLetterName;
	};

	public SIDE_CHAIN_CLASS getSideChainClass(){
		return this.sideChainClass;
	};

	public SIDE_CHAIN_POLARITY getSideChainPolarity(){
		return this.sideChainPolarity;
	};

	public SIDE_CHAIN_CHARGE getSideChainCharge(){
		return this.sideChainCharge;
	};

	public java.lang.Float getHydropathyIndex(){
		return this.hydropathyIndex;
	};

	public Integer[] getAbsorbance(){
		return this.absorbance;
	};

	public Float[] getMolarAttenuationCoefficient(){
		return this.molarAttenuationCoefficient;
	};

	public java.lang.Float getMolecularMass(){
		return this.molecularMass;
	};

	public java.lang.Float getOccurrenceInProteins(){
		return this.occurrenceInProteins;
	};

}