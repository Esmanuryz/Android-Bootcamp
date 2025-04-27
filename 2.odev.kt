// 1.1
fun cTof(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 1.2
fun rect(length: Int, width: Int): Int {
    return 2 * (length + width)
}

// 1.3
fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

// 1.4
fun countA(word: String): Int {
    var count = 0
    for (char in word) {
        if (char == 'a' || char == 'A') {
            count++
        }
    }
    return count
}


// 2.1
fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 2.2
fun maasHesapla(gunSayisi: Int): Int {
    val normalSaat = gunSayisi * 8
    return if (normalSaat <= 160) {
        normalSaat * 10  // Normal çalışma saati ücreti
    } else {
        val mesaiSaatleri = normalSaat - 160
        (160 * 10) + (mesaiSaatleri * 20) // Normal + Mesai ücreti
    }
}


// 2.3
fun internetUcreti(kotaGB: Int): Int {
    return if (kotaGB <= 50) {
        100 // Kota içinde kalmışsa sabit ücret
    } else {
        100 + (kotaGB - 50) * 4 // 50 GB sonrası aşım ücreti eklenir
    }
}



//ciktilar
fun main() {
    println("1.1 Sıcaklık Dönüşümü (C -> F): ${cTof(25.0)} °F")
    println("1.2 Dikdörtgen Çevresi: ${rect(5, 10)} birim")
    println("1.3 Faktöriyel Hesabı (5!): ${factorial(5)}")
    println("1.4 'a' harfi sayısı (Kelimede): ${countA("Ankara")}")
    
    println("2.1 İç Açılar Toplamı (6 kenarlı): ${icAcilarToplami(6)} derece")
    println("2.2 Maaş Hesabı (22 gün çalışıldı): ${maasHesapla(22)} TL")
    println("2.3 İnternet Ücreti (65 GB kullanım): ${internetUcreti(65)} TL")
}

















