# JavaWeb

狂神说Java系列-个人学习笔记

## 基本概念

### web开发

- web：页面的意思
- 动态web：提供给不同人，不同地点，的信息不相同
    - 技术栈：Servlet/JSP, ASP, PHP
- 静态web：比如html，css，提供给所有人的data始终不会发生变化
- 在Java中，动态web资源开发的技术统称为JavaWeb

- [ ]  [P1javaweb-01：web的基本概念32:11](https://www.bilibili.com/video/BV12J411M7Sj?p=1)

### web应用程序

- 什么是程序：按照code逻辑执行的action
- web应用程序：可以提供给browser访问的程序
    - 各种html，...多个web资源，可以被外界访问，给外界提供服务
    - 比如`ping 网站`可以查看哪个电脑在提供服务

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled.png)

    - 你能访问的任何一个页面或资源，都存在于这个世界的某个角落的计算机上
    - 给外界提供的、的是url
- 这个统一的web资源被放在同一个folder中，这个就是web应用，这个依赖于服务器,比如Tomcat
- 一个web应用由多个部分组成(静态，动态)，包括以下资源：
    - html, css, js
    - jsp, servlet
    - java程序
    - jar包
    - 配置文件Properties
- web应用编写完之后，若想提供给外部访问，需要服务器统一管理

### 静态web

- *.htm, *.html （两者相同）网页的后缀，如果服务器上一直存在这些东西，我们就可以直接进行读取
- client，server通信
    - client→ server: 用什么方法（比如get）进行request请求
    - servier → client: 响应
    - client 是跟web server发出request，然后web server去自己的资源里找到相应资源，比如index.html，然后再返回给client

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%201.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%201.png)

- 静态web 缺点：
    - 无法动态更新，所有用户看的都一样
        - 为了美化，可以用javascript，VBScript，执行轮播图，点击特效（伪动态）
    - 无法和DB交互，DB无法持久化，用户无法交互

### 动态web

- web页面效果可以因人而异
- request通过web server plugin 判断，处理下面两个通路
    - 处理静态web：web server 去file system 找到资源，返回给客户
    - 处理动态web：相应的web资源（JSP，Servlet）处理，然后返回给web server,再返回客户

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%202.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%202.png)

- 缺点：
    - 如果代码（服务器动态资源发生错误）错误，需要重新编写后台程序，重新发布
        - 可能要停机维护
- 优点：
    - 可以动态更新
    - 可以与DB交互
        - 可以做DB持久化

新手村 → 魔鬼训练（分析原理，看源码）→ PK

- [ ]  [P2javaweb-02：web服务器讲解19:34](https://www.bilibili.com/video/BV12J411M7Sj?p=2)

## web服务器

### web技术手段

最出名的三个技术

- ASP：
    - 微软，国内最早流行的是ASP
    - 在HTML中嵌入了VB脚本，用ASP+COM实现
    - 在ASP开发中，一个页面要嵌入java代码（动辄几千行业务代码），页码极其混乱，难以维护
    - 一般主要用C#语言

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%203.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%203.png)

- PHP
    - PHP开发速度很快，功能强大， 跨平台，代码简单（大部分网站用PHP实现-中国70%网站，wordpress用了PHP）
    - 无法承载大访问量（有局限性）
- JSP/Servlet
    - 基于java语言，所有的大公司，或者一些开源的组件，都是用java写的
    - sun公司主推的B/S（browser，server） 架构
    - 所有互联网大公司，或者一些开源的组件，都是用java写的
    - 可以承载三高问题带来的影响（高可用，高性能，高并发）
    - 语法像ASP，加强了市场竞争度

### web服务器

- web服务器例子
    - Tomcat
    - IIS （微软）：跑ASP，windows自带的
- web server 是一种被动的操作，用来处理用户的一些请求和给用户一些相应信息

### Tomcat

- Apache Tomcat: is an open source implementation of the [Jakarta Servlet](https://projects.eclipse.org/projects/ee4j.servlet), [Jakarta Server Pages](https://projects.eclipse.org/projects/ee4j.jsp), [Jakarta Expression Language](https://projects.eclipse.org/projects/ee4j.el), [Jakarta WebSocket](https://projects.eclipse.org/projects/ee4j.websocket), [Jakarta Annotations](https://projects.eclipse.org/projects/ee4j.ca) and [Jakarta Authentication](https://projects.eclipse.org/projects/ee4j.authentication) specifications. These specifications are part of the [Jakarta EE platform](https://projects.eclipse.org/projects/ee4j.jakartaee-platform).

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%204.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%204.png)

- Tomcat是Apache 软件基金会（Apache Software Foundation）的Jakarta 项目中的一个核心项目，最新的Servlet 和JSP 规范总是能在Tomcat 中得到体现，Tomcat 5支持最新的Servlet 2.4 和JSP 2.0 规范。
- 因为Tomcat 技术先进、性能稳定，而且免费，因而深受Java 爱好者的喜爱并得到了部分软件开发商的认可，成为目前比较流行的Web 应用服务器。
- Tomcat 服务器是一个免费的开放源代码的Web 应用服务器，属于轻量级应用[服务器](https://baike.baidu.com/item/%E6%9C%8D%E5%8A%A1%E5%99%A8)，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 程序的首选。对于一个初学者来说，是最好的Server
- Tomcat 实际上运行JSP 页面和Servlet。
- Tomcat和[IIS](https://baike.baidu.com/item/IIS)等Web服务器一样，具有处理HTML页面的功能
- 目前Tomcat最新版本为10.0.5**。**

工作3-5年之后，可以手写Tomcat服务器

### 下载tomcat

1. 安装、解压
2. 了解配置文件，目录结构
3. 了解这个东西的作用

### Java核心包位置

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%205.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%205.png)

- [ ]  [P3javaweb-03：Tomcat详解41:28](https://www.bilibili.com/video/BV12J411M7Sj?p=3)

## Tomcat

### Tomcat下载

1. 官网：[http://tomcat.apache.org/](http://tomcat.apache.org/)
2. 下载Tomcat10：[https://tomcat.apache.org/download-10.cgi](https://tomcat.apache.org/download-10.cgi) （64-bit Windows zip (pgp, sha512)）
    - 注意`tar.gz`指linux下载包
3. 解压，把文件夹放到对的位置（比如environment中）

### 文件夹作用

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%206.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%206.png)

### 启动，关闭Tomcat

- 启动：双击`C:\MyProgram\Environment\apache-tomcat-10.0.5\bin\startup.bat`
- 访问：[http://localhost:8080/](http://localhost:8080/)
- 关闭
    - 方法1：关闭terminal
    - 方法2：双击运行`shutdown.bat`
    - 关闭之后无法访问
- 可能遇到问题：
    - 闪退：java环境没有配置
    - 闪退：需要配置兼容性（系统）
    - 乱码问题：配置文件设置，需要改bin中startup.bat文件

### 配置

- 配置核心文件：

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%207.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%207.png)

- 如果想改变port端口号，直接改配置文件`server.xml`：`port="8080"` 即可
- 如果想改localhost（主机的名称）:
    - 注意，不要改Engine，否则会报错
        - 默认的主机名：localhost, 等价于127.0.0.1

        ```xml
        <?xml version="1.0" encoding="UTF-8"?>
        ...
            <Connector port="8080" protocol="HTTP/1.1"
                       connectionTimeout="20000"
                       redirectPort="8443" />
        ...
            <Engine name="Catalina" defaultHost="localhost">
        ...
              <Host name="localhost"  appBase="webapps"
                    unpackWARs="true" autoDeploy="true">
        ...
        ```

    - 要改，就该`host` 中的 `name="localhost"`

        同时需要配合变更下面的系统文件

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%208.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%208.png)

        插入新的名称

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%209.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%209.png)

- 还可以修改web app储存的地址，默认是`appBase="webapps"` ，代表储存在webapps文件

### web应用储存位置

- 全部储存在webapps下
- 注意其中每一个folder都是一个独立的web app, Tomcat自带了5个web app

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2010.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2010.png)

- 比如，root这个web app内容如下
    - index.jsp就是主页

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2011.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2011.png)

### 默认端口号

- tomcat：8080
- mysql: 3306
- http: 80
- https: 443
- request 会发送精确到`port`

### 网站如何进行网站

- user输入url，点击回车(发起了request，比如www.baidu.com)
1. 检查客户的配置文件有没有关于这个url域名的映射map
    - client客户端里面有 hosts配置文件
    - 比如windows就是在`C:\Windows\System32\drivers\etc\hosts`
2. 根据是否有url域名配置
    - 如果有，直接返回对应的ip地址 (这个地址中有需要访问的web程序，可以直接访问)

        ```java
        #ip对应域名
        127.0.0.1       www.qinjiang.com 
        ```

    - 如果没有，去DNS服务器找,找到就显示，找不到就显示找不到
        - DNS服务器不在本机，需要联网（在网络上找）
        - DNS管理全世界的域名，能通过域名找到ip

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2012.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2012.png)

### 其他可做的事情

配置一下环境变量，以直接用terminal运行（可选）

### 发布一个web网站

- 不会，可以先模仿
- 将自己写的网站，放到服务器Tomcat中指定的web应用文件夹中（这里是webapps）,就可以访问了
- 网站的结构样例

    ```java
    -- webapps: Tomcat 服务器的web目录
    	- ROOT
    	- ...(各种web文件夹)
    	- stock-test (自己新建的测试文件夹)
    		- index.html或index.jsp（一样）
    		- WEB-INF (放网站程序)
    			- classes: java程序
    			- lib：web应用依赖的jar包
    			- web.xml: 网站配置文件
    		- static
    			- css
    				- style.css
    			- js
    			- img
    			- ...
    ```

- 开启
    - 运行start.bat文件开启，然后用下面的目录打开网站：

    ```java
    http://localhost:8080/stock-test/
    ```

    - 其他例子

    ```java
    http://localhost:8080/examples/jsp/
    http://localhost:8080/docs/
    ```

## HTTP

- [ ]  [P4javaweb-04：Http讲解31:05](https://www.bilibili.com/video/BV12J411M7Sj?p=4)

### 什么是HTTP

- 超文本传输协议（Hypertext Transfer Protocol，HTTP）
- HTTP是一个简单的请求-响应协议，它通常运行在TCP之上
- 超文本：
    - 文本：html,字符串
    - 超文本:图片，音乐，视频，定位，地图，...
- http默认端口80
- https（s：security）默认端口443

### http两个时代

- http 1.0
    - HTTP/1.0
    - 客户端与web服务器连接后，只能获得一个web资源
    - 第二次请求一个web资源就请求不到了（断开连接了），需要重新连接
- http 2.0
    - HTTP/2.0
    - 客户端与web服务器连接后，可以获得多个web资源

### http请求

- request，客户端向服务器发起
- 百度request的general（general是request, response 都有的）：

    ```java
    Request URL: https://www.baidu.com/ # request地址
    Request Method: GET # request方法，一般是get或post方法
    Status Code: 200 OK # status code
    Remote Address: 104.193.88.77:443 # 远程地址，PORT
    Referrer Policy: strict-origin-when-cross-origin # 协议
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2013.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2013.png)

- 百度request header

    ```java
    Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9 # 类型
    Accept-Encoding: gzip, deflate, br # 类型
    Accept-Language: zh-CN,zh;q=0.9,en;q=0.8 # 语言
    Cache-Control: max-age=0
    Connection: keep-alive
    Cookie: BAIDUID=8D2AA8129EB2E7305CD88A646EEDF7FE:FG=1; BAIDUID_BFESS=8D2AA8129EB2E7305CD88A646EEDF7FE:FG=1; __yjs_duid=1_9273cc554864aceed84dec5a2ca6e7ca1618010334798; BIDUPSID=8D2AA8129EB2E7305CD88A646EEDF7FE; PSTM=1619805322; ab_sr=1.0.0_OTM5NzNkZDNlZGNmNGZiNjc1YmFlZmRkOGFmODNkOGI0YWUxY2Q4YTJlMTE0NmY0MDEyM2QzNGIzMDlhZTY3ZTAzMDRhODhhZTUwOTRjZWFiZGYzMDY5N2FiYmViYzJm; BD_HOME=1; H_PS_PSSID=33802_33970_31253_33848_33607; BD_UPN=12314753; BA_HECTOR=0kak8g0500a0240hgs1g9mo8a0r
    Host: www.baidu.com
    Sec-Fetch-Dest: document
    Sec-Fetch-Mode: navigate
    Sec-Fetch-Site: none
    Sec-Fetch-User: ?1
    Upgrade-Insecure-Requests: 1
    User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.190 Safari/537.36
    ```

    重点内容

    ```java
    Accept: text/html
    Accept-Encoding: gzip, deflate, br # 类型
    Accept-Language: zh-CN,zh;q=0.9,en;q=0.8 # 语言
    Cache-Control: max-age=0
    Connection: keep-alive
    ```

### 请求行

- 这里指general中的`Request URL` 主要控制请求的协议

    ```java
    Request URL: https://dss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/font/iconfont-d312d35c5b.woff2
    ```

- 请求行中的请求方式：GET
- 请求方式： GET/POST(目前是RESTFUL风格，比如HEAD, DELETE, PUT, TRACT, ...)
    - GET: request能携带的参数比较少，大小有限制，会在浏览器URL地址栏显示数据内容，不安全，但是高效（SLOW 3G可以看到区别，不过现在5G，不在乎了）

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2014.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2014.png)

    - POST: request能携带的参数没有限制，大小没有限制，不会在浏览器URL地址栏显示数据内容，安全，但不高效

### 消息头

```java
Accept: 告诉浏览器支持的数据类型
Accept-Encoding: 告诉浏览器支持哪种编码格式，GBK, UTF-8, GB3212, ISO8859-1
Accept-Language: 告诉浏览器语言环境
Cache-Control: 缓存控制
Connection: 告诉浏览器请求完成是断开还是保持连接
HOST: 主机
```

### http响应

- response，服务器响应给客户端
- 百度response header

    ```flow
    Bdpagetype: 1 # 大部分没用，就是固定的id，服务器返回的，用来监控电脑
    Bdqid: 0xe5a547670001691d
    Cache-Control: private # 缓存控制
    Connection: keep-alive # 连接
    Content-Encoding: gzip # 编码
    Content-Type: text/html;charset=utf-8 # 类型
    Date: Wed, 12 May 2021 05:01:12 GMT
    Expires: Wed, 12 May 2021 05:00:53 GMT
    Server: BWS/1.1 # 浏览器的服务
    Set-Cookie: BDSVRTM=0; path=/ # cookie相关的
    Set-Cookie: BD_HOME=1; path=/
    Set-Cookie: H_PS_PSSID=33802_33970_31253_33848_33607; path=/; domain=.baidu.com
    Strict-Transport-Security: max-age=172800
    Traceid: 1620795672054633908216547710913550051613
    Transfer-Encoding: chunked
    X-Ua-Compatible: IE=Edge,chrome=1 # 设置浏览器的响应兼容性
    ```

    重点

    ```java
    Cache-Control: private # 缓存控制
    Connection: keep-alive # 连接
    Content-Encoding: gzip # 编码
    Content-Type: text/html;charset=utf-8 # 类型
    ```

### 响应体

```java
Accept: 告诉浏览器支持的数据类型
Accept-Encoding: 告诉浏览器支持哪种编码格式，GBK, UTF-8, GB3212, ISO8859-1
Accept-Language: 告诉浏览器语言环境
Cache-Control: 缓存控制
Connection: 告诉浏览器请求完成是断开还是保持连接
HOST: 主机
Refresh: 告诉客户端多久刷新一次
Location：让网页重新定位
```

### 响应状态码

- 200 请求响应成功
- 3** 请求重定向
    - 重定向：你重新到我的新位置
- 404 找不到（不是错误）
- 4** 资源不存在
- 5** 服务器代码错误
- 502 网关错误

### 常见面试题

- 当浏览器中的地址栏输入的地址并回车的一瞬间到页面能够展示回来，经历了什么

## Maven

- [ ]  [P5javaweb-05：Maven环境搭建22:05](https://www.bilibili.com/video/BV12J411M7Sj?p=5)

### 为什么需要学习Maven

- 在Javaweb开发中，需要用大量的jar包，我们要手动导入
- Maven: 自动导入，配置jar包

### Maven

- Maven是一个项目架构管理工具
- 目前用来方便导入jar包
- Maven核心思想：约定大于配置
    - 有约束，不要违反
- Maven会规定好如何编写java代码，必须按照这个规范来

### 下载安装maven

- 官网：[https://maven.apache.org/](https://maven.apache.org/)
- 下载：[https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
    - binary 已生成
    - source 源码
    - tar.gz linux使用
    - zip windows使用
    - windows下载：apache-maven-3.8.1-bin.zip

### maven配置

- 配置文件：`apache-maven-3.8.1\conf\settings.xml`
    - 可以配置server, proxies, mirros(镜像，方便下载，访问外网非常慢，翻墙)，profiles（环境）
    - 默认什么都没配置
- System Variables配置环境变量
    - M2_HOME
        - maven下bin目录
        - C:\MyProgram\Environment\apache-maven-3.8.1\bin
    - MAVEN_HOME
        - maven目录
        - C:\MyProgram\Environment\apache-maven-3.8.1
    - Path中，配置
        - %MAVEN_HOME%\bin

    因为之后用的自动依赖系统，自动比如Springboot，就用了这个var

- 查看配置是否成功
    - mvn是bin下的文件

    ```java
    mvn -version
    ```

### 修改阿里云镜像（for China Users）

- mirros： 加速下载
- 国内建议阿里云的mirror
    - 直接google、百度 maven 阿里云镜像

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2015.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2015.png)

### 本地仓库

- local建立一个repo
    - 在maven包中，建立一个maven-repo的repo

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2016.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2016.png)

    - 配置到settings中

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2017.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2017.png)

- 也有远程repo

- [ ]  [P6javaweb-06：IDEA中Maven的操作50:44](https://www.bilibili.com/video/BV12J411M7Sj?p=6)

### 在IDEA中用Maven

- 启动idea
- 创建maven项目
    - create new project
    - 选择Maven，然后配置好SDK, 选上archetype，以使用maven模板

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2018.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2018.png)

    - 填写GAV
        - groupId：一般公司名称倒着写
        - ArtifactId：项目名

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2019.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2019.png)

    - 设置maven的dir
        - 注意idea有默认的maven，形如bundled (Maven 2),但是因为我配置了maven路径，idea也能识别我自己下载的maven
        - 这里的repo是我在maven里自己建立的

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2020.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2020.png)

- 完成之后，会等待项目启动（需要一段时间初始化）
    - 此时会下载很多东西
    - 要选择enable auto-import

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2021.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2021.png)

    - run完之后，会显示成功

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2022.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2022.png)

        界面会停留在一个xml文件上，如果有红是有问题的，要处理

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2023.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2023.png)

- 观察maven多了什么

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2024.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2024.png)

- Idea中的maven设置

    IDEA经常出一个问题，就是自动创建完成后，MavenHome又改成了IDEA默认的，此时需要手动改回local配置好的位置（习惯在创完maven项目后，去看一眼！）

    - file-settings-build tools-maven

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2025.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2025.png)

    - 左边的一系列的都可以配置
        - 可以选择自动导入源码-sources（java是class文件，要导入的是java文件）
        - 文档比较大

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2026.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2026.png)

- 完成了！结构浏览：

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2027.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2027.png)

### 创建一个普通的maven项目（进行对比）

- 新建项目

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2028.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2028.png)

- 基础结构
    - xml是初始的配置文件

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2029.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2029.png)

### 对比后发现上面web app模板生成的需要加一些东西

- 在main中新建
    - java（标记为Sources）
    - resources（标记为resources）
- 对标记的理解：

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2030.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2030.png)

- 打开project structure
    - file-project structure

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2031.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2031.png)

    - excluded: 由java文件生成的class文件储存位置

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2032.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2032.png)

### 处理junit问题

我没遇到这个问题，不确定下面的时候可行

- pom.xml代码中junit没下载

    ```xml
    <dependencies>
      <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
      </dependency>
    </dependencies>
    ```

- 去掉下面的自动开始下载

    ```xml
    <version>4.11</version>
    <scope>test</scope>
    ```

### 在IDEA中配置Tomcat

- 打开Run configuration, 点击➕，增加Tomcat模板

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2033.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2033.png)

    点击Tomcat Server， 如果没有找到，需要下载Tomcat插件

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2034.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2034.png)

- （老师）创建
    1. 创建tomcat app

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2035.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2035.png)

    2. 处理warning, 添加artifact

        出现warning，点进去deployment增加artifact（需要一个网站所在的folder进行访问，artifact就是那个folder）-

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2036.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2036.png)

    3. 添加虚拟映射

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2037.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2037.png)

- 创建（我，用smart tomcat 而不是tomcat server）
    1. 先要手动添加tomcat server, 选定local下载的tomcat包

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2038.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2038.png)

- 完成configuration，点击绿色button去run!

    ```bash
    13-May-2021 18:52:25.946 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Server version name:   Apache Tomcat/10.0.5
    13-May-2021 18:52:25.947 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log OS Name:               Windows 10
    13-May-2021 18:52:25.948 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Java Home:             C:\MyProgram\Environment\Java\jdk1.8\jre
    13-May-2021 18:52:25.948 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log CATALINA_BASE:         C:\Users\sunka\.SmartTomcat\JavaWeb\javaweb-01-maven
    13-May-2021 18:52:25.952 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Dfile.encoding=UTF-8
    ...
    13-May-2021 18:52:27.226 INFO [main] org.apache.coyote.AbstractProtocol.init Initializing ProtocolHandler ["http-nio-8080"]
    ...
    13-May-2021 18:52:30.072 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-8080"]
    13-May-2021 18:52:30.115 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in [2822] milliseconds
    ```

- 因为我配置的端口为8080，app名称是javaweb-01-maven, 所以如下link可以进入

    ```css
    http://localhost:8080/javaweb-01-maven/
    ```

### maven project理解

- 结构
    - 比如clean就是清理target

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2039.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2039.png)

### pom.xml文件

- pom.xml是Maven核心配置文件，详细解释如下

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>

    <!--header 文件-->
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>

      <!--这里就是刚刚配置的GAV-->
      <groupId>com.kaitan</groupId>
      <artifactId>javaweb-01-maven</artifactId>
      <version>1.0-SNAPSHOT</version>
      <!--package项目的打包方式
        - jar: java应用
        - war: javaWeb应用
      -->
      <packaging>war</packaging>
      <!--这以上是自动生成的-->
      <!--这以下是干净项目中没有的内容了-->

      <!--name和url可以不要-->
      <name>javaweb-01-maven Maven Webapp</name>
      <!-- FIXME change it to the project's website -->
      <url>http://www.example.com</url>

      <!--配置-->
      <properties>
        <!--降魔的默认构建encoding-->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <!--编码版本-->
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
      </properties>

      <!--项目依赖，跟右边maven project框中的dependencies一致-->
      <dependencies>
        <!--具体的jar包配置文件-->
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.11</version>
        </dependency>
      </dependencies>

      <!--项目构建用的，包含插件，都可以删掉-->
      <build>
        <finalName>javaweb-01-maven</finalName>
        <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
          <plugins>
            <plugin>
              <artifactId>maven-clean-plugin</artifactId>
              <version>3.1.0</version>
            </plugin>
            <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
            <plugin>
              <artifactId>maven-resources-plugin</artifactId>
              <version>3.0.2</version>
            </plugin>
            <plugin>
              <artifactId>maven-compiler-plugin</artifactId>
              <version>3.8.0</version>
            </plugin>
            <plugin>
              <artifactId>maven-surefire-plugin</artifactId>
              <version>2.22.1</version>
            </plugin>
            <plugin>
              <artifactId>maven-war-plugin</artifactId>
              <version>3.2.2</version>
            </plugin>
            <plugin>
              <artifactId>maven-install-plugin</artifactId>
              <version>2.5.2</version>
            </plugin>
            <plugin>
              <artifactId>maven-deploy-plugin</artifactId>
              <version>2.8.2</version>
            </plugin>
          </plugins>
        </pluginManagement>
      </build>
    </project>
    ```

- dependencies

    在pom.xml中添加dependency会自动trigger右边maven project中的dependency同步下载，删除也一样

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2040.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2040.png)

### 与干净项目对比

