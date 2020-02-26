package com.farfetch.dagger.data.repo

import javax.inject.Inject

class RepositoryImpl  @Inject constructor(): Repository {

    override fun prin() {
        println("Estou aqui no repositorio")
    }
}
