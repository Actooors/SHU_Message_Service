package com.shu.message.model.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNull() {
            addCriterion("big_img is null");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNotNull() {
            addCriterion("big_img is not null");
            return (Criteria) this;
        }

        public Criteria andBigImgEqualTo(String value) {
            addCriterion("big_img =", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotEqualTo(String value) {
            addCriterion("big_img <>", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThan(String value) {
            addCriterion("big_img >", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("big_img >=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThan(String value) {
            addCriterion("big_img <", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThanOrEqualTo(String value) {
            addCriterion("big_img <=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLike(String value) {
            addCriterion("big_img like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotLike(String value) {
            addCriterion("big_img not like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIn(List<String> values) {
            addCriterion("big_img in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotIn(List<String> values) {
            addCriterion("big_img not in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgBetween(String value1, String value2) {
            addCriterion("big_img between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotBetween(String value1, String value2) {
            addCriterion("big_img not between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andFollowMeIsNull() {
            addCriterion("follow_me is null");
            return (Criteria) this;
        }

        public Criteria andFollowMeIsNotNull() {
            addCriterion("follow_me is not null");
            return (Criteria) this;
        }

        public Criteria andFollowMeEqualTo(Integer value) {
            addCriterion("follow_me =", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeNotEqualTo(Integer value) {
            addCriterion("follow_me <>", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeGreaterThan(Integer value) {
            addCriterion("follow_me >", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_me >=", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeLessThan(Integer value) {
            addCriterion("follow_me <", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeLessThanOrEqualTo(Integer value) {
            addCriterion("follow_me <=", value, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeIn(List<Integer> values) {
            addCriterion("follow_me in", values, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeNotIn(List<Integer> values) {
            addCriterion("follow_me not in", values, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeBetween(Integer value1, Integer value2) {
            addCriterion("follow_me between", value1, value2, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowMeNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_me not between", value1, value2, "followMe");
            return (Criteria) this;
        }

        public Criteria andFollowOthersIsNull() {
            addCriterion("follow_others is null");
            return (Criteria) this;
        }

        public Criteria andFollowOthersIsNotNull() {
            addCriterion("follow_others is not null");
            return (Criteria) this;
        }

        public Criteria andFollowOthersEqualTo(Integer value) {
            addCriterion("follow_others =", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersNotEqualTo(Integer value) {
            addCriterion("follow_others <>", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersGreaterThan(Integer value) {
            addCriterion("follow_others >", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_others >=", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersLessThan(Integer value) {
            addCriterion("follow_others <", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersLessThanOrEqualTo(Integer value) {
            addCriterion("follow_others <=", value, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersIn(List<Integer> values) {
            addCriterion("follow_others in", values, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersNotIn(List<Integer> values) {
            addCriterion("follow_others not in", values, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersBetween(Integer value1, Integer value2) {
            addCriterion("follow_others between", value1, value2, "followOthers");
            return (Criteria) this;
        }

        public Criteria andFollowOthersNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_others not between", value1, value2, "followOthers");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumIsNull() {
            addCriterion("join_group_num is null");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumIsNotNull() {
            addCriterion("join_group_num is not null");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumEqualTo(Integer value) {
            addCriterion("join_group_num =", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumNotEqualTo(Integer value) {
            addCriterion("join_group_num <>", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumGreaterThan(Integer value) {
            addCriterion("join_group_num >", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_group_num >=", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumLessThan(Integer value) {
            addCriterion("join_group_num <", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumLessThanOrEqualTo(Integer value) {
            addCriterion("join_group_num <=", value, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumIn(List<Integer> values) {
            addCriterion("join_group_num in", values, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumNotIn(List<Integer> values) {
            addCriterion("join_group_num not in", values, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumBetween(Integer value1, Integer value2) {
            addCriterion("join_group_num between", value1, value2, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andJoinGroupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("join_group_num not between", value1, value2, "joinGroupNum");
            return (Criteria) this;
        }

        public Criteria andConcernGroupIsNull() {
            addCriterion("concern_group is null");
            return (Criteria) this;
        }

        public Criteria andConcernGroupIsNotNull() {
            addCriterion("concern_group is not null");
            return (Criteria) this;
        }

        public Criteria andConcernGroupEqualTo(Integer value) {
            addCriterion("concern_group =", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupNotEqualTo(Integer value) {
            addCriterion("concern_group <>", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupGreaterThan(Integer value) {
            addCriterion("concern_group >", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("concern_group >=", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupLessThan(Integer value) {
            addCriterion("concern_group <", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupLessThanOrEqualTo(Integer value) {
            addCriterion("concern_group <=", value, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupIn(List<Integer> values) {
            addCriterion("concern_group in", values, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupNotIn(List<Integer> values) {
            addCriterion("concern_group not in", values, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupBetween(Integer value1, Integer value2) {
            addCriterion("concern_group between", value1, value2, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andConcernGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("concern_group not between", value1, value2, "concernGroup");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelIsNull() {
            addCriterion("personal_label is null");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelIsNotNull() {
            addCriterion("personal_label is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelEqualTo(String value) {
            addCriterion("personal_label =", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelNotEqualTo(String value) {
            addCriterion("personal_label <>", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelGreaterThan(String value) {
            addCriterion("personal_label >", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelGreaterThanOrEqualTo(String value) {
            addCriterion("personal_label >=", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelLessThan(String value) {
            addCriterion("personal_label <", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelLessThanOrEqualTo(String value) {
            addCriterion("personal_label <=", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelLike(String value) {
            addCriterion("personal_label like", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelNotLike(String value) {
            addCriterion("personal_label not like", value, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelIn(List<String> values) {
            addCriterion("personal_label in", values, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelNotIn(List<String> values) {
            addCriterion("personal_label not in", values, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelBetween(String value1, String value2) {
            addCriterion("personal_label between", value1, value2, "personalLabel");
            return (Criteria) this;
        }

        public Criteria andPersonalLabelNotBetween(String value1, String value2) {
            addCriterion("personal_label not between", value1, value2, "personalLabel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}