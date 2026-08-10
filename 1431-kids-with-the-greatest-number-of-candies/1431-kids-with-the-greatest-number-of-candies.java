class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> list = new ArrayList<>();
        
        
        for(int i = 0 ; i < candies.length ; i++){
            int n = candies[i] + extraCandies;
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < candies.length ; j++){
                if(candies[j] > max){
                    max = candies[j];
                } 
            }
            if(n < max){
                list.add(false);
            }else{
                list.add(true);
            }
            

        }

        return list;
        
    }
}