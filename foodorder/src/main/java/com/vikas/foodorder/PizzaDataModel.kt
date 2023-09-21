package com.vikas.foodorder

import com.vikas.foodorder.R


data class PizzaDataModel(val pizzaName: String, val pizzaImage: Int, val pizzaPrice: String) {
    companion object {
        val list = listOf(
            PizzaDataModel("Food One", R.drawable.bowl_veggies_2, "KES 10.00"),
            PizzaDataModel("Delicious Fruit Bowl", R.drawable.bowl_fruits, "KES 12.00"),
            PizzaDataModel("Quick Breakfast Bowl", R.drawable.bowl_veggies_1, "KES 15.00"),
            PizzaDataModel("Avocado toast Bowl", R.drawable.bowl_veggies_3, "KES 20.00"),
            PizzaDataModel("Super Broccoli Bowl", R.drawable.bowl_veggies_4, "KES 15.00"),
            PizzaDataModel("Crunchy & Cheesy Pizza", R.drawable.bowl_veggies_5, "KES 20.00"),
        )
    }
}
