package com.zahra.data.api.tmdb

import com.zahra.data.model.VideoThumbnail
import com.zahra.data.network.TmdbMovieService

internal class TmdbMoviesRemoteSourceImp(
  private val tmdbMovieService: TmdbMovieService,
) : TmdbMoviesRemoteSource {

  override suspend fun getMovieDetails(movieId: Int): VideoThumbnail = tmdbMovieService
    .getMovieDetails(movieId)
    .toVideoThumbnail()
}
