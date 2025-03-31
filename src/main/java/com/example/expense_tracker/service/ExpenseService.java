package com.example.expense_tracker.service;
import com.example.expense_tracker.model.expense;

import java.util.*;
public class ExpenseService {

    private final List<expense> expenses = new ArrayList<>();
    private Integer nextId = 1;

    public List<expense> getAllExpenses() {
        return new ArrayList<>(expenses);
    }

    public expense addExpense(expense expense) {
        expense.setId(nextId++);
        expenses.add(expense);
        return expense;
    }
}
