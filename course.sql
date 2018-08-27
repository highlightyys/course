/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80003
Source Host           : localhost:3306
Source Database       : course

Target Server Type    : MYSQL
Target Server Version : 80003
File Encoding         : 65001

Date: 2018-08-27 18:32:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `selection`
-- ----------------------------
DROP TABLE IF EXISTS `selection`;
CREATE TABLE `selection` (
  `selid` int(11) NOT NULL AUTO_INCREMENT,
  `stuid` int(11) NOT NULL,
  `courseid` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `term` char(1) DEFAULT NULL,
  `grade` double(5,2) DEFAULT NULL,
  PRIMARY KEY (`selid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selection
-- ----------------------------
INSERT INTO `selection` VALUES ('1', '21', '8', '2017', '2', '50.00');
INSERT INTO `selection` VALUES ('2', '22', '8', '2017', '2', '80.00');

-- ----------------------------
-- Table structure for `tb_admin`
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `adminid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for `tb_class`
-- ----------------------------
DROP TABLE IF EXISTS `tb_class`;
CREATE TABLE `tb_class` (
  `classid` int(11) NOT NULL AUTO_INCREMENT,
  `classname` varchar(20) NOT NULL,
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_class
-- ----------------------------
INSERT INTO `tb_class` VALUES ('41', 'test2');
INSERT INTO `tb_class` VALUES ('42', 'test3');
INSERT INTO `tb_class` VALUES ('43', 'test4');
INSERT INTO `tb_class` VALUES ('44', 'test5');

-- ----------------------------
-- Table structure for `tb_course`
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `courseid` int(11) NOT NULL AUTO_INCREMENT,
  `coursename` varchar(20) NOT NULL,
  `hour` int(11) NOT NULL,
  `score` double(5,2) NOT NULL,
  `picurl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES ('8', 'java', '80', '2.50', null);
INSERT INTO `tb_course` VALUES ('9', 'php', '80', '3.00', null);
INSERT INTO `tb_course` VALUES ('10', 'c++', '60', '2.50', null);
INSERT INTO `tb_course` VALUES ('11', 'c', '60', '2.00', null);
INSERT INTO `tb_course` VALUES ('12', '数据库', '40', '2.00', null);
INSERT INTO `tb_course` VALUES ('13', 'jsp', '30', '2.00', null);

-- ----------------------------
-- Table structure for `tb_student`
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `stuid` int(11) NOT NULL AUTO_INCREMENT,
  `stunum` char(12) NOT NULL,
  `stuname` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `classid` int(11) NOT NULL,
  `picurl` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('21', '1000', '张三', '1000', '41', '/static/upload/8/F/CB12C3D58CC6472795D27CC9D49259BA.jpg');
INSERT INTO `tb_student` VALUES ('22', '1001', '王五', '1001', '41', '/static/upload/C/9/D5A1EAD1BABA45E8A8CFE9D1226BC10C.jpg');
INSERT INTO `tb_student` VALUES ('23', '1002', '李四', '1002', '41', '/static/upload/3/8/8B64C94B46A6472E8956FDCF91039969.jpg');
