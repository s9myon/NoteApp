package com.shudss00.noteapp.featurenote.presentation.notes

import com.shudss00.noteapp.featurenote.domain.model.Note
import com.shudss00.noteapp.featurenote.domain.util.NoteOrder
import com.shudss00.noteapp.featurenote.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
