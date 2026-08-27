package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.tables.Tables;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TimelineStore")
public class setHeaderTextColor extends migrateBlocklistedListslambda3 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final /* synthetic */ int write = 0;
    private final ConfigurationManager IconCompatParcelizer;
    private final migrateBlocklistedListlambda1 MediaSessionCompatQueueItem;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final Context read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;

    private void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, List<getImageStyle> list) {
        String str = "Failed to insert entry %s";
        for (getImageStyle getimagestyle : list) {
            Class<?> cls = getimagestyle.getClass();
            parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
            if (cls == setHeaderTextAlign.class) {
                r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 r8lambda5ta641qk4ejfidaa2z9nuude5e0 = ((setHeaderTextAlign) getimagestyle).read();
                try {
                    if (sQLiteDatabase.insertOrThrow(r8lambda5ta641qk4ejfidaa2z9nuude5e0.write().MediaDescriptionCompat(), "", r8lambda5ta641qk4ejfidaa2z9nuude5e0.RemoteActionCompatParcelizer()) == -1) {
                        parselonglambda0.RemoteActionCompatParcelizer(str, r8lambda5ta641qk4ejfidaa2z9nuude5e0.toString());
                    }
                } catch (SQLException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, str, r8lambda5ta641qk4ejfidaa2z9nuude5e0.toString());
                }
            } else if (getimagestyle.getClass() == setHeader.class) {
                setHeader setheader = (setHeader) getimagestyle;
                WhereClause whereClause = setheader.read();
                r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnys = setheader.IconCompatParcelizer;
                if (sQLiteDatabase.delete(r8lambdarf7yhczztbilw1gecuyccn6jnys.MediaDescriptionCompat(), whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer()) == 0) {
                    parselonglambda0.RemoteActionCompatParcelizer("No entries deleted for table: %s, where: %s", r8lambdarf7yhczztbilw1gecuyccn6jnys, setheader.read());
                }
            } else if (getimagestyle.getClass() == handleLogClicklambda0.class) {
                handleLogClicklambda0 handlelogclicklambda0 = (handleLogClicklambda0) getimagestyle;
                String strMediaDescriptionCompat = handlelogclicklambda0.IconCompatParcelizer.MediaDescriptionCompat();
                ContentValues contentValuesWrite = handlelogclicklambda0.write();
                WhereClause whereClause2 = handlelogclicklambda0.read();
                String str2 = str;
                if (sQLiteDatabase.updateWithOnConflict(strMediaDescriptionCompat, contentValuesWrite, whereClause2.IconCompatParcelizer(), whereClause2.RemoteActionCompatParcelizer(), 5) == 0 && handlelogclicklambda0.IconCompatParcelizer()) {
                    try {
                        if (sQLiteDatabase.insertOrThrow(strMediaDescriptionCompat, "", contentValuesWrite) == -1) {
                            parselonglambda0.RemoteActionCompatParcelizer("Failed to update table: %s, with content %s", strMediaDescriptionCompat, contentValuesWrite);
                        }
                    } catch (SQLException e2) {
                        parselonglambda0.IconCompatParcelizer(false, e2, "Failed to update table: %s, with content %s", strMediaDescriptionCompat, contentValuesWrite);
                    }
                }
                str = str2;
            } else {
                parselonglambda0.RemoteActionCompatParcelizer("Unknown timeline action: %s", getimagestyle);
            }
        }
    }

    public final void IconCompatParcelizer() {
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Cleaning up the timeline store", new Object[0]);
        this.serializer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(this.IconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        for (Tables tables : Tables.values()) {
            r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> table = tables.getTable();
            if (table instanceof isPushPrimer) {
                final isPushPrimer ispushprimer = (isPushPrimer) table;
                final WhereClause whereClause = WhereClause.serializer("event_time").read(Long.valueOf(jCurrentTimeMillis - millis));
                serializer(new migrateBlocklistedListslambda1() { // from class: o.setMessageButtons
                    @Override // o.migrateBlocklistedListslambda1
                    public final void serializer(SQLiteDatabase sQLiteDatabase) {
                        setHeaderTextColor.IconCompatParcelizer(this.read, ispushprimer, whereClause, sQLiteDatabase);
                    }
                });
            }
        }
        ArrayList arrayList = new ArrayList();
        getInAppMessageDarkThemeWrapper getinappmessagedarkthemewrapper = getInAppMessageDarkThemeWrapper.read();
        Iterator it = ((List) serializer(Collections.EMPTY_LIST, new IInAppMessageWithImage(this, 2))).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((setRemoteImageUrl) it.next()).RemoteActionCompatParcelizer));
        }
        int i = 1;
        if (!arrayList.isEmpty()) {
            parselonglambda0.IconCompatParcelizer("Cleaning up active venueIds [%s]", r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", "));
            serializer(new getAnalyticsEnabledEnter(this, Collections.singletonList(getImageStyle.RemoteActionCompatParcelizer(getinappmessagedarkthemewrapper, WhereClause.serializer("venue_id").read(arrayList))), i));
        }
        HashSet hashSet = new HashSet();
        handleLogClicklambda1 handlelogclicklambda1 = handleLogClicklambda1.read();
        Iterator it2 = ((List) serializer(Collections.EMPTY_LIST, new IInAppMessageWithImage(this, i))).iterator();
        while (it2.hasNext()) {
            hashSet.add(getImageStyle.RemoteActionCompatParcelizer(handlelogclicklambda1, WhereClause.serializer("id").write(Long.valueOf(((getAssetsZipRemoteUrl) it2.next()).serializer()))));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        parselonglambda0.IconCompatParcelizer("Cleaning up active tag table, %s", r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(hashSet, ", "));
        serializer(new getAnalyticsEnabledEnter(this, new ArrayList(hashSet), i));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public static /* synthetic */ ArrayList IconCompatParcelizer(setHeaderTextColor setheadertextcolor, long j, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(j));
        return getInAppMessageDarkThemeWrapper.read().IconCompatParcelizer(sQLiteDatabase.query("active_venue", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1"), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList read(setHeaderTextColor setheadertextcolor, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClause = new WhereClause();
        return r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read().IconCompatParcelizer(sQLiteDatabase.query("stationary_venue", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, null, null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public final <T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> T read(isPushPrimer<T> ispushprimer, long j) {
        return (T) RemoteActionCompatParcelizer(new setFrameColor(this, ispushprimer, new WhereClause().IconCompatParcelizer("event_time").read(Long.valueOf(j))));
    }

    public static void IconCompatParcelizer(setHeaderTextColor setheadertextcolor, List list, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                setheadertextcolor.IconCompatParcelizer(sQLiteDatabase, (List<getImageStyle>) list);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (IllegalStateException e) {
                setheadertextcolor.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to add events to database", new Object[0]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void IconCompatParcelizer(setHeaderTextColor setheadertextcolor, isPushPrimer ispushprimer, WhereClause whereClause, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                sQLiteDatabase.delete(ispushprimer.MediaDescriptionCompat(), whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer());
                sQLiteDatabase.setTransactionSuccessful();
            } catch (IllegalStateException e) {
                setheadertextcolor.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to delete entries from timeline table: %s", ispushprimer.MediaDescriptionCompat());
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ ArrayList RemoteActionCompatParcelizer(setHeaderTextColor setheadertextcolor, Integer num, long j, isPushPrimer ispushprimer, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        String string = num.toString();
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("event_time").IconCompatParcelizer(Long.valueOf(j));
        return ispushprimer.IconCompatParcelizer(sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "event_time ASC", string), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList RemoteActionCompatParcelizer(setHeaderTextColor setheadertextcolor, isPushPrimer ispushprimer, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        return ispushprimer.IconCompatParcelizer(sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, null, null, null, null, "event_time asc", null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ _set_durationInMilliseconds_lambda1 RemoteActionCompatParcelizer(setHeaderTextColor setheadertextcolor, String str, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("stationary_id").write(str);
        ArrayList arrayListIconCompatParcelizer = r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read().IconCompatParcelizer(sQLiteDatabase.query("stationary_venue", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, "likelihood desc", "1"), setheadertextcolor.RemoteActionCompatParcelizer);
        if (arrayListIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return (_set_durationInMilliseconds_lambda1) arrayListIconCompatParcelizer.get(0);
    }

    public static /* synthetic */ ArrayList read(setHeaderTextColor setheadertextcolor, String str, r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs r8lambdarf7yhczztbilw1gecuyccn6jnys, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("unique_id").write(str);
        return r8lambdarf7yhczztbilw1gecuyccn6jnys.IconCompatParcelizer(sQLiteDatabase.query(r8lambdarf7yhczztbilw1gecuyccn6jnys.MediaDescriptionCompat(), null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, "unique_id asc", null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList serializer(setHeaderTextColor setheadertextcolor, long j, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("v.id").write(Long.valueOf(j));
        return handleLogClicklambda1.read().IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT t.* FROM active_tag as t INNER JOIN active_venue_tag as vt ON vt.tag_id = t.id INNER JOIN active_venue as v ON vt.venue_id = v.venue_id WHERE " + whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer()), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        serializer(new wakeScreenIfAppropriatelambda4(1));
    }

    public static /* synthetic */ r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE read(setHeaderTextColor setheadertextcolor, isPushPrimer ispushprimer, WhereClause whereClause, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "event_time desc", "1");
        ArrayList arrayListIconCompatParcelizer = ispushprimer.IconCompatParcelizer(cursorQuery, setheadertextcolor.RemoteActionCompatParcelizer);
        cursorQuery.close();
        if (arrayListIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return (r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) arrayListIconCompatParcelizer.get(0);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        File databasePath = this.read.getDatabasePath("sentiance-timelines");
        return Arrays.asList(databasePath, migrateSealedSessionsMapToJsonlambda0.serializer(databasePath));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (Tables tables : Tables.values()) {
            getTriggerId gettriggeridParcelableVolumeInfo = tables.getTable().ParcelableVolumeInfo();
            sQLiteDatabase.execSQL(gettriggeridParcelableVolumeInfo.RemoteActionCompatParcelizer());
            Iterator<String> it = gettriggeridParcelableVolumeInfo.IconCompatParcelizer().iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(it.next());
            }
        }
    }

    public static Long IconCompatParcelizer(setHeaderTextColor setheadertextcolor, SQLiteDatabase sQLiteDatabase) {
        InAppMessageBase inAppMessageBase;
        setheadertextcolor.getClass();
        WhereClause whereClauseWrite = WhereClause.serializer("id").write(1);
        Cursor cursorQuery = sQLiteDatabase.query("common", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, null);
        if (cursorQuery.moveToFirst()) {
            try {
                inAppMessageBase = (InAppMessageBase) handleLogClicklambda2.read().RemoteActionCompatParcelizer(cursorQuery);
            } catch (Exception e) {
                setheadertextcolor.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get Common entry from cursor", new Object[0]);
                inAppMessageBase = null;
            }
            cursorQuery.close();
        } else {
            cursorQuery.close();
            inAppMessageBase = null;
        }
        if (inAppMessageBase == null) {
            return null;
        }
        return inAppMessageBase.serializer;
    }

    public static /* synthetic */ ArrayList IconCompatParcelizer(setHeaderTextColor setheadertextcolor, long j, isPushPrimer ispushprimer, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("id").IconCompatParcelizer(Long.valueOf(j));
        return ispushprimer.IconCompatParcelizer(sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "id asc", null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList IconCompatParcelizer(setHeaderTextColor setheadertextcolor, ArrayList arrayList, WhereClause whereClause, r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs r8lambdarf7yhczztbilw1gecuyccn6jnys, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 50;
            WhereClause whereClause2 = WhereClause.serializer("unique_id").read(arrayList.subList(i, Math.min(arrayList.size(), i2)));
            whereClause2.write(whereClause);
            arrayList2.addAll(r8lambdarf7yhczztbilw1gecuyccn6jnys.IconCompatParcelizer(sQLiteDatabase.query(r8lambdarf7yhczztbilw1gecuyccn6jnys.MediaDescriptionCompat(), null, whereClause2.IconCompatParcelizer(), whereClause2.RemoteActionCompatParcelizer(), null, null, "unique_id asc", null), setheadertextcolor.RemoteActionCompatParcelizer));
            i = i2;
        }
        return arrayList2;
    }

    public static /* synthetic */ ArrayList serializer(setHeaderTextColor setheadertextcolor, int i, boolean z, long j, isPushPrimer ispushprimer, SQLiteDatabase sQLiteDatabase) {
        String str;
        String strValueOf = i > 0 ? String.valueOf(i) : null;
        if (z) {
            str = " desc";
        } else {
            str = " asc";
        }
        String strConcat = "event_time".concat(str);
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("event_time").IconCompatParcelizer(Long.valueOf(j));
        return ispushprimer.IconCompatParcelizer(sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, strConcat, strValueOf), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList serializer(setHeaderTextColor setheadertextcolor, List list, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Integer.valueOf(((VenueSignificance) list.get(i)).value));
        }
        WhereClause whereClauseWrite = WhereClause.serializer("s.venue_significance").read(arrayList).IconCompatParcelizer("t.type").write(Integer.valueOf(TransportChangeType.STATIONARY.value));
        return InAppMessageFull.read().IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT t.*  FROM transport_change as t INNER JOIN stationary_metadata as s ON t.unique_id = s.unique_id WHERE " + whereClauseWrite.IconCompatParcelizer() + " ORDER BY t.event_time ASC", whereClauseWrite.RemoteActionCompatParcelizer()), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static ArrayList write(setHeaderTextColor setheadertextcolor, Integer num, migrateSealedSessionsMapToJsonlambda10 migratesealedsessionsmaptojsonlambda10, isPushPrimer ispushprimer, WhereClause whereClause, SQLiteDatabase sQLiteDatabase) {
        String string = num == null ? null : num.toString();
        migrateSealedSessionsMapToJsonlambda10 migratesealedsessionsmaptojsonlambda10RemoteActionCompatParcelizer = migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "ASC");
        if (migratesealedsessionsmaptojsonlambda10 == null) {
            migratesealedsessionsmaptojsonlambda10 = migratesealedsessionsmaptojsonlambda10RemoteActionCompatParcelizer;
        }
        return ispushprimer.IconCompatParcelizer(sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, migratesealedsessionsmaptojsonlambda10.read(), string), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE write(setHeaderTextColor setheadertextcolor, InAppMessageFull.read readVar, long j, isPushPrimer ispushprimer, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        WhereClause whereClauseIconCompatParcelizer = readVar.IconCompatParcelizer("event_time").IconCompatParcelizer(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query(ispushprimer.MediaDescriptionCompat(), null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "event_time ASC", "1");
        ArrayList arrayListIconCompatParcelizer = ispushprimer.IconCompatParcelizer(cursorQuery, setheadertextcolor.RemoteActionCompatParcelizer);
        cursorQuery.close();
        if (arrayListIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return (r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) arrayListIconCompatParcelizer.get(0);
    }

    public static /* synthetic */ ArrayList serializer(setHeaderTextColor setheadertextcolor, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        return getInAppMessageDarkThemeWrapper.read().IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT v.*  FROM active_venue AS v INNER JOIN active_venue_tag AS vt ON v.venue_id = vt.venue_id LEFT JOIN stationary_venue AS sv ON sv.active_venue_row_id = v.id WHERE sv.id IS NULL", null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public static /* synthetic */ ArrayList write(setHeaderTextColor setheadertextcolor, SQLiteDatabase sQLiteDatabase) {
        setheadertextcolor.getClass();
        return handleLogClicklambda1.read().IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT t.*  FROM active_tag AS t LEFT JOIN active_venue_tag AS vt ON vt.tag_id = t.id WHERE vt.id IS NULL", null), setheadertextcolor.RemoteActionCompatParcelizer);
    }

    public final List<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> read(List<VenueSignificance> list) {
        if (!list.isEmpty()) {
            return (List) serializer(Collections.EMPTY_LIST, new getEnterEvents(this, 3, list));
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Venue significance list is empty", new Object[0]);
        return Collections.EMPTY_LIST;
    }

    public setHeaderTextColor(parseLonglambda0 parselonglambda0, Context context, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1) {
        super(context, "sentiance-timelines", 23, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = context;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = configurationManager;
        this.MediaSessionCompatQueueItem = migrateblocklistedlistlambda1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Upgrading database from version %d to %d", objArr);
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            parselonglambda0.IconCompatParcelizer("Executing SQL statements to bring the version to %d", Integer.valueOf(i));
            for (Tables tables : Tables.values()) {
                tables.getTable().write(sQLiteDatabase, i);
            }
        }
    }

    public final <T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> T serializer(isPushPrimer<T> ispushprimer) {
        return (T) RemoteActionCompatParcelizer(new setFrameColor(this, ispushprimer, new WhereClause()));
    }

    public final List IconCompatParcelizer(final InAppMessageFull inAppMessageFull, final long j, final boolean z, final int i) {
        return (List) serializer(Collections.EMPTY_LIST, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.setImageStyle
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return setHeaderTextColor.serializer(this.IconCompatParcelizer, i, z, j, inAppMessageFull, sQLiteDatabase);
            }
        });
    }

    public final List IconCompatParcelizer(isPushPrimer ispushprimer, long j, long j2, WhereClause whereClause) {
        whereClause.IconCompatParcelizer("event_time").RemoteActionCompatParcelizer(Long.valueOf(j)).IconCompatParcelizer("event_time").write(Long.valueOf(j2));
        return read(ispushprimer, whereClause, (Integer) null, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "ASC"));
    }

    public final <T extends r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY> List<T> IconCompatParcelizer(setInAppMessageDarkThemeWrapper<T> setinappmessagedarkthemewrapper, String str) {
        return (List) serializer(Collections.EMPTY_LIST, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(this, str, setinappmessagedarkthemewrapper, 1));
    }

    public final List serializer(InAppMessageFull inAppMessageFull, String str) {
        return (List) serializer(Collections.EMPTY_LIST, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(this, str, inAppMessageFull, 1));
    }

    public final <T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> List<T> read(final isPushPrimer<T> ispushprimer, final WhereClause whereClause, final Integer num, final migrateSealedSessionsMapToJsonlambda10 migratesealedsessionsmaptojsonlambda10) {
        return (List) serializer(Collections.EMPTY_LIST, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.getLocalImageUrl
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return setHeaderTextColor.write(this.read, num, migratesealedsessionsmaptojsonlambda10, ispushprimer, whereClause, sQLiteDatabase);
            }
        });
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this.MediaSessionCompatQueueItem;
    }
}
