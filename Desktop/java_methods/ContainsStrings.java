public class ContainsStrings {
    public static void main(String[] args) {
        String sentence = "I love programming in java";
        boolean cantainsJava = sentence.contains("java");
        if(cantainsJava){
            System.out.println("contains i love " + cantainsJava);
        }else{
            System.out.println("does not contains i love :" + cantainsJava);
        }
    }
}
