/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.List;
import java.util.ArrayList;
import assignment.User;
import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class staffView{
    List<User> userList = new ArrayList<>();
    
    public void viewInfo(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        int a;
        String dateoutput = "";
        System.out.println("Username" + "               " + "Clock in/out(Date & Time)" +"                          "+ "Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (a = 0 ; a < userList.size(); a++){
            if(userList.get(a).getDateTime() == null){
              dateoutput = "no record";
              System.out.println(userList.get(a).getUser() + "                    " + dateoutput + "                      " +userList.get(a).getStatus());
       //     System.out.println(userList.get(a).getStatus());
            // userList.get(b).setDateTime(dateFormatter.format(now));
            }
            else{
                dateoutput = dateFormatter.format(userList.get(a).getDateTime());
              System.out.println(userList.get(a).getUser() + "                    " + dateoutput + "                      " +userList.get(a).getStatus());
            }
        }
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
