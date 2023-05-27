package com.zahra.data.model

data class VideoThumbnail(
  val ids: VideoId,
  val title: String,
  val posterUrl: String,
  val year: Int,
)

data class VideoId(
  val trackId: Int?=null,
  val tmdbId: Int?=null,
)
