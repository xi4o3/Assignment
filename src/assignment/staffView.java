/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import static assignment.Assignment.manList;
import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class staffView{
    ListInterface<DeliveryMan> manList = new List<>();
    
    public void viewInfo(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        int a;
        String dateoutput = "";
        System.out.println("Username" + "               " + "Clock in/out(Date & Time)" +"                          "+ "Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (a = 1 ; a <= manList.getNumberOfEntries(); a++){

            if(manList.getEntry(a).getDateTime() == null){
              dateoutput = "no record";
              System.out.println(manList.getEntry(a).getName()+ "                    " + dateoutput + "                      " +manList.getEntry(a).getWorkingStatus());
            //System.out.println(userList.get(a).getWorkingStatus());
            //manList.get(b).setDateTime(dateFormatter.format(now));
            }
            else{
              dateoutput = dateFormatter.format(manList.getEntry(a).getDateTime());
              System.out.println(manList.getEntry(a).getName() + "                    " + dateoutput + "                      " +manList.getEntry(a).getWorkingStatus());
            }
        }
    }

    public ListInterface<DeliveryMan> getUserList() {
        return manList;
    }

    public void setUserList(ListInterface<DeliveryMan> manList) {
        this.manList = manList;
    }

}
