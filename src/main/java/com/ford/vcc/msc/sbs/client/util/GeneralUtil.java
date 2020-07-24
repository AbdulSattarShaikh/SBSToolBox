package com.ford.vcc.msc.sbs.client.util;

public abstract class GeneralUtil {
	/** This trim is null-safe */
	public static String trim(String string) {
		if (string != null) {
			return string.trim();
		} else {
			return "";
		}
	}
}
