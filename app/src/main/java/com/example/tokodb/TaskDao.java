package com.example.tokodb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task")
    List<com.example.tokodb.Task> getAll();

    @Insert
    void insert(com.example.tokodb.Task task);

    @Delete
    void delete(com.example.tokodb.Task task);

    @Update
    void update(com.example.tokodb.Task task);

}