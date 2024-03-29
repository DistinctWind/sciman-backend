use sciman;

# default users
insert into user(username, password) values
('hack', 'hack'),
('admin', 'admin@123');

insert into user(username, password, associated_employee_id) values
('rankrev', 'rkkkrev', 10001);

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
(20006, 12),  -- 许明服务于朝霞实验室
(20005, 13);  -- 陈华服务于翎羽实验室

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

insert into contact (id, office_phone_no, mobile_phone_no, email_address) values
(1, '812345678', '13987654321', 'john.doe@example.com'),
(2, '823456789', '18876543210', 'jane.smith@example.com'),
(3, '834567890', '17765432109', 'bob.jones@example.com'),
(4, '845678901', '16543210983', 'mary.wilson@example.com'),
(5, '856789012', '15432109874', 'peter.jackson@example.com'),
(6, '867890123', '14321098765', 'susan.davis@example.com'),
(7, '878901234', '13210987656', 'michael.brown@example.com'),
(8, '889012345', '12109876547', 'linda.miller@example.com'),
(9, '890123456', '11098765438', 'david.wang@example.com'),
(10, '801234567', '19876543219', 'emily.chen@example.com');

insert into organization (name, address, principal_contact_id) values
('鸿蒙科技有限公司', '北京市海淀区中关村大街1号', 1),
('清泉生态环保有限公司', '上海市浦东新区世纪大道1001号', 3),
('翔云信息技术有限公司', '深圳市南山区高新南一道2号', 5);

insert into project (main_researcher_id, name, content, budget, begin_date, end_date,
                     client_organization_id, monitor_organization_id) values
(10001, '基于光伏发电的能源转换技术研究', '研究光伏发电技术，开发新型光伏发电设备', 1000000,
 '2021-01-01', '2023-12-31', 1, 2),
(10002, '基于社会网络分析的社会结构研究', '研究社会网络分析方法，分析社会结构和社会变革', 800000,
 '2021-01-01', '2023-12-31', 2, 3),
(10003, '大气环境模拟研究', '研究大气环境模拟方法，模拟大气环境变化', 1200000,
 '2021-01-01', '2023-12-31', 3, 1),
(10004, '地震活动与预测研究', '研究地震活动规律，预测地震发生时间和地点', 1500000,
 '2021-01-01', '2023-12-31', 1, 2),
(10005, '光电子器件研究', '研究光电子器件的制造和应用', 2000000,
 '2021-01-01', '2023-12-31', 2, 3),
(10006, '音乐艺术与声学技术研究', '研究音乐艺术和声学技术的结合', 1000000,
 '2021-01-01', '2023-12-31', 3, 1),
(10007, '智能机器人研究', '研究智能机器人的制造和应用', 1500000,
 '2021-01-01', '2023-12-31', 1, 2);

INSERT INTO subproject (project_id, principal_id, due_date, budget, name, tech_description) VALUES
(1, 10001, '2024-06-15', 500000, '光伏发电设备优化研究', '研究光伏发电设备的优化方案，包括提高效率和降低成本等方面的技术内容'),
(1, 10001, '2024-08-31', 300000, '新型光伏材料研究', '探讨并开发新型光伏材料，以提高光伏发电的性能和稳定性'),
(2, 10002, '2024-07-20', 400000, '社会网络分析工具开发', '开发用于分析社会网络的工具，涉及数据收集、算法设计等技术方面'),
(2, 10002, '2024-09-15', 400000, '社会结构演化模型构建', '建立模型以研究社会结构的演化过程，包括模型的构建和演化规律的分析'),
(3, 10003, '2024-07-01', 800000, '大气环境模拟软件开发', '开发用于模拟大气环境的软件，包括气象要素的模拟和环境变化的预测等方面'),
(3, 10003, '2024-09-30', 400000, '大气环境变化模拟实验', '进行大气环境变化的模拟实验，验证先前模型的准确性和稳定性'),
(4, 10004, '2024-06-30', 750000, '地震活动规律分析', '分析地震活动的规律，包括时间、地点等方面的统计和分析'),
(4, 10004, '2024-08-15', 750000, '地震发生时间和地点预测算法优化', '优化地震发生时间和地点的预测算法，提高预测的准确性和可靠性'),
(5, 10005, '2024-07-10', 1000000, '光电子器件制造工艺研究', '研究光电子器件的制造工艺，包括材料选择、制造工艺优化等方面的技术研究'),
(5, 10005, '2024-09-25', 1000000, '光电子器件应用技术实验', '进行光电子器件应用技术的实验研究，验证先前研究的可行性和应用性'),
(6, 10006, '2024-07-05', 500000, '音乐艺术与声学技术融合研究', '研究音乐艺术与声学技术的融合，包括音乐创作中声学技术的应用等方面'),
(6, 10006, '2024-09-20', 500000, '声学技术在音乐创作中的应用', '将声学技术应用于音乐创作，包括声音效果的设计和创新等方面'),
(7, 10007, '2024-07-25', 750000, '智能机器人制造工艺研究', '研究智能机器人的制造工艺，包括机械结构设计、智能算法等方面的技术内容'),
(7, 10007, '2024-09-10', 750000, '智能机器人应用场景开发', '开发智能机器人的应用场景，包括在不同领域中的实际应用和性能优化等方面的研究');


