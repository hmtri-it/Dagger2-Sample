package dev.htm.dagger2.data.remote.api;

import dev.htm.dagger2.data.remote.model.MovieApiResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MovieApiService {
    @GET("movie/popular?language=en-US&region=US&page=1")
    Observable<MovieApiResponse> fetchMovies();
}
