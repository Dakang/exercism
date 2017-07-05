public class RnaTranscription {

    public String transcribe(String dnaStrand) {
    	Map<String, String> rnaTranscribble = new HashMap<String, String>();
		rnaTranscribble.put("C", "G");
		rnaTranscribble.put("G", "C");
		rnaTranscribble.put("A", "T");
		rnaTranscribble.put("U", "A");
    	return rnaTranscribble.get(dnaStrand);
    }
}