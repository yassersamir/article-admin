insert into tags (id,createdate,title) values (2,CURDATE(),'tag2');
insert into users (id,email,name,password) values(1,'user1@email.com','user1','password1'),
(2,'user2@email.com','user2','password2');
insert into articles(id,categories,createdate,descreption,image,title,tag_id,user_id)
values (1,'dsjkfn',CURDATE(),'kjfans','kjcsnam','jkscan',1,2),
(2,'dsjkfn',CURDATE(),'kjfans','kjcsnam','jkscan',1,1),
(3,'dsjkfn',CURDATE(),'kjfans','kjcsnam','jkscan',1,2);