package org.example.data.base

interface Mapper<F, T> {

    fun map(data: F): T

    fun mapList(list: List<F>): List<T> {
        return list.map { map(it) }
    }

}