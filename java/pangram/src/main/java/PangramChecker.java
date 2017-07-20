

public class PangramChecker {
    
    char[] checkArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public void compareArrays(Character c) {
        for (char x : checkArray) {
            if (c == x) {
                checkArray.remove(c);
                break;
            }
        }
    }

    public boolean isPangram(String input) {
        //Convert input to array
        char[] inputArray = new input.toCharArray();

        //Check the input and remove letters from check Array is they are valid
        for (char c : inputArray) {
            compareArrays(c);
                }
        if (checkArray.length == 0) {
            return true;
        }
        return false;
            }
        }

