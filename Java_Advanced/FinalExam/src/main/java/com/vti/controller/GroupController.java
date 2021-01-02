package com.vti.controller;

import com.vti.entity.Group;
import com.vti.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/group")
@CrossOrigin(origins = "*")
public class GroupController {
    @Autowired
    private IGroupService service;

    @GetMapping
    public List<Group> getAllGroup(){
        return service.getAllGroups();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getGroupByID(@PathVariable(name = "id") short id) throws Exception {

        if (service.isGroupExistsByID(id) == false) {
            throw new Exception("wrong Id");
        }

        return new ResponseEntity<Group>(service.getGroupByID(id), HttpStatus.OK);
    }

    @PostMapping
    public void creatGroup(@RequestBody Group group){
        service.createGroup(group);
    }

    @PutMapping(value = "/{id}")
    public void updateGroup(@PathVariable(name = "id") short id, @RequestBody Group group){
        Group gr = service.getGroupByID(id);
        gr.setName(group.getName());
        gr.setMember(group.getMember());
        gr.setCreator(group.getCreator());
        gr.setCreateDate(group.getCreateDate());

        service.updateGroup(gr);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGroup(@PathVariable(name = "id") short id){
        service.deleteGroup(id);
    }
}
