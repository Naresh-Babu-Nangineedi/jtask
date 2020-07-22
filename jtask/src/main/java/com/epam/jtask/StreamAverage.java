package com.epam.jtask;
import java.util.*;


public class StreamAverage {
	public double avg(List<Integer> list)
	{
		return list.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
	}
}