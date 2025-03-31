package com.example.expense_tracker.controller;

import com.example.expense_tracker.model.expense;
import com.example.expense_tracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class ExpenseController
{
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @PostMapping
    public expense addExpense(@RequestBody expense expense) {
        return expenseService.addExpense(expense);
    }
}
