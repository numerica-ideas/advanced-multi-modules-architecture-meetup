package com.valdesekamdem.ammapp.services.user.user.dto

import com.valdesekamdem.ammapp.proxy.subscription.Subscription

data class UserProfile(
    val id: String,
    val name: String,
    val email: String,
    val activeSubscriptions: List<Subscription>,
)