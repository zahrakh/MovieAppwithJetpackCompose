package com.zahra.data.tmdb.repository

import com.zahra.data.model.VideoThumbnail

interface TmdbMovieRepository {
  suspend fun getMovieDetails(movieId:Int):VideoThumbnail
}
