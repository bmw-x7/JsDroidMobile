package com.jsdroid.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jsdroid.app.entity.Log;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOG".
*/
public class LogDao extends AbstractDao<Log, Long> {

    public static final String TABLENAME = "LOG";

    /**
     * Properties of entity Log.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Type = new Property(1, int.class, "type", false, "TYPE");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property Filename = new Property(3, String.class, "filename", false, "FILENAME");
        public final static Property ClassName = new Property(4, String.class, "className", false, "CLASS_NAME");
        public final static Property MethodName = new Property(5, String.class, "methodName", false, "METHOD_NAME");
        public final static Property LineNumber = new Property(6, int.class, "lineNumber", false, "LINE_NUMBER");
        public final static Property Image = new Property(7, long.class, "image", false, "IMAGE");
        public final static Property Time = new Property(8, long.class, "time", false, "TIME");
    }


    public LogDao(DaoConfig config) {
        super(config);
    }
    
    public LogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TYPE\" INTEGER NOT NULL ," + // 1: type
                "\"CONTENT\" TEXT," + // 2: content
                "\"FILENAME\" TEXT," + // 3: filename
                "\"CLASS_NAME\" TEXT," + // 4: className
                "\"METHOD_NAME\" TEXT," + // 5: methodName
                "\"LINE_NUMBER\" INTEGER NOT NULL ," + // 6: lineNumber
                "\"IMAGE\" INTEGER NOT NULL ," + // 7: image
                "\"TIME\" INTEGER NOT NULL );"); // 8: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Log entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getType());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String filename = entity.getFilename();
        if (filename != null) {
            stmt.bindString(4, filename);
        }
 
        String className = entity.getClassName();
        if (className != null) {
            stmt.bindString(5, className);
        }
 
        String methodName = entity.getMethodName();
        if (methodName != null) {
            stmt.bindString(6, methodName);
        }
        stmt.bindLong(7, entity.getLineNumber());
        stmt.bindLong(8, entity.getImage());
        stmt.bindLong(9, entity.getTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Log entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getType());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String filename = entity.getFilename();
        if (filename != null) {
            stmt.bindString(4, filename);
        }
 
        String className = entity.getClassName();
        if (className != null) {
            stmt.bindString(5, className);
        }
 
        String methodName = entity.getMethodName();
        if (methodName != null) {
            stmt.bindString(6, methodName);
        }
        stmt.bindLong(7, entity.getLineNumber());
        stmt.bindLong(8, entity.getImage());
        stmt.bindLong(9, entity.getTime());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Log readEntity(Cursor cursor, int offset) {
        Log entity = new Log( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // type
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // filename
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // className
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // methodName
            cursor.getInt(offset + 6), // lineNumber
            cursor.getLong(offset + 7), // image
            cursor.getLong(offset + 8) // time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Log entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setType(cursor.getInt(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFilename(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setClassName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMethodName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLineNumber(cursor.getInt(offset + 6));
        entity.setImage(cursor.getLong(offset + 7));
        entity.setTime(cursor.getLong(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Log entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Log entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Log entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
