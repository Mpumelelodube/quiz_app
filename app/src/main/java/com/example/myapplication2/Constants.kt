package com.example.myapplication2

object Constants {
    const val USER_NAME = "user name"
    const val TOTAL_QUESTIONS = "total questions"
    const val CORRECT_ANSWERS = "correct answers"
    const val SELECTED_GAME = "selected game"

    fun getQuestions(): ArrayList<Question>{
        val questions = ArrayList<Question>()

        var que1 = Question(
            1,
            "Whats the name of the animal?",
            R.drawable.squirrel,
            "Tiger",
            "Squirrel",
            "Anaconda",
            "Bison",
            2
        )
        var que2 = Question(
            2,
            "wWhats the name of the animal?",
            R.drawable.bison,
            "Crocodile",
            "Beaver",
            "Elephant",
            "Bison",
            4
        )
        var que3 = Question(
            3,
            "Whats the name of the animal?",
            R.drawable.boar,
            "Boar",
            "Leopard",
            "Hyena",
            "Panther",
            1
        )
        var que4 = Question(
            4,
            "Whats the name of the animal?",
            R.drawable.butterfly,
            "Boar",
            "Ladybird",
            "Butterfly",
            "Fly",
            3
        )
        var que5 = Question(
            5,
            "Whats the name of the animal?",
            R.drawable.camel,
            "Bison",
            "Ladybird",
            "Camel",
            "Ostrich",
            3
        )
        var que6 = Question(
            6,
            "Whats the name of the animal?",
            R.drawable.cheetah,
            "Cheetah",
            "Ostrich",
            "Giraffe",
            "Pony",
            1
        )
        var que7 = Question(
            7,
            "Whats the name of the animal?",
            R.drawable.dolphin,
            "Baboon",
            "Bear",
            "dolphins",
            "Penguin",
            3
        )
        var que8 = Question(
            8,
            "Whats the name of the animal?",
            R.drawable.elephant,
            "Cat",
            "Elephant",
            "Dog",
            "Octopus",
            2
        )
        var que9 = Question(
            9,
            "Whats the name of the animal?",
            R.drawable.tiger,
            "Raccoon",
            "Mouse",
            "Lizard",
            "Tiger",
            4
        )
        var que10 = Question(
            10,
            "Whats the name of the animal?",
            R.drawable.flamingo,
            "Lion",
            "Flamingo",
            "Lizard",
            "Zebra",
            2
        )
        var que11 = Question(
            11,
            "Whats the name of the animal?",
            R.drawable.koala,
            "koala",
            "Ferret",
            "Lizard",
            "Octopus",
            1
        )
        var que12 = Question(
            12,
            "Whats the name of the animal?",
            R.drawable.lion_2,
            "koala",
            "Dog",
            "Lion",
            "Chameleon",
            3
        )
        var que13 = Question(
            13,
            "Whats the name of the animal?",
            R.drawable.shrimp,
            "Seahorse",
            "Bee",
            "Crab",
            "Shrimp",
            4
        )
        var que14 = Question(
            14,
            "Whats the name of the animal?",
            R.drawable.squid,
            "Squid",
            "Snake",
            "Snail",
            "Shrimp",
            1
        )
        var que15 = Question(
            15,
            "Whats the name of the animal?",
            R.drawable.zebra,
            "Mouse",
            "Zebra",
            "Rat",
            "Elephant",
            2
        )
        questions.add(que1)
        questions.add(que2)
        questions.add(que3)
        questions.add(que4)
        questions.add(que5)
        questions.add(que6)
        questions.add(que7)
        questions.add(que8)
        questions.add(que9)
        questions.add(que10)
        questions.add(que11)
        questions.add(que12)
        questions.add(que13)
        questions.add(que14)
        questions.add(que15)

        return questions
    }

