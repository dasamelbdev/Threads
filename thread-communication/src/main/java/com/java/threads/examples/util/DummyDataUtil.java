package com.java.threads.examples.util;

import java.util.ArrayList;
import java.util.List;

public class DummyDataUtil {

	public static List<Integer> getList(int leangthOfList) {

		if (leangthOfList == 0)
			throw new IllegalArgumentException("leangth of the list must be a non zero value");

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < leangthOfList; i++)
			list.add(i);
		return list;

	}

}
