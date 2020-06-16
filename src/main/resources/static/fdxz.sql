/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : fdxz

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-06-16 16:56:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_active_reg
-- ----------------------------
DROP TABLE IF EXISTS `tb_active_reg`;
CREATE TABLE `tb_active_reg` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `active_name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `student_id_list` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_active_reg
-- ----------------------------

-- ----------------------------
-- Table structure for tb_counselor
-- ----------------------------
DROP TABLE IF EXISTS `tb_counselor`;
CREATE TABLE `tb_counselor` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `counselor_name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `study_number` varchar(11) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_counselor
-- ----------------------------
INSERT INTO `tb_counselor` VALUES ('1', '王太壮', '2020-05-26 09:23:16', 'T1336565', '1', '123456', '男', '20', '18279995455');

-- ----------------------------
-- Table structure for tb_grade
-- ----------------------------
DROP TABLE IF EXISTS `tb_grade`;
CREATE TABLE `tb_grade` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `counselor_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `grade_name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `stu_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_grade
-- ----------------------------
INSERT INTO `tb_grade` VALUES ('1', '1', '一班', '20');
INSERT INTO `tb_grade` VALUES ('2', '1', '二班', '15');

-- ----------------------------
-- Table structure for tb_job_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_job_log`;
CREATE TABLE `tb_job_log` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `counselor_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `notice_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_job_log
-- ----------------------------

-- ----------------------------
-- Table structure for tb_notice
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `content` text COLLATE utf8mb4_unicode_520_ci,
  `attachment` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `level` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `mode` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL COMMENT '站内信或短信提醒',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `publisher` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `send_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `question_end_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `send_to` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `task_attribute` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_notice
-- ----------------------------
INSERT INTO `tb_notice` VALUES ('1', '震惊！富士康一小伙竟然做出这种事', '面对人生万事，我们总希望一切都能得偿所愿，于是铁了心努力，拼了命奔跑，却仍有许多求而不得的时候。直到把自己折腾得伤痕累累，我们才渐渐明白，缺憾又何尝不是另一种方式的完满。没有缺憾的人生，本身就是一种遗憾。将满未满的状态，才是人生最难得的享受；别太用力生活，才会看见更美好的风景。\r\n\r\n有一个词叫“情深不寿”，意指用情太深，感情就不容易长久；也有人解释为用情太深，就太容易耗费自己，进而损害自己的寿命。无论哪种说法，结果都是让自己受伤。\r\n\r\n看过一个真实的故事：一个女生和男友异地恋爱三年，突然发现男生爱上了别人，要和她分手。女生异常崩溃，她用尽一切办法去联系男友，哭着打电话、发信息不断恳求男友回心转意，甚至还直接搭乘当晚的火车来到男生所在的城市，在楼下足足等了好几天。可最终，连男友的面也没见到。\r\n\r\n听说后来，女生心灰意冷，向朋友借了钱买票，头也不回地离开了。那一瞬间，她好像长大了。\r\n\r\n用飞蛾扑火的方式去爱别人，感动的是自己，心累的也只有自己。爱得太满是一场折磨，向别人索求太满的爱也是一种奢望。请记得，有分寸的情，才能够平淡又长久；刚刚好的爱，才不会伤人又伤己。', null, '紧急', '短信通知', '2020-06-12 11:47:12', '2020-06-12 11:47:12', '发布者', '2020-06-12 11:47:12', '2020-06-12 11:47:12', 'grade_二班', '1', '校级');
INSERT INTO `tb_notice` VALUES ('2', '遇到这种事，青铜会这么做，白银会这样，只有王者会这样做', '睡眠本该是一件轻松享受的事情，但却有不少人一直熬夜不睡觉。或许在他们看来，白天的忙碌总是无休无止，只有到了夜深人静的时候才能逃离尘世的喧嚣，所以舍不得睡着，终止这专属于自己的时刻。\r\n\r\n可实际上，前一天熬的夜，第二天就会反映到你的脸上，那无精打采的表情和偌大的黑眼圈就是再好不过的证明。长此以往，损害的终归是你自己的健康。\r\n\r\n一位网友分享了自己的一段经历。刚开始时，她经常凌晨3点睡觉，导致白天的状态非常差：学习的时候记不住新东西，个人内务邋里邋遢，有时候在校园里站着都能睡着……\r\n\r\n后来有一天她幡然醒悟，从此坚持每天早睡早起，一年下来实现了许多小目标：两科专业考试顺利通过，拿到了资格证书；减肥成功，精神状态得到大幅提升；坚持每天运动，身体状况也越来越好。\r\n\r\n所以下一次再胡思乱想的时候，就让睡眠来涤荡你混乱的思绪，帮你治愈心情吧。那些不得不面对的烦恼，睡醒后才更有精力去解决。', null, '重要', '站内信', '2020-06-12 11:47:18', '2020-06-12 11:47:18', '发布者', '2020-06-12 11:47:18', '2020-06-12 11:47:18', 'grade_一班', '0', '院级');
INSERT INTO `tb_notice` VALUES ('3', '又一重要决定发布了！！！', '“春有百花秋有月，夏有凉风冬有雪，若无闲事挂心头，便是人间好时节。”这样的状态，大概是我们每个人心底最期盼的吧。但很多时候，我们总是在心头装太多的闲事，每天为各种未知的事情担忧、为无关的事情忧虑，搞得自己终日心神不宁。\r\n\r\n尤其是在与人相处时，更要学会在别人的生活里退一步，恰到好处不逾距才是最舒服的状态。\r\n\r\n世界本来就是自己的，每个人的生活都是无法复刻的绝世珍藏。当你去参观别人的世界，可以了解，可以疑惑，但不要指手画脚。每个人对幸福都有不一样的定义，对烦恼也未必有相同的理解，不要拿自己的生活去丈量别人的生活。\r\n\r\n凡事有度，太过用力的人往往走不远。人生宝贵，别爱得太满，才能愉悦地享受感情的甜蜜；别睡得太晚，才能轻松摆脱烦恼的纠缠；别想得太多，才能让自己逍遥又自在。\r\n\r\n学会给自己留白，才能无限接近人生最美的状态。', null, '重要', '站内信', '2020-06-12 11:16:52', '2020-06-12 11:16:52', '发布者', '2020-06-12 11:16:52', '2020-06-12 11:16:52', 'grade_二班', '0', '班级');

