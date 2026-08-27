package com.huawei.riemann.location.bean.log;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.accesstoViewVelocity;
import o.setFontSizeR2X_6o;
import o.toViewVelocity;

/* JADX INFO: loaded from: classes5.dex */
public class BdsTim {
    private static short[] MediaDescriptionCompat;
    public List<BdsTimItem> timList = new ArrayList();
    public int timNumber;
    private static final byte[] $$c = {87, 13, 87, -97};
    private static final int $$d = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {41, -125, -85, 4, -12, 15, -7, -6, 13, -1, 19, -19, 15, -11, -2, 5, 0, 17, 5, -5};
    private static final int $$b = 33;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long serializer = 1119269572049423742L;
    private static int RemoteActionCompatParcelizer = -1216798513;
    private static int read = 459299251;
    private static int IconCompatParcelizer = 644781603;
    private static byte[] write = {-75, 87, 89, 82, -122, 71, -79, -69, 3, -119, -81, 81, -77, -98, 114, 103, 106, 1, -15, 9, -45, 40, -26, -24, 21, 9, 8, 15, -4, 4, -33, -20, 28, -28, 62, -59, 11, 5, 2, -86, 26, 20, -24, -30, 13, -31, -19, 90, -46, -12, 10, -24, 19, -28, 28, -4, 16, 20, 52, -60, 30, -17, 100, -104, -119, 124, -109, 98, 3, 8, -32, 28, -16, 12, -14, 5, -15, 18, -20, -20, 31, -12, -29, -7, 3, -22, 54, 3, 8, 0, -72, 72, -8, -10, 10, 0, -17, 3, 15, -72, 48, 22, -24, 10, 124, 54, -50, 38, -38, 56, -62, 60, 43, -32, 60, 61, 36, -30, 33, 47, 40, -128, 48, 62, -62, -56, 39, -53, -57, 112, -8, -34, 32, -62, 32, -46, 46, -1, -62, -58, 62, -44, -57, -34, 36, 52, -42, 59, 63, -58, 56, 48, -57, -56, -25, -48, 127, -57, -56, -57, -16, 112, -64, -50, 50, 56, -41, 59, 55, -128, 8, 46, -48, 50, -13, 13, -7, 0, -7, 37, -35, 3, -14, -52, -55, 55, -55, 54, -50, 63, -51, -53, -54, -54, -55, 55, -55, 48, -52, 55, -55, 50, -62, 49, -49, 55, 95, -90, -92, -92, 71, 80, -87, 89, -86, -90, 94, 83, -100, 126, -96, 81, -4, 14, -15, 0, -62, 44, 0, 10, -58, -27, 78, -9, 10, -79, 60, 26, -28, 6, 13, -6, 2, -5, 41, -40, 79, 73, -107, -88, 113, 79, -69, 67, -120, 123, 93, -93, 65, 89, -82, 65, 112, -99, -80, -70, 118, -110, -70, 13, -1, 12, -9, -32, -25, 66, -23, 6, 1, -2, -7, 11, -68, 63, 1, -11, 13, -58, 53, 19, -19, 15, 93, 81, -96, 95, -95, 89, -87, 126, -123, 83, -94, 19, -15, 9, -17, -17, 39, -10, -85, -87, 123, -72, -94, -93, 95, 81, 77, -128, 81, -96, 50, -61, 30, -33, -59, 61, -51, 51, 57, 42, 25, -6, -58, 121, -127, 61, 50, -54, 61, -60, 55, 14, -15, -64, -63, -58, 53, -51, 54, 46, 33, -47, -47, 42, -92, 90, 88, 59, 59, -42, 39, -48, 49, 59, -44, 24, -26, 63, 60, -50, 59, 67, 79, -91, -81, 126, -66, 79, 27, -20, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108, -108};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.huawei.riemann.location.bean.log.BdsTim.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = 115 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.riemann.location.bean.log.BdsTim.$$e(short, short, int):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.riemann.location.bean.log.BdsTim.$$a
            int r1 = r8 + 3
            int r6 = r6 + 103
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 2
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L28:
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.riemann.location.bean.log.BdsTim.c(short, int, short, java.lang.Object[]):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        accesstoViewVelocity accesstoviewvelocity = new accesstoViewVelocity();
        accesstoviewvelocity.IconCompatParcelizer = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i3 = accesstoviewvelocity.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[accesstoviewvelocity.write]), accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1166805757);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getTrimmedLength("") + 45251), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2178, TextUtils.getTrimmedLength("") + 14, 1789121762, false, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (serializer ^ 7879248456549226868L);
                Object[] objArr3 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Color.rgb(0, 0, 0) + 16777216), 230 - TextUtils.lastIndexOf("", '0', 0), 20 - ExpandableListView.getPackedPositionChild(0L), 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $10 + 61;
                $11 = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i6 = $10 + 125;
            $11 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
            Object[] objArr4 = {accesstoviewvelocity, accesstoviewvelocity};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getOffsetAfter("", 0), 231 - (ViewConfiguration.getLongPressTimeout() >> 16), 21 - KeyEvent.keyCodeFromString(""), 107586304, false, "e", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, byte b, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(read)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (AndroidCharacter.getMirror('0') + 15447), 16780037 + Color.rgb(0, 0, 0), TextUtils.indexOf("", "") + 17, 1193962993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 111;
                $11 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $10 + 77;
                $11 = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                byte[] bArr = write;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b4 = (byte) i6;
                            byte b5 = (byte) (b4 - 2);
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.myTid() >> 22) + 4453), 2484 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 59692417, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i12++;
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = write;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15495 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 2821, 17 - (Process.myTid() >> 22), 1193962993, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) read) ^ (-565326573115254380L))));
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) MediaDescriptionCompat[i3 + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) read) ^ (-565326573115254380L))));
                    int i13 = $10 + 19;
                    $11 = i13 % Fields.SpotShadowColor;
                    i5 = 2;
                    int i14 = i13 % 2;
                }
            } else {
                i5 = 2;
            }
            if (iIntValue > 0) {
                toviewvelocity.RemoteActionCompatParcelizer = ((i3 + iIntValue) - i5) + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L))) + i4;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i), Integer.valueOf(IconCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 2410 - TextUtils.indexOf((CharSequence) "", '0'), 14 - MotionEvent.axisFromString(""), 1203812429, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = write;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ (-565326573115254380L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 21;
                    $11 = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    int i18 = $11 + 23;
                    int i19 = i18 % Fields.SpotShadowColor;
                    $10 = i19;
                    int i20 = i18 % 2;
                    if (z) {
                        int i21 = i19 + 65;
                        $11 = i21 % Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        byte[] bArr6 = write;
                        int i23 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i23 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i23]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = MediaDescriptionCompat;
                        int i24 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i24 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i24]) ^ (-565326573115254380L))) + s)) ^ b));
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 278721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] RemoteActionCompatParcelizer(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 27872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.riemann.location.bean.log.BdsTim.RemoteActionCompatParcelizer(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }
}
