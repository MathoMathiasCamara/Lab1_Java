import Classes.Friend;
import Classes.Friends;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        /*1.	Разработать информационную базу «Мои знакомые», каждая запись которой содержит следующие сведения:
         	порядковый номер;
         	фамилию, имя и отчество;
         	год рождения, месяц и число рождения;
         	домашний адрес;
         	номер телефона (или пусто).

         Предусмотреть:

         а) выдачу сведений о знакомых, родившихся в указанном месяце;
         б) выдачу сведений о знакомых, имеющих телефон;
         в) добавление новой записи после записи с указанной фамилией;
         г) выдачу сведений о знакомых с кодом телефона указанного оператора
         */


        // Start the project
        Start();

    }
public static  void Start()
{
    Friends friendList=new Friends();

    //adding friend to my list
    friendList.AddFriend("123456","Alisa","",
            "McCarthy", LocalDate.of(1980,10,22),
            "Marshala Hono. 11a","066 12345678");
    friendList.AddFriend("12356","Melissa","",
            "Stewart", LocalDate.of(1970,7,22),
            "Chevchenko 150a","093 100099");
    friendList.AddFriend("123457","Robert","Paul",
            "Jhonson", LocalDate.of(1990,5,22),
            "Marshala Hono. 11e","093 120000");

    // add new friend after LastName "Stewart"
    Friend friend=new Friend("321654","Tester","Of","App",
            LocalDate.of(1986,11,22),"This adress","067 654321");
    friendList.AddFriendAfterFriendWithName(friend,"Stewart");
    friendList.PrintFriendList();

    //find friends born in Month
    friendList.FriendsBornInMonth(5);

    //find friends operator
    friendList.FriendsHaveSpecificPhoneCode("093");

}

}
