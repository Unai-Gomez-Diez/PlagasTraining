package com.iesam.serializationtrainning.domain.errors

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.data.PlagueApiModel

class GetPlaguesUseCase (private val repository: ApiRepository){
    operator fun invoke(): Either<ErrorApp, PlagueApiModel> {
        return repository.getPlagues()
    }
}