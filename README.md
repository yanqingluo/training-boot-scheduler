# training-boot-scheduler
spring boot integrate scheduler job <br>
该项目在Spring-Boot基础上整合了调度作业功能，演示了两种功能:<br>
注解配置<br>
使用配置文件XML<br>

这两种配置方式都有优势，如果需求固定，推荐使用注解，注解缺点就是修改作业配置，需重新编译<br>

说明一下：<br>
该示例使用的是原生的Spring Scheduler模块，当然你也可以整合Quartz，我更推荐使用原生的，减少依赖，更轻量，你懂得。。。
