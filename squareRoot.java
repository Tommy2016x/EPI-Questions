class solution{
    public static void main(String[] args){
        int n = 300000000;

        System.out.println(closestSquare(n));
    }

    static int closestSquare(int n){
        int l = 0;
        int r = n;
        int mid;

        while(l<=r){
            mid = (l+r)/2;
            int square = (mid * mid);

            if(square >= n)
                r = mid - 1;
            
            else
                l = mid + 1;
        }

        return l-1;
    }
}