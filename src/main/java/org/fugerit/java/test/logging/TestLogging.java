package org.fugerit.java.test.logging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLogging {

	public static void testLogging( String message ) {
		log.info( "Test logging : {}", message );
	}
	
	public static void main( String[] args ) {
		testLogging( "fj-test-logging" );
	}
	
}
