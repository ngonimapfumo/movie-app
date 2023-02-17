package zw.co.nm.mvvm.data.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import zw.co.nm.mvvm.datamodels.MovieDetails
import java.sql.RowId

interface APIInterface {

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id")id: Int): Single<MovieDetails>

}