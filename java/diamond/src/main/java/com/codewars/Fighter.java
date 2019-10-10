package com.codewars;

public class Fighter {

  public String name;
  public int health, damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    if (!firstAttacker.equals(fighter1.name)) {
      Fighter temp = fighter1;
      fighter1 = fighter2;
      fighter2 = temp;
    }

    while (fighter1.health > 0 & fighter2.health > 0) {
      fighter2.health -= fighter1.damagePerAttack;
      Fighter temp = fighter1;
      fighter1 = fighter2;
      fighter2 = temp;
    }

    return (fighter1.health <= 0) ? fighter2.name : fighter1.name;
  }
}
