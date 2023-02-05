public class PhraseOMatic {
    public static void main(String[] args) throws Exception {

        // make 3 sets of words
        String[] wordListOne = {"dynamic", "light-weight", "lazy", 
        "preloaded", "object-oriented", "4th generation", "minimalist",
        "just-in-time"};
        String[] wordListTwo = {"crypto", "PaaS", "IoT", "next generation",
        "quantum", "zipped", "encrypted", "memory-mapped"};
        String[] wordListThree = {"bytecode", "source file", "jar file", "class file",
        "file system", "operating system", "graphics card", "kegerator",
        "massage chair", "compiler", "virtual machine"};

        //how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate 3 random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int r1 = randomGenerator.nextInt(oneLength);
        int r2 = randomGenerator.nextInt(twoLength);
        int r3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[r1] + " " +
                        wordListTwo[r2] + " " +
                        wordListThree[r3];

        System.out.println("What we need is a " + phrase);
    }
}
