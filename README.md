># 淘淘商城学习源码
>运行项目的流程 
>>1.安装顺序install taotao-parent    taotao-common </br>  taotao-manage    taotao-content    taotao-search</br>
>>2.安装顺序run   taotao-manage  taotao-content taotao-search </br>  taotao-manage-web   taotao-portal-web   taotao-search-web</br>
>一：框架的搭建
>>1.taotao-parent 父工程 打包方式为pom  管理jar包的版本号
>>>2.taotao-common 工程  打包方式为jar   通用的工具类</br>
>>>3.taotao-manager 服务层工程 聚合工程 pom </br>
>>>>3.1 taotao-manager-pojo  jar</br>
>>>>3.2 taotao-manager-dao  jar</br>
>>>>3.3 taotao-manager-interface jar</br>
>>>>3.4 taotao-manager-service war</br>
>>>4.taotao-manager-web 表现层工程 war</br>

>二：整个SSM
>>1.DAO整合
>>>1.1创建SqlMapConfig.xml文件</br>
>>>1.2spring整合mybatis    applicationContext-dao.xml</br>
>>>1.3service 整合    applicationContext-service.xml</br>
>>>1.4 事务管理   applicationContext-trans.xml</br>
>>>1.5配置web.xml</br>

>三：引用dubbo发布服务

>四：测试服务
>>4.1:taotao-parent   maven install</br>
>>4.2:taotao-common  maven install</br>
>>4.3:taotao-manager maven install</br>
>>4.4:taotao-manager 发布tomcat</br>
>>4.5:taotao-manager-web 发布tomcat

>五：搭建图片服务器fastdfs


