package nyc.c4q.design_pattern_inclass.question1;

/**
 * Created by yokilam on 1/7/18.
 */

public enum MonthOfTheYear {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int monthNumber;

    MonthOfTheYear(int monthNumber){
        this.monthNumber= monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
