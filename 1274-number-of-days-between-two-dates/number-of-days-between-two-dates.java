
class Solution {

    public int findday(String date, int[] monthdayscum) {
        int month = Integer.parseInt(date.substring(5, 7));
        int days = Integer.parseInt(date.substring(8, 10));

        return monthdayscum[month - 1] + days;
    }

    public int daysBetweenDates(String date1, String date2) {

        int monthdays[] = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int monthdaysl[] = {
            31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int monthdayscum[] = new int[13];
        int monthdayscuml[] = new int[13];

        for (int i = 1; i <= 12; i++) {
            monthdayscum[i] =
                monthdayscum[i - 1] + monthdays[i - 1];

            monthdayscuml[i] =
                monthdayscuml[i - 1] + monthdaysl[i - 1];
        }

        int n1 = Integer.parseInt(date1.substring(0, 4));
        int n2 = Integer.parseInt(date2.substring(0, 4));

        int ans1;
        int ans2;

        // Calculate the day number for date1
        if (n1 % 400 == 0 || (n1 % 4 == 0 && n1 % 100 != 0)) {
            ans1 = findday(date1, monthdayscuml);
        } else {
            ans1 = findday(date1, monthdayscum);
        }

        // Calculate the day number for date2
        if (n2 % 400 == 0 || (n2 % 4 == 0 && n2 % 100 != 0)) {
            ans2 = findday(date2, monthdayscuml);
        } else {
            ans2 = findday(date2, monthdayscum);
        }

        // Add days in the years before each date
        int leap1 = (n1 - 1) / 4 - (n1 - 1) / 100
                    + (n1 - 1) / 400;

        int leap2 = (n2 - 1) / 4 - (n2 - 1) / 100
                    + (n2 - 1) / 400;

        long total1 = 365L * (n1 - 1) + leap1 + ans1;
        long total2 = 365L * (n2 - 1) + leap2 + ans2;

        return (int) Math.abs(total1 - total2);
    }
}

