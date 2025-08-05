package org.interview

object  AdvancedTask  extends App {

  // Реальзовать compose HOF. Зачем и какие проблемы решает ?
  def compose[A, B, C](f: B => C, g: A => B): A => C = ???

  // Реальзовать curry HOF. Зачем и какие проблемы решает ?
  def curry[A, B, C](f: (A, B) => C): A => B => C = ???

  /*
   * Напишите функцию fold, которая принимает список символов List[Char]
   * и возвращает список кортежей, где каждый кортеж состоит из символа и количества его вхождений в список.
   */
  val input: List[Char] = "gfdjghdjfgjjjjsfssyyypppgghsfk".toList

  def fold(input: List[Char]): List[(Char, Int)] = ???

  println(fold(input))
}
