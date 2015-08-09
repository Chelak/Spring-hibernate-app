package app.basepackage;

import app.basepackage.dao.ContactDAO;
import app.basepackage.dao.ContactDaoImpl;
import app.basepackage.domain.Contact;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by user on 7/26/2015.
 */
public class Test
{
    public static void main(String[] args)
    {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();
        ContactDAO contactDao = ctx.getBean("contactDao", ContactDAO.class);
        List<Contact> contacts = contactDao.findAll();
        listContacts(contacts);
    }
    private static void listContacts(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts without details:");
        for (Contact contact: contacts) {
            System.out.println(contact);
            System.out.println();
        }
    }
}
