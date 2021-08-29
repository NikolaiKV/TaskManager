import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название задачи и время на ее выполнение:");
        String input = in.nextLine();

        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos + 12, startPos + 15);
        startTimeString = startTimeString.trim();

        int startTime = Integer.parseInt(startTimeString);

        int endPos = input.indexOf("заканчивается в");
        String endTimeString = input.substring(endPos + 15, endPos + 18);
        endTimeString = endTimeString.trim();

        int endTime = Integer.parseInt(endTimeString);

        int time = endTime - startTime;
        if( time <= 0 ){

            System.out.println("Формат введенных данных неверный");

        }
        System.out.println("На задачу потребуется: " + time + " ч.");
    }
}