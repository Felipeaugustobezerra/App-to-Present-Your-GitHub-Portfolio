package br.com.dio.apprepositories.domain

import br.com.dio.apprepositories.core.UseCase
import br.com.dio.apprepositories.data.model.Repo
import br.com.dio.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}