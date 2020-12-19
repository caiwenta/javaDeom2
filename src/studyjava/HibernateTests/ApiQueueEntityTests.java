package studyjava.HibernateTests;

import java.sql.Timestamp;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.query.Query;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.SaleEntity;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        transaction.commit();
        //关闭session
        session.close();
        //关闭sessionFactory
        sessionFactory.close();
    }

    @Test
    public void insertTest() {
        try {
            SaleEntity a = new SaleEntity();
            Timestamp time2 = new Timestamp(new Date().getTime());
            a.setSaleTime(time2);
            a.setName("1122");
            session.save(a);
        } catch (Exception e) {
            throw e;
        }
//        a.setOrderDate(time2);
//        a.setCustomerId(0055);
//        a.setOrderId(777);
//        session.save(a);

    }

    @Test
    public void updateTest() {
//        ApiQueueEntity a = (ApiQueueEntity) session.get(ApiQueueEntity.class, new Integer(6971));
//        a.setTdocMethod("115");
//        session.update(a);

    }

    @Test
    public void SelectTest() {
//        ApiQueueEntity a = (ApiQueueEntity) session.get(ApiQueueEntity.class, new Integer(6971));
//        a.setTdocMethod("115");
//        session.update(a);

    }

    @Test
    public void QueryTest() {
        String hql = "FROM SaleEntity WHERE Id=2 ";
        try {
            Query query = session.createQuery(hql);
            List results = query.list();
            assertEquals(results.size(), 1);
        } catch (Exception e) {
            throw e;
        }
    }

}
