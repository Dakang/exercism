import java.util.ArrayList;
import java.util.HashMap;


public class RnaTranscription {

    public String transcribe(String dnaStrand) {
    	//String variable to hold the transcription
    	ArrayList<Character> rnaArray = new ArrayList<>();
		String rnaStrand;

    	//Convert dnaStrand from String to Character Array
    	char[] dnaArray = dnaStrand.toCharArray();

    	//Initalizing a HashMap to convert from DNA to RNA
    	HashMap<Character, Character> rna = new HashMap<>();

		rna.put('C', 'G');
		rna.put('G', 'C');
		rna.put('A', 'T');
		rna.put('U', 'A');

		//Iterate through the DNA Strand and transcribe as needed
		for(char c : dnaArray) {
			rnaArray.add(rna.get(c));
		}

		//Convert the Array to a string!
        rnaStrand = rnaArray.toString();

		//Returning the proper results
		return rnaStrand;
    }
}