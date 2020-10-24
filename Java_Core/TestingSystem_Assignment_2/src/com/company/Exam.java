package com.company;

import java.time.LocalDate;

public class Exam {
	int id;
	String code;
	String title;
	CategoryQuestion[] categoryQuestion;
	Duration duration;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
