package dubbo.consumer;

import dubbo.provider.Talk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunjx on 2018/2/27.
 */
@Service
public class Person {

    @Autowired
    private Talk talk;

    public void talk(String userName){
        talk.hello(userName);
    }
}
