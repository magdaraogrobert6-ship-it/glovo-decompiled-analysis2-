package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getOnSessionTrackingFailedListener {
    private static short[] RemoteActionCompatParcelizer;
    private static final byte[] $$c = {50, -78, 20, 58};
    private static final int $$d = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {85, -79, -103, -49, -18, -9, -2, -10, -14, 6, -20, 21, -5, 6, -2, -12};
    private static final int $$b = 8;
    private static int RatingCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer = 998127824;
    private static int IconCompatParcelizer = 459299284;
    private static int read = 1116445980;
    private static byte[] write = {104, -121, 101, -110, 107, -72, -127, 46, -110, -99, 101, -110, 107, -104, -95, 94, 111, 110, 105, -102, 98, -103, 108, -104, -121, 125, 106, -110, 98, -100, -106, -123, 72, -101, 106, 97, -97, 115, 102, 107, 2, -97, 101, -121, -97, -108, 109, 109, 65, 106, -110, 98, -100, -106, 101, -126, 110, 105, 105, 107, -123, 110, -106, 110, 103, -123, -107, -103, 106, -110, 103, -103, -128, 64, -126, 110, 105, 105, -117, 127, -106, 110, 103, -123, -75, -126, 84, -111, 104, -99, -105, -89, 42, -108, -101, -89, 94, 111, 110, 105, -102, 98, -103, -111, -111, 104, -99, -73, 72, 123, -103, 97, -123, -74, 89, -101, 106, 121, -121, 105, -111, 120, -103, 100, -45, 95, 111, 110, 105, -102, 98, -103, -89, 34, -99, -103, 111, -83, 85, 106, -104, -96, 90, 121, -121, 105, -95, 90, 121, -121, 105, -95, 99, -45, 94, -106, -106, 101, 105, -47, 86, -97, 120, -123, -94, 94, 111, 110, 105, -102, 98, -103, -89, 93, 99, 107, -105, -99, -95, 85, 106, -104, -96, 90, 121, -121, 105, -95, 90, 121, -121, 105, -95, 97, -47, 84, -103, 121, -97, 97, -46, 46, -97, 111, -111, -82, 88, 123, -101, -94, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108};
    private static long MediaSessionCompatQueueItem = -7009568347796326538L;
    private static int MediaDescriptionCompat = -658032778;
    private static char MediaMetadataCompat = 63127;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, int r6, short r7) {
        /*
            byte[] r0 = o.getOnSessionTrackingFailedListener.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r7 = r7 + 104
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getOnSessionTrackingFailedListener.$$e(short, int, short):java.lang.String");
    }

    private static void c(short s, byte b, short s2, Object[] objArr) {
        int i = 14 - s;
        int i2 = b + 75;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[s2 + 3];
        int i3 = s2 + 2;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = i2 + i + 5;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            int i7 = i + 1;
            i4 = i5;
            i2 = i6 + bArr[i] + 5;
            i = i7;
        }
    }

    public static RiderSafetyReportFragment RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        RiderSafetyReportFragment riderSafetyReportFragment = new RiderSafetyReportFragment();
        int i2 = RatingCompat + 29;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return riderSafetyReportFragment;
    }

    private static void a(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i5 = $10 + 27;
            $11 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), Gravity.getAbsoluteGravity(0, 0) + 231, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20, 1436720535, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 2547, android.graphics.Color.red(0) + 30, -73045399, false, $$e(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {accesstooffsetmowrbkg, Integer.valueOf(cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), View.resolveSize(0, 0) + 887, android.view.KeyEvent.getDeadChar(0, 0) + 60, -562850980, false, $$e(b3, b4, (byte) (b4 | 7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b5 = (byte) 0;
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (65450 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1244 - android.graphics.Color.alpha(0), 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1854554309, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (MediaSessionCompatQueueItem ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaDescriptionCompat) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaMetadataCompat) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
                int i7 = $10 + 7;
                $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(byte b, int i, short s, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int length;
        byte[] bArr;
        int i4;
        int length2;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IconCompatParcelizer)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15494), 2820 - TextUtils.indexOf((CharSequence) "", '0', 0), 17 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1193962993, false, $$e(b2, b3, (byte) (b3 | 10)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 89;
                $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $10 + 107;
                int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                $11 = i10;
                int i11 = i9 % 2;
                byte[] bArr3 = write;
                if (bArr3 != null) {
                    int i12 = i10 + 77;
                    $10 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 0;
                    }
                    while (i5 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i5])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4453), 2485 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 18 - View.resolveSizeAndState(0, 0, 0), 59692417, false, $$e(b4, b5, (byte) (b5 | 9)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i5++;
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = write;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(serializer)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15496 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 2821 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, 1193962993, false, $$e(b6, b7, (byte) (b7 | 10)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) IconCompatParcelizer) ^ (-565326573115254380L))));
                    j = -565326573115254380L;
                } else {
                    j = -565326573115254380L;
                    iIntValue = (short) (((short) (((long) RemoteActionCompatParcelizer[i + ((int) (((long) serializer) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) IconCompatParcelizer) ^ (-565326573115254380L))));
                }
            } else {
                j = -565326573115254380L;
            }
            if (iIntValue > 0) {
                toviewvelocity.RemoteActionCompatParcelizer = ((i + iIntValue) - 2) + ((int) (((long) serializer) ^ j)) + (!z ? 0 : 1);
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i3), Integer.valueOf(read), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2411, 15 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1203812429, false, $$e(b8, b9, (byte) (b9 | 11)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr5 = write;
                if (bArr5 != null) {
                    int i13 = $10 + 3;
                    $11 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        bArr[i4] = (byte) (((long) bArr5[i4]) ^ (-565326573115254380L));
                        i4++;
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    int i14 = $11 + 113;
                    $10 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = write;
                        int i15 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i15 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i15]) ^ (-565326573115254380L))) + s)) ^ b));
                        int i16 = $11 + 77;
                        $10 = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            int i17 = 3 % 4;
                        }
                    } else {
                        short[] sArr = RemoteActionCompatParcelizer;
                        int i18 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i18 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i18]) ^ (-565326573115254380L))) + s)) ^ b));
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

    /* JADX INFO: Infinite loop detected, blocks: 9, insns: 0 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 84041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] write(android.content.Context r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 8404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getOnSessionTrackingFailedListener.write(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
