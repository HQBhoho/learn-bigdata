package com.hqbhoho.bigdata.design.pattern;
/**
 * describe:
 * <p>
 * 23种设计模式
 * <p>
 * 一、设计模式设计原则
 * (1) 开闭原则
 * 对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，而是扩展原有代码，实现一个热插拔的效果。
 * (2) 里式替换原则
 * 子类对父类的方法尽量不要重写和重载
 * (3) 依赖倒置原则
 * 抽象不应该依赖细节，细节应该依赖抽象
 * (4) 单一职责原则
 * 一个类只负责一项功能
 * (5) 接口隔离原则
 * 每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分
 * (6) 迪米特法则
 * 通俗的来讲，就是一个类对自己依赖的类知道的越少越好。
 * 迪米特法则还有一个更简单的定义：只与直接的朋友通信。
 * 首先来解释一下什么是直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖、关联、组合、聚合等。其中，我们称出现成员变量、方法参数、方法返回值中的类为直接的朋友，而出现在局部变量中的类则不是直接的朋友。也就是说，陌生的类最好不要作为局部变量的形式出现在类的内部。
 * (7) 合成复用原则
 * 尽量首先使用合成/聚合的方式，而不是使用继承
 * <p>
 * 二、设计模式分类
 * (1) 创建型模式：
 * 用于描述“怎样创建对象”，它的主要特点是“将对象的创建与使用分离”。
 * GoF 中提供了单例、原型、工厂方法、抽象工厂、建造者等 5 种创建型模式。
 * (2) 结构型模式：
 * 用于描述如何将类或对象按某种布局组成更大的结构。
 * GoF 中提供了代理、适配器、桥接、装饰、外观、享元、组合等 7 种结构型模式。
 * (3) 行为型模式：
 * 用于描述类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，以及怎样分配职责。
 * GoF 中提供了模板方法、策略、命令、职责链、状态、观察者、中介者、迭代器、访问者、备忘录、解释器等 11 种行为型模式。
 * <p>
 * 三、具体23种设计模式
 * **********************************************************************************************************************************************
 * (1) 单例（Singleton）模式
 * 某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
 * {@link com.hqbhoho.bigdata.design.pattern.singleton}
 * <p>
 * **********************************************************************************************************************************************
 * (2) 原型（Prototype）模式
 * 将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
 * {@link com.hqbhoho.bigdata.design.pattern.prototype}
 * <p>
 * **********************************************************************************************************************************************
 * (3) 工厂方法（Factory Method）模式
 * 定义一个用于创建产品的接口，由子类决定生产什么产品。
 * {@link com.hqbhoho.bigdata.design.pattern.factory_method}
 * <p>
 * **********************************************************************************************************************************************
 * (4) 抽象工厂（AbstractFactory）模式
 * 提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 * {@link com.hqbhoho.bigdata.design.pattern.abstract_factory}
 * <p>
 * **********************************************************************************************************************************************
 * (5) 建造者（Builder）模式
 * 将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
 * {@link com.hqbhoho.bigdata.design.pattern.builder}
 * <p>
 * **********************************************************************************************************************************************
 * (6) 代理（Proxy）模式
 * 为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
 * {@link com.hqbhoho.bigdata.design.pattern.proxy}
 * <p>
 * **********************************************************************************************************************************************
 * (7) 适配器（Adapter）模式
 * 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * {@link com.hqbhoho.bigdata.design.pattern.adapter}
 * <p>
 * **********************************************************************************************************************************************
 * (8) 桥接（Bridge）模式
 * 将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 * {@link com.hqbhoho.bigdata.design.pattern.bridge}
 * <p>
 * **********************************************************************************************************************************************
 * (9) 装饰（Decorator）模式
 * 动态的给对象增加一些职责，即增加其额外的功能。
 * {@link com.hqbhoho.bigdata.design.pattern.decorator}
 * <p>
 * **********************************************************************************************************************************************
 * (10) 外观（Facade）模式
 * 为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。一个业务包含多个操作，应把这些操作封装成一个外观，便于客户端使用。
 * {@link com.hqbhoho.bigdata.design.pattern.facade}
 * <p>
 * **********************************************************************************************************************************************
 * (11) 享元（Flyweight）模式
 * 运用共享技术来有效地支持大量细粒度对象的复用。
 * {@link com.hqbhoho.bigdata.design.pattern.flyweight}
 * <p>
 * **********************************************************************************************************************************************
 * (12) 组合（Composite）模式
 * 将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。
 * {@link com.hqbhoho.bigdata.design.pattern.composite}
 * <p>
 * **********************************************************************************************************************************************
 * (13) 模板方法（TemplateMethod）模式
 * 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * {@link com.hqbhoho.bigdata.design.pattern.template_method}
 * <p>
 * **********************************************************************************************************************************************
 * (14) 策略（Strategy）模式
 * 定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
 * {@link com.hqbhoho.bigdata.design.pattern.strategy}
 * <p>
 * **********************************************************************************************************************************************
 * (15) 命令（Command）模式
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 * {@link com.hqbhoho.bigdata.design.pattern.command}
 * <p>
 * **********************************************************************************************************************************************
 * (16) 职责链（Chain of Responsibility）模式
 * 把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
 * {@link com.hqbhoho.bigdata.design.pattern.responsibility_chain}
 * <p>
 * **********************************************************************************************************************************************
 * (17) 状态（State）模式
 * 允许一个对象在其内部状态发生改变时改变其行为能力。
 * {@link com.hqbhoho.bigdata.design.pattern.state}
 * <p>
 * **********************************************************************************************************************************************
 * (18) 观察者（Observer）模式
 * 多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
 * {@link com.hqbhoho.bigdata.design.pattern.observer}
 * <p>
 * **********************************************************************************************************************************************
 * (19) 中介者（Mediator）模式
 * 定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
 * 中介者模式的核心在于中介者类的引入，在中介者模式中，中介者类承担了两方面的职责：
 * 中转作用（结构性）：通过中介者提供的中转作用，各个同事对象就不再需要显式引用其他同事，当需要和其他同事进行通信时，可通过中介者来实现间接调用。该中转作用属于中介者在结构上的支持。
 * 协调作用（行为性）：中介者可以更进一步的对同事之间的关系进行封装，同事可以一致的和中介者进行交互，而不需要指明中介者需要具体怎么做，中介者根据封装在自身内部的协调逻辑，对同事的请求进行进一步处理，将同事成员之间的关系行为进行分离和封装。
 * {@link com.hqbhoho.bigdata.design.pattern.mediator}
 * <p>
 * **********************************************************************************************************************************************
 * (20) 迭代器（Iterator）模式
 * 提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * {@link com.hqbhoho.bigdata.design.pattern.iterator}
 * <p>
 * **********************************************************************************************************************************************
 * (21) 访问者（Visitor）模式
 * 在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
 * {@link com.hqbhoho.bigdata.design.pattern.visitor}
 * <p>
 * **********************************************************************************************************************************************
 * (22) 备忘录（Memento）模式
 * 在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
 * {@link com.hqbhoho.bigdata.design.pattern.memento}
 * <p>
 * **********************************************************************************************************************************************
 * (23) 解释器（Interpreter）模式
 * 提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。
 * {@link com.hqbhoho.bigdata.design.pattern.interpreter}
 * <p>
 * **********************************************************************************************************************************************
 *
 * @author hqbhoho
 * @date 2019/11/24
 * @version [v1.0]
 */

