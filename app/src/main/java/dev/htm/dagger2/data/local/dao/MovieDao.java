package dev.htm.dagger2.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import dev.htm.dagger2.data.local.entity.MovieEntity;

@Dao
public interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertMovies(List<MovieEntity> movies);

    @Query("SELECT * FROM `MovieEntity`")
    List<MovieEntity> getMovieByPage();
}
