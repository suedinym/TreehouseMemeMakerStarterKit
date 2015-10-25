package com.suedinym.mememakerstarterkit.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import java.util.ArrayList;
import java.util.Date;
/*import com.suedinym.mememakerstarterkit.models.Meme;
import com.suedinym.mememakerstarterkit.models.MemeAnnotation;*/

/**
 * Created by Evan Anger on 8/17/14.
 */
public class MemeDatasource {

    private Context mContext;
    private MemeSQLiteHelper mMemeSqlLiteHelper;

    public MemeDatasource(Context context) {
        mContext = context;
    }
}
