package com.enroutesystems;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.enroutesystems.EjemplosTransient.ClassWithTransient;

public class EjemploTransientTest {
	@Test
	public void test() throws IOException, ClassNotFoundException {
		ClassWithTransient object = new ClassWithTransient("Omar", "omar@email.com", "hola1234");
		EjemplosTransient.serialize(object);
		EjemplosTransient.deserialize();
	}
}
