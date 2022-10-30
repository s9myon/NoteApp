package com.shudss00.noteapp.featurenote.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shudss00.noteapp.featurenote.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
