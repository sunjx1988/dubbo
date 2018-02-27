package dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.provider.Talk;
import org.springframework.stereotype.Service;

/**
 * Created by sunjx on 2018/2/27.
 */
@Service
public class Person {

    @Reference
    private Talk talk;

    public void talk(String userName){
        talk.hello(userName);
    }
}
