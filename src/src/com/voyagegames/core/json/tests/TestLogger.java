package com.voyagegames.core.json.tests;

import java.util.ArrayList;
import java.util.List;

import com.voyagegames.core.json.ILogger;

public class TestLogger implements ILogger {
	
	public final String delimiter = " : ";
	public final List<String> logs = new ArrayList<String>();

	@Override
	public void log(final String tag, final String msg) {
		logs.add(tag + delimiter + msg);
	}

	@Override
	public void log(final String tag, final String msg, final Exception e) {
		logs.add(tag + delimiter + msg);
		e.printStackTrace();
	}

}
