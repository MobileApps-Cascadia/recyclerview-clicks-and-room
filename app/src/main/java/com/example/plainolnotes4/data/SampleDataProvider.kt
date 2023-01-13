package com.example.plainolnotes4.data

import java.util.*

class SampleDataProvider {

    companion object {
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nline feed"
        private val sampleText3 = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras id mattis lorem. Maecenas blandit efficitur magna. Nulla facilisi. Etiam quis dui placerat, feugiat augue eget, cursus neque. Integer auctor efficitur nisl, et ultrices lorem ullamcorper ut. Etiam maximus odio nisl, sed egestas lacus tincidunt at. Duis ligula dui, venenatis vitae quam quis, placerat ultricies ipsum. Donec at imperdiet nisi.

        Mauris sagittis imperdiet ligula, sed luctus felis sollicitudin sit amet. In pretium libero in bibendum euismod. Praesent elementum varius turpis, vel aliquet ex convallis ut. Sed porta ligula id ex pellentesque, et suscipit nisi euismod. Aenean convallis vehicula vestibulum. Fusce sed tristique augue. Nunc tincidunt nisi venenatis, condimentum ante at, fermentum ante. Donec et lorem tempus, finibus ligula in, semper nunc. Cras vitae lorem nec nibh pretium convallis at id sapien. Suspendisse et facilisis ex.
        """.trimIndent()


        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText2),
            NoteEntity(3, getDate(2), sampleText3)
        )
    }
}