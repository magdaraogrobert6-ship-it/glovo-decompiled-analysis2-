package o;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.hms.location.ActivityIdentificationData;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RememberLottieCompositionKtrememberLottieComposition3 {
    private static int IconCompatParcelizer;
    private static char MediaSessionCompatQueueItem;
    private static char RatingCompat;
    private static int RemoteActionCompatParcelizer;
    private static char read;
    private static char write;
    private final Application serializer;
    private static final byte[] $$a = {110, -118, -94, 113};
    private static final int $$b = 9;
    private static final byte[] MediaMetadataCompat = {91, -57, -119, 52, -13, 10, -14, 3, 6, 5, 54, -72, 13, 4, -18, 73, -40, -19, 4, -18, 52, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 32, -13, -15, 28, -21, -4, 8, -10, -6, 1, 2, -15, 39, -20, -23, 15, -4, -8, 8, 39, -38, 3, -5, 7, 17, -15, -7, -3, 12, -6, -11, -5, 9, -21, 21, 51, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, 51, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -21, -44, 1, -6, 15, -19, 4, 2, -15, 36, -17, -2, -8, 10, -6, 2, 24, -20, -13, 13, -6, 2, -13, 2, -15, 36, -17, -2, -8, 10, -6, 2, 23, -19, -12, 8, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -34, -17, -2, -8, 10, -6, 2, 24, -20, -13, 13, -6, 2, -13, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -34, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9, 10, 2, -7, 13, -19, -1, 3, 13, -14, 9, -21, 21, 51, -71, 1, 11, -3, 62, -19, -49, 0, 17, -24, 45, -29, -10, -1, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -37, -22, 2, -7, 13, -19, -1, 3, 13, 7, -18, 11, 37, -44, 11, -1, 9, -21, 21, 51, -71, 1, 11, -3, 62, -21, -44, 3, 0, 7, 2, -17, 11, -6, 1, -3, 0, 9, -21, 21, 51, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, 51, -62, 11, -13, 7, 57, -23, -51, 21, -2, -11, -4, 11, -6, 1};
    private static final int MediaBrowserCompatMediaItem = ActivityIdentificationData.RUNNING;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 107
            byte[] r1 = o.RememberLottieCompositionKtrememberLottieComposition3.$$a
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RememberLottieCompositionKtrememberLottieComposition3.$$c(int, short, byte):java.lang.String");
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public RememberLottieCompositionKtrememberLottieComposition3(Application application) {
        application.getClass();
        this.serializer = application;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c;
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char c2 = 2;
        char[] cArr3 = new char[2];
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            cArr3[0] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[0];
                int i4 = (c4 + i2) ^ ((c4 << 4) + ((char) (((long) MediaSessionCompatQueueItem) ^ 7962313315467514595L)));
                int i5 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(RatingCompat);
                    objArr2[c2] = Integer.valueOf(i5);
                    objArr2[1] = Integer.valueOf(i4);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (65450 - ((Process.getThreadPriority(0) + 20) >> 6)), 1244 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 33, 402902884, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i2) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.KeyEvent.keyCodeFromString("") + 65450), android.view.KeyEvent.keyCodeFromString("") + 1244, 33 - Drawable.resolveOpacity(0, 0), 402902884, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                    i3++;
                    c2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr3[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr3[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                c = 2;
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2546 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 30 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), -261026534, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            } else {
                c = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            c2 = c;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 + 3
            byte[] r0 = o.RememberLottieCompositionKtrememberLottieComposition3.MediaMetadataCompat
            int r8 = 118 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r4 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L26:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RememberLottieCompositionKtrememberLottieComposition3.a(int, short, short, java.lang.Object[]):void");
    }

    static void read() {
        read = (char) 51084;
        write = (char) 49575;
        MediaSessionCompatQueueItem = (char) 9499;
        RatingCompat = (char) 45464;
    }

    static {
        read();
        IconCompatParcelizer = 0;
        RemoteActionCompatParcelizer = 1;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0657  */
    /* JADX WARN: Code duplicated, block: B:162:0x0662  */
    /* JADX WARN: Code duplicated, block: B:164:0x0685  */
    /* JADX WARN: Code duplicated, block: B:171:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:249:0x06c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final List<Integer> write() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2;
        encryptAndStoreTokenyxL6bBk encryptandstoretokenyxl6bbk = new encryptAndStoreTokenyxL6bBk(this);
        try {
            byte[] bArr = MediaMetadataCompat;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[95]), bArr[69], bArr[260], objArr3);
            char c = 0;
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[5], bArr[50], (short) (-bArr[264]), objArr4);
            Object[] objArr5 = new Object[1];
            b(319 - (((Integer) cls.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16), new char[]{47613, 20245, 4300, 31242, 35848, 62102, 18009, 50775, 52893, 42896, 57090, 46194, 57528, 50296, 36284, 1286, 4300, 31242, 35848, 62102, 18009, 50775, 12833, 12576, 52572, 26420, 62424, 3242, 57287, 52542, 4300, 31242, 50623, 37891, 9928, 44471, 36284, 1286, 9124, 15548, 35848, 62102, 57090, 46194, 730, 51628, 35848, 62102, 12833, 12576, 10880, 39305, 35848, 62102, 6293, 58323, 57090, 46194, 50453, 56436, 35848, 62102, 63451, 50710, 50496, 59112, 9124, 15548, 4300, 31242, 52893, 42896, 40872, 33252, 35848, 62102, 50495, 25689, 4300, 31242, 12833, 12576, 45828, 7824, 35848, 62102, 42435, 59730, 35848, 62102, 730, 51628, 35848, 62102, 50453, 56436, 53568, 62750, 50623, 37891, 40272, 52489, 53568, 62750, 18009, 50775, 38914, 42971, 35848, 62102, 19488, 6641, 53568, 62750, 52893, 42896, 29815, 61187, 35848, 62102, 40872, 33252, 35848, 62102, 6144, 48034, 53568, 62750, 12833, 12576, 44403, 6388, 35848, 62102, 1848, 27573, 18365, 4810, 35848, 62102, 45828, 7824, 53568, 62750, 6293, 58323, 1766, 2314, 50623, 37891, 58087, 51491, 40444, 34473, 36193, 30599, 1766, 2314, 36193, 30599, 48196, 7008, 35848, 62102, 24417, 44103, 40444, 34473, 29209, 61573, 1766, 2314, 18009, 50775, 59284, 52394, 40444, 34473, 52893, 42896, 51786, 30578, 35848, 62102, 1848, 27573, 35848, 62102, 38914, 42971, 40444, 34473, 57090, 46194, 48196, 18187, 40444, 34473, 52893, 42896, 1766, 2314, 15977, 65105, 58087, 51491, 40444, 34473, 52893, 42896, 1766, 2314, 52893, 42896, 1766, 2314, 57090, 46194, 1766, 2314, 12833, 12576, 1766, 2314, 52572, 26420, 48196, 7008, 53568, 62750, 6293, 58323, 1766, 2314, 6293, 58323, 51786, 30578, 35848, 62102, 24417, 44103, 35848, 62102, 58087, 51491, 40444, 34473, 6293, 58323, 47829, 8463, 35848, 62102, 63162, 6176, 28230, 51059, 36193, 30599, 57528, 50296, 18009, 50775, 57528, 50296, 29209, 61573, 57528, 50296, 15977, 65105, 57528, 50296, 15977, 65105, 57528, 50296, 52893, 42896, 13180, 27404, 35848, 62102, 22674, 44913, 28230, 51059, 52893, 42896, 57528, 50296, 57090, 46194, 57528, 50296, 12833, 12576, 29156, 3779, 35848, 62102, 37351, 38351, 28230, 51059, 12833, 12576, 57528, 50296, 52572, 26420, 1766, 2314, 52572, 26420, 1766, 2314, 34409, 18394}, objArr5);
            String str = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a((byte) (-bArr[95]), bArr[69], bArr[260], objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((byte) (-bArr[48]), bArr[50], (short) 41, objArr7);
            Object[] objArr8 = new Object[1];
            b((((Integer) cls2.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16) + 1, new char[]{50174, 15866}, objArr8);
            Object[] objArr9 = {(String) objArr8[0]};
            char c2 = '\f';
            char c3 = '?';
            Object[] objArr10 = new Object[1];
            a(bArr[12], bArr[63], bArr[183], objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[25], bArr[7], (short) 78, objArr11);
            String str2 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(bArr[12], bArr[63], bArr[183], objArr12);
            Object[] objArr13 = (Object[]) cls3.getMethod(str2, Class.forName((String) objArr12[0])).invoke(str, objArr9);
            int[] iArr = new int[objArr13.length];
            int i3 = 0;
            while (i3 < objArr13.length) {
                Object[] objArr14 = {objArr13[i3]};
                byte[] bArr2 = MediaMetadataCompat;
                short s = (short) 82;
                Object[] objArr15 = new Object[1];
                a((byte) (-bArr2[6]), bArr2[c3], s, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[c]);
                byte b = bArr2[13];
                byte b2 = bArr2[260];
                Object[] objArr16 = new Object[1];
                a(b, b2, (short) (b2 | 98), objArr16);
                String str3 = (String) objArr16[c];
                Object[] objArr17 = new Object[1];
                a(bArr2[c2], bArr2[63], bArr2[183], objArr17);
                Object objInvoke = cls4.getMethod(str3, Class.forName((String) objArr17[0])).invoke(null, objArr14);
                Object[] objArr18 = new Object[1];
                a((byte) (-bArr2[6]), bArr2[63], s, objArr18);
                Class<?> cls5 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                a(bArr2[9], bArr2[12], (short) (MediaBrowserCompatMediaItem - 4), objArr19);
                iArr[i3] = ((Integer) cls5.getMethod((String) objArr19[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 0;
                c2 = '\f';
                c3 = '?';
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (encryptandstoretokenyxl6bbk.serializer(iArr[i4])) {
                        case -38:
                            i4 = 92;
                            break;
                        case -37:
                            encryptandstoretokenyxl6bbk.serializer(43);
                            i5 = encryptandstoretokenyxl6bbk.IconCompatParcelizer != 47 ? 73 : 54;
                            i4 = i5;
                            break;
                        case -36:
                            i4 = 87;
                            break;
                        case -35:
                            encryptandstoretokenyxl6bbk.serializer(43);
                            int i6 = encryptandstoretokenyxl6bbk.IconCompatParcelizer;
                            i5 = (i6 == 0 || i6 != 1) ? 35 : 47;
                            i4 = i5;
                            break;
                        case -34:
                            i4 = 56;
                            break;
                        case -33:
                            i4 = 86;
                            break;
                        case -32:
                            encryptandstoretokenyxl6bbk.serializer(42);
                            if (encryptandstoretokenyxl6bbk.IconCompatParcelizer == 0) {
                                i5 = 85;
                            }
                            i4 = i5;
                            break;
                        case -31:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            try {
                                encryptandstoretokenyxl6bbk.serializer(2);
                                encryptandstoretokenyxl6bbk.serializer(11);
                                RemoteActionCompatParcelizer = encryptandstoretokenyxl6bbk.IconCompatParcelizer;
                                i4 = i5;
                            } catch (Throwable th) {
                                th = th;
                                if (i4 >= 74 || i4 >= 78) {
                                    byte[] bArr3 = MediaMetadataCompat;
                                    byte b3 = bArr3[105];
                                    byte b4 = bArr3[63];
                                    objArr = new Object[1];
                                    a(b3, b4, (short) (b4 | 321), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th) || i4 < 78 || i4 >= 86) {
                                        byte b5 = bArr3[105];
                                        byte b6 = bArr3[63];
                                        objArr2 = new Object[1];
                                        a(b5, b6, (short) (b6 | 321), objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th) || i4 < 81 || i4 >= 82) {
                                            throw th;
                                        }
                                        i4 = 98;
                                    } else {
                                        i = 98;
                                    }
                                    encryptandstoretokenyxl6bbk.read = th;
                                    encryptandstoretokenyxl6bbk.serializer(48);
                                } else {
                                    i = 72;
                                }
                                i4 = i;
                                encryptandstoretokenyxl6bbk.read = th;
                                encryptandstoretokenyxl6bbk.serializer(48);
                            }
                            break;
                        case -30:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = IconCompatParcelizer;
                            encryptandstoretokenyxl6bbk.serializer(24);
                            i4 = i5;
                            break;
                        case -29:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = encryptandstoretokenyxl6bbk.write.hashCode();
                            encryptandstoretokenyxl6bbk.serializer(24);
                            i4 = i5;
                            break;
                        case -28:
                            encryptandstoretokenyxl6bbk.serializer(32);
                            throw ((Throwable) encryptandstoretokenyxl6bbk.write);
                        case -27:
                            i4 = 93;
                            break;
                        case -26:
                            i4 = 95;
                            break;
                        case -25:
                            encryptandstoretokenyxl6bbk.serializer(38);
                            if (encryptandstoretokenyxl6bbk.IconCompatParcelizer == 0) {
                                i5 = 71;
                            }
                            i4 = i5;
                            break;
                        case -24:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(11);
                            IconCompatParcelizer = encryptandstoretokenyxl6bbk.IconCompatParcelizer;
                            i4 = i5;
                            break;
                        case -23:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer;
                            encryptandstoretokenyxl6bbk.serializer(24);
                            i4 = i5;
                            break;
                        case -22:
                            encryptandstoretokenyxl6bbk.serializer(32);
                            return (List) encryptandstoretokenyxl6bbk.write;
                        case -21:
                            i4 = 1;
                            break;
                        case -20:
                            i4 = 78;
                            break;
                        case -19:
                            i4 = 62;
                            break;
                        case -18:
                            i4 = 30;
                            break;
                        case -17:
                            try {
                                encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 2;
                                encryptandstoretokenyxl6bbk.serializer(2);
                                encryptandstoretokenyxl6bbk.serializer(3);
                                Object obj = encryptandstoretokenyxl6bbk.write;
                                encryptandstoretokenyxl6bbk.serializer(3);
                                try {
                                    Object[] objArr20 = {encryptandstoretokenyxl6bbk.write};
                                    byte[] bArr4 = MediaMetadataCompat;
                                    Object[] objArr21 = new Object[1];
                                    a(bArr4[28], bArr4[63], (short) 297, objArr21);
                                    Class<?> cls6 = Class.forName((String) objArr21[0]);
                                    Object[] objArr22 = new Object[1];
                                    a(bArr4[260], bArr4[69], (short) 316, objArr22);
                                    String str4 = (String) objArr22[0];
                                    Class<?>[] clsArr = new Class[1];
                                    try {
                                        byte b7 = bArr4[12];
                                        byte b8 = bArr4[63];
                                        Object[] objArr23 = new Object[1];
                                        a(b7, b8, (short) (b8 | 306), objArr23);
                                        clsArr[0] = Class.forName((String) objArr23[0]);
                                        try {
                                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = ((Boolean) cls6.getMethod(str4, clsArr).invoke(obj, objArr20)).booleanValue() ? 1 : 0;
                                            encryptandstoretokenyxl6bbk.serializer(24);
                                            i4 = i5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i4 >= 74) {
                                                byte[] bArr5 = MediaMetadataCompat;
                                                byte b9 = bArr5[105];
                                                byte b10 = bArr5[63];
                                                objArr = new Object[1];
                                                a(b9, b10, (short) (b10 | 321), objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11 = bArr5[105];
                                                byte b12 = bArr5[63];
                                                objArr2 = new Object[1];
                                                a(b11, b12, (short) (b12 | 321), objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte[] bArr6 = MediaMetadataCompat;
                                            byte b13 = bArr6[105];
                                            byte b14 = bArr6[63];
                                            objArr = new Object[1];
                                            a(b13, b14, (short) (b14 | 321), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b15 = bArr6[105];
                                            byte b16 = bArr6[63];
                                            objArr2 = new Object[1];
                                            a(b15, b16, (short) (b16 | 321), objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            }
                                            throw th;
                                            encryptandstoretokenyxl6bbk.read = th;
                                            encryptandstoretokenyxl6bbk.serializer(48);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            break;
                        case -16:
                            try {
                                encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                                encryptandstoretokenyxl6bbk.serializer(2);
                                encryptandstoretokenyxl6bbk.serializer(11);
                                try {
                                    Object[] objArr24 = {Integer.valueOf(encryptandstoretokenyxl6bbk.IconCompatParcelizer)};
                                    byte[] bArr7 = MediaMetadataCompat;
                                    Object[] objArr25 = new Object[1];
                                    a((byte) (-bArr7[6]), bArr7[63], (short) 82, objArr25);
                                    Class<?> cls7 = Class.forName((String) objArr25[0]);
                                    byte b17 = bArr7[13];
                                    byte b18 = bArr7[260];
                                    Object[] objArr26 = new Object[1];
                                    a(b17, b18, (short) (b18 | 98), objArr26);
                                    try {
                                        try {
                                            encryptandstoretokenyxl6bbk.read = cls7.getMethod((String) objArr26[0], Integer.TYPE).invoke(null, objArr24);
                                            i2 = 4;
                                            encryptandstoretokenyxl6bbk.serializer(i2);
                                            i4 = i5;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            if (i4 >= 74) {
                                                byte[] bArr8 = MediaMetadataCompat;
                                                byte b19 = bArr8[105];
                                                byte b110 = bArr8[63];
                                                objArr = new Object[1];
                                                a(b19, b110, (short) (b110 | 321), objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111 = bArr8[105];
                                                byte b112 = bArr8[63];
                                                objArr2 = new Object[1];
                                                a(b111, b112, (short) (b112 | 321), objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte[] bArr9 = MediaMetadataCompat;
                                            byte b113 = bArr9[105];
                                            byte b114 = bArr9[63];
                                            objArr = new Object[1];
                                            a(b113, b114, (short) (b114 | 321), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b115 = bArr9[105];
                                            byte b116 = bArr9[63];
                                            objArr2 = new Object[1];
                                            a(b115, b116, (short) (b116 | 321), objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            }
                                            throw th;
                                            encryptandstoretokenyxl6bbk.read = th;
                                            encryptandstoretokenyxl6bbk.serializer(48);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable cause2 = th.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                            break;
                        case -15:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj2 = encryptandstoretokenyxl6bbk.write;
                            try {
                                byte[] bArr10 = MediaMetadataCompat;
                                Object[] objArr27 = new Object[1];
                                a((byte) (bArr10[146] + 1), bArr10[69], (short) 263, objArr27);
                                Class<?> cls8 = Class.forName((String) objArr27[0]);
                                Object[] objArr28 = new Object[1];
                                a(bArr10[9], (byte) (-bArr10[6]), (short) 290, objArr28);
                                encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = ((Integer) cls8.getMethod((String) objArr28[0], null).invoke(obj2, null)).intValue();
                                encryptandstoretokenyxl6bbk.serializer(24);
                                i4 = i5;
                            } catch (Throwable th10) {
                                Throwable cause3 = th10.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th10;
                            }
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i4 = 88;
                            break;
                        case -13:
                            i4 = 90;
                            break;
                        case -12:
                            encryptandstoretokenyxl6bbk.serializer(18);
                            if (encryptandstoretokenyxl6bbk.IconCompatParcelizer == 0) {
                                i5 = 34;
                            }
                            i4 = i5;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i4 = 58;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(11);
                            try {
                                Object[] objArr29 = {Integer.valueOf(encryptandstoretokenyxl6bbk.IconCompatParcelizer)};
                                byte[] bArr11 = MediaMetadataCompat;
                                Object[] objArr30 = new Object[1];
                                a(bArr11[105], bArr11[63], (short) 245, objArr30);
                                encryptandstoretokenyxl6bbk.read = Class.forName((String) objArr30[0]).getDeclaredConstructor(Integer.TYPE).newInstance(objArr29);
                                i2 = 4;
                                encryptandstoretokenyxl6bbk.serializer(i2);
                                i4 = i5;
                            } catch (Throwable th11) {
                                Throwable cause4 = th11.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th11;
                            }
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i4 = 49;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            i4 = 22;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            encryptandstoretokenyxl6bbk.serializer(12);
                            if (encryptandstoretokenyxl6bbk.IconCompatParcelizer == 0) {
                                i5 = 21;
                            }
                            i4 = i5;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj3 = encryptandstoretokenyxl6bbk.write;
                            byte[] bArr12 = MediaMetadataCompat;
                            Object[] objArr31 = new Object[1];
                            a((byte) (-bArr12[95]), bArr12[69], (short) 207, objArr31);
                            Class<?> cls9 = Class.forName((String) objArr31[0]);
                            Object[] objArr32 = new Object[1];
                            a(bArr12[58], bArr12[7], (short) (MediaBrowserCompatMediaItem | androidx.compose.ui.graphics.Fields.SpotShadowColor), objArr32);
                            encryptandstoretokenyxl6bbk.read = cls9.getField((String) objArr32[0]).get(obj3);
                            i2 = 4;
                            encryptandstoretokenyxl6bbk.serializer(i2);
                            i4 = i5;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 3;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj4 = encryptandstoretokenyxl6bbk.write;
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj5 = encryptandstoretokenyxl6bbk.write;
                            encryptandstoretokenyxl6bbk.serializer(11);
                            try {
                                Object[] objArr33 = {obj5, Integer.valueOf(encryptandstoretokenyxl6bbk.IconCompatParcelizer)};
                                byte[] bArr13 = MediaMetadataCompat;
                                Object[] objArr34 = new Object[1];
                                a(bArr13[110], bArr13[69], (short) 162, objArr34);
                                Class<?> cls10 = Class.forName((String) objArr34[0]);
                                Object[] objArr35 = new Object[1];
                                a(bArr13[30], bArr13[50], (short) 194, objArr35);
                                String str5 = (String) objArr35[0];
                                Object[] objArr36 = new Object[1];
                                a(bArr13[12], bArr13[63], bArr13[183], objArr36);
                                encryptandstoretokenyxl6bbk.read = cls10.getMethod(str5, Class.forName((String) objArr36[0]), Integer.TYPE).invoke(obj4, objArr33);
                                i2 = 4;
                                encryptandstoretokenyxl6bbk.serializer(i2);
                                i4 = i5;
                            } catch (Throwable th12) {
                                Throwable cause5 = th12.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th12;
                            }
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj6 = encryptandstoretokenyxl6bbk.write;
                            try {
                                byte[] bArr14 = MediaMetadataCompat;
                                Object[] objArr37 = new Object[1];
                                a((byte) (-bArr14[48]), bArr14[69], (short) (MediaBrowserCompatMediaItem + 3), objArr37);
                                Class<?> cls11 = Class.forName((String) objArr37[0]);
                                Object[] objArr38 = new Object[1];
                                a(bArr14[30], bArr14[50], (short) 149, objArr38);
                                encryptandstoretokenyxl6bbk.read = cls11.getMethod((String) objArr38[0], null).invoke(obj6, null);
                                i2 = 4;
                                encryptandstoretokenyxl6bbk.serializer(i2);
                                i4 = i5;
                            } catch (Throwable th13) {
                                Throwable cause6 = th13.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th13;
                            }
                            break;
                        case -3:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            Object obj7 = encryptandstoretokenyxl6bbk.write;
                            try {
                                byte[] bArr15 = MediaMetadataCompat;
                                Object[] objArr39 = new Object[1];
                                a((byte) (-bArr15[48]), bArr15[69], (short) (MediaBrowserCompatMediaItem + 3), objArr39);
                                Class<?> cls12 = Class.forName((String) objArr39[0]);
                                Object[] objArr40 = new Object[1];
                                a((byte) (-bArr15[6]), bArr15[50], (short) 133, objArr40);
                                encryptandstoretokenyxl6bbk.read = cls12.getMethod((String) objArr40[0], null).invoke(obj7, null);
                                i2 = 4;
                                encryptandstoretokenyxl6bbk.serializer(i2);
                                i4 = i5;
                            } catch (Throwable th14) {
                                Throwable cause7 = th14.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th14;
                            }
                            break;
                        case -2:
                            encryptandstoretokenyxl6bbk.RemoteActionCompatParcelizer = 1;
                            encryptandstoretokenyxl6bbk.serializer(2);
                            encryptandstoretokenyxl6bbk.serializer(3);
                            encryptandstoretokenyxl6bbk.read = ((RememberLottieCompositionKtrememberLottieComposition3) encryptandstoretokenyxl6bbk.write).serializer;
                            i2 = 4;
                            encryptandstoretokenyxl6bbk.serializer(i2);
                            i4 = i5;
                            break;
                        case -1:
                            i4 = 51;
                            break;
                        default:
                            i4 = i5;
                            break;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    if (i4 >= 74) {
                        byte[] bArr16 = MediaMetadataCompat;
                        byte b117 = bArr16[105];
                        byte b118 = bArr16[63];
                        objArr = new Object[1];
                        a(b117, b118, (short) (b118 | 321), objArr);
                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                        }
                        byte b119 = bArr16[105];
                        byte b1110 = bArr16[63];
                        objArr2 = new Object[1];
                        a(b119, b1110, (short) (b1110 | 321), objArr2);
                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                        }
                        throw th;
                    }
                    byte[] bArr17 = MediaMetadataCompat;
                    byte b1111 = bArr17[105];
                    byte b1112 = bArr17[63];
                    objArr = new Object[1];
                    a(b1111, b1112, (short) (b1112 | 321), objArr);
                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                    }
                    byte b1113 = bArr17[105];
                    byte b1114 = bArr17[63];
                    objArr2 = new Object[1];
                    a(b1113, b1114, (short) (b1114 | 321), objArr2);
                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                    }
                    throw th;
                    encryptandstoretokenyxl6bbk.read = th;
                    encryptandstoretokenyxl6bbk.serializer(48);
                }
            }
        } catch (Throwable th16) {
            Throwable cause8 = th16.getCause();
            if (cause8 != null) {
                throw cause8;
            }
            throw th16;
        }
    }
}
