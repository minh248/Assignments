package com.vti.service;

import com.vti.entity.Group;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IGroupService {
    public List<Group> getAllGroups();

    public Group getGroupByID(short id);

    public Group getGroupByName(String name);

    public void createGroup(Group group);

    public void updateGroup(Group group);

    public void deleteGroup(short id);

    public void deleteGroupByIds(List<Short> ids);

    public boolean isGroupExistsByID(short id);

    public boolean isGroupExistsByName(String name);
}
