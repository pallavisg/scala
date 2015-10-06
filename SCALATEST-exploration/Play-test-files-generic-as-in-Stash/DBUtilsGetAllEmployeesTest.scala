import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel

class DBUtilsGetAllEmployeesTest extends PlaySpec {

 "getAllEmployees method" must {
     "Return all employees" in {
           
           //data from db
	   var ListEmp:List[EmployeeModel] = DBUtils.getAllEmployees;
     
           //hard-coded data to check test-condition
           val empAll = Map( 1->"Sumit", 2->"Prashant",3->"Rucha", 4->"Varghese", 5->"Tanya",6->"Shreerang",7->"Abhijit",8->"Manoj",9->"Pushpendra",10->"JK", 11->"Priya", 12->"Sudhanshu");

     
           val matchedResult = for (emp <- ListEmp if (emp.name.equals(empAll(emp.id.toInt)))) yield emp
      
      //displaying fetched data
      ListEmp.foreach(e => println(e.name))
      println("------------")
      matchedResult.foreach(m => println(m.name))
     

      //pass or fail test
      assertResult(ListEmp.length)(matchedResult.length)
      
     
     } 
     
   }  
  
  
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
       
	   
	   
	   