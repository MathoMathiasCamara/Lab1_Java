package Classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Friends {
    private ArrayList<Friend> myFriendsList;
    public Friends(){
        myFriendsList=new ArrayList<>();
    }


    public void AddFriend(Friend friend)
    {
        this.myFriendsList.add(friend);
    }

    public void AddFriend(String serialNumber, String firstName, String middleName, String lastName, LocalDate dOB, String homeAdress, String phoneNumber) {
        var friend=new Friend(serialNumber,firstName,middleName,lastName,dOB,homeAdress,phoneNumber);
        myFriendsList.add(friend);
    }

    /*а) выдачу сведений о знакомых, родившихся в указанном месяце;*/
    public void FriendsBornInMonth(int month)
    {
        System.out.println("Friends born in ("+month+") Month :");
        myFriendsList.forEach(e->{
           if(e.getdOB().getMonthValue()==month)
               System.out.println(e.toString());
        });
    }

    /*б) выдачу сведений о знакомых, имеющих телефон;*/
    public void FriendsHavePhone(String phone)
    {
        System.out.println("Friends with phone number :");
        myFriendsList.forEach(e->{
            if(!e.getPhoneNumber().isEmpty())
                System.out.println(e.toString());
        });
    }



    /*в) добавление новой записи после записи с указанной фамилией;*/
    public void AddFriendAfterFriendWithName(Friend friend,String lastName)
    {
        Friend found=myFriendsList.stream().findFirst().filter(x->x.getLastName().equals(lastName)).get();

        if(found!=null)
        {
            int index= myFriendsList.indexOf(found);
            //copy the element of the list till the specify index
            ArrayList<Friend> backupFriend=new ArrayList<>();
            for (Friend item:myFriendsList) {
                //add the existing friend to the backup
                backupFriend.add(item);
                if(item.equals(found)) //if the current friend is the found friend then add the new friend after
                    backupFriend.add(friend);
            }

            myFriendsList=backupFriend;
        }else
            System.out.println("Error no corresponding name found");
    }

    /*г) выдачу сведений о знакомых с кодом телефона указанного оператора
     */
    public void FriendsHaveSpecificPhoneCode(String code)
    {
        System.out.println("Friends with same operator :"+code);
        myFriendsList.forEach(e->{
            if(!e.getPhoneNumber().isEmpty())
                if(e.getPhoneNumber().contains(code))
                    System.out.println(e.toString());
        });
    }

    //print friend list
    public void PrintFriendList()
    {
        System.out.println("Friends list :");
        myFriendsList.forEach(e->{
                System.out.println(e.toString());
        });
    }
}
