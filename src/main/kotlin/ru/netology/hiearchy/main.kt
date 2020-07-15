package ru.netology.hiearchy

import ru.netology.hiearchy.view.TextView
import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button

fun main() {
    val main = ViewGroup()
    val title = TextView("Main Screen")
    title.click()
    title.text = "New text"
    title.click()
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    readMore.click()
    readMore.text = "Button"
    readMore.click()
    content.addView(readMore)
}
