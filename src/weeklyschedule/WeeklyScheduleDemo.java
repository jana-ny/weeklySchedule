  /**Jana alyamani and Sarah almalki's project*/ 


import java.util.Scanner;  // Needed for the Scanner class 
import java.io.IOException;

public class WeeklyScheduleDemo {

    
    public static void main(String[] args)throws IOException {
        
        //Academic schedule variables
            String dayA=null;
            String courseA=null;
            int taskType;
        
        //Productive schedule variables
            String dayP=null;
            String titleP=null;
            int actType;   //activity type
        
        short schPrefrence;//a schedule preference variable
        
        Scanner key= new Scanner(System.in);//create a Scanner object 
        System.out.println("\t\t\t\t\t**Welcome to the weekly schedule program**"); 
        
        do{//start a do while loop
        
        System.out.println("choose a schedule category\n1)academic schedule"+
                "\n2)productivity schedule\n3)to display current schedule\n4)to exit"); 
        schPrefrence= key.nextShort();
        
           switch(schPrefrence){// start the 1st switch 
                
            case 1:
        do{ //start a 2nd do while loop, for the academic schedule
        Scanner Akey= new Scanner(System.in);
    
        System.out.println("""
                           choose an academic tasktype:
                           1 for assignment
                           2 for examination
                           3 for projects
                           4 to end""");
       
        taskType = Akey.nextInt();
        
        
        AcademicSchedule aInfo = new AcademicSchedule(courseA, dayA, taskType);//create an AcademicSchedule Object
        WeeklySchedule wSched = new WeeklySchedule(aInfo);//create a WeeklySchedule Object
        Akey.nextLine();
        
                switch(taskType){//start the 2nd switch 

                    case 1:

                        System.out.println("write the course name:");
                        courseA= Akey.nextLine();//take the course from the user
                        aInfo.setCourse(courseA);/*use the setCourse method from the AcademicSchedule
                        class to store the users' input*/

                        System.out.println("write the assignments' dew day (Sunday,monday etc..):");
                        dayA= Akey.nextLine();
                        dayA=dayA.toUpperCase();
                        aInfo.setDay(dayA);/*use the setDay method from the AcademicSchedule
                        class to store the users' input*/

                        WeeklySchedule.askFileName();//asks the user for the file name 
                        wSched.writeToScheduleA(aInfo);

                        break;

                    case 2:
                        System.out.println("write the exams' course name:");
                        courseA= Akey.nextLine();
                        aInfo.setCourse(courseA);/*use the setCourse method from the AcademicSchedule
                        class to store the users' input*/

                        System.out.println("write the exams' day (Sunday,monday etc..):");
                        dayA= Akey.nextLine();
                        dayA=dayA.toUpperCase();
                        aInfo.setDay(dayA);/*use the setDay method from the AcademicSchedule
                        class to store the users' input*/

                        WeeklySchedule.askFileName();//asks the user for the file name
                        wSched.writeToScheduleA(aInfo);
                        break;

                    case 3: 
                        System.out.println("write the projects' course name:");
                        courseA= Akey.nextLine();
                        aInfo.setCourse(courseA);/*use the setCourse method from the AcademicSchedule
                        class to store the users' input*/
                        
                        System.out.println("write the projects' dew day (Sunday,monday etc..):");
                        dayA= Akey.nextLine();
                        dayA=dayA.toUpperCase();
                        aInfo.setDay(dayA);/*use the setDay method from the AcademicSchedule
                        class to store the users' input*/

                        WeeklySchedule.askFileName();//asks the user for the file name
                        wSched.writeToScheduleA(aInfo);

                        break;
                    case 4: 
                        break;    
                    default:
                        System.out.println("invalid input please try again!:");//input validation
                        break;
                }//end the 2nd switch 
                }while(taskType!=4);//end 2nd do while
                break;

            case 2:
                
        do{  //start a 3rd do while loop, for the productive schedule
        Scanner Pkey= new Scanner(System.in);//create a Scanner object
        System.out.println("""
                               choose a productive activity:
                               1 for seminar
                               2 for workshop
                               3 to end""");
            
            actType = Pkey.nextInt();
            ProductiveSchedule pInfo = new ProductiveSchedule(titleP, dayP, actType);//create a ProductiveSchedule Object
            WeeklySchedule wSched2 = new WeeklySchedule(pInfo);//create a WeeklySchedule Object
            Pkey.nextLine();

                switch(actType){// start the 3rd switch 


                    case 1:
                        System.out.println("write the seminars' title:");
                        titleP= Pkey.nextLine();
                        pInfo.setEventName(titleP);

                        System.out.println("write the seminars' day (Sunday,monday etc..):");
                        dayP= Pkey.nextLine();
                        dayP=dayP.toUpperCase();
                        pInfo.setDay(dayP);

                        WeeklySchedule.askFileName();//asks the user for the file name
                        wSched2.writeToScheduleP(pInfo);

                        break;

                    case 2:
                        System.out.println("write the Workshops' title:");
                        titleP= Pkey.nextLine();
                        pInfo.setEventName(titleP);
                        System.out.println("write the Workshops' day (Sunday,monday etc..):");
                        dayP= Pkey.nextLine();
                        dayP=dayP.toUpperCase();
                        pInfo.setDay(dayP);

                        WeeklySchedule.askFileName();//asks the user for the file name
                        wSched2.writeToScheduleP(pInfo);
                        break;
                    case 3: 
                        break;    
                    default:
                        System.out.println("invalid input please try again!:");//input validation
                        break;
                    }//end the 3rd switch         
          }while(actType!=3);//end 3rd do while
                break;
            case 3:

                    WeeklySchedule.askFileName();//asks the user for the file name
                    WeeklySchedule.DisplaySchedule();
                    break;
            case 4:
                    break;
            default:
                    System.out.println("invalid input please try again!:");//input validation
                    break;
        }// end switch 1  
        }while(schPrefrence!=4);//end 1st do while
    }      
}
    


