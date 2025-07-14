public class doWhileLoop {
    public void printNums(){
        System.out.println("Numbers from 1 to 10");
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }
    public static void main(String[] args){
        doWhileLoop print = new doWhileLoop();
        print.printNums();
    }
}
