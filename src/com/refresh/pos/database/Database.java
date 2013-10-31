package com.refresh.pos.database;

import java.util.List;

public interface Database {
	public List<Object> select(String queryString);
	public int insert(String tableName, Object content);
	public boolean update();
	public boolean delete();
}
