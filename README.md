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

所有的类都直接或者间接继承于Object类，类只有单继承没有多继承，final修饰的类没有子类

super调用父类属性和方法，this调用当前类的

重写是重写方法，与属性无关；可以缩小修饰符和抛出异常的范围但不能扩大，只能重写非静态方法

### 抽象类

使用abstract修饰的类，修饰在方法上就是抽象方法，可以不写函数体

抽象方法在子类使用必须由子类重写才可以使用，抽象类不能使用new创建对象

### 内部类

## 引用类型

除8大基本类型(byte、short、int、long、float、double、char、boolean)之外的都是引用类型，引用类型存放在堆中，而基本类型存放在栈中

## 接口

不适用class而使用interface修饰就是接口，其中的方法全部没有函数体且默认为public abstract

子类通过implements接口重写方法以实现接口，且命名规则在名字末尾加上Impl

子类可以继承多个接口，接口中定义的量都是常量，接口也不能通过new创建对象

## 异常处理

关键字：try、catch、finally、throw、throws
