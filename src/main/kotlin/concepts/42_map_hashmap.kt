import java.util.*

/*
*   1. Map and HashMap
* */
fun mapHashMap() {

    // Map Tutorial: Key-Value pair
//    var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
//    var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size
    var myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap.put(4, "Yogi")
    myMap.put(43, "Manmohan")
    myMap.put(7, "Vajpayee")

    myMap.put(43, "Modi")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }

    val languageList = listOf("fra","eng","den")
    val mapLang = hashMapOf<CharSequence, CharSequence>()
    for (langCode in languageList) {
        if (langCode.contains("-")) {
            val array = langCode.split("-")
            val locale = Locale(array[0], array[1])
            val languageName = locale.getDisplayLanguage(locale) +
                    " (" + locale.getDisplayCountry(locale) + ")"
            val cap = languageName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            mapLang[cap] = langCode
        } else {
            val locale = Locale(langCode)
            val languageName = locale.getDisplayLanguage(locale)
            val cap = languageName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            mapLang[cap] = langCode
        }
    }
}
