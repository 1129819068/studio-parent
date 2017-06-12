/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : studio

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-06-12 14:47:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bs_business_info`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_info`;
CREATE TABLE `bs_business_info` (
  `business_id` varchar(32) NOT NULL COMMENT '企业编号',
  `business_name` varchar(32) DEFAULT NULL COMMENT '企业名称',
  `belong_area` varchar(32) DEFAULT NULL COMMENT '所属辖区',
  `tax_authority` varchar(32) DEFAULT NULL COMMENT '企业所得税主管税务机关',
  `juridical_person` varchar(12) DEFAULT NULL COMMENT '法人代表',
  `tel` varchar(12) DEFAULT NULL COMMENT '联系电话号码',
  `register_address` varchar(100) DEFAULT NULL COMMENT '企业注册地址',
  `register_fund` int(11) DEFAULT NULL COMMENT '企业注册资金',
  `register_time` date DEFAULT NULL COMMENT '企业注册时间',
  `organization_type` int(11) DEFAULT NULL COMMENT '组织形式,0:国有控股，1：股份有限，2：有限责任，3：中外合资，4：外商独资',
  `organization_code` varchar(32) DEFAULT NULL COMMENT '组织机构代码',
  `logo_url` varchar(100) DEFAULT NULL COMMENT '企业logo信息图片地址',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`business_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录企业的信息';

-- ----------------------------
-- Records of bs_business_info
-- ----------------------------
INSERT INTO `bs_business_info` VALUES ('BS20170612000001', '自由工作室', '厦门市', null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `bs_button`
-- ----------------------------
DROP TABLE IF EXISTS `bs_button`;
CREATE TABLE `bs_button` (
  `button_id` varchar(32) NOT NULL COMMENT '按钮编号，唯一性',
  `tab_id` varchar(32) NOT NULL COMMENT 'tab编号，外键',
  `name` varchar(12) DEFAULT NULL COMMENT '名称',
  `value` varchar(32) DEFAULT NULL COMMENT '值',
  `css` varchar(32) DEFAULT NULL COMMENT '样式',
  `image` varchar(50) DEFAULT NULL COMMENT '图标',
  `tip` varchar(50) DEFAULT NULL COMMENT '按钮提示信息',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`button_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='按钮表';

-- ----------------------------
-- Records of bs_button
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_department_info`
-- ----------------------------
DROP TABLE IF EXISTS `bs_department_info`;
CREATE TABLE `bs_department_info` (
  `department_id` varchar(32) NOT NULL COMMENT '部门编号，逻辑主键',
  `business_id` varchar(32) NOT NULL COMMENT '企业编号',
  `department_name` varchar(32) DEFAULT NULL COMMENT '部门名称',
  `department_describe` varchar(100) DEFAULT NULL COMMENT '部门描述',
  `status` varchar(8) DEFAULT NULL COMMENT '启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- ----------------------------
-- Records of bs_department_info
-- ----------------------------
INSERT INTO `bs_department_info` VALUES ('DP20170612000001', 'BS20170612000001', '技术部', null, 'YES', null, '2017-06-12 14:13:14', null, '2017-06-12 14:13:14', null);

-- ----------------------------
-- Table structure for `bs_group_rp_role`
-- ----------------------------
DROP TABLE IF EXISTS `bs_group_rp_role`;
CREATE TABLE `bs_group_rp_role` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键',
  `group_id` varchar(32) NOT NULL COMMENT '用户组编号',
  `role_id` varchar(32) NOT NULL COMMENT '角色编号',
  `status` varchar(8) DEFAULT NULL COMMENT '用户组启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组与角色关联关系表';

-- ----------------------------
-- Records of bs_group_rp_role
-- ----------------------------
INSERT INTO `bs_group_rp_role` VALUES ('1', 'UG20170612000001', 'RL20170612000001', 'YES', null, '2017-06-12 14:22:26', null, '2017-06-12 14:22:26', null);

-- ----------------------------
-- Table structure for `bs_menu`
-- ----------------------------
DROP TABLE IF EXISTS `bs_menu`;
CREATE TABLE `bs_menu` (
  `menu_id` varchar(32) NOT NULL COMMENT '菜单编号，逻辑主键',
  `parent_menu_id` varchar(32) NOT NULL COMMENT '父级菜单编号，若为顶级菜单，则为0',
  `menu_name` varchar(18) DEFAULT NULL COMMENT '菜单名称',
  `is_leaf` varchar(8) DEFAULT NULL COMMENT '是否为叶子菜单，YES：是，NO不为叶子菜单',
  `menu_url` varchar(100) DEFAULT NULL COMMENT '菜单连接地址',
  `menu_image` varchar(100) DEFAULT NULL COMMENT '菜单图片连接地址',
  `css` varchar(32) DEFAULT NULL COMMENT '菜单样式',
  `menu_tip` varchar(32) DEFAULT NULL COMMENT '菜单提示信息',
  `status` varchar(8) DEFAULT NULL COMMENT '用户组启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单信息表';

-- ----------------------------
-- Records of bs_menu
-- ----------------------------
INSERT INTO `bs_menu` VALUES ('MU20170612000001', '0', '系统管理', 'NO', null, null, null, null, 'YES', null, '2017-06-12 14:30:54', null, '2017-06-12 14:30:54', null);
INSERT INTO `bs_menu` VALUES ('MU201706120000010', 'MU20170612000008', '菜单配置', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:46:29', null, '2017-06-12 14:46:29', null);
INSERT INTO `bs_menu` VALUES ('MU201706120000011', 'MU20170612000001', '系统日志', 'NO', null, null, null, null, 'YES', null, '2017-06-12 14:46:29', null, '2017-06-12 14:46:29', null);
INSERT INTO `bs_menu` VALUES ('MU201706120000012', 'MU201706120000011', '日志信息', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:46:29', null, '2017-06-12 14:46:29', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000002', 'MU20170612000001', '权限管理', 'NO', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000003', 'MU20170612000002', '用户管理', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000004', 'MU20170612000002', '用户组管理', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000005', 'MU20170612000002', '角色管理', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000006', 'MU20170612000002', '标签页管理', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000007', 'MU20170612000002', '按钮管理', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:41:08', null, '2017-06-12 14:41:08', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000008', 'MU20170612000001', '系统设置', 'NO', null, null, null, null, 'YES', null, '2017-06-12 14:46:29', null, '2017-06-12 14:46:29', null);
INSERT INTO `bs_menu` VALUES ('MU20170612000009', 'MU20170612000008', '信息设置', 'YES', null, null, null, null, 'YES', null, '2017-06-12 14:46:29', null, '2017-06-12 14:46:29', null);

-- ----------------------------
-- Table structure for `bs_role`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role`;
CREATE TABLE `bs_role` (
  `role_id` varchar(32) NOT NULL COMMENT '角色编号，逻辑主键',
  `role_name` varchar(32) NOT NULL COMMENT '角色名称',
  `role_type` varchar(12) DEFAULT NULL COMMENT '角色类型；PLATFORM-平台角色，SYSTEM-系统角色',
  `status` varchar(8) DEFAULT NULL COMMENT '用户组启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `system_id` varchar(32) NOT NULL COMMENT '系统编号',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息表';

-- ----------------------------
-- Records of bs_role
-- ----------------------------
INSERT INTO `bs_role` VALUES ('RL20170612000001', '系统管理角色', null, 'YES', null, '2017-06-12 14:20:46', null, '2017-06-12 14:20:46', null, 'SS20170612000001');

-- ----------------------------
-- Table structure for `bs_role_rp_button`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role_rp_button`;
CREATE TABLE `bs_role_rp_button` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键，唯一索引',
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色编号，外键',
  `button_id` varchar(32) DEFAULT NULL COMMENT '按钮编号，外键',
  `menu_id` varchar(32) DEFAULT NULL COMMENT '冗余字段',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与按钮关系';

-- ----------------------------
-- Records of bs_role_rp_button
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_role_rp_menu`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role_rp_menu`;
CREATE TABLE `bs_role_rp_menu` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键',
  `role_id` varchar(32) NOT NULL COMMENT '角色编号',
  `menu_id` varchar(32) NOT NULL COMMENT '菜单编号',
  `status` varchar(8) DEFAULT NULL COMMENT '用户组启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与菜单关系表';

-- ----------------------------
-- Records of bs_role_rp_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_role_rp_tab`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role_rp_tab`;
CREATE TABLE `bs_role_rp_tab` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键，唯一索引',
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色编号，外键',
  `tab_id` varchar(32) DEFAULT NULL COMMENT 'tab编号，外键',
  `menu_id` varchar(32) DEFAULT NULL COMMENT '冗余字段',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与tab关系';

-- ----------------------------
-- Records of bs_role_rp_tab
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_serial_number`
-- ----------------------------
DROP TABLE IF EXISTS `bs_serial_number`;
CREATE TABLE `bs_serial_number` (
  `pid` int(12) NOT NULL COMMENT '逻辑主键',
  `serial_code` varchar(50) DEFAULT NULL COMMENT '流水号编码，如：运单流水号 SHIPMENT_ORDER_NO',
  `serial_format` varchar(100) DEFAULT NULL COMMENT '流水号格式，如：{PARAMS(SO)}{DATE(yyyyMMDD)}{NO(4)}',
  `prefix` varchar(20) DEFAULT NULL COMMENT '前缀，如运单：SO',
  `date_format` varchar(30) DEFAULT NULL COMMENT '日期格式',
  `serial_no_length` varchar(10) DEFAULT NULL COMMENT '流水号长度',
  `cur_no` int(8) DEFAULT NULL COMMENT '当前流水号',
  `creator` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modifier` varchar(50) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `enterprise_code` varchar(50) DEFAULT NULL COMMENT '企业',
  `department_code` varchar(50) DEFAULT NULL COMMENT '部门',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='自定义编号';

-- ----------------------------
-- Records of bs_serial_number
-- ----------------------------
INSERT INTO `bs_serial_number` VALUES ('1', 'PRODUCT_NO', 'PN{DATE(yyyyMMdd)}{NO(6)}', 'PN', 'yyyyMMDD', '', '0', '', '2014-08-08 15:21:19', 'SYS', '2016-03-24 01:00:00', '', '');
INSERT INTO `bs_serial_number` VALUES ('2', 'COMPANY_NO', 'CO{DATE(yyyyMMdd)}{NO(6)}', 'CO', 'yyyyMMDD', null, '0', null, '2014-09-11 00:00:00', 'SYS', '2016-03-24 01:00:00', null, null);
INSERT INTO `bs_serial_number` VALUES ('3', 'CUSTOMER_NO', 'CU{DATE(yyyyMMdd)}{NO(6)}', 'CU', 'yyyyMMDD', null, '0', null, '2014-09-23 16:04:00', 'SYS', '2016-03-24 01:00:00', null, null);
INSERT INTO `bs_serial_number` VALUES ('4', 'TEMPLATE_NO', 'TN{DATE(yyyyMMdd)}{NO(6)}', 'TN', 'yyyyMMDD', null, '0', null, '2014-12-11 11:23:38', 'SYS', '2016-03-24 01:00:00', null, null);
INSERT INTO `bs_serial_number` VALUES ('5', 'SYSTEM_NO', 'SS{DATE(yyyyMMdd)}{NO(6)}', 'SS', 'yyyyMMDD', null, '0', null, '2017-06-12 11:38:09', 'SYS', '2017-06-12 11:38:09', null, null);
INSERT INTO `bs_serial_number` VALUES ('6', 'USER_GROUP_NO', 'UG{DATE(yyyyMMdd)}{NO(6)}', 'UG', 'yyyyMMDD', null, '0', null, '2017-06-12 11:46:39', 'SYS', '2017-06-12 11:46:39', null, null);
INSERT INTO `bs_serial_number` VALUES ('7', 'DEPARTMENT_NO', 'DP{DATE(yyyyMMdd)}{NO(6)}', 'DP', 'yyyyMMDD', null, '0', null, '2017-06-12 11:46:39', 'SYS', '2017-06-12 11:46:39', null, null);
INSERT INTO `bs_serial_number` VALUES ('8', 'BUSINESS_NO', 'BS{DATE(yyyyMMdd)}{NO(6)}', 'BS', 'yyyyMMDD', null, '0', null, '2017-06-12 14:14:33', 'SYS', '2017-06-12 14:14:33', null, null);
INSERT INTO `bs_serial_number` VALUES ('9', 'ROLE_NO', 'RL{DATE(yyyyMMdd)}{NO(6)}', 'RL', 'yyyyMMDD', null, '0', null, '2017-06-12 14:18:53', 'SYS', '2017-06-12 14:18:53', null, null);
INSERT INTO `bs_serial_number` VALUES ('10', 'MENU_NO', 'MU{DATE(yyyyMMdd)}{NO(6)}', 'MU', 'yyyyMMDD', null, '0', null, '2017-06-12 14:28:55', 'SYS', '2017-06-12 14:28:55', null, null);

-- ----------------------------
-- Table structure for `bs_system_info`
-- ----------------------------
DROP TABLE IF EXISTS `bs_system_info`;
CREATE TABLE `bs_system_info` (
  `system_id` varchar(32) NOT NULL COMMENT '系统编号，唯一性校验，逻辑主键',
  `super_name` varchar(32) NOT NULL COMMENT '超级管理员的登录名',
  `super_password` varchar(32) NOT NULL COMMENT '超级管理员的密码',
  `system_abbreviate` varchar(12) DEFAULT NULL COMMENT '系统缩写',
  `company_name` varchar(32) DEFAULT NULL COMMENT '使用者名称',
  `company_logo` varchar(100) DEFAULT NULL COMMENT '使用者logo图像地址',
  `status` varchar(8) DEFAULT NULL COMMENT '启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`system_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统基本信息表';

-- ----------------------------
-- Records of bs_system_info
-- ----------------------------
INSERT INTO `bs_system_info` VALUES ('SS20170612000001', 'super', 'super', 'SYS', 'free.studio.com', null, 'YES', null, '2017-06-12 11:40:39', null, '2017-06-12 11:40:39', null);

-- ----------------------------
-- Table structure for `bs_system_log`
-- ----------------------------
DROP TABLE IF EXISTS `bs_system_log`;
CREATE TABLE `bs_system_log` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键',
  `operate_name` varchar(12) DEFAULT NULL COMMENT '操作名称',
  `operate_person` varchar(32) DEFAULT NULL COMMENT '操作系统的人员',
  `operate_ip` varchar(17) DEFAULT NULL COMMENT '操作人员所处的IP地址',
  `operate_describe` varchar(100) DEFAULT NULL COMMENT '操作描述',
  `create_name` varchar(32) DEFAULT NULL COMMENT '账户创建人',
  `create_time` datetime DEFAULT NULL COMMENT '账户创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `system_id` varchar(32) NOT NULL COMMENT '系统编号',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录系统用户操作系统的操作信息';

-- ----------------------------
-- Records of bs_system_log
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_system_menu`
-- ----------------------------
DROP TABLE IF EXISTS `bs_system_menu`;
CREATE TABLE `bs_system_menu` (
  `pid` varchar(32) NOT NULL COMMENT '逻辑主键',
  `menu_id` varchar(32) NOT NULL COMMENT '菜单编号',
  `status` varchar(8) DEFAULT NULL COMMENT '启用状态，YES，NO',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `system_id` varchar(32) NOT NULL COMMENT '系统编号',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统与菜单的关系表';

-- ----------------------------
-- Records of bs_system_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_tab`
-- ----------------------------
DROP TABLE IF EXISTS `bs_tab`;
CREATE TABLE `bs_tab` (
  `tab_id` varchar(32) NOT NULL COMMENT 'tab编号，唯一性',
  `menu_id` varchar(32) NOT NULL COMMENT '菜单编号，外键',
  `title` varchar(50) DEFAULT NULL COMMENT 'tab页标题',
  `name` varchar(16) DEFAULT NULL COMMENT '名称',
  `css` varchar(32) DEFAULT NULL COMMENT '样式',
  `value` varchar(32) DEFAULT NULL COMMENT '值',
  `image` varchar(50) DEFAULT NULL COMMENT '图标',
  `tip` varchar(32) DEFAULT NULL COMMENT 'tab页提示信息',
  `tab_describe` varchar(50) DEFAULT NULL COMMENT 'tab页描述信息',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='tab页面表';

-- ----------------------------
-- Records of bs_tab
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_user`
-- ----------------------------
DROP TABLE IF EXISTS `bs_user`;
CREATE TABLE `bs_user` (
  `user_name` varchar(32) NOT NULL COMMENT '登录名，逻辑主键',
  `group_id` varchar(32) NOT NULL COMMENT '用户组编号',
  `department_id` varchar(32) DEFAULT NULL COMMENT '部门编号',
  `password` varchar(32) NOT NULL COMMENT '登录密码',
  `true_name` varchar(12) DEFAULT NULL COMMENT '真实姓名',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '昵称',
  `sex` varchar(8) DEFAULT NULL COMMENT '性别，M：男，F：女',
  `card_id` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `job_title` varchar(32) DEFAULT NULL COMMENT '职位名称、级别',
  `qq` varchar(12) DEFAULT NULL COMMENT 'qq号码',
  `wechat` varchar(32) DEFAULT NULL COMMENT '微信账号',
  `skype` varchar(32) DEFAULT NULL COMMENT 'Skype账号',
  `phone` varchar(12) NOT NULL COMMENT '移动电话，唯一校验',
  `telephone` varchar(12) DEFAULT NULL COMMENT '固定电话',
  `email` varchar(32) NOT NULL COMMENT '邮箱地址，唯一校验',
  `user_address` varchar(100) DEFAULT NULL COMMENT '联系地址',
  `post_code` varchar(12) DEFAULT NULL COMMENT '邮政编码',
  `head_image` varchar(100) DEFAULT NULL COMMENT '保存头像地址',
  `qr_code` varchar(100) DEFAULT NULL COMMENT '二维码图像地址',
  `status` varchar(8) DEFAULT NULL COMMENT '启用状态，YES，NO',
  `email_is_verif` varchar(8) DEFAULT NULL COMMENT '邮箱校验状态，YES，NO',
  `user_type` varchar(16) DEFAULT NULL COMMENT '用户类型，PLATFORM-平台用户，SYSTEM-系统用户',
  `login_number` int(11) DEFAULT NULL COMMENT '登录的次数统计',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `password_modify_time` datetime DEFAULT NULL COMMENT '密码修改时间',
  `password_modify_mode` varchar(8) DEFAULT NULL COMMENT '密码修改方式，SELF-自己修改，RESET-重置，CREATE-新建',
  `password_error_number` int(11) DEFAULT NULL COMMENT '密码错误次数',
  `user_lock_time` datetime DEFAULT NULL COMMENT '账户锁定时间',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录用户的信息';

-- ----------------------------
-- Records of bs_user
-- ----------------------------
INSERT INTO `bs_user` VALUES ('admin', 'UG20170612000001', null, '4297f44b13955235245b2497399d7a93', null, null, null, null, null, null, null, null, '18259464960', null, '787749090@qq.com', null, null, null, null, 'YES', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `bs_user` VALUES ('super', '0', '0', '4297f44b13955235245b2497399d7a93', null, null, null, null, null, null, null, null, '18259464960', null, '787749090@qq.com', null, null, null, null, 'YES', null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `bs_user_group`
-- ----------------------------
DROP TABLE IF EXISTS `bs_user_group`;
CREATE TABLE `bs_user_group` (
  `group_id` varchar(32) NOT NULL COMMENT '逻辑主键',
  `group_name` varchar(32) NOT NULL COMMENT '用户组名',
  `status` varchar(8) DEFAULT NULL COMMENT '用户组启用状态，YES，NO',
  `group_type` varchar(18) DEFAULT NULL COMMENT '用户组类型；PLATFORM-平台用户组，SYSTEM-系统用户组',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_name` varchar(32) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `system_id` varchar(32) NOT NULL COMMENT '系统编号',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组表关联用户表';

-- ----------------------------
-- Records of bs_user_group
-- ----------------------------
INSERT INTO `bs_user_group` VALUES ('UG20170612000001', '系统管理用户组', 'YES', null, null, '2017-06-12 11:49:46', null, '2017-06-12 11:49:46', null, 'SS20170612000001');
