package main;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
		
		int startDay = sc.nextInt();
		
		String [] startTime = sc.next().split(":");
		
		int startHour = Integer.parseInt(startTime[0]);
		int startMinute = Integer.parseInt(startTime[1]);
		int startSecond = Integer.parseInt(startTime[2]);
		
		int endDay = sc.nextInt();
		
		String [] endTime = sc.next().split(":");
		
		int endHour = Integer.parseInt(endTime[0]);
		int endMinute = Integer.parseInt(endTime[1]);
		int endSecond = Integer.parseInt(endTime[2]);
		
		int startTotalSeconds = (startSecond) + (startMinute * 60) + (startHour * 3600) + (startDay * 86400);
		int endTotalSeconds = (endSecond) + (endMinute * 60) + (endHour * 3600) + (endDay * 86400);
		
		int totalDurationTime = endTotalSeconds - startTotalSeconds;
		
		int days = totalDurationTime / 86400;
		totalDurationTime %= 86400;
		
		int hours = totalDurationTime / 3600;
		totalDurationTime %= 3600;
		
		int minutes = totalDurationTime / 60;
		totalDurationTime %= 60;
		
		int seconds = totalDurationTime;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
	}
}