- 干净web app 的pom.xml

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>

        <groupId>javaweb-01-maven-b</groupId>
        <artifactId>javaweb-01-maven-b</artifactId>
        <version>1.0-SNAPSHOT</version>

    </project>
    ```

- 发现干净版没有dependencies, 可以直接复制code过去

### 如何查找maven dependency代码

- 直接搜索maven仓库/maven repository
- 然后在platform搜索需要的jar包，选择所需的版本

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2041.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2041.png)

- 然后就能看到对应的maven代码了
    - 不需要下载jar包，直接复制code即可

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2042.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2042.png)

    - 把代码放到dependencies中，自动trigger下载

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2043.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2043.png)

Maven高级之处是 帮助你导入 所需jar包依赖的其他jar包

### maven-tree目录树

- 选择dependencies，然后点击tree

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2044.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2044.png)

- 可以看到整个项目的dependencies（jar包）结构

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2045.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2045.png)

- [ ]  [P7javaweb-07：解决大家遇到的一些问题41:10](https://www.bilibili.com/video/BV12J411M7Sj?p=7)

### Maven遇到的问题

1. 无法导入(Maven 3.6.2)
    - 报错：unable to import maven project（see logs for the detials）
        - IDEA中查看log的方法：

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2046.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2046.png)

        - error分析：这个是由于一个jar包兼容性的问题，版本较新，没有什么有效信息

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2047.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2047.png)

    - 建议：jdk12换成jdk8
    - 解决方法：降级改成3.6.1（根据网友反馈3.6.3没有问题）
2. Tomcat闪退
    - 问题：就是点击tomcat-bin-startup.bat文件（batch file, 程序文件，类似shell file）的时候，闪退
    - debug过程：打开startup.bat文件，逐行读，发现tomcat通过`JAVA_HOME`, `JRE_HOME`依赖java环境

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2048.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2048.png)

    - 闪退原因：没有配置`JAVA_HOME`, `JRE_HOME`
    - tips:可以在bat文件中增加pause代码，即错误的时候可以暂停，看下错误
3. IDEA中每次都要重新配置Maven
    - 解决方法：在idea中的全局默认配置中，去配置Maven

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2049.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2049.png)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2050.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2050.png)

4. Maven项目中Tomcat无法配置
5. Maven默认web项目中的web.xml版本问题
    - 默认生成的版本：

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2051.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2051.png)

    - 重要参考：可以去tomcat-webapps-ROOT应用查看`web.xml`文件，这个比较标准！

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2052.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2052.png)

    - 解决方法：把web.xml中版本替换为tomcat对应的版本

### 尝试跟着tomcat例子写一个web app

1. 进入helloworld这个web app,查看source code:

    ```java
    // Source Code for HelloWorld Example
    import java.io.*;
    import jakarta.servlet.*;
    import jakarta.servlet.http.*;

    public class HelloWorld extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException
        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello World!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello World!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    ```

2. 自己仿写 java/HelloServlet.java

    ```java
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    import java.io.PrintWriter;

    public class HelloServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
            //response的类型（返回）html
            response.setContentType("text/html");
            //获取response的输出流,获取输出流就可以输出东西到网页了
            PrintWriter out = response.getWriter(); //getWriter字符流, getOutputStream字节流
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello World!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello World!</h1>");
            out.println("</body>");
            out.println("</html>");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            super.doPost(req, resp);
        }

    }
    ```

3. 配置`web.xml`
    - `web.xml` 配置web的核心应用
    - 注册servlet

        ```xml
        <!DOCTYPE web-app PUBLIC
         "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
         "http://java.sun.com/dtd/web-app_2_3.dtd" >

        <web-app>
          <display-name>Archetype Created Web Application</display-name>

          <!--注册servlet-->
          <servlet>
              <servlet-name>helloServlet</servlet-name>
              <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
          </servlet>

          <!--一个servlet对应一个mapping（映射）-->
          <servlet-mapping>
            <servlet-name>helloServlet</servlet-name> <!--跟上面的servlet-name一致-->
            <url-pattern>/kaitan</url-pattern> <!--映射的请求路径,map到上面的class,即可以调用class内的get, post函数了-->
          </servlet-mapping>
        </web-app>
        ```

4. 连接
    - 此时比如新建一个header放到webapp里，然后run这个app，通过下面的link就可以连过来了

        [`http://localhost:8080/javaweb-01-maven/header.html`](http://localhost:8080/javaweb-01-maven/header.html)

    - 两种方式访问主页
        1. 静态方式，使用webapp的名称，自动指向index[`http://localhost:8080/javaweb-01-maven/`](http://localhost:8080/javaweb-01-maven/)
        2. 动态方式，根据url映射map 到指定的class（`com.kaitan.servlet.HelloServlet`），然后根据这个class定义的方法进行访问。因为用mapping设定url为`/kaitan`, 所以想进index的话，使用下面的link就好了：
        [`http://localhost:8080/javaweb-01-maven/kaitan`](http://localhost:8080/javaweb-01-maven/kaitan)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2053.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2053.png)

    - 因为是浏览器request访问，都是get方法（只有表单是post），所以走的是doGet的请求
5. 查看真正的request
    - Java默认encoding：ISO-8859-1

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2054.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2054.png)

    - 查看response（响应体）

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2055.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2055.png)

    - 如果要成功输出中文，需要设置encoding，否则沿用默认ISO-8859-1,只能显示？？

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2056.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2056.png)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2057.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2057.png)

### 使用servlet走映射tomcat 10可能出现500报错

- 方法1：下载tomcat 9（实践成功）
- 方法2：（没能实践成功）需要maven导入 tomcat servlet api

    ```xml
    <dependency>
      <groupId>org.apache.tomcat</groupId>
      <artifactId>tomcat-servlet-api</artifactId>
      <version>10.0.6</version>
    </dependency>
    ```

### Maven repository

- 官网：[https://mvnrepository.com/](https://mvnrepository.com/)
- 下载方法一：

    HttpServlet包没加载，可以alt+enter选择add maven dependency（然后选择search for artifact, 找到相应jar包）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2058.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2058.png)

- 下载方法二：

    争取找到明确的包名：

    1. 可以看看java文件中import的 那几个有没有
    2. 如果tomcat可以，直接去tomcat的lib看看有哪些servlet相关的包
    3. 回到maven官网进行包名搜索，一般下载量特别大的那个就是对的

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2059.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2059.png)

    4. 从官网进入包之后，同理，找到下载人数比较多的那个版本下载比较安全

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2060.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2060.png)

    5. 选择版本后，复制maven代码就好了

    ```xml
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>3.0-alpha-1</version>
    </dependency>
    ```

## Servlet

- [ ]  [P8javaweb-08：HelloServlet37:46](https://www.bilibili.com/video/BV12J411M7Sj?p=8)

### Servlet

- Servlet是sun公司开发的 动态web的一门技术
- sun公司在这些API中提供了一个接口，叫做servlet
- 如果想开发一个Servlet程序（动态web），只需要完成两个小步骤
    1. 编写一个类，实现Servlet接口
    2. 把开发好的java类部署到web服务器中
- 把实现了servlet接口的程序叫做 servlet

### Servlet接口-两个实现类

- 两个实现类
    1. HttpServlet
    2. GenericServlet 
- 关系
    - 我们自己的类继承HttpServlet
    - HttpServlet 接口继承 GenericServlet
    - GenericServlet  继承Servlet

    ```java
    public abstract class HttpServlet extends GenericServlet { ... }
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2061.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2061.png)

- Servlet接口
    - 重点service：`void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;`

    ```java
    package javax.servlet;

    import java.io.IOException;

    public interface Servlet {
        void init(ServletConfig var1) throws ServletException;

        ServletConfig getServletConfig();

    		
        void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

        String getServletInfo();

        void destroy();
    }
    ```

- GenericServlet 类
    - 重点service：`public abstract void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;` 并无重写，还是维持Servlet接口的方法
- HttpServlet
    - 重点service：重写了service，其实就是按照method （post, get, head ...）等来执行相应的 doPost, doGet, doHead, ...

        这些方法（doPost, doGet, doHead, ...）有在HttpServlet中定义，但是默认没用，user需要overwrite这些方法达到指定效果！用不到的方法就不用overwrite了

        ```java
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String method = req.getMethod();
                long lastModified;
                if (method.equals("GET")) {
                    lastModified = this.getLastModified(req);
                    if (lastModified == -1L) {
                        this.doGet(req, resp);
                    } else {
                        long ifModifiedSince = req.getDateHeader("If-Modified-Since");
                        if (ifModifiedSince < lastModified) {
                            this.maybeSetLastModified(resp, lastModified);
                            this.doGet(req, resp);
                        } else {
                            resp.setStatus(304);
                        }
                    }
                } else if (method.equals("HEAD")) {
                    lastModified = this.getLastModified(req);
                    this.maybeSetLastModified(resp, lastModified);
                    this.doHead(req, resp);
                } else if (method.equals("POST")) {
                    this.doPost(req, resp);
                } else if (method.equals("PUT")) {
                    this.doPut(req, resp);
                } else if (method.equals("DELETE")) {
                    this.doDelete(req, resp);
                } else if (method.equals("OPTIONS")) {
                    this.doOptions(req, resp);
                } else if (method.equals("TRACE")) {
                    this.doTrace(req, resp);
                } else {
                    String errMsg = lStrings.getString("http.method_not_implemented");
                    Object[] errArgs = new Object[]{method};
                    errMsg = MessageFormat.format(errMsg, errArgs);
                    resp.sendError(501, errMsg);
                }

            }
        ```

### HelloServlet

1. 构建一个普通maven项目
    - 不选择模板
    - 删掉里面的src内容（.idea和*.iml是idea识别文件，不能删除；pom.xml是maven配置文件也不能删除）
2. 导入dependencies
    - 以后我们学习的就在这个项目里建立module,这个空工程就是maven 的主工程，所以可以尽量把dependencies 放到pom.xml,这样modules也可以用了（不用重复了）
    - maven不知道用什么dependencies,可以搜索maven servlet, jsp 依赖。。。
    - 向pom.xml导入dependencies
        - 如果无法通过code导入，可以手动下载，然后通过idea -maven-local上传

        ```xml
        <!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
            <scope>provided</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api -->
        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>javax.servlet.jsp-api</artifactId>
            <version>2.3.1</version>
            <scope>provided</scope>
        </dependency>
        ```

3. 在folder中new一个新module，此时选择maven-webapp模板

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2062.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2062.png)

4. 将新建的子module 的web.xml换成新版的

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>

    <web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee
                          https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd"
             version="5.0"
             metadata-complete="true">

    </web-app>
    ```

5. 建成maven结构
    - 在main中插入java, mark as source
    - 在main中插入resources, mark as resource
6. 编写一个Servlet程序
    - 在java中增加package - com.kaitan.servlet，在里面建立一个普通class（比如HelloServlet）
    - 实现Servlet接口，这里我们直接继承HttpServlet
    - 然后重写HttpServlet中的方法（overwrite: `ctrl`+`o`）
        - 一般只会用到doPost, doGet
        - 因为get, post只是request 实现的不同方式，可以相互调用，业务逻辑都一样（一般直接写一个方法就行，然后另一个去调用ta）
    - 然后写上doGet（或doPost）方法，获取response流

        ```java
        public class HelloServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("hello this is doGet");
                // req.getInputStream()
                // ServletOutputStream outputStream = resp.getOutputStream();
                PrintWriter writer = resp.getWriter(); //response stream
                writer.print("Hello, Servlet");
            }

            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
        }
        ```

7. 编写Servlet映射mapping
    - 为什么要mapping：我们写的是java程序，但是要通过浏览器访问，而浏览器需要连接web服务器，所以我们需要在web服务器中注册我们写的Servlet，还需要给他一个浏览器能访问的路径
    - 在web.xml配置mapping

        ```java
        <servlet>
            <servlet-name>hello</servlet-name>
            <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>hello</servlet-name>
            <url-pattern>/hello</url-pattern>
        </servlet-mapping>
        ```

8. 配置tomcat
    - 去configuration, 配置好tomcat版本， JRE,port等...
9. run! 检查
    - 输入映射地址 [`http://localhost:8080/servlet-01/hello`](http://localhost:8080/servlet-01/hello)
    - 发现确实，而且在console中显示了我们要求print的 `hello this is doGet` （writer.print("Hello, Servlet");）

### writer

- writer.print
- writer.append
- write.flush刷新

### 关于Maven parent-child工程理解:

- 在parent 的pom.xml 项目中会有一个child module

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>

        <groupId>com.kaitan</groupId>
        <artifactId>javaweb-02-servlet</artifactId>
        <packaging>pom</packaging>
        <version>1.0-SNAPSHOT</version>
        <modules>
            <module>servlet-01</module>
        </modules>
    ...
    ```

- 在child的pom.xml 中会有一个parent module

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <parent>
            <artifactId>javaweb-02-servlet</artifactId>
            <groupId>com.kaitan</groupId>
            <version>1.0-SNAPSHOT</version>
        </parent>
    ...
    ```

- parent项目中的java包子项目可以使用，反之不行

    类似下面的，child继承parent方法，可以使用，反之不行

    ```java
    child extends parent
    ```

- [ ]  [P9javaweb-09：Servlet原理25:20](https://www.bilibili.com/video/BV12J411M7Sj?p=9)

## Servlet原理

- Servlet是由web服务器调用
- web容器就是tomcat，里面返回两个东西：
    - Request：包括request体，request header
    - Response：包括response体，response header
- web服务器在收到浏览器request之后
    - 首次访问的时候，会将java程序转成class去运行，可能会比较慢
- web容器（tomcat）调用Servlet的service方法，处理request, response（作为input parameter）

    request会从service(request,)拿到request，运行service中自己重写的Java程序-实现类，并把request相应的响应交给response，返回到web容器，web容器拿到response之后响应给给浏览器

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2063.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2063.png)

### mapping问题

- 一个Servlet可以指定一个mapping路径

    ```xml
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
    ```

- 一个Servlet可以指定多个mapping路径
    - test：[`http://localhost:8080/servlet-01/hello3`](http://localhost:8080/servlet-01/hello3) 可以访问

    ```xml
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello1</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello2</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello3</url-pattern>
    </servlet-mapping>
    ```

- 一个Servlet可以指定通用mapping路径
    - test：[`http://localhost:8080/servlet-01/hello/aadapokd`](http://localhost:8080/servlet-01/hello/aadapokd) 可以访问

    ```xml
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello/*</url-pattern>
    </servlet-mapping>
    ```

- 默认请求路径
    - 本身默认是index.html，而不是com.kaitan.servlet.HelloServlet
    - 但如果这么去写，会显示Servlet，而不是index（建议不要这么写）

    ```xml
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>
    ```

- 测试自定义后缀
    - 注意: `/*.kaitan` 会报错，也不能写`/hello/*.kaita`

        ```xml
        <servlet>
            <servlet-name>hello</servlet-name>
            <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>hello</servlet-name>
            <url-pattern>/*.kaitan</url-pattern>
        </servlet-mapping>
        ```

    - 但`*.kaitan` 可以运行
        - test [`http://localhost:8080/servlet-01/ssadasd.kaitan`](http://localhost:8080/servlet-01/ssadasd.kaitan)
        - 前面再加dir也可以运行：[`http://localhost:8080/servlet-01/hello/ssadasd.kaitan`](http://localhost:8080/servlet-01/hello/ssadasd.kaitan)

        ```xml
        <servlet>
            <servlet-name>hello</servlet-name>
            <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>hello</servlet-name>
            <url-pattern>*.kaitan</url-pattern>
        </servlet-mapping>
        ```

- 优先级问题
    - 比如如果建立了一个error class：

        ```java
        public class ErrorSevlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.setContentType("text/html");
                resp.setCharacterEncoding("utf-8");

                PrintWriter writer = resp.getWriter();
                writer.print("<h1>404</h1>");
            }

            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
        }
        ```

    - 目前有两个class配置

        ```xml
        // hello
        <servlet>
                <servlet-name>hello</servlet-name>
                <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
            </servlet>
            <servlet-mapping>
                <servlet-name>hello</servlet-name>
                <url-pattern>/hi</url-pattern>
            </servlet-mapping>
        <servlet>

        // error
        <servlet-name>error</servlet-name>
            <servlet-class>com.kaitan.servlet.ErrorSevlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>error</servlet-name>
            <url-pattern>/*</url-pattern>
        </servlet-mapping>
        ```

    - 哪个class优先？
        - `[http://localhost:8080/servlet-01/h1](http://localhost:8080/servlet-01/h1)` 执行了hello，即使error设置了`/*`
        - 优先级：指定的固有mapping优先级最高 （优于通配符*）

- [ ]  [P10javaweb-10：ServletContext对象27:39](https://www.bilibili.com/video/BV12J411M7Sj?p=10)

### 新建第二个module

- 注意配置configuration-tomcat的时候，需要指定第二个module 的webapp位置（或者要删除第一个Module的config）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2064.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2064.png)

- 删除第一个module config的好处是，只打包所在module需要jar包，快捷

    （kuangshen界面）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2065.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2065.png)

- [ ]  [P11javaweb-11：ServletContext应用30:07](https://www.bilibili.com/video/BV12J411M7Sj?p=11)

### servlet对象的方法

- 在HttpServlet中，有一些重要方法
    - `getServletContext()` 返回ServletContext

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2066.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2066.png)

- 获得初始化参数 中的参数 可以在web.xml上配置，一般由`<>` 开启，下面都是例子
    - context-param上下文参数
    - data-source
    - error-page
    - filter-mapping
    - jsp-config
    - listener

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2067.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2067.png)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2068.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2068.png)

### ServletContext

- ServletContext：web容器（tomcat）在启动的时候，ta会为每个web程序都创建一个对应的ServletContext对象，ta代表了当前的web应用（网站就由这个ServletContext应用）
    - 功能：共享数据（在Servlet A保存的数据，可以在Servlet B中拿到）
    - 比如注册信息会延展到所有页面
- 功能：凌驾在所有Servlet之上，可以储存data，帮助Servlet相互之间通信
    - 本身各个Servlet之间相互独立，每个都有自己的url
    - 如果没有context，servlet要想交互data，需要进行IO，即持久化保存到第三方文件（存储，读取），麻烦

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2069.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2069.png)

- 获取

    ```java
    public class HelloServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            ServletContext servletContext = this.getServletContext();
        }
    }
    ```

- 方法

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2070.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2070.png)

### 共享数据 [ServletContext-功能1]

- 保存数据到context的类HelloServlet
    - 可以用setAttribute，将一个java object 存入一个String，类似key-value

        ```java
        ServletContext context = this.getServletContext();
        context.setAttribute("username",username);
        ```

    - 完整版

        ```java
        public class HelloServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                ServletContext context = this.getServletContext();
                String username = "kaitan";// data/object
                context.setAttribute("username",username);
                /*(string, object),将一个object保存在了servletContext中*/
                resp.getWriter().print("name"+username);
            }
        }
        ```

- 新建一个GetServlet的java文件，希望访问到HelloServlet中存到ServletContext的data：
    - 注意要设置response的格式，encoding

        ```java
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        ```

    - 获取context中的data：

        ```java
        ServletContext context = this.getServletContext();/*不同servlet拿到的是同一个servletContext*/
        String username = (String) context.getAttribute("username");
        ```

    - 完整版

        ```java
        public class GetServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                ServletContext context = this.getServletContext();/*不同servlet拿到的是同一个servlet*/
                String username = (String) context.getAttribute("username");
                resp.setContentType("text/html");
                resp.setCharacterEncoding("utf-8");
                resp.getWriter().print("name: "+username);
            }
        }
        ```

- 配置web.xml

    ```xml
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.kaitan.servlet.HelloServlet</servlet-class>
      </servlet>
      <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
      </servlet-mapping>

      <servlet>
        <servlet-name>getc</servlet-name>
        <servlet-class>com.kaitan.servlet.GetServlet</servlet-class>
      </servlet>
      <servlet-mapping>
        <servlet-name>getc</servlet-name>
        <url-pattern>/getc</url-pattern>
      </servlet-mapping>
    ```

