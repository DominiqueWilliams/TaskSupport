package com.buildncode.tasksupport.Database;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//TODO: Connect the database and reimplement the client UI
public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME ="tasks.db";
    public static final String TABLE_NAME ="requests";
    public static final String COL_1 ="job_id";
    public static final String COL_2 ="requester";
    public static final String COL_3 ="job_description";
    public static final String COL_4 ="date_time_requester";
    public static final String COL_5 ="location";
    public static final String COL_6 ="urgency";
    public static final String COL_7 ="status";
    public static final String COL_8 ="date_time_completed";
    public static final String COL_9 ="technician";
    public static final String COL_10 ="parts";
    public static final String COL_11 ="solutions";
    public static final String COL_12 ="comments";
    public static final String COL_13 ="contact";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE tasks (job_id INTEGER PRIMARY  KEY AUTOINCREMENT, requester TEXT, job_description TEXT)");
        //TODO: Check to see if I need to add more here
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public long addRequest(String requester, String job_description, String status){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("requester",requester);
        contentValues.put("job_description",job_description);
        contentValues.put("status",status);
        long res = db.insert("tasks",null,contentValues);
        db.close();
        return  res;
    }

    public boolean validRequest(String requester, String job_description){
        String[] columns = { COL_1 };
        SQLiteDatabase db = getReadableDatabase();
        String selection = COL_2 + "=?" + " and " + COL_3 + "=?";
        String[] selectionArgs = { requester, job_description };
        Cursor cursor = db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if(count>0)
            return  true;
        else
            return  false;
    }
}