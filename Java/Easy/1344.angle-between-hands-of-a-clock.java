
//1344. Angle Between Hands of a Clock
import java.util.*;
import java.math.*;

// @lc code=start
class Solution {
    public double angleClock(int hour, int minutes) {
        hour = hour % 12;
        int totoalMinutes = hour * 60 + minutes;
        double angle = Math.abs((totoalMinutes / 12.0 - minutes) * 6);
        return angle > 180 ? 360 - angle : angle;
    }
}

// @lc code=end