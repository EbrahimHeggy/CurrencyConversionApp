package com.example.concurrency.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.concurrency.data.remote.model.DataX;
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
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavCurrencyDao_Impl implements FavCurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataX> __insertionAdapterOfDataX;

  private final EntityDeletionOrUpdateAdapter<DataX> __deletionAdapterOfDataX;

  public FavCurrencyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataX = new EntityInsertionAdapter<DataX>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `fav_currencies` (`code`,`imageUrl`,`name`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataX value) {
        if (value.getCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCode());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
    this.__deletionAdapterOfDataX = new EntityDeletionOrUpdateAdapter<DataX>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `fav_currencies` WHERE `code` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataX value) {
        if (value.getCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCode());
        }
      }
    };
  }

  @Override
  public Object insertCurrency(final DataX currency,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDataX.insert(currency);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCurrency(final DataX currency,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDataX.handle(currency);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<DataX>> getAllCurrencies() {
    final String _sql = "SELECT * FROM fav_currencies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"fav_currencies"}, new Callable<List<DataX>>() {
      @Override
      public List<DataX> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<DataX> _result = new ArrayList<DataX>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DataX _item;
            final String _tmpCode;
            if (_cursor.isNull(_cursorIndexOfCode)) {
              _tmpCode = null;
            } else {
              _tmpCode = _cursor.getString(_cursorIndexOfCode);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item = new DataX(_tmpCode,_tmpImageUrl,_tmpName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
