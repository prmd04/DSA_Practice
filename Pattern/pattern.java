package Pattern;

public class pattern {
    public static void main(String args[]){
        rightPascalTringle(4);
    }


    public static void hallowTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i == n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberTringular(int n){
        int l=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(l+" ");
            }
            System.out.println();
            l++;
        }
    }
    public static void numberIncresingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberIncresingReversePyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberChangingPyramid(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void palindromeTringular(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void rhombusPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamondPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void squareFillPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverserightHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void leftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void reverseLeftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void kPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tringleStarPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseNumberTringlePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void mirrorImageTringlePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void hallowTringlePattern(int n){
        for(int i=1;i<=n;i++){
            //initial spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(i==n || j==(i*2)-1 || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void reverseHallowTringlePattern(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(i==n || j==(i*2)-1 || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hallowDiamondPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           for(int j=1;j<=(i*2)-1;j++){
               if(j==1 || j==(i*2)-1){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(j==1 || j==(i*2)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hallowHourglassPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(j==1 || j==(i*2)-1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                if(j==1 || j==(i*2)-1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pascalTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("1 ");
                }
                else{
                    System.out.print(i-1+" ");
                }
            }
            System.out.println();
        }
    }
    public static void rightPascalTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
