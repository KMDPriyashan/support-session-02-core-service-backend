package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.ItemDTO;
import org.example.Services.ItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public class ItemController {

    ItemService service;
    @PostMapping("/add-item")
    public boolean addItem(@RequestBody ItemDTO itemDTO){
        return service.addItem(itemDTO);
    }
    public List<ItemDTO> getAllItem(){
        List<ItemDTO> allItem = service.getAllItem();
        return allItem;

    }
    public ItemDTO searchById(Integer id){
        return service.searchById(id);

    }
    public boolean deleteById(Integer id){
        return service.deleteById(id);

    }
}
