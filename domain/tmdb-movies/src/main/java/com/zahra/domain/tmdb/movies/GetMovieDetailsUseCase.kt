package com.zahra.domain.tmdb.movies

import com.zahra.data.model.VideoThumbnail
import com.zahra.data.tmdb.repository.TmdbMovieRepository


interface GetMovieDetailsUseCase {
  suspend operator fun invoke(movieId: Int): VideoThumbnail
}

internal class GetMovieDetailsUseCaseImp(
  private val repository: TmdbMovieRepository,
) : GetMovieDetailsUseCase {
  override suspend fun invoke(movieId: Int): VideoThumbnail = repository
    .getMovieDetails(movieId)

}
