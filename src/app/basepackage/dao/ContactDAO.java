package app.basepackage.dao;

import app.basepackage.domain.Contact;

import java.util.List;

/**
 * Created by user on 7/26/2015.
 */
public interface ContactDAO {

    // ????? ??? ????????.
    public List<Contact> findAll();

    // ????? ??? ???????? ? ???????? ????????? ? ?????.
    public List<Contact> findAllWithDetail();

    // ????? ??????? ?? ????? ???????? ?? ??????????????.
    public Contact findById(Long id);

    // ???????? ??? ???????? ???????.
    public Contact save(Contact contact);

    // ??????? ???????.
    public void delete(Contact contact);


}