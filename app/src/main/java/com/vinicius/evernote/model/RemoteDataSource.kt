package com.vinicius.evernote.model

import com.vinicius.evernote.network.RetrofitClient
import retrofit2.Callback

class RemoteDataSource {

    fun listNotes(callback: Callback<List<Note>>) {
        RetrofitClient.evernoteApi
            .listNotes()
            .enqueue(callback)
    }

    fun getNote(noteId: Int, callback: Callback<Note>) {
        RetrofitClient.evernoteApi
            .getNote(noteId)
            .enqueue(callback)
    }

    fun createNote(note: Note, callback: Callback<Note>) {
        RetrofitClient.evernoteApi
            .createNote(note)
            .enqueue(callback)
    }

}