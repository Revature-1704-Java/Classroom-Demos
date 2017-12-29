package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Bear;
import com.revature.util.ConnectionUtil;

public class BearDAO {
	
	public List<Bear> getAllBears() {
		PreparedStatement ps = null;
		Bear b = null;
		List<Bear> bears = new ArrayList<>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM BEAR";
			ps = conn.prepareStatement(sql);
			//Add any variables to PS
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("BEAR_ID");
				String name = rs.getString("BEAR_NAME");
				int age = rs.getInt("BEAR_AGE");
				int weight = rs.getInt("BEAR_WEIGHT");
				
				b = new Bear(id, name, age, weight);
				bears.add(b);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return bears;
	}
	
	public Bear getBear(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Bear b = null;
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM BEAR WHERE BEAR_ID = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("BEAR_ID");
				String name = rs.getString("BEAR_NAME");
				int age = rs.getInt("BEAR_AGE");
				int weight = rs.getInt("BEAR_WEIGHT");
				
				b = new Bear(bid, name, age, weight);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return b;
	}
	
	public void feedBear(int bid, int bhid, int amt) {
		CallableStatement cs = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "{CALL SP_FEED_BEAR(?, ?, ?)}";
			cs = conn.prepareCall(sql);
			cs.setInt(1, bid);
			cs.setInt(2, bhid);
			cs.setInt(3, amt);
			
			Boolean result = cs.execute();
			if (!result)
				System.out.println("Fed Bear");
			else
				System.out.println("Failed");
			
			cs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
