/*
 Navicat Premium Data Transfer

 Source Server         : localhost-vinspier
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : music

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 27/09/2020 19:40:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for upload_file
-- ----------------------------
DROP TABLE IF EXISTS `upload_file`;
CREATE TABLE `upload_file`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `file_id` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件ID',
  `content_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容类型',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名称',
  `original_file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原文件名',
  `group_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分组名',
  `server_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器相对路径',
  `absolute_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器全路径',
  `size` bigint(255) NULL DEFAULT NULL COMMENT '大小 byte',
  `file_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件类型',
  `extension` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拓展名',
  `created_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `updated_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `status` int(2) NULL DEFAULT NULL COMMENT '状态 0 正常 1 逻辑删除',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `file_id`(`file_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '文件信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of upload_file
-- ----------------------------
INSERT INTO `upload_file` VALUES (1, '4b782b4d7eaf4ebd92ba2cf2c38051bf', 'image/png', 'file', '微信截图_20200819101612.png', 'group1', 'M00/00/00/rBAACF9BE3uAY2MdAABj1BmWB4k72..png', 'http://source.vinspier.com/group1/M00/00/00/rBAACF9BE3uAY2MdAABj1BmWB4k72..png', 25556, NULL, NULL, NULL, '2020-08-22 20:45:46', '2020-08-22 20:45:46', NULL, 0);
INSERT INTO `upload_file` VALUES (2, 'e49f1ff8716843378ff57b28593853b4', 'image/png', 'file', '微信截图_20200819101612.png', 'group1', 'M00/00/00/rBAACF9BFN2AXmrCAABj1BmWB4k40..png', 'http://source.vinspier.com/group1/M00/00/00/rBAACF9BFN2AXmrCAABj1BmWB4k40..png', 25556, NULL, NULL, NULL, '2020-08-22 20:51:41', '2020-08-22 20:51:41', NULL, 0);
INSERT INTO `upload_file` VALUES (3, 'd1a15c4b6efb4a37ba682483b58681be', 'image/png', 'file', '微信截图_20200819101612.png', 'group1', 'M00/00/00/rBAACF9BFdOAHCqUAABj1BmWB4k45..png', 'http://source.vinspier.com/group1/M00/00/00/rBAACF9BFdOAHCqUAABj1BmWB4k45..png', 25556, NULL, '.png', NULL, '2020-08-22 20:55:46', '2020-08-22 20:55:46', NULL, 0);
INSERT INTO `upload_file` VALUES (4, '957a628ac350463fa6fffc20867de337', 'image/png', 'file', '微信截图_20200819101612.png', 'group1', 'M00/00/00/rBAACF9BMMeAKQ68AABj1BmWB4k26..png', 'http://source.vinspier.com/group1/M00/00/00/rBAACF9BMMeAKQ68AABj1BmWB4k26..png', 25556, NULL, '.png', NULL, '2020-08-22 22:50:47', '2020-08-22 22:50:47', NULL, 0);
INSERT INTO `upload_file` VALUES (5, '57e5856eedfa4e7890a0dc9fe02b86df', 'image/png', 'file', '打车发票.png', 'group1', 'M00/00/00/rBAACF9BMTqAFO9iAAJOFgV-qZM67..png', 'http://source.vinspier.com/group1/M00/00/00/rBAACF9BMTqAFO9iAAJOFgV-qZM67..png', 151062, NULL, '.png', NULL, '2020-08-22 22:52:41', '2020-08-22 22:52:41', NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
