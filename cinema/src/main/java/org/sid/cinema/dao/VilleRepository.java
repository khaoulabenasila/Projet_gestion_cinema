package org.sid.cinema.dao;

import org.sid.cinema.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource //Toutes les methodes héritées du JpaRepository sont accessibles via REST API
public interface VilleRepository extends JpaRepository<Ville,Long>{

}
