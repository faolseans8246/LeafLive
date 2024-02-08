package org.example.leafview.connectDataBase.repositories;

import org.example.leafview.connectDataBase.Model.HealthyImageTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HealthyLeafRepository extends JpaRepository<HealthyImageTable, Long>, CrudRepository<HealthyImageTable, Long> {
}
