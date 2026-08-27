package o;

import android.content.ContentValues;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public class _set_durationInMilliseconds_lambda1 extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final float write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        return this.read;
    }

    public final float read() {
        return this.write;
    }

    public final long serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<_set_durationInMilliseconds_lambda1> write() {
        return r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("stationary_id", this.read);
        contentValues.put("active_venue_row_id", Long.valueOf(this.RemoteActionCompatParcelizer));
        contentValues.put("likelihood", Float.valueOf(this.write));
        return contentValues;
    }

    public _set_durationInMilliseconds_lambda1(long j, String str, long j2, float f) {
        this.IconCompatParcelizer = j;
        this.read = str;
        this.RemoteActionCompatParcelizer = j2;
        this.write = f;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("StationaryVenueEntry{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", stationaryId=");
        sb.append(this.read);
        sb.append(", activeVenueRowId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", likelihood=");
        return MediaSessionCompatQueueItem.serializer(sb, this.write, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _set_durationInMilliseconds_lambda1 _set_durationinmilliseconds_lambda1 = (_set_durationInMilliseconds_lambda1) obj;
        if (this.IconCompatParcelizer == _set_durationinmilliseconds_lambda1.IconCompatParcelizer && this.RemoteActionCompatParcelizer == _set_durationinmilliseconds_lambda1.RemoteActionCompatParcelizer && Float.compare(_set_durationinmilliseconds_lambda1.write, this.write) == 0) {
            return this.read.equals(_set_durationinmilliseconds_lambda1.read);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        int iM = af$$ExternalSyntheticOutline0.m(((int) (j ^ (j >>> 32))) * 31, 31, this.read);
        long j2 = this.RemoteActionCompatParcelizer;
        int i = (int) ((j2 >>> 32) ^ j2);
        float f = this.write;
        return ((iM + i) * 31) + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public _set_durationInMilliseconds_lambda1(String str, long j, float f) {
        this.read = str;
        this.RemoteActionCompatParcelizer = j;
        this.write = f;
    }
}
