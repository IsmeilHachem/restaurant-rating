package co.grandcircus.restaurantratingrab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.restaurantratingrab.entity.Restaurant;

@Repository
@Transactional
public class RestaurantDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Restaurant> findAll(){
		return em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
	}
	
//	public void upRate(long id) {
//		Restaurant item = em.getReference(Restaurant.class, id);
//		em.merge(item);
//	}
//	
//	public void downRate(long id) {
//		Restaurant item = em.getReference(Restaurant.class, id);
//		em.merge(item);
//	}
	
}
