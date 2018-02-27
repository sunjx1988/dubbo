package dubbo;

import dubbo.consumer.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dubbo-consumer.xml"})
public class ConsumerTest {

    @Autowired
    private Person person;

    @Test
    public void Run(){
        person.talk("dubbo");
    }
}
