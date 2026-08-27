package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.SparseArray;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.EventDeserializationException;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "event-store", componentName = "EventStore")
public class getCooldownEnterSeconds extends migrateBlocklistedListslambda3 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q, migrateBlocklistedListlambda1 {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final com.sentiance.sdk.util.c MediaBrowserCompatMediaItem;
    private final Context MediaDescriptionCompat;
    private final r8lambdaydhBfdu4l4me8BDoY5nUwL1ln8k MediaMetadataCompat;
    private final migrateTriggersReeligibilityToJsonlambda4<Long> RatingCompat;
    private final component4android_sdk_base_release read;
    private final getVerticalAccuracy serializer;
    private final parseLonglambda0 write;

    public static class read {
        private final long IconCompatParcelizer;
        private final getVerticalAccuracy MediaBrowserCompatMediaItem;
        private final getCooldownEnterSeconds MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private final int MediaSessionCompatQueueItem;
        private final int RatingCompat;
        private final int RemoteActionCompatParcelizer;
        private final String read;
        private final long serializer;
        private final long write;

        public final int MediaSessionCompatQueueItem() {
            return this.RemoteActionCompatParcelizer;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final int hashCode() {
            return (int) this.serializer;
        }

        public final int read() {
            return this.MediaSessionCompatQueueItem;
        }

        public final int write() {
            return this.RatingCompat;
        }

        public final File IconCompatParcelizer(component4android_sdk_base_release component4android_sdk_base_releaseVar) {
            return new File(component4android_sdk_base_releaseVar.RemoteActionCompatParcelizer(), this.read);
        }

        public final r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU RemoteActionCompatParcelizer(component4android_sdk_base_release component4android_sdk_base_releaseVar) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuA;
            long j = this.serializer;
            int i = this.RemoteActionCompatParcelizer;
            getVerticalAccuracy getverticalaccuracy = this.MediaBrowserCompatMediaItem;
            getCooldownEnterSeconds getcooldownenterseconds = this.MediaDescriptionCompat;
            if (!this.MediaMetadataCompat) {
                return null;
            }
            try {
                r8lambdaqtf70aj7a5o7b4yj33reyelsuA = component4android_sdk_base_release.a(this.MediaSessionCompatQueueItem, new File(component4android_sdk_base_releaseVar.RemoteActionCompatParcelizer(), this.read));
            } catch (EventDeserializationException e) {
                String str = e.getMessage() + " (ingestionTime: " + this.write + "; eventTime: " + this.IconCompatParcelizer + "; type:" + i + ")";
                Throwable cause = e.getCause();
                getcooldownenterseconds.IconCompatParcelizer(getverticalaccuracy.serializer(cause != null ? new EventDeserializationException(str, cause) : new EventDeserializationException(str)));
                r8lambdaqtf70aj7a5o7b4yj33reyelsuA = null;
            }
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuA == null) {
                int i2 = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
                synchronized (getcooldownenterseconds) {
                    getcooldownenterseconds.serializer(new getLatitude(j, 1));
                }
                this.MediaMetadataCompat = false;
            } else {
                getverticalaccuracy.getClass();
                r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite = getVerticalAccuracy.write(r8lambdaqtf70aj7a5o7b4yj33reyelsuA);
                Optional optionalMediaSessionCompatQueueItem = r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite == null ? Optional.MediaSessionCompatQueueItem() : getVerticalAccuracy.IconCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite.getClass());
                if (optionalMediaSessionCompatQueueItem.read() || i != ((Integer) optionalMediaSessionCompatQueueItem.write()).intValue()) {
                    int i3 = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
                    synchronized (getcooldownenterseconds) {
                        getcooldownenterseconds.serializer(new getLatitude(j, 1));
                    }
                    this.MediaMetadataCompat = false;
                    return null;
                }
            }
            return r8lambdaqtf70aj7a5o7b4yj33reyelsuA;
        }

        public read(getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, long j, long j2, long j3, int i, String str, int i2, int i3, boolean z, boolean z2) {
            this.MediaBrowserCompatMediaItem = getverticalaccuracy;
            this.serializer = j;
            this.write = j2;
            this.IconCompatParcelizer = j3;
            this.RemoteActionCompatParcelizer = i;
            this.read = str;
            this.MediaSessionCompatQueueItem = i2;
            this.RatingCompat = i3;
            this.MediaMetadataCompat = z2;
            this.MediaDescriptionCompat = getcooldownenterseconds;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof read) && ((read) obj).serializer == this.serializer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata{mId=");
            sb.append(this.serializer);
            sb.append(", mIngestionTime=");
            sb.append(this.write);
            sb.append(", mEventTime=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mType=");
            return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, '}');
        }

        public final long IconCompatParcelizer() {
            return this.serializer;
        }

        public final long serializer() {
            return this.IconCompatParcelizer;
        }

        public static read serializer(getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, Cursor cursor) throws IllegalArgumentException {
            return new read(getcooldownenterseconds, getverticalaccuracy, cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getLong(cursor.getColumnIndexOrThrow("ingestion_time")), cursor.getLong(cursor.getColumnIndexOrThrow("event_time")), cursor.getInt(cursor.getColumnIndexOrThrow("type")), cursor.getString(cursor.getColumnIndexOrThrow("file")), cursor.getInt(cursor.getColumnIndexOrThrow(MapboxMap.QFE_OFFSET)), cursor.getInt(cursor.getColumnIndexOrThrow("length")), cursor.getInt(cursor.getColumnIndexOrThrow("is_submitted")) == 1, cursor.getInt(cursor.getColumnIndexOrThrow("is_valid")) == 1);
        }
    }

    public static ArrayList IconCompatParcelizer(getCooldownEnterSeconds getcooldownenterseconds, List list, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf((Object) 1);
        WhereClause whereClause = WhereClause.serializer("is_submitted").write(0).IconCompatParcelizer("is_valid").write(1).IconCompatParcelizer("type").read(list);
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "ingestion_time asc", strValueOf);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery));
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final Long IconCompatParcelizer() throws IOException {
        long jLongValue;
        synchronized (this) {
            Long l = this.RatingCompat.read();
            if (l == null) {
                throw new IOException("Failed to create new event id");
            }
            jLongValue = l.longValue() + 1;
            this.RatingCompat.IconCompatParcelizer(Long.valueOf(jLongValue));
        }
        return Long.valueOf(jLongValue);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            this.read.clearData();
            serializer(new equivalentServerData(0, this));
        }
    }

    public final Optional read(Class cls, Long l) {
        return RemoteActionCompatParcelizer(Collections.singletonList(cls), l, true);
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this;
    }

    public static Optional IconCompatParcelizer(getCooldownEnterSeconds getcooldownenterseconds, long j, SQLiteDatabase sQLiteDatabase) {
        read readVarSerializer;
        getVerticalAccuracy getverticalaccuracy = getcooldownenterseconds.serializer;
        getverticalaccuracy.getClass();
        Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(BrazeUser.class);
        if (optionalIconCompatParcelizer.read()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("type").write((Integer) optionalIconCompatParcelizer.write()).IconCompatParcelizer("id").IconCompatParcelizer(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "id asc", "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getverticalaccuracy, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    private properties_delegatelambda00 IconCompatParcelizer(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) throws IOException {
        this.serializer.getClass();
        r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite = getVerticalAccuracy.write(r8lambdaqtf70aj7a5o7b4yj33reyelsu);
        Optional optionalMediaSessionCompatQueueItem = r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite == null ? Optional.MediaSessionCompatQueueItem() : getVerticalAccuracy.IconCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite.getClass());
        if (!optionalMediaSessionCompatQueueItem.read()) {
            return this.read.read(r8lambdaqtf70aj7a5o7b4yj33reyelsu, ((Integer) optionalMediaSessionCompatQueueItem.write()).intValue());
        }
        this.write.RemoteActionCompatParcelizer("Trying to write an event with an improper type", new Object[0]);
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Trying to write an event with an improper type");
        return null;
    }

    public static Optional RemoteActionCompatParcelizer(getCooldownEnterSeconds getcooldownenterseconds, long j, SQLiteDatabase sQLiteDatabase) {
        read readVarSerializer;
        getVerticalAccuracy getverticalaccuracy = getcooldownenterseconds.serializer;
        getverticalaccuracy.getClass();
        Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(BrazeUser.class);
        if (optionalIconCompatParcelizer.read()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        WhereClause whereClause = WhereClause.serializer("type").write((Integer) optionalIconCompatParcelizer.write()).IconCompatParcelizer("id").read(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "id desc", "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getverticalaccuracy, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    public static ArrayList read(getCooldownEnterSeconds getcooldownenterseconds, long j, long j2, List list, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        WhereClause whereClause = WhereClause.serializer("event_time").RemoteActionCompatParcelizer(Long.valueOf(j)).IconCompatParcelizer("event_time").write(Long.valueOf(j2)).IconCompatParcelizer("type").read(getcooldownenterseconds.write(list));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "event_time", null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery));
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void read(getCooldownEnterSeconds getcooldownenterseconds, int i, SQLiteDatabase sQLiteDatabase) {
        while (true) {
            i++;
            getcooldownenterseconds.MediaMetadataCompat.getClass();
            if (i > 3) {
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    continue;
                } else {
                    synchronized (getcooldownenterseconds) {
                        if (serializer("idx_event_store_file_name", sQLiteDatabase)) {
                            sQLiteDatabase.execSQL("CREATE INDEX idx_event_store_file_name on event_metadata (file)");
                        }
                    }
                }
                getcooldownenterseconds.MediaBrowserCompatMediaItem.IconCompatParcelizer(i, "last_indexed_db_version");
            } else {
                synchronized (getcooldownenterseconds) {
                    if (serializer("idx_event_time_type", sQLiteDatabase)) {
                        sQLiteDatabase.execSQL("CREATE INDEX idx_event_time_type on event_metadata(event_time, type)");
                    }
                    if (serializer("idx_ingestion_time_type", sQLiteDatabase)) {
                        sQLiteDatabase.execSQL("CREATE INDEX idx_ingestion_time_type on event_metadata(ingestion_time, type)");
                    }
                    if (serializer("idx_is_submitted_is_valid_type", sQLiteDatabase)) {
                        sQLiteDatabase.execSQL("CREATE INDEX idx_is_submitted_is_valid_type on event_metadata (is_submitted, is_valid, type)");
                    }
                }
            }
            getcooldownenterseconds.write.IconCompatParcelizer("Index(es) added for DB version %d", Integer.valueOf(i));
            getcooldownenterseconds.MediaBrowserCompatMediaItem.IconCompatParcelizer(i, "last_indexed_db_version");
        }
    }

    public static Optional serializer(getCooldownEnterSeconds getcooldownenterseconds, long j, SQLiteDatabase sQLiteDatabase) {
        read readVarSerializer;
        getVerticalAccuracy getverticalaccuracy = getcooldownenterseconds.serializer;
        getverticalaccuracy.getClass();
        Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(BrazeUser.class);
        if (optionalIconCompatParcelizer.read()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("type").write((Integer) optionalIconCompatParcelizer.write()).IconCompatParcelizer("event_time").IconCompatParcelizer(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "id asc", "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getverticalaccuracy, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    public static Optional serializer(getCooldownEnterSeconds getcooldownenterseconds, Long l, boolean z, List list, SQLiteDatabase sQLiteDatabase) {
        read readVarSerializer;
        getcooldownenterseconds.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l == null) {
            l = Long.valueOf(jCurrentTimeMillis);
        }
        String str = z ? "ingestion_time" : "event_time";
        WhereClause whereClause = WhereClause.serializer("type").read(getcooldownenterseconds.write(list)).IconCompatParcelizer(str).read(l);
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, str.concat(" desc"), "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    private ArrayList write(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            this.serializer.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                arrayList.add((Integer) optionalIconCompatParcelizer.write());
            }
        }
        return arrayList;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        this.MediaMetadataCompat.getClass();
        File databasePath = this.MediaDescriptionCompat.getDatabasePath("sentiance");
        return Arrays.asList(databasePath, migrateSealedSessionsMapToJsonlambda0.serializer(databasePath));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table event_metadata (id integer primary key,ingestion_time integer not null,event_time integer not null,type integer not null,file string not null,offset integer not null,length integer not null,is_submitted integer not null default 0,is_valid integer not null default 1);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_ingestion_time_type on event_metadata(ingestion_time, type)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_event_time_type on event_metadata(event_time, type)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_is_submitted_is_valid_type on event_metadata (is_submitted, is_valid, type)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_event_store_file_name on event_metadata (file)");
        this.MediaMetadataCompat.getClass();
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(3, "last_indexed_db_version");
    }

    public static /* synthetic */ void write(getCooldownEnterSeconds getcooldownenterseconds, SQLiteDatabase sQLiteDatabase) {
        int iDelete = sQLiteDatabase.delete("event_metadata", null, null);
        getcooldownenterseconds.RatingCompat.write();
        getcooldownenterseconds.write.IconCompatParcelizer("Reset succeeded. %d events were deleted.", Integer.valueOf(iDelete));
    }

    public final void write() throws SQLException {
        final int iWrite = this.MediaBrowserCompatMediaItem.write("last_indexed_db_version", 1);
        this.MediaMetadataCompat.getClass();
        if (iWrite == 3) {
            return;
        }
        serializer(new migrateBlocklistedListslambda1() { // from class: o.getDistanceFromGeofenceRefresh
            @Override // o.migrateBlocklistedListslambda1
            public final void serializer(SQLiteDatabase sQLiteDatabase) {
                getCooldownEnterSeconds.read(this.read, iWrite, sQLiteDatabase);
            }
        });
    }

    public static ArrayList read(getCooldownEnterSeconds getcooldownenterseconds, boolean z, boolean z2, List list, Long l, Long l2, SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        if (z) {
            str = "ingestion_time";
        } else {
            str = "event_time";
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " ");
        if (z2) {
            str2 = "desc";
        } else {
            str2 = "asc";
        }
        sbM.append(str2);
        String string = sbM.toString();
        WhereClause whereClause = WhereClause.serializer("type").read(getcooldownenterseconds.write(list));
        if (l != null) {
            whereClause.IconCompatParcelizer(str).IconCompatParcelizer(l);
        }
        if (l2 != null) {
            whereClause.IconCompatParcelizer(str).read(l2);
        }
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, string);
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery));
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static Optional write(getCooldownEnterSeconds getcooldownenterseconds, boolean z, List list, long j, SQLiteDatabase sQLiteDatabase) {
        String str;
        read readVarSerializer;
        if (z) {
            str = "event_time";
        } else {
            str = "ingestion_time";
        }
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("type").read(getcooldownenterseconds.write(list)).IconCompatParcelizer(str).IconCompatParcelizer(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "event_time asc, id asc", "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    public final Long RemoteActionCompatParcelizer() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        requestGeofenceRefresh requestgeofencerefresh;
        Optional<read> optionalRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.read() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(this.read)) == null || (requestgeofencerefresh = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addOnPictureInPictureModeChangedListener) == null) {
            return null;
        }
        return requestgeofencerefresh.write;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    public final boolean serializer(Long l) {
        boolean z;
        requestGeofenceRefresh requestgeofencerefresh;
        Long l2;
        Optional<read> optionalRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), l, false);
        if (!optionalRemoteActionCompatParcelizer.read()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(this.read);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null || (requestgeofencerefresh = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addOnPictureInPictureModeChangedListener) == null || (l2 = requestgeofencerefresh.write) == null) {
                z = false;
            } else {
                long jLongValue = l2.longValue();
                this.IconCompatParcelizer.getClass();
                if (jLongValue <= System.currentTimeMillis()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.serializer.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(requestGeofenceRefresh.class);
            if (optionalIconCompatParcelizer.IconCompatParcelizer() && optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem() == ((Integer) optionalIconCompatParcelizer.write()).intValue() && !z) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Long IconCompatParcelizer(getCooldownEnterSeconds getcooldownenterseconds, SQLiteDatabase sQLiteDatabase) {
        long j;
        parseLonglambda0 parselonglambda0 = getcooldownenterseconds.write;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MAX(id) FROM event_metadata", null);
        if (cursorRawQuery.moveToFirst()) {
            j = cursorRawQuery.getLong(0);
            parselonglambda0.IconCompatParcelizer("Last inserted item has ID %d", Long.valueOf(j));
        } else {
            parselonglambda0.IconCompatParcelizer("Cursor for last inserted item is empty", new Object[0]);
            j = 0;
        }
        cursorRawQuery.close();
        return Long.valueOf(j);
    }

    public static ArrayList RemoteActionCompatParcelizer(getCooldownEnterSeconds getcooldownenterseconds, WhereClause whereClause, SQLiteDatabase sQLiteDatabase) {
        getcooldownenterseconds.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "ingestion_time asc", null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery));
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static Optional read(getCooldownEnterSeconds getcooldownenterseconds, long j, SQLiteDatabase sQLiteDatabase) {
        read readVarSerializer;
        getcooldownenterseconds.getClass();
        WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            readVarSerializer = read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery);
        } catch (Exception e) {
            getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            readVarSerializer = null;
        }
        cursorQuery.close();
        return Optional.write(readVarSerializer);
    }

    public static void serializer(getCooldownEnterSeconds getcooldownenterseconds, HashMap map, SQLiteDatabase sQLiteDatabase) {
        getcooldownenterseconds.getClass();
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            getVerticalAccuracy getverticalaccuracy = getcooldownenterseconds.serializer;
            Class cls = (Class) entry.getKey();
            getverticalaccuracy.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                sparseArray.put(((Integer) optionalIconCompatParcelizer.write()).intValue(), (Long) entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, null, null, null, null, "ingestion_time asc", null);
        while (cursorQuery.moveToNext()) {
            try {
                read readVarSerializer = read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery);
                if (sparseArray.get(readVarSerializer.MediaSessionCompatQueueItem()) == null || ((Long) sparseArray.get(readVarSerializer.MediaSessionCompatQueueItem())).longValue() > readVarSerializer.RemoteActionCompatParcelizer()) {
                    arrayList.add(Long.valueOf(readVarSerializer.IconCompatParcelizer()));
                }
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        getcooldownenterseconds.write.IconCompatParcelizer("Cleanup: Deleting %d events", Integer.valueOf(arrayList.size()));
        sQLiteDatabase.beginTransaction();
        Iterator it = migrateBlocklistedListlambda2.serializer(arrayList).iterator();
        while (it.hasNext()) {
            WhereClause whereClause = WhereClause.serializer("id").read((List) it.next());
            sQLiteDatabase.delete("event_metadata", whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer());
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        synchronized (getcooldownenterseconds) {
            File fileRemoteActionCompatParcelizer = getcooldownenterseconds.read.RemoteActionCompatParcelizer();
            ArrayList<File> arrayList2 = new ArrayList();
            if (fileRemoteActionCompatParcelizer.listFiles() != null) {
                arrayList2.addAll(Arrays.asList(fileRemoteActionCompatParcelizer.listFiles()));
            }
            for (File file : arrayList2) {
                WhereClause whereClauseWrite = WhereClause.serializer("file").write(file.getName());
                Cursor cursorQuery2 = sQLiteDatabase.query("event_metadata", new String[]{"id"}, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
                if (cursorQuery2.getCount() == 0) {
                    file.delete();
                }
                cursorQuery2.close();
            }
        }
    }

    public static ArrayList serializer(getCooldownEnterSeconds getcooldownenterseconds, ArrayList arrayList, long j, SQLiteDatabase sQLiteDatabase) {
        getcooldownenterseconds.getClass();
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("type").read(getcooldownenterseconds.write(arrayList)).IconCompatParcelizer("id").IconCompatParcelizer(Long.valueOf(j));
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", null, whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer(), null, null, "id asc");
        ArrayList arrayList2 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                arrayList2.add(read.serializer(getcooldownenterseconds, getcooldownenterseconds.serializer, cursorQuery));
            } catch (Exception e) {
                getcooldownenterseconds.write.IconCompatParcelizer(false, e, "Failed to build metadata from cursor", new Object[0]);
            }
        }
        cursorQuery.close();
        return arrayList2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("Upgrading database from version %d to %d", objArr);
        while (true) {
            i++;
            if (i > i2) {
                return;
            } else {
                parselonglambda0.IconCompatParcelizer("Executing SQL statements to bring the version to %d", Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCooldownEnterSeconds(Context context, r8lambdaydhBfdu4l4me8BDoY5nUwL1ln8k r8lambdaydhbfdu4l4me8bdoy5nuwl1ln8k, parseLonglambda0 parselonglambda0, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, com.sentiance.sdk.util.c cVar, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1) {
        super(context, "sentiance", 3, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        r8lambdaydhbfdu4l4me8bdoy5nuwl1ln8k.getClass();
        this.MediaDescriptionCompat = context;
        this.MediaMetadataCompat = r8lambdaydhbfdu4l4me8bdoy5nuwl1ln8k;
        this.write = parselonglambda0;
        this.read = component4android_sdk_base_releaseVar;
        this.serializer = getverticalaccuracy;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = cVar;
        this.RatingCompat = new setDistanceFromGeofenceRefresh(this);
    }

    private void RemoteActionCompatParcelizer(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) throws IOException {
        synchronized (this) {
            this.IconCompatParcelizer.getClass();
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.serializer = Long.valueOf(System.currentTimeMillis());
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.RemoteActionCompatParcelizer = IconCompatParcelizer();
        }
    }

    private long RemoteActionCompatParcelizer(ContentValues contentValues) throws SQLException {
        long jLongValue;
        synchronized (this) {
            jLongValue = ((Long) serializer(-1L, new getAnalyticsEnabledExit(0, contentValues))).longValue();
        }
        return jLongValue;
    }

    public final void IconCompatParcelizer(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) {
        try {
            RemoteActionCompatParcelizer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
            read(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer());
        } catch (IOException e) {
            this.write.IconCompatParcelizer(false, e, "Failed to save event", new Object[0]);
        }
    }

    public final long read(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) {
        long jRemoteActionCompatParcelizer;
        synchronized (this) {
            try {
                ContentValues contentValuesSerializer = serializer(r8lambdaqtf70aj7a5o7b4yj33reyelsu, IconCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsu));
                try {
                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(contentValuesSerializer);
                } catch (SQLException e) {
                    serializer(e, r8lambdaqtf70aj7a5o7b4yj33reyelsu.MediaSessionCompatQueueItem, contentValuesSerializer);
                    return -1L;
                }
            } catch (IOException e2) {
                this.write.IconCompatParcelizer(false, e2, "Failed to write event to file", new Object[0]);
                return -1L;
            }
        }
        return jRemoteActionCompatParcelizer;
    }

    public final Optional<read> IconCompatParcelizer(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, Long l) {
        return RemoteActionCompatParcelizer(Collections.singletonList(cls), l, false);
    }

    public final Optional<read> RemoteActionCompatParcelizer(final List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list, final Long l, final boolean z) {
        return (Optional) serializer(Optional.MediaSessionCompatQueueItem(), (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<Optional>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.FeatureFlag
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return getCooldownEnterSeconds.serializer(this.read, l, z, list, sQLiteDatabase);
            }
        });
    }

    public final Optional write(long j, PushMaxDataStoreProviderCompanion pushMaxDataStoreProviderCompanion) {
        Optional optionalWrite;
        do {
            optionalWrite = write(j, Collections.singletonList(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class), false);
            if (optionalWrite.IconCompatParcelizer()) {
                j = ((read) optionalWrite.write()).RemoteActionCompatParcelizer();
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((read) optionalWrite.write()).RemoteActionCompatParcelizer(this.read);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && pushMaxDataStoreProviderCompanion.read(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer)) {
                    return Optional.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
                }
            }
        } while (optionalWrite.IconCompatParcelizer());
        return Optional.MediaSessionCompatQueueItem();
    }

    public final Optional<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> RemoteActionCompatParcelizer(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, Long l, PushMaxDataStoreProviderCompanion<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> pushMaxDataStoreProviderCompanion) {
        Optional<read> optionalIconCompatParcelizer;
        do {
            optionalIconCompatParcelizer = IconCompatParcelizer(cls, l);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                l = Long.valueOf(optionalIconCompatParcelizer.write().serializer());
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(this.read);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && pushMaxDataStoreProviderCompanion.read(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer)) {
                    return Optional.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
                }
            }
        } while (optionalIconCompatParcelizer.IconCompatParcelizer());
        return Optional.MediaSessionCompatQueueItem();
    }

    public final List<read> RemoteActionCompatParcelizer(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, Long l, Long l2, boolean z, boolean z2) {
        return write(Collections.singletonList(cls), l, l2, z, z2);
    }

    public final List<read> write(final List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list, final Long l, final Long l2, final boolean z, final boolean z2) {
        return (List) serializer(Collections.EMPTY_LIST, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.getLongitude
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return getCooldownEnterSeconds.read(this.read, z, z2, list, l, l2, sQLiteDatabase);
            }
        });
    }

    private static boolean serializer(String str, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("type").write("index").IconCompatParcelizer("name").write(str);
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 'index' FROM sqlite_master WHERE " + whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
        boolean z = cursorRawQuery.getCount() <= 0;
        cursorRawQuery.close();
        return z;
    }

    public final Optional write(final long j, final List list, final boolean z) {
        return (Optional) serializer(Optional.MediaSessionCompatQueueItem(), (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<Optional>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.getRadiusMeter
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return getCooldownEnterSeconds.write(this.serializer, z, list, j, sQLiteDatabase);
            }
        });
    }

    private static ContentValues serializer(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu, properties_delegatelambda00 properties_delegatelambda00Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ingestion_time", r8lambdaqtf70aj7a5o7b4yj33reyelsu.write);
        contentValues.put("event_time", r8lambdaqtf70aj7a5o7b4yj33reyelsu.RemoteActionCompatParcelizer);
        contentValues.put("type", Integer.valueOf(properties_delegatelambda00Var.IconCompatParcelizer()));
        contentValues.put("file", properties_delegatelambda00Var.serializer());
        contentValues.put(MapboxMap.QFE_OFFSET, Integer.valueOf(properties_delegatelambda00Var.read()));
        contentValues.put("length", Integer.valueOf(properties_delegatelambda00Var.RemoteActionCompatParcelizer()));
        contentValues.put("id", r8lambdaqtf70aj7a5o7b4yj33reyelsu.MediaSessionCompatQueueItem);
        return contentValues;
    }

    public final void serializer(SQLException sQLException, Long l, ContentValues contentValues) {
        String str;
        if (l == null) {
            str = "";
        } else {
            str = "event with ID " + l + " ";
        }
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer(false, sQLException, "Error inserting " + str + contentValues, new Object[0]);
        String stackTraceString = Log.getStackTraceString(sQLException);
        this.IconCompatParcelizer.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer = this.serializer.serializer(System.currentTimeMillis(), stackTraceString);
        try {
            RemoteActionCompatParcelizer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer);
            getWritableDatabase().insertOrThrow("event_metadata", "", serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer.IconCompatParcelizer(), IconCompatParcelizer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer.IconCompatParcelizer())));
        } catch (SQLException | IOException unused) {
            parselonglambda0.IconCompatParcelizer(false, sQLException, "Failed to save exception event", new Object[0]);
        }
    }
}
