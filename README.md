># 淘淘商城学习源码
>一：框架的搭建</br>
>1.taotao-parent 父工程 打包方式为pom  管理jar包的版本号</br>
>>2.taotao-common 工程  打包方式为jar   通用的工具类</br>
>>3.taotao-manager 服务层工程 聚合工程 pom </br>
>>>3.1 taotao-manager-pojo  jar</br>
>>>3.2 taotao-manager-dao  jar</br>
>>>3.3 taotao-manager-interface jar</br>
>>>3.4 taotao-manager-service war</br>
>>4.taotao-manager-web 表现层工程 war</br>

>二：整个SSM
>1.DAO整合</br>
>>1.1创建SqlMapConfig.xml文件</br>
>>1.2spring整合mybatis    applicationContext-dao.xml</br>
>>1.3service 整合    applicationContext-service.xml</br>
>>1.4 事务管理   applicationContext-trans.xml</br>
>>1.5配置web.xml</br>

>三：引用dubbo发布服务


