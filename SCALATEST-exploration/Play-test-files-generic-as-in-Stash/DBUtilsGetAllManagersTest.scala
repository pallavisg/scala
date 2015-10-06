import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel

class DBUtilsGetAllManagersTest extends PlaySpec {

"getAllManagers method" must {
     "Return all managers" in {
	   
      //data from db
	   var ListMgr:List[EmployeeModel] = DBUtils.getAllManagers;
     
     //This is your hard coded map
       val empMap =Map( 1->"Sumit", 2->"Prashant",3->"Rucha", 4->"Varghese", 5->"Tanya",6->"Shreerang",7->"Abhijit",8->"Manoj",9->"Pushpendra",10->"JK", 11->"Priya", 12->"Sudhanshu");

      //It will compare the name received from DB with the name we got from our hard-coded map based on DB supplied emp.id
      val managers = for (emp <- ListMgr if (emp.name.equals(empMap(emp.id.toInt)))) yield emp
      
      ListMgr.foreach(e => println(e.name))
      println("------------")
      managers.foreach(m => println(m.name))
      
      assertResult(ListMgr.length)(managers.length)
     } 
     
   }  
  
  
}  