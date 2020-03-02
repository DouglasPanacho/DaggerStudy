package com.farfetch.dagger.data.repo

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor() : Repository {

    override fun prin() {
        println("Estou aqui no repositorio")
    }
}
