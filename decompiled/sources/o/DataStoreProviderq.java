package o;

import android.content.ContentValues;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataStoreProviderq {
    public long MediaDescriptionCompat;
    public long RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public long write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.RatingCompat), 31, this.MediaDescriptionCompat), 31, this.read);
    }

    public DataStoreProviderq(long j, String str, long j2, long j3, long j4) {
        str.getClass();
        this.read = j;
        this.RemoteActionCompatParcelizer = str;
        this.write = j2;
        this.RatingCompat = j3;
        this.MediaDescriptionCompat = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DataStoreProviderq dataStoreProviderq = (DataStoreProviderq) obj;
        return this.read == dataStoreProviderq.read && this.write == dataStoreProviderq.write && this.RatingCompat == dataStoreProviderq.RatingCompat && this.MediaDescriptionCompat == dataStoreProviderq.MediaDescriptionCompat && this.RemoteActionCompatParcelizer.equals(dataStoreProviderq.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZippedTileInfoEntry(quadKey='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', downloadTime=");
        sb.append(this.write);
        sb.append(", lastAccessTime=");
        sb.append(this.RatingCompat);
        sb.append(", lastModifiedTime=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", id=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, ')');
    }

    public final ContentValues read(DataStoreProviderp dataStoreProviderp) {
        dataStoreProviderp.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("quad_key", this.RemoteActionCompatParcelizer);
        contentValues.put("download_time", Long.valueOf(this.write));
        contentValues.put("last_access_time", Long.valueOf(this.RatingCompat));
        contentValues.put("last_modified_time", Long.valueOf(this.MediaDescriptionCompat));
        return contentValues;
    }
}
