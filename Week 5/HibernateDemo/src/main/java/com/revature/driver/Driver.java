package com.revature.driver;

import com.revature.dao.BearDAO;

public class Driver {

	public static void main(String[] args) {
		BearDAO dao = new BearDAO();
		System.out.println(dao.getBears());

	}

}
