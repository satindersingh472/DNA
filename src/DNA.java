
//this program will determine weather there is a protein in a strand of dna
public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 =  "ATTAATATGTACTGA";
        String dna = dna3;
//        will check the length just for testing
        int length = dna.length();
        System.out.println("Length: " + length);
//        will check the start index of atg codon
        int start  = dna.indexOf("ATG");
//        will check the tga codon index
        int stop = dna.indexOf("TGA");

//      check if atg and tga are the substring or not and codon between start and stop is divisible by 3
//        if yes then it contains a protein
        if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
            String protein = dna.substring(start,stop + 3);
            System.out.println("Protein: " + protein );
        } else {
            System.out.println("Not a protein");
        }

    }

}