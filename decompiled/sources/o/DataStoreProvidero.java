package o;

import android.content.ContentValues;
import android.database.Cursor;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public class DataStoreProvidero {
    private String IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private String read;

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final ContentValues IconCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", this.read);
        contentValues.put("value", this.IconCompatParcelizer);
        return contentValues;
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(((int) (j ^ (j >>> 32))) * 31, 31, this.read);
    }

    public DataStoreProvidero(long j, String str, String str2) {
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public static DataStoreProvidero serializer(Cursor cursor) throws IllegalArgumentException {
        return new DataStoreProvidero(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("key")), cursor.getString(cursor.getColumnIndexOrThrow("value")));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagEntry{id=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", key='");
        sb.append(this.read);
        sb.append("', value='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataStoreProvidero dataStoreProvidero = (DataStoreProvidero) obj;
        if (this.RemoteActionCompatParcelizer == dataStoreProvidero.RemoteActionCompatParcelizer && this.read.equals(dataStoreProvidero.read)) {
            return this.IconCompatParcelizer.equals(dataStoreProvidero.IconCompatParcelizer);
        }
        return false;
    }

    public DataStoreProvidero(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}
