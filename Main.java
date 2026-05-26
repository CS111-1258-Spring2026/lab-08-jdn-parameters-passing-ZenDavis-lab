// PARTNER NAME: Zen Davis
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE:Mar 8 2026
public class Main 
{
    public static void main(String[] args) 
    {
        // Original date
        int JDN1 = calcJulianDate(2, 2, 2020);
        System.out.println("Julian Day Number (02/02/2020): " + JDN1);

        // Katherine Johnson's birthday
        int date1 = calcJulianDate(8, 26, 1918);
        System.out.println("Katherine Johnson JDN (08/26/1918): " + date1);

        // My birthday: 02/14/2004
        int birthDay = calcJulianDate(2, 14, 2004);
        System.out.println("Your Birthday JDN (12/21/2001): " + birthDay);
    }

    public static int calcJulianDate(int monthToday, int dayToday, int yearToday)
    {
        int a = (14 - monthToday) / 12;
        int y = yearToday + 4800 - a;
        int m = monthToday + 12 * a - 3;

        int JDN = dayToday 
                + (153 * m + 2) / 5 
                + 365 * y 
                + (y / 4) 
                - (y / 100) 
                + (y / 400) 
                - 32045;

        return JDN;
    }
}

