package com.jc.rickandmortyapi.dataAccess.network.common

data class Pagination(
    val count: Int,
    val pages: Int,
    val next: String,
    val prev: String
)
