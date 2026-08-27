package o;

import android.database.Cursor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class shutdownAllDataStores extends DataStoreProviderq {
    public static final write IconCompatParcelizer = new write(null);

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static shutdownAllDataStores IconCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
            r8lambdaDXXsJV9_crFzZ2GMgkyKr1LEJTU.serializer.getClass();
            long j = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("quad_key"));
            string.getClass();
            return new shutdownAllDataStores(j, string, cursor.getLong(cursor.getColumnIndexOrThrow("download_time")), cursor.getLong(cursor.getColumnIndexOrThrow("last_access_time")), cursor.getLong(cursor.getColumnIndexOrThrow("last_modified_time")));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public shutdownAllDataStores(String str, long j, long j2, long j3) {
        this(0L, str, j, j2, j3);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shutdownAllDataStores(long j, String str, long j2, long j3, long j4) {
        super(j, str, j2, j3, j4);
        str.getClass();
    }
}
