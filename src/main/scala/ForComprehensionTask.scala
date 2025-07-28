package org.interview

class ForComprehensionTask {

  /**
   * Сложите внутренние значения, используя `flatMap` и `map`. В каком случае используется `flatMap`, а в каком — `map`?
   */
  def optSumWithChain(opt1: Option[Int], opt2: Option[Int]): Option[Int] = ???
  /**
   * Используйте for-comprehension с одним оператором <-. Увеличьте внутреннее значение на единицу. Это map или flatMap?
   */
  def forWithOneStatement(opt: Option[Int]): Option[Int] = ???

  /**
   * Используйте for-comprehension с двумя операторами <-. Сложите внутренние значения. Это map или/и flatMap?
   */
  def forWithTwoStatements(opt1: Option[Int], opt2: Option[Int]): Option[Int] = ???

  final case class Customer(name: String, age: Int)

  /**
   * Внутри for-comprehension используйте фильтр (guard), чтобы найти только совершеннолетних клиентов (старше или равных 18 лет)
   */
  def findAdultCustomers(customers: List[Customer]): List[Customer] = ???

  /**
   * Задача по дешугарингу (Desugaring task)
   */
  def safeDivideWithFor(opt1: Option[Int], opt2: Option[Int]): Option[Int] = ???

  val answer: List[Answer]= ???

  sealed trait Answer
  final case object FlatMap extends Answer
  final case object Map extends Answer
  final case object WithFilter extends Answer
}
