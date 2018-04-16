package com.ming.demo.java.json;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ming.demo.model.Person;

/**
 * json 对象互转
 */
public class GsonTest {

	private static Gson gson = new Gson();

	public static void main(String[] args) {
		//对象转String

		Person person = new Person(1L, "夜魅");
		String str = gson.toJson(person);
		System.out.println(str);

		//集合转String

		List<Person> persons = new ArrayList<>();
		Person jmt = new Person(2L, "jmt");
		persons.add(jmt);
		persons.add(person);
		String st = gson.toJson(persons);
		System.out.println(st);

		//string 转对象
		String obj = "{\"id\":1,\"name\":\"夜魅\"}";
		Person pJson = gson.fromJson(obj, Person.class);
		System.out.println(pJson.toString());

		//string 转数组
		String list = "[{\"id\":2,\"name\":\"jmt\"},{\"id\":1,\"name\":\"夜魅\"}]";
		List<Person> listJson = gson.fromJson(list, new TypeToken<List<Person>>() {
		}.getType());
		System.out.println(listJson);
	}
}
