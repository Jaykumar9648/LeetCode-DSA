class Solution {
    public int findday(String date, int[] monthdayscum){
        int month=Integer.parseInt(date.substring(0,2));
        int days=Integer.parseInt(date.substring(3,5));
      return monthdayscum[month-1] + days;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int monthdays[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int monthdayscum[]=new int[13];
        monthdayscum[0]=31;
       for(int i=1; i<=12; i++){
             monthdayscum[i]=monthdayscum[i-1] + monthdays[i-1];
       }
       int arrivealiceday=findday(arriveAlice, monthdayscum );
          int arriebobday=findday(arriveBob, monthdayscum );
             int leavealiceday=findday(leaveAlice, monthdayscum );
                int leavebobday=findday(leaveBob, monthdayscum );

         int start = Math.max(arrivealiceday, arriebobday);
     int end = Math.min(leavealiceday, leavebobday);

            int ans = end - start + 1;
          return ans<0?0:ans;
    }
}