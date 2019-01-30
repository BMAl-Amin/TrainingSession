package io.naztech.crudmicrosoftsql.main;

import io.naztech.crudmicrosoftsql.dao.impl.CrudDaoImplement;
import io.naztech.crudmicrosoftsql.dao.impl.GroupBySqlImplement;
import io.naztech.crudmicrosoftsql.dao.impl.TableSettingImplement;
import io.naztech.crudmicrosoftsql.dao.interfaces.CrudDaoInterface;
import io.naztech.crudmicrosoftsql.dao.interfaces.GroupBySqlInterface;
import io.naztech.crudmicrosoftsql.dao.interfaces.TableSettingsInterface;
import io.naztech.crudmicrosoftsql.models.CrudModel;

public class MainClass {

	public static void main(String[] args) {
		
		TableSettingsInterface tableSettingsInterface= new TableSettingImplement();
		CrudDaoInterface crudDaoInterface= new CrudDaoImplement();
		GroupBySqlInterface groupBySqlInterface= new GroupBySqlImplement();
		
		//tableSettingsInterface.createTable("T_bmemployee"); //create new table
		
		//System.out.println(crudDaoInterface.insertData("Hasnat", 175000.00, "Bangladesh", "9246", "Mrs.")); //insert new record
		
		//crudDaoInterface.deleteRecord("bm"); //delete specific record
		
		//crudDaoInterface.editData(1, "c_salary", "5000"); //edit existed record
		
		//System.out.println(crudDaoInterface.showRecord(1)); //view specific record
		
//		for(CrudModel crudModel: crudDaoInterface.showAll()) { //view all records
//			System.out.println(crudModel);
//		}
		
		//System.out.println(crudDaoInterface.foundSalaryMax());
		
		//tableSettingsInterface.deleteTable("T_bmemployee"); //drop table from database if given table exist
		
		//System.out.println(tableSettingsInterface.deleteValuesOFTable("T_bmemployee")); //delete data from table
		
		//System.out.println("Maximum salary: "+groupBySqlInterface.findMaxValueFromTable()); //find maximum value from table
		
		//System.out.println("Minimum salary: "+groupBySqlInterface.findMinValueFromTable()); //find maximum value from table
		
		//System.out.println("Number of employee whom get maximum salary: "+ //number of max salary
		//		groupBySqlInterface.countNumberOfMaxValueFromTable());
		
		//System.out.println("Number of employee whom get minimum salary: "+ //number of min salary
		//		groupBySqlInterface.countNumberOfMinValueFromTable());
		
//		for(CrudModel crudModel: tableSettingsInterface.showTopValueByQuantity(3)) { //view top records by row number
//			System.out.println(crudModel);
//		}
		for(CrudModel crudModel: groupBySqlInterface.orderByPracticeMethod("c_name")) {
			System.out.println(crudModel);
		}
	}

}
