package co.com.claro.marcacion301.dao;

import co.com.claro.marcacion301.entity.*;
import lombok.NoArgsConstructor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
@NoArgsConstructor
public class ParametrosDao extends AbstractDao<Parametros> {

    private EntityManager entityManager;

    public ParametrosDao(EntityManager entityManager){
        super(Parametros.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public EntityManager setEntityManager(){
        return this.entityManager;
    }
}
