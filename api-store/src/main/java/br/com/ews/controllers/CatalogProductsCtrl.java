package br.com.ews.controllers;

import br.com.ews.domain.Catalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by wallace on 07/03/17.
 *
 * http://localhost:8084/catalogs
 */
@RestController
@RequestMapping("/catalogs")
public class CatalogProductsCtrl {

    Logger log = LoggerFactory.getLogger(CatalogProductsCtrl.class);

    @RequestMapping(method = RequestMethod.GET)
    Collection<Catalog> catalogs() {
        log.info("CatalogProductsCtrl.readCatalogs");
        Collection<Catalog> catalogs = new ArrayList<>();
        catalogs.add(new Catalog("Mouse", "23.98"));
        catalogs.add(new Catalog("Monitor", "44.50"));
        catalogs.add(new Catalog("Keyboard", "234.89"));
        catalogs.add(new Catalog("Eraser", "10.00"));
        catalogs.add(new Catalog("Memory", "299.78"));
        catalogs.add(new Catalog("CPU", "67.00"));
        catalogs.add(new Catalog("CD", "23.00"));
        catalogs.add(new Catalog("DVD", "98.00"));
        catalogs.add(new Catalog("Calculator", "23.00"));
        System.out.println(catalogs);
        return catalogs;
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Catalog catalog) {
        log.info("CatalogProductsCtrl.add");
        log.info(catalog.toString());
        return ResponseEntity.ok("OK! Sucess");
    }

    @RequestMapping(method = RequestMethod.PUT)
    ResponseEntity<?> update(@RequestBody Catalog catalog) {
        log.info("CatalogProductsCtrl.update");
        log.info(catalog.toString());
        return ResponseEntity.ok("OK! Sucess");
    }

}