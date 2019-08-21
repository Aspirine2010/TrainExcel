import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public static List<Emloyee> listEmployees(){
        List<Emloyee>list = new ArrayList<Emloyee>();

        Emloyee e1 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e2 = new Emloyee("Жигульмес","45000","Хер знает откуда","Хер знает когда");
        Emloyee e3 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e4 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e5 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e6 = new Emloyee("Мерз","1500000","Хер знает откуда","Хер знает когда");
        Emloyee e7 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e8 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        Emloyee e9 = new Emloyee("Запор","15000","Хер знает откуда","Хер знает когда");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        return  list;
    }
}
