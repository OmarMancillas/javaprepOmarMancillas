package com.enroutesystems;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoreKeywordsTest {
	@Test
	public void test() throws Exception {
		// Using break
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				log.info("If value less than 5, then it continues...");
				continue;
//				Any code after continue is not executed			
			} else {
				log.info("When value equals or more than 5, it stops (break)");
				break;
			}
//				Any code here is never executed, with the continue statement it never reaches here, and also with the break statement, it never reaches.
		}

		// Using instanceof
		String stringInstance = "Instance of string";
		boolean isInstance = stringInstance instanceof String;
		log.info("Is stringInstance instance of String? " + isInstance);

		// Using try-catch-finally
		// Using null
		try {
			String text = null;
			log.info("Text Empty? " + (text == null));
		} catch (Exception ex) {
			throw new Exception(ex.getMessage());
		} finally {
			log.info("Always Executes 'finally statement'");
		}
	}
}
