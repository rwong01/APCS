public class TwoRockets {
    public static void tip (){
     System.out.println("   /\\       /\\ ");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void box (){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void usa(){
         System.out.println("|United| |United|");
         System.out.println("|States| |States|");
    }
    public static void main(String[] args) {
    	tip();
       	box();
        usa();
        box();
        tip();
    }
}