package com.itcast.tpms.model;

import java.util.Date;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.credit
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Integer credit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.class_hour
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Integer classHour;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.type
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.teacher_id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.gmt_created
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.gmt_modified
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.credit
     *
     * @return the value of course.credit
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.credit
     *
     * @param credit the value for course.credit
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.class_hour
     *
     * @return the value of course.class_hour
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Integer getClassHour() {
        return classHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.class_hour
     *
     * @param classHour the value for course.class_hour
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.type
     *
     * @return the value of course.type
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.type
     *
     * @param type the value for course.type
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.teacher_id
     *
     * @return the value of course.teacher_id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.teacher_id
     *
     * @param teacherId the value for course.teacher_id
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.gmt_created
     *
     * @return the value of course.gmt_created
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.gmt_created
     *
     * @param gmtCreated the value for course.gmt_created
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.gmt_modified
     *
     * @return the value of course.gmt_modified
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.gmt_modified
     *
     * @param gmtModified the value for course.gmt_modified
     *
     * @mbg.generated Wed Feb 19 15:45:36 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}