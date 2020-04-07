package dev.htm.dagger2.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import dev.htm.dagger2.data.local.dao.MovieDao;
import dev.htm.dagger2.data.local.entity.MovieEntity;

@Database(entities = {MovieEntity.class}, version = 1,  exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MovieDao movieDao();
}
