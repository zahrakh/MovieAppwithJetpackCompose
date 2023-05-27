package com.zahra.data.network

import retrofit2.http.GET

interface TmdbMovieService {

  @GET("movie/popular")
  suspend fun getMovieDetails(movieId: Int): TmdbMovieDetailsResponse

}
