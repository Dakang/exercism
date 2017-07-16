

public class PangramChecker {

    char[] checkArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public void compareArrays(Character c) {
        for (char x : checkArray) {
            if (c == x) {
                checkArray.Remove(c);
                break;
            }
        }
    }

    public boolean isPangram(String input) {
        //Convert input to array
        inputArray = new input.CharArray();

        //Check the input and remove letters from check Array is they are valid
        for (char c : inputArray) {
            compareArrays(c);
                }
            }
        }


    }

}
