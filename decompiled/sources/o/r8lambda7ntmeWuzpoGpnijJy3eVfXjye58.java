package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda7ntmeWuzpoGpnijJy3eVfXjye58 implements r8lambdarAXTMPneU6bGuXRLQL3WE3DesY {
    final /* synthetic */ r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs IconCompatParcelizer;
    final /* synthetic */ Runnable RemoteActionCompatParcelizer;
    final /* synthetic */ r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI serializer;

    @Override // o.r8lambdarAXTMPneU6bGuXRLQL3WE3DesY
    public final void IconCompatParcelizer(int i) {
        int i2;
        boolean z;
        long jLongValue;
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = this.IconCompatParcelizer;
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.serializer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = this.serializer;
        if (r8lambdanpc69wzeqaei66oxsnhlebhusqi != null) {
            Long l = r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer;
            r8lambda7d1kk4szdotwipf3xpnkewsbnbs.serializer.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis2 > l.longValue()) {
                z = true;
                jLongValue = jCurrentTimeMillis2;
                i2 = i;
            } else {
                int iIntValue = r8lambdanpc69wzeqaei66oxsnhlebhusqi.write.intValue();
                z = false;
                jLongValue = l.longValue();
                i2 = i - iIntValue;
            }
        } else {
            i2 = 0;
            z = false;
            jLongValue = jCurrentTimeMillis;
        }
        if (r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.RatingCompat(r8lambda7d1kk4szdotwipf3xpnkewsbnbs)) {
            r8lambda7d1kk4szdotwipf3xpnkewsbnbs.IconCompatParcelizer(jCurrentTimeMillis, i2, i, jLongValue, jCurrentTimeMillis, z);
        }
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public r8lambda7ntmeWuzpoGpnijJy3eVfXjye58(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs, r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi, Runnable runnable) {
        this.IconCompatParcelizer = r8lambda7d1kk4szdotwipf3xpnkewsbnbs;
        this.serializer = r8lambdanpc69wzeqaei66oxsnhlebhusqi;
        this.RemoteActionCompatParcelizer = runnable;
    }
}
