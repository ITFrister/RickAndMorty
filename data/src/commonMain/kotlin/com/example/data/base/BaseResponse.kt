package com.example.data.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    @SerialName("info")
    val info: Info,

    @SerialName("results")
    val results: List<T>
) {
    @Serializable
    data class Info(
        @SerialName("count")
        val count: Int,

        @SerialName("pages")
        val pages: Int,

        @SerialName("next")
        val next: String?,

        @SerialName("prev")
        val prev: String?
    )
}