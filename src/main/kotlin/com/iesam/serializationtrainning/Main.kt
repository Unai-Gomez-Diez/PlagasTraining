package com.iesam.serializationtrainning

import com.google.gson.annotations.SerializedName
import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.data.ApiRemoteDataSource
import com.iesam.serializationtrainning.domain.errors.ApiRepository
import com.iesam.serializationtrainning.domain.errors.GetAlertUseCase
import com.iesam.serializationtrainning.domain.errors.GetAlertsUseCase
import com.iesam.serializationtrainning.domain.errors.GetPlaguesUseCase

fun main(){

    fun llamada01(getPlaguesUseCase: GetPlaguesUseCase){
        val y = getPlaguesUseCase()
        println(y)
    }
    llamada01(getPlaguesUseCase = GetPlaguesUseCase(repository = ApiRemoteDataSource()))


    fun llamada2(getAlertsUseCase: GetAlertsUseCase){
        val x = getAlertsUseCase()
        println(x)
    }
    llamada2(getAlertsUseCase = GetAlertsUseCase(repository = ApiRemoteDataSource()))

   fun llamda3(getAlertUseCase: GetAlertUseCase){
        val z = getAlertUseCase()
        println(z)
    }
    llamda3(getAlertUseCase = GetAlertUseCase(repository = ApiRemoteDataSource()))

}