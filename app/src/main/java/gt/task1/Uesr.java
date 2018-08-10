package gt.task1;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;


@Entity(tableName = "user")
public class Uesr /*implements Serializable*/ {

    @PrimaryKey(autoGenerate = true )
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @ColumnInfo(name = "id")
    private String id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "college")
    private String college;

    @ColumnInfo(name = "speciality")
    private String speciality;

    @ColumnInfo(name = "passWard")
    private String passWard;

    @ColumnInfo(name = "gander")
    private String gander;

    @ColumnInfo(name = "age")
    private String age;

    public Uesr(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Uesr(String id, String name, String college, String speciality, String passWard, String gander, String age) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.speciality = speciality;
        this.passWard = passWard;
        this.gander = gander;
        this.age = age;
    }

    public Uesr() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

