/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Dreizehn
 */
public class crud {
    public static boolean insert(Mhs m){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.save(m);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            return false;
        }
    }
    public static boolean update(Mhs m){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.update(m);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            return false;
        }
    }
    public static boolean delete(Mhs m){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.delete(m);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            return false;
        }
    }
    public static List<Mhs> select(){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        List<Mhs> mhs = new ArrayList<>();
        try {
            s.beginTransaction();
            mhs = s.createQuery("From Mhs").list();
        } catch (Exception e) {
        }
        return mhs;
    }
    
    public static void main(String[] args) {
        crud c = new crud();
        Mhs m = new Mhs("1004", "power ranger", "ada", "homeless");
        List<Mhs> list = select();
        List l=new ArrayList();
        for (Mhs mhs : list) {
            l.add(mhs.getStb());
            l.add(mhs.getNama());
            l.add(mhs.getKet());
            l.add(mhs.getAlamat());
        }
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
