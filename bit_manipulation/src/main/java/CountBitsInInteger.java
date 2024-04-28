public class CountBitsInInteger {

    public static void main(String args[]){
        System.out.println(countBits(23));
    }
    static int countBits(int n){

        int count = 0;
        while(n >0){
            if((n&1)==1){
                count++;
            }
            n=n >>1;
        }
        return count;
    }
}
