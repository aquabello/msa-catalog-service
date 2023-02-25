package com.today25.catalogservice.service;

import com.today25.catalogservice.entity.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
