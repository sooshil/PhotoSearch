package com.sukajee.searchphotos.api

import com.sukajee.searchphotos.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)