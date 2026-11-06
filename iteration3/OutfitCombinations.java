/**
 * Outfit combinations: an original SAT-style counting problem.
 * Choose one of 4 shirts, one of 3 pairs of pants, and one of 2 pairs of shoes.
 * Compile: javac OutfitCombinations.java
 * Run: java OutfitCombinations
 */
public class OutfitCombinations {
    public static void main(String[] args) {
        int count = 0;
        for (int shirt = 1; shirt <= 4; shirt++) {
            for (int pants = 1; pants <= 3; pants++) {
                for (int shoes = 1; shoes <= 2; shoes++) {
                    System.out.println("Shirt " + shirt + ", pants " + pants
                            + ", shoes " + shoes);
                    count++;
                }
            }
        }
        System.out.println("Total outfits: " + count);
    }
}
