package gt.task1;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Uesr.class , version = 1)
public abstract class AppDB extends RoomDatabase {
    public abstract UesrDao dao() ;                              // dy el ...
}