- 测试link
    - [`http://localhost:8080/servlet-02/hello`](http://localhost:8080/servlet-02/hello)
    - [`http://localhost:8080/servlet-02/getc`](http://localhost:8080/servlet-02/getc)

注意，如果不运行hello，data不会存储，所有如果运行getc之前没有运行hello,肯定显示不出来内容：`name: null`

### 可以查看ServletContext方法

- 左边侧边栏-structure

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2071.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2071.png)

### 初始化参数 [ServletContext-功能2]

- 在web.xml可以配置初始化参数
    - 比如，配置一个url连接到mysql数据库
    - 注意，格式是`接口：数据库类型：//主机名称：端口号/数据库`

    ```xml
    <!--配置一些web应用的初始化参数-->
    <context-param>
      <param-name>url</param-name>
      <param-value>jdbc:mysql://localhost:3306/mybatis</param-value>
    </context-param>
    ```

- java class中调用

    ```java
    ServletContext context = this.getServletContext();/*不同servlet拿到的是同一个servlet*/
    String url = context.getInitParameter("url");
    resp.getWriter().print(url);
    ```

- 将class注册在web.xml中

    ```xml
    <servlet>
      <servlet-name>getp</servlet-name>
      <servlet-class>com.kaitan.servlet.ServletDemo03</servlet-class>
    </servlet>
    <servlet-mapping>
      <servlet-name>getp</servlet-name>
      <url-pattern>/getp</url-pattern>
    </servlet-mapping>
    ```

- test
    - [`http://localhost:8080/servlet-02/getp`](http://localhost:8080/servlet-02/getp)

### 请求，转发 dispatcher [ServletContext-功能3]

- 请求转发
    - 这里只需要使用`context.getRequestDispatcher("/getp").forward(req,resp);` ，将getp页面forward到本页面

    ```java
    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("This is demo 4");
            ServletContext context = this.getServletContext();/*不同servlet拿到的是同一个servlet*/
    //        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/getp");/*转发的请求路径*/
    //        requestDispatcher.forward(req,resp);//调用forward 实现请求转发
            context.getRequestDispatcher("/getp").forward(req,resp);
        }
    ```

    ```xml
    <servlet>
      <servlet-name>sd4</servlet-name>
      <servlet-class>com.kaitan.servlet.ServletDemo04</servlet-class>
    </servlet>
    <servlet-mapping>
      <servlet-name>sd4</servlet-name>
      <url-pattern>/sd4</url-pattern>
    </servlet-mapping>
    ```

- test
    - [`http://localhost:8080/servlet-02/sd4`](http://localhost:8080/servlet-02/sd4)
    - 显示的页面是[`http://localhost:8080/servlet-02/getp`](http://localhost:8080/servlet-02/getp) 的，因为这里request了`"/getp"` ,直接将`"/getp"` forward给了`/sd4`
    - 注意，url路径显示的仍然是[`http://localhost:8080/servlet-02/sd4`](http://localhost:8080/servlet-02/sd4) 而不是`/getp`

### 请求转发vs重定向

- 目标：A想向C拿资源
- 请求转发: A找到B向B要，B没有去找C，C给B，B再给A
- 重定向：A找到B，B跟A说去找C，于是A去找了C

### 读取资源文件 [ServletContext-功能4]

- 将常用到，会使用properties类
- 传统操作就是用io流-load来读取properties文件

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2072.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2072.png)

- web app没有地址，所以要从web中拿
    - 使用`context.getResourceAsStream`： `/` 代表当前应用
    - 使用 `"/WEB-INF/classes/db.properties"` 注意，不知道为什么我自己这里没有snapshot，所以买看到WEB-INF，但是这么写能work

        ```java
        @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("This is demo 5");
                ServletContext context = this.getServletContext();
                InputStream is = context.getResourceAsStream("/WEB-INF/classes/db.properties");
                Properties prop = new Properties();
                prop.load(is);
                String user = prop.getProperty("username");
                String pwd = prop.getProperty("password");
                resp.getWriter().print(user+" "+pwd);
            }
        ```

    - 老师的：

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2073.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2073.png)

    - 测试:[`http://localhost:8080/servlet-02/sd5`](http://localhost:8080/servlet-02/sd5)

### `properties` 文件存放问题

- 一般将properties文件放在resources下（也可以放在别的地方，只要在main里就行）
- 比如：`/main/resources/db.properties`
- 这个文件会在run maven项目时一起导入，导入到classes中，`resources`的默认路径是`classes`

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2074.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2074.png)

- `classpath`理解：这里的java,resources路径，都属于classpath,生成的结果都会导到classes目录下
    - 即在java中建的properties文件，在resource中建的properties文件，都会出现在Classes路径下，这个路径俗称类路径
- 如果直接在java的package下新建properties文件，发现不能成功加载到target中，这是因为java默认里面都是java文件，下个section描述了这个问题，并提供了解决方案

    ```xml
    <!--（pom.xml）在build中配置resources,来防止我们资源导出失败的问题-->
    <build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <excludes>
                    <exclude>**/*.properties</exclude>
                    <exclude>**/*.xml</exclude>
                </excludes>
                <filtering>false</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>
    ```

### maven的问题

- 由于maven - 约定大于配置，可能遇到 - 自己写的配置文件，无法导出或者生效的问题
- 解决方案：（搜索：maven资源导出问题）

    在build中配置resources，来防止资源导出失败的问题，即添加下面的code

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2075.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2075.png)

- 解释：
    - 在mark as source的java路径下，默认只有java文件，如果配置了其他格式的文件，将无法导出
    - 上面的这段代码的意思是，在directory (src/main/java)中，也要包含`.properties`, `.xml`文件

### ServletContext 4个功能小结

通过ServletContext基本都是底层，之后会学习其他类

1. 共享数据-之后会用session, request,尽量不用ServletContext
2. 获取初始化参数
3. 请求转发- 会用request做
4. 读取资源文件- 之后可能用类加载，反射去做

## 两个parameter（HttpServletRequest，HttpServletResponse）

### 理解

- 响应：web服务器接收到客户端的http请求，针对这个request，分别创建一个代表请求的HttpServletRequest对象，代表响应的一个HttpServletResponse
- 如果要获取客户端request过来的参数，去找HttpServletRequest
- 如果要给客户端响应一些信息，找HttpServletResponse

## HttpServletResponse

- 这个class里面有一些常量，和一些方法

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2076.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2076.png)

### HttpServletResponse对方法的简单分类|
（`public interface HttpServletResponse extends ServletResponse`）

1. 负责向浏览器发送数据的方法

    只有两个方法：

    ```java
    // ServletResponse中的方法
    // 平常的流
    ServletOutputStream getOutputStream() throws IOException;
    // 写中文，可能会造成字符串损失和破坏
    PrintWriter getWriter() throws IOException;
    ```

2. 向浏览器发送响应头response header的方法

    ```java
    // ServletResponse 中的方法
    void setCharacterEncoding(String var1);
    void setContentLength(int var1);
    void setContentLengthLong(long var1);
    void setContentType(String var1);

    // HttpServletResponse 中的方法
    void setDateHeader(String var1, long var2);
    void addDateHeader(String var1, long var2);
    void setHeader(String var1, String var2);
    void addHeader(String var1, String var2);
    void setIntHeader(String var1, int var2);
    void addIntHeader(String var1, int var2);
    ```

3. 响应的状态码（常量）

    ```java
    // HttpServletResponse
    int SC_CONTINUE = 100;
    int SC_SWITCHING_PROTOCOLS = 101;
    int SC_OK = 200;
    int SC_CREATED = 201;
    int SC_ACCEPTED = 202;
    int SC_NON_AUTHORITATIVE_INFORMATION = 203;
    int SC_NO_CONTENT = 204;
    int SC_RESET_CONTENT = 205;
    int SC_PARTIAL_CONTENT = 206;
    int SC_MULTIPLE_CHOICES = 300;
    int SC_MOVED_PERMANENTLY = 301;
    int SC_MOVED_TEMPORARILY = 302;
    int SC_FOUND = 302;
    int SC_SEE_OTHER = 303;
    int SC_NOT_MODIFIED = 304;
    int SC_USE_PROXY = 305;
    int SC_TEMPORARY_REDIRECT = 307;
    int SC_BAD_REQUEST = 400;
    int SC_UNAUTHORIZED = 401;
    int SC_PAYMENT_REQUIRED = 402;
    int SC_FORBIDDEN = 403;
    int SC_NOT_FOUND = 404;
    int SC_METHOD_NOT_ALLOWED = 405;
    int SC_NOT_ACCEPTABLE = 406;
    int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    int SC_REQUEST_TIMEOUT = 408;
    int SC_CONFLICT = 409;
    int SC_GONE = 410;
    int SC_LENGTH_REQUIRED = 411;
    int SC_PRECONDITION_FAILED = 412;
    int SC_REQUEST_ENTITY_TOO_LARGE = 413;
    int SC_REQUEST_URI_TOO_LONG = 414;
    int SC_UNSUPPORTED_MEDIA_TYPE = 415;
    int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    int SC_EXPECTATION_FAILED = 417;
    int SC_INTERNAL_SERVER_ERROR = 500;
    int SC_NOT_IMPLEMENTED = 501;
    int SC_BAD_GATEWAY = 502;
    int SC_SERVICE_UNAVAILABLE = 503;
    int SC_GATEWAY_TIMEOUT = 504;
    int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
    ```

### HttpServletResponse常见应用1-向浏览器输出消息

- 用resp.getWriter()或者resp.getOutputStream()

### HttpServletResponse常见应用2-下载文件

（比如请求地址，就可以下载）

- 步骤
    1. 要获取下载文件的路径（从哪里下载）
    2. 下载的文件名是啥
    3. 想办法让浏览器能够支持下载我们需要的东西
    4. 获取下载文件的输入流
    5. 创建缓冲区
    6. 获取OutputStream对象
    7. 将FileOutputStream流写入到buffer缓冲区
    8. 使用OutputStream对象将缓冲区中的数据输出到客户端！

    ```java
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //        1. 要获取下载文件的路径（从哪里下载）
            String realPath = this.getServletContext().getRealPath("/1.png");
            System.out.println("download path: "+realPath);
            
    //        2. 下载的文件名是啥
    //        这个方法：找到最后一个/，然后再往后一个就是文件名了
            String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);

    //        3. 想办法让浏览器能够支持下载我们需要的东西
    //        注意这个设置可以去google搜索，这里就是支持下载fileName
            resp.setHeader("Content-Disposition","attachment;filename="+fileName);

    //        4. 获取下载文件的输入流
            FileInputStream in = new FileInputStream(realPath);

    //        5. 创建缓冲区
            int len = 0;
            byte[] buffer = new byte[1024];

    //        6. 获取OutputStream对象
    //        类似resp.getWriter()
            ServletOutputStream out = resp.getOutputStream();

    //        7. 将FileOutputStream流写入到buffer缓冲区,
    //           使用OutputStream对象将缓冲区中的数据输出到客户端！
            while((len=in.read(buffer))>0){
                out.write(buffer,0,len);
            }

    //        8. 关闭资源
            in.close();
            out.close();
    }
    ```

- Test：使用getRealPath
    - 测试代码：[`http://localhost:8080/response/down`](http://localhost:8080/response/down) 报错，找不到文件
    - 发现：getRealPath找不到文件

        getRealPath地址如下

        ```java
        download path: C:\Users\sunka\Desktop\learn-java\code\javaweb-02-servlet\response\src\main\webapp\1.png
        ```

        真正的路径其实是

        ```java
        C:\Users\sunka\Desktop\learn-java\code\javaweb-02-servlet\response\src\main\resources\1.JPG
        ```

- Test 路径写死

    ```java
    String realPath = "C:\\Users\\sunka\\Desktop\\learn-java\\code\\javaweb-02-servlet\\response\\src\\main\\resources\\1.JPG";
    ```

    测试发现直接下载成功了！（[`http://localhost:8080/response/down`](http://localhost:8080/response/down)）

- 中文问题
    - 注意，如果文件名称含有中文，依旧可以下载文件，但是文件名称可能变成_

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2077.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2077.png)

    - 解决方案1：用字符流
    - 解决方案2：用URLEncoder进行编码（推荐）

        ```java
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8");
        ```

        - 第一个参数，文件本来的名字
        - 第二个参数，encoding

### HttpServletResponse常见应用3-验证码功能

- 验证码怎么来：
    - 前端实现
    - 后端实现，需要用到java的image图片类,生成一个图片
- code

    ```java
    public class ImageServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //如何让浏览器3s自动刷新一次
            resp.setHeader("refresh","3");

            //在内存中创建一个图片
            BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_BGR);
            //得到图片, 下面的graphics相当于笔
            Graphics2D g = (Graphics2D)image.getGraphics();
            //设置图片的背景颜色,白色的背景框
    				// 当前笔的颜色设置为white，然后用填充功能填满这个框
            g.setColor(Color.WHITE);
            g.fillRect(0,0,80,20);
            //给图片写数据
    				// 再把笔的颜色设置为blue，然后写上去数字
            g.setColor(Color.blue);
            g.setFont(new Font(null,Font.BOLD,20));
            g.drawString(makeNum(),0,20);

            //告诉浏览器，这个请求用图片的方式打开
            resp.setContentType("image/jpeg");
            //网站存在缓存，需要不让缓存
            resp.setDateHeader("expires",-1);
            resp.setHeader("Cache-control","no-cache");
            resp.setHeader("Pragma","no-cache");

            //把图片写给浏览器
            ImageIO.write(image,"jpeg", resp.getOutputStream());
        }

        //生成随机数
        private String makeNum(){
            Random random = new Random();
            String num = random.nextInt(9999999)+"";
            //生成七位数
            //下面的操作就是在位数少于7位的时候，生成一个000..的string：sb，然后填充在数字前面
            //比如 1321300 以凑够7位数
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 7-num.length(); i++) {
                sb.append(0);
            }
            String s = sb.toString() + num;
            return num;
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

- 测试
    - [http://localhost:8080/response/img](http://localhost:8080/response/img)
    - 确实每三秒刷新

- [ ]  [P12javaweb-12：Response下载文件31:42](https://www.bilibili.com/video/BV12J411M7Sj?p=12)
- [ ]  [P13javaweb-13：Response验证码实现21:24](https://www.bilibili.com/video/BV12J411M7Sj?p=13)
- [ ]  [P14javaweb-14：Response重定向22:29](https://www.bilibili.com/video/BV12J411M7Sj?p=14)

### HttpServletResponse常见应用4-重定向

- 重定向：一个web资源（B）收到客户端request之后，通知客户端（A）去访问另外一个web资源（C）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2078.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2078.png)

- 常见场景
    - 用户登录（先访问登陆页面，成功，才跳转另一个页面）
- 代码

    ```java
    void sendRedirect(String var1) throws IOException;
    ```

- 使用1(错误)

    ```java
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/img");
    }
    ```

    测试([`http://localhost:8080/response/redirect`](http://localhost:8080/response/redirect))
    失败，发现这个link缺少了项目字段

    ```java
    http://localhost:8080/img
    ```

- 使用2(正确)

    ```java
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/response/img");
    }
    ```

    自动调整到：[`http://localhost:8080/response/img`](http://localhost:8080/response/img)

- network信息：
    - request的是redirect,status位302表示重定位，location表示指向位置

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2079.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2079.png)

- 使用代码-拆解：

    我们使用

    ```java
    resp.sendRedirect("/response/img");
    ```

    相当于执行了下面两步

    ```java
    resp.setHeader("location","/response/img");
    resp.setStatus(302);
    ```

### 重定向与转发的区别

- 相同点
    - 页面都会实现跳转
- 不同点
    - 请求转发的时候，url不会发生变化 `307`
    - 重定向的时候，url地址会发生变化 `302`

### Demo-request表单

- index.jsp
    - 写一个表单，method位get，然后action是新的地址
    - `${pageContext.request.contextPath}`代表当前项目（推荐写法）

    ```html
    <html>
    <body>
    <h2>Hello World!</h2>

    <%--这里提交的路径，需要找寻项目的路径--%>
    <%--${pageContext.request.contextPath}代表当前项目（推荐写法）--%>

    <form action="${pageContext.request.contextPath}/login" method="get">
        username: <input type="text" name = "username"> <br>
        password: <input type="password" name="password"> <br>
        <input type="submit">
    </form>

    </body>
    </html>
    ```

- 记得导入javax.servlet.jsp包

    ```html
    <!-- https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api -->
    <dependency>
        <groupId>javax.servlet.jsp</groupId>
        <artifactId>javax.servlet.jsp-api</artifactId>
        <version>2.3.3</version>
        <scope>provided</scope>
    </dependency>
    ```

- test
    - [`http://localhost:8080/response/`](http://localhost:8080/response/)
    - 发现url成功进入了login那页面，[`http://localhost:8080/response/login?username=asd&password=asdasd`](http://localhost:8080/response/login?username=asd&password=asdasd) ，因为使用的是get提交，所以参数可见
- 如果登陆成功，redirect到success界面：
    - 在webapp下新建立一个success.jsp界面

        （本身可以自动生成这个格式，但是社区版idea似乎不行）

        ```html
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>
        <body>
        <h2>Success</h2>

        </body>
        </html>
        ```

    - 然后设置redirect

        注意：redirect要加上项目

        `resp.sendRedirect("/response/success.jsp");`

        ```java
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("entered request");
                //处理请求
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                System.out.println(username+": "+password);

                resp.sendRedirect("/response/success.jsp");
            }
        ```

    - 测试：[`http://localhost:8080/response`](http://localhost:8080/response) 登录之后，成功跳转了！
- [ ]  [P15javaweb-15：Request应用30:30](https://www.bilibili.com/video/BV12J411M7Sj?p=15)

## HttpServletRequest

### HttpServletRequest是什么

HttpServletRequest代表客户端的request，用户通过HTTP协议访问服务器，HTTP请求中的所有信息会被封装到HttpRequest, 通过这个HttpServletRequest的方法，获得客户端的所有信息

### HttpServletRequest常见应用1-获取前端传递的参数

- 获取param的四个方法

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2080.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2080.png)

- 其中重点的两个方法

    ```java
    req.getParameter()
    req.getParameterValues()  
    ```

- index.jsp

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>login</title>
    </head>
    <body>
    <h2>login</h2>

    <div style="text-align:center">
        <form action="${pageContext.request.contextPath}/login" method="post">
            username: <input type="text" name = "username"> <br>
            password: <input type="password" name="password"> <br>
            hobby:
            <input type="checkbox" name="hobby" value="girl">girl
            <input type="checkbox" name="hobby" value="coding">coding
            <input type="checkbox" name="hobby" value="sing">sing
            <input type="checkbox" name="hobby" value="movie">movie
            <br>

            <input type="submit">
        </form>
    </div>

    </body>
    </html>
    ```

- 比如上面的hobby其实是多个parameter,用`getParameterValues` 读取

    ```java
    String[] hobbies = req.getParameterValues("hobby");
    //所选内容返回：[coding, sing, movie]
    ```

### HttpServletRequest常见应用2-请求转发

- code

    ```java
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //中文问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");

        System.out.println("=======================");
        System.out.println(Arrays.toString(hobbies));
        System.out.println(username);
        System.out.println(password);
        System.out.println("=======================");

        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }
    ```

    注意，因为转发发生在服务器内部，不需要写项目路径，这里的`/` 已经代表项目路径

    ```java
    //正确
    req.getRequestDispatcher("/success.jsp").forward(req,resp);

    //错误
    req.getRequestDispatcher(req.getContextPath()+"/success.jsp").forward(req,resp);
    ```

## Cookie & Session

### Session会话

- 会话：用户点击了一个浏览器，点击了很多超链接，访问了多个web资源，然后关闭浏览器，这个过程可以称之为一次会话session
- 有状态会话：一个同学来过教室，下次再来，我们能知道这个同学曾经来过，这个成为有状态会话
    - 问题：比如你怎么证明你是西开的学生
    - 回答：
        1. 发票 authority发配证明
        2. 学校登记 标记你来过了
    - 问题：一个网站（服务端）怎么证明你(客户端)来过？
    - 回答
        1. 客户端技术（客户端来带证明）：服务端给客户端一个证明，client下次访问的时候带上这个证明就可以了，这里的证明就是cookie
        2. 服务端（服务端记录）：服务器登记你来过了，下次你来的时候匹配你

### 保存会话session的两种技术

常见场景：网站登录之后，下次不用再登录，第二次访问直接进入

1. cookie
    - 客户端技术（客户端负责带证明，服务器不用管太多）
    - 服务器通过response将cookie发给客户端，客户端通过request将cookie带给服务器（从request中拿到cookie信息）
    - cookie一般会保存在本地的用户目录下 appdata
    - 详解：第一次访问的时候，server给浏览器一个cookie,之后user访问的时候，携带cookie即可

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2081.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2081.png)

2. session
    - 服务器技术（等级你来过）
    - 利用这个技术，可以保存客户的会话session信息
    - 我们可以把信息或者data放进session中
    - 详解：用户访问服务器的时候，服务器会为user建立一个session，server会发一个session id 给user，但是会把数据存到server自己那儿，下次user访问的时候，自己带着session id，server通过这个id找到储存在自己那儿的data

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2082.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2082.png)

### memo

- 注意，cookie和session解决了一个user对应网站的多个网页，或者多个request的问题，但是没有解决user 之间的数据共享问题
- 而储存在ServletContext中的信息，所有user都可以访问到，因为context就代表服务器
- 之后会学习ApplicationContext，在这个层级上，用户可以实现与其他用户的信息共享

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2083.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2083.png)

## Cookie

### Cookie

- 重点方法

    ```java
    //cookie,服务器端从客户端获取
    Cookie[] cookies = req.getCookies();//返回数组，说明cookie可能有多个

    //判断cookie是否存在
    cookies!=null

    //获取cookie的名字
    cookie.getName() //获得cookie中的key

    //获取cookie的值
    cookie.getValue()

         
    //服务器给客户端响应/发送一个cookie
    Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");

    //设置cookie的时间，有效期为一天
    cookie.setMaxAge(24*60*60);

    //添加cookie
    resp.addCookie(cookie);
    ```

- 每一次服务器响应一个cookie（登陆时间）,并且通过req 读取所有cookies，将上一次登陆时间print出来

    ```java
    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //服务器告诉你你来的时间，把这个时间封装成一个信件，
            //你下次带来，服务器就知道你来了

            //解决中文乱码
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");

            //若想给client发字符串，需要建立对象
            PrintWriter out = resp.getWriter();

            //cookie,服务器端从客户端获取
            Cookie[] cookies = req.getCookies();//返回数组，说明cookie可能有多个
            //判断cookie是否存在
            if (cookies!=null){
                out.write("The last visit is :");
    //            for (Cookie cookie : cookies) {}
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                    //获取cookie的名字
                    if ( cookie.getName().equals("lastLoginTime")){
                        //获取cookie的值
                        long lastLoginTime = Long.parseLong(cookie.getValue());
                        Date date = new Date(lastLoginTime);
                        out.write(date.toLocaleString());
                    }
                }
            }else{
                out.write("This is your first visit");
            }

            //服务器给客户端响应/发送一个cookie
            Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");
            resp.addCookie(cookie);

        }
    ```

- 在Application可以查看，删除当下的cookie

    注意，cookie可能有很多个，而且有些事浏览器自带的，比如360和chrome可能自带不同的cookie

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2084.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2084.png)

- 可以从request header, response header看到cookie

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2085.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2085.png)

- 发现关掉浏览器之后，cookie就不见了（因为session会话结束）
- 可以在让响应的cookie有效期为1天

    ```java
    //服务器给客户端响应/发送一个cookie
    Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");
    //设置cookie的时间，有效期为一天
    cookie.setMaxAge(24*60*60);
    resp.addCookie(cookie);
    ```

    这样在有效期内，即使关掉浏览器，也能保持cookie

    如下，可以观察到response中的cookie的有效期限

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2086.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2086.png)

### 一个网站cookie是否存在上限

- 一个cookie只能保存一个信息（只能key value）
- 一个web站点可以给浏览器发送多个cookie
- 一个浏览器的上限大概是300个cookie
- 每个站点最多存放20个cookie
- cookie 大小有限制，大概4kb

### 删除cookie

- 方法1：不设置有消息，关闭浏览器，自动失效
- 方法2：设置有效期为0s （手动删除，效率高）

### 通过方法2清除cookie的demo

- 设置c1([`http://localhost:8080/javaweb-session-cookie/c1`](http://localhost:8080/javaweb-session-cookie/c1))有cookie功能
- 设置c2清除c1存的那个cookie：`cookie.setMaxAge(0);`
    - 注意，c2 建立的cookie的名字要和c1中的一样，从而replace一个有效期为零的以清除

    ```java
    public class CookieDemo02 extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //创建cookie，名字必须和要删除的名字一致
            Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

- 测试，先run c1([`http://localhost:8080/javaweb-session-cookie/c1`](http://localhost:8080/javaweb-session-cookie/c1))，发现有cookie，然后跑c2，之后再跑c1，发现过往的cookie已被清除

### 中文数据传递

- 需要编码和解码

### 测试1

- 将中文存进cookie，然后在console把cookie内容打印出来

    ```java
    req.setCharacterEncoding("utf-8");
    resp.setCharacterEncoding("utf-8");
    ```

    完整代码：

    ```java
    public class CookieDemo03 extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            //解决中文乱码
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");
            
            PrintWriter out = resp.getWriter();

            //cookie,服务器端从客户端获取
            Cookie[] cookies = req.getCookies();//返回数组，说明cookie可能有多个
            //判断cookie是否存在
            if (cookies!=null){
                out.write("The last visit is :");
    //            for (Cookie cookie : cookies) {}
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                    //获取cookie的名字
                    if ( cookie.getName().equals("name")){
                        //获取cookie的值
                        System.out.println(cookie.getValue());
                    }
                }
            }else{
                out.write("This is your first visit");
            }
            Cookie cookie = new Cookie("name", "哈哈");
            resp.addCookie(cookie);

        }
    ```

- 测试成功了，可以输出中文，但是这个方法不推荐

### 测试二

- 通过URLEncoder编码URLDecoder解码的方式传中文（推荐）
- 存的时候，cookie的value加上编码

    ```java
    Cookie cookie = new Cookie("name", URLEncoder.encode("哈哈","utf-8"));
    resp.addCookie(cookie);
    ```

- 读取cookie的时候，解码

    ```java
    URLDecoder.decode(cookie.getValue(),"utf-8");
    ```

- 完整代码

    ```java
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            //解决中文乱码
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");

            PrintWriter out = resp.getWriter();

            //cookie,服务器端从客户端获取
            Cookie[] cookies = req.getCookies();//返回数组，说明cookie可能有多个
            //判断cookie是否存在
            if (cookies!=null){
                out.write("The last visit is :");
    //            for (Cookie cookie : cookies) {}
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                    //获取cookie的名字
                    if ( cookie.getName().equals("name")){

                        System.out.println(URLDecoder.decode(cookie.getValue(),"utf-8"));

                        //获取cookie的值
                        //System.out.println(cookie.getValue());
                    }
                }
            }else{
                out.write("This is your first visit");
            }
            Cookie cookie = new Cookie("name", URLEncoder.encode("哈哈","utf-8"));
            resp.addCookie(cookie);

        }
    ```

## Session（重点）

### 什么是Session

- 服务器会给每一个用户（浏览器）创建一个session对象
- 一个session独占一个浏览器，只要浏览器没有关闭，这个session就存在
    - 不同浏览器登录是不同session
- 用户登录之后，整个网站都可以访问
    - 对不同网页是不同的request，但是都能共享了客户信息
    - 这里有一个session的功能：保存用户的信息

### session和cookie的区别

- cookie是把用户数据写给用户的浏览器，浏览器保存，可以保存多个
- session把用户的数据写到用户独占的session中（每个浏览器是不同session），服务器保存，保存重要信息，较少server资源浪费
- session对象由server创建

HttpSession的方法

- HttpSession的方法

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2087.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2087.png)

- setAttribute的参数是(string, object),可以存对象（cookie只能存string）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2088.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2088.png)

### Demo01-建立session

- session对象：
    - 从request中获取session
    - 可以查看session id
    - 可以通过setAttribute在session中储存object
    - 并且可以查看这个Session是不是新创建的，还是之前就存在的
    - 下面的代码判断session是否是新建的，并显示id
        - 注意，任何时候都有id，因为一request自动就新建session了

        ```java
        @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                //解决乱码问题
                req.setCharacterEncoding("UTF-8");
                resp.setCharacterEncoding("UTF-8");
                resp.setContentType("text/html;charset=utf-8");

                //得到Session
                HttpSession session = req.getSession();

                //给Session中存东西
                session.setAttribute("name","恺恺");

                //获取session的id
                String sessionId = session.getId();

                //判断是不是新的session(session是否新创建)
                if (session.isNew()){
                    resp.getWriter().write("session创建成功，id: "+sessionId);
                }else{
                    resp.getWriter().write("session已经存在，id: "+sessionId);
                }
            }
        ```

- test: [`http://localhost:8080/javaweb-session-cookie/s1`](http://localhost:8080/javaweb-session-cookie/s1)
    - 测试成功：第一次的时候，session显示新创立，刷新之后显示 session已经存在
    - 发现：cookie中自动存了一个叫`JSESSIONID`的cookie,储存了session id

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2089.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2089.png)

- session创建的时候, 其实创建了一个cookie(名为JSESSIONID)，储存了session id

    ```java
    Cookie cookie = new Cookie("JSESSIONID", sessionId);
    resp.addCookie(cookie);
    ```

### Tip

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2090.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2090.png)

### Demo02-获取session中的object信息（转成String）

- 通过`session.getAttribute` 获取session中的信息

    ```java
    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //解决乱码问题
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");

            //得到SSession
            HttpSession session = req.getSession();

            //给Session中存东西
            String name = (String)session.getAttribute("name");

            System.out.println(name);

        }
    ```

