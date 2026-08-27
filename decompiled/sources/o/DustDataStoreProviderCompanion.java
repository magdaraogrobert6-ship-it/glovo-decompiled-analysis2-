package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.util.Pair;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.BoundingBox;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "VenueTileStore")
public class DustDataStoreProviderCompanion extends migrateBlocklistedListslambda3 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final /* synthetic */ int serializer = 0;
    private final DataStoreProviderm IconCompatParcelizer;
    private final migrateBlocklistedListlambda1 MediaBrowserCompatMediaItem;
    private r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA MediaDescriptionCompat;
    private com.sentiance.sdk.tile.store.k MediaMetadataCompat;
    private final r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ MediaSessionCompatQueueItem;
    private DataStoreProvidero MediaSessionCompatResultReceiverWrapper;
    private r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw MediaSessionCompatToken;
    private SQLiteDatabase RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final parseLonglambda0 write;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public static r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw IconCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, long j, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(j));
        r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite = null;
        try {
            Cursor cursorQuery = sQLiteDatabase.query("tile_info", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
            r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite = cursorQuery.moveToFirst() ? r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw.write(cursorQuery) : null;
            cursorQuery.close();
            return r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite;
        } catch (Exception e) {
            dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to get query count for tileId: %d", Long.valueOf(j));
            return r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite;
        }
    }

    public static void IconCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, BoundingBox boundingBox, ArrayList arrayList, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(java.util.Locale.US, "SELECT * FROM %s WHERE (((MIN(%f, %s) >= MAX(%f, %s)) AND (MIN(%f, %s) >= MAX(%f, %s)) ));", "venue", Double.valueOf(boundingBox.IconCompatParcelizer()), "vertices_max_lon", Double.valueOf(boundingBox.MediaDescriptionCompat()), "vertices_min_lon", Double.valueOf(boundingBox.RemoteActionCompatParcelizer()), "vertices_max_lat", Double.valueOf(boundingBox.read()), "vertices_min_lat"), null);
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    arrayList.add(com.sentiance.sdk.tile.store.k.IconCompatParcelizer(cursorRawQuery).IconCompatParcelizer());
                } catch (IllegalArgumentException e) {
                    e = e;
                    dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to build VenueEntry from cursor", new Object[0]);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
            }
        }
        dustDataStoreProviderCompanion.read.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(((DataStoreProvidern) it.next()).read()));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            final long jLongValue = ((Long) it2.next()).longValue();
            r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw) dustDataStoreProviderCompanion.RemoteActionCompatParcelizer(new FeatureFlagsDataStoreProviderCompanion(dustDataStoreProviderCompanion, jLongValue, 1));
            final Long lValueOf = r8lambda_8vhm_ratewwxuvom3h5y3vqfw == null ? null : Long.valueOf(r8lambda_8vhm_ratewwxuvom3h5y3vqfw.IconCompatParcelizer() + 1);
            dustDataStoreProviderCompanion.serializer(new migrateBlocklistedListslambda1() { // from class: o.migrateEventDuplicationMaplambda0
                @Override // o.migrateBlocklistedListslambda1
                public final void serializer(SQLiteDatabase sQLiteDatabase2) {
                    int i = DustDataStoreProviderCompanion.serializer;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_access", Long.valueOf(jCurrentTimeMillis));
                    Long l = lValueOf;
                    if (l != null) {
                        contentValues.put("query_count", l);
                    }
                    WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(jLongValue));
                    sQLiteDatabase2.update("tile_info", contentValues, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
                }
            });
        }
    }

    public static Boolean RemoteActionCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, String str, long j, SQLiteDatabase sQLiteDatabase) {
        long jInsertWithOnConflict;
        dustDataStoreProviderCompanion.write.IconCompatParcelizer("Start inserting tile: %s", str);
        dustDataStoreProviderCompanion.RatingCompat = sQLiteDatabase;
        sQLiteDatabase.beginTransactionNonExclusive();
        dustDataStoreProviderCompanion.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jInsertWithOnConflict = dustDataStoreProviderCompanion.RatingCompat.insertWithOnConflict("tile_info", "", new r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw(str, jCurrentTimeMillis, 0L, j).MediaBrowserCompatMediaItem(), 4);
        } catch (Exception unused) {
            jInsertWithOnConflict = -1;
        }
        dustDataStoreProviderCompanion.MediaSessionCompatToken = new r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw(jInsertWithOnConflict, str, jCurrentTimeMillis, 0L, Long.valueOf(j));
        return Boolean.valueOf(jInsertWithOnConflict != -1);
    }

    public static r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw RemoteActionCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, String str, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("quad_key").write(str);
        r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite = null;
        try {
            Cursor cursorQuery = sQLiteDatabase.query("tile_info", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
            r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite = cursorQuery.moveToFirst() ? r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw.write(cursorQuery) : null;
            cursorQuery.close();
            return r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite;
        } catch (Exception e) {
            dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to get tile last access time", new Object[0]);
            return r8lambda_8vhm_ratewwxuvom3h5y3vqfwWrite;
        }
    }

    public static /* synthetic */ void serializer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, String str, String str2, r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U r8lambdaxoyqh04ssg9obd1hhrbyn1pj7u) {
        boolean zSerializer = dustDataStoreProviderCompanion.IconCompatParcelizer.serializer(str, str2, dustDataStoreProviderCompanion);
        parseLonglambda0 parselonglambda0 = dustDataStoreProviderCompanion.write;
        if (zSerializer) {
            parselonglambda0.IconCompatParcelizer("New tile loaded, quadKey: %s (parent: %s)", str2, str);
            r8lambdaxoyqh04ssg9obd1hhrbyn1pj7u.RemoteActionCompatParcelizer(str2);
        } else {
            parselonglambda0.RemoteActionCompatParcelizer("Failed to load tile, quadKey: %s (parent: %s)", str2, str);
            r8lambdaxoyqh04ssg9obd1hhrbyn1pj7u.IconCompatParcelizer(str2);
        }
    }

    public final void IconCompatParcelizer(String str, String str2, r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U r8lambdaxoyqh04ssg9obd1hhrbyn1pj7u) {
        synchronized (this.MediaSessionCompatQueueItem) {
            File databasePath = this.RemoteActionCompatParcelizer.getDatabasePath("sentiance-tiles");
            if (databasePath.exists() && databasePath.length() > 31457280) {
                this.write.IconCompatParcelizer("Database size has exceeded the limit", new Object[0]);
                this.MediaSessionCompatQueueItem.IconCompatParcelizer(new migrateEventDuplicationMaplambda1(this));
            }
        }
        r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ r8lambdancrtkbzike7ibl2w13_f5hvgeuq = this.MediaSessionCompatQueueItem;
        r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i = new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(this, str2, str, r8lambdaxoyqh04ssg9obd1hhrbyn1pj7u, 6);
        r8lambdancrtkbzike7ibl2w13_f5hvgeuq.getClass();
        r8lambdancrtkbzike7ibl2w13_f5hvgeuq.read(null, new d0$$ExternalSyntheticLambda0(11, r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i));
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.MediaSessionCompatQueueItem.IconCompatParcelizer(new migrateEventDuplicationMaplambda1(this));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table tile_info (id integer primary key,quad_key text not null unique,last_access integer not null,query_count integer not null,last_modified_time integer);");
        sQLiteDatabase.execSQL("create table venue (id integer primary key,tile_id integer not null,venue_id integer not null unique,latitude real not null,longitude real not null,vertices blob,vertices_min_lat real,vertices_min_lon real,vertices_max_lat real,vertices_max_lon real,FOREIGN KEY(tile_id) REFERENCES tile_info(id) ON DELETE CASCADE);");
        sQLiteDatabase.execSQL("create table tag (id integer primary key,key text not null,value text not null);");
        sQLiteDatabase.execSQL("create table venue_tag (id integer primary key,venue_id integer not null,tag_id integer not null,FOREIGN KEY(venue_id) REFERENCES venue(venue_id) ON DELETE CASCADE,FOREIGN KEY(tag_id) REFERENCES tag(id) ON DELETE CASCADE);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX tag_key_value_index ON tag(key,value)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX venue_id_tag_id_index ON venue_tag(venue_id,tag_id)");
        Iterator<String> it = DataStoreProviderna.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    @runlambda0
    public final List<r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw> read() {
        return (List) this.MediaSessionCompatQueueItem.read(new ArrayList(), new migrateBlocklistedListslambda0() { // from class: o.migrateEventDuplicationMaplambda3
            @Override // o.migrateBlocklistedListslambda0
            public final Object A_() {
                int i = DustDataStoreProviderCompanion.serializer;
                List list = Collections.EMPTY_LIST;
                DustDataStoreProviderCompanion dustDataStoreProviderCompanion = this.serializer;
                return (List) dustDataStoreProviderCompanion.serializer(list, new r8lambdapOm3IvskJ527_ZMLkeDghOZbfzs(dustDataStoreProviderCompanion, 0));
            }
        });
    }

    public static List read(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, long j) {
        int i = 0;
        DataStoreProvidern dataStoreProvidern = (DataStoreProvidern) dustDataStoreProviderCompanion.RemoteActionCompatParcelizer(new FeatureFlagsDataStoreProviderCompanion(dustDataStoreProviderCompanion, j, i));
        if (dataStoreProvidern != null) {
            dustDataStoreProviderCompanion.IconCompatParcelizer(dataStoreProvidern.write(), dataStoreProvidern.serializer());
        }
        return (List) dustDataStoreProviderCompanion.serializer(Collections.EMPTY_LIST, new migrateEventDuplicationMap(dustDataStoreProviderCompanion, j, i));
    }

    public static /* synthetic */ void read(DustDataStoreProviderCompanion dustDataStoreProviderCompanion) {
        parseLonglambda0 parselonglambda0 = dustDataStoreProviderCompanion.write;
        parselonglambda0.IconCompatParcelizer("Deleting the database", new Object[0]);
        SQLiteDatabase sQLiteDatabase = dustDataStoreProviderCompanion.RatingCompat;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && sQLiteDatabase.inTransaction()) {
            parselonglambda0.IconCompatParcelizer("Stopping ongoing tile insert", new Object[0]);
            sQLiteDatabase.endTransaction();
        }
        dustDataStoreProviderCompanion.RatingCompat = null;
        dustDataStoreProviderCompanion.MediaDescriptionCompat = null;
        dustDataStoreProviderCompanion.MediaMetadataCompat = null;
        dustDataStoreProviderCompanion.MediaSessionCompatResultReceiverWrapper = null;
        dustDataStoreProviderCompanion.MediaSessionCompatToken = null;
        dustDataStoreProviderCompanion.close();
        dustDataStoreProviderCompanion.RemoteActionCompatParcelizer.deleteDatabase("sentiance-tiles");
        parselonglambda0.IconCompatParcelizer("Database deleted", new Object[0]);
    }

    public static ArrayList IconCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT t.*  FROM tag AS t LEFT JOIN venue_tag AS vt ON vt.tag_id = t.id WHERE vt.id IS NULL", null);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(DataStoreProvidero.serializer(cursorRawQuery));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Exception e) {
            dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to get unreferenced tags", new Object[0]);
            return arrayList;
        }
    }

    public static /* synthetic */ List RemoteActionCompatParcelizer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, BoundingBox boundingBox, ArrayList arrayList) {
        Pair<Double, Double> pairSerializer = boundingBox.serializer();
        dustDataStoreProviderCompanion.IconCompatParcelizer(((Double) pairSerializer.first).doubleValue(), ((Double) pairSerializer.second).doubleValue());
        return (List) dustDataStoreProviderCompanion.serializer(arrayList, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(dustDataStoreProviderCompanion, boundingBox, arrayList, 0));
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        File databasePath = this.RemoteActionCompatParcelizer.getDatabasePath("sentiance-tiles");
        return Arrays.asList(databasePath, migrateSealedSessionsMapToJsonlambda0.serializer(databasePath), migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer(databasePath));
    }

    public final boolean read(long j, double d, double d2, com.sentiance.sdk.tile.store.c cVar, Map<String, String> map) {
        long jInsertWithOnConflict;
        long jRemoteActionCompatParcelizer;
        SQLiteDatabase sQLiteDatabase = this.RatingCompat;
        parseLonglambda0 parselonglambda0 = this.write;
        if (sQLiteDatabase == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Could not insert venue, null db instance", new Object[0]);
            return false;
        }
        if (!sQLiteDatabase.isOpen() || !this.RatingCompat.inTransaction()) {
            parselonglambda0.RemoteActionCompatParcelizer("Could not insert venue, no DB transaction", new Object[0]);
            return false;
        }
        r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = this.MediaSessionCompatToken;
        if (r8lambda_8vhm_ratewwxuvom3h5y3vqfw == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Could not insert venue, null tileId", new Object[0]);
            return false;
        }
        com.sentiance.sdk.tile.store.k kVar = this.MediaMetadataCompat;
        if (kVar == null) {
            this.MediaMetadataCompat = new com.sentiance.sdk.tile.store.k(j, d, d2, r8lambda_8vhm_ratewwxuvom3h5y3vqfw.write(), cVar);
        } else {
            kVar.read(j, d, d2, r8lambda_8vhm_ratewwxuvom3h5y3vqfw.write(), cVar);
        }
        try {
            jInsertWithOnConflict = this.RatingCompat.insertWithOnConflict("venue", "", this.MediaMetadataCompat.read(), 4);
        } catch (Exception unused) {
            jInsertWithOnConflict = -1;
        }
        if (jInsertWithOnConflict == -1) {
            parselonglambda0.RemoteActionCompatParcelizer("Failed to insert venue: %s", this.MediaMetadataCompat.toString());
            return true;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            DataStoreProvidero dataStoreProvidero = this.MediaSessionCompatResultReceiverWrapper;
            if (dataStoreProvidero == null) {
                this.MediaSessionCompatResultReceiverWrapper = new DataStoreProvidero(entry.getKey(), entry.getValue());
            } else {
                dataStoreProvidero.write(entry.getKey(), entry.getValue());
            }
            SQLiteDatabase sQLiteDatabase2 = this.RatingCompat;
            DataStoreProvidero dataStoreProvidero2 = this.MediaSessionCompatResultReceiverWrapper;
            try {
                jRemoteActionCompatParcelizer = sQLiteDatabase2.insertWithOnConflict(RemoteMessageConst.Notification.TAG, "", dataStoreProvidero2.IconCompatParcelizer(), 4);
            } catch (Exception unused2) {
                jRemoteActionCompatParcelizer = -1;
            }
            if (jRemoteActionCompatParcelizer == -1) {
                WhereClause whereClauseWrite = WhereClause.serializer("key").write(dataStoreProvidero2.write()).IconCompatParcelizer("value").write(dataStoreProvidero2.read());
                try {
                    Cursor cursorQuery = sQLiteDatabase2.query(RemoteMessageConst.Notification.TAG, null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
                    jRemoteActionCompatParcelizer = cursorQuery.moveToFirst() ? DataStoreProvidero.serializer(cursorQuery).RemoteActionCompatParcelizer() : -1L;
                    try {
                        cursorQuery.close();
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    jRemoteActionCompatParcelizer = -1;
                }
            }
            if (jRemoteActionCompatParcelizer != -1) {
                r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA r8lambda38av5n_cfcsm1kv1daekwlbk5wa = this.MediaDescriptionCompat;
                if (r8lambda38av5n_cfcsm1kv1daekwlbk5wa == null) {
                    this.MediaDescriptionCompat = new r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA(j, jRemoteActionCompatParcelizer);
                } else {
                    r8lambda38av5n_cfcsm1kv1daekwlbk5wa.IconCompatParcelizer(j, jRemoteActionCompatParcelizer);
                }
                try {
                    this.RatingCompat.insertWithOnConflict("venue_tag", "", this.MediaDescriptionCompat.read(), 4);
                } catch (Exception unused5) {
                }
            }
        }
        return true;
    }

    public final boolean serializer(String str) {
        return ((Boolean) this.MediaSessionCompatQueueItem.read(Boolean.FALSE, new DataStoreProviderr(this, str))).booleanValue();
    }

    public static DataStoreProvidern serializer(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, long j, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("venue_id").write(Long.valueOf(j));
        DataStoreProvidern dataStoreProvidernIconCompatParcelizer = null;
        try {
            Cursor cursorQuery = sQLiteDatabase.query("venue", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
            dataStoreProvidernIconCompatParcelizer = cursorQuery.moveToFirst() ? com.sentiance.sdk.tile.store.k.IconCompatParcelizer(cursorQuery).IconCompatParcelizer() : null;
            cursorQuery.close();
            return dataStoreProvidernIconCompatParcelizer;
        } catch (Exception e) {
            dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to get venue", new Object[0]);
            return dataStoreProvidernIconCompatParcelizer;
        }
    }

    public static ArrayList write(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, long j, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClause = new WhereClause("id IN ( SELECT tag_id FROM venue_tag WHERE venue_id = ?)", Collections.singletonList(Long.valueOf(j)));
        String str = "SELECT * FROM tag WHERE " + whereClause.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, whereClause.RemoteActionCompatParcelizer());
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(DataStoreProvidero.serializer(cursorRawQuery));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Exception e) {
            dustDataStoreProviderCompanion.write.IconCompatParcelizer(false, e, "Failed to get tags", new Object[0]);
            return arrayList;
        }
    }

    public DustDataStoreProviderCompanion(parseLonglambda0 parselonglambda0, Context context, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, DataStoreProviderm dataStoreProviderm, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1) {
        super(context, "sentiance-tiles", 3, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = context;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = dataStoreProviderm;
        this.MediaBrowserCompatMediaItem = migrateblocklistedlistlambda1;
        this.MediaSessionCompatQueueItem = new r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("Upgrading database from version %d to %d", objArr);
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            parselonglambda0.IconCompatParcelizer("Executing SQL statements to bring the version to %d", Integer.valueOf(i));
            if (i == 2) {
                parselonglambda0.IconCompatParcelizer("Adding column %s to TileInfoTable", "last_modified_time");
                sQLiteDatabase.execSQL("ALTER TABLE tile_info ADD COLUMN last_modified_time integer;");
                ArrayList arrayListIconCompatParcelizer = IconCompatParcelizer(sQLiteDatabase);
                int size = arrayListIconCompatParcelizer.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw) arrayListIconCompatParcelizer.get(size);
                    if (r8lambda_8vhm_ratewwxuvom3h5y3vqfw.RemoteActionCompatParcelizer() == null) {
                        String strSerializer = shutdownAllDataStoresdefault.serializer(r8lambda_8vhm_ratewwxuvom3h5y3vqfw.read(), DataStoreProviderm.write);
                        r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(strSerializer);
                        if (r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer == null) {
                            parselonglambda0.IconCompatParcelizer("Parent tile %s is missing. Skip adding last modified time for tile %s", strSerializer, r8lambda_8vhm_ratewwxuvom3h5y3vqfw.read());
                        } else {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("last_modified_time", Long.valueOf(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer.MediaDescriptionCompat));
                            WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(r8lambda_8vhm_ratewwxuvom3h5y3vqfw.write()));
                            sQLiteDatabase.update("tile_info", contentValues, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
                        }
                    }
                }
            }
            if (i == 3) {
                Iterator<String> it = DataStoreProviderna.read.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(it.next());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList IconCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("tile_info", null, null, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                arrayList.add(r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw.write(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Exception e) {
            this.write.IconCompatParcelizer(false, e, "Failed to get tile last access time", new Object[0]);
            return arrayList;
        }
    }

    private void IconCompatParcelizer(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        List<String> list = shutdownAllDataStoresdefault.read(location, 14);
        r8lambdaazSYf5mskLWIBpDGGDBR2FZwqMA r8lambdaazsyf5msklwibpdggdbr2fzwqma = new r8lambdaazSYf5mskLWIBpDGGDBR2FZwqMA(this);
        for (String str : list) {
            DataStoreProviderr dataStoreProviderr = new DataStoreProviderr(this, str);
            r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ r8lambdancrtkbzike7ibl2w13_f5hvgeuq = this.MediaSessionCompatQueueItem;
            r8lambdancrtkbzike7ibl2w13_f5hvgeuq.getClass();
            r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw) r8lambdancrtkbzike7ibl2w13_f5hvgeuq.read(null, new d0$$ExternalSyntheticLambda0(0, dataStoreProviderr));
            String strSerializer = shutdownAllDataStoresdefault.serializer(str, DataStoreProviderm.write);
            r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(strSerializer);
            if (r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer != null && r8lambda_8vhm_ratewwxuvom3h5y3vqfw != null && (r8lambda_8vhm_ratewwxuvom3h5y3vqfw.RemoteActionCompatParcelizer() == null || r8lambda_8vhm_ratewwxuvom3h5y3vqfw.RemoteActionCompatParcelizer().longValue() != r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer.MediaDescriptionCompat)) {
                parseLonglambda0 parselonglambda0 = this.write;
                parselonglambda0.IconCompatParcelizer("Refreshing tile %s (parent: %s)", str, strSerializer);
                if (((Boolean) serializer(Boolean.FALSE, new r8lambdaFpFJ_R0gncOcexw0o8eIjv2ByS8(str, 1))).booleanValue()) {
                    IconCompatParcelizer(str, strSerializer, r8lambdaazsyf5msklwibpdggdbr2fzwqma);
                } else {
                    parselonglambda0.IconCompatParcelizer("Failed to delete old tile %s", str);
                }
            }
        }
        serializer(new migrateBlocklistedListslambda1() { // from class: o.EventDuplicationValidatorDataStoreProviderCompanionExternalSyntheticLambda1
            @Override // o.migrateBlocklistedListslambda1
            public final void serializer(SQLiteDatabase sQLiteDatabase) {
                int i = DustDataStoreProviderCompanion.serializer;
                List list2 = Collections.EMPTY_LIST;
                DustDataStoreProviderCompanion dustDataStoreProviderCompanion = this.serializer;
                Iterator it = migrateBlocklistedListlambda2.serializer((List) dustDataStoreProviderCompanion.serializer(list2, new r8lambdapOm3IvskJ527_ZMLkeDghOZbfzs(dustDataStoreProviderCompanion, 1))).iterator();
                while (it.hasNext()) {
                    WhereClause whereClause = WhereClause.serializer("id").read((List) it.next());
                    sQLiteDatabase.delete(RemoteMessageConst.Notification.TAG, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer());
                }
            }
        });
    }

    public final List<DataStoreProvidero> read(long j) {
        return (List) this.MediaSessionCompatQueueItem.read(new ArrayList(), new EventDuplicationValidatorDataStoreProviderCompanion(this, j));
    }

    public final List<DataStoreProvidern> read(BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList();
        return (List) this.MediaSessionCompatQueueItem.read(new ArrayList(), new PreviewView$1$$ExternalSyntheticLambda2(this, boundingBox, arrayList, 26));
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.RatingCompat;
        parseLonglambda0 parselonglambda0 = this.write;
        if (sQLiteDatabase == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Could not end insert operation, null db instance", new Object[0]);
            return;
        }
        parselonglambda0.IconCompatParcelizer("Done inserting tile: %s, success: %s", str, Boolean.valueOf(z));
        if (z && this.RatingCompat.inTransaction()) {
            this.RatingCompat.setTransactionSuccessful();
        }
        if (this.RatingCompat.inTransaction()) {
            this.RatingCompat.endTransaction();
        }
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this.MediaBrowserCompatMediaItem;
    }
}
