package com.shudss00.noteapp.featurenote.presentation.notes

import com.shudss00.noteapp.featurenote.domain.model.Note
import com.shudss00.noteapp.featurenote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
