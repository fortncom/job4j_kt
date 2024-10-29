package ru.job4j.lambda

class HtmlTable {

    fun table(row: Int, cell: Int): String {
        val table = StringBuilder()

        table.apply {
            append("<table>")
            for (i in 0 until row) {
                append("<row>")
                for (j in 0 until cell) {
                    append("<cell>$i $j</cell>")
                }
                append("</row>")
            }
            append("</table>")
        }
        return table.toString()
    }
}

fun main() {
    println(HtmlTable().table(3, 5))
}