- test：
    - 如果先跑s2（读取session信息），会出现null,因为还没有往session中存信息

        [`http://localhost:8080/javaweb-session-cookie/s2`](http://localhost:8080/javaweb-session-cookie/s2)

    - 先运行s1（存信息），然后再运行s2，可以看到info

### Demo01-获取session中的object信息

- 可以建一个单独的package - `com.kaitan.pojo`

    Person类里面可以有

    - 有参，无参构造
    - set, get 变量 name, get
    - 重写一个toString 方法以查看 object attribute信息

    ```java
    package com.kaitan.pojo;

    public class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        //为了调试方便, 查看数据
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
    ```

- 存这个Person object

    ```java
    session.setAttribute("name",new Person("恺恺",11));
    ```

- 读取这个object

    ```java
    import com.kaitan.pojo.Person;

    HttpSession session = req.getSession();
    Person person = (Person)session.getAttribute("name");
    System.out.println(person.toString());
    ```

- test：先运行s1， 后运行s2，后台成功显示：

    ```java
    Person{name='恺恺', age=11}
    ```

### Session跨servlet

- 上面的例子证明session可以跨servlet传递用户信息
- 这个方法比把每个用户信息都存在context要强，因为都存context可能server 会崩溃
- session不能存太大的data，但是用户信息够用了

### Demo03-手动注销session

- 可以removeAttribute
- 手动注销session：`session.invalidate();`
- 如果想彻底关闭一个session，可以使用invalidate,但是因为只要浏览器访问server就会有session，关闭的同时会建立一个新的session，新session的id与原来不同

    ```java
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute("name");
        session.invalidate();
    }
    ```

- test：
    - 目前的servlet
        - s1: 显示id，如果是新建的session，显示”新建“，并且创建一个person object
        - s2: 查看这个person object
        - s3: 注销当前session
    - s1（建立session）→s2(可以查看，因为有person object)→s3(手动关闭当前session，同时建立新session)→s2（报错500，因为person为null，新session中不含有person object）

### 设置session失效时间

- 可以在web.xml中设置session失效时间(`web-app`)

    ```xml
    <!--  设置session默认失效时间、分钟为单位-->
    <session-config>
      <session-timeout>15</session-timeout>
    </session-config>
    ```

- best practices:
    - 虽然可以设置默认失效时间，但是一般 手动注销和 默认失效都要设置，因为要既能让客户主动清出，也可以因为时间过久自动失效
    - 如果失效时间太久，可能会加大server负担（因为储存了太多session）
    - 一般网站默认失效时间是几个小时
    - 如果想持久化保存，可以选择cookie（不过用户可能会认为清除cookie）
    - 现在是存了一个person object,之后可能要往这个person中存几十项数据

### session使用场景

- 保存登录用户的信息
- 购物车信息
- 在整个网站中，经常会使用的数据，存入session中，这样就不需要每次get

- [ ]  [P16javaweb-16：Cookie讲解59:26](https://www.bilibili.com/video/BV12J411M7Sj?p=16)
- [ ]  [P17javaweb-17：Session讲解40:07](https://www.bilibili.com/video/BV12J411M7Sj?p=17)

- [ ]  [P18javaweb-18：JSP原理剖析31:55](https://www.bilibili.com/video/BV12J411M7Sj?p=18)
- [ ]  [P19javaweb-19：JSP基础语法和指令51:28](https://www.bilibili.com/video/BV12J411M7Sj?p=19)
- [ ]  [P20javaweb-20：JSP内置对象及作用域39:07](https://www.bilibili.com/video/BV12J411M7Sj?p=20)
- [ ]  [P21javaweb-21：JSP、JSTL标签43:23](https://www.bilibili.com/video/BV12J411M7Sj?p=21)

## 理解JSP

### 什么是JSP

- JSP：Java Server Pages
- 跟servlet一样，用于开发动态web技术
- 在早期没有jsp的年代，如果纯用servlet写，效果是这样的：

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2091.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2091.png)

- jsp最大的特点：写jsp就像在写html
- jsp与html的区别
    - html只给客户提供静态数据
    - JSP页面中可以嵌入java代码，为用户提供动态数据

### JSP原理

思路：JSP如何执行

- 代码层面，（去target中看，发现还是形如html），没能看到区别
- server内部工作

### Tomcat的work dir

- Tomcat包中有一个work目录，这个work目录就是是tomcat服务器工作的目录
- work里面是这样的：`\apache-tomcat-10.0.5\work\Catalina\localhost`
- 这个localhost中存储的其实是网站：

    ```xml
    05/12/2021  12:45 AM    <DIR>          .
    05/12/2021  12:45 AM    <DIR>          ..
    05/10/2021  11:17 PM    <DIR>          docs
    05/12/2021  12:46 AM    <DIR>          examples
    05/10/2021  11:17 PM    <DIR>          host-manager
    05/10/2021  11:17 PM    <DIR>          manager
    05/10/2021  11:17 PM    <DIR>          ROOT
    05/12/2021  12:45 AM    <DIR>          stock-test
    ```

- 比如网站ROOT里面含有一个jsp的 class 文件，一个jsp的 java 文件

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2092.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2092.png)

### IDEA的tomcat工作空间

- 在IDEA中使用tomcat的话会在IDEA的tomcat中生成work目录（idea的tomcat的工作空间）
- 这个依赖于真正的tomcat
- 可以去idea log中看`CATALINA_BASE` （我的电脑）

    `C:\Users\sunka\.SmartTomcat`

    ```java
    CATALINA_BASE:         C:\Users\sunka\.SmartTomcat\javaweb-02-servlet\javaweb-session-cookie

    CATALINA_HOME:         C:\Users\sunka\.SmartTomcat\javaweb-02-servlet\javaweb-session-cookie
    ```

- 老师的电脑

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2093.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2093.png)

- web项目在这里会产生dir
- 我的path：

    ```java
    C:\Users\sunka\.SmartTomcat\javaweb-02-servlet\javaweb-session-cookie\work\Catalina\localhost\javaweb-session-cookie\org\apache\jsp
    ```

- 发现页面转成了java程序

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2094.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2094.png)

- 浏览器向Server 发送请求，不过访问什么资源，其实都是访问Servlet
- JSP最终也会被转换成为一个java类

### 查看其中index_jsp.java源码

- 发现只有并没有implement常用的HttpServlet接口，而是继承了`org.apache.jasper.runtime.HttpJspBase`
- 去看`HttpJspBase` 发现`HttpJspBase` 继承了`HttpServlet` ，即 index_jsp本质就是一个Servlet
- 注意记得导入jsp

    ```xml
    //不是这个。。。
    <dependency>
        <groupId>javax.servlet.jsp</groupId>
        <artifactId>javax.servlet.jsp-api</artifactId>
        <version>2.3.1</version>
        <scope>provided</scope>
    </dependency>

    //是这个、、、
    <dependency>
    	<groupId>org.apache.tomcat</groupId>
    	<artifactId>tomcat-jasper</artifactId>
    	<version>7.0.65</version>
    </dependency>
    ```

- index_jsp.java源码: `index_jsp` 类

    ```java
    package org.apache.jsp;

    import javax.servlet.*;
    import javax.servlet.http.*;
    import javax.servlet.jsp.*;

    public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
        implements org.apache.jasper.runtime.JspSourceDependent,
                     org.apache.jasper.runtime.JspSourceImports {

     ...
        try {
          response.setContentType("text/html");
          pageContext = _jspxFactory.getPageContext(this, request, response,
          			null, true, 8192, true);
          _jspx_page_context = pageContext;
          application = pageContext.getServletContext();
          config = pageContext.getServletConfig();
          session = pageContext.getSession();
          out = pageContext.getOut();
          _jspx_out = out;

          out.write("<html>\n");
          out.write("<body>\n");
          out.write("<h2>Hello World!</h2>\n");
          out.write("</body>\n");
          out.write("</html>\n");
        } catch (java.lang.Throwable t) {
    ...
    }
    ```

- 对比一下`index_jsp.java`和`index.jsp`
    - 发现其实jsp的机制就是让coder能够做一些简单的编写，但是实则转换成了繁琐的Java的Servlet的编写代码

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2095.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2095.png)

- `index_jsp`类中的重点方法：

    ```java
    //初始化
    public void _jspInit() {}

    //销毁
    protected void _jspDestroy() {}

    //服务 JSP Service, 传入（request, response）,本质就是Servlet service
    public abstract void _jspService(HttpServletRequest var1, HttpServletResponse var2)
    ```

### `_jspService` 流程（可以对照源码去看）

1. 判断请求：判断是post，还是get

    ```java
    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }
    ```

2. 内置了一些对象

    ```java
    final javax.servlet.jsp.PageContext pageContext;//页面上下文
    javax.servlet.http.HttpSession session = null;//session
    final javax.servlet.ServletContext application; //application context
    final javax.servlet.ServletConfig config;//配置
    javax.servlet.jsp.JspWriter out = null; //输出对象
    final java.lang.Object page = this;//代表当前页面
    javax.servlet.jsp.JspWriter _jspx_out = null; 
    javax.servlet.jsp.PageContext _jspx_page_context = null;

    //输入参数
    HttpServletRequest var1
    HttpServletResponse var2

    ```

3. 输出也面前增加的代码（这些代码套在一个try catch里面）

    ```java
    response.setContentType("text/html"); //设置文本response类型为html，这样可被识别
    pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true); //this代表页面，然后request, response
    _jspx_page_context = pageContext;
    application = pageContext.getServletContext();//application就是ServletContext
    config = pageContext.getServletConfig(); //获得Config
    session = pageContext.getSession();
    out = pageContext.getOut();
    _jspx_out = out;

    //然后是真正的页面
    out.write("<html>\n");
    out.write("<body>\n");
    out.write("<h2>Hello World!</h2>\n");
    out.write("</body>\n");
    out.write("</html>\n");
    ```

4. 这些对象，可以在JSP中直接使用（因为已经默认被确定好了）
    - 取数据

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2096.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2096.png)

    - java代码可以在`<%%>` 中写，比如直接写session，可以识别

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2097.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2097.png)

### JSP文件生成流程

- JSP转换生成的java, class文件有相应的存放地址

    ```java
    //（我的电脑）javaweb-session-cookie 项目的jsp文件储存地址
    C:\Users\sunka\.SmartTomcat\javaweb-02-servlet\javaweb-session-cookie\work\Catalina\localhost\javaweb-session-cookie\org\apache\jsp
    ```

- 在页面被访问（request）之时，才会转化`.jsp` 文件到java和class文件
    - （老师）重启server，明显看到其中work目录（存有jsp文件夹）消失了，然后server 完毕的时候，只有主页jsp的java和class文件出现，其他jsp文件的class和java文件没有生成
    - （我的电脑）
        - 重启server的时候，jsp文件夹并没有消失，可能因为没有变更index.jsp文件，并没有随着重启server更新.java和.class文件，但是新建的jsp文件也没有生成对应的.class, .java文件
        - 访问新页面hello.jsp的时候，生成相应的hello_jsp.java, hello_jsp.class

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2098.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2098.png)

### JSP原理

编写jsp，等同于编写一个自带模板的java
文件，本质就是完美转换到一个有servlet的java文件，所以自然可以嵌套java代码进去

1. 用户通过电脑连接到server
2. 用户发起一个request，比如请求访问hello.jsp
3. 服务器会将锁定的jsp转换为java文件，比如hello_jsp.java
4. 然后会编译java文件到class文件（可执行），比如hello_jsp.class
5. 用户拿到的，是服务器生成的class对象（这个就是servlet）

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2099.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%2099.png)

### Demo: 在jsp中嵌套java代码

- hello.jsp

    ```java
    <html>
    <body>
    <h2>Hello World!</h2>
    hello
    <%
        String name = "kaikai";
    %>

    name:<%=name%>
    </body>
    </html>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20100.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20100.png)

- 生成的对应代码

    ```java
    out.write("<html>\r\n");
    out.write("<body>\r\n");
    out.write("<h2>Hello World!</h2>\r\n");
    out.write("hello\r\n");

    String name = "kaikai";

    out.write("\r\n");
    out.write("\r\n");
    out.write("name:");
    out.print(name);
    out.write("\r\n");
    out.write("</body>\r\n");
    out.write("</html>\r\n");
    ```

### jsp文件转换方式

jsp其实就是简化java-servlet的编写

- jsp文件中的java代码会原封不动转移过去
- html代码会被转换成下面这样的java代码，输出到前端

    ```java
    out.write("<body>\r\n");
    ```

## JSP语法

### Demo:将普通项目转成web项目

1. 创建一个普通的maven项目，不选择maven web模板
    - 普通的项目没有web功能
    - web的项目没有普通的功能
2. 在项目上面右键add framework suppport,增加web application
    - 注意，只有ultimate才有，详细见

        [Enable Web application support | IntelliJ IDEA](https://www.jetbrains.com/help/idea/enabling-web-application-support.html)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20101.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20101.png)

3. 增加dependencies

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20102.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20102.png)

4. 配置run configuration - tomcat(模板)
5. 在正式开始跑代码之前，测试主页是否能成功运行！

    ```java
    http://localhost:8080/javaweb-jsp/
    ```

### JSP项目的dependency

- `javax.servlet`: servlet
- `javax.servlet.jsp`: jsp
- `javax.servlet.jsp.jstl`: JSTL表达式的dependency
- `taglibs` : JSTL表达式依赖的标签的dependency

    ```xml
    <!--            Servlet依赖-->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>4.0.1</version>
    </dependency>
    <!--            JSP依赖-->
    <dependency>
        <groupId>javax.servlet.jsp</groupId>
        <artifactId>javax.servlet.jsp-api</artifactId>
        <version>2.3.3</version>
    </dependency>
    <!--            JSTL表达式-->
    <dependency>
        <groupId>javax.servlet.jsp.jstl</groupId>
        <artifactId>jstl-api</artifactId>
        <version>1.2</version>
    </dependency>
    <!--        标签库    -->
    <dependency>
        <groupId>taglibs</groupId>
        <artifactId>standard</artifactId>
        <version>1.1.2</version>
    </dependency>
    ```

### JSP语法特点

- JSP作为JAVA技术的一种以用，拥有一些自己的语法（了解即可）
- JAVA所有语法都支持

### JSP注释

- JSP注释

    ```java
    <%--jsp 表达式--%>
    ```

- 对比html注释

    ```java
    <!----%>
    ```

- 注意，JSP注释不会在客户端界面看到，但是JSP文件中的html注释会显示在页面上！！！

### JSP表达式

- `<%= 代码%>`
- 一个java语句
- 作用：将程序的output输出到客户端

    ```java
    <%= java代码%>
    ```

    如

    ```java
    <html>
    <body>
    <%--jsp 表达式--%>
    <%= new java.util.Date() %>

    <%
        String name = "kaikai";
    %>

    name:<%=name%>
    </body>
    </html>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20103.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20103.png)

### JSP 脚本片段script

- `<%= 代码%>`
- 一段java代码

    ```java
    <%--jsp script--%>
    <%
        int sum =0;
        for(int i = 1; i<=100; i++){
            sum+=i;
        }
        out.println("<h1>Sum = "+sum+"</h1>");
    %>
    ```

    - 注意，这里直接可以调用out等对象

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20104.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20104.png)

### JSP注意点

- 因为这些代码会转化到同一个java文件里面，重复创建变量会报错，编写的时候，脑子里最好有成型的java文件
    - 错误示例：

        ```java
        <%
         int x = 10;
         out.println(x);
        %>
        <p>a sentence</p>
        <%
         int x= 10;
        %>
        ```

- JSP语句可以和html密切配合使用
    - 如下 可以在JSP循环结里使用html（因为先是一行一行转换为java代码，最后再编译运行）
    - 也可以在html语句中嵌入JSP表达式，如 `<%=i%>`

        ```java
        <%
         for (int i=0; i<5; i++){
        %>
        <h3>hi, <%=i%> </h3>
        <%
        }
        %>
        ```

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20105.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20105.png)

    - 相应生成的java文件：

        ```java
        //C:\Users\sunka\.SmartTomcat\javaweb-02-servlet\javaweb-jsp\work\Catalina\localhost\javaweb-jsp\org\apache\jsp

        for (int i=0; i<5; i++){
            out.write("\n");
            out.write("<h3>hi, ");
            out.print(i);
            out.write(" </h3>\n");
        }
        ```

### JSP转化后语句语句位置

- 下面是生成的java文件示例
- 目前无论是jsp语句，还是html语句，其实都生成在`_jspService(request, response)`中

    ```java
    public final class hello_jsp extends ...{
      static {
    		...
      }
      ...
      public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
        ...
      }

      public void _jspInit() {
      }

      public void _jspDestroy() {
      }

      public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response){
        ...
        try {
          response.setContentType("text/html");
          pageContext = _jspxFactory.getPageContext(this, request, response,
          			null, true, 8192, true);
          _jspx_page_context = pageContext;
          application = pageContext.getServletContext();
          config = pageContext.getServletConfig();
          session = pageContext.getSession();
          out = pageContext.getOut();
          _jspx_out = out;

          out.write("<html>\r\n");
          out.write("<body>\r\n");
          out.write("<h2>Hello World!</h2>\r\n");
          out.write("hello\r\n");

        String name = "kaikai";

          out.write("\r\n");
          out.write("\r\n");
          out.write("name:");
          out.print(name);
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("</html>\r\n");
        } catch (java.lang.Throwable t) {...}
    }
    ```

- 所以默认JSP文件的作用域就是这个`_jspService(request, response)函数内`

### JSP声明

- 通过`<%! %>`来可以把这个作用域提升到主类层级（这里的class `hello_jsp`），这个叫做JSP声明
- 比如，如果在JSP的任意位置写

    ```java
    ...
    <%!
        static{
         System.out.println("Loading Servlet");
        }

        private int globalVar= 0;

        public void kaikai(){
            System.out.println("进入了方法");
        }
    %>
    ```

- 在最终生成的java文件中， `<%! %>` 中的代码会被提到主类（这里的class `hello_jsp`）的最前面,而不是 `_jspService(request, response)函数内`

    ```java
    public final class index_jsp extends ...{

        static{
         System.out.println("Loading Servlet");
        }

        private int globalVar= 0;

        public void kaikai(){
            System.out.println("è¿å¥äºæ¹æ³");
        }
    		//然后才是之前默认的其他code
    		...
    ```

- 在JSP中，嵌入java代码很简单

### EL表达式

- 用`${}`可以替代（简化）`<%= %>`

    ```java
    <%
     for (int i=0; i<5; i++){
    %>
    <h3>hi, <%=i%> </h3>
    <h3>hi, ${i} </h3>
    <%
    }
    %>
    ```

### 快捷键-代码更新

更新代码之后，直接按键重启

1. update resources
2. update classes and resources 直接热更新，不用重新发布
3. redeploy 项目重新发布
4. restart server 重新启动tomcat

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20106.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20106.png)

### `<%@ %>` 设置

- `@ page` 表示页面设置，可以设置parameters，注意这个要在<html>块前定义
    - `contentType`
    - `language`

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20107.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20107.png)

    - `autoFlush` 是否自动刷新
    - `buffer` 是否缓存
    - errorPage
    - `extends` 继承另外一个页面
    - `import` 在未来生成的java文件中导入包

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20108.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20108.png)

    - 还有很多其他的设置

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20109.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20109.png)

- 除了@ page，还可以@include或taglib

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20110.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20110.png)

### 用@page配置error界面

- 使用@ page的errorPage

    ```java
    <%@ errorPage="error/500.jsp"%>
    ```

- code

    ```java
    //webapp/jsp2.jsp
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <%@ page errorPage="error/500.jsp" %>
    <html>
    <body>
    <%
        int a = 1/0;
    %>
    </body>
    </html>
    ```

    ```java
    //webapp/error/500.jsp

    <%@ page contentType="text/html;charset=UTF-8" language="java" %> //此行可以不写

    <html>
    <body>
    <img src="img/505-image.png" alt="error-img">

    You got an error, sooooo sad
    </body>
    </html>
    ```

