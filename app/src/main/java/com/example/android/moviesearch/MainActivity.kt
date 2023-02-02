package com.example.android.moviesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.android.moviesearch.db.DataBase.Companion.films

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text11: TextView = findViewById(R.id.textView_one_one)
        val text12: TextView = findViewById(R.id.textView_one_two)
        val button1: View = findViewById(R.id.button1)
        val imageView11: ImageView = findViewById(R.id.image_one)

        text11.text = films[0].name
        text12.text = films[0].description
        imageView11.setImageResource(films[0].image)

        val text21: TextView = findViewById(R.id.textView_two_one)
        val text22: TextView = findViewById(R.id.textView_two_two)
        val button2: View = findViewById(R.id.button2)
        val imageView21: ImageView = findViewById(R.id.image_two)

        text21.text = films[1].name
        text22.text = films[1].description
        imageView21.setImageResource(films[1].image)

        val text31: TextView = findViewById(R.id.textView_three_one)
        val text32: TextView = findViewById(R.id.textView_three_two)
        val button3: View = findViewById(R.id.button3)
        val imageView31: ImageView = findViewById(R.id.image_three)

        text31.text = films[2].name
        text32.text = films[2].description
        imageView31.setImageResource(films[2].image)

        //1 Сделать так чтобы данные из списка появились в xml.

        //2 По нажатию на Детали - выделяйте другим цветом название выбранного фильма,
        // открывайте новое окно, где показывайте картинку и описание фильма
        // 3 Сохраняйте выделение фильма при повороте и при возвращении со второго экрана
        // 4 Добавьте кнопку “Пригласить друга” и отправляйте приглашение по вашему выбору (почта, смс, социальные сети)

        //5 Добавьте на втором экране checkbox “Нравится” и текстовое поле для комментария.
        // Возвращайте значение чекбокса и текст комментария при переходе обратно на первый экран.
        // Возвращенные значения чекбокса и текстового комментария выводим в лог
        //P.S. Задание со звездочкой * - повышенной сложности.
        // Если вы с ним не справитесь - ничего страшного, оно не является обязательным.
    }
}