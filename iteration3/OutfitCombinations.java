/**
 * Outfit combinations: an original SAT-style counting problem.
 * Choose one of 6 shirts, one of 4 pairs of pants, and one of 3 pairs of shoes.
 * Shirts 1 and 2 are blue. Pants 1 are blue. Do not wear both blue items.
 * Output shows shirt, pants, and shoes in that order.
 * Compile: javac OutfitCombinations.java
 * Run: java OutfitCombinations
 */
public class OutfitCombinations {
    public static void main(String[] args) {
        int count = 0;
        for (int shirt = 1; shirt <= 6; shirt++) {
            for (int pants = 1; pants <= 4; pants++) {
                for (int shoes = 1; shoes <= 3; shoes++) {
                    if (shirt > 2 || pants != 1) {
                        System.out.println(shirt + ", "
                                + pants + ", " + shoes);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total outfits: " + count);
    }
}
