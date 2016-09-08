package com.example.icst;

import org.greenrobot.greendao.annotation.*;

import com.example.icst.dao.DaoSession;
import org.greenrobot.greendao.DaoException;

import com.example.icst.dao.StudentDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "STUDENT".
 */
@Entity(active = true)
public class Student {

    @Id
    private long id;

    @NotNull
    private String Name;
    private boolean Gender;
    private String Photo;
    private Integer College;
    private String Major;

    @NotNull
    private String Phone;
    private String PhoneShort;
    private String QQ;
    private String Wechat;
    private String Dorm;
    private boolean Adjust;
    private int Wish1;
    private int Wish2;
    private String Note;
    private Boolean Noticed;
    private Boolean Deleted;
    private Boolean Signed;
    private Integer Accepted;
    private long groupId;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient StudentDao myDao;

    // KEEP FIELDS - put your custom fields here
    public String respond;
    // KEEP FIELDS END

    @Generated
    public Student() {
    }

    public Student(long id) {
        this.id = id;
    }

    @Generated
    public Student(long id, String Name, boolean Gender, String Photo, Integer College, String Major, String Phone, String PhoneShort, String QQ, String Wechat, String Dorm, boolean Adjust, int Wish1, int Wish2, String Note, Boolean Noticed, Boolean Deleted, Boolean Signed, Integer Accepted, long groupId) {
        this.id = id;
        this.Name = Name;
        this.Gender = Gender;
        this.Photo = Photo;
        this.College = College;
        this.Major = Major;
        this.Phone = Phone;
        this.PhoneShort = PhoneShort;
        this.QQ = QQ;
        this.Wechat = Wechat;
        this.Dorm = Dorm;
        this.Adjust = Adjust;
        this.Wish1 = Wish1;
        this.Wish2 = Wish2;
        this.Note = Note;
        this.Noticed = Noticed;
        this.Deleted = Deleted;
        this.Signed = Signed;
        this.Accepted = Accepted;
        this.groupId = groupId;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getStudentDao() : null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return Name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(@NotNull String Name) {
        this.Name = Name;
    }

    public boolean getGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public Integer getCollege() {
        return College;
    }

    public void setCollege(Integer College) {
        this.College = College;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    @NotNull
    public String getPhone() {
        return Phone;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPhone(@NotNull String Phone) {
        this.Phone = Phone;
    }

    public String getPhoneShort() {
        return PhoneShort;
    }

    public void setPhoneShort(String PhoneShort) {
        this.PhoneShort = PhoneShort;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWechat() {
        return Wechat;
    }

    public void setWechat(String Wechat) {
        this.Wechat = Wechat;
    }

    public String getDorm() {
        return Dorm;
    }

    public void setDorm(String Dorm) {
        this.Dorm = Dorm;
    }

    public boolean getAdjust() {
        return Adjust;
    }

    public void setAdjust(boolean Adjust) {
        this.Adjust = Adjust;
    }

    public int getWish1() {
        return Wish1;
    }

    public void setWish1(int Wish1) {
        this.Wish1 = Wish1;
    }

    public int getWish2() {
        return Wish2;
    }

    public void setWish2(int Wish2) {
        this.Wish2 = Wish2;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Boolean getNoticed() {
        return Noticed;
    }

    public void setNoticed(Boolean Noticed) {
        this.Noticed = Noticed;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    public Boolean getSigned() {
        return Signed;
    }

    public void setSigned(Boolean Signed) {
        this.Signed = Signed;
    }

    public Integer getAccepted() {
        return Accepted;
    }

    public void setAccepted(Integer Accepted) {
        this.Accepted = Accepted;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    public Student(long id,
                   String Name,
                   boolean Gender,
                   String Photo,
                   Integer College,
                   String Major,
                   String Phone,
                   String PhoneShort,
                   String QQ,
                   String Wechat,
                   String Dorm,
                   boolean Adjust,
                   int Wish1,
                   int Wish2,
                   String Note,
                   long groupId) {
        this.id = id;
        this.Name = Name;
        this.Gender = Gender;
        this.Photo = Photo;
        this.College = College;
        this.Major = Major;
        this.Phone = Phone;
        this.PhoneShort = PhoneShort;
        this.QQ = QQ;
        this.Wechat = Wechat;
        this.Dorm = Dorm;
        this.Adjust = Adjust;
        this.Wish1 = Wish1;
        this.Wish2 = Wish2;
        this.Note = Note;
        this.Noticed = false;
        this.Deleted = false;
        this.Signed = false;
        this.Accepted = 0;
        this.groupId = groupId;
        this.respond = "正在读取...";
    }

    public boolean changeSign() {
        Signed = !Signed;
        update();
        return Signed;
    }

    public int changeAccept() {
        if (Accepted < 10) Accepted += 10;
        else Accepted -= 10;
        update();
        return Accepted;
    }

    public void acceptWish1() {
        Accepted = Wish1;
    }


    public void acceptWish2() {
        Accepted = Wish2;
    }
    // KEEP METHODS END

}
