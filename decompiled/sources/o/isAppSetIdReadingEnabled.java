package o;

import android.os.Process;
import com.roadrunner.rider.safety.sentiance.SentianceGuard;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isAppSetIdReadingEnabled implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public static int serializer;
    public final /* synthetic */ SentianceGuard RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ isAppSetIdReadingEnabled(SentianceGuard sentianceGuard, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = sentianceGuard;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = com.sentiance.sdk.Sentiance.getInstance(r2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r2.read;
        r1.getClass();
        r1 = java.lang.Boolean.valueOf(r1.IconCompatParcelizer(o.updateAdidI.IS_RIDER_SAFETY_TIMEOUT_FIX_ENABLED));
        r2 = o.isAppSetIdReadingEnabled.MediaDescriptionCompat + 1;
        o.isAppSetIdReadingEnabled.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.isAppSetIdReadingEnabled.read
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.isAppSetIdReadingEnabled.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = r4.write
            com.roadrunner.rider.safety.sentiance.SentianceGuard r2 = r4.RemoteActionCompatParcelizer
            r3 = 13
            int r3 = r3 / 0
            if (r1 == 0) goto L40
            goto L1f
        L19:
            int r1 = r4.write
            com.roadrunner.rider.safety.sentiance.SentianceGuard r2 = r4.RemoteActionCompatParcelizer
            if (r1 == 0) goto L40
        L1f:
            o.transferSessionPackageI r1 = r2.read
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            r1.getClass()
            o.updateAdidI r2 = o.updateAdidI.IS_RIDER_SAFETY_TIMEOUT_FIX_ENABLED
            boolean r1 = r1.IconCompatParcelizer(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r2 = o.isAppSetIdReadingEnabled.MediaDescriptionCompat
            int r2 = r2 + 1
            int r3 = r2 % 128
            o.isAppSetIdReadingEnabled.read = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L3f
            r0 = 85
            int r0 = r0 / 0
        L3f:
            return r1
        L40:
            o.setOnEventTrackingFailedListener r0 = r2.MediaBrowserCompatMediaItem
            android.app.Application r0 = r0.RemoteActionCompatParcelizer
            com.sentiance.sdk.Sentiance r0 = com.sentiance.sdk.Sentiance.getInstance(r0)
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isAppSetIdReadingEnabled.invoke():java.lang.Object");
    }

    public static int serializer() {
        int i = serializer;
        int i2 = i % 6079790;
        serializer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        IconCompatParcelizer = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
