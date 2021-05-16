package DAO;

import DAO.impl.*;
import obiekty.Lista_chorob;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("appJavaFXUnit");

    public static WyposazenieDAO createWyposazenieDao() {
        return new WyposazenieDAOJpa(emf.createEntityManager());
    }

    public static PracownikDAO createPracownikDao() {
        return new PracownikDAOJpa(emf.createEntityManager());
    }
    public static SlotyDAO createSlotyDao() {
        return new SlotyDAOJpa(emf.createEntityManager());
    }
    public static RolaDAO createRolaDao() {
        return new RolaDAOJpa(emf.createEntityManager());
    }
    public static Lista_chorobDAO createLista_chorobDao() { return new Lista_chorobDAOJpa(emf.createEntityManager());}
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

}
