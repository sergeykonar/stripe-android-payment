package com.example.app

class ProductsUtil {
    companion object{
        fun getPrice(list: ArrayList<Product>) : String{
            return getTotalPrice(list).toString()
        }

        private fun getTotalPrice(list: ArrayList<Product>) : Long{
            var value : Long = 0
            for(product in list){
                value += product.price
            }

            return value
        }
    }


}