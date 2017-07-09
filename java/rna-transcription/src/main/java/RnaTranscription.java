import java.util.HashMap;


public class RnaTranscription {

    public String transcribe(String dnaStrand) {
    	//String variable to hold the transcription
		StringBuilder rnaStrand = new StringBuilder();

    	//Convert dnaStrand from String to Character Array
    	char[] dnaArray = dnaStrand.toCharArray();

    	//Initalizing a HashMap to convert from DNA to RNA
    	HashMap<Character, Character> rna = new HashMap<>();

		rna.put('G', 'C');
		rna.put('C', 'G');
		rna.put('T', 'A');
		rna.put('A', 'U');

		//Iterate through the DNA Strand and transcribe as needed
		for(char c : dnaArray) {
			rnaStrand.append(rna.get(c));
		}

		//Convert Builder to String and return results
		return rnaStrand.toString();
    }
}