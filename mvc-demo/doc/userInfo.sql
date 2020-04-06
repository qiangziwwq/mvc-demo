/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50557
Source Host           : 127.0.0.1:3306
Source Database       : sample-web

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2018-08-24 09:31:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`,`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '用户1');
INSERT INTO `user_info` VALUES ('2', '用户2');
