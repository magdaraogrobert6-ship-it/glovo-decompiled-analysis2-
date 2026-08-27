package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvAudioDescriptionMixingVolumeUpcp {
    private static final byte[] $$a = {118, 85, -10, -52, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 50, 9, -5, -3, -1, -4, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -14};
    private static final int $$b = 178;
    public static final Object read = new Object();
    public static volatile accessgetTvAudioDescriptionMixingVolumeUpcp serializer;
    public final ConcurrentHashMap write = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r7 = r7 + 99
            int r8 = r8 * 2
            int r0 = 42 - r8
            byte[] r1 = o.accessgetTvAudioDescriptionMixingVolumeUpcp.$$a
            byte[] r0 = new byte[r0]
            int r8 = 41 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + 3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetTvAudioDescriptionMixingVolumeUpcp.a(int, byte, byte, java.lang.Object[]):void");
    }

    public static accessgetTvAudioDescriptionMixingVolumeUpcp RemoteActionCompatParcelizer() {
        if (serializer == null) {
            synchronized (read) {
                if (serializer == null) {
                    serializer = new accessgetTvAudioDescriptionMixingVolumeUpcp();
                }
            }
        }
        accessgetTvAudioDescriptionMixingVolumeUpcp accessgettvaudiodescriptionmixingvolumeupcp = serializer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgettvaudiodescriptionmixingvolumeupcp);
        return accessgettvaudiodescriptionmixingvolumeupcp;
    }

    public final void IconCompatParcelizer(Context context, ServiceConnection serviceConnection) {
        byte b = (byte) ($$a[30] + 1);
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        if (!Class.forName((String) objArr[0]).isInstance(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.write;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean read(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return IconCompatParcelizer(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    public final boolean IconCompatParcelizer(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((accessgetTvMediaContextMenucp.serializer(context).write(0, component.getPackageName()).flags & 2097152) != 0) {
                    SentryLogcatAdapter.IconCompatParcelizer("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        byte b = (byte) ($$a[30] + 1);
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        if (Class.forName((String) objArr[0]).isInstance(serviceConnection)) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.write;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            SentryLogcatAdapter.IconCompatParcelizer("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
