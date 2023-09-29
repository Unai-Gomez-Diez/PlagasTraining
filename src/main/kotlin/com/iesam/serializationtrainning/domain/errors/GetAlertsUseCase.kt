package com.iesam.serializationtrainning.domain.errors

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.data.AlertsApiModel

class GetAlertsUseCase(private val repository: ApiRepository) {

    operator fun invoke(): Either<ErrorApp, AlertsApiModel>{
        return repository.getAlerts()
    }
}