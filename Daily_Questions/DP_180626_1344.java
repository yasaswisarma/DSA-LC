//Daily Question : 18/06/26
//1344. Angle Between Hands of a Clock
//Approach: 1.  formulae for angle between hour and minute hand is modulus|30*hour-5.5*minutes|
//          2.  if angle is greater than 180 then we need to subtract it from 360

package Daily_Questions;

class Solution {
    public double DP_180626_1344(int hour, int minutes) {
        double angle = 0;
        if((hour>=1)&&(hour<=12)&&(minutes>=0)&&(minutes<=59)){
             angle = Math.abs(30*hour-5.5*minutes);
             if(angle>180){
            angle=360-angle;
        }
        }
        
        return angle;
    }
}