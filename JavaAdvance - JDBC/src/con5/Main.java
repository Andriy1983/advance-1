package con5;

import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.CallableStatement;

public class Main {
	public static void main(String[] args) {

		DB_Connection connection = new DB_Connection();
		connection.openConnection("jdbc:mysql://localhost:3306/logos_jdbc", "root", "123456");
//
//		/*�������*/
//		connection.doUpdate(
//				"create table if not exists vikladachi (id_vikladacha int not null auto_increment primary key, name varchar(50), surname varchar(50), discipline int, salary int)");
//		/*����� ���� �������*/
//		connection.doUpdate("alter table vikladachi add column date_work date");
//		
//		/*����������*/
//		connection.doUpdate(
//				"create table if not exists disciplinyi (id_disciplinyi int not null auto_increment primary key, name_of_disiplines varchar(50))");
//		/*�������������*/
//		connection.doUpdate(
//				"create table if not exists vikl_disc_ref (fk_for_vikladachi int not null, fk_on_disciplinyi int not null)");
//		/*����������  �������*/
//		connection.doUpdate(
//				"insert into vikladachi (name,surname , salary) values('sergey','zhuravlyov' , 13000),('roma','zherebetskiy' , 14000),('kolya','shorobura' , 13000),('sergey','sokol' , 13000)");
//		/*���������� ����������*/
//		connection.doUpdate("insert into disciplinyi(name_of_disiplines) values('java core'),('java advance')");
//		/*�� �� ��������*/
//		connection.doUpdate(
//				"alter table vikl_disc_ref add constraint fkd foreign key(fk_for_vikladachi) references vikladachi(id_vikladacha) on delete cascade on update cascade");
//		/*�� �� ����������*/
//		connection.doUpdate(
//				"alter table vikl_disc_ref add constraint fkv foreign key(fk_on_disciplinyi) references disciplinyi(id_disciplinyi) on delete cascade on update cascade ");
//		/*���������� �������������*/
//		connection.doUpdate(
//				"insert into vikl_disc_ref(fk_for_vikladachi,fk_on_disciplinyi) values(1,1),(1,2),(2,1),(2,2),(3,1),(4,1),(4,2)");

		

//		connection.doSelect("select * from vikladachi");
		
//		connection.callStoredProcedure("call selectAll2('sergey')");
		
//		connection.callStoredProcedureUpdate("call insertSome(1)");
//		connection.callStoredProcedure("call insertSome(1)");
		
//		connection.callStoredProcedure("call ifelse(1,13000)");
		
//		connection.callStoredProcedure("call caseMy(1)");
	}

}
