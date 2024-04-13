package com.example.week4jetpack.Modelo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.week4jetpack.Beans.Sitios
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SitiosViewModel:ViewModel(){
    var listasitios: ArrayList<Sitios> by mutableStateOf(arrayListOf())


    fun getSitios(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitClient.placeHolder.getSitios()
            withContext(Dispatchers.Main){
                if (response.body()!=null)
                    listasitios = response.body() as ArrayList<Sitios>
            }
        }
    }

}