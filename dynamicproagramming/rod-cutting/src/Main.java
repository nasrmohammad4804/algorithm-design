public class Main {
    public static void main(String[] args) {

        int[] input= {3,3,4,5};
        int unit =4;

//        DCAlgorithm algorithm = new DCAlgorithm();

        DPAlgorithm algorithm = new DPAlgorithm();
        System.out.println(algorithm.getMacRodCut(input, unit));
    }
}