insert into organization_secondary_contact (organization_id, contact_id) values
(1, 2),
(2, 3),
(3, 1),
(1, 4),
(3, 6),
(1, 7),
(2, 8),
(3, 9),
(1, 10);

insert into project_coworker_organization(project_id, coworker_organization_id) values
(1, 2),
(2, 3),
(3, 1),
(4, 2),
(5, 3),
(6, 1),
(7, 2);

insert into attend_project(researcher_id, project_id, work_time, work_amount) values
(10001, 1, 80, 0.2),
(10002, 2, 60, 0.15),
(10003, 3, 100, 0.25),
(10004, 1, 90, 0.22),
(10005, 2, 70, 0.18),
(10006, 3, 85, 0.21),
(10007, 1, 75, 0.19),
(10008, 2, 95, 0.23),
(10009, 3, 110, 0.28),
(10010, 1, 120, 0.3),
(10011, 2, 55, 0.14),
(10012, 3, 80, 0.2),
(10013, 1, 65, 0.16),
(10014, 2, 105, 0.26),
(10015, 3, 88, 0.22),
(10016, 1, 78, 0.19),
(10017, 2, 92, 0.23),
(10018, 3, 115, 0.29),
(10019, 1, 110, 0.28),
(10020, 2, 50, 0.12),
(10021, 3, 75, 0.18),
(10022, 1, 105, 0.26),
(10023, 2, 85, 0.21),
(10024, 3, 95, 0.23),
(10025, 1, 65, 0.16),
(10026, 2, 75, 0.19),
(10027, 3, 80, 0.2),
(10028, 1, 110, 0.28),
(10029, 2, 120, 0.3),
(10030, 3, 95, 0.23),
(10031, 1, 100, 0.25),
(10032, 2, 55, 0.14),
(10033, 3, 65, 0.16),
(10034, 1, 85, 0.21),
(10035, 2, 78, 0.19),
(10036, 3, 92, 0.23),
(10037, 1, 105, 0.26),
(10038, 2, 88, 0.22),
(10039, 3, 75, 0.18);

insert into achievement(name, project_id, achieve_date, ranking_factor, classification) values
('光伏发电设备优化研究成果', 1, '2022-06-15', 0.3, 1),
('新型光伏材料研究成果', 1, '2023-02-28', 0.25, 1),
('光伏发电技术应用论文', 1, '2023-10-20', 0.45, 4),
('社会网络分析工具开发成果', 2, '2022-08-20', 0.4, 5),
('社会结构演化模型构建成果', 2, '2023-01-15', 0.35, 5),
('社会网络分析方法研究论文', 2, '2023-09-10', 0.25, 4),
('大气环境模拟软件开发成果', 3, '2022-07-05', 0.3, 5),
('大气环境变化模拟实验成果', 3, '2023-03-30', 0.4, 5),
('大气环境模拟方法研究论文', 3, '2023-11-25', 0.3, 4),
('地震活动规律分析成果', 4, '2022-06-30', 0.35, 4),
('地震发生时间和地点预测算法优化成果', 4, '2023-02-15', 0.4, 4),
('地震活动研究论文', 4, '2023-10-10', 0.25, 4),
('光电子器件制造工艺研究成果', 5, '2022-07-10', 0.28, 1),
('光电子器件应用技术实验成果', 5, '2023-04-25', 0.32, 1),
('光电子器件研究论文', 5, '2023-11-15', 0.4, 4),
('音乐艺术与声学技术融合研究成果', 6, '2022-07-05', 0.3, 4),
('声学技术在音乐创作中的应用成果', 6, '2023-04-20', 0.35, 4),
('音乐艺术与技术结合论文', 6, '2023-12-05', 0.35, 4),
('智能机器人制造工艺研究成果', 7, '2022-07-25', 0.32, 1),
('智能机器人应用场景开发成果', 7, '2023-05-10', 0.28, 1),
('智能机器人研究论文', 7, '2023-12-20', 0.4, 4);

insert into achievement_contribution(researcher_id, achievement_id) values
(10001, 1),
(10004, 1),
(10007, 1),
(10010, 1),
(10013, 1),
(10016, 1),
(10019, 1),
(10022, 1),
(10025, 1),
(10028, 1),
(10031, 1),
(10034, 1),
(10037, 1),
(10002, 2),
(10005, 2),
(10008, 2),
(10011, 2),
(10014, 2),
(10017, 2),
(10020, 2),
(10023, 2),
(10026, 2),
(10029, 2),
(10032, 2),
(10035, 2),
(10038, 2),
(10003, 3),
(10006, 3),
(10009, 3),
(10012, 3),
(10015, 3),
(10018, 3),
(10021, 3),
(10024, 3),
(10027, 3),
(10030, 3),
(10033, 3),
(10036, 3),
(10039, 3);
