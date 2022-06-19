package com.deva.dicoding_androidpemula_submission

object FoodData {

    private val foodNames = arrayOf("Mie Aceh",
        "Bika Ambon",
        "Rendang",
        "Gulai ikan Patin",
        "Pendap",
        "Gulai Belacan",
        "Otak-otak",
        "Pempek",
        "Mie Bangka",
        "Seruit")

    private val foodOrigin = arrayOf("Aceh",
        "Sumatera Utara",
        "Sumatera Barat",
        "Jambi",
        "Bengkulu",
        "Riau",
        "Kepulauan Riau",
        "Sumatera Selatan",
        "Bangka Belitung",
        "Lampung")

    private val foodType = arrayOf("Kuah/Goreng",
        "Kue",
        "Makanan Pedas",
        "Kuah",
        "Makanan Pedas",
        "Kuah",
        "Dibakar",
        "Kuah",
        "Kuah/Goreng",
        "Goreng/Bakar")

    private val foodDetails = arrayOf("Provinsi Aceh terkenal dengan Mie Acehnya. Mie kuning tebal dengan irisan daging disajikan dalam sup sejenis kari yang gurih dan pedas. Makanan ini benar-benar kaya bumbu.",
        "Makanan khas di Sumatera Utara khususnya Medan adalah Bika Ambon. Bika Ambon ini enak banget kadang juga dijual dengan rasa lain seperti durian dan keju. Rasanya manis dan lembut.",
        "Sumatera Barat terkenal dengan makanan Padang yang berasal dari kota Padang. Makanan yang banyak rempahnya ini mempunyai rasa yang kuat. Rendang adalah salah satu masakan Padang yang menjadi favorit banyak orang Indonesiabahkan sampai luar negeri.",
        "Gulai ikan Patin adalah masakan yang populer di masyarakat Jambi.  Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        "Pendap merupakan makanan bercitarasa pedas yang sangat populer di provinsi Bengkulu. Pendap terdiri dari bahan ikan yang dicampur dengan beberapa bahan utama seperti bawang putih, kencur, cabai giling, kelapa muda yang kemudian dimasak dalam balutan daun talas.",
        "Gulai Belacan salah satu masakan khas dari Riau. Gulai ini dibuat dengan kuah campuran belacan atau terasi. Bahannya biasanya memakai udang atau ikan.",
        "Otak-otak adalah salah satu makanan khas di Kepulauan Riau, baik di Batam, Tanjung Pinang, maupun di Pulau Penyengat. Di sini terdapat dua jenis otak-otak yaitu otak-otak yang terbuat dari ikan dan dari cumi yang lebih pedas. Otak-otak ini dibungkus dengan daun berwarna hijau sekalian dengan lidinya, yang kemudian dibakar dengan bara api.",
        "Di Sumatera Selatan terkenal makanan Pempek. Pempek terbuat dari ikan dan sagu. Penyajianya ditemani dengan kuah cokelat yang disebut cuko. Cuko terbuat dari air yang dididihkan, kemudian ditambah gula merah, udang rebi dan cabe rawit tumbuk, bawang putih, dan garam.",
        "Mie Bangka adalah salah satu dari sekian banyak ciri khas masyarakat pulau Bangka. Terbuat dari mie basah (kuning) biasa yang disiram dengan kuah berbumbu yang biasanya terbuat dari ikan, udang, cumi atau kepiting dan seringkali ditambahi dengan toge atau kecambah, mentimun, dan kerupuk. Lezat bila dihidangkan waktu masih panas dan ditambah rasa pedas dari cabe.",
        "Seruit adalah makanan khas provinsi Lampung yaitu masakan ikan yang digoreng atau dibakar dicampur sambal terasi, tempoyak (olahan durian) atau mangga."
    )

    private val foodImages = arrayOf(R.drawable.food1,
        R.drawable.food2,
        R.drawable.food3,
        R.drawable.food4,
        R.drawable.food5,
        R.drawable.food6,
        R.drawable.food7,
        R.drawable.food8,
        R.drawable.food9,
        R.drawable.food10,
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.origin = foodOrigin[position]
                food.type = foodType[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }
}