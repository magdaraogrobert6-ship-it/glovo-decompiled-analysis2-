package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidQuerybindBytes1 extends AndroidPreparedStatement {
    private static int IconCompatParcelizer;
    private static char[] RemoteActionCompatParcelizer;
    public static final AndroidQuerybindBytes1 write;
    private static final byte[] $$c = {100, -70, -73, -7};
    private static final int $$f = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -68, 1, -105, 63, -55, -11, -5, -6, 12, 16, -20, -16, -2, 8, -8, -1, 0, 9, -14, 9, -4, 1, 46, -21, -10, -4, -7, 13, 34, -36, -19, 9, -8, -1, 41, -46, 0, -5, 13, -21, 34, -19, -19, 13, -4, -9, 1, -19, 19, -15, 63, -59, 0, -17, 31, -20, -15, 7, 6, -13, 1, -19, 19, -15, 10, -19, 15, 5, -6, -11, 1, 2, -11, -8, 19, -21, 11, -9, 5, 2, -20, 12, -2, -63};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {87, -111, 66, 14, 13, 4, -3, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 0;
    private static int read = 0;
    private static int RatingCompat = 1;
    private static int serializer = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 3
            int r7 = 122 - r7
            byte[] r1 = o.AndroidQuerybindBytes1.$$c
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidQuerybindBytes1.$$g(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.AndroidQuerybindBytes1.$$a
            int r6 = 114 - r6
            int r7 = r7 * 8
            int r7 = r7 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            int r8 = r8 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidQuerybindBytes1.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 36
            int r7 = r7 + 4
            byte[] r0 = o.AndroidQuerybindBytes1.$$d
            int r8 = 33 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidQuerybindBytes1.c(int, short, byte, java.lang.Object[]):void");
    }

    private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        accessgetScrollAxesk4lQ0M accessgetscrollaxesk4lq0m = new accessgetScrollAxesk4lQ0M();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = RemoteActionCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr[i8]);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25206323);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) i2;
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.lastIndexOf("", '0', i2) + 2753, 9 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 783237164, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            accessgetscrollaxesk4lq0m.write = 0;
            char c = 0;
            while (accessgetscrollaxesk4lq0m.write < i5) {
                if (bArr[accessgetscrollaxesk4lq0m.write] == 1) {
                    int i9 = accessgetscrollaxesk4lq0m.write;
                    Object[] objArr3 = {Integer.valueOf(cArr3[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1988698908);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (MotionEvent.axisFromString("") + 52850), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1564, android.graphics.Color.alpha(0) + 37, -1504115971, false, $$g(b3, (byte) (b3 | 18), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    int i10 = $10 + 81;
                    $11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    int i12 = accessgetscrollaxesk4lq0m.write;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(340245898);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.Color.green(0) + 2546, 30 - TextUtils.getOffsetBefore("", 0), -996696981, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[accessgetscrollaxesk4lq0m.write];
                Object[] objArr5 = {accessgetscrollaxesk4lq0m, accessgetscrollaxesk4lq0m};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1705057313);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b6 = (byte) 0;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15495 - (Process.myPid() >> 22)), 2821 - android.graphics.Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 17, 1250869822, false, $$g(b6, (byte) (b6 | 19), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 45;
            $11 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i5];
            int i16 = 0;
            while (true) {
                accessgetscrollaxesk4lq0m.write = i16;
                if (accessgetscrollaxesk4lq0m.write >= i5) {
                    break;
                }
                int i17 = $11 + 47;
                $10 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                cArr6[accessgetscrollaxesk4lq0m.write] = cArr3[(i5 - accessgetscrollaxesk4lq0m.write) - 1];
                i16 = accessgetscrollaxesk4lq0m.write + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i19 = 0;
            while (true) {
                accessgetscrollaxesk4lq0m.write = i19;
                if (accessgetscrollaxesk4lq0m.write >= i5) {
                    break;
                }
                int i20 = $11 + 101;
                $10 = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    cArr3[accessgetscrollaxesk4lq0m.write] = (char) (cArr3[accessgetscrollaxesk4lq0m.write] / iArr[5]);
                    i19 = accessgetscrollaxesk4lq0m.write / 0;
                } else {
                    cArr3[accessgetscrollaxesk4lq0m.write] = (char) (cArr3[accessgetscrollaxesk4lq0m.write] - iArr[2]);
                    i19 = accessgetscrollaxesk4lq0m.write + 1;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        IconCompatParcelizer = 1;
        read();
        write = new AndroidQuerybindBytes1();
        int i = serializer + 13;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return "GoToMain";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -858794711;
    }

    /* JADX WARN: Type inference failed for: r2v106, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = read + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
        if (objRemoteActionCompatParcelizer == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int defaultSize = View.getDefaultSize(0, 0) + 784;
            int iGreen = android.graphics.Color.green(0) + 74;
            byte b = (byte) $$b;
            Object[] objArr3 = new Object[1];
            a(b, b, (byte) (-$$a[17]), objArr3);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup, defaultSize, iGreen, -940932292, false, (String) objArr3[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr4 = new Object[1];
        b(true, new int[]{0, 22, 0, 8}, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(false, new int[]{22, 15, 115, 5}, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 785;
            int packedPositionType = 74 - ExpandableListView.getPackedPositionType(0L);
            byte b2 = (byte) ($$b | 32);
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            a(b2, bArr[30], bArr[20], objArr6);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, iIndexOf, packedPositionType, 150322061, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = RatingCompat + 3;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i6 = 785 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int maximumDrawingCacheSize = 74 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7 = $$b;
                Object[] objArr7 = new Object[1];
                a((byte) (i7 | 41), $$a[20], (byte) (i7 | 29), objArr7);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, i6, maximumDrawingCacheSize, -2100268632, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i8 = ((int[]) objArr8[2])[0];
            int i9 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i10 = 198025289 + (((~(1072919543 | iElapsedRealtime)) | 576737286) * (-756)) + (((~iElapsedRealtime) | 1072919543) * 756) + 1225064369;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(false, new int[]{37, 26, 0, 0}, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(false, new int[]{63, 18, 0, 14}, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(!(applicationContext instanceof ContextWrapper)) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i13 = read + 93;
                    RatingCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 2;
                    }
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            b(false, new int[]{81, 16, 67, 0}, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(true, new int[]{97, 16, 45, 0}, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i15 = RatingCompat + 121;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 1225064369};
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                c(bArr2[16], bArr2[9], (byte) 75, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                c(bArr2[49], bArr2[68], bArr2[23], objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    int i17 = read + 117;
                    RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int iMyPid = 784 - (Process.myPid() >> 22);
                        int keyRepeatDelay = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 74;
                        int i19 = $$b;
                        Object[] objArr16 = new Object[1];
                        a((byte) (i19 | 41), $$a[20], (byte) (i19 | 29), objArr16);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, iMyPid, keyRepeatDelay, -2100268632, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(true, new int[]{0, 22, 0, 8}, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(false, new int[]{22, 15, 115, 5}, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cRed = (char) android.graphics.Color.red(0);
                            int iBlue = android.graphics.Color.blue(0) + 784;
                            int i20 = 74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b3 = (byte) ($$b | 32);
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(b3, bArr3[30], bArr3[20], objArr19);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, iBlue, i20, 150322061, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 784;
                            int iNormalizeMetaState = android.view.KeyEvent.normalizeMetaState(0) + 74;
                            byte b4 = (byte) $$b;
                            Object[] objArr20 = new Object[1];
                            a(b4, b4, (byte) (-$$a[17]), objArr20);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, packedPositionGroup2, iNormalizeMetaState, -940932292, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                        int i21 = RatingCompat + 1;
                        read = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[2])[0];
        if (i24 == i23) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode;
            int i29 = i25 + 538382625 + (((-1073807649) | iIdentityHashCode) * (-676)) + (((~(296665807 | i28)) | 1073807648) * 676) + (((~(iIdentityHashCode | 1370473455)) | (~(i28 | (-1352991023))) | 279183374) * 676);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr21[3])[0] = i31 ^ (i31 << 5);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i32 = ((int[]) objArr21[3])[0];
            int i33 = ((int[]) objArr21[2])[0];
            int i34 = ((int[]) objArr21[0])[0];
            String[] strArr3 = (String[]) objArr21[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = ~((-72929281) | iIdentityHashCode2);
            int i36 = ~iIdentityHashCode2;
            int i37 = i32 + 88829637 + ((i35 | (~((-1487012714) | i36))) * 920) + (((~((-89714837) | i36)) | 72929280) * 920) + (((~(iIdentityHashCode2 | (-1487012714))) | (~((-72929281) | i36)) | (~((-16785557) | iIdentityHashCode2))) * 920);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr2[3])[0] = i39 ^ (i39 << 5);
            int i40 = read + 11;
            RatingCompat = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i41 = i40 % 2;
            c = 3;
        } else {
            try {
                Object[] objArr22 = {Long.valueOf((((long) 1460599621) << 32) ^ (((long) (i23 ^ i24)) & 4294967295L)), Long.valueOf(1460599617)};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[23];
                byte b6 = bArr4[17];
                Object[] objArr23 = new Object[1];
                c(b5, b6, (byte) (b6 | 75), objArr23);
                Class<?> cls6 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                c((byte) 78, (byte) (bArr4[55] - 1), bArr4[17], objArr24);
                cls6.getMethod((String) objArr24[0], Long.TYPE, Long.TYPE).invoke(null, objArr22);
                Object[] objArr25 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i42 = ((int[]) objArr[3])[0];
                int i43 = ((int[]) objArr[2])[0];
                int i44 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[1];
                int i45 = ~(new Random().nextInt(436088452) | 1445021177);
                int i46 = i42 + ((1375797753 | i45) * (-196)) + 40187553 + ((i45 | 69223424) * 196);
                int i47 = (i46 << 13) ^ i46;
                int i48 = i47 ^ (i47 >>> 17);
                ((int[]) objArr25[3])[0] = i48 ^ (i48 << 5);
                Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
                Object[] objArr26 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i49 = ((int[]) objArr25[3])[0];
                int i50 = ((int[]) objArr25[2])[0];
                int i51 = ((int[]) objArr25[0])[0];
                String[] strArr5 = (String[]) objArr25[1];
                int i52 = (int) Runtime.getRuntime().totalMemory();
                int i53 = ~i52;
                int i54 = i49 + (-77971120) + (((~((-1069360170) | i53)) | 580296660) * Constant.ERROR_WSS_SPEED_JUMP) + (((~(i53 | (-489234474))) | (~((-580296661) | i52)) | 170964) * (-113)) + ((~(i52 | (-1069360170))) * 113);
                int i55 = (i54 << 13) ^ i54;
                int i56 = i55 ^ (i55 >>> 17);
                c = 3;
                ((int[]) objArr26[3])[0] = i56 ^ (i56 << 5);
                objArr2 = objArr26;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (this != obj) {
            return obj instanceof AndroidQuerybindBytes1;
        }
        int i57 = ((int[]) objArr2[c])[0];
        int i58 = ((i57 * i57) - (~(-(312011664 * i57)))) - 1;
        int i59 = -(i57 * 1495940244);
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        int i61 = ((i60 | 289984836) << 1) - (289984836 ^ i60);
        int i62 = ((i61 >> 29) - 15) / 8;
        int i63 = ((i62 | 1) << 1) - (i62 ^ 1);
        int i64 = (i61 ^ i63) + ((i63 & i61) << 1);
        int i65 = i61 >> 28;
        int i66 = (((i65 | (-31)) << 1) - (i65 ^ (-31))) / 16;
        int i67 = -(i64 ^ ((i66 & 1) + (i66 | 1)));
        int i68 = (i67 & 4) + (i67 | 4);
        int i69 = ((i68 >> 25) - 255) / androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i70 = (i69 ^ 1) + ((i69 & 1) << 1);
        return 4100 / (((-(((i70 | 1) << 1) - (i70 ^ 1))) & i68) * 1025);
    }

    static void read() {
        RemoteActionCompatParcelizer = new char[]{5593, 5511, 5544, 5538, 5566, 5541, 5543, 5545, 5544, 5545, 5543, 5539, 5529, 5526, 5543, 5538, 5565, 5560, 5544, 5518, 5534, 5567, 5537, 5421, 5423, 5392, 5394, 5398, 5397, 5399, 5397, 5418, 5393, 5401, 5376, 5376, 5400, 5630, 5545, 5543, 5541, 5566, 5538, 5544, 5511, 5513, 5542, 5566, 5505, 5625, 5532, 5541, 5536, 5537, 5537, 5536, 5560, 5544, 5520, 5539, 5541, 5549, 5548, 5628, 5543, 5567, 5524, 5526, 5566, 5536, 5540, 5544, 5548, 5540, 5536, 5538, 5536, 5542, 5538, 5565, 5564, 5528, 5478, 5472, 5472, 5444, 5470, 5479, 5476, 5475, 5443, 5453, 5479, 5495, 5496, 5473, 5474, 5511, 5471, 5464, 5448, 5452, 5460, 5465, 5455, 5443, 5485, 5461, 5461, 5456, 5464, 5471, 5469};
    }
}
