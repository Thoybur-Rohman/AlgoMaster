  public static String dayOfWeek(String day, int k) {
        List<String> days = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        int index = days.indexOf(day);
        return days.get((index + k) % 7);
    }
