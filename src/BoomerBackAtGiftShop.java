import java.util.Scanner;

/**
 * Vishal Nigam
 * 10/29/19
 */
public class BoomerBackAtGiftShop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numlines = input.nextInt();
        input.nextLine();
        for(int i=0;i<numlines;i++){
            double cost = 0.0;
            double minCost = 0.0;
            double maxCost = 0.0;
            double maxitems = 0.0;
            double cash = 0.0;
            int items=0;
            String line = input.nextLine();
            String[] numsarray = line.split(" ");
            int numItems = Integer.parseInt(numsarray[0]);
            for(int j=1;j<numsarray.length-2;j+=2) {
                double numObj = Double.parseDouble(numsarray[j]);
                double objCost = Double.parseDouble(numsarray[j + 1]);
                if(minCost==0.0){
                    minCost=cost;
                }
                else if(minCost>cost){
                    minCost=cost;
                }
                if(maxCost==0.0){
                    maxCost=cost;
                    maxitems=numObj;
                }
                else if(maxCost<cost){
                    maxCost=cost;
                    maxitems=numObj;
                }
                cost += numObj * objCost;
                items+=numObj;
            }
            cash = Double.parseDouble(numsarray[numsarray.length-1]);
            if(cash<cost) {
                if(cash<minCost){
                    System.out.println("0");
                    cash= -1;
                }
                while(cash>0&&maxitems>0) {
                    cash -= maxCost;
                    maxitems--;
                    items--;
                }
                if(cash<minCost){
                    if(cash!=-1) {
                        if (items < 0) {
                            items = 0;
                        }
                        System.out.println(items);
                    }
                }
                if(cash>0) {
                    for(int j=1;j<numsarray.length-2;j+=2) {
                        double numObj = Double.parseDouble(numsarray[j]);
                        double temp = numObj;
                        double objCost = Double.parseDouble(numsarray[j + 1]);
                        if(objCost!=maxCost&&objCost!=minCost) {
                            while (temp > 0 && cash > 0) {
                                cash -= objCost;
                                temp--;
                                items--;
                            }
                            if(cash<minCost){
                                if(items<0){
                                    items=0;
                                }
                                System.out.println(items);
                            }
                        }
                    }
                }
            }
            else{
                System.out.println(items);
            }
        }
    }
}
