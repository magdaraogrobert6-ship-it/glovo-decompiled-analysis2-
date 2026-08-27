package com.roadrunner.rider.support.implementation.data;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.NestedScrollInteropConnectionKt;
import o.QueryListener;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class RiderSupportBreakRequestLogger {
    public static final Companion Companion;
    private static int read;
    private static long serializer;
    private static final byte[] $$a = {20, 111, -65, 89};
    private static final int $$b = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    private static int IconCompatParcelizer = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            byte[] r0 = com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger.$$a
            int r8 = r8 * 4
            int r8 = r8 + 117
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger.$$c(short, short, int):java.lang.String");
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void logBreakRequestFailed(long j) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 35;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                CombinedScopeView combinedScopeView = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CombinedScopeView combinedScopeView2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
            if (combinedScopeView2 == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new Object[0]);
                return;
            }
            ((QueryListener) combinedScopeView2.write).serializer.set(j);
            int i3 = read + 71;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 53 / 0;
            }
        }

        public final void logBreakRequestSucceeded(long j) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 105;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                CombinedScopeView combinedScopeView = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
                throw null;
            }
            CombinedScopeView combinedScopeView2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
            if (combinedScopeView2 == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new Object[0]);
                return;
            }
            int i3 = IconCompatParcelizer + 99;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ((QueryListener) combinedScopeView2.write).serializer.set(j);
            } else {
                ((QueryListener) combinedScopeView2.write).serializer.set(j);
                throw null;
            }
        }

        public final void logShortBreakRequestFailed(long j) {
            int i = 2 % 2;
            int i2 = read + 109;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            CombinedScopeView combinedScopeView = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
            if (combinedScopeView == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new Object[0]);
                int i4 = read + 103;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            int i6 = read + 83;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                ((QueryListener) combinedScopeView.write).serializer.set(j);
                return;
            }
            ((QueryListener) combinedScopeView.write).serializer.set(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void logShortBreakRequestSucceeded(long j) {
            int i = 2 % 2;
            CombinedScopeView combinedScopeView = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
            if (combinedScopeView == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new Object[0]);
                return;
            }
            int i2 = IconCompatParcelizer + 13;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((QueryListener) combinedScopeView.write).serializer.set(j);
            int i4 = IconCompatParcelizer + 3;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    static {
        read = 1;
        read();
        Companion = new Companion(null);
        int i = IconCompatParcelizer + 95;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void logBreakRequestFailed(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i2 = write + 73;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object[] objArr = {Long.valueOf(j3)};
                Object[] objArr2 = new Object[1];
                a(TextUtils.getCapsMode("", 0, 0) + 1, new char[]{27219, 49471, 27168, 21321, 46315, 37049, 7187}, objArr2);
                Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr);
                int i4 = write + 119;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr3 = new Object[0];
                Object[] objArr4 = new Object[1];
                a(-ImageFormat.getBitsPerPixel(0), new char[]{38957, 4970, 39039, 33040, 30686, 21404, 56254, 53267, 51477, 28130, 7167, 37650, 2245, 12721, 49935, 11073, 16573, 31143, 35572, 58035, 47474, 41038, 13039, 47854, 61731, 59589, 64018, 29240, 10641, 20625, 41561, 1421, 25168, 40761, 27021, 56782, 55841, 51056, 4386, 38174, 4837}, objArr4);
                Object[] objArr5 = {(String) objArr4[0], objArr3};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr5);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r6 r8
  0x0034: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:8:0x0032, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v14 java.lang.Object) binds: [B:8:0x0032, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void logBreakRequestSucceeded(long j, long j2) throws Throwable {
        long j3;
        Object obj;
        int i = 2 % 2;
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                j3 = j * (j2 << 84);
                obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
                if (obj != null) {
                    Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                    int i3 = write + 43;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    Object[] objArr = {Long.valueOf(j3)};
                    Object[] objArr2 = new Object[1];
                    a(1 - View.MeasureSpec.getMode(0), new char[]{27219, 49471, 27168, 21321, 46315, 37049, 7187}, objArr2);
                    Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                    method.setAccessible(true);
                    method.invoke(obj2, objArr);
                } else {
                    Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                    Object[] objArr3 = new Object[0];
                    Object[] objArr4 = new Object[1];
                    a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, new char[]{38957, 4970, 39039, 33040, 30686, 21404, 56254, 53267, 51477, 28130, 7167, 37650, 2245, 12721, 49935, 11073, 16573, 31143, 35572, 58035, 47474, 41038, 13039, 47854, 61731, 59589, 64018, 29240, 10641, 20625, 41561, 1421, 25168, 40761, 27021, 56782, 55841, 51056, 4386, 38174, 4837}, objArr4);
                    String str = (String) objArr4[0];
                    int i5 = write + 73;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method2.setAccessible(true);
                    method2.invoke(obj3, str, objArr3);
                }
            } else {
                j3 = j ^ (j2 << 32);
                obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
                if (obj != null) {
                    Object obj4 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                    int i7 = write + 43;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    Object[] objArr5 = {Long.valueOf(j3)};
                    Object[] objArr6 = new Object[1];
                    a(1 - View.MeasureSpec.getMode(0), new char[]{27219, 49471, 27168, 21321, 46315, 37049, 7187}, objArr6);
                    Method method3 = AtomicLong.class.getMethod((String) objArr6[0], Long.TYPE);
                    method3.setAccessible(true);
                    method3.invoke(obj4, objArr5);
                } else {
                    Object obj5 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                    Object[] objArr7 = new Object[0];
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, new char[]{38957, 4970, 39039, 33040, 30686, 21404, 56254, 53267, 51477, 28130, 7167, 37650, 2245, 12721, 49935, 11073, 16573, 31143, 35572, 58035, 47474, 41038, 13039, 47854, 61731, 59589, 64018, 29240, 10641, 20625, 41561, 1421, 25168, 40761, 27021, 56782, 55841, 51056, 4386, 38174, 4837}, objArr8);
                    String str2 = (String) objArr8[0];
                    int i9 = write + 73;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    Method method4 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method4.setAccessible(true);
                    method4.invoke(obj5, str2, objArr7);
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final void logShortBreakRequestFailed(long j, long j2) throws Throwable {
        Object obj;
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj2 != null) {
                int i2 = RemoteActionCompatParcelizer + 45;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                    int i3 = 79 / 0;
                } else {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                }
                int i4 = RemoteActionCompatParcelizer + 85;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr = {Long.valueOf(j3)};
                Object[] objArr2 = new Object[1];
                a(Color.argb(0, 0, 0, 0) + 1, new char[]{27219, 49471, 27168, 21321, 46315, 37049, 7187}, objArr2);
                Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj, objArr);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr3 = new Object[0];
                Object[] objArr4 = new Object[1];
                a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{38957, 4970, 39039, 33040, 30686, 21404, 56254, 53267, 51477, 28130, 7167, 37650, 2245, 12721, 49935, 11073, 16573, 31143, 35572, 58035, 47474, 41038, 13039, 47854, 61731, 59589, 64018, 29240, 10641, 20625, 41561, 1421, 25168, 40761, 27021, 56782, 55841, 51056, 4386, 38174, 4837}, objArr4);
                Object[] objArr5 = {(String) objArr4[0], objArr3};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr5);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final void logShortBreakRequestSucceeded(long j, long j2) throws Throwable {
        Object obj;
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj2 != null) {
                int i2 = write + 5;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                    int i3 = 63 / 0;
                } else {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                }
                int i4 = RemoteActionCompatParcelizer + 29;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr = {Long.valueOf(j3)};
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{27219, 49471, 27168, 21321, 46315, 37049, 7187}, objArr2);
                Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj, objArr);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr3 = new Object[0];
                Object[] objArr4 = new Object[1];
                a(TextUtils.getTrimmedLength("") + 1, new char[]{38957, 4970, 39039, 33040, 30686, 21404, 56254, 53267, 51477, 28130, 7167, 37650, 2245, 12721, 49935, 11073, 16573, 31143, 35572, 58035, 47474, 41038, 13039, 47854, 61731, 59589, 64018, 29240, 10641, 20625, 41561, 1421, 25168, 40761, 27021, 56782, 55841, 51056, 4386, 38174, 4837}, objArr4);
                Object[] objArr5 = {(String) objArr4[0], objArr3};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr5);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        NestedScrollInteropConnectionKt nestedScrollInteropConnectionKt = new NestedScrollInteropConnectionKt();
        char[] cArr2 = NestedScrollInteropConnectionKt.read(serializer ^ (-9145095368803948559L), cArr, i);
        nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer = 4;
        while (nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer < cArr2.length) {
            int i3 = $10 + 113;
            $11 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            nestedScrollInteropConnectionKt.read = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer - 4;
            int i5 = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer;
            try {
                Object[] objArr2 = {Long.valueOf(cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer] ^ cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer % 4]), Long.valueOf(nestedScrollInteropConnectionKt.read), Long.valueOf(serializer)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(533537292);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (58679 - TextUtils.indexOf((CharSequence) "", '0')), 1930 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - ExpandableListView.getPackedPositionGroup(0L), -820182035, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nestedScrollInteropConnectionKt, nestedScrollInteropConnectionKt};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1638115501);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Color.argb(0, 0, 0, 0), 2193 - View.MeasureSpec.getMode(0), TextUtils.indexOf("", "") + 28, -1317828276, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr2, 4, cArr2.length - 4);
        int i6 = $11 + 117;
        $10 = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void read() {
        serializer = -1057548210938874398L;
    }
}
