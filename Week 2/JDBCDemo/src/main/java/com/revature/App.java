package com.revature;

import java.util.List;

import com.revature.beans.Bear;
import com.revature.dao.BearDAO;

public class App {

	public static void main(String[] args) {
		BearDAO dao = new BearDAO();
		List<Bear> bears = dao.getAllBears();
		for (Bear b : bears) {
			System.out.println(b);
		}
		
		System.out.println(dao.getBear(2));
		dao.feedBear(2, 1, 10);
		System.out.println(dao.getBear(2));
	}

}
