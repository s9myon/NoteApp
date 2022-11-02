package com.shudss00.noteapp.featurenote.domain.usecase

import com.shudss00.noteapp.featurenote.domain.model.Note
import com.shudss00.noteapp.featurenote.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
