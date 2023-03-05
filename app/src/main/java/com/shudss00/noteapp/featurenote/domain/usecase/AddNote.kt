package com.shudss00.noteapp.featurenote.domain.usecase

import com.shudss00.noteapp.featurenote.domain.model.InvalidNoteException
import com.shudss00.noteapp.featurenote.domain.model.Note
import com.shudss00.noteapp.featurenote.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @kotlin.jvm.Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}
