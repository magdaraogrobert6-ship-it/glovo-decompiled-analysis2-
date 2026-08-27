package o;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes3.dex */
public class setAssetsZipRemoteUrl extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final long write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<setAssetsZipRemoteUrl> write() {
        return getJsonObject.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("venue_id", Long.valueOf(this.write));
        contentValues.put("tag_id", Long.valueOf(this.RemoteActionCompatParcelizer));
        return contentValues;
    }

    public setAssetsZipRemoteUrl(long j, long j2, long j3) {
        this.IconCompatParcelizer = j;
        this.write = j2;
        this.RemoteActionCompatParcelizer = j3;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveVenueTagEntry{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", venueId=");
        sb.append(this.write);
        sb.append(", tagId=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            setAssetsZipRemoteUrl setassetszipremoteurl = (setAssetsZipRemoteUrl) obj;
            if (this.IconCompatParcelizer == setassetszipremoteurl.IconCompatParcelizer && this.write == setassetszipremoteurl.write && this.RemoteActionCompatParcelizer == setassetszipremoteurl.RemoteActionCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    public setAssetsZipRemoteUrl(long j, long j2) {
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        long j2 = this.write;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.RemoteActionCompatParcelizer;
        return (((((int) (j ^ (j >>> 32))) * 31) + i) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }
}
