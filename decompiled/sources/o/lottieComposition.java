package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.huawei.hms.adapter.internal.BaseCode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public interface lottieComposition {
    public static final byte[] $$a = {25, -98, 105, 102};
    public static final int $$b = 176;
    public static final byte[] read = {4, 65, -68, 39, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -52, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -2, 15, -45, 37, 3, -13, -1, 11, -43, 34, 17, -11, 6, -1, -35, 26, 20, -37, 21, 4, -8, 10, 6, -1, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 38, 17, 19, -4, -31, 31, -11, 3, 7, -2, 15, -37, 23, 0, 13, -14, 15, -50, 35, 1, 9, 3, -13, -9, 21, -21, -51, 62, -11, 13, -7, -57, 21, 37, -7, 17, -31, 18, 12, 4, -16, 9, -11, 2, 13, -10, 14, -3, -6, -5, -54, 73, -14, -5, 3, -2, 15, -70, 23, 51, -8, -15, 13, -10, -3, 1, 10, -7, -25, 29, 10, 1, -30, 19, -4, 18, -2, 15, -36, 17, 2, 8, -6, -1, -20, 31, 4, -10, 11, -11, 6, -1, -39, 43, -3, 6, -5, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, -9, 21, -21, -51, 62, -11, 13, -7, -57, 23, 51, -21, 2, 11, 4, -11, 6, -1};
    public static final int IconCompatParcelizer = 70;
    public static final char[] serializer = {52537, 52538, 52536, 52542, 52518, 52517, 52539, 52512, 52541, 52516, 52513, 52532, 52543, 52533, 52540, 52519};
    public static final char write = 63634;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r5, short r6, short r7) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r6 = r6 * 2
            int r6 = 105 - r6
            byte[] r0 = o.lottieComposition.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lottieComposition.$$c(short, short, short):java.lang.String");
    }

    String read(String str, String str2);

    private static void b(byte b, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = serializer;
        int i3 = -556721944;
        Object obj2 = null;
        int i4 = 6;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.getThreadPriority(0) + 20) >> i4), 2015 - TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24, 234961161, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = -556721944;
                    i4 = 6;
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
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
        if (objRemoteActionCompatParcelizer2 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 1);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2015, Process.getGidForName("") + 25, 234961161, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
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
            extractintegerpixels.IconCompatParcelizer = 0;
            while (extractintegerpixels.IconCompatParcelizer < i2) {
                extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                if (extractintegerpixels.read == extractintegerpixels.write) {
                    cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.lastIndexOf("", '0') + 1), 142 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                        Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2369, 17 - TextUtils.indexOf("", "", 0), 1616580640, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i6 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i6];
                    } else {
                        obj = null;
                        if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                            extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                            extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                            int i7 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            int i8 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i7];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i8];
                        } else {
                            int i9 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                            int i10 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i9];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i10];
                        }
                    }
                }
                extractintegerpixels.IconCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i11 = 0; i11 < i; i11++) {
            cArr4[i11] = (char) (cArr4[i11] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 118 - r6
            int r8 = 213 - r8
            byte[] r0 = o.lottieComposition.read
            int r1 = 33 - r7
            byte[] r1 = new byte[r1]
            int r7 = 32 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lottieComposition.a(short, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ String IconCompatParcelizer(lottieComposition lottiecomposition, String str, String str2, int i, Object obj) throws Throwable {
        estimatedTimeToArrivalFormatter estimatedtimetoarrivalformatter = new estimatedTimeToArrivalFormatter(lottiecomposition, str, str2, i, obj);
        try {
            byte[] bArr = read;
            Object[] objArr = new Object[1];
            a(bArr[51], bArr[24], (short) 210, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[34], bArr[150], (short) 181, objArr2);
            byte b = (byte) (52 - (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)));
            char[] cArr = {11, '\t', 11, 7, 6, 11, 7, 11, '\b', 14, 6, 11, 3, 6, 15, 4, '\b', 2, 6, 11, 3, 5, 14, '\n', 6, 11, 15, 11, 3, 5, '\t', 14, 4, 7, 4, 11, 15, 6, 11, '\t', 15, 6, 11, 0, 6, 11, 13790, 13790, 6, 11, 11, 0, 6, 11, '\f', 0, 4, 11, 15, 4, 11, '\t', 11, 4, '\n', 0, 4, 11, 3, 4, 11, '\t', 3, 6, '\t', 0, 4, 11, 3, 5, '\n', 4, 4, 11, 15, 11, 11, '\t', 3, 4, 11, '\t', 3, 5, 2, 15, 6, 11, '\n', 4, 11, 7, 11, 4, 11, '\t', 7, 4, 11, '\t', 15, 11, 13787, 13787, 6, 11, '\t', '\f', 11, 7, 15, 4, 11, '\t', 15, 5, 11, 2, 15, 6, 11, 2, 13789};
            Object[] objArr3 = {"", 0};
            Object[] objArr4 = new Object[1];
            a(bArr[51], bArr[40], (short) 157, objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[34], bArr[14], (short) 136, objArr5);
            String str3 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[107], bArr[40], (short) 122, objArr6);
            Object[] objArr7 = new Object[1];
            b(b, cArr, 133 - ((Integer) cls2.getMethod(str3, Class.forName((String) objArr6[0]), Integer.TYPE).invoke(null, objArr3)).intValue(), objArr7);
            String str4 = (String) objArr7[0];
            Object[] objArr8 = {0L};
            byte b2 = bArr[51];
            char c = 'R';
            byte b3 = bArr[82];
            Object[] objArr9 = new Object[1];
            a(b2, b3, (short) (b3 | 101), objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            byte b4 = bArr[34];
            byte b5 = bArr[40];
            int i2 = IconCompatParcelizer;
            Object[] objArr10 = new Object[1];
            a(b4, b5, (short) (i2 - 1), objArr10);
            byte bIntValue = (byte) (37 - ((Integer) cls3.getMethod((String) objArr10[0], Long.TYPE).invoke(null, objArr8)).intValue());
            char[] cArr2 = {13787};
            Object[] objArr11 = {0L};
            byte b6 = bArr[51];
            byte b7 = bArr[82];
            Object[] objArr12 = new Object[1];
            a(b6, b7, (short) (b7 | 101), objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[34], bArr[40], (short) (i2 - 1), objArr13);
            Object[] objArr14 = new Object[1];
            b(bIntValue, cArr2, ((Integer) cls4.getMethod((String) objArr13[0], Long.TYPE).invoke(null, objArr11)).intValue() + 1, objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            short s = (short) 48;
            Object[] objArr16 = new Object[1];
            a(bArr[107], bArr[43], s, objArr16);
            Class<?> cls5 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[24], (byte) (bArr[138] - 1), bArr[176], objArr17);
            String str5 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(bArr[107], bArr[43], s, objArr18);
            Object[] objArr19 = (Object[]) cls5.getMethod(str5, Class.forName((String) objArr18[0])).invoke(str4, objArr15);
            int[] iArr = new int[objArr19.length];
            int i3 = 0;
            while (i3 < objArr19.length) {
                Object[] objArr20 = {objArr19[i3]};
                byte[] bArr2 = read;
                Object[] objArr21 = new Object[1];
                a(bArr2[107], (byte) (-bArr2[109]), bArr2[138], objArr21);
                Class<?> cls6 = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                a(bArr2[c], bArr2[48], bArr2[4], objArr22);
                String str6 = (String) objArr22[0];
                Object[] objArr23 = new Object[1];
                a(bArr2[107], bArr2[43], s, objArr23);
                Object objInvoke = cls6.getMethod(str6, Class.forName((String) objArr23[0])).invoke(null, objArr20);
                Object[] objArr24 = new Object[1];
                a(bArr2[107], (byte) (-bArr2[109]), bArr2[138], objArr24);
                Class<?> cls7 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr2[4], (byte) (-bArr2[137]), bArr2[77], objArr25);
                iArr[i3] = ((Integer) cls7.getMethod((String) objArr25[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 'R';
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (estimatedtimetoarrivalformatter.IconCompatParcelizer(iArr[i4])) {
                        case -20:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(11);
                            throw ((Throwable) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer);
                        case -19:
                            i4 = 34;
                            break;
                        case -18:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(19);
                            int i6 = estimatedtimetoarrivalformatter.serializer;
                            i4 = (i6 == 15 || i6 != 67) ? 12 : 9;
                            break;
                        case -17:
                            i4 = 29;
                            break;
                        case -16:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(19);
                            if (estimatedtimetoarrivalformatter.serializer != 0) {
                                i4 = 5;
                            } else {
                                i5 = 17;
                            }
                            break;
                        case -15:
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i4 = 1;
                            break;
                        case -13:
                            estimatedtimetoarrivalformatter.read = 1;
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(8);
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(9);
                            IBraze$$ExternalSyntheticBUOutline0.m((String) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer);
                            break;
                        case -12:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer = "Super calls with default arguments not supported in this target, function: invoke";
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(5);
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(11);
                            return (String) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            estimatedtimetoarrivalformatter.read = 3;
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(8);
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(9);
                            lottieComposition lottiecomposition2 = (lottieComposition) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer;
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(9);
                            String str7 = (String) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer;
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(9);
                            estimatedtimetoarrivalformatter.IconCompatParcelizer = lottiecomposition2.read(str7, (String) estimatedtimetoarrivalformatter.RemoteActionCompatParcelizer);
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(5);
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i4 = 24;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer = "SHA-256";
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(5);
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            i4 = 35;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            i4 = 37;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            try {
                                estimatedtimetoarrivalformatter.IconCompatParcelizer(4);
                                i4 = estimatedtimetoarrivalformatter.serializer == 0 ? 8 : i5;
                            } catch (Throwable th) {
                                th = th;
                                byte[] bArr3 = read;
                                Object[] objArr26 = new Object[1];
                                a(bArr3[107], bArr3[6], bArr3[82], objArr26);
                                if (!Class.forName((String) objArr26[0]).isInstance(th) || i4 < 9 || i4 >= 10) {
                                    throw th;
                                }
                                estimatedtimetoarrivalformatter.IconCompatParcelizer = th;
                                estimatedtimetoarrivalformatter.IconCompatParcelizer(24);
                                i4 = 39;
                            }
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i4 = 30;
                            break;
                        case -3:
                            i4 = 32;
                            break;
                        case -2:
                            estimatedtimetoarrivalformatter.IconCompatParcelizer(1);
                            if (estimatedtimetoarrivalformatter.serializer == 0) {
                                i4 = 4;
                            }
                            break;
                        case -1:
                            i4 = 21;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }
}
