package com.today25.catalogservice.repository;

import com.today25.catalogservice.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

    CatalogEntity findByProductId(String productId);
}
