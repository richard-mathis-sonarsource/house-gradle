public class House {

    public static void main(String args[]) {

        int number = 4;
        int nb;

        nb = 1;
        nb +=number;

        if(nb > 4 ) {
            System.out.println(("nb > 4"));
        }

        Address rAddress;

        rAddress = new Address("DeMarchand", 54, 54620, "noisyCity");

        System.out.println("my address is" + rAddress);


    }

}