-- ----------------------------
-- Table structure for tb_notice_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice_student`;
CREATE TABLE `tb_notice_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `notice_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `grade_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_notice_student
-- ----------------------------
INSERT INTO `tb_notice_student` VALUES ('1', '2', '1', '1', '2');
INSERT INTO `tb_notice_student` VALUES ('2', '3', '1', '0', '2');
INSERT INTO `tb_notice_student` VALUES ('3', '4', '1', '1', '2');

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES ('1', '学生', 'ROLE_STU');
INSERT INTO `tb_role` VALUES ('2', '辅导员', 'ROLE_CON');

-- ----------------------------
-- Table structure for tb_sign_in
-- ----------------------------
DROP TABLE IF EXISTS `tb_sign_in`;
CREATE TABLE `tb_sign_in` (
  `student_id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_sign_in
-- ----------------------------

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `id` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL,
  `counselor_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `grade` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `study_number` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `college` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `school` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1', 'Jade', '20', '男', '18279995455', '123456', '2020-05-26 09:22:21', '2020-05-26 09:22:21', '1', '1', '党员', '一班', 'F1336517', '软件学院', '佳木斯高级大学');
INSERT INTO `tb_student` VALUES ('2', 'Bruce', '22', '女', '18279995555', '123456', '2020-05-26 09:22:53', '2020-05-26 09:22:53', '1', '1', '贫困生', '二班', 'F1336518', '艺术学院', '鸡西贵港大学');
INSERT INTO `tb_student` VALUES ('3', '梁某', '21', '女', '18277994455', '123456', '2020-06-12 10:38:59', '2020-06-12 10:39:02', '1', '1', '富人', '二班', 'F1336548', '体育学院', '黑龙江第一大学');
INSERT INTO `tb_student` VALUES ('4', '增某', '25', '男', '18278785454', '123456', '2020-06-12 11:21:05', '2020-06-12 11:21:08', '1', '1', '股神', '二班', 'F1336549', '股票学院', '贵港赌神培训学院');


-- ----------------------------
-- Table structure for tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `role_id` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Records of tb_user_role
-- ----------------------------
INSERT INTO `tb_user_role` VALUES ('1', '1', '1');
INSERT INTO `tb_user_role` VALUES ('2', '2', '1');
