package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero warrior = new Hero();
		Hero wizard = new Hero();
		Hero healer = new Hero();
		
		warrior.setJob("������");
		warrior.setHp(18000);
		warrior.setMp(5000);
		warrior.setGender('��');
		warrior.setLevel(5);
		
		wizard.setJob("������");
		wizard.setHp(5000);
		wizard.setMp(25000);
		wizard.setGender('��');
		wizard.setLevel(2);
		
		healer.setJob("����");
		healer.setHp(10000);
		healer.setMp(50000);
		healer.setGender('��');
		healer.setLevel(10);
		
		System.out.printf("���� : %s\n", warrior.getJob());
		System.out.printf("hp : %d\n", warrior.getHp());
		System.out.printf("mp : %d\n", warrior.getMp());
		System.out.printf("���� : %c\n", warrior.getGender());
		System.out.printf("���� ������ %d �Դϴ�.\n", warrior.getLevel());
		
		System.out.println();
		
		System.out.printf("���� : %s\n", wizard.getJob());
		System.out.printf("hp : %d\n", wizard.getHp());
		System.out.printf("mp : %d\n", wizard.getMp());
		System.out.printf("���� : %c\n", wizard.getGender());
		System.out.printf("���� ������ %d �Դϴ�.\n", wizard.getLevel());
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		wizard.attack();
		warrior.setHp(warrior.getHp() - 150);
		
		System.out.println();
		
		System.out.printf("���� : %s\n", warrior.getJob());
		System.out.printf("hp : %d\n", warrior.getHp());
		System.out.printf("mp : %d\n", warrior.getMp());
		System.out.printf("���� : %c\n", warrior.getGender());
		System.out.printf("���� ������ %d �Դϴ�.\n", warrior.getLevel());
		
		System.out.println();
		System.out.println("============================");
		System.out.printf("���� : %s\n", healer.getJob());
		System.out.printf("hp : %d\n", healer.getHp());
		System.out.printf("mp : %d\n", healer.getMp());
		System.out.printf("���� : %c\n", healer.getGender());
		System.out.printf("���� ������ %d �Դϴ�.\n", healer.getLevel());

		System.out.println();
		
		healer.jump();
		
		
	}
}
