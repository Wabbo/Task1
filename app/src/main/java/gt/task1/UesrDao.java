package gt.task1;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface UesrDao {

    @Query("SELECT * FROM user")
    List<Uesr> getUsers() ;

    @Insert
    void insertAll (Uesr... user ) ;
}
