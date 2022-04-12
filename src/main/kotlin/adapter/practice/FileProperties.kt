package adapter.practice

import java.io.FileReader
import java.io.FileWriter
import java.util.*

class FileProperties : Properties(), FileIO {

    override fun readFromFile(fileName: String) {
        val reader = FileReader(fileName)
        load(reader)
    }

    override fun writeToFile(fileName: String) {
        val writer = FileWriter(fileName)
        store(writer, null)
    }

    override fun setValue(key: String, value: String) {
        setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return getProperty(key) ?: ""
    }
}