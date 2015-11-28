object scalaCh2 {



//String interpolation
println("Welcome to Chapter 3 of Beginning Scala")//> Welcome to Chapter 3 of Beginning Scala
 val name = "Pallavi"                             //> name  : String = Pallavi
 val place = "Pune"                               //> place  : String = Pune
 
 println(s"${name} lives in ${place}")            //> Pallavi lives in Pune
  
  val y =10                                       //> y  : Int = 10
  lazy val z = 15                                 //> z: => Int
  
  val sum = y + z                                 //> sum  : Int = 25
  
  
  //Functions without parameters
   def city1()  = {"Gauhati"}                     //> city1: ()String
   def city2(): String = {"Bangalore"}            //> city2: ()String
   def city3() = "Kolkata"                        //> city3: ()String
   def city4 = "Pune"                             //> city4: => String
  
  city1()                                         //> res0: String = Gauhati
    city1                                         //> res1: String = Gauhati
  city2()                                         //> res2: String = Bangalore
    city2                                         //> res3: String = Bangalore
  city3()                                         //> res4: String = Kolkata
    city3                                         //> res5: String = Kolkata
  //city4()
    city4                                         //> res6: String = Pune
    
    
    
  //Functions with parameters
  def season(name:String) = { println(s"It is ${name}") }
                                                  //> season: (name: String)Unit
  season("Autumn")                                //> It is Autumn
  
  def identity(name:String, empId:Int) = {println(s"${name} bears employee ID ${empId}")}
                                                  //> identity: (name: String, empId: Int)Unit
  identity("Rishi",12986)                         //> Rishi bears employee ID 12986
  
  
  //Arrays - 1st element has index 0
   
   //method-1
   var location:Array[String] = new Array[String](3)
                                                  //> location  : Array[String] = Array(null, null, null)
   location(0) = "Gauhati"
   location(1) = "Bangalore"
   location(2) = "Pune"
   
   println(location(0))                           //> Gauhati
  
     //method-2
      var locationNew = Array("Gauhati","Bangalore","Pune")
                                                  //> locationNew  : Array[String] = Array(Gauhati, Bangalore, Pune)
      println(locationNew(2))                     //> Pune
   
      locationNew(2) = "Tezpur"
      println(locationNew(2))                     //> Tezpur
  
  
  //Lists - 1st element has index 0
  //method-1
  val NumberLine:List[Int]= List(1,2,3,5,7)       //> NumberLine  : List[Int] = List(1, 2, 3, 5, 7)
  
  println(NumberLine(0))                          //> 1
  
  
  //method-2
  val CharLine = 'w'::('o' :: ('r' :: ('d' :: Nil)))
                                                  //> CharLine  : List[Char] = List(w, o, r, d)
   println(CharLine.head)                         //> w
   println(CharLine.tail)                         //> List(o, r, d)
  
  
  //Ranges
  1 to 10                                         //> res7: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 
                                                  //| 7, 8, 9, 10)
  6 until 27                                      //> res8: scala.collection.immutable.Range = Range(6, 7, 8, 9, 10, 11, 12, 13, 
                                                  //| 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26)
  1 to 101 by 4                                   //> res9: scala.collection.immutable.Range = Range(1, 5, 9, 13, 17, 21, 25, 29,
                                                  //|  33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97, 101)
  1 until 101 by 4                                //> res10: scala.collection.immutable.Range = Range(1, 5, 9, 13, 17, 21, 25, 29
                                                  //| , 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97)
  
  //Tuples- 1st element has index 1
  println("Tuple Using Values Separated by a Comma and Surrounded by a Pair of Parentheses")
                                                  //> Tuple Using Values Separated by a Comma and Surrounded by a Pair of Parenth
                                                  //| eses
  val today = (2, "november", 2015, true)         //> today  : (Int, String, Int, Boolean) = (2,november,2015,true)
  
  
  
   println("Tuples using relational operator")    //> Tuples using relational operator
   val today1 = 25 -> "december" -> false         //> today1  : ((Int, String), Boolean) = ((25,december),false)
  
   println("Accessing elements of a tuple")       //> Accessing elements of a tuple
   val access = today._3                          //> access  : Int = 2015
   val access1 = today1._2                        //> access1  : Boolean = false
  
  
  //if-else
  val i: Int = if ( 81 % 2 == 0 ) 1 else 0        //> i  : Int = 0
  
  
  //while
  var a = 20;                                     //> a  : Int = 20

      // while loop execution
      while( a < 20 ){
         println( "Value of a: " + a );
         a = a + 1;
      }
      
      
  //do...while
  var doWhile = 20;                               //> doWhile  : Int = 20

      // do loop execution
      do{
         println( "Value of doWhile: " +doWhile  );
         doWhile = doWhile + 1;
      }while( doWhile < 20 )                      //> Value of doWhile: 20
      
      
 //For comprehension
 
 val day:List[String] = List("dawn","mor ning","noon","after noon","eve ning","dusk","night","mid night")
                                                  //> day  : List[String] = List(dawn, mor ning, noon, after noon, eve ning, dusk
                                                  //| , night, mid night)
 for (tempVar<-day)
println(tempVar)                                  //> dawn
                                                  //| mor ning
                                                  //| noon
                                                  //| after noon
                                                  //| eve ning
                                                  //| dusk
                                                  //| night
                                                  //| mid night
 
 
 //Filters with For comprehension
 for(tempVar<-day
 if tempVar.contains("ning")
 ) println(tempVar)                               //> mor ning
                                                  //| eve ning
  
 
 //Variable Binding
 val places:List[String] = List("tezpur","Gauhati","Kolkata","Pune","Mumbai")
                                                  //> places  : List[String] = List(tezpur, Gauhati, Kolkata, Pune, Mumbai)
 for {tempPlaces<- places
 newList = tempPlaces.toUpperCase()    //new variable inside for
} println(newList)                                //> TEZPUR
                                                  //| GAUHATI
                                                  //| KOLKATA
                                                  //| PUNE
                                                  //| MUMBAI
  
  //Yielding
  var varHours = for{
   tempVar <-day
   if tempVar.contains("noon")
   }yield tempVar                                 //> varHours  : List[String] = List(noon, after noon)
  
  
  
  
  //Match expressions
  "Rochelle" match {
case "Rochele"=> 45 // the result is 45 if we match "David"
case "Elwood" => 77
case  "Rochelle"=> 1
case _ => 0
}                                                 //> res11: Int = 1

  
  
  
  
}