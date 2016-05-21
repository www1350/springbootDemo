/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : springbootdemo

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2016-05-21 17:07:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(64) DEFAULT NULL,
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('www', '202cb962ac59075b964b07152d234b70', '7');
INSERT INTO `t_user` VALUES ('王文伟', '202cb962ac59075b964b07152d234b70', '8');
INSERT INTO `t_user` VALUES ('wwwweq', '202cb962ac59075b964b07152d234b70', '9');
INSERT INTO `t_user` VALUES ('qwe', '4eae35f1b35977a00ebd8086c259d4c9', '12');
INSERT INTO `t_user` VALUES ('qew', '202cb962ac59075b964b07152d234b70', '14');
INSERT INTO `t_user` VALUES ('123', '202cb962ac59075b964b07152d234b70', '19');
