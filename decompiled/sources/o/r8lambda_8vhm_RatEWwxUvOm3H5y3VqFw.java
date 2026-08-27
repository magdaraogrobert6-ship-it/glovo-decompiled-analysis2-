package o;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw {
    private final String IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final long serializer;
    private final Long write;

    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final long serializer() {
        return this.serializer;
    }

    public final ContentValues MediaBrowserCompatMediaItem() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("quad_key", this.IconCompatParcelizer);
        contentValues.put("last_access", Long.valueOf(this.serializer));
        contentValues.put("query_count", Long.valueOf(this.RemoteActionCompatParcelizer));
        contentValues.put("last_modified_time", this.write);
        return contentValues;
    }

    public r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw(String str, long j, long j2, long j3) {
        this.IconCompatParcelizer = str;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.write = Long.valueOf(j3);
    }

    public static r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw write(Cursor cursor) throws IllegalArgumentException {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("quad_key"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("last_access"));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("query_count"));
        int columnIndex = cursor.getColumnIndex("last_modified_time");
        return new r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw(j, string, j2, j3, (columnIndex == -1 || cursor.isNull(columnIndex)) ? null : Long.valueOf(cursor.getLong(columnIndex)));
    }

    public final String toString() {
        return "TileInfoEntry{id=" + this.read + ", quadKey='" + this.IconCompatParcelizer + "', lastAccess=" + this.serializer + ", queryCount=" + this.RemoteActionCompatParcelizer + ", lastModifiedTime=" + this.write + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw) obj;
            if (this.read != r8lambda_8vhm_ratewwxuvom3h5y3vqfw.read || this.serializer != r8lambda_8vhm_ratewwxuvom3h5y3vqfw.serializer || this.RemoteActionCompatParcelizer != r8lambda_8vhm_ratewwxuvom3h5y3vqfw.RemoteActionCompatParcelizer || this.write != r8lambda_8vhm_ratewwxuvom3h5y3vqfw.write) {
                return false;
            }
            String str = r8lambda_8vhm_ratewwxuvom3h5y3vqfw.IconCompatParcelizer;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.read;
        int i = (int) (j ^ (j >>> 32));
        String str = this.IconCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j2 = this.serializer;
        long j3 = this.RemoteActionCompatParcelizer;
        int i2 = (int) (j3 ^ (j3 >>> 32));
        Long l = this.write;
        return (((((((i * 31) + iHashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + i2) * 31) + ((int) ((l.longValue() >>> 32) ^ l.longValue()));
    }

    public r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw(long j, String str, long j2, long j3, Long l) {
        this.read = j;
        this.IconCompatParcelizer = str;
        this.serializer = j2;
        this.RemoteActionCompatParcelizer = j3;
        this.write = l;
    }

    public final long write() {
        return this.read;
    }
}
