package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate date;
	private Double amount;

	public Installment() {
	}

	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setDueDate(LocalDate date) {
		this.date = date;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return date.format(dtf) + " - " + String.format("%.2f", amount);
	}
	
}
