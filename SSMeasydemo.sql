/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : ssmeasydemo
 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 06/05/2019 21:47:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (1, '小明', '男', 23);
INSERT INTO `students` VALUES (3, '小白', '女', 16);
INSERT INTO `students` VALUES (4, '小黑', '女', 15);
INSERT INTO `students` VALUES (5, '小绿', '男', 19);
INSERT INTO `students` VALUES (6, '小方', '男', 23);
INSERT INTO `students` VALUES (7, '小纯', '女', 23);
INSERT INTO `students` VALUES (8, '小小', '女', 23);
INSERT INTO `students` VALUES (9, '小大', '男', 23);
INSERT INTO `students` VALUES (10, 'lili', '女', 22);
INSERT INTO `students` VALUES (11, 'lili', '女', 22);
INSERT INTO `students` VALUES (12, 'lili', '女', 22);
INSERT INTO `students` VALUES (13, 'lili', '女', 22);
INSERT INTO `students` VALUES (14, 'lili', '女', 22);

SET FOREIGN_KEY_CHECKS = 1;
