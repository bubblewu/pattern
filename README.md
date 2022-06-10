# 设计模式

## 什么是设计模式？

设计模式就是一套反复被使用的、为多数人知晓的、经过分类编目的、代码设计经验的总结。也就是在开发过程中约定俗成的代码设计的规范和模板。
根据设计模式的参考书 Design Patterns - Elements of Reusable
Object-Oriented Software（设计模式 - 可复用的面向对象软件元素） 中所提到的，总共有 23 种设计模式。
分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural
Patterns）、行为型模式（Behavioral Patterns）。

- 创建型模式： 这个类型的设计模式 在创建对象的同时隐藏创建逻辑的方式，而不是直接通过new去实例化对象。这样程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

> - 主要包括下面五种具体的设计模式：
    > 工厂模式(Factory Pattern)、抽象工厂模式(Abstract Factory Pattern)、单例模式(Singleton Pattern)、建造者模式(Builder Pattern)和原型模式(Prototype Pattern)。

- 结构型模式： 这类设计模式关注类和对象的组合。

> - 主要包括下面七种具体的设计模式：
    > 适配器模式(Adapter Pattern)、桥接模式(Bridge Pattern)、组合模式(Composite Pattern)、装饰器模式(Decorator Pattern)、外观模式(Facade Pattern)、享元模式(Flyweight Pattern)和代理模式(Proxy Pattern)

- 行为型模式： 这类设计模式关注对象之间的通信。

> - 主要包括下面十一种具体的设计模式：
    > 责任链模式(Chain of Responsibility Pattern)、命令模式(Command Pattern)、解释器模式(Interpreter Pattern)、迭代器模式(Iterator Pattern)、中介者模式(Mediator Pattern)、备忘录模式(Memento Pattern)、观察者模式(Observer Pattern)、状态模式(State Pattern)、策略模式(Strategy Pattern)、模板模式(Template Pattern)和访问者模式(Visitor Pattern)。

## 六大原则

- 开闭原则（Open Close Principle）： **对扩展开放，对修改关闭。**实现热插拔，提高扩展性。
- 里氏代换原则（Liskov Substitution Principle）： 实现抽象的规范，实现子父类互相替换；
- 依赖倒转原则（Dependence Inversion Principle）： 针对接口编程，实现开闭原则的基础；
- 接口隔离原则（Interface Segregation Principle）： 降低耦合度，接口单独设计，互相隔离；
- 迪米特法则，又称最少知道原则（Demeter Principle）： 功能模块尽量独立；
- 合成复用原则（Composite Reuse Principle）： 尽量使用合成/聚合的方式，而不是使用继承。

## 为什么使用设计模式？

使用设计模式能够保证代码的可重用性，让代码更容易让阅读者理解，保证代码的可靠性。








