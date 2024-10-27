package com.example.a15_1_viewpager2

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : BaseActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: PicturePagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupWindowInsets(R.id.main)
        setupToolbar(R.id.toolbar, false)

        viewPager = findViewById(R.id.viewPager)

        val pictures = listOf(
            Picture(
                "Мона Лиза",
                "Леонардо да Винчи",
                "https://upload.wikimedia.org/wikipedia/commons/e/ec/Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched.jpg"
            ),
            Picture(
                "Звёздная ночь",
                "Винсент ван Гог",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Van_Gogh_-_Starry_Night_-_Google_Art_Project.jpg/1024px-Van_Gogh_-_Starry_Night_-_Google_Art_Project.jpg"
            ),
            Picture(
                "Девушка с жемчужной серёжкой",
                "Ян Вермеер",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/%D0%94%D0%B5%D0%B2%D1%83%D1%88%D0%BA%D0%B0_%D1%81_%D0%B6%D0%B5%D0%BC%D1%87%D1%83%D0%B6%D0%BD%D0%BE%D0%B9_%D1%81%D0%B5%D1%80%D1%91%D0%B6%D0%BA%D0%BE%D0%B9.jpg/800px-%D0%94%D0%B5%D0%B2%D1%83%D1%88%D0%BA%D0%B0_%D1%81_%D0%B6%D0%B5%D0%BC%D1%87%D1%83%D0%B6%D0%BD%D0%BE%D0%B9_%D1%81%D0%B5%D1%80%D1%91%D0%B6%D0%BA%D0%BE%D0%B9.jpg"
            ),
            Picture(
                "Сотворение Адама",
                "Микеланджело",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/God2-Sistine_Chapel.png/800px-God2-Sistine_Chapel.png"
            ),
            Picture(
                "Герника",
                "Пабло Пикассо",
                "https://upload.wikimedia.org/wikipedia/en/7/74/PicassoGuernica.jpg"
            ),
            Picture(
                "Крик",
                "Эдвард Мунк",
                "https://upload.wikimedia.org/wikipedia/commons/f/f4/The_Scream.jpg"
            ),
            Picture(
                "Тайная вечеря",
                "Леонардо да Винчи",
                "https://pohcdn.com/guide/sites/default/files/styles/paragraph__hero_banner__hb_image__1880bp/public/hero_banner/Mosaic-of-Last-supper-of-Jesus.jpg"
            ),
            Picture(
                "Рождение Венеры",
                "Сандро Боттичелли",
                "https://s0.rbk.ru/v6_top_pics/media/img/5/27/346980612934275.webp"
            ),
            Picture(
                "Постоянство памяти",
                "Сальвадор Дали",
                "https://upload.wikimedia.org/wikipedia/en/d/dd/The_Persistence_of_Memory.jpg"
            ),
            Picture(
                "Американская готика",
                "Грант Вуд",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhvPZpMKGkFVr4l5M15SIBWoFT39EKpRjENQ&s"
            ),
            Picture(
                "Сад земных наслаждений",
                "Иероним Босх",
                "https://lectoriumart.ru/wp-content/uploads/2020/06/unnamed-4.jpg"
            ),
            Picture(
                "Поцелуй",
                "Густав Климт",
                "https://static.tildacdn.com/tild6134-6232-4632-a464-613366623834/2.png"
            ),
            Picture(
                "Завтрак на траве",
                "Эдуард Мане",
                "https://upload.wikimedia.org/wikipedia/commons/3/3a/Edouard_Manet_024.jpg"
            ),
            Picture(
                "Бал в Мулен де ла Галетт",
                "Пьер Огюст Ренуар",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Pierre-Auguste_Renoir%2C_Le_Moulin_de_la_Galette.jpg/800px-Pierre-Auguste_Renoir%2C_Le_Moulin_de_la_Galette.jpg"
            ),
            Picture(
                "Свобода, ведущая народ",
                "Эжен Делакруа",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/La_Libert%C3%A9_guidant_le_peuple_-_Eug%C3%A8ne_Delacroix_-_Mus%C3%A9e_du_Louvre_Peintures_RF_129_-_apr%C3%A8s_restauration_2024.jpg/640px-La_Libert%C3%A9_guidant_le_peuple_-_Eug%C3%A8ne_Delacroix_-_Mus%C3%A9e_du_Louvre_Peintures_RF_129_-_apr%C3%A8s_restauration_2024.jpg"
            ),
            Picture(
                "Афинская школа",
                "Рафаэль",
                "https://upload.wikimedia.org/wikipedia/commons/6/68/Raffael_058.jpg"
            ),
            Picture(
                "Триумф смерти",
                "Питер Брейгель Старший",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/The_Triumph_of_Death_by_Pieter_Bruegel_the_Elder.jpg/640px-The_Triumph_of_Death_by_Pieter_Bruegel_the_Elder.jpg"
            ),
            Picture(
                "Лилии",
                "Клод Моне",
                "https://legacy-time.ru/stc/wrt/3/imgb.jpg"
            )
        )

        adapter = PicturePagerAdapter(this, pictures)
        viewPager.adapter = adapter
    }
}