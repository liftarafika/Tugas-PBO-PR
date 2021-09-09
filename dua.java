//liftaaa
public class dua {
    public static void main(String[] args){
       int itsnumbers[] = {1, 2, 3, 123124235, 5, 1, 7, 4,};

        System.out.println("-----Even-Odd Number Checker-----");
        System.out.println("Yang termasuk bilangan genap adalah ");
        for (int i = 0; i<8 ; i++){
            if (itsnumbers[i]%2 == 0){
                System.out.print(itsnumbers[i] + ",");
            }

        }
        System.out.println("\n\nYang termasuk bilangan ganjil adalah ");
        for (int k = 0; k<8 ; k++){
            if (itsnumbers[k]%2 != 0){
                System.out.print(itsnumbers[k] + ",");
            }

        }
    }
}
