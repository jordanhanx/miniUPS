package edu.duke.ece568.sp.miniups.service;

import edu.duke.ece568.sp.miniups.model.Truck;
import edu.duke.ece568.sp.miniups.model.Warehouse;
import edu.duke.ece568.sp.miniups.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WarehouseService {

    @Autowired
    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }


    public void createWarehouse(Warehouse warehouse) {
//        Warehouse warehouse = new Warehouse(5,7);
        warehouseRepository.save(warehouse);

    }
}