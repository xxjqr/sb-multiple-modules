/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-12 21:24:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_activity_serve
-- ----------------------------
DROP TABLE IF EXISTS `t_activity_serve`;
CREATE TABLE `t_activity_serve` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_id` int(11) DEFAULT NULL,
  `service_id` int(11) DEFAULT NULL,
  `service_num` int(11) DEFAULT NULL,
  `service_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_activity_serve
-- ----------------------------
INSERT INTO `t_activity_serve` VALUES ('1', '1', '1', '1', '2017-09-12 18:14:29');
