package o;

import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class setFontSizeR2X_6o {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    private static boolean _init_lambda1;
    private static int _init_lambda2;
    private static int _init_lambda3;
    private static int _init_lambda4;
    private static int accessensureViewModelStore;
    public static final Map r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private static byte[] r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private static Object r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private static byte[] r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public static final Map r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private static Object r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private static long r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private static long r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:18:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r9, int r10, byte r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setFontSizeR2X_6o.$16
            int r2 = r1 + 43
            int r3 = r2 % 128
            o.setFontSizeR2X_6o.$17 = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 4
            if (r2 != 0) goto L29
            int r11 = r6 % r11
            int r11 = r11 + 32
            byte[] r2 = o.setFontSizeR2X_6o.$$a
            int r4 = r4 / r9
            int r9 = r4 + 36
            int r10 = r6 >>> r10
            int r10 = r0 % r10
            byte[] r9 = new byte[r9]
            int r4 = r4 + 130
            if (r2 != 0) goto L27
            r6 = r5
            goto L3d
        L27:
            r0 = r5
            goto L4b
        L29:
            int r11 = r11 * r6
            int r11 = r11 + 114
            byte[] r2 = o.setFontSizeR2X_6o.$$a
            int r9 = r9 * r0
            int r7 = r9 + 5
            int r10 = r10 * r4
            int r10 = 4 - r10
            byte[] r4 = new byte[r7]
            int r9 = r9 + r6
            if (r2 != 0) goto L47
            r6 = r3
            r8 = r4
            r4 = r9
            r9 = r8
        L3d:
            int r1 = r1 + 121
            int r7 = r1 % 128
            o.setFontSizeR2X_6o.$17 = r7
            int r1 = r1 % r0
            r0 = r11
            r11 = r10
            goto L5e
        L47:
            r0 = r3
            r8 = r4
            r4 = r9
            r9 = r8
        L4b:
            byte r1 = (byte) r11
            r9[r0] = r1
            int r6 = r0 + 1
            if (r0 != r4) goto L58
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r3)
            return r10
        L58:
            r0 = r2[r10]
            r8 = r11
            r11 = r10
            r10 = r0
            r0 = r8
        L5e:
            int r10 = -r10
            int r0 = r0 + r10
            int r10 = r11 + 1
            int r11 = r0 + (-13)
            r0 = r6
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFontSizeR2X_6o.$$c(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r2 r7 r8 r9
  0x0031: PHI (r1v12 int) = (r1v4 int), (r1v14 int) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r2v16 byte[]) = (r2v2 byte[]), (r2v18 byte[]) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r7v5 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r8v11 int) = (r8v13 int), (r8v14 int) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r9v9 int) = (r9v1 int), (r9v10 int) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r2 r7 r8 r9
  0x002b: PHI (r2v3 byte[]) = (r2v2 byte[]), (r2v18 byte[]) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r8v1 int) = (r8v15 int), (r8v16 int) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r9v2 int) = (r9v1 int), (r9v10 int) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    private static String $$f(short s, short s2, int i) {
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = $17 + 103;
        $16 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            i2 = 12 / s;
            bArr = $$d;
            i3 = i + 98;
            bArr2 = new byte[s2 + 125];
            i7 = s2 + 151;
            if (bArr == null) {
                i6 = s2;
                i4 = s2;
                i6 = i7;
                i4 = i7;
                int i10 = i3;
                byte[] bArr3 = bArr2;
                int i11 = i4;
                int i12 = i10 + (-i4);
                int i13 = i10 + 1;
                i2 = i12 - 3;
                int i14 = $16 + 49;
                $17 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                bArr2 = bArr3;
                i5 = 0;
                i3 = i13;
                i6 = i11 == true ? 1 : 0;
            } else {
                i6 = s2;
                i4 = s2;
                i6 = i7;
                i4 = i7;
                i5 = 0;
            }
        } else {
            i2 = 119 - s;
            bArr = $$d;
            i3 = i + 4;
            bArr2 = new byte[s2 + 1];
            if (bArr == null) {
                i6 = s2;
                i4 = s2;
                i6 = i7;
                i4 = i7;
                int i16 = i3;
                byte[] bArr4 = bArr2;
                int i17 = i4;
                int i18 = i16 + (-i4);
                int i19 = i16 + 1;
                i2 = i18 - 3;
                int i110 = $16 + 49;
                $17 = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i111 = i110 % 2;
                bArr2 = bArr4;
                i5 = 0;
                i3 = i19;
                i6 = i17 == true ? 1 : 0;
            } else {
                i6 = s2;
                i4 = s2;
                i6 = i7;
                i4 = i7;
                i5 = 0;
            }
        }
        while (true) {
            bArr2[i5] = (byte) i2;
            int i20 = i5 + 1;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i3];
            int i21 = i3;
            int i22 = i6;
            byte[] bArr5 = bArr2;
            i2 = (i2 + (-b)) - 3;
            int i23 = $16 + 49;
            $17 = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i24 = i23 % 2;
            bArr2 = bArr5;
            i5 = i20;
            i3 = i21 + 1;
            i6 = i22 == true ? 1 : 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0430 A[Catch: Exception -> 0x01dc, TryCatch #11 {Exception -> 0x01dc, blocks: (B:108:0x03a0, B:112:0x03bb, B:115:0x03c8, B:124:0x03d8, B:123:0x03d5, B:129:0x03dd, B:131:0x03e3, B:132:0x03e4, B:138:0x03ef, B:140:0x03f5, B:141:0x03f6, B:149:0x040c, B:151:0x0412, B:152:0x0413, B:154:0x041a, B:162:0x042a, B:164:0x0430, B:165:0x0431, B:169:0x043e, B:110:0x03b1, B:119:0x03cf), top: B:204:0x03a0, inners: #8, #10 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0431 A[Catch: Exception -> 0x01dc, TRY_LEAVE, TryCatch #11 {Exception -> 0x01dc, blocks: (B:108:0x03a0, B:112:0x03bb, B:115:0x03c8, B:124:0x03d8, B:123:0x03d5, B:129:0x03dd, B:131:0x03e3, B:132:0x03e4, B:138:0x03ef, B:140:0x03f5, B:141:0x03f6, B:149:0x040c, B:151:0x0412, B:152:0x0413, B:154:0x041a, B:162:0x042a, B:164:0x0430, B:165:0x0431, B:169:0x043e, B:110:0x03b1, B:119:0x03cf), top: B:204:0x03a0, inners: #8, #10 }] */
    private static URL RemoteActionCompatParcelizer(String str, ApplicationInfo applicationInfo) throws Throwable {
        byte[] bArr;
        byte b;
        byte b2;
        Throwable cause;
        byte b3;
        byte b4;
        Object objNewInstance;
        int i = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            byte[] bArr2 = $$d;
            char c = 968;
            if (Class.forName($$f(bArr2[968], bArr2[348], bArr2[7])).getField($$f(bArr2[55], bArr2[30], bArr2[348])).get(applicationInfo) != null) {
                byte b5 = bArr2[968];
                int i2 = $11 + 77;
                $10 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Class<?> cls = i2 % 2 != 0 ? Class.forName($$f(b5, bArr2[348], bArr2[35])) : Class.forName($$f(b5, bArr2[348], bArr2[7]));
                byte b6 = bArr2[55];
                byte b7 = bArr2[30];
                int i3 = $11;
                int i4 = (i3 ^ 81) + ((i3 & 81) << 1);
                $10 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                try {
                    arrayList.add(Class.forName($$f(bArr2[695], bArr2[3], (short) (-bArr2[163]))).getDeclaredConstructor(String.class).newInstance(cls.getField($$f(b6, b7, bArr2[348])).get(applicationInfo)));
                    int i6 = $10 + 41;
                    $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    c = 968;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            }
            byte b8 = bArr2[c];
            int i8 = $11 + 11;
            $10 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Class<?> cls2 = Class.forName($$f(b8, bArr2[348], bArr2[7]));
            byte b9 = bArr2[55];
            byte b10 = bArr2[126];
            int i10 = $11 + 81;
            $10 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                cls2.getField($$f(b9, b10, (short) (-bArr2[591]))).get(applicationInfo);
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cls2.getField($$f(b9, b10, (short) (-bArr2[591]))).get(applicationInfo) != null) {
                byte b11 = bArr2[968];
                int i11 = $11;
                int i12 = ((i11 | 83) << 1) - (i11 ^ 83);
                $10 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                Class<?> cls3 = Class.forName($$f(b11, bArr2[348], bArr2[7]));
                int i14 = $10;
                int i15 = (i14 ^ 5) + ((i14 & 5) << 1);
                $11 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                Object obj2 = cls3.getField($$f(bArr2[55], bArr2[126], (short) (-bArr2[591]))).get(applicationInfo);
                int i17 = $10;
                int i18 = ((i17 | 67) << 1) - (i17 ^ 67);
                $11 = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                int i20 = 0;
                while (i20 < length) {
                    int i21 = $10;
                    int i22 = ((i21 | 91) << 1) - (i21 ^ 91);
                    $11 = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    try {
                        Object[] objArr2 = {objArr[i20]};
                        byte[] bArr3 = $$d;
                        Class<?> cls4 = Class.forName($$f(bArr3[695], bArr3[3], (short) (-bArr3[163])));
                        Class<?>[] clsArr = new Class[1];
                        int i24 = $10;
                        int i25 = ((i24 | 97) << 1) - (i24 ^ 97);
                        $11 = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i25 % 2 == 0) {
                            clsArr[1] = String.class;
                            objNewInstance = cls4.getDeclaredConstructor(clsArr).newInstance(objArr2);
                        } else {
                            clsArr[0] = String.class;
                            objNewInstance = cls4.getDeclaredConstructor(clsArr).newInstance(objArr2);
                        }
                        arrayList.add(objNewInstance);
                        int i26 = ((i20 | 115) << 1) - (i20 ^ 115);
                        i20 = (i26 ^ (-114)) + ((i26 & (-114)) << 1);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i27 = $10;
                int i28 = (i27 & 9) + (i27 | 9);
                $11 = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i28 % 2 == 0) {
                    try {
                        throw null;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                File file = (File) it.next();
                int i29 = $10 + 113;
                $11 = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i29 % 2 == 0) {
                    try {
                        bArr = $$d;
                        b = bArr[248];
                        b2 = bArr[2];
                    } catch (Throwable th5) {
                        th = th5;
                        cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    bArr = $$d;
                    b = bArr[695];
                    b2 = bArr[3];
                }
                try {
                    Class<?> cls5 = Class.forName($$f(b, b2, (short) (-bArr[163])));
                    byte[] bArr4 = $$d;
                    Boolean bool = (Boolean) cls5.getMethod($$f(bArr4[47], bArr4[35], bArr4[132]), null).invoke(file, null);
                    int i30 = $10 + 71;
                    $11 = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    if (!(!bool.booleanValue())) {
                        int i32 = $11;
                        int i33 = ((i32 | 113) << 1) - (i32 ^ 113);
                        $10 = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i33 % 2 != 0) {
                            try {
                                throw null;
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        try {
                            try {
                                Class<?> cls6 = Class.forName($$f(bArr4[695], bArr4[3], (short) (-bArr4[163])));
                                int i34 = $10;
                                int i35 = ((i34 | 105) << 1) - (i34 ^ 105);
                                $11 = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i35 % 2 == 0) {
                                    b3 = bArr4[28442];
                                    b4 = bArr4[94];
                                } else {
                                    b3 = bArr4[311];
                                    b4 = bArr4[45];
                                }
                                String str2 = (String) cls6.getMethod($$f(b3, b4, (short) (-bArr4[145])), null).invoke(file, null);
                                try {
                                    byte b12 = (byte) (-bArr4[325]);
                                    int i36 = $11;
                                    int i37 = i36 + 17;
                                    $10 = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i38 = i37 % 2;
                                    byte b13 = bArr4[8];
                                    byte b14 = bArr4[1065];
                                    int i39 = ((i36 | 19) << 1) - (i36 ^ 19);
                                    $10 = i39 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i40 = i39 % 2;
                                    if (str2.endsWith($$f(b12, b13, (short) ((b14 & 1) + (b14 | 1))))) {
                                        StringBuilder sb = new StringBuilder();
                                        int i41 = $10;
                                        int i42 = (i41 ^ 19) + ((i41 & 19) << 1);
                                        $11 = i42 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i43 = i42 % 2;
                                        byte b15 = bArr4[695];
                                        try {
                                            byte b16 = bArr4[30];
                                            int i44 = (i41 ^ 119) + ((i41 & 119) << 1);
                                            $11 = i44 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i45 = i44 % 2;
                                            sb.append($$f(b15, b16, bArr4[1075]));
                                            int i46 = $11;
                                            int i47 = (i46 & 21) + (i46 | 21);
                                            $10 = i47 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i48 = i47 % 2;
                                            try {
                                                try {
                                                    try {
                                                        sb.append((String) Class.forName($$f(bArr4[695], bArr4[3], (short) (-bArr4[163]))).getMethod($$f(bArr4[311], bArr4[126], (short) 88), null).invoke(file, null));
                                                        int i49 = $$e;
                                                        byte b17 = bArr4[7];
                                                        sb.append($$f((byte) ((i49 ^ 16) | (i49 & 16)), b17, (short) (b17 | 102)));
                                                        sb.append(str);
                                                        try {
                                                            Object[] objArr3 = {sb.toString()};
                                                            SystemClock.uptimeMillis();
                                                            Runtime.getRuntime().maxMemory();
                                                            Class<?> cls7 = Class.forName($$f(bArr4[695], bArr4[3], (short) ((i49 & 32) | (i49 ^ 32))));
                                                            Class<?>[] clsArr2 = new Class[1];
                                                            try {
                                                                clsArr2[0] = String.class;
                                                                URL url = (URL) cls7.getDeclaredConstructor(clsArr2).newInstance(objArr3);
                                                                try {
                                                                    ZipFile zipFile = new ZipFile(file);
                                                                    int i50 = $10;
                                                                    int i51 = (i50 & 33) + (i50 | 33);
                                                                    $11 = i51 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                    int i52 = i51 % 2;
                                                                    try {
                                                                        if (zipFile.getEntry(str.substring(1)) != null) {
                                                                            zipFile.close();
                                                                            int i53 = $11 + 1;
                                                                            $10 = i53 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                            int i54 = i53 % 2;
                                                                            return url;
                                                                        }
                                                                        zipFile.close();
                                                                    } catch (Throwable th7) {
                                                                        try {
                                                                            zipFile.close();
                                                                            throw th7;
                                                                        } catch (Throwable th8) {
                                                                            th7.addSuppressed(th8);
                                                                            throw th7;
                                                                        }
                                                                    }
                                                                } catch (Exception unused) {
                                                                    continue;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                Throwable cause4 = th.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    Throwable cause5 = th.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                    }
                                } catch (Exception unused4) {
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                Throwable cause6 = th.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return null;
        } catch (Exception unused5) {
            return null;
        }
    }

    private setFontSizeR2X_6o() {
    }

    public static Object RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = ((i3 | 53) << 1) - (i3 ^ 53);
        $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            Integer.valueOf(i ^ accessensureViewModelStore);
            throw null;
        }
        Map map = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i5 = accessensureViewModelStore;
        Object obj = map.get(Integer.valueOf(((~i) & i5) | ((~i5) & i)));
        int i6 = $11 + 23;
        $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 84521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 8452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFontSizeR2X_6o.<clinit>():void");
    }

    public static Object RemoteActionCompatParcelizer(char c, int i, int i2, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        byte b;
        String str$$f;
        String str$$f2;
        Object method;
        int i4 = 2 % 2;
        Map map = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        Object obj = map.get(Integer.valueOf(i3));
        if (obj != null) {
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Object obj2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i);
            int i5 = $11;
            int i6 = ((i5 | 91) << 1) - (i5 ^ 91);
            $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                objArr[1] = numValueOf2;
                objArr[0] = Character.valueOf(c);
                b = $$d[80];
            } else {
                objArr[1] = numValueOf2;
                objArr[0] = Character.valueOf(c);
                b = $$d[30];
            }
            int i7 = $10 + 11;
            $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                str$$f = $$f(b, (byte) (-$$d[31116]), (short) 7320);
            } else {
                str$$f = $$f(b, (byte) (-$$d[211]), (short) 626);
            }
            Class<?> cls = Class.forName(str$$f, true, (ClassLoader) r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            byte[] bArr = $$d;
            byte b2 = bArr[286];
            int i8 = $11;
            int i9 = ((i8 | 43) << 1) - (i8 ^ 43);
            $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                str$$f2 = $$f(b2, bArr[21006], (short) 17131);
            } else {
                str$$f2 = $$f(b2, bArr[391], (short) 1077);
            }
            Class<?>[] clsArr2 = new Class[3];
            clsArr2[0] = Character.TYPE;
            clsArr2[1] = Integer.TYPE;
            int i10 = $10;
            int i11 = (i10 & 29) + (i10 | 29);
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            clsArr2[2] = Integer.TYPE;
            Class cls2 = (Class) cls.getMethod(str$$f2, clsArr2).invoke(obj2, objArr);
            if (str == null) {
                int i13 = $11;
                int i14 = ((i13 | 47) << 1) - (i13 ^ 47);
                $10 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    method = cls2.getDeclaredConstructor(clsArr);
                } else {
                    method = cls2.getConstructor(clsArr);
                    int i15 = $11;
                    int i16 = (i15 & 111) + (i15 | 111);
                    $10 = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                }
            } else if (clsArr == null) {
                if (!z) {
                    method = cls2.getField(str);
                } else {
                    int i18 = $10;
                    int i19 = (i18 ^ 55) + ((i18 & 55) << 1);
                    $11 = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        method = cls2.getDeclaredField(str);
                        int i20 = 62 / 0;
                    } else {
                        method = cls2.getDeclaredField(str);
                    }
                    int i21 = $11;
                    int i22 = (i21 & 85) + (i21 | 85);
                    $10 = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                }
            } else if (z) {
                int i24 = $10;
                int i25 = (i24 ^ 29) + ((i24 & 29) << 1);
                $11 = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i25 % 2 == 0) {
                    cls2.getDeclaredMethod(str, clsArr);
                    throw null;
                }
                method = cls2.getDeclaredMethod(str, clsArr);
            } else {
                method = cls2.getMethod(str, clsArr);
                int i26 = $10 + 45;
                $11 = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i26 % 2 == 0) {
                    int i27 = 3 % 4;
                }
            }
            map.put(numValueOf, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int IconCompatParcelizer(int i) throws Throwable {
        byte b;
        byte b2;
        String str$$f;
        Object obj;
        String str$$f2;
        Class<?>[] clsArr;
        int i2 = 2 % 2;
        Object obj2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$d;
            int i3 = $11;
            int i4 = (i3 & 17) + (i3 | 17);
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            $10 = i5;
            if (i4 % 2 != 0) {
                b = bArr[51];
                b2 = bArr[19989];
            } else {
                b = bArr[30];
                b2 = bArr[211];
            }
            byte b3 = (byte) (-b2);
            int i6 = i5 + 27;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                str$$f = $$f(b, b3, (short) 24766);
                obj = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            } else {
                str$$f = $$f(b, b3, (short) 626);
                obj = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            }
            Class<?> cls = Class.forName(str$$f, true, (ClassLoader) obj);
            byte b4 = bArr[35];
            int i7 = $11;
            int i8 = ((i7 | 53) << 1) - (i7 ^ 53);
            $10 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                str$$f2 = $$f(b4, bArr[3], (short) 17652);
                clsArr = new Class[0];
            } else {
                str$$f2 = $$f(b4, bArr[8], (short) 649);
                clsArr = new Class[1];
            }
            clsArr[0] = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$f2, clsArr).invoke(obj2, objArr);
            int i9 = $11;
            int i10 = ((i9 | 27) << 1) - (i9 ^ 27);
            $10 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj3 = null;
            if (i10 % 2 != 0) {
                ((Integer) objInvoke).intValue();
                throw null;
            }
            int iIntValue = ((Integer) objInvoke).intValue();
            int i11 = $10 + 3;
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return iIntValue;
            }
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int read(Object obj) throws Throwable {
        String str$$f;
        Object obj2;
        boolean z;
        byte b;
        int i;
        String str$$f2;
        Class<?>[] clsArr;
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = ((i3 | 103) << 1) - (i3 ^ 103);
        $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i4 % 2 == 0) {
            obj3.hashCode();
            throw null;
        }
        Object obj4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$d;
            int i5 = i3 + 105;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            $11 = i6;
            int i7 = i5 % 2;
            byte b2 = bArr[30];
            int i8 = -bArr[211];
            int i9 = (i6 ^ 111) + ((i6 & 111) << 1);
            $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            byte b3 = (byte) i8;
            if (i9 % 2 != 0) {
                str$$f = $$f(b2, b3, (short) 4904);
                obj2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                z = false;
            } else {
                str$$f = $$f(b2, b3, (short) 626);
                obj2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                z = true;
            }
            Class<?> cls = Class.forName(str$$f, z, (ClassLoader) obj2);
            byte b4 = bArr[35];
            int i10 = $10;
            int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            byte b5 = b4;
            if (i11 % 2 == 0) {
                b = bArr[28];
                i = 26899;
            } else {
                b = bArr[8];
                i = 649;
            }
            short s = (short) i;
            int i12 = (i10 & 57) + (i10 | 57);
            $11 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                str$$f2 = $$f(b5, b, s);
                clsArr = new Class[0];
                clsArr[1] = Object.class;
            } else {
                str$$f2 = $$f(b5, b, s);
                clsArr = new Class[]{Object.class};
            }
            int i13 = $10 + 47;
            $11 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            int iIntValue = ((Integer) cls.getMethod(str$$f2, clsArr).invoke(obj4, objArr)).intValue();
            int i15 = $10;
            int i16 = (i15 & 43) + (i15 | 43);
            $11 = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                return iIntValue;
            }
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object IconCompatParcelizer(char c, int i, int i2) throws Throwable {
        byte[] bArr;
        char c2;
        int i3 = 2 % 2;
        int i4 = $10 + 3;
        $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            Integer numValueOf = Integer.valueOf(i);
            int i5 = $10 + 31;
            $11 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                objArr[1] = numValueOf;
                objArr[1] = Character.valueOf(c);
                bArr = $$d;
                c2 = '$';
            } else {
                objArr[1] = numValueOf;
                objArr[0] = Character.valueOf(c);
                bArr = $$d;
                c2 = 30;
            }
            int i6 = $10;
            int i7 = (i6 ^ 27) + ((i6 & 27) << 1);
            $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            byte b = bArr[c2];
            byte[] bArr2 = $$d;
            byte b2 = (byte) (-bArr2[211]);
            short s = (short) 626;
            int i9 = i6 + 67;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Class<?> cls = i9 % 2 == 0 ? Class.forName($$f(b, b2, s), false, (ClassLoader) r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) : Class.forName($$f(b, b2, s), true, (ClassLoader) r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            byte b3 = bArr2[286];
            byte b4 = bArr2[391];
            int i10 = $11;
            int i11 = (i10 & 63) + (i10 | 63);
            $10 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Method method = cls.getMethod($$f(b3, b4, (short) 1077), Character.TYPE, Integer.TYPE, Integer.TYPE);
            int i13 = $10 + 9;
            $11 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                return method.invoke(obj, objArr);
            }
            int i14 = 95 / 0;
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
