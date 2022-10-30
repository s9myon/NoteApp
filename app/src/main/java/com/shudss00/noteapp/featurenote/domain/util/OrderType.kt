package com.shudss00.noteapp.featurenote.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
