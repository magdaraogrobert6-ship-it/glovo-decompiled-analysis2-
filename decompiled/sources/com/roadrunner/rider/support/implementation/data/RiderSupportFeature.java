package com.roadrunner.rider.support.implementation.data;

import android.content.Context;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessstartTrackingTable;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFontSizeR2X_6o;
import o.toViewVelocity;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class RiderSupportFeature {
    public static final Companion Companion;
    private static short[] IconCompatParcelizer;
    private static int MediaSessionCompatQueueItem;
    private static int RemoteActionCompatParcelizer;
    private static final getContentViewGroupParentLayout coroutineScope;
    private static int read;
    private static byte[] serializer;
    private static int write;
    private static final byte[] $$a = {100, 73, 105, -29};
    private static final int $$b = Fields.SpotShadowColor;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RatingCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.roadrunner.rider.support.implementation.data.RiderSupportFeature.$$a
            int r8 = r8 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r7 = r7 + 1
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.support.implementation.data.RiderSupportFeature.$$c(int, int, byte):java.lang.String");
    }

    public static final /* synthetic */ getContentViewGroupParentLayout access$getCoroutineScope$cp() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = coroutineScope;
        int i5 = i3 + 97;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getcontentviewgroupparentlayout;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        private static int read = 0;
        private static int write = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void killAppProcess() {
            int i = 2 % 2;
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }

        public final void logIn(Context context, long j) {
            int i = 2 % 2;
            Timber.RemoteActionCompatParcelizer.write(new accessstartTrackingTable(af$$ExternalSyntheticOutline0.m(j, "Rooted device "), 10));
            BuildersKt.RemoteActionCompatParcelizer(RiderSupportFeature.access$getCoroutineScope$cp(), null, null, new RiderSupportFeature$Companion$logIn$1(context, null), 3);
            int i2 = read + 83;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
    }

    static {
        MediaSessionCompatQueueItem = 0;
        IconCompatParcelizer();
        Companion = new Companion(null);
        coroutineScope = YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
        int i = MediaDescriptionCompat + 63;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void logIn(Context context, long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
        Object[] objArr = new Object[1];
        a((byte) ((-77) - (ViewConfiguration.getScrollBarSize() >> 8)), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 6), (-43) - Gravity.getAbsoluteGravity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1743534443, 1131707483 - (Process.myPid() >> 22), objArr);
        try {
            Object[] objArr2 = {Long.valueOf(j3), (String) objArr[0]};
            Object[] objArr3 = new Object[1];
            a((byte) (84 - View.MeasureSpec.getSize(0)), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 71), View.resolveSize(0, 0) - 56, (Process.myPid() >> 22) + 1743534470, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1131707496, objArr3);
            Method method = af$$ExternalSyntheticOutline0.class.getMethod((String) objArr3[0], Long.TYPE, String.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, objArr2);
            int i4 = MediaBrowserCompatMediaItem + 81;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object[] objArr4 = {objInvoke, 10};
            Constructor declaredConstructor = accessstartTrackingTable.class.getDeclaredConstructor(String.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            Object[] objArr5 = {declaredConstructor.newInstance(objArr4)};
            Method method2 = Timber.Forest.class.getMethod("write", Throwable.class);
            method2.setAccessible(true);
            method2.invoke(obj, objArr5);
            getContentViewGroupParentLayout getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp = access$getCoroutineScope$cp();
            Constructor declaredConstructor2 = RiderSupportFeature$Companion$logIn$1.class.getDeclaredConstructor(Context.class, ShortNewsContentCardView.class);
            declaredConstructor2.setAccessible(true);
            Object[] objArr6 = {getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp, null, null, declaredConstructor2.newInstance(context, null), 3};
            Method method3 = BuildersKt.class.getMethod("RemoteActionCompatParcelizer", getContentViewGroupParentLayout.class, TextAnnouncementContentCardView.class, CoroutineStart.class, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0.class, Integer.TYPE);
            method3.setAccessible(true);
            method3.invoke(null, objArr6);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15496 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2821 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 17, 1193962993, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 37;
                $11 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = serializer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getOffsetBefore("", 0) + 4453), View.combineMeasuredStates(0, 0) + 2484, 18 - (ViewConfiguration.getEdgeSlop() >> 16), 59692417, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = serializer;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(read)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15495 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 2821 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, 1193962993, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L))));
                    int i9 = $10 + 65;
                    $11 = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    j = -565326573115254380L;
                } else {
                    j = -565326573115254380L;
                    iIntValue = (short) (((short) (((long) IconCompatParcelizer[i3 + ((int) (((long) read) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L))));
                }
            } else {
                j = -565326573115254380L;
            }
            if (iIntValue > 0) {
                int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) read) ^ j));
                if (z) {
                    int i12 = $11 + 19;
                    $10 = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                toviewvelocity.RemoteActionCompatParcelizer = i11 + i4;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i2), Integer.valueOf(write), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2411, TextUtils.getTrimmedLength("") + 15, 1203812429, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = serializer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $10 + 7;
                        $11 = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-565326573115254380L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 109;
                    $11 = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    if (!(!z2)) {
                        byte[] bArr6 = serializer;
                        int i18 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i18 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i18]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = IconCompatParcelizer;
                        int i19 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i19 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i19]) ^ (-565326573115254380L))) + s)) ^ b));
                    }
                    sb.append(toviewvelocity.serializer);
                    toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                    toviewvelocity.read++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IconCompatParcelizer() {
        read = -1477715407;
        RemoteActionCompatParcelizer = 459299245;
        write = -2089574541;
        serializer = new byte[]{-103, 34, -38, -47, 51, 35, 104, -128, -59, -45, 47, 44, 39, -108, -108};
    }
}
