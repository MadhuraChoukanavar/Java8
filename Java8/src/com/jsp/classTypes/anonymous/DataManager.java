package com.jsp.classTypes.anonymous;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataManager {
	public List<Student> sortByNmae(List<Student> list) {
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());

			}
		};
		Collections.sort(list, com);
		return list;

	}

	public List<Student> sortById(List<Student> list) {
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getId() - o2.getId();

			}
		};
		Collections.sort(list, com);
		return list;

	}

	public List<Student> sortByEmail(List<Student> list) {
//		Comparator<Student> com=(e1,e2)->
//		{
//			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
//		};
//		
//		Collections.sort(list, com);
//		

		Collections.sort(list, (e1, e2) -> {
			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
		});
		return list;

	}

}
