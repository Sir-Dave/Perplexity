package com.sirdave.perplexity.domain.model

data class SubscriptionPlan(
    val name: String,
    val amount: String,
    val description: String,
    val extra: String? = null
)
