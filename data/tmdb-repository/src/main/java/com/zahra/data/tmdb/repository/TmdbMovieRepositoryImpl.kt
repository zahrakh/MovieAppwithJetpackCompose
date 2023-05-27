package com.zahra.data.tmdb.repository

import com.zahra.data.api.tmdb.TmdbMoviesRemoteSource
import com.zahra.data.model.VideoThumbnail

internal class TmdbMovieRepositoryImpl(
  private val tmdbMoviesRemoteSource: TmdbMoviesRemoteSource,
) : TmdbMovieRepository {
  override suspend fun getMovieDetails(movieId: Int): VideoThumbnail =
    tmdbMoviesRemoteSource.getMovieDetails(movieId)
}
