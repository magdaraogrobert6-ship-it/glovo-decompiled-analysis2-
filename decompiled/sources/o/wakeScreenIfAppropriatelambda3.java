package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PayloadStore")
public class wakeScreenIfAppropriatelambda3 extends migrateBlocklistedListslambda3 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final /* synthetic */ int read = 0;
    private final Context IconCompatParcelizer;
    private final File MediaBrowserCompatMediaItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaDescriptionCompat;
    private final setSummaryTextIfPresentAndSupportedlambda0 MediaMetadataCompat;
    private final migrateBlocklistedListlambda1 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final getVerticalAccuracy serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    public static class serializer {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompatMediaItem;
        public final long MediaMetadataCompat;
        public final String MediaSessionCompatQueueItem;
        public long RatingCompat;
        public final long RemoteActionCompatParcelizer;
        public final int read;
        public final int serializer;
        public final String write;

        public final String toString() {
            return this.IconCompatParcelizer;
        }

        public final int hashCode() {
            int iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write);
            int i = this.read;
            String str = this.MediaBrowserCompatMediaItem;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaSessionCompatQueueItem;
            return ((((iM + i) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public serializer(long j, String str, String str2, int i, int i2, String str3, long j2, long j3, String str4, isValidNotificationVisibility isvalidnotificationvisibility) {
            this.RatingCompat = j;
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.serializer = i;
            this.read = i2;
            this.MediaSessionCompatQueueItem = str3;
            this.RemoteActionCompatParcelizer = j2;
            this.MediaMetadataCompat = j3;
            this.MediaBrowserCompatMediaItem = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                serializer serializerVar = (serializer) obj;
                if (this.read != serializerVar.read || !this.IconCompatParcelizer.equals(serializerVar.IconCompatParcelizer) || !this.write.equals(serializerVar.write)) {
                    return false;
                }
                String str = serializerVar.MediaBrowserCompatMediaItem;
                String str2 = this.MediaBrowserCompatMediaItem;
                if (str2 == null ? str != null : !str2.equals(str)) {
                    return false;
                }
                String str3 = serializerVar.MediaSessionCompatQueueItem;
                String str4 = this.MediaSessionCompatQueueItem;
                if (str4 != null) {
                    return str4.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    private File write(String str) {
        File file = new File(this.MediaBrowserCompatMediaItem, str);
        if (file.exists()) {
            return file;
        }
        return new File(this.MediaBrowserCompatMediaItem, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ".gz"));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    public static serializer write(wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release, String str, long j, isValidNotificationVisibility isvalidnotificationvisibility, SQLiteDatabase sQLiteDatabase) {
        Optional optionalMediaSessionCompatQueueItem;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = wakescreenifappropriatelambda3.write;
        parseLonglambda0 parselonglambda0 = wakescreenifappropriatelambda3.RemoteActionCompatParcelizer;
        List list = getcustomlocationprovidernamesandroid_sdk_base_release.IconCompatParcelizer;
        if (list.isEmpty()) {
            parselonglambda0.write("Payloads doesn't have any facts, cannot insert into db", new Object[0]);
            return null;
        }
        setsoundifpresentandsupportedlambda1.getClass();
        Optional optionalIconCompatParcelizer = setSoundIfPresentAndSupportedlambda1.IconCompatParcelizer(getcustomlocationprovidernamesandroid_sdk_base_release);
        if (optionalIconCompatParcelizer.read()) {
            parselonglambda0.write("Payload doesn't have a fact type, cannot insert into db", new Object[0]);
            return null;
        }
        String str2 = (String) optionalIconCompatParcelizer.write();
        int iIntValue = ((incrementCustomUserAttributedefault) list.get(0)).IconCompatParcelizer.serializer.intValue();
        incrementCustomUserAttributedefault incrementcustomuserattributedefault = (incrementCustomUserAttributedefault) list.get(0);
        if (incrementcustomuserattributedefault == null) {
            optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
        } else {
            setDefaultNotificationAccentColorandroid_sdk_base_release setdefaultnotificationaccentcolorandroid_sdk_base_release = incrementcustomuserattributedefault.write.RemoteActionCompatParcelizer.read;
            getBadNetworkIntervalandroid_sdk_base_release getbadnetworkintervalandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.read;
            if (getbadnetworkintervalandroid_sdk_base_release != null) {
                optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(getbadnetworkintervalandroid_sdk_base_release.IconCompatParcelizer);
            } else {
                setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.serializer;
                if (setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release != null) {
                    optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release.IconCompatParcelizer);
                } else {
                    setGender setgender = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaMetadataCompat;
                    if (setgender != null) {
                        optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(setgender.read);
                    } else {
                        IBrazeExternalSyntheticBUOutline0 iBrazeExternalSyntheticBUOutline0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaDescriptionCompat;
                        if (iBrazeExternalSyntheticBUOutline0 != null) {
                            optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(iBrazeExternalSyntheticBUOutline0.serializer);
                        } else if (setdefaultnotificationaccentcolorandroid_sdk_base_release.RemoteActionCompatParcelizer == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.write == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaBrowserCompatMediaItem == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.ParcelableVolumeInfo == null) {
                            setEmail setemail = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            if (setemail != null) {
                                optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(setemail.IconCompatParcelizer);
                            } else if (setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.ComponentActivity == null && setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
                                optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                            } else {
                                optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                            }
                        } else {
                            optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                        }
                    }
                }
            }
        }
        String str3 = (String) optionalMediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        wakescreenifappropriatelambda3.MediaDescriptionCompat.getClass();
        serializer serializerVar = new serializer(-1L, str, str2, 0, iIntValue, str3, System.currentTimeMillis(), j, "0.15.0", isvalidnotificationvisibility);
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", serializerVar.IconCompatParcelizer);
        contentValues.put("type", serializerVar.write);
        contentValues.put("retry_count", Integer.valueOf(serializerVar.serializer));
        contentValues.put("true_as_of_secs", Integer.valueOf(serializerVar.read));
        contentValues.put("payload_id", serializerVar.MediaSessionCompatQueueItem);
        contentValues.put("ingestion_time", Long.valueOf(serializerVar.RemoteActionCompatParcelizer));
        contentValues.put("event_ingestion_time", Long.valueOf(serializerVar.MediaMetadataCompat));
        contentValues.put("thrift_schema_version", serializerVar.MediaBrowserCompatMediaItem);
        serializerVar.RatingCompat = sQLiteDatabase.insert("payloads", "", contentValues);
        return serializerVar;
    }

    public final void IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        serializer(new getAnalyticsEnabledEnter(this, arrayList, 2));
        File[] fileArrListFiles = this.MediaBrowserCompatMediaItem.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file : fileArrListFiles) {
            if (!arrayList.contains(file.getName().replace(".gz", ""))) {
                file.delete();
            }
        }
    }

    public final long RemoteActionCompatParcelizer() {
        return migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.MediaBrowserCompatMediaItem);
        File databasePath = this.IconCompatParcelizer.getDatabasePath("sentiance-payloads");
        arrayList.add(databasePath);
        arrayList.add(migrateSealedSessionsMapToJsonlambda0.serializer(databasePath));
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @SuppressLint
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table payloads (id string primary key not null,type string not null,retry_count integer,true_as_of_secs integer,payload_id string,ingestion_time integer,event_ingestion_time integer not null,thrift_schema_version string not null);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_event_ingestion_time_type on payloads(event_ingestion_time, type)");
    }

    public final Optional<WhereClause> write() {
        this.MediaDescriptionCompat.getClass();
        return Optional.RemoteActionCompatParcelizer(WhereClause.serializer("event_ingestion_time").write(Long.valueOf(this.MediaMetadataCompat.write(System.currentTimeMillis()))));
    }

    public final serializer write(final getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release, final isValidNotificationVisibility isvalidnotificationvisibility, final long j) {
        this.MediaBrowserCompatMediaItem.mkdir();
        final String string = UUID.randomUUID().toString();
        if (this.serializer.read(getCustomLocationProviderNamesandroid_sdk_base_release.read, getcustomlocationprovidernamesandroid_sdk_base_release, write(string), true)) {
            return (serializer) RemoteActionCompatParcelizer(new r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk() { // from class: o.wakeScreenIfAppropriatelambda1
                @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
                public final Object write(SQLiteDatabase sQLiteDatabase) {
                    return wakeScreenIfAppropriatelambda3.write(this.serializer, getcustomlocationprovidernamesandroid_sdk_base_release, string, j, isvalidnotificationvisibility, sQLiteDatabase);
                }
            });
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Error while writing payload to disk", new Object[0]);
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        serializer(new wakeScreenIfAppropriatelambda4(0));
        File file = this.MediaBrowserCompatMediaItem;
        File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            fileArrListFiles[i].delete();
        }
        file.delete();
    }

    public static /* synthetic */ void read(wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, SQLiteDatabase sQLiteDatabase) {
        WhereClause whereClauseIconCompatParcelizer = WhereClause.serializer("event_ingestion_time").IconCompatParcelizer(Long.valueOf(wakescreenifappropriatelambda3.MediaMetadataCompat.write(0L)));
        sQLiteDatabase.delete("payloads", whereClauseIconCompatParcelizer.IconCompatParcelizer(), whereClauseIconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    public final File RemoteActionCompatParcelizer(String str) {
        File fileWrite = write(str);
        boolean zExists = fileWrite.exists();
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (zExists && migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer(fileWrite, parselonglambda0)) {
            return fileWrite;
        }
        parselonglambda0.IconCompatParcelizer("Invalid payload filename found, removing it from the db", new Object[0]);
        serializer(str);
        return null;
    }

    public static /* synthetic */ void read(wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, ArrayList arrayList, SQLiteDatabase sQLiteDatabase) {
        wakescreenifappropriatelambda3.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("payloads", new String[]{"id"}, null, null, null, null, null);
        int columnIndex = cursorQuery.getColumnIndex("id");
        if (columnIndex == -1) {
            wakescreenifappropriatelambda3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Column 'id' was not present in the cursor. Unexpected.", new Object[0]);
            return;
        }
        while (cursorQuery.moveToNext()) {
            arrayList.add(cursorQuery.getString(columnIndex));
        }
        cursorQuery.close();
    }

    public wakeScreenIfAppropriatelambda3(Context context, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, setSummaryTextIfPresentAndSupportedlambda0 setsummarytextifpresentandsupportedlambda0, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1) {
        super(context, "sentiance-payloads", 5, parselonglambda0, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1);
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = getverticalaccuracy;
        this.write = setsoundifpresentandsupportedlambda1;
        this.MediaDescriptionCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaMetadataCompat = setsummarytextifpresentandsupportedlambda0;
        this.RatingCompat = migrateblocklistedlistlambda1;
        File file = new File(context.getNoBackupFilesDir(), "sentiance-payloads");
        this.MediaBrowserCompatMediaItem = file;
        file.mkdir();
        File file2 = new File(context.getFilesDir(), "sentiance-payloads");
        File file3 = new File(context.getNoBackupFilesDir(), "sentiance-payloads");
        try {
            if (file2.exists()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file4 : fileArrListFiles) {
                        migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file4, new File(file3, file4.getName()));
                    }
                    for (File file5 : fileArrListFiles) {
                        file5.delete();
                    }
                }
                file2.delete();
            }
        } catch (IOException e) {
            this.MediaBrowserCompatMediaItem = new File(this.IconCompatParcelizer.getFilesDir(), "sentiance-payloads");
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to copy payload files to the no-backup dir.", new Object[0]);
        }
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
            if (i == 2) {
                sQLiteDatabase.execSQL("ALTER TABLE payloads ADD COLUMN payload_id string;");
            } else if (i == 3) {
                sQLiteDatabase.execSQL("ALTER TABLE payloads ADD COLUMN ingestion_time integer;");
            } else if (i == 4) {
                sQLiteDatabase.execSQL("ALTER TABLE payloads ADD COLUMN event_ingestion_time integer;");
                sQLiteDatabase.execSQL("UPDATE payloads SET event_ingestion_time = " + this.MediaMetadataCompat.write(0L));
                sQLiteDatabase.execSQL("CREATE INDEX idx_event_ingestion_time_type on payloads(event_ingestion_time, type)");
            } else if (i == 5) {
                sQLiteDatabase.execSQL("ALTER TABLE payloads ADD COLUMN thrift_schema_version string;");
            }
        }
    }

    public final List<serializer> read(WhereClause whereClause) {
        return (List) serializer(Collections.EMPTY_LIST, new getAnalyticsEnabledExit(1, whereClause));
    }

    public final void serializer(String str) {
        write(str).delete();
        serializer(new wakeScreenIfAppropriatelambda2(str, 0));
    }

    public final WhereClause IconCompatParcelizer(List<String> list) {
        this.MediaDescriptionCompat.getClass();
        return WhereClause.serializer("event_ingestion_time").write(Long.valueOf(this.MediaMetadataCompat.write(System.currentTimeMillis()))).IconCompatParcelizer("type").read(list);
    }

    @Override // o.migrateBlocklistedListslambda3
    public final migrateBlocklistedListlambda1 serializer() {
        return this.RatingCompat;
    }
}
