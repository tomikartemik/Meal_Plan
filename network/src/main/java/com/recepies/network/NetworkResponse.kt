package com.recepies.network

import java.io.IOException

sealed class NetworkResponse<out T : Any, out U : Any> {
    /**
     * Success response with body
     */
    //data class Success<T : Any>(val body: T) : NetworkResponse<T, Nothing>()

    /**
     * Success response with body
     */
    data class Success<T : Any>(val body: T,val code:Int) : NetworkResponse<T, Nothing>()

    /**
     * Failure response with body
     */
    data class ApiError<U : Any>(val body: U, val code: Int) : NetworkResponse<Nothing, U>()

    /**
     * Network error
     */
    data class NetworkError(val error: IOException) : NetworkResponse<Nothing, Nothing>()

    /**
     * For recepies, json parsing error
     */
    data class UnknownError(val error: Throwable?) : NetworkResponse<Nothing, Nothing>()
}