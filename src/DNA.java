
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
        String dna = dna1;
        int length = dna.length();
        System.out.println("Length: " + length);
        int start  = dna.indexOf("ATG");
        System.out.println(start);

    }

}