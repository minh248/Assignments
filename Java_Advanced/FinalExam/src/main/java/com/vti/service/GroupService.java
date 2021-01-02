package com.vti.service;

import com.vti.entity.Group;
import com.vti.repository.IGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService implements IGroupService{
    @Autowired
    private IGroupRepository repository;

    @Override
    public List<Group> getAllGroups() {
        return repository.findAll();
    }

    @Override
    public Group getGroupByID(short id) {
        return repository.findById(id).get();
    }

    @Override
    public Group getGroupByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void createGroup(Group group) {
        repository.save(group);
    }

    @Override
    public void updateGroup(Group group) {
        repository.save(group);
    }

    @Override
    public void deleteGroup(short id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteGroupByIds(List<Short> ids) {
        // unused
    }

    @Override
    public boolean isGroupExistsByID(short id) {
        return repository.existsById(id);
    }

    @Override
    public boolean isGroupExistsByName(String name) {
        return repository.existsByName(name);
    }
}
