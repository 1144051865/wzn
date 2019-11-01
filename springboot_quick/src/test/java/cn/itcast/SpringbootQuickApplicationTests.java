package cn.itcast;

import cn.itcast.mapper.StudentMapper;
import cn.itcast.pojo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuickApplication.class)
class SpringbootQuickApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void test() {
        List<Student> list = studentMapper.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
