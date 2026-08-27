package o;

import android.content.ContentValues;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    final long IconCompatParcelizer;
    final long RatingCompat;
    final String RemoteActionCompatParcelizer;
    long read;
    final long serializer;
    final long write;

    public final long ComponentActivity() {
        return this.IconCompatParcelizer;
    }

    public final long MediaSessionCompatToken() {
        return this.serializer;
    }

    public final long ParcelableVolumeInfo() {
        return this.read;
    }

    public final long PlaybackStateCompatCustomAction() {
        return this.write;
    }

    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.RatingCompat;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", this.RemoteActionCompatParcelizer);
        contentValues.put("event_time", Long.valueOf(this.write));
        contentValues.put("time_horizon", Long.valueOf(this.IconCompatParcelizer));
        contentValues.put("creation_time", Long.valueOf(this.serializer));
        contentValues.put("update_time", Long.valueOf(this.RatingCompat));
        return contentValues;
    }

    public int hashCode() {
        return Long.hashCode(this.RatingCompat) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer), 31, this.read), 31, this.serializer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme = (r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) obj;
        return this.write == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.write && this.IconCompatParcelizer == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.IconCompatParcelizer && this.read == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.read && this.serializer == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.serializer && this.RatingCompat == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.RatingCompat && this.RemoteActionCompatParcelizer.equals(r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.RemoteActionCompatParcelizer);
    }

    public r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE(long j, String str, long j2, long j3, long j4, long j5) {
        this(str, j2, j3, j4, j5);
        this.read = j;
    }

    public r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE(String str, long j, long j2, long j3, long j4) {
        this.RemoteActionCompatParcelizer = str;
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.serializer = j3;
        this.RatingCompat = j4;
    }
}
