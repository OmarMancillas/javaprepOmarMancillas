package com.enroutesystems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosTransient {

	public static class ClassWithTransient implements Serializable {
		private String name;
		private String username;
		private transient String password;

		public ClassWithTransient(String name, String username, String password) {
			this.name = name;
			this.username = username;
			this.password = password;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.name);
			sb.append("/");
			sb.append(this.username);
			sb.append("/");
			sb.append(this.password);
			sb.append("/");
			return sb.toString();
		}
	}

	public static void serialize(ClassWithTransient object) throws IOException {
		FileOutputStream file = new FileOutputStream("file.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(object);
		os.flush();
		os.close();
		file.close();
	}

	public static void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
		ClassWithTransient object = (ClassWithTransient) in.readObject();
		log.info(object.toString());//When logging the info, password will appear as null because it wasn't serialized as it is transient...
		in.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ClassWithTransient newTransient = new ClassWithTransient("Omar", "omar@email.com", "hola1234");
		serialize(newTransient);
		deserialize();
	}
}
