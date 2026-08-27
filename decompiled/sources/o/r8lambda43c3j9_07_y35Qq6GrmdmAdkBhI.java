package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.datasync.Payload;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.ondevice.datasyncing.DataSyncPayloadType;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DataSyncPayloadStore")
public final class r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI extends migrateBlocklistedListslambda3 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private final Context IconCompatParcelizer;
    private final migrateBlocklistedListlambda1 RatingCompat;
    private final getAnalyticsEnabledEnterannotations read;
    private final getVerticalAccuracy serializer;
    private final parseLonglambda0 write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static ArrayList serializer(r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseWrite = WhereClause.serializer("is_requested").write(1);
        Cursor cursorQuery = sQLiteDatabase.query("data_sync_payloads", null, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer(), null, null, "payload_time ASC", null);
        cursorQuery.getClass();
        return setJsonObject.RemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(cursorQuery, r8lambda43c3j9_07_y35qq6grmdmadkbhi.write);
    }

    public final File IconCompatParcelizer() {
        File file = new File(this.IconCompatParcelizer.getNoBackupFilesDir(), "com.sentiance.sdk/ondevice/data_sync/payloads/");
        file.mkdirs();
        return file;
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI(parseLonglambda0 parselonglambda0, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1) {
        super(context, "sentiance-on-device-data-syncing", 3, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        parselonglambda0.getClass();
        context.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        migrateblocklistedlistlambda1.getClass();
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.getClass();
        this.write = parselonglambda0;
        this.IconCompatParcelizer = context;
        this.read = getanalyticsenabledenterannotations;
        this.serializer = getverticalaccuracy;
        this.RatingCompat = migrateblocklistedlistlambda1;
    }

    public final byte[] IconCompatParcelizer(String str) throws IOException {
        str.getClass();
        File fileSerializer = serializer(str);
        boolean zExists = fileSerializer.exists();
        parseLonglambda0 parselonglambda0 = this.write;
        byte[] bArrRatingCompat = null;
        if (!zExists || !migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer(fileSerializer, parselonglambda0)) {
            parselonglambda0.IconCompatParcelizer("Invalid payload filename found, removing it from the db", new Object[0]);
            serializer(str).delete();
            serializer(new wakeScreenIfAppropriatelambda2(str, 1));
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(fileSerializer);
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                java.util.logging.Logger logger = getResourceIdentifier.read;
                isSdkAuthenticationEnabled issdkauthenticationenabled = new isSdkAuthenticationEnabled(new isPushDeepLinkBackStackActivityEnabled(), gZIPInputStream);
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(issdkauthenticationenabled);
                bArrRatingCompat = r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat();
            } catch (IOException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to read the payload content", new Object[0]);
            }
            fileInputStream.close();
            return bArrRatingCompat;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, th}, i3);
                throw th2;
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        serializer(new wakeScreenIfAppropriatelambda4(2));
        migrateSealedSessionsMapToJsonlambda0.read(IconCompatParcelizer());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        getTriggerId gettriggeridParcelableVolumeInfo = setJsonObject.RemoteActionCompatParcelizer.IconCompatParcelizer().ParcelableVolumeInfo();
        sQLiteDatabase.execSQL(gettriggeridParcelableVolumeInfo.RemoteActionCompatParcelizer());
        Iterator<String> it = gettriggeridParcelableVolumeInfo.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    public final boolean serializer(Payload payload, boolean z) {
        String path;
        payload.getClass();
        parseLonglambda0 parselonglambda0 = this.write;
        try {
            String uuid = payload.getUuid();
            uuid.getClass();
            File fileSerializer = serializer(uuid);
            if (fileSerializer.delete()) {
                parselonglambda0.IconCompatParcelizer("Overwriting payload file " + fileSerializer.getPath(), new Object[0]);
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(fileSerializer), 8192));
            try {
                bufferedOutputStream.write(payload.toByteArray());
                bufferedOutputStream.close();
                bufferedOutputStream.close();
                parselonglambda0.IconCompatParcelizer("Successfully serialized payload " + fileSerializer.getName(), new Object[0]);
                path = fileSerializer.getPath();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedOutputStream, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Exception e) {
            parselonglambda0.RemoteActionCompatParcelizer("Failed to serialize payload: " + e, new Object[0]);
            path = null;
        }
        if (path != null) {
            try {
                return IconCompatParcelizer(payload, z);
            } catch (Exception e2) {
                parselonglambda0.IconCompatParcelizer(false, e2, "Failed to write payload info into the database", new Object[0]);
                this.read.serializer(this.serializer.serializer(e2));
            }
        }
        return false;
    }

    private final boolean IconCompatParcelizer(Payload payload, boolean z) {
        long timestampUtcMilliseconds;
        DataSyncPayloadType dataSyncPayloadType;
        DataSyncPayloadType dataSyncPayloadType2;
        String uuid = payload.getUuid();
        uuid.getClass();
        long timestampUtcMilliseconds2 = payload.getCreationTime().getTimestampUtcMilliseconds();
        int number = payload.getData().getDataTypeCase().getNumber();
        DataSyncPayloadType dataSyncPayloadType3 = DataSyncPayloadType.TRANSPORT_INFO;
        if (number == dataSyncPayloadType3.getValue()) {
            timestampUtcMilliseconds = payload.getData().getTransportInfo().getStart().getTimestampUtcMilliseconds();
        } else if (number == DataSyncPayloadType.SMART_GEOFENCES.getValue()) {
            timestampUtcMilliseconds = payload.getData().getGeofenceEvent().getTime().getTimestampUtcMilliseconds();
        } else if (number == DataSyncPayloadType.OCCUPANT_ROLE_FEEDBACK.getValue()) {
            timestampUtcMilliseconds = payload.getData().getOccupantRoleFeedback().getFeedbackTime().getTimestampUtcMilliseconds();
        } else if (number == DataSyncPayloadType.VEHICLE_CRASH_FEEDBACK.getValue()) {
            timestampUtcMilliseconds = payload.getData().getVehicleCrashDetectionFeedback().getSdkInput().getFeedbackTime().getTimestampUtcMilliseconds();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempting to get the payload time of an unsupported payload.");
            return false;
        }
        DataSyncPayloadType.IconCompatParcelizer iconCompatParcelizer = DataSyncPayloadType.Companion;
        int number2 = payload.getData().getDataTypeCase().getNumber();
        iconCompatParcelizer.getClass();
        if (number2 != 1) {
            if (number2 == 2) {
                dataSyncPayloadType2 = DataSyncPayloadType.SMART_GEOFENCES;
            } else if (number2 == 3) {
                dataSyncPayloadType2 = DataSyncPayloadType.OCCUPANT_ROLE_FEEDBACK;
            } else if (number2 == 4) {
                dataSyncPayloadType2 = DataSyncPayloadType.VEHICLE_CRASH_FEEDBACK;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(number2, "Unknown payload data type: "));
                return false;
            }
            dataSyncPayloadType = dataSyncPayloadType2;
        } else {
            dataSyncPayloadType = dataSyncPayloadType3;
        }
        Object objSerializer = serializer(Boolean.FALSE, new getEnterEvents(new r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw(0L, uuid, timestampUtcMilliseconds2, timestampUtcMilliseconds, dataSyncPayloadType, payload.toByteArray().length, z, "1.8.0", 1, null), 4, this));
        objSerializer.getClass();
        return ((Boolean) objSerializer).booleanValue();
    }

    public static Boolean write(r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw r8lambda8fze8wecod2wkcwbnycfxmvefxw, r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        try {
            sQLiteDatabase.insertWithOnConflict("data_sync_payloads", "", r8lambda8fze8wecod2wkcwbnycfxmvefxw.RemoteActionCompatParcelizer(), 5);
            z = true;
        } catch (Exception e) {
            r8lambda43c3j9_07_y35qq6grmdmadkbhi.write.IconCompatParcelizer(false, e, "Failed to insert new payload info", new Object[0]);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        File databasePath = this.IconCompatParcelizer.getDatabasePath("sentiance-on-device-data-syncing");
        databasePath.getClass();
        return androidx.sqlite.SQLite.read(databasePath, migrateSealedSessionsMapToJsonlambda0.serializer(databasePath), migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer(databasePath), IconCompatParcelizer());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("Upgrading database from version %d to %d", objArr);
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            parselonglambda0.IconCompatParcelizer("Executing SQL statements to bring the version to %d", Integer.valueOf(i));
            setJsonObject.RemoteActionCompatParcelizer.IconCompatParcelizer().write(sQLiteDatabase, i);
        }
    }

    public static ArrayList write(r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, SQLiteDatabase sQLiteDatabase) {
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("data_sync_payloads", null, null, null, null, null, null, null);
        cursorQuery.getClass();
        return setJsonObject.RemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(cursorQuery, r8lambda43c3j9_07_y35qq6grmdmadkbhi.write);
    }

    private final File serializer(String str) {
        return new File(IconCompatParcelizer(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ".gz"));
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this.RatingCompat;
    }

    public final void read(List<String> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            serializer((String) it.next()).delete();
        }
        serializer(new equivalentServerData(2, list));
    }
}
