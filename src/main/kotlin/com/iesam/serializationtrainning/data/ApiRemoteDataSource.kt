package com.iesam.serializationtrainning.data

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.app.api.ApiClient
import com.iesam.serializationtrainning.app.left
import com.iesam.serializationtrainning.app.right
import com.iesam.serializationtrainning.domain.errors.ApiRepository
import com.iesam.serializationtrainning.domain.errors.ErrorApp
import retrofit2.Response
import java.io.IOException

class ApiRemoteDataSource: ApiRepository {

    private val apiClient: ApiClient = ApiClient()

    override fun getAlerts(): Either<ErrorApp, AlertsApiModel> {
        return try {
            val response: Response<AlertsApiModel> = apiClient.apiService.getAlerts().execute()
            if (response.isSuccessful) {
                response.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            ErrorApp.UnknowErrorApp.left()
        }
    }

    override fun getAlert(): Either<ErrorApp, AlertApiModel> {
        return try {
            val responseCats: Response<AlertApiModel> = apiClient.apiService.getAlertById().execute()
            if (responseCats.isSuccessful) {
                responseCats.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            ErrorApp.UnknowErrorApp.left()
        }
    }

    override fun getPlagues(): Either<ErrorApp, PlagueApiModel> {
        return try {
            val response: Response<PlagueApiModel> = apiClient.apiService.getPlague().execute()
            if (response.isSuccessful) {
                response.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            ErrorApp.UnknowErrorApp.left()
        }
    }
}