- 深度思考: 目前下面的两个不能同时成功显示img
    - 500.jsp是error页面，"img/505-image.png"的设定会在 [`http://localhost:8080/javaweb-jsp/error/500.jsp`](http://localhost:8080/javaweb-jsp/error/500.jsp) 的基础上导到了[`http://localhost:8080/javaweb-jsp/error/img/505-image.png`](http://localhost:8080/javaweb-jsp/error/img/505-image.png) ，无法显示img
    - 虽然完成跳转到error page，但是不会变更url，所以jsp2 在[`http://localhost:8080/javaweb-jsp/jsp2.jsp`](http://localhost:8080/javaweb-jsp/jsp2.jsp) 的基础上跳转到了[`http://localhost:8080/javaweb-jsp/img/505-image.png`](http://localhost:8080/javaweb-jsp/img/505-image.png) ，可以显示img
    - 结论
        - 保证jsp2（真正有用的页面）能显示img就可以了
        - "img/505-image.png"不要写成"../img/505-image.png"
- test结果：当jsp2错误的时候，没有显示默认的500界面，反而跳转到了规定的error page

    [http://localhost:8080/javaweb-jsp/jsp2.jsp](http://localhost:8080/javaweb-jsp/jsp2.jsp)

    转到`webapp/error/500.jsp` （不过url不会变更到500.jsp）

### 用web.xml配置error页面

- 可以通过web.xml的error-page标签配置error界面
    - 通过error-code, location即可

        ```xml
          <error-page>
            <error-code>404</error-code>
            <location>/error/404.jsp</location>
          </error-page>
        ```

    - 例子

        ```xml
        <?xml version="1.0" encoding="UTF-8"?>

        <web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee
                              https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd"
                 version="5.0"
                 metadata-complete="true">
          <display-name>Archetype Created Web Application</display-name>
          <error-page>
            <error-code>404</error-code>
            <location>/error/404.jsp</location>
          </error-page>

          <error-page>
            <error-code>500</error-code>
            <location>/error/500.jsp</location>
          </error-page>

        </web-app>
        ```

- webapp/error/404.jsp

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <html>
    <body>
    <img src="img/404-image.png" alt="404">

    You got an error, sooooo sad
    </body>
    </html>
    ```

- webapp/error/500.jsp

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <html>
    <body>
    <img src="img/505-image.png" alt="error-img">

    You got an error, sooooo sad
    </body>
    </html>
    ```

- 网站共有的头部和尾部，而可用@include来处理，提取公共page
- 例子

    ```xml
    // webapp/jsp3.jsp
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <body>
        <%@include file = "common/header.jsp"%>
        <h1>body of webpage</h1>
        <%@include file = "common/footer.jsp"%>
    </body>
    </html>
    ```

    ```xml
    // header.jsp
    <h1>this is header</h1>
    ```

    ```xml
    // footer.jsp
    <h1>this is footer</h1>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20111.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20111.png)

### 用标签代替@include

- 一般推荐用jsp标签，更灵活
- jsp标签

    ```xml
    <jsp:include page= "/common/header.jsp"/>
    <h1>body of webpage</h1>
    <jsp:include page= "/common/footer.jsp"/>
    ```

- include

    ```xml
    <%@include file = "common/header.jsp"%>
    <h1>body of webpage</h1>
    <%@include file = "common/footer.jsp"%>
    ```

- jsp标签include page对比`include`
    - `@include` 会让page和included page完美合在一起

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20112.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20112.png)

    - jsp标签：先用static资源处理，然后用的时候索引这些资源，相当于拼接页面

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20113.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20113.png)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20114.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20114.png)

- 深度理解
    - 因为jsp标签是拼接，各自定义的变量不会互相影响
    - 如果用include，因为最终放进了无差别的java 代码，彼此之前如果相冲突，实惠报错的
    - 所以一定要用jsp标签呀！

### web app 结构（dir）

- 一般main中只有
    - java
    - resources：提供给java
    - webapp：所有web资源都放在webapp文件夹中
- webapp中的dir规范
    - common：共用界面
    - error：错误页面
    - WEB-INF：不建议现阶段将任何东西放入WEB-INF因为客户访问不到，之后可以放机密的东西，用户不可见
    - static：存放css, img, js, plugins的文件夹等
    - index.jsp主页

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20115.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20115.png)

![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20116.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20116.png)

## 9大内置对象

回顾过程：jsp第一次访问的时候生成java, class文件，编成class之前，生成九个对象

### 9大对象

- PageContext
    - 页面上下文
    - 可以存东西
- Request
    - 可以存东西
- Response
- Session
    - 可以存东西
- Application
    - ServletContext
    - 可以存东西
- config:
    - ServletConfig
- out
    - 输出东西
- page
    - 基本不用
- exception

### Demo01

- 查看pageContext, request, session, application 的存储功能
    - 因为page是最低层级，通过`pageContext.findAttribute` 可以搜索到下面所有对象上保存的data: pageContext，request，session, application

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
    </head>
    <body>

    <%
    pageContext.setAttribute("name1","kaikai1");//保存的数据只在一个页面有效
    request.setAttribute("name2","kaikai2");//保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","kaikai3");//保存的数据只在一次会话中有效
    application.setAttribute("name4","kaikai4");//保存的数据只在服务器中有效，从打开服务器到关闭服务器
    %>

    <%--通过pageContext取出我们保存的值,所以下面要用java可以识别的代码--%>
    <%
        //从pageContext去取出，有get还有find
        String name1= (String) pageContext.findAttribute("name1");
        String name2= (String) pageContext.findAttribute("name2");
        String name3= (String) pageContext.findAttribute("name3");
        String name4= (String) pageContext.findAttribute("name4");
        String name5= (String) pageContext.findAttribute("name5");//不存在
    %>
    <%--使用el表达式输出比较快捷--%>
    <h1>取出的值为</h1>
    <h3>${name1}</h3>
    <h3>${name2}</h3>
    <h3>${name3}</h3>
    <h3>${name4}</h3>
    <h3>${name5}</h3>
    </body>
    </html>
    ```

- test发现可以成功输出

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20117.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20117.png)

- 注意，如果不用el表达式而是用`<%=var%>`的话，会出现null而不是自动隐藏

    ```java
    <h3>${name5}</h3>
    <h3><%=name5%></h3>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20118.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20118.png)

### 保存data的查找机制

- 可以用getAttribute，也可以用findAttribute找
- 找寻机制：根据作用域从底层到高层
    - **pageContext** 保存的data只在一个页面中有效
    - **request** 保存的data旨在一次request中有效，请求转发会携带这个data
    - **session** 保存的data在一次session对话中有效（从打开浏览器到关闭浏览器）
    - **application** 保存的data在服务器中有效，从打开server到关闭server（服务器崩了，就没有数据了）

### 层级讨论

情景：三个电脑访问website的server

1. Page
    - 最低效力
    - page就是在一个页面有效，出了这个页面，data无效
2. Request
    - 次低层级
    - 各自从各自的浏览器发出请求，可以通过request带data
    - 对应的servlet可以接受到data，如果这个servlet接受完data不转发，就失效了（生命周期结束）
    - 不过request可以转发（携带data）到其他地方比如servlet2，然后servlet2就能拿到data了
3. Session
    - 次高层级
    - server会为每个用户建立各自的session，data存到server中
    - 
    - 每一个session为一个浏览器窗口提供服务
        - ref：[https://cloud.tencent.com/developer/article/1650496](https://cloud.tencent.com/developer/article/1650496)
4. Application
    - 最高层级
    - 可以跨session，如果三个人都想访问同一个resource，比如买票，或者统计在线人数
    - 使用的是Application（即ServletContext）

### Demo2：跨page的访问测试

- 在另一个页面分别用pageContext, request, session, application存data，然后换一个新页面，发现只有在session和application上保存的数据可以访问到
- test
    - 注意，重启server之后要先加载Demo01页面存放数据[http://localhost:8080/javaweb-jsp/pageContextDemo01.jsp](http://localhost:8080/javaweb-jsp/pageContextDemo01.jsp)
    - 然后再进入page，发现只能取出通过session和application保存的data

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20119.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20119.png)

### Demo3：pageContext设置

- PageContext 的 setAttribute有两个重载的方法，

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20120.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20120.png)

- 其中最后的int对应一个叫scope的参数的int对应了不同层级（page, request, session,application）（见源码）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20121.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20121.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20122.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20122.png)

- Scope参数相当于配置层级，下面两行本质一样

    ```java
    pageContext.setAttribute("hi","hello",PageContext.SESSION_SCOPE);
    session.setAttribute("hi","hello");
    ```

### `pageContext.findAttribute` 搜索机制

- `findAttribute` 是按照层级去搜索的
- 最先在page层级找，找不到去request，然后session,然后application，如果都找不到就返回null

    page → request → session → application

### JVM的双亲委派机制

ref:[https://www.youtube.com/watch?v=sQZT9vOc9zY](https://www.youtube.com/watch?v=sQZT9vOc9zY)

- java虚拟机对claass文件是按需加载的，也就是需要时才会生成对应的class文件
- java加载class时，采用双亲委派机制，即把request交给parent类处理
- 例子：如果自己写了java.lang.String，即使手动加载，也不会真正加载，加载的还是最原本的包
    - 好处：不会因为某个人重写了一个包，分享出去之后造成所有原始包都无法用的情况
- 双亲委派机制定义

    其实就是不够权威的class要加载的时候向更权威的parent加载器请求加载，如果更权威的parent可以加载，则成功加载，如果加载不了，才会轮到不够权威或者自定义的class加载

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20123.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20123.png)

    - 正常的classLoader都是AppClassLoader级别的
    - rt.jar包代表java整个应用，BootStrapClassLoader就是根加载器（javax, jajva, sun开头的）
    - 扩展类就是找jdk的ext(可扩展)的jar包

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20124.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20124.png)

### Demo04: forward

- 直接转发到主页

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
    </head>
    <body>
    <%
    pageContext.forward("/index.jsp");
    %>
    </body>
    </html>
    ```

- 用servlet的equivalent写法是

    ```java
    request.getRequestDispatcher("index.jsp").forward(request, response)
    ```

- test
    - [http://localhost:8080/javaweb-jsp/pageContextDemo03.jsp](http://localhost:8080/javaweb-jsp/pageContextDemo03.jsp)
    - forward到index，但是url还是03，没有变化

### 应用讨论

```java
pageContext.setAttribute("name1","kaikai1");//保存的数据只在一个页面有效
request.setAttribute("name2","kaikai2");//保存的数据只在一次请求中有效，请求转发会携带这个数据
session.setAttribute("name3","kaikai3");//保存的数据只在一次会话中有效
application.setAttribute("name4","kaikai4");//保存的数据只在服务器中有效，从打开服务器到关闭服务器
```

- request
    - 客户端向服务器发送请求，产生的data用户看完就没用了，比如新闻（点完，看完就没了，不需要保存）
- session
    - 客户端向服务器发送请求，产生的data用户用完，一会儿还有用，用处比较大，比如购物车，放到购物车里却没有买，如果放到DB读写会占资源还没什么太大用
- application
    - 客户端向服务器发送请求，产生的data用户用完，其他用户还可能使用，比如聊天数据

### Demo 5: forward数据到另一个page

- code：将pageContext forward到另一个page- pageDemo02.jsp,

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
    </head>
    <body>

    <%
    pageContext.setAttribute("name1","kaikai1");//保存的数据只在一个页面有效
    request.setAttribute("name2","kaikai2");//保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","kaikai3");//保存的数据只在一次会话中有效
    application.setAttribute("name4","kaikai4");//保存的数据只在服务器中有效，从打开服务器到关闭服务器
    %>

    <%--通过pageContext取出我们保存的值,所以下面要用java可以识别的代码--%>
    <%
        //从pageContext去取出，有get还有find
        String name1= (String) pageContext.findAttribute("name1");
        String name2= (String) pageContext.findAttribute("name2");
        String name3= (String) pageContext.findAttribute("name3");
        String name4= (String) pageContext.findAttribute("name4");
        String name5= (String) pageContext.findAttribute("name5");//不存在

        pageContext.forward("/pageDemo02.jsp");
    %>
    <%--使用el表达式输出比较快捷--%>
    <h1>取出的值为</h1>
    <h3>${name1}</h3>
    <h3>${name2}</h3>
    <h3>${name3}</h3>
    <h3>${name4}</h3>
    <h3>${name5}</h3>
    <h3><%=name5%></h3>

    </body>
    </html>
    ```

- pageDemo02.jsp成功接收到forward过来的request级别的data了
    - [http://localhost:8080/javaweb-jsp/pageContextDemo01.jsp](http://localhost:8080/javaweb-jsp/pageContextDemo01.jsp)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20125.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20125.png)

## JSP标签，JSTL标签，EL表达式

### 都需要dependency

- JSTL
- standard

    ```xml
    <!--            JSTL表达式-->
    <dependency>
      <groupId>javax.servlet.jsp.jstl</groupId>
      <artifactId>jstl-api</artifactId>
      <version>1.2</version>
    </dependency>
    <!--标签库-->
    <dependency>
      <groupId>taglibs</groupId>
      <artifactId>standard</artifactId>
      <version>1.1.2</version>
    </dependency>
    ```

### EL表达式

- 符号： `$()`
- 用途
    - 获取数据
    - 执行运算
    - 获取web开发的常用对象（scope）
    - 调用java方法（不常用）

### 标签Debug过程

- 先查语法，重新手写一边代码
- 搜错误
- 因为启动是依赖于tomcat，可以进入tomcat 的lib，发现没有导入JSTL，然后手动将jstl包手动复制到这个tomcat lib里就好了

### JSTL标签使用步骤

- 引入对应的taglib
- 使用其中的方法

### JSTL标签

- JSTL格式化标签（了解）
- JSTL的SQL标签（了解）
- JSTL的XML标签（了解）

### ref网站

- 菜鸟教程- 可以看JSP标准标签库JSTL
- W3C

### Demo：测试jsp forward

- jsptag.jsp界面

    ```xml
    <jsp:forward page="/jsp2.jsp"></jsp:forward>
    ```

- test结果：确实forward到tsptag2了，虽然url不变

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20126.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20126.png)

### Demo: 请求携带参数

- 转发request时可以用tag的方式携带参数，相当于`http://localhost:8080/jsptag.jsp?name=kaikai&age=3`

    ```xml
    <jsp:forward page="/jsptag2.jsp">
        <jsp:param name="name" value="kaikai"></jsp:param>
        <jsp:param name="age" value="3"></jsp:param>
    </jsp:forward>
    ```

- 测试页-要能取出参数
    - 一种方式是el表达式，这里面只有`requestScope`，不方便

        ```java
        $(requestScope.get(""))
        ```

    - 现在想从`request` 对象中取用， 所以还是用`<%=var%>`

        ```java
        <%--取出参数--%>
        名字：<%=request.getParameter("name")%>
        年龄：<%=request.getParameter("age")%>
        ```

- test

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20127.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20127.png)

### Demo: jsp include标签

- 这个之前详细讲过，可以拼接

    ```xml
    <jsp:include page= "/common/header.jsp"/>
    <jsp:include page= "/common/footer.jsp"/>
    ```

### JSTL表达式

- JSTL标签库的使用是为了弥补html标签的不足
- 原生的html标签有限
- JSTL自定义了很多标签（带功能），供我们使用（标签功能和java代码功能一样）
- 之前有讲过include, page, 只剩这个taglib没讲啦~

### JSTL核心标签（掌握部分）

- 引入JSTL核心标签库我们才能使用JSTL标签
    - prefix 的 c 代表core

        ```java
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20128.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20128.png)

### Demo：core if

- JSTL标签例子

    ```java
    <%--如果是admin，登陆成功--%>

    <c:if test="${param.username=='admin'}" var="isAdmin">
        <c:out value="欢迎登录"/>
    </c:if>

    <c:out value="${isAdmin}"/>
    ```

    java的例子（判断是否admin）

    ```java
    // java实现的逻辑
    <%
    if (request.getParam("username".equals("admin"))){
        out.print("logged in successfully!");
    }
    %>
    ```

- 完整code

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <%--引入JSTL核心标签库我们才能使用JSTL标签--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <html>
    <head>
    </head>
    <body>
    <hr>

    <h4>if测试</h4>
    <form action="coreif.jsp" method="get">
        <%--el表达式获取表单中的data，用${param.参数名}--%>
        <input type="text" name="username" value="${param.username}">
        <input type="submit" name="登录">
    </form>

    <%--如果是admin，登陆成功--%>

    <c:if test="${param.username=='admin'}" var="isAdmin">
        <c:out value="欢迎登录"/>
    </c:if>

    <c:out value="${isAdmin}"/>
    </body>
    </html>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20129.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20129.png)

### Demo: core when例子

- 赋值变量

    ```java
    <c:set var="score" value="99"/>
    ```

- choose when相当于case when，其中test为条件，满足的话执行，判断是按照顺序执行，后面的是else里的

    ```java
    <c:choose>
    	<c:when test="${score>=90}">
    	  优秀
    	</c:when>
    </c:choose>
    ```

- code

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <head>
    </head>
    <body>

    <%--定义一个变量score，赋值99--%>
    <c:set var="score" value="99"/>

    <c:choose>
        <c:when test="${score>=90}">
            优秀
        </c:when>
        <c:when test="${score>=80}">
            一般
        </c:when>
        <c:when test="${score>=70}">
            良好
        </c:when>
        <c:when test="${score<=60}">
            烂
        </c:when>
    </c:choose>

    </body>
    </html>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20130.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20130.png)

### Demo：core foreach例子

- forEach中var是代指每一个元素的var，然后items是要遍历的对象

    ```java
    <c:forEach var="person" items="${list}">
        <c:out value="${person}"/> <br>
    </c:forEach>
    ```

- code

    ```java
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.lang.reflect.Array" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
    </head>
    <body>

    <%
        ArrayList<String> people = new ArrayList();
        people.add(0,"张三");
        people.add(1,"李四");
        people.add(2,"王五");
        people.add(3,"赵六");
        people.add(4,"田七");
        request.setAttribute("list",people);
    //    也可以放在session里面，但是request用完就没了，更节省资源，所以还是选择request
    %>

    <c:forEach var="person" items="${list}">
        <c:out value="${person}"/> <br>
    </c:forEach>

    </body>
    </html>
    ```

- 此外还可以设置start, end, step等参数

    ```java
    <c:forEach begin="1" end="3" step="2" var="person" items="${list}">
        <c:out value="${person}"/> <br>
    </c:forEach>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20131.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20131.png)

## JavaBean

- [ ]  [P22javaweb-22：JavaBean及作业26:19](https://www.bilibili.com/video/BV12J411M7Sj?p=22)

### 什么是JavaBean

- JavaBean 理解成 实体类，
- JavaBean有特定的写法（符合这些的就是JavaBean）
    - 要有一个无参构造
    - 属性必须私有化
    - 必须有对应的get, set方法
- 一般用来和数据库的column做mapping映射

### ORM

- Object relationship mapping
- DB的table 对应 java类class
- table 的column对应 java类的attribute
- table 的row对应 java类的对象object

### table和java实体类的关系

[Table](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Table%20847462498b03401689cdb9d14b08ad79.csv)

```java
class People{
	private int id;
	private String name;
	private int age;
  private String address;
}

class A{
	new People(1,"Kai1",3,"北京");
	new People(2,"Kai2",12,"上海");
	new People(3,"Kai3",23,"济南");
}
```

### java文件命名

- 实体类所在dir一般可以命名为
    - entity
    - pojo （意思是一个普通java对象）
    - vo
    - dto

### table和java实体类的关系-Example

- java实体类和恶DB中的表结构一一对应
- DB table

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20132.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20132.png)

- java实体类，一般包括
    - column作为attribute
    - 有参，无参构造
    - set，get方法
    - 可以加重写toString

    ```java
    package com.kaitan.pojo;

    public class People {
        private int id;
        private String name;
        private int age;
        private String address;

        public People(){
        }

        public People(int id, String name, int age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString(){
            return "People{"+
                    "id=" +id+
                    ", name='" +name + '\''+
                    ", age=" +age +
                    ", address='" +address + '\''+
                    '}';
        }
    }
    ```

### 使用jsp标签 调用实体类对DB进行操作

- jsp代码

    ```java
    <%--
      Created by IntelliJ IDEA.
      User: sunka
      Date: 5/27/2021
      Time: 11:25 PM
      To change this template use File | Settings | File Templates.
    --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ page import="com.kaitan.pojo.People" %>
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>

    <%
    //    People people = new People();
    //    people.setAddress();
    //    people.setId();
    //    people.setAge();
    //    people.setName();
    %>
    <jsp:useBean id="people" class="com.kaitan.pojo.People" scope="page"/>
    <jsp:setProperty name="people" property="address" value="西安"/>
    <jsp:setProperty name="people" property="id" value="1"/>
    <jsp:setProperty name="people" property="age" value="111"/>
    <jsp:setProperty name="people" property="name" value="kaikai"/>

    name: <jsp:getProperty name="people" property="name"/>
    id: <jsp:getProperty name="people" property="id"/>
    age: <jsp:getProperty name="people" property="age"/>
    address: <jsp:getProperty name="people" property="address"/>
    </body>
    </html>
    ```

- test

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20133.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20133.png)

### 作业项目

- 运行sql创建5个表
- 为这些表分别创建pojo实体类
    - 注意datetime要转变成date类型
    - bigint要变成长整型
- 看一眼静态资源中jsp代码
- 查看java类看如何分页

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20134.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20134.png)

## MVC三层架构

- [ ]  [P23javaweb-23：MVC三层架构23:59](https://www.bilibili.com/video/BV12J411M7Sj?p=23)

### 三层架构

- 在微服务之前，都用这个框架开发，包括SSM
- MVC框架：
    - model模型: 指java实体类与DB的column对应
    - view试图：JSP页面
    - controller控制器：servlet
- 虽然servlet和JSP都能开发，但是要明确分工

### MVC框架解释（早期）

- controller(servlet)：
    - 接收用户请求，可以获取param，get session
    - response响应给客户端内容
    - 跳转：重定向，转发
- jsp view视图层（跟前端页面相关）
    - 展示数据
    - 提供可以供我们操作的请求，比如发起注销，发起登录（前端）
- jsp其实就是servlet，所以controller和jsp的本质没有区别，都可以写java代码，为了易于维护和使用，规定
    - servlet专注于：处理request，view跳转
    - JSP专注于：显示数据（不用写java代码了）
- DB数据库
    - official存数据
    - JavaBean：java实体类(pojo, entity, vo, dto,...)，映射DB
    - 操作DB需要JDBC

### 早年架构

- 用户直接访问controller控制层，控制层可以直接操作DB

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20135.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20135.png)

- servlet中直接写CRUD增删改查，来操作DB，弊端是JDBC代码也要写到servlet的处理请求里，程序臃肿，不利于维护
- servlet中需要：处理请求（doGet, doPost），试图跳转（重定向，转发），响应回去东西，处理JDBC，处理业务代码，处理逻辑代码
- 架构：没有什么是加一层解决不了的（比如JDBC这层帮助连接不同厂商生产DB，程序员调用JDBC就行）

### 现代解决方案

- controller(servlet)：
    - 接收用户请求，可以获取param，get session
    - 不用response响应给客户端内容，这个交给业务层去做
    - 视图跳转：重定向，转发（转发到jsp页面，可以携带param）
- jsp view视图层（跟前端页面相关）
    - 展示数据模型
    - 提供用户操作（用户不需要写入任何code，直接前端界面操作就好）
- jsp其实就是servlet，所以controller和jsp的本质没有区别，都可以写java代码，为了易于维护和使用，规定
    - servlet专注于：处理request，view跳转
    - JSP专注于：显示数据（不用写java代码了）

### MVC三层架构运作流程

- 用户只用看view，然后view上面可以点击跳转，各种操作，z这些request会被导到servlet来调度
- servlet发现user需要做业务的时候直接导到业务层
- 业务层service包括各种业务，比如log in, log out, 查询
- 业务层导到JavaBean去跟DB进行交互，返回结果到业务层， 业务层再把结果返回给servlet，servlet再传给view视图，view最终返回给user

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20136.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20136.png)

- 一般将Service和JavaBean称为Model
    - Model用来控制业务操作，保存数据，修改数据，删除数据，查询数据
    - 在这里会在JavaBean和service这里再加一层叫DAO
    - DAO用来操作DB
    - 因为实体类会被DAO和service用到，单独提出来

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20137.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20137.png)

### MVC三层总结

- Model
    - 负责业务处理：产生业务逻辑（称为service）
    - 数据持久层：负责CRUD（使用Dao层）
- View
    - 展示数据
    - 提供链接，发起Servlet请求（a，form, img, ...）
- Controller(目前学的是Servlet，其实还有别的controller)
    - 接收用户请求：用request接收请求参数，session信息,...
    - 交给业务层处理对应的代码
    - 控制view跳转
        - 比如log in时，先接受用户的登录请求
        - 然后到一个servlet地址，servlet获取用户登录的参数(username, password)，处理用户请求
        - servlet调用业务层service处理登录业务（判断用户名，密码是否正确）
        - service交给Dao层查询DB中的username, password是否正确

            注意，与DB的交互其实都可以交给Dao，那为什还要service层呢？这是为了某些特殊的情况，比如transaction的处理只能在Service上完成

        - 然后一层一层返回

## Filter（重点）

- [ ]  [P24javaweb-24：过滤器Filter26:08](https://www.bilibili.com/video/BV12J411M7Sj?p=24)

### Filter

- 用来过滤网站的数据
- 可以做很多事情
    - 处理中文乱码
    - 登陆验证
    - ...

### 流程

- web浏览器发送request到web server，web server交给servlet来访问各种资源（JSP, html, stats-img ...）
- 此时，可以在web server和servlet之间增加一层filter（框架思想）
- web server请求资源的时候，要经过filter，已过滤掉垃圾请求（后台不处理，或者把报错，比如骂人）
- server返回出去的时候，仍然要通过filter，比如如果发现乱码问问题，可以在这里处理
- servlet需要拿到，处理request 和 response，filter也需要request和response，所以其实servlet和filter一模一样
- 区别就是，servlet实现servlet接口，filter实现filter接口

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20138.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20138.png)

### filter开发步骤

1. 导包
2. 编写filter

### 创建新项目

1. 普通maven（不勾选webapp）
2. add framework-最新的web app

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20139.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20139.png)

3. 在pom.xml中导包

    ```xml
    <dependencies>
        <!--   Servlet依赖-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
        </dependency>
        <!--            JSP依赖-->
        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>javax.servlet.jsp-api</artifactId>
            <version>2.3.3</version>
        </dependency>
        <!--            JSTL表达式-->
        <dependency>
            <groupId>javax.servlet.jsp.jstl</groupId>
            <artifactId>jstl-api</artifactId>
            <version>1.2</version>
        </dependency>
        <!--        标签库    -->
        <dependency>
            <groupId>taglibs</groupId>
            <artifactId>standard</artifactId>
            <version>1.1.2</version>
        </dependency>
        <!--        连接数据库    -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
    </dependencies>
    ```

### Servlet上的encoding

- class继承HttpServlet

    ```java
    package com.kaitan.servlet;

    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;

    public class ShowServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("你好 世界");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        }
    }
    ```

