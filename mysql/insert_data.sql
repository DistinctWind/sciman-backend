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

INSERT INTO researcher (employee_id, laboratory_id, name, gender, title, age, orientation) VALUES
(10001, 1, '张三', 1, '副教授', 35, '可再生能源研究'),
(10002, 1, '李四', 2, '讲师', 28, '能源转换技术'),
(10003, 1, '王五', 1, '教授', 40, '能源政策与规划'),
(10004, 2, '刘七', 1, '副教授', 36, '社会结构研究'),
(10005, 2, '陈八', 2, '讲师', 29, '社会变革与创新'),
(10006, 2, '黄九', 1, '教授', 42, '社会网络分析'),
(10007, 3, '吴十一', 1, '副教授', 34, '大气环境模拟研究'),
(10008, 3, '郑十二', 2, '讲师', 27, '水体生态系统研究'),
(10009, 3, '朱十三', 1, '教授', 39, '土壤污染治理技术研究'),
(10010, 4, '杨十五', 1, '副教授', 37, '地球内部结构研究'),
(10011, 4, '许十六', 2, '讲师', 30, '地球物理学研究'),
(10012, 4, '何十七', 1, '教授', 41, '地震活动与预测研究'),
(10013, 5, '张十九', 1, '副教授', 33, '光电子器件研究'),
(10014, 5, '刘二十', 2, '讲师', 26, '激光技术应用'),
(10015, 5, '陈廿一', 1, '教授', 38, '光学材料研究'),
(10016, 6, '吴十一', 1, '副教授', 34, '音乐艺术研究'),
(10017, 6, '郑十二', 2, '讲师', 27, '声学技术研究'),
(10018, 6, '朱十三', 1, '教授', 39, '音响工程研究'),
(10019, 7, '杨十五', 1, '副教授', 37, '智能机器人研究'),
(10020, 7, '许十六', 2, '讲师', 30, '自动化系统研究'),
(10021, 7, '何十七', 1, '教授', 41, '人机交互技术研究'),
(10022, 8, '张十九', 1, '副教授', 33, '地理信息系统研究'),
(10023, 8, '刘二十', 2, '讲师', 26, '遥感技术应用'),
(10024, 8, '陈廿一', 1, '教授', 38, '地理大数据分析'),
(10025, 9, '吴十一', 1, '副教授', 34, '天文观测研究'),
(10026, 9, '郑十二', 2, '讲师', 27, '宇宙学研究'),
(10027, 9, '朱十三', 1, '教授', 39, '星体演化研究'),
(10028, 10, '张十九', 1, '副教授', 33, '水循环研究'),
(10029, 10, '刘二十', 2, '讲师', 26, '水资源管理研究'),
(10030, 10, '陈廿一', 1, '教授', 38, '水环境保护技术研究'),
(10031, 11, '吴十一', 1, '副教授', 34, '生物信息学研究'),
(10032, 11, '郑十二', 2, '讲师', 27, '基因组学研究'),
(10033, 11, '朱十三', 1, '教授', 39, '生物大数据分析'),
(10034, 12, '张十九', 1, '副教授', 33, '教育改革研究'),
(10035, 12, '刘二十', 2, '讲师', 26, '教育创新技术研究'),
(10036, 12, '陈廿一', 1, '教授', 38, '教育心理学研究'),
(10037, 13, '吴十一', 1, '副教授', 34, '植物生态学研究'),
(10038, 13, '郑十二', 2, '讲师', 27, '植物生长与发育研究'),
(10039, 13, '朱十三', 1, '教授', 39, '生态系统保护研究');

INSERT INTO staff (researcher_id, laboratory_id, due_date) VALUES
(10003, 1, '2024-11-30'),   -- 蔚蓝实验室主任：王五
(10006, 2, '2024-11-29'),   -- 幽谷实验室主任：黄九
(10009, 3, '2024-11-28'),   -- 烟雨实验室主任：朱十三
(10012, 4, '2024-11-27'),   -- 流星实验室主任：何十七
(10015, 5, '2024-11-26'),   -- 橙光实验室主任：陈廿一
(10018, 6, '2024-11-25'),   -- 琴韵实验室主任：朱十三
(10021, 7, '2024-11-24'),   -- 橙影实验室主任：何十七
(10024, 8, '2024-11-23'),   -- 桃花源实验室主任：陈廿一
(10027, 9, '2024-11-22'),   -- 星河实验室主任：朱十三
(10030, 10, '2024-11-21'),  -- 秋水实验室主任：陈廿一
(10033, 11, '2024-11-20'),  -- 翎羽实验室主任：朱十三
(10036, 12, '2024-11-19'),  -- 朝霞实验室主任：陈廿一
(10039, 13, '2024-11-18');  -- 青松实验室主任：朱十三

