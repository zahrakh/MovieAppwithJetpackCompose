package com.zahra.data.api.tmdb

import com.zahra.data.model.VideoThumbnail

interface TmdbMoviesRemoteSource {
  suspend fun getMovieDetails(movieId: Int): VideoThumbnail
}