- 配置web.xml

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
             version="4.0">
        <servlet>
            <servlet-name>ShowServlet</servlet-name>
            <servlet-class>com.kaitan.servlet.ShowServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>ShowServlet</servlet-name>
            <url-pattern>/servlet/show</url-pattern>
        </servlet-mapping>
    </web-app>
    ```

- 配置run configuration
    - tomcat

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20140.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20140.png)

- 在没有encode的时候，会出现乱码：
    - [http://localhost:8080/javaweb_filter_war_exploded/show](http://localhost:8080/javaweb_filter_war_exploded/show)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20141.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20141.png)

- 增加encoding，发现可以显示中文了
    - `resp.setCharacterEncoding("utf-8");` 这个不work
    - `resp.setContentType("text/html;charset=utf-8");` 这个work，能显示中文

        ```java
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // resp.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("你好 世界");
        }
        ```

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20142.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20142.png)

### 用servet encoding的问题讨论

- 如果有很多个servlet，每个servlet都要写 `resp.setContentType("text/html;charset=utf-8");`
- 这个可以用filter解决

### Demo 使用filter来encoding

- 实现类要implements Filter
- 注意，有多个类的filter，要选择 `javax.servlet.Filter`
- 要重写这三个方法

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20143.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20143.png)

- filter需要在web.xml中配置

    注意，这个`/*` 最好不要随便加，哪怕多写几个filter配置。如果有`/*` ，不需要走的小request也要过filter的话比较浪费

    ```xml
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>com.kaitan.filter.CharacterEncodingFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <!--只要是/servlet/中的任何request 都会经过这个filter-->
        <url-pattern>/servlet/*(</url-pattern>
    </filter-mapping>
    ```

- test
    - [`http://localhost:8080/javaweb_filter_war_exploded/show`](http://localhost:8080/javaweb_filter_war_exploded/show) 显示乱码，因为没走filter
    - [`http://localhost:8080/javaweb_filter_war_exploded/servlet/show`](http://localhost:8080/javaweb_filter_war_exploded/servlet/show) 成功显示中文，走了filter

### Filter运行流程

- 写filter的时候要在web.xml中配filter
- web server 启动的时候，就运行了Filter实现类中的初始化方法`init()` ,随时等待filter对象出现
    - 一般在init时，可以做一些监听log
    - 可以从唯一的参数filterConfig中拿到一些信息，设置一些固有属性，这样都可以访问（一般不这么做）
- Chain
    - Filter中的所有代码在过滤特定request的时候都会执行
    - 必须要让filter继续通行，即使用`filterChain.doFilter(servletRequest,servletResponse);`转交（让我们的请求继续走，如果不写，到这里程序会拦截停止）
- web server 关闭的时候（right before），Filter才会销毁
    - 可以在`destroy()` 中，写`System.gc()`清理回收站（没啥用）
- 可以有多个filter chain在一起

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20144.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20144.png)

### Demo 验证登录

- 客户首先访问到`index.jsp` ,输入登录信息，提交表单到`${pageContext.request.contextPath}/servlet/login` ，这个request根据`web.xml` 中 `/servlet/login` 的配置，会跳转到`com.kaitan.servlet.LoginServlet` 来运行，`LoginServlet` 会根据客户输入的param分别导到`success.jsp` 或 `error.jsp` 页面
- 注意path问题
    1. sendRedirect要写上项目名称

        ```java
        resp.sendRedirect("/javaweb_filter_war_exploded/sys/success.jsp");
        ```

    2. 提交的表单写上相对路径

        ```xml
        <form action="${pageContext.request.contextPath}/servlet/login" method="post">
            <input type="text" name="username">
            <input type="submit">
        </form>
        ```

- Code

    ```java
    //LoginServlet.java
    package com.kaitan.servlet;

    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;

    public class LoginServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //获取前端request的参数
            String username = req.getParameter("username");
            if (username.equals("admin")){
                //登陆成功
                req.getSession().setAttribute("USER_SESSION",req.getSession().getId());
                resp.sendRedirect("/javaweb_filter_war_exploded/sys/success.jsp");
            }else{//登陆失败
                resp.sendRedirect("/javaweb_filter_war_exploded/error.jsp");
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

- login.jsp 客户看到的第一个界面，可以输入username

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <h1>Log In</h1>
    <br>
    <form action="${pageContext.request.contextPath}/servlet/login" method="post">
        <input type="text" name="username">
        <input type="submit">
    </form>
    </body>
    </html>
    ```

- web.xml

    ```xml
    <servlet>
        <servlet-name>LoginServlet</servlet-name>
        <servlet-class>com.kaitan.servlet.LoginServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>LoginServlet</servlet-name>
        <url-pattern>/servlet/login</url-pattern>
    </servlet-mapping>
    ```

### 注销session

- 因为创建session耗费资源，一般不建议真正销毁session
- 常规操作是，user登陆以后，添加user_session变量到session中，进入主页的时候判断是否登录，未登录会导向error界面，注销的时候移走user_session就行
- code：在登陆的时候保存user_session变量到session, 注销的时候，
    - LogoutServlet.java

        ```java
        public class LogoutServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                Object user_session = req.getSession().getAttribute("USER_SESSION");
                if(user_session!=null){
                    req.getSession().removeAttribute("USER_SESSION");
                    resp.sendRedirect("javaweb_filter_war_exploded/login.jsp");
                }

            }

            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
        }
        ```

    - web.xml

        ```xml
        <servlet>
            <servlet-name>LogoutServlet</servlet-name>
            <servlet-class>com.kaitan.servlet.LogoutServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>LogoutServlet</servlet-name>
            <url-pattern>/servlet/logout</url-pattern>
        </servlet-mapping>
        ```

    - error.jsp

        ```xml
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>
        <head>
            <title>Title</title>
        </head>
        <body>
        <h3>Error</h3>
        <h3>No authorization</h3>

        <a href="${pageContext.request.contextPath}/login.jsp">Return to log-in page</a>
        </body>
        </html>
        ```

### Demo 在注销情况下访问main page会自动跳转到登录界面

- 可以在success.jsp中完成，但是比较low

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>

    <%
        Object user_session = request.getSession().getAttribute("USER_SESSION");
        if(user_session==null){
            pageContext.forward("/login.jsp");
        }
    %>

    <h1>Main Page</h1>
    <p><a href="${pageContext.request.contextPath}/servlet/logout">注销</a></p>
    </body>
    </html>

    ```

- 可以在过滤器中完成 要访问sys下的东西的时候，如果session中没有user_session变量，自动跳转错误页面
- SysFilter.java

    ```java
    public class SysFilter implements Filter {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
            Filter.super.init(filterConfig);
        }

        @Override
        public void destroy() {
            Filter.super.destroy();
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;

            if(request.getSession().getAttribute("USER_SESSION")==null){
                response.sendRedirect("/javaweb_filter_war_exploded/error.jsp");
            }

            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    ```

- sys/success.jsp

    ```xml
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>

    <h1>Main Page</h1>
    <p><a href="${pageContext.request.contextPath}/servlet/logout">注销</a></p>
    </body>
    </html>
    ```

- web.xml
    - 针对sys中的东西进行filter

    ```xml
    <filter>
        <filter-name>SysFilter</filter-name>
        <filter-class>com.kaitan.filter.SysFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>SysFilter</filter-name>
        <url-pattern>/sys/*</url-pattern>
    </filter-mapping>
    ```

### variable复用

- 有的attribute在代码很多地方都有使用，比如`"USER_SESSION"`
- 问题是，如果想改这个名字，要改很多地方
- 最佳处理方法是在统一管理这些变量名
    - final全局唯一
    - 比如新建一个package `java.util.Constant`

        ```java
        package com.kaitan.util;

        public class Constant {
            public final static String USER_SESSION = "USER_SESSION";
        }
        ```

    - 使用的时候，用`Constant.USER_SESSION` 调用就行

        ```java
        request.getSession().getAttribute(Constant.USER_SESSION)
        ```

### vip

- user可能有以下属性
    - id
    - name
    - level(VIP)
- 早期也可以通过filter来导向不同的VIP登记

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20145.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20145.png)

- [ ]  [P25javaweb-25：监听器20:37](https://www.bilibili.com/video/BV12J411M7Sj?p=25)

## Listener

### Listener

- 在java web中listener的实现越来越少了
- 实现listener接口就可以了（有很多listener）

### Demo Listener使用过程

- 监听器的编写：listener实现类继承，比如`HttpSessionListener`
    - 这里，监听到session创建的时候执行`sessionCreated` event
    - 监听到session销毁的时候执行`sessionDestroyed` event

    ```java
    package com.kaitan.listener;

    import javax.servlet.ServletContext;
    import javax.servlet.http.HttpSessionEvent;
    import javax.servlet.http.HttpSessionListener;

    //统计网站在线人数：统计一共有多少个session（因为一个session就代表一个人）
    public class OnlineCountListener implements HttpSessionListener {
        //创建Session监听 看你的一举一动
        //一旦创建Session就会触发一次这个event
        @Override
        public void sessionCreated(HttpSessionEvent se) {
            ServletContext ctx = se.getSession().getServletContext();
            Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
            if (onlineCount==null){
                onlineCount=new Integer(1);
            }else {
                int count = onlineCount.intValue();
                onlineCount= new Integer(count+1);
            }
            ctx.setAttribute("OnlineCount", onlineCount);
        }

        //销毁Session监听
        //一旦session销毁，就会触发这个event
        @Override
        public void sessionDestroyed(HttpSessionEvent se) {
            ServletContext ctx = se.getSession().getServletContext();
            Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
            if (onlineCount==null){
                onlineCount=new Integer(0);
            }else {
                int count = onlineCount.intValue();
                onlineCount= new Integer(count-1);
            }
            ctx.setAttribute("OnlineCount", onlineCount);    }
    }
    ```

- 写一个前端页面

    ```java
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
      <head>
        <title>$Title$</title>
      </head>
      <body>
      <h1>当前有 <span><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%> </span>人在线</h1>
      </body>
    </html>
    ```

- 在web.xml配置listener就自动启动了~

    ```xml
    <listener>
        <listener-class>com.kaitan.listener.OnlineCountListener</listener-class>
    </listener>
    ```

### 注意细节

- 如果明明是一个人，但是却显示多人在线，可能是因为tomcat启动的时候没成功，启动了多个session（此时可以查看session ID）
- 测试发现，不同的浏览器确实是不同session

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20146.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20146.png)

- 突然关掉一个browser不会导致session销毁（人数减少）
- 销毁的两种情况(之前session的时候讲过)
    - 手动销毁：`se.getSession().invalidate();`
    - 或者在web.xml配置

        ```xml
        <session-config>
        	<session-timeout>1</session-timeout>
        </session-config>
        ```

## Filter + Listener常见应用

### Demo 简单的监听例子

- java

    ```java
    package com.kaitan.listener;

    import java.awt.*;
    import java.awt.event.WindowEvent;
    import java.awt.event.WindowListener;

    public class TestPanel {
        public static void main(String[] args) {
            Frame frame = new Frame("Happy Happy");//新建一个窗体
            Panel panel = new Panel(null);//新建一个面板

            frame.setLayout(null);//设置窗体的布局
            frame.setBounds(300,300,500,500);
            frame.setBackground(new Color(0,0,255));

            panel.setBounds(50,50,300,300);
            panel.setBackground(new Color(0,255,0));

            frame.add(panel);
            frame.setVisible(true);

            //listen event, to close
            frame.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {
                    System.out.println("Opening");
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("Closing");
                    System.exit(0);
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    System.out.println("CLosed");
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {
                    System.out.println("Activated");
                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                    System.out.println("Not Activated");
                }
            });
        }
    }
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20147.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20147.png)

- 如果只需要实现一种方法，可以采用Adapter（Adapter继承了大类的listener）

    ```java
    //listen event, to close
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Closing");
            System.exit(0);
        }
    });
    ```

### 监听器-GUI编程中经常使用

- GUI：图形界面编程

### Demo 用户登陆之后才能进入主页，注销之后不能进入主页

- [ ]  [P26javaweb-26：监听器GUI中理解09:20](https://www.bilibili.com/video/BV12J411M7Sj?p=26)
- [ ]  [P27javaweb-27：Filter实现权限拦截31:44](https://www.bilibili.com/video/BV12J411M7Sj?p=27)

### jdbc连接流程

1. 开一个普通的maven
2. 在pom.xml中配置包

    ```xml
    <dependencies>
    <!--mySQL驱动-->
    <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
    </dependencies>
    ```

3. IntelliJ中添加DB-MySQL-用户，密码-添加Schema，连接
4. 代码
    1. 加载Driver驱动
    2. 连接DB，用connection代表DB
    3. 向DB发送SQL的对象Statement
    4. 编写SQL
    5. 执行SQL
    6. 关闭连接

    ```java
    package com.kaitan.test;

    import java.sql.*;

    public class TestJdbc {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            //配置信息
            String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false"; //true: exception
            String username ="root";
            String password ="root";

            //1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库
            Connection connection = DriverManager.getConnection(url, username, password);
            //3.send SQL to DB
            Statement statement = connection.createStatement();
            //4. write SQL
            String sql = "select * from users";

            //5. execute SQL
            ResultSet resultSet = statement.executeQuery(sql);
            //6.results
            while (resultSet.next()){
                System.out.println("id"+resultSet.getObject("id"));
                System.out.println("id"+resultSet.getObject("name"));
                System.out.println("id"+resultSet.getObject("birthday"));
            }
            //6.close connection
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
    ```

### Test

- 使用junit包

    ```xml
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
    ```

- 在想测试的方法上直接加上@Test，运行的时候就有test结果了

    ```java
    package com.kaitan.test;
    import org.junit.Test;
    public class TestO {
        @Test
        public void Test(){
            System.out.println("hello");
        }
    }
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20148.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20148.png)

### Demo Test

- 用@Test测试JDBC

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20149.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20149.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20150.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20150.png)

- [ ]  [P28javaweb-28：JDBC复习42:37](https://www.bilibili.com/video/BV12J411M7Sj?p=28)
- [ ]  [P29javaweb-29：JDBC事务19:01](https://www.bilibili.com/video/BV12J411M7Sj?p=29)

## SMBMS搭建-准备工作

### SMBMS系统

- 框架

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20151.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20151.png)

- DB

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20152.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20152.png)

### 第一步：项目搭建

1. 从Maven开始-web模板
2. 清理pom.xml

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>

      <groupId>org.example</groupId>
      <artifactId>smbms</artifactId>
      <version>1.0-SNAPSHOT</version>
      <packaging>war</packaging>

    </project>
    ```

3. 更新web.xml版本 （从tomcat webapps示例中的web.xml去看）

    ```xml
    <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                          http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
      version="4.0"
      metadata-complete="true">

    </web-app>
    ```

4. 在main中增加java和resources的dir

### 第二步：run配置Tomcat

- tomcat 9
- Tomcat Server-local
- 测试server是否可以运行

### 第三步：导入dependencies

在pom.xml中导入dependencies

- mysql connection
- servlet
- junit
- jsp
- jstl
- taglibs

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>

      <groupId>org.example</groupId>
      <artifactId>smbms</artifactId>
      <version>1.0-SNAPSHOT</version>
      <packaging>war</packaging>
      <dependencies>
        <!--            Servlet依赖-->
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>javax.servlet-api</artifactId>
          <version>4.0.1</version>
        </dependency>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.12</version>
        </dependency>
        <!--            JSP依赖-->
        <dependency>
          <groupId>javax.servlet.jsp</groupId>
          <artifactId>javax.servlet.jsp-api</artifactId>
          <version>2.3.3</version>
        </dependency>
        <!--            JSTL表达式-->
        <dependency>
          <groupId>javax.servlet.jsp.jstl</groupId>
          <artifactId>jstl-api</artifactId>
          <version>1.2</version>
        </dependency>
        <!--        标签库    -->
        <dependency>
          <groupId>taglibs</groupId>
          <artifactId>standard</artifactId>
          <version>1.1.2</version>
        </dependency>
        <!--mySQL驱动-->
        <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>5.1.47</version>
        </dependency>
      </dependencies>
    </project>
    ```

### 第四步：创建项目包结构

- 建立package结构

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20153.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20153.png)

### 第五步：建立entity实体类

- 先建立DB（下面是创建DB的SQL代码）
    - [https://raw.githubusercontent.com/WalterWen/smbms/master/smbms.sql](https://raw.githubusercontent.com/WalterWen/smbms/master/smbms.sql)

        [SQL](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/SQL%204f719eafa86d44c98010c38b18138de1.md)

- 在dojo中建立实体类（可以从IntelliJ打开DB连接，然后对照着写）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20154.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20154.png)

    - 有几个table就有几个实体类
    - 每个类写
        - private变量声明（注意数据类型）
        - generate-setter, getter(注意如果是calculated fiel都要写上方法)

            ```java
            private Integer age;

            public Integer getAge() {
                Date date = new Date();
                Integer age = date.getYear()-birthday.getYear();
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }
            ```

    - 完成ORM表和class的映射

### 第六步：编写基础公共类

1. 在resources中添加DB配置文件db.properties

    ```java
    driver=com.mysql.jdbc.Driver
    url=jdbc:mysql://localhost:3306/smbms?useSSL=false&useUnicode=true&characterEncoding=utf-8
    password=root
    username=root
    ```

2. 在dao中写一个BaseDao类 （操作DB的公共类）

    ```java
    package com.kaitan.dao;

    import java.io.IOException;
    import java.io.InputStream;
    import java.sql.*;
    import java.util.Properties;

    public class BaseDao {
        private static String driver;
        private static String url;
        private static String username;
        private static String password;
        //类加载的时候就初始化了
        static{
            Properties properties = new Properties();
            InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");

            try {
                properties.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }

            driver= properties.getProperty("driver");
            url= properties.getProperty("url");
            username= properties.getProperty("username");
            password= properties.getProperty("password");
        }

        //获取DB的连接
        public static Connection getConnection(){
            Connection connection = null;
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return connection;
        }

        //编写查询的公共类
        public static ResultSet execute(Connection connection, String sql,Object[] params, ResultSet resultSet, PreparedStatement preparedStatement) throws SQLException {
            preparedStatement = connection.prepareStatement(sql);
            for (int i =0; i < params.length; i++) {
                preparedStatement.setObject(i+1,params[i]);
            }
            resultSet = preparedStatement.executeQuery();
            return resultSet;

        }

        //编写增删改的公共方法
        public static int execute(Connection connection, String sql,Object[] params, PreparedStatement preparedStatement) throws SQLException {
            preparedStatement = connection.prepareStatement(sql);
            for (int i =0; i < params.length; i++) {
                preparedStatement.setObject(i+1,params[i]);
            }
            int updateRows = preparedStatement.executeUpdate();
            return updateRows;

        }

        //释放资源
        public static boolean closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet ) throws SQLException {
            boolean flag=true;
            if (resultSet!=null){
                try{
                    resultSet.close();
                    resultSet=null;
                }catch(SQLException e){
                    e.printStackTrace();
                    flag=false;
                }
            }

            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                    preparedStatement=null;
                }catch(SQLException e){
                    e.printStackTrace();
                    flag=false;
                }
            }

            if (connection!=null){
                try{
                    connection.close();
                    connection=null;
                }catch(SQLException e){
                    e.printStackTrace();
                    flag=false;
                }
            }
            return flag;
        }
    }
    ```

3. 编写Filter-编码
    - filter - CharacterEncodingFilter

        ```java
        package com.kaitan.filter;

        import javax.servlet.*;
        import java.io.IOException;

        public class CharacterEncodingFilter implements Filter {
            public void init(FilterConfig filterConfig) throws ServletException {
            }

            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                servletRequest.setCharacterEncoding("utf-8");
                servletResponse.setCharacterEncoding("utf-8");
                filterChain.doFilter(servletRequest,servletResponse);
            }

            public void destroy() {
            }
        }
        ```

    - 在web.xml中配置

        ```xml
        <filter>
          <filter-name>CharacterEncodingFilter</filter-name>
          <filter-class>com.kaitan.filter.CharacterEncodingFilter</filter-class>
        </filter>
        <filter-mapping>
          <filter-name>CharacterEncodingFilter</filter-name>
          <url-pattern>/*</url-pattern>
        </filter-mapping>
        ```

### 第七步：导入静态资源

- 将静态项目导入webapp

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20155.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20155.png)

## SMBMS-登录功能实现

### 想要实现的功能

- 功能

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20156.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20156.png)

### 第一步：编写前端页面

- 这个直接用狂神的：webapp/login.jsp
    - 注意，要将

        ```xml
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
        ```

        改成

        ```xml
        <link type="text/css" rel="stylesheet" href="css/style.css" />
        ```

    ```java
    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>系统登录 - 超市订单管理系统</title>
        <link type="text/css" rel="stylesheet" href="css/style.css" />
        <script type="text/javascript">
            /* if(top.location!=self.location){
                  top.location=self.location;
             } */
        </script>
    </head>
    <body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>超市订单管理系统</h1>
        </header>
        <section class="loginCont">
            <form class="loginForm" action="${pageContext.request.contextPath}/login.do"  name="actionForm" id="actionForm"  method="post" >
                <div class="info">${error}</div>
                <div class="inputbox">
                    <label for="userCode">用户名：</label>
                    <input type="hidden" name = "method" value="checkLogin">
                    <input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
                </div>
                <div class="inputbox">
                    <label for="userPassword">密码：</label>
                    <input type="password" id="userPassword" name="userPassword" placeholder="请输入密码" required/>
                </div>
                <div class="subBtn">
                    <input type="submit" value="登录"/>
                    <input type="reset" value="重置"/>
                </div>
            </form>
        </section>
    </section>
    <%
        session.removeAttribute("error");
    %>
    </body>
    </html>
    ```

- 配置web.xml-设置首页

    ```xml
    <!--设置欢迎页-->
    <welcome-file-list>
      <welcome-file>/login.jsp</welcome-file>
    </welcome-file-list>
    ```

### 第二步：编写dao层userd登录的接口

- 这个接口就是约束规范获得user的方法
- `dao/user/UserDao`

    ```java
    package com.kaitan.dao.user;

    import com.kaitan.pojo.User;

    import java.sql.Connection;
    import java.sql.SQLException;

    public interface UserDao {
        //得到要登陆的user
        public User getLoginUser(Connection connection, String userCode) throws SQLException;
    }
    ```

### 第三步：编写dao接口的实现类

- 这个方法implement上面的规范Interface
- 获取user的方法：根据DB连接，获取指定userCode的对象，然后将DB中该userCode的信息依次存入entity对象（user）中，然后return 该user
- `dao/user/UserDaoImp1.java`

    ```java
    package com.kaitan.dao.user;

    import com.kaitan.dao.BaseDao;
    import com.kaitan.pojo.User;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;

    public class UserDaoImp1 implements UserDao{
        public User getLoginUser(Connection connection, String userCode) throws SQLException {

            PreparedStatement pstm = null;
            ResultSet rs = null;
            User user = null;

            if (connection !=null){
                String sql = "Select * from smbms_user where userCode=?";
                Object[] params = {userCode};

                rs = BaseDao.execute(connection, sql,params,rs,pstm);

                if (rs.next()){
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUserCode(rs.getString("userCode"));
                    user.setUserName(rs.getString("userName"));
                    user.setUserPassword(rs.getString("userPassword"));
                    user.setGender(rs.getInt("gender"));
                    user.setBirthday(rs.getDate("birthday"));
                    user.setPhone(rs.getString("phone"));
                    user.setAddress(rs.getString("address"));
                    user.setUserRole(rs.getInt("userRole"));
                    user.setCreatedBy(rs.getInt("createdBy"));
                    user.setCreationDate(rs.getDate("creationDate"));
                    user.setModifyBy(rs.getInt("modifyBy"));
                    user.setModifyDate(rs.getDate("modifyDate"));

                }
                //connection等到业务层再操作
                BaseDao.closeResource(null,pstm,rs);

            }
            return user;
        }
    }
    ```

### 第四步：编写业务层接口

- `com/kaitan/service/user/UserService.java`

    ```java
    package com.kaitan.service.user;
    import com.kaitan.pojo.User;

    public interface UserService {
        //用户登录
        public User login(String userCode, String password);
    }
    ```

### 第五步：编写业务层实现类

- implement上面的UserService接口
- 因为要调用UserDaoImp1的方法，直接实例化一个UserDaoImp1，后面就可以运行方法`userDao.getLoginUser()`了（在这之前并没有运行过这个方法）

    ```java
    //业务层会调用dao层，所以要引入dao层
    private UserDao userDao;

    //被new出来的时候就实例化了
    public UserServiceImp1(){
        userDao = new UserDaoImp1();
    }
    ```

- 编写login方法：创立DB connection，然后根据userCode调取返回user信息
- `com/kaitan/service/user/UserServiceImp1.java`

    ```java
    public class UserServiceImp1 implements UserService{
        //业务层会调用dao层，所以要引入dao层
        private UserDao userDao;

        //被new出来的时候就实例化了
        public UserServiceImp1(){
            userDao = new UserDaoImp1();
        }
        public User login(String userCode, String password) {
            Connection connection = null;
            User user = null;

            try {
                connection = BaseDao.getConnection();
                //通过业务层调用具体的DB操作
                user = userDao.getLoginUser(connection,userCode);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    BaseDao.closeResource(connection,null,null);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return user;
        }

        @Test
        public void test(){
            UserServiceImp1 userService = new UserServiceImp1();
            User admin = userService.login("sunlei","1234567");
            System.out.println(admin.getUserPassword());
        }
    }
    ```

- 注意，可以通过junit直接进行测试

    ```java
    @Test
    public void test(){
        UserServiceImp1 userService = new UserServiceImp1();
        User admin = userService.login("sunlei","1234567");
        System.out.println(admin.getUserPassword());
    }
    ```

    - 注意如果是nullPointer报错，说明DB中找不到这条数据

### 第六步：编写Servlet

- 接收request中的userCode, userPassword,然后调用`userServiceImp1.login(userCode, userPassword)` 获取DB中的对应user信息，如果信息正确，将DB中的user信息储存金session，并跳转到主页，如果不对，返回登录页面并提示密码或username不正确
- src/main/java/com/kaitan/servlet/user/LoginServlet.java

    ```java
    public class LoginServlet extends HttpServlet {
        //控制层servlet要调用业务层
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("LoginServlet--start ...");
            String userCode = req.getParameter("userCode");
            String userPassword = req.getParameter("userPassword");

            UserServiceImp1 userServiceImp1 = new UserServiceImp1();
            // found the user
            User user = userServiceImp1.login(userCode, userPassword);
            if (user!=null){
                //查有此人，可以登录
                //将用户信息放到session中
                req.getSession().setAttribute(Constants.USER_SESSION,user);
                //跳转到主页
                resp.sendRedirect("/smbms_war/jsp/frame.jsp");
            }else{
                //查无此人，转到登陆页面，提示他有错误
                req.setAttribute("error","用户名或者密码不正确");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

### 第七步：注册Servlet

- web.xml

    ```xml
    <!--servlet-->
    <servlet>
      <servlet-name>LoginServlet</servlet-name>
      <servlet-class>com.kaitan.servlet.user.LoginServlet</servlet-class>
    </servlet>
    <servlet-mapping>
      <servlet-name>LoginServlet</servlet-name>
      <url-pattern>/login.do</url-pattern>
    </servlet-mapping>
    ```

## 登录优化

### 1-注销功能

- 注销：移除session，返回登录页面

    ```java
    public class LogoutServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getSession().removeAttribute(Constants.USER_SESSION);
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

- 配置web.xml

    ```xml
    <servlet>
      <servlet-name>LogoutServlet</servlet-name>
      <servlet-class>com.kaitan.servlet.user.LogoutServlet</servlet-class>
    </servlet>
    <servlet-mapping>
      <servlet-name>LogoutServlet</servlet-name>
      <url-pattern>/jsp/logout.do</url-pattern>
    </servlet-mapping>
    ```

### 2-登录拦截

- 编辑拦截

    ```java
    public class SysFilter implements Filter {
        public void init(FilterConfig filterConfig) throws ServletException {
        }

        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;

            //从session中获取用户
            User user = (User) request.getSession().getAttribute(Constants.USER_SESSION);
            if (user==null){
                //已经被移除，注销，或者未登录
                response.sendRedirect(request.getContextPath()+"/error.jsp");
            }else {
                filterChain.doFilter(request,response);
            }
        }

        public void destroy() {
        }
    }
    ```

- 注册

    ```xml
    <!--用户登录filter-->
    <filter>
      <filter-name>SysFilter</filter-name>
      <filter-class>com.kaitan.filter.SysFilter</filter-class>
    </filter>
    <filter-mapping>
      <filter-name>SysFilter</filter-name>
      <url-pattern>/jsp/*</url-pattern>
    </filter-mapping>
    ```

## 密码修改

内容

- 再写一个线：Dao-Service-Servlet

### 第一步：导入前端素材

- (这个已经弄好了)在页面header有修改密码按键，点击跳转`/jsp/pwdmodify.jsp`界面

    ```java
    <li><a href="${pageContext.request.contextPath}/user/pwdModify">密码修改</a></li>
    ```

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20157.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20157.png)

- `/jsp/pwdmodify.jsp`界面
    - 这个`for=""`就是点击名字之后可以显示框被选中（光标）

        ```java
        <label for="reNewPassword">确认新密码：</label>
        ```

- 最好直接测试一下页面，看看有没有跳转
- 注意，密码框的一些基本check是靠js实现的，比如这里通过失去焦点（点击之后离开）进行提示

    ```java
    ).on("focus",function(){
    	validateTip(oldpassword.next(),{"color":"#666666"},"* 请输入原密码",false);
    });
    ```

### 项目编写顺序

写项目建议从底层往上写

- Servlet调用Service方法
- Service方法调用Dao方法
- Dao方法操作DB
- 如果从上层往下写，写一半就要开始写下层架构，所以要从上往下写
- 整个架构牵连多个module，要先构思好整体框架之后再开始写，争取一遍过

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20158.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20158.png)

- 比如，对修改密码的构思
    - Dao根据user id, update密码
    - Service调用Dao方法，对比旧密码
    - Servlet从表单拿取userid, pwd,然后调用service 操作
- 一般interface由架构师决定

### 第二步：Dao层

- UserDao接口
    - src/main/java/com/kaitan/dao/user/UserDao.java
    - 添加一个抽象方法

    ```java
    public interface UserDao {
        //得到要登陆的user
        public User getLoginUser(Connection connection, String userCode) throws SQLException;

        //修改当前用户密码
        public int updatePwd(Connection connection, int id, int password) throws SQLException;
    }
    ```

- 然后实现类
    - src/main/java/com/kaitan/dao/user/UserDaoImp1.java
    - 实现接口，增加一个方法

        ```java
        // 修改当前用户密码
        public int updatePwd(Connection connection, int id, int password) throws SQLException {
            PreparedStatement pstm = null;
            int execute=0;
            if (connection !=null){
                String sql = "update smbms_user set userPassword = ? where id = ?";
                Object params[]={password, id};
                execute = BaseDao.execute(connection, sql, params, pstm);
                BaseDao.closeResource(connection,pstm, null);
            }
            return execute;
        }
        ```

### 第三步：Service层

- userService：接收前端东西，然后操作Dao
- 接口：
    - src/main/java/com/kaitan/service/user/UserService.java

    ```java
    public interface UserService {
        //用户登录
        public User login(String userCode, String password);

        //根据user id修改密码
        public int updatePwd(int id, int pwd);
    }
    ```

- 实现接口
    - src/main/java/com/kaitan/service/user/UserServiceImp1.java

    ```java
    public boolean updatePwd(int id, int pwd) {
            Connection connection = null;
            boolean flag=false;
            //修改密码
            try {
                connection = BaseDao.getConnection();
                if (userDao.updatePwd(connection,id,pwd)>0){
                    flag=true;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally{
                try {
                    BaseDao.closeResource(connection,null,null);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return flag;
        }
    ```

### 第四步：Servlet

- com/kaitan/servlet/user/UserServlet.java
    - 从session中拿ID就好

    ```java
    //实现Servlet复用
    public class UserServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //登陆的时候user信息存到session了，从session拿信息
            Object o = req.getSession().getAttribute(Constants.USER_SESSION);
            //确定成功再转user
            String newpassword = req.getParameter("newpassword");
            boolean flag = false;
            if (o!=null && !StringUtils.isNullOrEmpty(newpassword)){
                UserService userService = new UserServiceImp1();

                flag = userService.updatePwd(((User) o).getId(), newpassword);
                if (flag){
                    req.setAttribute("message","修改密码成功，请退出，使用新密码登录");
                    //密码修改成功，移除当前session
                    req.getSession().removeAttribute(Constants.USER_SESSION);
                }else{
                    req.setAttribute("message","修改密码失败");
                }
            }else{
                req.setAttribute("message","新密码有问题");
            }
            /*not working*/
    //        req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
            resp.sendRedirect(req.getContextPath()+"/jsp/pwdmodify.jsp");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    ```

- 配置web.xml

    ```xml
    <servlet>
      <servlet-name>UserServlet</servlet-name>
      <servlet-class>com.kaitan.servlet.user.UserServlet</servlet-class>
    </servlet>
    <servlet-mapping>
      <servlet-name>UserServlet</servlet-name>
      <url-pattern>/jsp/user.do</url-pattern>
    </servlet-mapping>
    ```

- `!StringUtils.isNullOrEmpty(newpassword)`

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20159.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20159.png)

- 如果发现密码更新为空，或者没有更新，debug过程如下
    1. UserServlet中，增加print

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20160.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20160.png)

    2. 在Service中，增加check

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20161.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20161.png)

    3. DAO

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20162.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20162.png)

    4. 查看结果：发现一开始从前端/Servlet就没有参数

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20163.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20163.png)

- 注意
    - Filter层只过滤`/jsp/*` 所以即使是转接的比如`user.do` 也要放到`/jsp/user.do` 中

### 第五步：Servlet代码优化

- 这段修改密码可以提成方法
    - 判断前端传来调用的方法method参数，这里是savepwd，根据这个来调取响应的方法

    ```java
    package com.kaitan.servlet.user;

    import com.kaitan.pojo.User;
    import com.kaitan.service.user.UserService;
    import com.kaitan.service.user.UserServiceImp1;
    import com.kaitan.util.Constants;
    import com.mysql.jdbc.StringUtils;

    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;

    //实现Servlet复用
    public class UserServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String method = req.getParameter("method");
            /*method!=null&&method.equals("savepwd"*/
            if ("savepwd".equals(method)){
                this.updatePwd(req,resp);
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }

        public void updatePwd(HttpServletRequest req, HttpServletResponse resp){
            //登陆的时候user信息存到session了，从session拿信息
            Object o = req.getSession().getAttribute(Constants.USER_SESSION);
            //确定成功再转user
            String newpassword = req.getParameter("newpassword");
            boolean flag = false;
            if (o!=null && !StringUtils.isNullOrEmpty(newpassword)){
                UserService userService = new UserServiceImp1();

                flag = userService.updatePwd(((User) o).getId(), newpassword);
                if (flag){
                    req.setAttribute("message","修改密码成功，请退出，使用新密码登录");
                    //密码修改成功，移除当前session
                    req.getSession().removeAttribute(Constants.USER_SESSION);
                }else{
                    req.setAttribute("message","修改密码失败");
                }
            }else{
                req.setAttribute("message","新密码有问题");
            }
            /*not working*/
    //        req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
            try {
                resp.sendRedirect(req.getContextPath()+"/jsp/pwdmodify.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    ```

## Ajax验证旧密码

### 目标

- 填旧密码的时候就验证密码是否正确，而不是等到点击button的时候三个一起验证

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20164.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20164.png)

### Ajax方法

- $代表jquery
- ajax是方法，是get, post的统称，后面可以指定方法
- 提交到/jsp/user.do,代码复用
- data就是ajax传的参数

    ```java
    data: method:"pwdmodify",oldpassword:oldpassword.val()},
    ```

- `dataType:"json"` 现在主流的开发都是用Json实现前后端交互

    ```java
    oldpassword.on("blur",function(){
    		$.ajax({
    			type:"GET",
    			url:"isuser",
    			data:{method:"pwdmodify",oldpassword:oldpassword.val()},
    			dataType:"json",
    			success:function(data){
    				if(data.result == "true"){//旧密码正确
    					validateTip(oldpassword.next(),{"color":"green"},imgYes,true);
    				}else if(data.result == "false"){//旧密码输入不正确
    					validateTip(oldpassword.next(),{"color":"red"},imgNo + "The original password is wrong",false);
    				}else if(data.result == "sessionerror"){//当前用户session过期，请重新登录
    					validateTip(oldpassword.next(),{"color":"red"},imgNo + "Session out, please log in",false);
    				}else if(data.result == "error"){//旧密码输入为空
    					validateTip(oldpassword.next(),{"color":"red"},imgNo + " Please enter old password",false);
    				}
    			},
    			error:function(data){
    				//请求出错
    				validateTip(oldpassword.next(),{"color":"red"},imgNo + " request error",false);
    			}
    		});
    ```

- 根据成功和失败，不同的返回

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20165.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20165.png)

### 加载包

- 第一种方法：jastjson包

    ```xml
    <!-- https://mvnrepository.com/artifact/com.alibaba/fastjson -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>fastjson</artifactId>
        <version>1.2.75</version>
    </dependency>
    ```

### 在web.xml配置session过期时间

```xml
<!--默认Session过期时间-真实业务需求-->
<session-config>
  <session-timeout>30</session-timeout>
</session-config>
```

### ContextType

- ContextType就是限定了格式
- text，对应html, javascript等
- application，对应json等

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20166.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20166.png)

### UserServlet

- 在UserServlet中添加方法

    ```java
    //验证旧密码,直接跟session对比就好
    public void checkPwd(HttpServletRequest req, HttpServletResponse resp){
        //登陆的时候user信息存到session了，从session拿信息
        Object o = req.getSession().getAttribute(Constants.USER_SESSION);
        //确定成功再转user
        String oldpassword = req.getParameter("oldpassword");
        //大公司基本都用Map代表结果集
        Map<String, String> resultMap = new HashMap<String, String>();

        if (o==null){
            //session失效，过期
            resultMap.put("result","sessionerror");
        }else if (StringUtils.isNullOrEmpty(oldpassword)){//输入密码为空
            resultMap.put("result","error");
        }else{
            String userPassword=((User) o).getUserPassword();//Session中用户的密码
            if (oldpassword.equals(userPassword)){
                resultMap.put("result","true");
            }else{
                resultMap.put("result","false");
            }
        }

        try {
            resp.setContentType("application/json");
            PrintWriter writer = resp.getWriter();
            //阿里巴巴JSON工具类,用于转换格式
            //现在是map格式，想要转成json,传递给前端
            writer.write(JSONArray.toJSONString(resultMap));
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    ```

    ```java
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        /*method!=null&&method.equals("savepwd"*/
        if ("savepwd".equals(method)){
            this.updatePwd(req,resp);
        }else if ("pwdmodify".equals(method)){
            this.checkPwd(req,resp);
        }
    }
    ```

### 理解Ajax

- 页面在没有刷新的情况下实现交互：ajax
- 在Ajax中，前台通过检测鼠标失去focus，带着params触发/jsp/user.do的相应method，然后user.do触发对应的userServlet方法，执行之后，根据运行情况将结果存到一个Json string中返回前端，Ajax上也规定好成功的时候（带有返回的json的具体值），失败的时候（没有返回的json），分别触发的效果，从而实现实时交互
- 网页上可以查看request

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20167.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20167.png)

### 遗留问题

- 我有一个bug没有弄出来
- `src/main/webapp/js/pwdmodify.js` 中的这段代码没有执行，而是直接提交，我才是button直接点击提交，但是之前能成功，实在不知道是为什么

    ```java
    saveBtn.on("click",function(){
    		oldpassword.blur();
    		newpassword.blur();
    		rnewpassword.blur();
    		/*newpassword.attr("validateStatus") == true*/
    		if("true"==oldpassword.attr("validateStatus") &&
    			"true"==newpassword.attr("validateStatus") &&
    			"true"==rnewpassword.attr("validateStatus")){
    			if(confirm("Confirm to modify pwd?")){
    				$("#userForm").submit();
    			}
    		}
    	});
    ```

## 用户管理实现

### 思路

- 这里不直接调取前端，而是进行request，调用业务之后，在返回界面，呈现user列表

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20168.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20168.png)

    - 查询用户列表
    - （下拉框）查询角色列表
    - 按分页显示，要查询DB总行数，并确定一页可显示record数量
