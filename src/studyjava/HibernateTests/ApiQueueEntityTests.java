package studyjava.HibernateTests;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.query.Query;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.ApiQueueEntity;
import java.util.List;

public class ApiQueueEntityTests {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @BeforeEach
    void setUp() throws Exception {
        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        //  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();（使用这种方法会报错，unkonw Entity 。。。。）
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        //创建会话工厂对象

        sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建会话对象
        session = sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    @AfterEach
    void tearDown() throws Exception {
        //提交事务
        //transaction.commit();
        //关闭session
        session.close();
        //关闭sessionFactory
        sessionFactory.close();
    }

    @Test
    public void insertTest() {
        ApiQueueEntity a = new ApiQueueEntity();
        a.setTdocMethod("ddd");
        session.save(a);
        transaction.commit();
    }

    @Test
    public void updateTest() {
        ApiQueueEntity a =(ApiQueueEntity)session.get(ApiQueueEntity.class, new Integer(6971));
        a.setTdocMethod("115");
        session.update(a);
        transaction.commit();
    }
    @Test
    public void SelectTest() {
        ApiQueueEntity a =(ApiQueueEntity)session.get(ApiQueueEntity.class, new Integer(6971));
        a.setTdocMethod("115");
        session.update(a);
        transaction.commit();
    }

}
