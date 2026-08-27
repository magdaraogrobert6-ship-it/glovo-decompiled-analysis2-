package o;

import android.content.ContentValues;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class accessgetClickLoggedp extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final String MediaBrowserCompatMediaItem;
    private final short MediaMetadataCompat;

    public final short read() {
        return this.MediaMetadataCompat;
    }

    public final String serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<accessgetClickLoggedp> write() {
        return getAssetUrls.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "Timezone";
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("timezone", Short.valueOf(this.MediaMetadataCompat));
        contentValues.put("timezone_id", this.MediaBrowserCompatMediaItem);
        return contentValues;
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetClickLoggedp) || !super.equals(obj)) {
            return false;
        }
        accessgetClickLoggedp accessgetclickloggedp = (accessgetClickLoggedp) obj;
        return this.MediaMetadataCompat == accessgetclickloggedp.MediaMetadataCompat && Objects.equals(this.MediaBrowserCompatMediaItem, accessgetclickloggedp.MediaBrowserCompatMediaItem);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimezoneEntry{offsetInMinutes=");
        sb.append((int) this.MediaMetadataCompat);
        sb.append(", timezoneId='");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("', uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', eventTime=");
        sb.append(this.write);
        sb.append(", timeHorizon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", id=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, '}');
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        short s = this.MediaMetadataCompat;
        return Objects.hash(Integer.valueOf(iHashCode), Short.valueOf(s), this.MediaBrowserCompatMediaItem);
    }

    public accessgetClickLoggedp(long j, String str, long j2, long j3, short s, String str2, long j4, long j5) {
        super(j, str, j2, j3, j4, j5);
        this.MediaMetadataCompat = s;
        this.MediaBrowserCompatMediaItem = str2;
    }

    public accessgetClickLoggedp(String str, long j, long j2, short s, String str2, long j3, long j4) {
        super(str, j, j2, j3, j4);
        this.MediaMetadataCompat = s;
        this.MediaBrowserCompatMediaItem = str2;
    }
}
