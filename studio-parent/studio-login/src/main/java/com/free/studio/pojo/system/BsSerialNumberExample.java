package com.free.studio.pojo.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BsSerialNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsSerialNumberExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIsNull() {
            addCriterion("serial_code is null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIsNotNull() {
            addCriterion("serial_code is not null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeEqualTo(String value) {
            addCriterion("serial_code =", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotEqualTo(String value) {
            addCriterion("serial_code <>", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThan(String value) {
            addCriterion("serial_code >", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("serial_code >=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThan(String value) {
            addCriterion("serial_code <", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThanOrEqualTo(String value) {
            addCriterion("serial_code <=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLike(String value) {
            addCriterion("serial_code like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotLike(String value) {
            addCriterion("serial_code not like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIn(List<String> values) {
            addCriterion("serial_code in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotIn(List<String> values) {
            addCriterion("serial_code not in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeBetween(String value1, String value2) {
            addCriterion("serial_code between", value1, value2, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotBetween(String value1, String value2) {
            addCriterion("serial_code not between", value1, value2, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialFormatIsNull() {
            addCriterion("serial_format is null");
            return (Criteria) this;
        }

        public Criteria andSerialFormatIsNotNull() {
            addCriterion("serial_format is not null");
            return (Criteria) this;
        }

        public Criteria andSerialFormatEqualTo(String value) {
            addCriterion("serial_format =", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatNotEqualTo(String value) {
            addCriterion("serial_format <>", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatGreaterThan(String value) {
            addCriterion("serial_format >", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatGreaterThanOrEqualTo(String value) {
            addCriterion("serial_format >=", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatLessThan(String value) {
            addCriterion("serial_format <", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatLessThanOrEqualTo(String value) {
            addCriterion("serial_format <=", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatLike(String value) {
            addCriterion("serial_format like", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatNotLike(String value) {
            addCriterion("serial_format not like", value, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatIn(List<String> values) {
            addCriterion("serial_format in", values, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatNotIn(List<String> values) {
            addCriterion("serial_format not in", values, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatBetween(String value1, String value2) {
            addCriterion("serial_format between", value1, value2, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andSerialFormatNotBetween(String value1, String value2) {
            addCriterion("serial_format not between", value1, value2, "serialFormat");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNull() {
            addCriterion("date_format is null");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNotNull() {
            addCriterion("date_format is not null");
            return (Criteria) this;
        }

        public Criteria andDateFormatEqualTo(String value) {
            addCriterion("date_format =", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotEqualTo(String value) {
            addCriterion("date_format <>", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThan(String value) {
            addCriterion("date_format >", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThanOrEqualTo(String value) {
            addCriterion("date_format >=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThan(String value) {
            addCriterion("date_format <", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThanOrEqualTo(String value) {
            addCriterion("date_format <=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLike(String value) {
            addCriterion("date_format like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotLike(String value) {
            addCriterion("date_format not like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatIn(List<String> values) {
            addCriterion("date_format in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotIn(List<String> values) {
            addCriterion("date_format not in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatBetween(String value1, String value2) {
            addCriterion("date_format between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotBetween(String value1, String value2) {
            addCriterion("date_format not between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthIsNull() {
            addCriterion("serial_no_length is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthIsNotNull() {
            addCriterion("serial_no_length is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthEqualTo(String value) {
            addCriterion("serial_no_length =", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthNotEqualTo(String value) {
            addCriterion("serial_no_length <>", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthGreaterThan(String value) {
            addCriterion("serial_no_length >", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no_length >=", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthLessThan(String value) {
            addCriterion("serial_no_length <", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthLessThanOrEqualTo(String value) {
            addCriterion("serial_no_length <=", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthLike(String value) {
            addCriterion("serial_no_length like", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthNotLike(String value) {
            addCriterion("serial_no_length not like", value, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthIn(List<String> values) {
            addCriterion("serial_no_length in", values, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthNotIn(List<String> values) {
            addCriterion("serial_no_length not in", values, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthBetween(String value1, String value2) {
            addCriterion("serial_no_length between", value1, value2, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andSerialNoLengthNotBetween(String value1, String value2) {
            addCriterion("serial_no_length not between", value1, value2, "serialNoLength");
            return (Criteria) this;
        }

        public Criteria andCurNoIsNull() {
            addCriterion("cur_no is null");
            return (Criteria) this;
        }

        public Criteria andCurNoIsNotNull() {
            addCriterion("cur_no is not null");
            return (Criteria) this;
        }

        public Criteria andCurNoEqualTo(Integer value) {
            addCriterion("cur_no =", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoNotEqualTo(Integer value) {
            addCriterion("cur_no <>", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoGreaterThan(Integer value) {
            addCriterion("cur_no >", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_no >=", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoLessThan(Integer value) {
            addCriterion("cur_no <", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoLessThanOrEqualTo(Integer value) {
            addCriterion("cur_no <=", value, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoIn(List<Integer> values) {
            addCriterion("cur_no in", values, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoNotIn(List<Integer> values) {
            addCriterion("cur_no not in", values, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoBetween(Integer value1, Integer value2) {
            addCriterion("cur_no between", value1, value2, "curNo");
            return (Criteria) this;
        }

        public Criteria andCurNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_no not between", value1, value2, "curNo");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNull() {
            addCriterion("enterprise_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNotNull() {
            addCriterion("enterprise_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeEqualTo(String value) {
            addCriterion("enterprise_code =", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotEqualTo(String value) {
            addCriterion("enterprise_code <>", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThan(String value) {
            addCriterion("enterprise_code >", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_code >=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThan(String value) {
            addCriterion("enterprise_code <", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_code <=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLike(String value) {
            addCriterion("enterprise_code like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotLike(String value) {
            addCriterion("enterprise_code not like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIn(List<String> values) {
            addCriterion("enterprise_code in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotIn(List<String> values) {
            addCriterion("enterprise_code not in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeBetween(String value1, String value2) {
            addCriterion("enterprise_code between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_code not between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("department_code not between", value1, value2, "departmentCode");
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