import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel


class DBUtilsGetAllReporteeTest extends PlaySpec {

  "getAllReportee method" must {
    "Return list of all reportees of a given manager" in {
	    
           //data from db  
	   var empRpt:List[EmployeeModel] = DBUtils.getAllReportee("2");
	
	   //This is  hard-coded map
           val empMap =Map( 1->"Sumit", 2->"Prashant",3->"Rucha", 4->"Varghese", 5->"Tanya",6->"Shreerang",7->"Abhijit",8->"Manoj",9->"Pushpendra",10->"JK", 11->"Priya", 12->"Sudhanshu");


          //It will compare the name received from DB with the name we got from our hard-coded map based on DB supplied emp.id
          val matchedReportees = for (emp <- empRpt if (emp.name.equals(empMap(emp.id.toInt)))) yield emp
      
      //displaying fetched data
      empRpt.foreach(e => println(e.name))
      println("------------")
      matchedReportees.foreach(m => println(m.name))
      
      //pass or fail test
      assertResult(empRpt.length)(matchedReportees.length)
      
	
  }
}
}
