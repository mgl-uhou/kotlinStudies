package app

import shopWindow.Product as shopW // Using alias
import shoppingCart.Product

fun main(){
    val pushProductShopWindow = shopW(1, "Teaspoon", 4.99)
    // shoppingCart.Product -> Using Full Qualify Name in the class call if I did not use the alias in shopWindow.Product
    val pushProductShoppingCart = Product(1, 4.99, 10)

    for(i in 10 downTo 0){// .., until
        print(i)
    }
}