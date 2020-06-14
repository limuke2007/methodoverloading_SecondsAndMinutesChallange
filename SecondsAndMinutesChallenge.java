package java_masterclass;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
        // 把常用的message定义为常量（final不会改变；大写字母，好辨认）

    private static String getDurationString(int minutes, int seconds) {                 // 定义第一个method 参数（分，秒）
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int XX = minutes / 60;
        int YY = minutes % 60;

        String hoursString = XX + "h";            // 为了把小于10的数字用"01h 05m 09s"形式表示
        if (XX < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = YY + "m";
        if (YY < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {                                   // 定义第二个method 参数（秒）
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int MM = seconds / 60;
        int SS = seconds % 60;

        return getDurationString(MM, SS);       // 呼叫第一个method,并提供参数(MM,SS)
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(90, 25));          // 01h 30m 25s
        System.out.println(getDurationString(5225));            // 01h 27m 05s
        System.out.println(getDurationString(-41));             // Invalid value
    }
}
