                      /**Jana alyamani and Sarah almalki's project*/ 

import java.io.*;
import java.util.Scanner;


public class WeeklySchedule {
    
    /*The fileName attribute holds the file name.*/ 
    private static String fileName;
    public AcademicSchedule aSched;//aggregation
    public ProductiveSchedule pSched;//aggregation
    
    /**
     * Constructor 
     * @param aSched 
     */
    public WeeklySchedule(AcademicSchedule aSched) {
        this.aSched = aSched;
    }
    /**
     * Constructor
     * @param pSched 
     */
    public WeeklySchedule(ProductiveSchedule pSched) {
        this.pSched = pSched;
    }
    /**
     * Constructor
     * @param fileName the fileName of WeeklySchedule.
     */
    public WeeklySchedule(String fileName) {
        this.fileName = fileName;
    }
    
   /**
    * The setFileName method stores a value in the 
    * fileName field.
    * @param fileName 
    */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /**
     * The getFileName method returns a WeeklySchedule
     * object's fileName.
     * @return The value in the fileName field.
     */
    public String getFileName() {
        return fileName;
    }
    /**
    * This method is used to prompt the user to enter the name of the file
    * and store the name in the variable fileName.
    */
    public static void askFileName(){
        Scanner key=new Scanner(System.in);
        System.out.println("insert the file name:");
        fileName= key.nextLine();
    }
    /**
    * This method is used to display the contents of a file with the name stored in the fileName variable.
    * If the file is empty, a message is displayed to the user indicating that the file is empty.
    * @throws IOException if an input or output exception occurs
    */
    public static void DisplaySchedule()throws IOException
    {
        File file=new File(fileName);
        Scanner read =new Scanner(file);
        //input validation incase of an empty file
        if (file.length() == 0)
            System.out.println("\nthe File is empty, please fill the schedule first\n");
        else{
            while(read.hasNext()){
           String schLine= read.nextLine();
           System.out.println(schLine);
           }
            read.close();
        }
    }
    /**
    * This method is used to write an academic schedule object to a file.
    * The contents of the academic schedule object are appended to the file.
    * @param aSched the academic schedule object to be written to the file
    * @throws IOException if an input or output exception occurs
 ,  */
    //public void writeToSchedule(String name, String day, int Type)throws IOException
    public void writeToScheduleA(AcademicSchedule aSched)throws IOException
    {
        
        FileWriter fwFileSchedule= new FileWriter(fileName,true);
        PrintWriter pwFileSchedule =new PrintWriter(fwFileSchedule);
        String[] TypeS = {"assignment","examination","projects","seminar","workshop"};
        int tempType= aSched.getTaskType();
        pwFileSchedule.println(aSched.getDay()+" : "+aSched.getCourse()+" "+TypeS[--tempType]);
        pwFileSchedule.println("---------------------------------------------");
        pwFileSchedule.close();
    }
    /**
    * This method is used to write a productive schedule object to a file.
    * The contents of the productive schedule object are appended to the file.
    * @param pSched the productive schedule object to be written to the file
    * @throws IOException if an input or output exception occurs
    */
    public void writeToScheduleP(ProductiveSchedule pSched)throws IOException

    {
        
        FileWriter fwFileSchedule= new FileWriter(fileName,true);
        PrintWriter pwFileSchedule =new PrintWriter(fwFileSchedule);
        String[] TypeS= {"seminar","workshop"};
        int tempType=pSched.getEventType();
        pwFileSchedule.println(pSched.getDay()+" : "+pSched.getEventName()+" "+TypeS[--tempType]);
        pwFileSchedule.println("---------------------------------------------");
        pwFileSchedule.close();
    }
    
    
}