INSERT INTO secretary (employee_id, name, gender, age, employ_date, duty) VALUES
(20001, '刘婷', 2, 28, '2023-01-15', '协助实验室日常事务管理'),
(20002, '张磊', 1, 25, '2023-02-20', '负责会议安排和记录'),
(20003, '王梅', 2, 30, '2023-03-25', '协助研究人员招聘和培训'),
(20004, '李阳', 1, 27, '2023-04-10', '负责实验室文档管理'),
(20005, '陈华', 2, 32, '2023-05-18', '协助预算和经费管理'),
(20006, '许明', 1, 29, '2023-06-22', '负责实验室设备维护和采购');

INSERT INTO serve (secretary_id, laboratory_id) VALUES
(20001, 1),   -- 刘婷服务于蔚蓝实验室
(20002, 2),   -- 张磊服务于幽谷实验室
(20003, 3),   -- 王梅服务于烟雨实验室
(20004, 4),   -- 李阳服务于流星实验室
(20005, 5),   -- 陈华服务于橙光实验室
(20006, 6),   -- 许明服务于琴韵实验室
(20001, 7),   -- 刘婷服务于橙影实验室
(20002, 8),   -- 张磊服务于桃花源实验室
(20003, 9),   -- 王梅服务于星河实验室
(20004, 10),  -- 李阳服务于秋水实验室
(20005, 11),  -- 陈华服务于翎羽实验室
(20006, 12);  -- 许明服务于朝霞实验室

-- 插入办公场所表的SQL语句
INSERT INTO venue (laboratory_id, area, address) VALUES
(1, 80.5, 'A1-402'),    -- 蔚蓝实验室办公场地
(1, 65.2, 'A1-403'),    -- 蔚蓝实验室办公场地
(2, 75.0, 'B2-201'),    -- 幽谷实验室办公场地
(2, 60.8, 'B2-202'),    -- 幽谷实验室办公场地
(2, 70.3, 'B2-203'),    -- 幽谷实验室办公场地
(3, 90.0, 'C3-301'),    -- 烟雨实验室办公场地
(3, 82.6, 'C3-302'),    -- 烟雨实验室办公场地
(4, 100.2, 'D4-101'),   -- 流星实验室办公场地
(4, 88.7, 'D4-102'),    -- 流星实验室办公场地
(5, 95.5, 'E5-501'),    -- 橙光实验室办公场地
(5, 78.4, 'E5-502'),    -- 橙光实验室办公场地
(6, 110.8, 'F6-301'),   -- 琴韵实验室办公场地
(6, 92.3, 'F6-302'),    -- 琴韵实验室办公场地
(7, 85.6, 'G7-401'),    -- 橙影实验室办公场地
(7, 75.9, 'G7-402'),    -- 橙影实验室办公场地
(8, 105.4, 'H8-101'),   -- 桃花源实验室办公场地
(8, 98.1, 'H8-102'),    -- 桃花源实验室办公场地
(9, 88.7, 'I9-201'),    -- 星河实验室办公场地
(9, 76.3, 'I9-202'),    -- 星河实验室办公场地
(10, 94.2, 'J10-501'),  -- 秋水实验室办公场地
(10, 80.0, 'J10-502'),   -- 秋水实验室办公场地
(11, 102.5, 'K11-301'),  -- 翎羽实验室办公场地
(11, 89.8, 'K11-302'),   -- 翎羽实验室办公场地
(12, 78.4, 'L12-401'),   -- 朝霞实验室办公场地
(12, 65.7, 'L12-402'),   -- 朝霞实验室办公场地
(13, 93.1, 'M13-201'),  -- 青松实验室办公场地
(13, 81.6, 'M13-202');   -- 青松实验室办公场地
