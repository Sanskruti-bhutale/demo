import java.io.*;
class Weekday{
   //hi my name is shivani
 public static void main(String...args)throws Exception

{
     InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter number");
String str=br.readLine ();
int num=Integer.parseInt(str);


  switch (num){

  case 1: System.out.println("sunday");

    break;

  case 2: System.out.println("monday");
   break;
  case 3: System.out.println("Tuesday");
   break;
  case 4: System.out.println("Wednesday");
   break;
case 5: System.out.println("thursday");
   break;
  case 6: System.out.println("friday");
    break;
case 7: System.out.println("saturday");
   break;
   default: System.out.println("day not found");
}

}
}