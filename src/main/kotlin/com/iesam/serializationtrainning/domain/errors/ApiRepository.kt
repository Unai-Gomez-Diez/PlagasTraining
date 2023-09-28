package com.iesam.serializationtrainning.domain.errors

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.data.AlertApiModel
import com.iesam.serializationtrainning.data.AlertsApiModel
import com.iesam.serializationtrainning.data.PlagueApiModel

interface ApiRepository {
    fun getAlerts(): Either<ErrorApp, List<AlertsApiModel>>//importante fijarse en que se devuelve

    fun getAlert(): Either<ErrorApp, AlertApiModel>

    fun getPlagues(): Either<ErrorApp, PlagueApiModel>
}