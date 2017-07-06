import java.util.HashMap;

public class RnaTranscription {

    public String transcribe(String dnaStrand) {
    	//String variable to hold the transcription
    	String rnaStrand = new String();

    	//Convert dnaStrand from String to Character Array
    	char[] dnaArray = dnaStrand.toCharArray();

    	//Initalizing a HashMap to convert from DNA to RNA
    	HashMap<Character, Character> rna = new HashMap<Character, Character>();

		rna.put("C", "G");
		rna.put("G", "C");
		rna.put("A", "T");
		rna.put("U", "A");

		//Iterate through the DNA Strand and transcribe as needed
		for(char c : dnaArray) {
			rnaStrand = rnaStrand + rna.get(c);

		}

		//Returning the proper results
		return rnaStrand;
    }
}