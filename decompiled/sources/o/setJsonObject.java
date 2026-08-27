package o;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.ondevice.datasyncing.DataSyncPayloadType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class setJsonObject extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw> {
    public static final write RemoteActionCompatParcelizer = new write(null);
    private static volatile setJsonObject serializer;

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "data_sync_payloads";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw> RemoteActionCompatParcelizer() {
        return r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw.class;
    }

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final setJsonObject IconCompatParcelizer() {
            setJsonObject setjsonobject;
            setJsonObject setjsonobject2 = setJsonObject.serializer;
            if (setjsonobject2 != null) {
                return setjsonobject2;
            }
            synchronized (this) {
                setjsonobject = setJsonObject.serializer;
                if (setjsonobject == null) {
                    setjsonobject = new setJsonObject();
                    setJsonObject.serializer = setjsonobject;
                }
            }
            return setjsonobject;
        }
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) {
        cursor.getClass();
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        String str2 = MediaSessionCompatQueueItem.read(str, "data_type", cursor);
        long jIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor);
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str.concat("uuid")));
        string.getClass();
        long jIconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(str, "creation_time", cursor);
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(str.concat("payload_time")));
        str2.getClass();
        DataSyncPayloadType dataSyncPayloadTypeValueOf = DataSyncPayloadType.valueOf(str2);
        long jIconCompatParcelizer3 = IconCompatParcelizer.IconCompatParcelizer(str, "size", cursor);
        boolean z = cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("is_requested"))) == 1;
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(str.concat("schema_version")));
        string2.getClass();
        return new r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw(jIconCompatParcelizer, string, jIconCompatParcelizer2, j, dataSyncPayloadTypeValueOf, jIconCompatParcelizer3, z, string2);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return androidx.sqlite.SQLite.read("CREATE UNIQUE INDEX index_uuid on data_sync_payloads(uuid)", "CREATE INDEX index_payload_time on data_sync_payloads(payload_time)", "CREATE INDEX index_is_requested_creation_time on data_sync_payloads(is_requested, creation_time)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return androidx.sqlite.SQLite.read("id integer primary key autoincrement not null", "creation_time integer", "payload_time integer", "size integer", "data_type text not null", "is_requested boolean not null CHECK (is_requested IN (0,1))", "uuid text not null", "schema_version text");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    @SuppressLint
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.getClass();
        if (i == 2) {
            sQLiteDatabase.execSQL("CREATE INDEX index_is_requested_creation_time on data_sync_payloads(is_requested, creation_time)");
        } else {
            if (i != 3) {
                return;
            }
            sQLiteDatabase.execSQL("ALTER TABLE data_sync_payloads ADD COLUMN schema_version text");
        }
    }
}
