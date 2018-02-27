package dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.provider.Talk;

/**
 * Created by sunjx on 2018/2/27.
 */
@Service(timeout = 3000)
public class TalkImpl implements Talk {

    @Override
    public void hello(String name) {
        System.out.printf("hello,%s%n",name);
    }
}
