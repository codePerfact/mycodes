import java.math.BigInteger;
import java.util.*;

 class Haunted {
    public static void main(String args[]){
        Scanner myScan = new Scanner(System.in);
        int days = myScan.nextInt();
        long ghost = myScan.nextLong();
        int maxaward=0;
        long consistant=1;
        long temp2=1;
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        for(int i=0; i<days; i++){
            long temp = myScan.nextLong();
            if(map.containsKey(temp)){
                int value = map.get(temp);
                map.put(temp, value+1);
            }else{
                map.put(temp,1);
            }
            if(map.get(temp)>maxaward){
                maxaward=map.get(temp);
                consistant=temp;
            }else if (map.get(temp)==maxaward){
                if(temp>consistant){
                    consistant=temp;
                }
            }

            System.out.println(consistant+" "+maxaward);
        }

        }
    }