- 注意，虽然这里是在一个DB中查询，但是真实情况下，可能是多个DB的，或者从多台服务器中不同的DB中查询

### 第一步：导入分类的工具类

- OOP三大特性：封装，继承，多态
- 封装就是属性私有,get/set, 在set中限定不安全的输入情况
- 这里就是进行了封装

    ```java
    package com.kaitan.util;
    import java.util.List;

    public class PageSupport {
        //当前页码-来自于用户输入
        private int currentPageNo = 1;

        //总数量（表）
        private int totalCount = 0;

        //页面容量
        private int pageSize = 0;

        //总页数-totalCount/pageSize（+1）
        private int totalPageCount = 1;

        public int getCurrentPageNo() {
            return currentPageNo;
        }

        public void setCurrentPageNo(int currentPageNo) {
            if(currentPageNo > 0){
                this.currentPageNo = currentPageNo;
            }
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            if(totalCount > 0){
                this.totalCount = totalCount;
                //设置总页数
                this.setTotalPageCountByRs();
            }
        }
        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            if(pageSize > 0){
                this.pageSize = pageSize;
            }
        }

        public int getTotalPageCount() {
            return totalPageCount;
        }

        public void setTotalPageCount(int totalPageCount) {
            this.totalPageCount = totalPageCount;
        }

        public void setTotalPageCountByRs(){
            if(this.totalCount % this.pageSize == 0){
                this.totalPageCount = this.totalCount / this.pageSize;
            }else if(this.totalCount % this.pageSize > 0){
                this.totalPageCount = this.totalCount / this.pageSize + 1;
            }else{
                this.totalPageCount = 0;
            }
        }
        private List list;

        public List getList() {
            return list;
        }

        public void setList(List list) {
            this.list = list;
        }
    }
    ```

### 第二步：用户列表页面导入

- 主要的userlist.jsp其实涉及到两个部分
    1. form表单，客户提交之后可以看到对应的显示结果
    2. rollpage界面：分页的部分，这是一个单独页面，通过import导入，带参数（包括上一页，下一页，当前分页）

### 第三步：获取用户数量

1. UserDao层
    - 在dao.user.UserDao中添加interface（可以返回指定username或者userRole的 行数）

        ```java
        public interface UserDao {
            //得到要登陆的user
            public User getLoginUser(Connection connection, String userCode) throws SQLException;

            //修改当前用户密码
            public int updatePwd(Connection connection, int id, String password) throws SQLException;

            //查询用户总数
            public int getUserCount(Connection connection, String username, String userRole ) throws SQLException;
        }
        ```

    - 注意，count(1)比count(*)快很多，因为只走key
2. UserDaoImp1
    - 想实现的效果：无论是什么都不输，还是只输入username，或者只输入userRole，还是两者都输入，都可以运行sql，这里用到了拼接方法

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20169.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20169.png)

    - 在dao.user.UserDaoImp1中添加这个方法（这个超难理解）
        - 重点理解这个拼接
        - 写一个查询全部user的基础SQL
        - 分别判断是否有userName, userRole参数传进来，如果有，控制where语句在原有SQL上进行拼接，并且在list上添加该参数名称
        - 如果实则没有参数，则不拼接任何语句，实现原始SQL，搜出全部list
        - 注意拼接行的空格

        ```java
        //返回指定username或者userRole的 行数
        public int getUserCount(Connection connection, String username, int userRole) throws SQLException {
            PreparedStatement pstm = null;
            ResultSet rs= null;
            int count = 0;

            if (connection != null) {
                //存放参数
                ArrayList<Object> list = new ArrayList<Object>();

                StringBuffer sql = new StringBuffer();
                sql.append("select count(1) as count from smbms_user u, smbms_role r where u.userRole = r.id");
                if (!StringUtils.isNullOrEmpty(username)){
                    sql.append(" and u.userName like ?");
                    list.add("%"+username+"%"); // index 0
                }
                if(userRole>0){
                    sql.append(" and u.userRole = ?");
                    list.add(userRole);// index 1
                }

                //list转换为数组
                Object[] params = list.toArray();

                System.out.println("UserDaoImp1 -？ getUserCount"+sql.toString());
                rs = BaseDao.execute(connection, sql.toString(), params, rs, pstm);
                if (rs.next()){
                    count = rs.getInt("count");
                }
                BaseDao.closeResource(null,pstm,rs);
            }
            return count;
        }
        ```

3. UserSerivce
    - 在pojo.User.UserService中添加interface

        ```java
        public interface UserService {
            //用户登录
            public User login(String userCode, String password);

            //根据user id修改密码
            public boolean updatePwd(int id, String pwd);

            //查询record数
            public int getUserCount(String username, int userRole);
        }
        ```

4. UserServiceImp1
    - 在pojo.User.UserServiceImp1中添加实现类方法

        ```java
        public int getUserCount(String username, int userRole) {
            Connection connection = null;
            int count = 0;
            try {
                connection = BaseDao.getConnection();
                count = userDao.getUserCount(connection, username, userRole);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    BaseDao.closeResource(connection, null,null);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return count;
        }

        @Test
        public void test1(){
            UserServiceImp1 userService = new UserServiceImp1();
            int userCount = userService.getUserCount("sunlei",1);
            System.out.println(userCount);
        }

        ```

### 第三步：获取user list

1. 编写UserDao interface
    - 编辑interface

        ```java
        //通过条件查询userList
        public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize) throws Exception;
        ```

2. 编写UserDao实现类-方法
    - limit控制分页
        - limit(0,5): p0,1,2,3,4
        - limit(5,5): p5, 6,7,8,9
        - limit(5,5): p10, 11,12,13,14
    - 将信息存入User对象的attribute，然后返回User list

    ```java
    public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize) throws Exception {

        PreparedStatement pstm= null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<User>();
        if (connection != null){
            StringBuffer sql = new StringBuffer();
            sql.append("select u.*, r.roleName as userRoleName from smbms_user u, smbms_role r where u.userRole = r.id");
            List<Object> list = new ArrayList<Object>();
            if (!StringUtils.isNullOrEmpty(userName)){
                sql.append(" and u.userName like ?");
                list.add("%"+userName+"%");
            }
            if (userRole>0){
                sql.append(" and u.userRole = ?");
                list.add(userRole);
            }
            sql.append("order by creationDate DESC limit ?,?");
            currentPageNo= (currentPageNo-1)*pageSize;
            list.add(currentPageNo);
            list.add(pageSize);

            Object[] params = list.toArray();
            System.out.println("sql---->"+sql.toString());
            rs = BaseDao.execute(connection, sql.toString(), params,rs,pstm );
            while(rs.next()){
                User _user = new User();
                _user.setId(rs.getInt("id"));
                _user.setUserCode(rs.getString("userCode"));
                _user.setUserName(rs.getString("userName"));
                _user.setGender(rs.getInt("gender"));
                _user.setBirthday(rs.getDate("birthday"));
                _user.setPhone(rs.getString("phone"));
                _user.setUserRole(rs.getInt("userRole"));
                _user.setUserRoleName(rs.getString("userRoleName"));
                userList.add(_user);
            }
            BaseDao.closeResource(null,pstm,rs);
        }

        return userList;
    }
    ```

3. 编写UserService interface

    ```java
    //根据条件查询user list
    public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize);
    ```

4. 编写UserService 实现类-方法

    ```java
    public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize) {
        Connection connection = null;
        List<User> userList= null;
        System.out.println("queryUserName --- "+queryUserName);
        System.out.println("queryUserRole --- "+queryUserRole);
        System.out.println("currentPageNo --- "+currentPageNo);
        System.out.println("pageSize --- "+pageSize);

        try {
            connection =BaseDao.getConnection();
            userList = userDao.getUserList(connection, queryUserName,queryUserRole,currentPageNo,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                BaseDao.closeResource(connection,null,null)
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return userList;
    }
    ```

### 第四步：获取role list

注意，這裏操作的是Role，新教一個role文件夾，這些dir跟pojo中的類對應

1. 编写dao.role.RoleDao interface

    ```java
    //獲取role list
    public List<Role> getRoleList(Connection connection) throws SQLException;
    ```

2. 编写RoleDao 实现类-方法 dao.role.RoleDaoImp1

    ```java
    public List<Role> getRoleList(Connection connection) throws SQLException {
        PreparedStatement pstm =null;
        ResultSet rs = null;
        ArrayList<Role> roleList= new ArrayList<Role>();
        if (connection!=null){
            String sql = "select * from smbms_role";
            Object[] params={};
            BaseDao.execute(connection,sql,params,rs, pstm);

            while (rs.next()){
                Role _role = new Role();
                _role.setId(rs.getInt("id"));
                _role.setRoleCode(rs.getString("roleCode"));
                _role.setRoleName(rs.getString("roleName"));
                roleList.add(_role);
            }
            BaseDao.closeResource(null,pstm,rs);
        }
        return roleList;
    }
    ```

3. 编写service.role.RoleService interface

    ```java
    public interface RoleService {
        //根据条件查询user list
        public List<Role> getRoleList();
    }
    ```

4. 编写service.role.RoleServiceImp1实现类-方法

    ```java
    public class RoleServiceImp1 implements RoleService {
        //引入Dao
        private RoleDao roleDao;
        public RoleServiceImp1(){
            roleDao = new RoleDaoImp1();
        }

        public List<Role> getRoleList() {
            Connection connection = null;
            List<Role> roleList =null;
            try {
                connection = BaseDao.getConnection();
                roleList = roleDao.getRoleList(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    BaseDao.closeResource(connection,null,null);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return roleList;
        }
    }
    ```

### 第五步：写Servlet

1. 获取用户前端的数据（客户通过表单提交的，第一次加载时有默认值）
2. 判断request是否需要执行（看这些param）
3. 为了实现分页，计算当前页面，总页数，和页面大小
4. 控制首页，尾页，页num范围
5. 用户列表展示（SQL执行）
6. 返回前端

    ```java
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        /*method!=null&&method.equals("savepwd"*/
        if ("savepwd".equals(method)){
            this.updatePwd(req,resp);
        }else if ("pwdmodify".equals(method)){
            this.checkPwd(req,resp);
        }else if ("query".equals(method)){
            this.query(req,resp);
        }
    }
    //重難點！
    private void query(HttpServletRequest req, HttpServletResponse resp) {
        //用戶點擊form的時候，

        //查詢用戶列表
        String queryUserName = req.getParameter("queryName");
        String queryUserRoleTemp = req.getParameter("queryUserRole");
        String pageIndex = req.getParameter("pageIndex");

        //獲取用戶list, role list
        UserServiceImp1 userService = new UserServiceImp1();
        RoleServiceImp1 roleService = new RoleServiceImp1();

        //第一次走這個請求，一定是第一頁，而且頁面大小固定
        int pageSize =5;//可以把這個寫道配置文件中，方便後期修改
        int currentPageNo=1;
        int queryUserRole=0;

        List<User> userList = null;
        List<Role> roleList = null;

        if (queryUserName==null){
            queryUserName="";
        }
        if (queryUserRoleTemp!=null && !queryUserRoleTemp.equals("")){
            queryUserRole=Integer.parseInt(queryUserRoleTemp);
        }
        if (pageIndex!=null){
            currentPageNo = Integer.parseInt(pageIndex);
        }

        //獲取user總數 (分頁，還有上一頁，下一頁)
        int totalCount = userService.getUserCount(queryUserName, queryUserRole);
        PageSupport pageSupport = new PageSupport();
        pageSupport.setPageSize(pageSize);
        pageSupport.setTotalCount(totalCount);
        pageSupport.setCurrentPageNo(currentPageNo);

        int totalPageCount = pageSupport.getTotalPageCount();
        //控制首頁尾頁
        //如果頁面要小於1，就直接顯示page 1
        if (totalPageCount<1){
            currentPageNo=1;
        }else if(currentPageNo>totalPageCount){
            currentPageNo=totalPageCount;
        }

        //獲取用戶list展示
        userList = userService.getUserList(queryUserName,queryUserRole,currentPageNo,pageSize);
        req.setAttribute("userList",userList);

        //獲取role list
        roleList= roleService.getRoleList();
        req.setAttribute("roleList",roleList);
        req.setAttribute("totalCount",totalCount);
        req.setAttribute("currentPageNo",currentPageNo);
        req.setAttribute("totalPageCount",totalPageCount);
        req.setAttribute("queryUserName",queryUserName);
        req.setAttribute("queryUserRole",queryUserRole);
        System.out.println(queryUserRole);
        //返回前端
        try {
            req.getRequestDispatcher("userlist.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    ```

- 未解决的问题
    - 选择完role，出结果之后，role还应该是选中状态，但是我这里就是unselected了
    - kuangshen的正式版代码我没有下载到，这个去github应该能找到

## 其他

### 小黄鸭调试法

- 向桌面上的玩具鸭子讲解

### 架构

- 前面还有filter
- 前端过来：前端form，或者是ajax，href请求

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20170.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20170.png)

- 注意增删改需要transaction

### 使用编译好的项目

- 下载编译好的项目，解压
- 可以复制一份tomcat，然后更改tomcat, conf, server.xml中的端口号
- 将这个解压好的文件放到webapp里
    - 所有的资源都在web-inf下面，有第三方jar包，还有生成的class类
    - 注意修改db.properties密码
- 启动tomcat，根据webapp中的dir进入页面

### 项目发布

- 其实写好的项目编译后的形式从target（out）中就可以看了

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20171.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20171.png)

- 就是这个Test_war_exploded
- 重点看WEB-INF中的内容，其中classes里面都是java编译后的class代码
    - 这个可以通过idea反编译到java文件
    - 也可以通过一些class反编译工具（直接google）

### 通过idea进行项目反编译（class→java文件）

- 比如，将 `tomcat/webapps/SMBMS/WEB-INF/classes/cn/smbms` copy到新创立的`src/test`dir中
- 其实class和java文件可能很有区别

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20172.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20172.png)

### 后续

- 一定要下载，研读

    **《阿里巴巴Java开发手册（正式版）》**

- [ ]  [P30javaweb-30：smbms项目搭建39:08](https://www.bilibili.com/video/BV12J411M7Sj?p=30)
- [ ]  [P31javaweb-31：smbms登录流程实现38:25](https://www.bilibili.com/video/BV12J411M7Sj?p=31)
- [ ]  [P32javaweb-32：smbms注销及权限过滤15:43](https://www.bilibili.com/video/BV12J411M7Sj?p=32)
- [ ]  [P33javaweb-33：smbms密码修改实现58:55](https://www.bilibili.com/video/BV12J411M7Sj?p=33)

- [ ]  [P34javaweb-34：Ajax验证旧密码实现29:05](https://www.bilibili.com/video/BV12J411M7Sj?p=34)
- [ ]  [P35javaweb-35：smbms用户管理底层实现51:24](https://www.bilibili.com/video/BV12J411M7Sj?p=35)
- [ ]  [P36javaweb-36：smbms用户管理分页OK58:41](https://www.bilibili.com/video/BV12J411M7Sj?p=36)
- [ ]  [P37javaweb-37：smbms架构分析及方法学习37:20](https://www.bilibili.com/video/BV12J411M7Sj?p=37)

## 文件上传

### 创建项目

1. 建立空project

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20173.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20173.png)

2. 选定jdk，level

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20174.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20174.png)

3. new 一个 module

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20175.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20175.png)

4. 可以选择Java EE， Maven-web app，或者纯Maven

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20176.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20176.png)

5. update web.xml
6. 配置tomcat run configuration
7. 运行一次，看看是否成功

### 概念理解

- server虽然有web app,还有file system(web app本质就是一些文件呀)
- 比如要下载这个图片的时候，URL前面是ip地址（域名解析），后面是file system路径, URL指向互联网上的一个具体为止
    - ping可以看到具体的ip地址

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20177.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20177.png)

- IO流
    - 两个池子，互相传东西需要一个pipe
    - 本地的话，直接从一个文件夹到另一个文件夹
    - 远程的话，在网络上建立IO流（通过协议），在协议之下，需要创建标准的request headers, response headers
- 下载的时候，需要让浏览器支持下载的东西 （设置好 reponse headers）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20178.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20178.png)

- 上传的时候，让浏览器支持文件上传(intput file-一个表单上传)，通过网络上传到web app，保存到server的file system中
- 下载的时候，从file system找到文件，通过网络下载，点开response，是流-类似乱码（通过编码解码呈现真正的图片）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20179.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20179.png)

### 上传工具

- 上传的时候以流的形式提交server，这部分要完全掌握需要把http全学一遍，实操的时候用一些开源工具（如common-fileupload文件上传组件）就可以了
    - common-fileupload依赖于common-io这个包
- commons-io 2.6

    (如果不是maven项目，可以下载下来包，其实就是压缩包，里面有编译后的class文件)

    ```xml
    <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.6</version>
    </dependency>
    ```

- commons-fileupload 1.4

    ```xml
    <!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
    <dependency>
        <groupId>commons-fileupload</groupId>
        <artifactId>commons-fileupload</artifactId>
        <version>1.4</version>
    </dependency>
    ```

    ```xml
    <!--            Servlet依赖-->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
    </dependency>
    ```

- 如果不是用maven
    - 在项目中创建一个lib文件夹，设置为add as lib，放在WEB-INF也行
    - 也可以直接打开project structure, 选中library，从folder中导入
        - artifact是打包的内容，需要选定，在artifact中添加lib才能work

            ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20180.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20180.png)

### 文件上传注意事项

1. 为保证server安全，上传的文件应该放在外界无法访问的目录下，比如WEB-INF中
2. 为防止overwrite情况发生，上传的文件名要unique
    - 一种方式是在文件名后面增加timestamp，但是这个也不安全，还是可能同时有两个文件一样
    - uuid
    - md5
    - 位运算算法
3. 要限制文件上传的最大值（大小）
4. 可以限制文件上传的类型，在收到上传文件名时，要检查后缀是否valid
    - 比如在上传图片时，就不能接受txt或者mp4
    - 比如kuangshen自己网站的后台

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20181.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20181.png)

### 所用类的解释

- `ServletFileUpload` 类负责上传文件数据，并将表单form中的每个input项封装成一个`FileItem`对象
- 在使用`ServletFileUpload`对象解析request时需要`DiskFileItemFactory`对象
- 所以，我们需要在进行解析工作前构造好`DiskFileItemFactory`对象，通过`ServletFileUpload`对象的构造方法或者`setFileItemFactory()`方法设置ServletFileUpload对象的`fileItemFactory`属性
- 这个对应factory模式，偷懒不用new对象，而是让工厂生产
    - 去看`23种设计模式-工厂模式研究`

### FileItem

- html页面中必须有`<input type="file" name="filename">`
- format不好看，可以去layui找
- method 要选择post:
    - get 文件大小有限制（4kb?）
    - post 文件大小没有限制
- `<input type="reset">` 重置form
- form如果包含一个文件上传item的话，这个form的 `enctype` 必须设定为`enctype="multipart/form-data"`

