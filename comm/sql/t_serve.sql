/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-16 10:35:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_serve
-- ----------------------------
DROP TABLE IF EXISTS `t_serve`;
CREATE TABLE `t_serve` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `market_price` int(11) DEFAULT NULL COMMENT '市场价',
  `cost_price` int(11) DEFAULT NULL COMMENT '成本价',
  `prefer_price` int(11) DEFAULT NULL COMMENT '优惠价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
