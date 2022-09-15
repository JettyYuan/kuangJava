# kuangJava

## javaDoc

命令参数

- author 作者
- version 使用的版本号
- since 需要的最早版本号
- param 参数
- return 返回值
- throws 异常抛出

在终端使用javadoc生成api文档，加入参数-encoding UTF-8 -charset UTF-8显示中文

## 参数

### 命令行参数

通过命令行在编译是加入参数

### 可变参数

类型后加上...来表示不指定参数的个数，一个方法只能有一个可变参数，且放在参数列表的最后

## 稀疏数组

压缩原数组并保存

## 类

类中所有方法中，在使用static与不使用static是有区别的，生效的时机也不用

在使用new创建对象或者变量时，当它使用时给其分配空间并初始化为默认值

属性私有，get/set

## 引用类型

除8大基本类型(byte、short、int、long、float、double、char、boolean)之外的都是引用类型，引用类型存放在堆中，而基本类型存放在栈中
