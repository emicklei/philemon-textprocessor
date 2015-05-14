package com.philemonworks.textprocessor.test;

import java.net.URL;

import com.sun.cnpi.rss.elements.Rss;
import com.sun.cnpi.rss.parser.RssParser;
import com.sun.cnpi.rss.parser.RssParserFactory;

/**
 * RssTest is
 * 
 * @author E.M.Micklei
 */
public class RssTest {
	public static void main(String[] args) {
		try {
			RssParser parser = RssParserFactory.createDefault();
			Rss rss = parser.parse(new URL("http://slashdot.org/index.rss"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
