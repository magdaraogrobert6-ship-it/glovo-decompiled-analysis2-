package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.tile.store.ZippedTileStore$deleteTileInfo$1;
import com.sentiance.sdk.tile.store.ZippedTileStore$insertOrUpdateTileInfo$1;
import com.sentiance.sdk.tile.store.ZippedTileStore$removeNotRecentlyUsedTiles$1;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.DataStoreProvideri;
import o.DataStoreProviderq;
import o.createFromParcel;
import o.getLongitudeannotations;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataStoreProvideri<Entry extends DataStoreProviderq> extends migrateBlocklistedListslambda3 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    private static final long serializer;
    private final getAnalyticsEnabledEnterannotations MediaBrowserCompatMediaItem;
    private final migrateBlocklistedListlambda1 MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private volatile String ParcelableVolumeInfo;
    private final getVerticalAccuracy PlaybackStateCompat;
    private final getConversationReplyPersonId PlaybackStateCompatCustomAction;
    private final Context RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final String read;
    private final com.sentiance.sdk.util.c write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract String IconCompatParcelizer();

    public abstract DataStoreProviderp MediaMetadataCompat();

    public void ParcelableVolumeInfo() {
        com.sentiance.sdk.util.c cVar = this.write;
        int iWrite = cVar.write("tile_schema_ver", -1);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        Object[] objArr = {Integer.valueOf(iWrite), Integer.valueOf(iRemoteActionCompatParcelizer)};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Cached schema version: %d, current version: %d", objArr);
        if (iWrite != iRemoteActionCompatParcelizer) {
            parselonglambda0.IconCompatParcelizer("Tile schema changed, clear all zipped tiles", new Object[0]);
            clearData();
        }
        cVar.IconCompatParcelizer(RemoteActionCompatParcelizer(), "tile_schema_ver");
        Iterator<Entry> it = MediaSessionCompatToken().iterator();
        while (it.hasNext()) {
            String str = it.next().RemoteActionCompatParcelizer;
            if (!write(str).exists()) {
                parselonglambda0.IconCompatParcelizer("Removing orphaned tile info %s", str);
                serializer(new r8lambdaKH9vRXTMEq4ZTY2kc6sK3fk11U(new ZippedTileStore$deleteTileInfo$1(this, str)));
            }
        }
        MediaDescriptionCompat();
    }

    public abstract String RatingCompat();

    public abstract int RemoteActionCompatParcelizer();

    public final void RemoteActionCompatParcelizer(String str) {
        this.ParcelableVolumeInfo = str;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    public abstract String read();

    public abstract long write();

    public abstract Entry write(Cursor cursor);

    public abstract Entry write(String str, long j, long j2, long j3);

    private final void MediaDescriptionCompat() {
        this.MediaSessionCompatQueueItem.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis() - serializer;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Removing tiles that are not used since %s", com.sentiance.sdk.util.x.c(jCurrentTimeMillis));
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) serializer(instance_delegatelambda0.write, new SessionStorageDataStoreProviderCompanion(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.sentiance.sdk.tile.store.ZippedTileStore$tilesNotUsedSince$1
            final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.getClass();
                this.this$0.MediaMetadataCompat().getClass();
                WhereClause whereClause = WhereClause.serializer("last_access_time").read(Long.valueOf(jCurrentTimeMillis));
                try {
                    Cursor cursorQuery = sQLiteDatabase.query(this.this$0.MediaMetadataCompat().read(), null, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, null, null);
                    cursorQuery.getClass();
                    return DataStoreProvideri.read(this.this$0, cursorQuery);
                } catch (Exception e) {
                    ((DataStoreProvideri) this.this$0).RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get not recently used tiles", new Object[0]);
                    return instance_delegatelambda0.write;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        })));
        final ZippedTileStore$removeNotRecentlyUsedTiles$1 zippedTileStore$removeNotRecentlyUsedTiles$1 = new ZippedTileStore$removeNotRecentlyUsedTiles$1(read(MediaSessionCompatToken()));
        arrayListIconCompatParcelizer.removeIf(new Predicate() { // from class: o.r8lambdaHCS4UPa_SjpHdiFoT4ZBwa8ZSSQ
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = DataStoreProvideri.IconCompatParcelizer;
                return ((Boolean) ((ZippedTileStore$removeNotRecentlyUsedTiles$1) zippedTileStore$removeNotRecentlyUsedTiles$1).invoke(obj)).booleanValue();
            }
        });
        Iterator it = arrayListIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            read((DataStoreProviderq) it.next());
        }
    }

    public final File MediaBrowserCompatMediaItem() {
        File file = new File(this.RatingCompat.getNoBackupFilesDir(), read());
        file.mkdirs();
        return new File(file, "zipped_tile.part");
    }

    public final List<Entry> MediaSessionCompatToken() {
        return (List) serializer(instance_delegatelambda0.write, new SessionStorageDataStoreProviderCompanion(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.sentiance.sdk.tile.store.ZippedTileStore$allTileInfoLRU$1
            final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.getClass();
                try {
                    String str = this.this$0.MediaMetadataCompat().read();
                    this.this$0.MediaMetadataCompat().getClass();
                    Cursor cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, "last_access_time ASC", null);
                    cursorQuery.getClass();
                    return DataStoreProvideri.read(this.this$0, cursorQuery);
                } catch (Exception e) {
                    ((DataStoreProvideri) this.this$0).RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get tiles", new Object[0]);
                    return instance_delegatelambda0.write;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        }));
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.read();
        migrateSealedSessionsMapToJsonlambda0.read(MediaSessionCompatQueueItem());
        String str = read();
        Context context = this.RatingCompat;
        File file = new File(context.getNoBackupFilesDir(), str);
        file.mkdirs();
        migrateSealedSessionsMapToJsonlambda0.read(file);
        close();
        context.deleteDatabase(this.read);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return new LinkedHashMap(SimpleItemTouchHelperCallback.serializer);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        String str = this.read;
        Context context = this.RatingCompat;
        File databasePath = context.getDatabasePath(str);
        databasePath.getClass();
        File fileSerializer = migrateSealedSessionsMapToJsonlambda0.serializer(databasePath);
        File fileRemoteActionCompatParcelizer = migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer(databasePath);
        File fileMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        File file = new File(context.getNoBackupFilesDir(), read());
        file.mkdirs();
        return androidx.sqlite.SQLite.read(databasePath, fileSerializer, fileRemoteActionCompatParcelizer, fileMediaSessionCompatQueueItem, file);
    }

    public final File write(String str) {
        return new File(MediaSessionCompatQueueItem(), str.concat(".zip"));
    }

    static {
        new read(null);
        serializer = 1209600000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProvideri(String str, int i, com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getVerticalAccuracy getverticalaccuracy, getConversationReplyPersonId getconversationreplypersonid) {
        super(context, str, i, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        str.getClass();
        cVar.getClass();
        parselonglambda0.getClass();
        context.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.getClass();
        migrateblocklistedlistlambda1.getClass();
        getverticalaccuracy.getClass();
        getconversationreplypersonid.getClass();
        this.read = str;
        this.write = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.RatingCompat = context;
        this.MediaBrowserCompatMediaItem = getanalyticsenabledenterannotations;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = migrateblocklistedlistlambda1;
        this.PlaybackStateCompat = getverticalaccuracy;
        this.PlaybackStateCompatCustomAction = getconversationreplypersonid;
    }

    public final void RatingCompat(String str) {
        str.getClass();
        DataStoreProviderq dataStoreProviderqIconCompatParcelizer = IconCompatParcelizer(str);
        if (dataStoreProviderqIconCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Cannot update tile's last access time. Tile does not exist", new Object[0]);
            return;
        }
        this.MediaSessionCompatQueueItem.getClass();
        dataStoreProviderqIconCompatParcelizer.RatingCompat = System.currentTimeMillis();
        synchronized (this) {
            serializer(new r8lambdaKH9vRXTMEq4ZTY2kc6sK3fk11U(new ZippedTileStore$insertOrUpdateTileInfo$1(this, dataStoreProviderqIconCompatParcelizer)));
        }
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        th.getClass();
        if (th instanceof OutOfMemoryError) {
            return;
        }
        this.PlaybackStateCompatCustomAction.getClass();
        String stackTraceString = Log.getStackTraceString(th);
        stackTraceString.getClass();
        int iHashCode = stackTraceString.hashCode();
        com.sentiance.sdk.util.c cVar = this.write;
        boolean z = iHashCode != cVar.write("last_reported_tile_parsing_exception_hash", -1);
        long jIconCompatParcelizer = cVar.IconCompatParcelizer("last_reported_tile_parsing_exception_date", 0L);
        this.MediaSessionCompatQueueItem.getClass();
        boolean z2 = jIconCompatParcelizer < System.currentTimeMillis() - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
        if (z || z2) {
            cVar.IconCompatParcelizer(iHashCode, "last_reported_tile_parsing_exception_hash");
            cVar.read(System.currentTimeMillis(), "last_reported_tile_parsing_exception_date");
            this.MediaBrowserCompatMediaItem.serializer(this.PlaybackStateCompat.serializer(th));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("create table " + MediaMetadataCompat().read() + " (id integer primary key,quad_key text not null unique,download_time integer not null,last_access_time integer not null,last_modified_time integer not null);");
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(MediaSessionCompatQueueItem()) > write();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final boolean read(String str) {
        return write(str).exists() && IconCompatParcelizer(str) != null;
    }

    public final Entry IconCompatParcelizer(final String str) {
        str.getClass();
        return (Entry) RemoteActionCompatParcelizer(new r8lambdag5AyHN8nEzSPEldb8lkQuzQNCM(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.sentiance.sdk.tile.store.ZippedTileStore$getTileInfo$1
            final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.getClass();
                try {
                    this.this$0.MediaMetadataCompat().getClass();
                    WhereClause whereClauseWrite = WhereClause.serializer("quad_key").write(str);
                    Cursor cursorQuery = sQLiteDatabase.query(this.this$0.MediaMetadataCompat().read(), null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, null, "1");
                    cursorQuery.getClass();
                    return (DataStoreProviderq) onContentCardDismissed.MediaMetadataCompat((List) DataStoreProvideri.read(this.this$0, cursorQuery));
                } catch (Exception e) {
                    ((DataStoreProvideri) this.this$0).RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get tiles", new Object[0]);
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        }));
    }

    public final void PlaybackStateCompatCustomAction() {
        boolean zMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (!zMediaSessionCompatResultReceiverWrapper) {
            parselonglambda0.IconCompatParcelizer("No tiles to cleanup, store size not exceeded", new Object[0]);
            return;
        }
        parselonglambda0.IconCompatParcelizer("Cleaning up not recently used tiles to ensure store size is below limit", new Object[0]);
        MediaDescriptionCompat();
        if (!MediaSessionCompatResultReceiverWrapper()) {
            parselonglambda0.IconCompatParcelizer("After cleaning up recently unused tiles, the store size is now below the limit", new Object[0]);
            return;
        }
        parselonglambda0.IconCompatParcelizer("Cleaning up old tiles", new Object[0]);
        List<Entry> listMediaSessionCompatToken = MediaSessionCompatToken();
        Set<String> set = read(listMediaSessionCompatToken);
        for (Entry entry : listMediaSessionCompatToken) {
            if (set.contains(entry.RemoteActionCompatParcelizer)) {
                parselonglambda0.IconCompatParcelizer("Keeping tile %s during cleanup", entry.RemoteActionCompatParcelizer);
            } else {
                this.MediaSessionCompatQueueItem.getClass();
                if (System.currentTimeMillis() < entry.write + 300000) {
                    continue;
                } else {
                    read(entry);
                    if (!MediaSessionCompatResultReceiverWrapper()) {
                        return;
                    }
                }
            }
        }
    }

    public final File MediaSessionCompatQueueItem() {
        File file = new File(this.RatingCompat.getNoBackupFilesDir(), RatingCompat());
        file.mkdirs();
        return file;
    }

    public final void PlaybackStateCompat() {
        File file = new File(this.RatingCompat.getNoBackupFilesDir(), read());
        file.mkdirs();
        migrateSealedSessionsMapToJsonlambda0.read(file);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        getEnterEventsannotations.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, addBannerViewMonitor.class, this.MediaMetadataCompat, IconCompatParcelizer(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.sentiance.sdk.tile.store.ZippedTileStore$subscribe$1
            final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((getLongitudeannotations) obj).getClass();
                this.this$0.ParcelableVolumeInfo();
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
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

    public static final ArrayList read(DataStoreProvideri dataStoreProvideri, Cursor cursor) {
        dataStoreProvideri.getClass();
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            DataStoreProviderq dataStoreProviderqWrite = dataStoreProvideri.write(cursor);
            if (dataStoreProviderqWrite != null) {
                arrayList.add(dataStoreProviderqWrite);
            }
        }
        cursor.close();
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(long j, String str, long j2) {
        str.getClass();
        DataStoreProviderq dataStoreProviderqIconCompatParcelizer = IconCompatParcelizer(str);
        if (dataStoreProviderqIconCompatParcelizer == null) {
            dataStoreProviderqIconCompatParcelizer = write(str, j, j, j2);
        } else {
            dataStoreProviderqIconCompatParcelizer.write = j;
            dataStoreProviderqIconCompatParcelizer.MediaDescriptionCompat = j2;
        }
        synchronized (this) {
            serializer(new r8lambdaKH9vRXTMEq4ZTY2kc6sK3fk11U(new ZippedTileStore$insertOrUpdateTileInfo$1(this, dataStoreProviderqIconCompatParcelizer)));
        }
    }

    public Set<String> read(List<? extends Entry> list) {
        list.getClass();
        String str = this.ParcelableVolumeInfo;
        return str != null ? RangesKt.write((Object) str) : ItemTouchHelperAdapter.serializer;
    }

    private final void read(DataStoreProviderq dataStoreProviderq) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Deleting tile %s", dataStoreProviderq.RemoteActionCompatParcelizer);
        String str = dataStoreProviderq.RemoteActionCompatParcelizer;
        serializer(new r8lambdaKH9vRXTMEq4ZTY2kc6sK3fk11U(new ZippedTileStore$deleteTileInfo$1(this, str)));
        File fileWrite = write(str);
        if (fileWrite.exists()) {
            fileWrite.delete();
        }
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this.MediaDescriptionCompat;
    }
}
