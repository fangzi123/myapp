package com.wdcloud.myapp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wd_user")
public class WdUser implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    private String password;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * qq号
     */
    private String qq;

    /**
     * 用户积分
     */
    private Integer score;

    /**
     * 身份证号码
     */
    private String idcardno;

    /**
     * 学校id
     */
    private String schoolid;

    /**
     * 会员编号，从教与学应用获得
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 用户类型：0:后台自建用户，1:老师，2:学生，3:家长，4:教务管理员，5:教研员
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 头像路径
     */
    @Column(name = "face_pic")
    private String facePic;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Integer loginCount;

    /**
     * 注册IP
     */
    @Column(name = "reg_ip")
    private Long regIp;

    /**
     * 注册时间
     */
    @Column(name = "reg_time")
    private Date regTime;

    /**
     * 最后登录IP
     */
    @Column(name = "last_login_ip")
    private Long lastLoginIp;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 是否导入用户
     */
    @Column(name = "is_import")
    private Integer isImport;

    /**
     * 会员状态
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户姓名
     *
     * @return username - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取qq号
     *
     * @return qq - qq号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq号
     *
     * @param qq qq号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取用户积分
     *
     * @return score - 用户积分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置用户积分
     *
     * @param score 用户积分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取身份证号码
     *
     * @return idcardno - 身份证号码
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * 设置身份证号码
     *
     * @param idcardno 身份证号码
     */
    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    /**
     * 获取学校id
     *
     * @return schoolid - 学校id
     */
    public String getSchoolid() {
        return schoolid;
    }

    /**
     * 设置学校id
     *
     * @param schoolid 学校id
     */
    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取会员编号，从教与学应用获得
     *
     * @return login_id - 会员编号，从教与学应用获得
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置会员编号，从教与学应用获得
     *
     * @param loginId 会员编号，从教与学应用获得
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取用户类型：0:后台自建用户，1:老师，2:学生，3:家长，4:教务管理员，5:教研员
     *
     * @return user_type - 用户类型：0:后台自建用户，1:老师，2:学生，3:家长，4:教务管理员，5:教研员
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型：0:后台自建用户，1:老师，2:学生，3:家长，4:教务管理员，5:教研员
     *
     * @param userType 用户类型：0:后台自建用户，1:老师，2:学生，3:家长，4:教务管理员，5:教研员
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取头像路径
     *
     * @return face_pic - 头像路径
     */
    public String getFacePic() {
        return facePic;
    }

    /**
     * 设置头像路径
     *
     * @param facePic 头像路径
     */
    public void setFacePic(String facePic) {
        this.facePic = facePic;
    }

    /**
     * 获取登录次数
     *
     * @return login_count - 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取注册IP
     *
     * @return reg_ip - 注册IP
     */
    public Long getRegIp() {
        return regIp;
    }

    /**
     * 设置注册IP
     *
     * @param regIp 注册IP
     */
    public void setRegIp(Long regIp) {
        this.regIp = regIp;
    }

    /**
     * 获取注册时间
     *
     * @return reg_time - 注册时间
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime 注册时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取最后登录IP
     *
     * @return last_login_ip - 最后登录IP
     */
    public Long getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastLoginIp 最后登录IP
     */
    public void setLastLoginIp(Long lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取是否导入用户
     *
     * @return is_import - 是否导入用户
     */
    public Integer getIsImport() {
        return isImport;
    }

    /**
     * 设置是否导入用户
     *
     * @param isImport 是否导入用户
     */
    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    /**
     * 获取会员状态
     *
     * @return status - 会员状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置会员状态
     *
     * @param status 会员状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}