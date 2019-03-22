# Edu_SSM

**教育后台管理系统 介绍**

**SSM 框架**



**SSM开发流程**

1. 创建一个空白项目
2. 创建父工程
3. 创建model子工程
4. 创建dao子工程
5. 创建service子工程
6. 创建manager后台管理
7. Manager中先集成springMVC
8. 在manager中web.xml中加载springMVC配置文件
9. 将web.xml头文件部分改为3.0
10. dao整合Mybatis，依赖模型
11. service依赖dao
12. manager依赖service
13. Manager 添加其他的依赖
14. manager的其他配置文件
15.在web.xml中加载applicationContext.xml文件

**Git上传项目到码云上**
1.	在码云创建项目
2.	把项目代码拖进去【文件太多就没法上传，使用git命令】
3.	在本地创建一个文件夹
4.	把码云项目克隆一份
5.	把项目代码丢进去
6.	把代码添加到git缓存中
7.	提交
8.	使用push把创建上传码云
具体命令：
1.	git clone https://gitee.com/mayaole/EduProject.git
2.	把项目内容放在目录下
3.	Git add .
4.	Git commit -m ‘提交’
5.	Git push origin master






