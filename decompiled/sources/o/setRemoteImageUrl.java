package o;

import android.content.ContentValues;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public class setRemoteImageUrl extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final double read;
    public final double serializer;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<setRemoteImageUrl> write() {
        return getInAppMessageDarkThemeWrapper.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("venue_id", Long.valueOf(this.RemoteActionCompatParcelizer));
        contentValues.put("latitude", Double.valueOf(this.serializer));
        contentValues.put("longitude", Double.valueOf(this.read));
        return contentValues;
    }

    public setRemoteImageUrl(long j, long j2, double d, double d2) {
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.serializer = d;
        this.read = d2;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveVenueEntry{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", venueId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", latitude=");
        sb.append(this.serializer);
        sb.append(", longitude=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            setRemoteImageUrl setremoteimageurl = (setRemoteImageUrl) obj;
            if (this.IconCompatParcelizer == setremoteimageurl.IconCompatParcelizer && this.RemoteActionCompatParcelizer == setremoteimageurl.RemoteActionCompatParcelizer && Double.compare(setremoteimageurl.serializer, this.serializer) == 0 && Double.compare(setremoteimageurl.read, this.read) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        int i = (int) (j2 ^ (j2 >>> 32));
        long jDoubleToLongBits = Double.doubleToLongBits(this.serializer);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.read);
        return (((((((int) (j ^ (j >>> 32))) * 31) + i) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public setRemoteImageUrl(long j, double d, double d2) {
        this.RemoteActionCompatParcelizer = j;
        this.serializer = d;
        this.read = d2;
    }
}
