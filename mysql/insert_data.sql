use sciman;

# default users
insert into user(username, password) values
('hack', 'hack'),
('admin', 'admin@123');

# sample data
INSERT INTO laboratory (name, orientation) VALUES
('翠峰实验室', '在人工智能研究领域致力于深度学习和神经网络的创新和应用'),
('沧海实验室', '专注于生物技术领域，研究生命科学和生物医学工程的最新技术和发展'),
('青云实验室', '从事环境科学研究，关注大气、水体和土壤的生态平衡和环境保护'),
('紫翼实验室', '探索材料科学研究，致力于新型材料的合成、性能优化和应用开发'),
('明月实验室', '在社会科学领域进行研究，深入探讨社会变革、人类行为和文化传承');
