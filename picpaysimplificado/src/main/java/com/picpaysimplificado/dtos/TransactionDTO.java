package com.picpaysimplificado.dtos;


import java.math.BigDecimal;

// transaction data object
public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
