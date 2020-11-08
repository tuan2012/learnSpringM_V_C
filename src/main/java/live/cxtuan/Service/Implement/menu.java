package live.cxtuan.Service.Implement;

import live.cxtuan.Service.Interface.IhomeUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class menu implements IhomeUser {
    @Override
    public List<String> getList() {
        List<String> stringList=new ArrayList<>();
        stringList.add("Java");
        stringList.add("C");
       return stringList;
    }
}
