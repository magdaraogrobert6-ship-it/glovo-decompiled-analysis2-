package com.roadrunner.rider.support.implementation.data;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import o.QueryListener;
import o.extractIntegerPixels;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class RiderSupportBatchRequestLogger {
    public static final Companion Companion;
    private static int IconCompatParcelizer;
    private static char read;
    private static char[] serializer;
    private static final byte[] $$a = {110, 41, 54, -101};
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static int write = 0;

    private static String $$c(short s, int i, int i2) {
        int i3 = 105 - (i * 2);
        int i4 = 4 - (s * 4);
        byte[] bArr = $$a;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            int i9 = i4 + 1;
            i3 = i8 + bArr[i4];
            i4 = i9;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if ((r5 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        
            timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new java.lang.Object[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        
            ((o.QueryListener) r1.write).serializer.set(r5);
            r5 = com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.IconCompatParcelizer + 55;
            com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void logBatchRequestFailed(long r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.write
                int r1 = r1 + 19
                int r2 = r1 % 128
                com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.IconCompatParcelizer = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L16
                io.sentry.CombinedScopeView r1 = o.DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer
                r3 = 7
                int r3 = r3 / r2
                if (r1 == 0) goto L31
                goto L1a
            L16:
                io.sentry.CombinedScopeView r1 = o.DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer
                if (r1 == 0) goto L31
            L1a:
                java.lang.Object r1 = r1.write
                o.QueryListener r1 = (o.QueryListener) r1
                java.util.concurrent.atomic.AtomicLong r1 = r1.serializer
                r1.set(r5)
                int r5 = com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.IconCompatParcelizer
                int r5 = r5 + 55
                int r6 = r5 % 128
                com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.write = r6
                int r5 = r5 % r0
                if (r5 == 0) goto L2f
                return
            L2f:
                r5 = 0
                throw r5
            L31:
                timber.log.Timber$Forest r5 = timber.log.Timber.RemoteActionCompatParcelizer
                java.lang.Object[] r6 = new java.lang.Object[r2]
                java.lang.String r0 = "Rider Support: Logger not initialized"
                r5.RemoteActionCompatParcelizer(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger.Companion.logBatchRequestFailed(long):void");
        }

        public final void logBatchRequestSucceeded(long j) {
            int i = 2 % 2;
            int i2 = write + 73;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            CombinedScopeView combinedScopeView = DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer;
            if (combinedScopeView == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Rider Support: Logger not initialized", new Object[0]);
                return;
            }
            int i4 = write + 117;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ((QueryListener) combinedScopeView.write).serializer.set(j);
            } else {
                ((QueryListener) combinedScopeView.write).serializer.set(j);
                throw null;
            }
        }
    }

    static {
        IconCompatParcelizer = 1;
        serializer();
        Companion = new Companion(null);
        int i = write + 81;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void logBatchRequestFailed(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i2 = MediaMetadataCompat + 91;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr = {Long.valueOf(j3)};
                Object[] objArr2 = new Object[1];
                a(new char[]{21, 22, 13932}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 125), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, objArr2);
                Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr3 = new Object[0];
                Object[] objArr4 = new Object[1];
                a(new char[]{14, '\t', 23, 22, 20, 5, 11, '\t', 13802, 13802, '\n', 20, 16, 2, 3, '\n', 7, '\n', 11, 22, 20, 5, 0, 7, 15, 2, 0, 3, 2, 19, 0, 14, 19, 1, 6, 22, 13822}, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                String str = (String) objArr4[0];
                int i4 = RemoteActionCompatParcelizer;
                int i5 = i4 + 53;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
                int i7 = i4 + 41;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    Class[] clsArr = new Class[3];
                    clsArr[0] = String.class;
                    clsArr[0] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(true);
                    method2.invoke(obj3, str, objArr3);
                } else {
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method3.setAccessible(true);
                    method3.invoke(obj3, str, objArr3);
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

    public static final void logBatchRequestSucceeded(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i4 = MediaMetadataCompat + 5;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr = {Long.valueOf(j3)};
                Object[] objArr2 = new Object[1];
                a(new char[]{21, 22, 13932}, (byte) (126 - Color.red(0)), Color.alpha(0) + 3, objArr2);
                Method method = AtomicLong.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr3 = new Object[0];
                Object[] objArr4 = new Object[1];
                a(new char[]{14, '\t', 23, 22, 20, 5, 11, '\t', 13802, 13802, '\n', 20, 16, 2, 3, '\n', 7, '\n', 11, 22, 20, 5, 0, 7, 15, 2, 0, 3, 2, 19, 0, 14, 19, 1, 6, 22, 13822}, (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 37 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
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

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = serializer;
        if (cArr2 != null) {
            int i4 = $11 + 47;
            $10 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2015 - ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 234961161, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
        if (objRemoteActionCompatParcelizer2 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 1);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Color.red(0), 2015 - View.MeasureSpec.getSize(0), ImageFormat.getBitsPerPixel(0) + 25, 234961161, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 15;
            $10 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            extractintegerpixels.IconCompatParcelizer = 0;
            while (extractintegerpixels.IconCompatParcelizer < i2) {
                int i9 = $11 + 51;
                $10 = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                if (extractintegerpixels.read == extractintegerpixels.write) {
                    int i11 = $10 + 115;
                    $11 = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                } else {
                    Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) + 141, View.MeasureSpec.getMode(0) + 18, -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                        Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 2370, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1616580640, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i13 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i13];
                    } else if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                        int i14 = $10 + 49;
                        $11 = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                        extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                        int i16 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                        int i17 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i16];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i17];
                    } else {
                        int i18 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                        int i19 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i18];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i19];
                    }
                }
                extractintegerpixels.IconCompatParcelizer += 2;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $10 + 21;
            $11 = i21 % Fields.SpotShadowColor;
            if (i21 % 2 == 0) {
                cArr4[i20] = (char) (cArr4[i20] ^ 23548);
                i20 += 124;
            } else {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void serializer() {
        serializer = new char[]{52524, 52534, 52578, 52520, 52581, 52579, 52601, 52598, 52521, 52574, 52589, 52523, 52587, 52544, 52575, 52606, 52576, 52600, 52604, 52525, 52607, 52585, 52584, 52566, 52522};
        read = (char) 63635;
    }
}
