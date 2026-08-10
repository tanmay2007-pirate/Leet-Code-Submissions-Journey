class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> list = new ArrayList<>();
        
        int max = getmax(candies);
        for(int i = 0 ; i < candies.length ; i++){
            int n = candies[i] + extraCandies;
            
            if(n < max){
                list.add(false);
            }else{
                list.add(true);
            }
            

        }

        return list;
        
    }


    public static int getmax(int [] values){
        int max = Integer.MIN_VALUE;
                for(int j = 0 ; j < values.length ; j++){
                    if(values[j] > max){
                        max = values[j];
                    } 
                }
                return max;
    }
}