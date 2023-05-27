package com.zahra.data.api.tmdb

import com.zahra.data.model.VideoId
import com.zahra.data.model.VideoThumbnail
import com.zahra.data.network.TmdbMovieDetailsResponse

fun TmdbMovieDetailsResponse.toVideoThumbnail(): VideoThumbnail =
  VideoThumbnail(
    ids = VideoId(
      trackId =null,
      tmdbId =id,
    ),
    title =title?:"",
    posterUrl = posterPath?:"",
    year =releaseDate?.take(4)?.toInt()?:0,
  )
