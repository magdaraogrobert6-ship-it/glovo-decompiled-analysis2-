package o;

import android.database.Cursor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 extends DataStoreProviderq {
    public static final serializer IconCompatParcelizer = new serializer(null);

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
            r8lambdaLD6VIt3lDGPHJe4UaQvQiu81jjo.write.getClass();
            long j = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("quad_key"));
            string.getClass();
            return new r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4(j, string, cursor.getLong(cursor.getColumnIndexOrThrow("download_time")), cursor.getLong(cursor.getColumnIndexOrThrow("last_access_time")), cursor.getLong(cursor.getColumnIndexOrThrow("last_modified_time")));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4(String str, long j, long j2, long j3) {
        this(0L, str, j, j2, j3);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4(long j, String str, long j2, long j3, long j4) {
        super(j, str, j2, j3, j4);
        str.getClass();
    }
}