    fun getColorQuestions(): ArrayList<Question>{
        val questions = ArrayList<Question>()

        var que1 = Question(
            1,
            "Whats the name of the color?",
            R.drawable.baker_miller_pink,
            "Magenta",
            "Baker Miller pink",
            "Lyft Pink",
            "Hot Pink",
            2
        )
        var que2 = Question(
            2,
            "Whats the name of the color?",
            R.drawable.black_olive,
            "Black Olive",
            "Pebble",
            "Jet Black",
            "Charcoal Black",
            1
        )
        var que3 = Question(
            3,
            "Whats the name of the color?",
            R.drawable.burgundy,
            "Currant",
            "Red",
            "Burgundy",
            "Cherry Red",
            3
        )
        var que4 = Question(
            4,
            "Whats the name of the color?",
            R.drawable.celadon_green,
            "Hunter Green",
            "Pine Green",
            "Army Green",
            "Celadon Green",
            4
        )
        var que5 = Question(
            5,
            "Whats the name of the color?",
            R.drawable.chartreuse,
            "Hunter Green",
            "Pine Green",
            "Army Green",
            "chartreuse",
            4
        )
        var que6 = Question(
            6,
            "Whats the name of the color?",
            R.drawable.mahogany,
            "Currant",
            "Red",
            "Mahogany",
            "Cherry Red",
            3
        )
        var que7 = Question(
            7,
            "Whats the name of the color?",
            R.drawable.medium_carmine,
            "Scarlet",
            "Fire Brick Red",
            "Medium Carmine",
            "Persian Red",
            3
        )
        var que8 = Question(
            8,
            "Whats the name of the color?",
            R.drawable.neon_green,
            "Neon Green",
            "Emerald Green",
            "Shamrock",
            "Viridian",
            1
        )
        var que9 = Question(
            9,
            "Whats the name of the color?",
            R.drawable.pastel_yellow,
            "canary Yellow",
            "Oyster Yellow",
            "Pastel Yellow",
            "Granola Yellow",
            3
        )
        var que10 = Question(
            10,
            "Whats the name of the color?",
            R.drawable.phthalo_green,
            "Forest Green",
            "Phthalo Green",
            "Neon Green",
            "Emerald Green",
            2
        )
        var que11 = Question(
            11,
            "Whats the name of the color?",
            R.drawable.rose_bonbon,
            "Rose Bonbon",
            "Magenta",
            "Lyft Pink",
            "Hot Pink",
            1
        )
        var que12 = Question(
            12,
            "Whats the name of the color?",
            R.drawable.sap_green,
            "Neon Green",
            "Emerald Green",
            "Shamrock",
            "Sap Green",
            4
        )
        var que13 = Question(
            13,
            "Whats the name of the color?",
            R.drawable.ucla_blue,
            "Prussian Blue",
            "Cobalt Blue",
            "Ucla Blue",
            "Persian Blue",
            3
        )
        var que14 = Question(
            14,
            "Whats the name of the color?",
            R.drawable.violet_ryb,
            "Violet Ryb",
            "Plum Purple",
            "Amethyst Purple",
            "Orchid",
            1
        )
        var que15 = Question(
            15,
            "Whats the name of the color?",
            R.drawable.xanadu,
            "xanadu",
            "Porpoise Grey",
            "Slate",
            "Pewter",
            1
        )

        questions.add(que1)
        questions.add(que2)
        questions.add(que3)
        questions.add(que4)
        questions.add(que5)
        questions.add(que6)
        questions.add(que7)
        questions.add(que8)
        questions.add(que9)
        questions.add(que10)
        questions.add(que11)
        questions.add(que12)
        questions.add(que13)
        questions.add(que14)
        questions.add(que15)

        return questions
    }

    fun getFlagQuestions(): ArrayList<Question>{
        val questions = ArrayList<Question>()

        var que1 = Question(
            1,
            "Which country does the flag belong to?",
            R.drawable.zimbabwe,
            "Zimbabwe",
            "Zambia",
            "Zaire",
            "Gabon",
            1
        )
        var que2 = Question(
            2,
            "Which country does the flag belong to?",
            R.drawable.afghanistan,
            "Morocco",
            "Afghanistan",
            "Egypt",
            "Albania",
            2
        )
        var que3 = Question(
            3,
            "Which country does the flag belong to?",
            R.drawable.algeria,
            "Algeria",
            "Togo",
            "Uganda",
            "Morocco",
            1
        )
        var que4 = Question(
            4,
            "Which country does the flag belong to?",
            R.drawable.bostwana,
            "Congo",
            "Mozambique",
            "Botswana",
            "Ethiopia",
            3
        )
        var que5 = Question(
            5,
            "Which country does the flag belong to?",
            R.drawable.burundi,
            "Ethiopia",
            "Tunisia",
            "Burundi",
            "Genie",
            3
        )
        var que6 = Question(
            6,
            "Which country does the flag belong to?",
            R.drawable.egypt,
            "Egypt",
            "Uganda",
            "Algeria",
            "Botswana",
            1
        )
        var que7 = Question(
            7,
            "Which country does the flag belong to?",
            R.drawable.gabon,
            "South Africa",
            "Gambia",
            "Gabon",
            "Morocco",
            3
        )
        var que8 = Question(
            8,
            "Which country does the flag belong to?",
            R.drawable.gambia,
            "Nigeria",
            "Gambia",
            "Ghana",
            "Ivory Coast",
            2
        )
        var que9 = Question(
            9,
            "Which country does the flag belong to?",
            R.drawable.ghana,
            "Kenya",
            "Madagascar",
            "Gambia",
            "Ghana",
            4
        )
        var que10 = Question(
            10,
            "Which country does the flag belong to?",
            R.drawable.guinea,
            "tanzania",
            "Guinea",
            "Namibia",
            "Angola",
            2
        )
        var que11 = Question(
            11,
            "Which country does the flag belong to?",
            R.drawable.kenya,
            "kenya",
            "Peru",
            "DRC",
            "Ethiopia",
            1
        )
        var que12 = Question(
            12,
        "Which country does the flag belong to?",
            R.drawable.tanzania,
            "Ghana",
            "Zambia",
            "Tanzania",
            "Nigeria",
            3
        )
        var que13 = Question(
            13,
            "Which country does the flag belong to?",
            R.drawable.togo,
            "Iran",
            "Gabon",
            "Zaire",
            "Togo",
            4
        )
        var que14 = Question(
            14,
            "Which country does the flag belong to?",
            R.drawable.zambia,
            "zambia",
            "Mozambique",
            "Zimbabwe",
            "South Africa",
            1
        )
        var que15 = Question(
            15,
            "Which country does the flag belong to?",
            R.drawable.cameroon,
            "Guinea",
            "Cameroon",
            "Gabon",
            "Kenya",
            2
        )
        questions.add(que1)
        questions.add(que2)
        questions.add(que3)
        questions.add(que4)
        questions.add(que5)
        questions.add(que6)
        questions.add(que7)
        questions.add(que8)
        questions.add(que9)
        questions.add(que10)
        questions.add(que11)
        questions.add(que12)
        questions.add(que13)
        questions.add(que14)
        questions.add(que15)

        return questions
    }

}