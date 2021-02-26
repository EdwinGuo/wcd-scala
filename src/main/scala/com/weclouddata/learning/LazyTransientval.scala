package com.weclouddata.learning

import java.io._

class Foo(val bar: String) extends Serializable {
  @transient lazy val baz: String = {
    println("Calculate baz")
    bar + " world"
   }

   @transient   
   val boz: String = {
   println("Calculate boz")
   bar + " Hello"
   }

   lazy val biz: String = {
   println("Calculate biz")
   bar + " There"
   }
}

object LazyTransientval {
    // Create object of class Foo
    val foo = new Foo("Hello")

    // baz field is only calculated once
    foo.baz
    foo.baz

    // Serialize foo
    val bo = new ByteArrayOutputStream
    val o = new ObjectOutputStream(bo)
    o.writeObject(foo)
    val bytes = bo.toByteArray


    // Deserialize foo
    val bi = new ByteArrayInputStream(bytes)
    val i = new ObjectInputStream(bi)
    val foo2 = i.readObject.asInstanceOf[Foo]

    // baz field is recalculated once and only once
    foo2.baz
    foo2.baz

    // boz is null since we make it a transient val
    println(foo2.boz == null)

    // biz had been calculated before the serialization
    foo2.biz

} 
