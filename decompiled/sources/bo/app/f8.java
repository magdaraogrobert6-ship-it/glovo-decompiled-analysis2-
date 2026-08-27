package bo.app;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.displayInAppMessagelambda8;
import o.displayInAppMessagelambda9;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class f8 {
    public static final int g = 45000;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final displayInAppMessagelambda9 e;
    public int f;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        displayInAppMessagelambda9 displayinappmessagelambda9 = this.e;
        int i5 = this.f;
        boolean z = i5 != 0;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "ExponentialBackoffStateProvider(maxSleepDurationMs=", ", defaultNormalFlushIntervalMs=", ", minSleepDurationMs=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i3, i4, ", scaleFactor=", ", randomSleepDurationGenerator=", sbM);
        sbM.append(displayinappmessagelambda9);
        sbM.append(", lastSleepDurationMs=");
        sbM.append(i5);
        sbM.append(", isBackingOff=");
        return ff$$ExternalSyntheticOutline0.m(sbM, z, ")");
    }

    public f8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i5 = (int) jUptimeMillis;
        int i6 = (int) (jUptimeMillis >> 32);
        int i7 = ~i5;
        displayInAppMessagelambda8 displayinappmessagelambda8 = new displayInAppMessagelambda8();
        displayinappmessagelambda8.MediaBrowserCompatMediaItem = i5;
        displayinappmessagelambda8.RatingCompat = i6;
        displayinappmessagelambda8.MediaSessionCompatQueueItem = 0;
        displayinappmessagelambda8.read = 0;
        displayinappmessagelambda8.RemoteActionCompatParcelizer = i7;
        displayinappmessagelambda8.IconCompatParcelizer = (i5 << 10) ^ (i6 >>> 4);
        if ((i6 | i5 | i7) == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i8 = 0; i8 < 64; i8++) {
            displayinappmessagelambda8.serializer();
        }
        this.e = displayinappmessagelambda8;
    }

    public final int a(int i) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(11, this), 7, (Object) null);
        displayInAppMessagelambda9 displayinappmessagelambda9 = this.e;
        int i2 = this.f * this.d;
        displayinappmessagelambda9.getClass();
        int iMin = Math.min(i, i2) + displayinappmessagelambda9.RemoteActionCompatParcelizer(Math.abs(i - i2) + 1);
        this.f = Math.max(this.c, Math.min(this.a, iMin));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new f8$$ExternalSyntheticLambda2(i, iMin, 0, this), 7, (Object) null);
        return this.f;
    }

    public static final String a(f8 f8Var) {
        return c8$$ExternalSyntheticOutline0.m(f8Var.f, "Computing new sleep delay. Previous sleep delay: ");
    }

    public static final String a(f8 f8Var, int i, int i2) {
        int i3 = f8Var.f;
        int i4 = f8Var.a;
        int i5 = f8Var.c;
        int i6 = f8Var.d;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i3, i, "New sleep duration: ", " ms. Default sleep duration: ", " ms. Max sleep: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i4, i5, " ms. Min sleep: ", " ms. Scale factor: ", sbM);
        sbM.append(i6);
        sbM.append(" randomValueBetweenSleepIntervals: ");
        sbM.append(i2);
        return sbM.toString();
    }
}
