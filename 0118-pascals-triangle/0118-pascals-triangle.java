class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<numRows;i++){
         ArrayList<Integer> temlist=new ArrayList<>();
            for(int j=0;j<=i;j++ ){
               if(j==0 || j==i){
                temlist.add(1);
               }
               else{
                 int sum=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                 temlist.add(sum);
               }
            }
            list.add(temlist);
       }
       return list;
    }
}