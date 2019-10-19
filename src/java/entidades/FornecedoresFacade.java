/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author João Victor
 */
@Stateless
public class FornecedoresFacade extends AbstractFacade<Fornecedores> {

    @PersistenceContext(unitName = "NewSmartStoragePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FornecedoresFacade() {
        super(Fornecedores.class);
    }
    
}
