package o;

import android.location.Location;
import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class handleLogClickdefault {
    private final long IconCompatParcelizer;
    private final Float MediaBrowserCompatMediaItem;
    private final Float MediaSessionCompatQueueItem;
    private final double RemoteActionCompatParcelizer;
    private final double read;
    private final boolean serializer;
    private final Float write;

    public final Float IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final Float MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final long MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    public final boolean MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem != null;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.write != null;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.serializer;
    }

    public final boolean RatingCompat() {
        return this.MediaSessionCompatQueueItem != null;
    }

    public final double RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final double serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static int IconCompatParcelizer(handleLogClickdefault handlelogclickdefault, handleLogClickdefault handlelogclickdefault2) {
        return Long.compare(handlelogclickdefault.IconCompatParcelizer, handlelogclickdefault2.IconCompatParcelizer);
    }

    public handleLogClickdefault(Location location, Float f) {
        this(location.getTime(), location.getLatitude(), location.getLongitude(), location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null, location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null, f);
    }

    public final String toString() {
        return "TransportWaypointInternal{time=" + this.IconCompatParcelizer + ", latitude=" + this.read + ", longitude=" + this.RemoteActionCompatParcelizer + ", isSynthetic=" + this.serializer + ", accuracy=" + this.write + ", speedInMps=" + this.MediaSessionCompatQueueItem + ", speedLimitInMps=" + this.MediaBrowserCompatMediaItem + '}';
    }

    public final boolean MediaSessionCompatToken() {
        return MediaMetadataCompat() && this.MediaBrowserCompatMediaItem.floatValue() == Float.MAX_VALUE;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        double d = this.read;
        double d2 = this.RemoteActionCompatParcelizer;
        boolean z = this.serializer;
        Float f = this.MediaSessionCompatQueueItem;
        Float f2 = this.MediaBrowserCompatMediaItem;
        return Objects.hash(Long.valueOf(j), Double.valueOf(d), Double.valueOf(d2), Boolean.valueOf(z), this.write, f, f2);
    }

    public final Float read() {
        Float f = this.MediaSessionCompatQueueItem;
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 3.6f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) obj;
        return this.IconCompatParcelizer == handlelogclickdefault.IconCompatParcelizer && Double.compare(this.read, handlelogclickdefault.read) == 0 && Double.compare(this.RemoteActionCompatParcelizer, handlelogclickdefault.RemoteActionCompatParcelizer) == 0 && this.serializer == handlelogclickdefault.serializer && Objects.equals(this.write, handlelogclickdefault.write) && Objects.equals(this.MediaSessionCompatQueueItem, handlelogclickdefault.MediaSessionCompatQueueItem) && Objects.equals(this.MediaBrowserCompatMediaItem, handlelogclickdefault.MediaBrowserCompatMediaItem);
    }

    public static r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU RemoteActionCompatParcelizer(List<handleLogClickdefault> list) {
        if (list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new wg$$ExternalSyntheticLambda0(22));
        ArrayList arrayList = new ArrayList();
        long j = list.get(0).IconCompatParcelizer;
        for (handleLogClickdefault handlelogclickdefault : list) {
            Short shValueOf = handlelogclickdefault.MediaSessionCompatQueueItem() ? Short.valueOf((short) Math.min(handlelogclickdefault.write.floatValue(), 32767.0f)) : null;
            r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = shValueOf;
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Integer.valueOf((int) (handlelogclickdefault.read * 1000000.0d));
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = Integer.valueOf((int) (handlelogclickdefault.RemoteActionCompatParcelizer * 1000000.0d));
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Integer.valueOf((int) (handlelogclickdefault.IconCompatParcelizer - j));
            if (handlelogclickdefault.RatingCompat()) {
                Float f = handlelogclickdefault.MediaSessionCompatQueueItem;
                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Short.valueOf((f == null ? null : Float.valueOf(f.floatValue() * 100.0f)).shortValue());
            }
            if (handlelogclickdefault.MediaSessionCompatToken()) {
                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Short.MAX_VALUE;
            } else if (handlelogclickdefault.MediaMetadataCompat()) {
                Float f2 = handlelogclickdefault.MediaBrowserCompatMediaItem;
                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Short.valueOf((f2 == null ? null : f2.floatValue() == Float.MAX_VALUE ? Float.valueOf(Float.MAX_VALUE) : Float.valueOf(f2.floatValue() * 100.0f)).shortValue());
            }
            arrayList.add(r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer());
        }
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList;
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Long.valueOf(j);
        return r8lambda1mnczrzuv4owduwgkg6cjtsws.serializer();
    }

    public handleLogClickdefault(long j, double d, double d2, Float f, Float f2, Float f3) {
        this(j, d, d2, f, f2, f3, false);
    }

    public handleLogClickdefault(long j, double d, double d2, Float f, Float f2, Float f3, boolean z) {
        this.IconCompatParcelizer = j;
        this.read = d;
        this.RemoteActionCompatParcelizer = d2;
        this.write = f;
        this.MediaSessionCompatQueueItem = f2;
        this.serializer = z;
        this.MediaBrowserCompatMediaItem = f3;
    }

    public final Float write() {
        return this.write;
    }

    public final float serializer(handleLogClickdefault handlelogclickdefault) {
        float[] fArr = new float[1];
        Location.distanceBetween(this.read, this.RemoteActionCompatParcelizer, handlelogclickdefault.read, handlelogclickdefault.RemoteActionCompatParcelizer, fArr);
        return fArr[0];
    }
}
