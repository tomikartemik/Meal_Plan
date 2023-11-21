package com.recepies.dbmodule;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipeDao_Impl implements RecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecipeDbModel> __insertionAdapterOfRecipeDbModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavRecipeById;

  public RecipeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipeDbModel = new EntityInsertionAdapter<RecipeDbModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recipe_db_model` (`id`,`recipeData`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecipeDbModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getRecipeData() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRecipeData());
        }
      }
    };
    this.__preparedStmtOfDeleteFavRecipeById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM recipe_db_model WHERE ? = id";
        return _query;
      }
    };
  }

  @Override
  public Object insertRecipeItem(final RecipeDbModel recipeDbModel,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecipeDbModel.insert(recipeDbModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFavRecipeById(final int id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavRecipeById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFavRecipeById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getRecipes(final Continuation<? super List<RecipeDbModel>> continuation) {
    final String _sql = "SELECT * FROM recipe_db_model";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<RecipeDbModel>>() {
      @Override
      public List<RecipeDbModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRecipeData = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeData");
          final List<RecipeDbModel> _result = new ArrayList<RecipeDbModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecipeDbModel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpRecipeData;
            if (_cursor.isNull(_cursorIndexOfRecipeData)) {
              _tmpRecipeData = null;
            } else {
              _tmpRecipeData = _cursor.getString(_cursorIndexOfRecipeData);
            }
            _item = new RecipeDbModel(_tmpId,_tmpRecipeData);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getRecipe(final int id,
      final Continuation<? super List<RecipeDbModel>> continuation) {
    final String _sql = "SELECT * FROM recipe_db_model WHERE ? = id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<RecipeDbModel>>() {
      @Override
      public List<RecipeDbModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRecipeData = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeData");
          final List<RecipeDbModel> _result = new ArrayList<RecipeDbModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecipeDbModel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpRecipeData;
            if (_cursor.isNull(_cursorIndexOfRecipeData)) {
              _tmpRecipeData = null;
            } else {
              _tmpRecipeData = _cursor.getString(_cursorIndexOfRecipeData);
            }
            _item = new RecipeDbModel(_tmpId,_tmpRecipeData);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
