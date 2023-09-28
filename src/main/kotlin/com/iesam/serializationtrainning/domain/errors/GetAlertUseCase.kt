package com.iesam.serializationtrainning.domain.errors

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.data.AlertApiModel

class GetAlertUseCase(private val repository: ApiRepository) {
    operator fun invoke(): Either<ErrorApp, AlertApiModel> {
        return repository.getAlert()
    }
}