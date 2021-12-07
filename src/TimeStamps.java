import java.time.LocalDateTime;

public class TimeStamps {

    private static LocalDateTime[] camera1() {
        LocalDateTime datetime1 = LocalDateTime.of(2021, 11, 30, 7, 10, 19);
        LocalDateTime datetime2 = LocalDateTime.of(2021, 11, 30, 16, 59, 9);
        LocalDateTime datetime3 = LocalDateTime.of(2021, 11, 30, 16, 30, 1);
        LocalDateTime datetime4 = LocalDateTime.of(2021, 11, 30, 17, 30, 1);
        LocalDateTime datetime5 = LocalDateTime.of(2021, 11, 30, 8, 10, 19);
        LocalDateTime datetime6 = LocalDateTime.of(2021, 11, 30, 7, 10, 19);

        LocalDateTime[] dates = {datetime1, datetime2, datetime3, datetime4, datetime5, datetime6};
        return dates;
    }
    private static LocalDateTime[] camera2() {
        LocalDateTime datetime1 = LocalDateTime.of(2021, 12, 4, 10, 10, 43);
        LocalDateTime datetime2 = LocalDateTime.of(2021, 12, 4, 11, 15, 9);
        LocalDateTime datetime3 = LocalDateTime.of(2021, 12, 4, 14, 31, 9);
        LocalDateTime datetime4 = LocalDateTime.of(2021, 12, 4, 15, 47, 11);

        LocalDateTime[] dates = {datetime1, datetime2, datetime3, datetime4};
        return dates;

    }
    private static LocalDateTime[] camera3() {
        LocalDateTime datetime1 = LocalDateTime.of(2021, 12, 2, 18, 23, 13);
        LocalDateTime datetime2 = LocalDateTime.of(2021, 12, 2, 19, 2, 41);

        LocalDateTime[] dates = {datetime1, datetime2};
        return dates;
    }

    public static LocalDateTime[] getCamera1() {
        return camera1();
    }

    public static LocalDateTime[] getCamera2() {
        return camera2();
    }

    public static LocalDateTime[] getCamera3() {
        return camera3();
    }
}
