package com.alexmumo.paging.model.response

import com.alexmumo.paging.model.PopularMovie
import com.google.gson.annotations.SerializedName

data class PopularResponse(
    @SerializedName("results")
    val results: List<PopularMovie>,
    @SerializedName("page")
    val page: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