### ServletFileUpload类

- `ServletFileUpload`负责处理上传的文件数据，并将form中每个输入项封装成一个`FileItem`对象
- 使用其`parseRequest(HttpServletRequest)`方法 将表单中的每一个html标签提交的data封装成一个FileItem对象，以List形式返回
- 使用这个方法可以简单地上传文件
- 如果不用这个，要自己写stream，自己建立输入端，输出端，然后通过网络传到另一台电脑
    - 交换机-公司交换机-外部。。。

### 项目构建

- 普通项目的话，可以直接new一个servlet文件
- 注意结构

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20182.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20182.png)

- 如果servlet-mapping识别报错，应该是servlet导包问题
    - 导错包，改完之后可以clear一下

    ```xml
    <!--            Servlet依赖-->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
    </dependency>
    ```

### servlet书写思路

- `public class FileServlet extends HttpServlet`
- 基础理解
    - 用流(request.getInputStream)来获取原生态文件比较麻烦，建议使用Apache文件上传组件common-fileupload，这个依赖于commons-io
    - 传输流，其实就是有一个input 口(上传文件-request)，一个output口（destination file），中间用个buffer管道（有大小）接上，input口输向buffer，在buffer有内容的时候，从buffer导进output口（写入destination file），实现上传
- 判断form是否有file如果有，创建一个文件保存地址，如果文件过大，创建临时保存地址

    ```java
    //判断上传的form 是否带有file的form（如果有file，需要传输）
    //可以简单看一下源码
    if (ServletFileUpload.isMultipartContent(req)){
        return;//终止方法运行
    }
    //如果form有file，创建file的保存路径，建议保存在WEB-INF路径下，user无法直接访问
    String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
    File uploadFile = new File(uploadPath);
    //如果文件不存在,创建这个目录（上传之后才有文件）
    if (!uploadFile.exists()){
        uploadFile.mkdir();
    }
    //临时文件缓存
    //加入文件大小超过了预期，把它放到一个临时文件中，过几天自动删除，或者提醒用户转存为永久
    String tmpPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
    File tmpFile = new File(tmpPath);
    if (!tmpFile.exists()){
        tmpFile.mkdir();
    }
    ```

- 处理上传内容：创建一个factory对象（可以设置大小），然后根据这个factory，创建一个upload对象，upload对象可以处理request `upload.parseRequest(req);` ，将request的每一个输入部分分解成FileItem，这样就可以loop through files进行上传
    1. 第一步：创建DisFileItemFactory对象，处理文件上传路径或者大小的限制

        ```java
        //1. 创建DisFileItemFactory对象，处理文件上传路径或者大小的限制
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //通过factory设置一个buffer，当文件大于这个buffer时，转移到临时文件//(optional)
        factory.setSizeThreshold(1024*1024);//1M, 默认10240//(optional)
        factory.setRepository(tmpFile);//临时保存目录，需要一个tmpFile
        ```

    2. 第二步：获取ServletFileUpload

        ```java
        //2. 获取ServletFileUpload
        ServletFileUpload upload = new ServletFileUpload(factory);

        //监听文件上传进度 （进度条）//(optional)
        upload.setProgressListener(new ProgressListener() {
            @Override
            public void update(long l, long l1, int i) {
                System.out.println("total size:"+l1+" 已上传"+l);
            }
        });
        //处理乱码问题//(optional)
        upload.setHeaderEncoding("UTF-8");//(optional)
        upload.setFileSizeMax(1024*1024*10);//单个文件最大值//(optional)
        upload.setSizeMax(1024*1024*10);//10M,总体文件最大值//(optional)
        ```

    3. 第三步：处理上传文件

        ```java
        //3.处理上传文件
        //把前端request解析，封装成一个FileItem对象,需要从ServletFileUpload
        try {
            List<FileItem> fileItems = upload.parseRequest(req);
            for(FileItem fileItem: fileItems){
                //查看每一个item 有没有file
                if (fileItem.isFormField()){
                    //getFieldName指 前端form的name
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString("UTF-8");
                    System.out.println(name+':'+value);
                }else{
                    //文件
                    //3.1 处理文件
                    //拿到文件上传的名字
                    String uploadFileName = fileItem.getName();
                    //名字不valid,直接跳下一个
                    if (uploadFileName.trim().equals("")||uploadFileName==null){
                        continue;
                    }
                    //获得文件名（optional）
                    String fileName=uploadFileName.substring(uploadFileName.lastIndexOf("/")+1);
                    //获得文件名后缀
                    String fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".")+1);

                    //UUID能够保证文件名unique
                    String uuidPath = UUID.randomUUID().toString();//生成不重复的数字串

                    //3.2 存放地址
                    //创建文件所存路径
                    String realPath = uploadPath+"/"+uuidPath;
                    //给每个文件创建一个对应的文件夹
                    File realPathFile = new File(realPath);
                    if (!realPathFile.exists()){
                        realPathFile.mkdir();
                    }

                    //3.3 文件传输
                    //获得文件上传的stream
                    InputStream inputStream = fileItem.getInputStream();

                    //船舰文件输出流
                    FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);

                    //创建一个缓冲区
                    byte[] buffer = new byte[1024*1024];

                    //判断是否读取完毕
                    int len=0;
                    //如果大于0说明还存在数据
                    while ((len=inputStream.read(buffer))>0){
                        fos.write(buffer,0,len);
                    }

                    //close stream
                    fos.close();
                    inputStream.close();

                    msg="文件上传成功！";
                    fileItem.delete();

                }

            }
        ```

    [完整版留存](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/%E5%AE%8C%E6%95%B4%E7%89%88%E7%95%99%E5%AD%98%2094c8946db79c4124a500b38502063b4b.md)

### 最终版文件上传代码

- 概流程写好之后，将这些步骤封装为方法，将code进行整理，简化

    ```java
    package com.kaitan.servlet;

    import org.apache.commons.fileupload.FileItem;
    import org.apache.commons.fileupload.FileItemFactory;
    import org.apache.commons.fileupload.FileUploadException;
    import org.apache.commons.fileupload.ProgressListener;
    import org.apache.commons.fileupload.disk.DiskFileItemFactory;
    import org.apache.commons.fileupload.servlet.ServletFileUpload;

    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.*;
    import java.util.List;
    import java.util.UUID;

    public class FileServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //判断上传的form 是否带有file的form（如果有file，需要传输）
            //可以简单看一下源码
            if (!ServletFileUpload.isMultipartContent(req)){
                return;//终止方法运行
            }
            //如果form有file，创建file的保存路径，建议保存在WEB-INF路径下，user无法直接访问
            String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
            File uploadFile = new File(uploadPath);
            //如果文件不存在,创建这个目录（上传之后才有文件）
            if (!uploadFile.exists()){
                uploadFile.mkdir();
            }
            //临时文件缓存
            //加入文件大小超过了预期，把它放到一个临时文件中，过几天自动删除，或者提醒用户转存为永久
            String tmpPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
            File tmpFile = new File(tmpPath);
            if (!tmpFile.exists()){
                tmpFile.mkdir();
            }

            //用流(request.getInputStream)来获取原生态文件比较麻烦
            // 建议使用Apache文件上传组件common-fileupload，这个依赖于commons-io

            try {
                //1.创建DiskFileItemFactory对象,处理文件上传路径或者大小限制
                DiskFileItemFactory factory = getDiskFileItemFactory(tmpFile);
                //2.获取ServletFileUpload
                ServletFileUpload upload = getServletFileUpload(factory);
                //3.处理上传的文件

                String msg = uploadParseRequest(upload, req, uploadPath);
                //servlet请求转发消息
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("info.jsp").forward(req, resp);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        }

        public static DiskFileItemFactory getDiskFileItemFactory(File file){
            //1. 创建DisFileItemFactory对象，处理文件上传路径或者大小的限制
            DiskFileItemFactory factory = new DiskFileItemFactory();
    //通过factory设置一个buffer，当文件大于这个buffer时，转移到临时文件//(optional)
            factory.setSizeThreshold(1024*1024);//1M, 默认10240//(optional)
            factory.setRepository(file);//临时保存目录，需要一个tmpFile
            return factory;
        }

        public static ServletFileUpload getServletFileUpload(DiskFileItemFactory factory){
            //2. 获取ServletFileUpload
            ServletFileUpload upload = new ServletFileUpload(factory);

            //监听文件上传进度 （进度条）//(optional)
            upload.setProgressListener(new ProgressListener() {
                @Override
                public void update(long l, long l1, int i) {
                    System.out.println("total size:"+l1+" 已上传"+l);
                }
            });
            //处理乱码问题//(optional)
            upload.setHeaderEncoding("UTF-8");//(optional)
            upload.setFileSizeMax(1024*1024*10);//单个文件最大值//(optional)
            upload.setSizeMax(1024*1024*10);//10M,总体文件最大值//(optional)
            return upload;
        }

        public String uploadParseRequest(ServletFileUpload upload, HttpServletRequest req, String uploadPath) throws FileUploadException, IOException {
            String msg = "";

            List<FileItem> fileItems = upload.parseRequest(req);
            for(FileItem fileItem: fileItems) {
                //查看每一个item 有没有file
                if (fileItem.isFormField()) {
                    //getFieldName指 前端form的name
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString("UTF-8");
                    System.out.println(name + ':' + value);
                } else {
                    //文件
                    //3.1 处理文件
                    //拿到文件上传的名字
                    String uploadFileName = fileItem.getName();
                    System.out.println("上传的文件名:"+uploadFileName);

                    //名字不valid,直接跳下一个
                    if (uploadFileName.trim().equals("") || uploadFileName == null) {
                        continue;
                    }
                    //获得文件名（optional）
                    String fileName = uploadFileName.substring(uploadFileName.lastIndexOf("/") + 1);
                    //获得文件名后缀
                    String fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);

                    //UUID能够保证文件名unique
                    String uuidPath = UUID.randomUUID().toString();//生成不重复的数字串

                    //3.2 存放地址
                    //创建文件所存路径
                    String realPath = uploadPath + "/" + uuidPath;
                    //给每个文件创建一个对应的文件夹
                    File realPathFile = new File(realPath);
                    if (!realPathFile.exists()) {
                        realPathFile.mkdir();
                    }

                    //3.3 文件传输
                    //获得文件上传的stream
                    InputStream inputStream = fileItem.getInputStream();

                    //船舰文件输出流
                    FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);

                    //创建一个缓冲区
                    byte[] buffer = new byte[1024 * 1024];

                    //判断是否读取完毕
                    int len = 0;
                    //如果大于0说明还存在数据
                    while ((len = inputStream.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }

                    //close stream
                    fos.close();
                    inputStream.close();

                    msg = "文件上传成功！";
                    fileItem.delete();

                }
            }
            return msg;
        }
    }
    ```

### UUID，标记型接口，JVM的native

- 使用UUID能够保证文件名unique
- UUID是jdk原生的方法
- 序列化：网络传输中的东西，都需要序列化
- pojo实体类目前只能在local用，如果在多个电脑上运行，需要传输（需要把object都序列化），所以再写pojo，先实现implements Serializable这个标记接口，
- 特殊interface
    - 只有一个方法的接口：函数式接口
    - 没有方法的接口：标记接口（Serializable）
- 标记接口：JVM运行的时候去识别，如果有标记接口，可以执行一些具体的事项。JVM有一个本地方法栈 native，native可以调用c++（java虚拟机底层是c++写的）

### JDK与C++

- jdk中的这些.h其实是c++里面的头文件（？）
    - `jawt.h`就是管图形化界面的
    - `jni.h` java native interface，

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20183.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20183.png)

- java文件无法直接操作计算机
    - java不操作计算机，而是操作JVM，java跟操作系统不直接打交道
    - JVM帮助实现跨平台
    - java有一个本地方法栈（交给c++/操作系统去完成），java栈（平时写的东西在java栈里面）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20184.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20184.png)

- 例子：thread.start()
    - 下面是thread中start()的源码，发现核心的代码是`start()`
    - 但是`start()` 在Thread这个class中定义得比较奇怪（属于接口的写法）

        ```java
        private native void start0();
        ```

    - 其中的native代表了本地，java此时就不管了，交给了操作系统去做，c++(本地接口)可以识别start0，去开辟线程，java无法干预控制，职能分配Priority（其实是通过增加对象数来进行干预，比如给操作系统1000个这个对象，被选中的概率就高了）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20185.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20185.png)

### 测试代码

- 文件被上传在了tomcat中对应的webapps中

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20186.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20186.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20187.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20187.png)

### 下载代码

- ref：[https://github.com/LuShan123888/Notes/blob/f3ce23491d6170ced42df22dcd2d7b4d28483677/Software/Backend/Java/JavaEE/实例/文件上传与下载.md](https://github.com/LuShan123888/Notes/blob/f3ce23491d6170ced42df22dcd2d7b4d28483677/Software/Backend/Java/JavaEE/%E5%AE%9E%E4%BE%8B/%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0%E4%B8%8E%E4%B8%8B%E8%BD%BD.md)
- code

    ```java
    @RequestMapping(value="/download")
    public String downloads(HttpServletResponse response ,HttpServletRequest request) throws Exception{
       //要下载的图片地址
       String  path = request.getServletContext().getRealPath("/upload");
       String  fileName = "基础语法.jpg";

       //1,设置response 响应头
       response.reset(); //设置页面不缓存,清空buffer
       response.setCharacterEncoding("UTF-8"); //字符编码
       response.setContentType("multipart/form-data"); //二进制传输数据
       //设置响应头
       response.setHeader("Content-Disposition","attachment;fileName="+URLEncoder.encode(fileName, "UTF-8"));

       File file = new File(path,fileName);
       //2, 读取文件--输入流
       FileInputStream input=new FileInputStream(file);
       //3, 写出文件--输出流
       ServletOutputStream out = response.getOutputStream();

       byte[] buff =new byte[1024];
       int index=0;
       //4,执行写出操作
       while((index= input.read(buff))!= -1){
           out.write(buff, 0, index);
           out.flush();
      }
       out.close();
       input.close();
       return null;
    }
    ```

java中的floating number有问题

- java中的浮点数 离散，是大约数，不精确
    - 这个跟操作系统原理有关，有约等于
- 有限小数的double和float互不相等

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20188.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20188.png)

- 银行里面的数值，精确的运算，小数，全部用BigDecimal处理!

### 后续

- 看一下 单例-狂神说 教程!

- [ ]  [P38javaweb-38：文件传输原理及介绍37:31](https://www.bilibili.com/video/BV12J411M7Sj?p=38)
- [ ]  [P39javaweb-39：文件上传及拓展鸡汤1:11:33](https://www.bilibili.com/video/BV12J411M7Sj?p=39)

## Email发送

### 邮箱服务器

- email server类似于生活中的邮局，主要负责接收用户传递过来的邮件，并把邮件投递到接收者的email中
- 比如a给b发邮件，手机给基站（网络）传输
- 网络上有服务器，比如QQ服务器，网易服务器
- 注册有限，其实就是在对应的 邮箱服务公司的 服务器中分配一个空间
- 比如张三发邮件（zhangsan@163.）的时候，是先通过网络放进网易的服务器里，然后通过服务器发送
- 比如要发送到QQ的有一个邮箱地址，那么是先发送到QQ服务器的，接收者的设备连接到服务器获取邮件，接收者才能在设备上读取

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20189.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20189.png)

### 两个协议

- 发送邮件，用的是SMTP协议
- 接收邮件，用的是POP3协议
- 一个网易云服务器中包含
    - POP3接收
    - SMTP发送
    - File System文件系统（开账号，可以储存内容），注册邮箱就是在这里申请了一个地址
- 邮箱服务器中，要发出的邮件走SMTP发送，发送到 接收方server的POP3接收，用户从POP3中去取

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20190.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20190.png)

- SMTP server地址一般是 smtp.xxx.com
    - 如 smtp.163.com
    - 如 smtp.qq.com
    - 比如email进去就能看到

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20191.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20191.png)

- 细节

    （这个跟上面的图不太一样，应该这个是对的）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20192.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20192.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20193.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20193.png)

### 收不到邮件

- 可能收件箱服务器拒收信息（比如认为你的邮件是广告），此时可能在邮箱里找到也可能找不到
- 解决办法：重复内容不要多次发送，或者更换收件箱试试

### 邮件相关的包

（java中的都是这么写的）

- javax mail (因为已经完善，停更)

    ```xml
    <!-- https://mvnrepository.com/artifact/javax.mail/mail -->
    <dependency>
        <groupId>javax.mail</groupId>
        <artifactId>mail</artifactId>
        <version>1.4.7</version>
    </dependency>
    ```

    - JavaMail是sun公司（现在被oracle收购），为方便java开发人员 send email, receive email提供的standard 开发包，支持常用邮件协议，比如SMTP, POP3, IMAP, MIME
    - 使用时不需要知道底层细节，直接用JavaMail开发包中的 api就好了
- javaBeans activation framework

    ```xml
    <!-- https://mvnrepository.com/artifact/javax.activation/activation -->
    <dependency>
        <groupId>javax.activation</groupId>
        <artifactId>activation</artifactId>
        <version>1.1.1</version>
    </dependency>
    ```

### email相关的3个对象

- session对象：账号密码，环境信息
- transport对象：发送这个动作
- message对象：信息内容

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20194.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20194.png)

### 开启POP3和SMTP服务

- 要想发送邮件，需要在邮箱设置的地方，开启POP3和SMTP服务，获得协议支持
- google的话，需要额外turn on `Less secure app access`
- 比如 gmail

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20195.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20195.png)

### 设置属性，设置SSL

- qq

    ```java
    Properties prop = new Properties();
    prop.setProperty("mail.host","smtp.qq.com");//设置 qq 邮件服务器
    prop.setProperty("mail.transport.protocol","smtp");//邮件发送协议
    prop.setProperty("mail.smtp.auth","true");//需要验证用户名 pwd

    //QQ的话 需要SSL加密（阿里需要，腾讯也需要.大厂，更安全）,其他邮箱不需要
    MailSSLSocketFactory sf= new MailSSLSocketFactory();
    sf.setTrustAllHosts(true);
    prop.put("mail.smtp.ssl.enable","true");
    prop.put("mail.smtp.ssl.socketFactory",sf);
    ```

- gmail

    ```java
    Properties prop = new Properties();
    prop.setProperty("mail.host","smtp.gmail.com");//设置 qq 邮件服务器
    prop.setProperty("mail.transport.protocol","smtp");//邮件发送协议
    prop.setProperty("mail.smtp.auth","true");//需要验证用户名 pwd

    //QQ的话 需要SSL加密（阿里需要，腾讯也需要.大厂，更安全）,其他邮箱不需要
    MailSSLSocketFactory sf= new MailSSLSocketFactory();
    sf.setTrustAllHosts(true);
    prop.put("mail.smtp.ssl.enable","true");
    prop.put("mail.smtp.ssl.socketFactory",sf);
    ```

### 使用JavaMail发送邮件的5个步骤（简单邮件，只有txt）

- 其实这五个步骤跟用网页版操作是一样的，建立session，用account登陆进去，就对应log in
- 1-创建session对象
    - 这个session对象对应整个应用程序所需要的环境信息

        ```java
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kaitan9095@gmail.com","to be filled");
            }
        });
        ```

- 2-通过session创建transport对象

    ```java
    Transport ts = session.getTransport();
    ```

- 3-连接服务器
    - 使用username，授权码，连接上email server

        ```java
        ts.connect("smtp.gmail.com","kaitan9095@gmail.com","to be filled");
        ```

- 4-创建email

    ```java
    //注意需要传递session
    MimeMessage message = new MimeMessage(session);
    message.setSubject("Email with Only Text");
    message.setFrom(new InternetAddress("kaitan9095@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, "ksun01@email.wm.edu");
    message.setContent("This is the <h1>content<h1/> of the email","text/html;charset=UTF-8");
    //这里其实就是一段 html
    ```

- 5-发送email

    ```java
    //第五步：发email
    ts.sendMessage(message,message.getAllRecipients());

    //6. 关闭
    ts.close();
    ```

### MIME

- Multipurpose internet mail extensions
- 其实就是附件（图片等）相关的协议
- 支持发超文本
- 涉及到两个类
    - MimeBodyPart（主体）：表示一个MIME消息，与MimeMessage一样都是从Part接口继承来的
    - MimeMultipart（封装）：抽象类，Multipart的实现子类，用来组合多个Mime message。一个MimeMultipart对象可以包含多个代表Mime message的MimeBodyPart对象
- 理解这两个类：
    - 一个丰富的邮件可以包含：文字，图片(嵌在文字中)，附件

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20196.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20196.png)

    - 换成程序，就是每个组件是一个类（bodyPart），还有一个类把这些组件group在一起(Multipart)

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20197.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20197.png)

- 3中multipart类型
    - 都用mixed就没啥问题

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20198.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20198.png)

### 发送带图片的email

- 只改动email编辑即可

    ```java
    //第四步：写email
    //注意需要传递session
    MimeMessage message = new MimeMessage(session);
    message.setSubject("Email with Only Text");
    message.setFrom(new InternetAddress("kaitan9095@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, "ksun01@email.wm.edu");
    /*        message.setContent("This is the <h1>content<h1/> of the email","text/html;charset=UTF-8");
    //这里其实就是一段 html*/

    //image part
    MimeBodyPart image = new MimeBodyPart();
    DataHandler dh = new DataHandler(new FileDataSource("C:\\Users\\sunka\\Desktop\\learn-java\\code\\JavaWeb_study\\extensions\\mail-java\\src\\luluxiu.jpg"));
    image.setDataHandler(dh);
    image.setContentID("jpg");

    //txt part
    MimeBodyPart text = new MimeBodyPart();
    text.setContent("This is a complex email with <img src='cid:jpg'> lulu graph ","text/html;charset=UTF-8");
    // cid: ContentID

    //describe relationship of the parts
    MimeMultipart multi = new MimeMultipart();
    multi.addBodyPart(text);
    multi.addBodyPart(image);
    multi.setSubType("related");

    //set to message
    message.setContent(multi);
    message.saveChanges();

    //第五步：发email
    ts.sendMessage(message,message.getAllRecipients());
    ```

### 发送带附件的邮件

- 可以先组合email+txt（related）
- 然后组合 这个 和 附件
- 代码因为比较长，重要部分直接用function代替

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20199.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20199.png)

- 主要的代码

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20200.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20200.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20201.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20201.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20202.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20202.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20203.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20203.png)

### web中注册邮箱

- 启动项目：
    - 新建一个module（普通maven）
    - 添加web app框架
    - 添加tomcat run config（注意添加对应的artifact,启动地址）
    - 测试看能否正常启动
- 写一点，进行测试
    - servlet(记得配servlet)

        ```java
        public class RegisterServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String email = req.getParameter("email");

                System.out.println(username);
                System.out.println(password);
                System.out.println(email);
            }

            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
        }
        ```

    - 前端页面Index.jsp

        ```xml
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>
        <head>
          <title>Register</title>
        </head>
        <body>
        <form action="${pageContext.request.contextPath}/RegisterServlet.do" method="post">
          username: <input type="text" name="username"><br/>
          password: <input type="password" name="password"><br/>
          email: <input type="text" name="email"><br/>
          <input type="submit" value="Register">
        </form>
        </body>
        </html>
        ```

    - 完整书写

        ```java
        public class RegisterServlet extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String email = req.getParameter("email");

                System.out.println(username);
                System.out.println(password);
                System.out.println(email);

                User user = new User(username,password,email);

                //用户登录成功之后，给用户发送一封email
                //为了防止出现耗时过长，注册人数过多的情况，用现成来专门发email，避免白屏
                Sendmail send = new Sendmail(user);
                send.start();//启动线程，启动之后执行run来发邮件

                //注册用户
                req.setAttribute("message","注册成功，已发邮件，请查收");
                req.getRequestDispatcher("info.jsp").forward(req,resp);
            }

            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
        }
        ```

    ### 网站3秒原则

    - 用户如果看到3s不动，就会关掉
    - 所以需要用多线程来提高体验（异步处理）

    ### pojo中 DB相关的 类的书写

    - 原本需要 有参无参Constructor，Getter，Setter，toString

        ```java
        package com.kaitan.pojo;

        import java.io.Serializable;

        public class User implements Serializable {
            private String username;
            private String password;
            private String email;

            public User() {

            }

            public User(String username, String password, String email) {
                this.username = username;
                this.password = password;
                this.email = email;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            @Override
            public String toString() {
                return "User{" +
                        "username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", email='" + email + '\'' +
                        '}';
            }
        }
        ```

    - 偷懒，用lombok包，直接可以用`@` 来标记data类

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20204.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20204.png)

        如下，只需要定义参数，其他的用`@Data` 搞定

        ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20205.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20205.png)

### 导包到正确位置

- 如果发现包没导入webapp程序，检查下面真正的结构中是否导入了lib，发现没有

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20206.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20206.png)

- 此时需要点击WEB-INF然后添加lib

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20207.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20207.png)

- 发现还是不行，可能是tomcat的lib中没有这个包，直接手动导入（activation和mail包）

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20208.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20208.png)

### 读物-JVM

- 《深入理解java虚拟机》书，吃透，底层没问题

### Spring中的邮件发送

- 邮件配置

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20209.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20209.png)

- 写邮件

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20210.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20210.png)

    ![%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20211.png](%E3%80%90%E7%8B%82%E3%80%91JavaWeb%201b388280eae140cdb3534b52a6ea3a6d/Untitled%20211.png)

- [ ]  [P40javaweb-40：邮件发送原理及实现47:58](https://www.bilibili.com/video/BV12J411M7Sj?p=40)
- [ ]  [P41javaweb-41：网站注册发送邮件实现56:14](https://www.bilibili.com/video/BV12J411M7Sj?p=41)
- [ ]  [P42javaweb-42：之后该怎么持续学习27:29](https://www.bilibili.com/video/BV12J411M7Sj?p=42)
