use sciman;

# default users
insert into user(username, password) values
('hack', 'hack'),
('admin', 'admin@123');

# sample data
INSERT INTO laboratory (name, orientation) VALUES
('蔚蓝实验室', '在食品科学领域进行研究，关注食品安全和营养品质'),
('幽谷实验室', '研究社会学，深入分析社会结构和社会变革的影响'),
('烟雨实验室', '专注于大气科学研究，研究大气环境和气候变化'),
('流星实验室', '从事地球物理学研究，关注地球内部结构和地震活动'),
('橙光实验室', '在光电子材料研究领域进行创新，探索新型光电子器件'),
('琴韵实验室', '研究音乐学和音响工程，致力于音乐艺术和声学技术的结合'),
('橙影实验室', '在机器人工程领域进行研究，开发智能机器人和自动化系统'),
('桃花源实验室', '研究地理信息科学，关注地理信息系统和遥感技术的应用'),
('星河实验室', '从事物理学研究，深入探讨基本粒子和物质的性质'),
('秋水实验室', '专注于水资源科学研究，研究水循环和水资源管理'),
('翎羽实验室', '研究生物信息学，关注生物大数据和基因组学的分析'),
('朝霞实验室', '在教育科学领域进行研究，推动教育改革和创新'),
('青松实验室', '研究植物生态学，关注植物生长和生态系统的相互作用');

-- 蔚蓝实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10001, 1, '张三', 1, '副教授', 35, '可再生能源研究'),
(10002, 1, '李四', 2, '讲师', 28, '能源转换技术'),
(10003, 1, '王五', 1, '教授', 40, '能源政策与规划');

-- 幽谷实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10004, 2, '刘七', 1, '副教授', 36, '社会结构研究'),
(10005, 2, '陈八', 2, '讲师', 29, '社会变革与创新'),
(10006, 2, '黄九', 1, '教授', 42, '社会网络分析');

-- 烟雨实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10007, 3, '吴十一', 1, '副教授', 34, '大气环境模拟研究'),
(10008, 3, '郑十二', 2, '讲师', 27, '水体生态系统研究'),
(10009, 3, '朱十三', 1, '教授', 39, '土壤污染治理技术研究');

-- 流星实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10010, 4, '杨十五', 1, '副教授', 37, '地球内部结构研究'),
(10011, 4, '许十六', 2, '讲师', 30, '地球物理学研究'),
(10012, 4, '何十七', 1, '教授', 41, '地震活动与预测研究');

-- 橙光实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10013, 5, '张十九', 1, '副教授', 33, '光电子器件研究'),
(10014, 5, '刘二十', 2, '讲师', 26, '激光技术应用'),
(10015, 5, '陈廿一', 1, '教授', 38, '光学材料研究');

-- 琴韵实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10016, 6, '吴十一', 1, '副教授', 34, '音乐艺术研究'),
(10017, 6, '郑十二', 2, '讲师', 27, '声学技术研究'),
(10018, 6, '朱十三', 1, '教授', 39, '音响工程研究');

-- 橙影实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10019, 7, '杨十五', 1, '副教授', 37, '智能机器人研究'),
(10020, 7, '许十六', 2, '讲师', 30, '自动化系统研究'),
(10021, 7, '何十七', 1, '教授', 41, '人机交互技术研究');

-- 桃花源实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10022, 8, '张十九', 1, '副教授', 33, '地理信息系统研究'),
(10023, 8, '刘二十', 2, '讲师', 26, '遥感技术应用'),
(10024, 8, '陈廿一', 1, '教授', 38, '地理大数据分析');

-- 星河实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10025, 9, '吴十一', 1, '副教授', 34, '天文观测研究'),
(10026, 9, '郑十二', 2, '讲师', 27, '宇宙学研究'),
(10027, 9, '朱十三', 1, '教授', 39, '星体演化研究');

-- 秋水实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10028, 10, '张十九', 1, '副教授', 33, '水循环研究'),
(10029, 10, '刘二十', 2, '讲师', 26, '水资源管理研究'),
(10030, 10, '陈廿一', 1, '教授', 38, '水环境保护技术研究');

-- 翎羽实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10031, 11, '吴十一', 1, '副教授', 34, '生物信息学研究'),
(10032, 11, '郑十二', 2, '讲师', 27, '基因组学研究'),
(10033, 11, '朱十三', 1, '教授', 39, '生物大数据分析');

-- 朝霞实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10034, 12, '张十九', 1, '副教授', 33, '教育改革研究'),
(10035, 12, '刘二十', 2, '讲师', 26, '教育创新技术研究'),
(10036, 12, '陈廿一', 1, '教授', 38, '教育心理学研究');

-- 青松实验室
INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10037, 13, '吴十一', 1, '副教授', 34, '植物生态学研究'),
(10038, 13, '郑十二', 2, '讲师', 27, '植物生长与发育研究'),
(10039, 13, '朱十三', 1, '教授', 39, '生态系统保护研究');
