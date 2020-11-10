package com.vti.entity;

import java.beans.Encoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import com.vti.utils.ScannerUtils;

public class Group {

	private int id;
	private String name;
	private ArrayList<Account> accounts;
	private LocalDate createDate;

	public Group() {
		accounts = new ArrayList<>();
		input();
	}

	private void input() {
		System.out.println("Nhập id : ");
		id = ScannerUtils.inputInt("Please input a group id as int, please input again.");

		System.out.println("Nhập tên : ");
		name = ScannerUtils.inputString("Please input a group name, please input again.");

		confirmAddAccount();
	}

	private void confirmAddAccount() {
		System.out.println("Bạn có muốn add account không? (nhập 1 là có, 0 là không): ");

		int choose = 0;
		 do {
			choose = ScannerUtils.inputInt("Please input a number as int");

			switch (choose) {
			case 1:
				choose = 1;
				addAccount();
				break;

			case 0:
				return;

			default:
				System.out.println("Chỉ được nhập 1 hoặc 2, mời nhập lại: ");
				break;
			}
		} while (true);
	}

	private void addAccount() {
		System.out.println("Nhập số lượng account có trong group: ");
		int n = ScannerUtils.inputInt("Please input a number as int, please input again.");

		for (int i = 0; i < n; i++) {
			accounts.add(new Account());
		}
	}

	@Override
	public String toString() {
		return "Group{" +
				"id=" + id +
				", name='" + name + '\'' +
				", accounts=" + accounts +
				", createDate=" + createDate +
				'}';
	}
}
