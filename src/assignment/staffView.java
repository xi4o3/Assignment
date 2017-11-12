/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import assignment.User;
import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class staffView{
    ListInterface<User> userList = new List<>();
    
    public void viewInfo(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        int a;
        String dateoutput = "";
        System.out.println("Username" + "               " + "Clock in/out(Date & Time)" +"                          "+ "Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (a = 0 ; a < userList.getNumberOfEntries(); a++){
            if(userList.getEntry(a).getDateTime() == null){
              dateoutput = "no record";
              System.out.println(userList.getEntry(a).getUser() + "                    " + dateoutput + "                      " +userList.getEntry(a).getStatus());
       //     System.out.println(userList.get(a).getStatus());
            // userList.get(b).setDateTime(dateFormatter.format(now));
            }
            else{
                dateoutput = dateFormatter.format(userList.getEntry(a).getDateTime());
              System.out.println(userList.getEntry(a).getUser() + "                    " + dateoutput + "                      " +userList.getEntry(a).getStatus());
            }
        }
    }

    public ListInterface<User> getUserList() {
        return userList;
    }

    public void setUserList(ListInterface<User> userList) {
        this.userList = userList;
    }

}
