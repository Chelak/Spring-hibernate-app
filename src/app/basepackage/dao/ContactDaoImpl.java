package app.basepackage.dao;

import app.basepackage.domain.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 7/26/2015.
 */
@Repository("contactDao")
@Transactional
public class ContactDaoImpl implements ContactDAO
{
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        Session session = this.sessionFactory.openSession();
        List <Contact> contacts = sessionFactory.getCurrentSession().createCriteria("from Contact").list();
        session.close();
        return  contacts;

    }

    @Override
    public List<Contact> findAllWithDetail() {
        return null;
    }

    @Override
    public Contact findById(Long id) {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public void delete(Contact contact) {

    }
}
