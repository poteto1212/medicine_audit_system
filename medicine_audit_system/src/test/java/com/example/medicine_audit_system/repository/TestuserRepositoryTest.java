package com.example.medicine_audit_system.repository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import java.util.List;
import com.example.medicine_audit_system.helper.datasethelper.ReplacementCsvDataSetLoader;
import com.example.medicine_audit_system.model.Testuser;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestExecutionListeners({
    DependencyInjectionTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DbUnitTestExecutionListener.class
})
@DbUnitConfiguration(
    dataSetLoader = ReplacementCsvDataSetLoader.class
)

@Transactional
public class TestuserRepositoryTest{
    private static final String DATA_FILE_PATH = "/test_dataset/";

    @Autowired
    TestuserRepository testuserRepository;
    @DatabaseSetup(value = DATA_FILE_PATH)

    @Test
    public void ユーザーIDを渡すと該当ユーザーのエンティティが帰る(){
        
        Testuser testuserentity = new Testuser();
        testuserentity.setId(1);
        testuserentity.SetFirstName("たろう");
        testuserentity.SetLastName("テスト");
        List<Testuser> testusers = testuserRepository.select_user_name(1);
        System.out.println("デヴァイス");
        System.out.println(testusers.get(0).getFirstName());
        assertEquals(testusers.get(0).getFirstName() ,"たろう");
 
    }

}