import java.util.ArrayList;

public class Chain {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();

    public static void main(String[] args) {

        Block firstBlock = new Block("Hi I'm itchy", "0");
        System.out.println("Hash for block 1: " + firstBlock.getHash());


        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println(blockchainJson);
    }
}
