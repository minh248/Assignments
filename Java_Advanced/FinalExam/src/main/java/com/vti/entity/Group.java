package com.vti.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "`group`", catalog = "crud")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`member`")
    private int member;

    @Column(name = "creator")
    private String creator;

    @Column(name = "create_date")
    private LocalDate createDate;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", member=" + member +
                ", creator='" + creator + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
