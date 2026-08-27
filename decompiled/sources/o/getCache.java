package o;

import android.app.Application;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class getCache {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final isAdapterPositionOnScreen serializer;
    public final Application write;

    public getCache(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        application.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = application;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        final int i = 0;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getLock
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ getCache RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0057  */
            /* JADX WARN: Code duplicated, block: B:28:0x0070  */
            /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
            
                if (r1 != 2) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
            
                r0 = r4.write.getSystemService("phone");
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
            
                if ((r0 instanceof android.telephony.TelephonyManager) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
            
                return (android.telephony.TelephonyManager) r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            
                r0 = r4.write.getSystemService("power");
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
            
                if ((!(r0 instanceof android.os.PowerManager)) == false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            
                return (android.os.PowerManager) r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            
                if (r1 != 2) goto L13;
             */
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 31
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L1f
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    r5 = 30
                    int r5 = r5 / 0
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                    goto L29
                L1f:
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                L29:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.telephony.TelephonyManager
                    if (r1 == 0) goto L38
                    r3 = r0
                    android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
                L38:
                    return r3
                L39:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "power"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.os.PowerManager
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L47
                    goto L4a
                L47:
                    r3 = r0
                    android.os.PowerManager r3 = (android.os.PowerManager) r3
                L4a:
                    return r3
                L4b:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "batterymanager"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.os.BatteryManager
                    if (r2 == 0) goto L63
                    r3 = r1
                    android.os.BatteryManager r3 = (android.os.BatteryManager) r3
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 27
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                L63:
                    return r3
                L64:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.net.ConnectivityManager
                    if (r2 == 0) goto L83
                    int r2 = o.getLock.IconCompatParcelizer
                    int r3 = r2 + 117
                    int r4 = r3 % 128
                    o.getLock.read = r4
                    int r3 = r3 % r0
                    r3 = r1
                    android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                    int r2 = r2 + 119
                    int r1 = r2 % 128
                    o.getLock.read = r1
                    int r2 = r2 % r0
                L83:
                    int r1 = o.getLock.read
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    o.getLock.IconCompatParcelizer = r2
                    int r1 = r1 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getLock.invoke():java.lang.Object");
            }
        });
        final int i2 = 1;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getLock
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ getCache RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final java.lang.Object invoke() {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 31
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L1f
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    r5 = 30
                    int r5 = r5 / 0
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                    goto L29
                L1f:
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                L29:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.telephony.TelephonyManager
                    if (r1 == 0) goto L38
                    r3 = r0
                    android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
                L38:
                    return r3
                L39:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "power"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.os.PowerManager
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L47
                    goto L4a
                L47:
                    r3 = r0
                    android.os.PowerManager r3 = (android.os.PowerManager) r3
                L4a:
                    return r3
                L4b:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "batterymanager"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.os.BatteryManager
                    if (r2 == 0) goto L63
                    r3 = r1
                    android.os.BatteryManager r3 = (android.os.BatteryManager) r3
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 27
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                L63:
                    return r3
                L64:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.net.ConnectivityManager
                    if (r2 == 0) goto L83
                    int r2 = o.getLock.IconCompatParcelizer
                    int r3 = r2 + 117
                    int r4 = r3 % 128
                    o.getLock.read = r4
                    int r3 = r3 % r0
                    r3 = r1
                    android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                    int r2 = r2 + 119
                    int r1 = r2 % 128
                    o.getLock.read = r1
                    int r2 = r2 % r0
                L83:
                    int r1 = o.getLock.read
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    o.getLock.IconCompatParcelizer = r2
                    int r1 = r1 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getLock.invoke():java.lang.Object");
            }
        });
        final int i3 = 2;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getLock
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ getCache RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final java.lang.Object invoke() {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 31
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L1f
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    r5 = 30
                    int r5 = r5 / 0
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                    goto L29
                L1f:
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                L29:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.telephony.TelephonyManager
                    if (r1 == 0) goto L38
                    r3 = r0
                    android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
                L38:
                    return r3
                L39:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "power"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.os.PowerManager
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L47
                    goto L4a
                L47:
                    r3 = r0
                    android.os.PowerManager r3 = (android.os.PowerManager) r3
                L4a:
                    return r3
                L4b:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "batterymanager"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.os.BatteryManager
                    if (r2 == 0) goto L63
                    r3 = r1
                    android.os.BatteryManager r3 = (android.os.BatteryManager) r3
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 27
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                L63:
                    return r3
                L64:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.net.ConnectivityManager
                    if (r2 == 0) goto L83
                    int r2 = o.getLock.IconCompatParcelizer
                    int r3 = r2 + 117
                    int r4 = r3 % 128
                    o.getLock.read = r4
                    int r3 = r3 % r0
                    r3 = r1
                    android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                    int r2 = r2 + 119
                    int r1 = r2 % 128
                    o.getLock.read = r1
                    int r2 = r2 % r0
                L83:
                    int r1 = o.getLock.read
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    o.getLock.IconCompatParcelizer = r2
                    int r1 = r1 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getLock.invoke():java.lang.Object");
            }
        });
        final int i4 = 3;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getLock
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ getCache RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final java.lang.Object invoke() {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 31
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L1f
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    r5 = 30
                    int r5 = r5 / 0
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                    goto L29
                L1f:
                    int r1 = r2
                    o.getCache r4 = r6.RemoteActionCompatParcelizer
                    if (r1 == 0) goto L64
                    if (r1 == r2) goto L4b
                    if (r1 == r0) goto L39
                L29:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.telephony.TelephonyManager
                    if (r1 == 0) goto L38
                    r3 = r0
                    android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
                L38:
                    return r3
                L39:
                    android.app.Application r0 = r4.write
                    java.lang.String r1 = "power"
                    java.lang.Object r0 = r0.getSystemService(r1)
                    boolean r1 = r0 instanceof android.os.PowerManager
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L47
                    goto L4a
                L47:
                    r3 = r0
                    android.os.PowerManager r3 = (android.os.PowerManager) r3
                L4a:
                    return r3
                L4b:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "batterymanager"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.os.BatteryManager
                    if (r2 == 0) goto L63
                    r3 = r1
                    android.os.BatteryManager r3 = (android.os.BatteryManager) r3
                    int r1 = o.getLock.IconCompatParcelizer
                    int r1 = r1 + 27
                    int r2 = r1 % 128
                    o.getLock.read = r2
                    int r1 = r1 % r0
                L63:
                    return r3
                L64:
                    android.app.Application r1 = r4.write
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    boolean r2 = r1 instanceof android.net.ConnectivityManager
                    if (r2 == 0) goto L83
                    int r2 = o.getLock.IconCompatParcelizer
                    int r3 = r2 + 117
                    int r4 = r3 % 128
                    o.getLock.read = r4
                    int r3 = r3 % r0
                    r3 = r1
                    android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                    int r2 = r2 + 119
                    int r1 = r2 % 128
                    o.getLock.read = r1
                    int r2 = r2 % r0
                L83:
                    int r1 = o.getLock.read
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    o.getLock.IconCompatParcelizer = r2
                    int r1 = r1 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getLock.invoke():java.lang.Object");
            }
        });
    }

    public final Object write(ChatAssetsDownloadingWorker.AnonymousClass1 anonymousClass1) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.IconCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new DiskLruCache$launchCleanup$1(this, null, 21), anonymousClass1);
        int i2 = MediaMetadataCompat + 95;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }
}
