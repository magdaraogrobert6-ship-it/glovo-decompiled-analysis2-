package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSqliteDriverKt implements resizeToBitmapDimensionslambda0 {
    public final boolean read;
    public final a6 serializer;
    private static final byte[] $$c = {76, 21, 71, -99};
    private static final int $$f = Constant.ERROR_WSS_INVALID;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 102, 8, -90, -69, 16, 44, -21, 21, -25, -34, 26, 6, -13, -5, 5, -15, -2, -28, 16, 9, -17, 2, -6, 9, -51, 40, -6, -1, -19, 9, -9, 2, -5, -78, 79, -9, -13, 7, -19, -17, -8, -1, 8, -6, -67, 54, 9, -24, 18, -22, 0, -63, 65, -18, -6, 14, -7, -17, -59, 47, 9, -14, 10, -7, -10, -9, -58, 49, 8, -6, -4, -2, -5, -68, 51, 15, -25, -2, 7, 0, -15, 2, -5, -68, 28, 29, -35, 17, 9, -9, -8, 6, -4, -14, 2, -5, -47, 33, -7, -6, 4, -10, 9, -49, 47, -25, -2, 7, 0, -15, 2, -5, -4, 57};
    private static final int $$e = 172;
    private static final byte[] $$a = {62, 67, -109, -100, 13, 4, -3, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 249;
    private static int RemoteActionCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] write = {52581, 52597, 52884, 52582, 52587, 52600, 52580, 52579, 52577, 52548, 52514, 52607, 52586, 52606, 52882, 52601, 52578, 52885, 52887, 52604, 52557, 52883, 52559, 52588, 52574, 52886, 52568, 52583, 52602, 52590, 52589, 52576, 52591, 52584, 52575, 52585};
    private static char IconCompatParcelizer = 63632;

    private static String $$g(int i, byte b, byte b2) {
        byte[] bArr = $$c;
        int i2 = 105 - (b * 2);
        int i3 = b2 * 3;
        int i4 = (i * 3) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 = i4 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i4];
            i4++;
            i2 += i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.AndroidSqliteDriverKt.$$a
            int r7 = r7 * 3
            int r7 = 33 - r7
            int r8 = r8 * 8
            int r8 = r8 + 4
            int r6 = 114 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidSqliteDriverKt.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 114 - r7
            int r8 = r8 + 4
            byte[] r0 = o.AndroidSqliteDriverKt.$$d
            int r9 = r9 + 3
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L27:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + 4
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidSqliteDriverKt.c(int, short, short, java.lang.Object[]):void");
    }

    public AndroidSqliteDriverKt(boolean z, a6 a6Var) {
        this.read = z;
        this.serializer = a6Var;
    }

    private static void b(byte b, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = write;
        int i5 = -556721944;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 85;
                $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2015 - View.resolveSizeAndState(0, 0, 0), 24 - View.resolveSize(0, 0), 234961161, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = -556721944;
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
        Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
        if (objRemoteActionCompatParcelizer2 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 1);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2015 - android.graphics.Color.alpha(0), TextUtils.lastIndexOf("", '0', 0, 0) + 25, 234961161, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10 + 65;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i11 = $11 + 121;
            $10 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                extractintegerpixels.IconCompatParcelizer = 1;
            } else {
                extractintegerpixels.IconCompatParcelizer = 0;
            }
            while (extractintegerpixels.IconCompatParcelizer < i2) {
                int i12 = $10 + 61;
                $11 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                if (extractintegerpixels.read == extractintegerpixels.write) {
                    int i14 = $10 + 125;
                    $11 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read + b);
                        cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.write * b);
                    } else {
                        cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                    }
                } else {
                    try {
                        Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 140 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "", 0) + 18, -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                            int i15 = $11 + 93;
                            $10 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2370 - android.view.KeyEvent.normalizeMetaState(0), 17 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1616580640, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i17 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i17];
                        } else if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                            extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                            extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                            int i18 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            int i19 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i18];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i19];
                        } else {
                            int i20 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                            int i21 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i20];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i21];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                extractintegerpixels.IconCompatParcelizer += 2;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        String str = new String(cArr4);
        int i23 = $10 + 73;
        $11 = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i23 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.read);
        a6 a6Var = this.serializer;
        if (a6Var != null) {
            iHashCode = a6Var.hashCode();
        } else {
            int i4 = MediaDescriptionCompat + 117;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = MediaDescriptionCompat + 43;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 28 / 0;
        }
        return i6;
    }

    public static AndroidSqliteDriverKt IconCompatParcelizer(AndroidSqliteDriverKt androidSqliteDriverKt, boolean z, a6 a6Var, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = RemoteActionCompatParcelizer + 23;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = androidSqliteDriverKt.read;
        }
        if ((i & 2) != 0) {
            a6Var = androidSqliteDriverKt.serializer;
            int i5 = MediaDescriptionCompat + 113;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        androidSqliteDriverKt.getClass();
        return new AndroidSqliteDriverKt(z, a6Var);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
        if (objRemoteActionCompatParcelizer == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int doubleTapTimeout = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 784;
            int iCombineMeasuredStates = 74 - View.combineMeasuredStates(0, 0);
            byte b = $$a[17];
            byte b2 = (byte) (b - 1);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 10), (byte) (b - 1), objArr3);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMyPid, doubleTapTimeout, iCombineMeasuredStates, -940932292, false, (String) objArr3[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr4 = new Object[1];
        b((byte) ((Process.myPid() >> 22) + 13), new char[]{'\"', '\f', 31, 15, 6, 1, '\"', '\t', '\b', 6, 16, 4, 5, 7, 11, 5, '\n', 20, 1, '\r', '!', 26}, 22 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b((byte) (114 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), new char[]{30, ' ', 31, 18, 17, 5, 30, 27, 30, 31, '#', 1, 2, 6, 13937}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
        if (objRemoteActionCompatParcelizer2 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int maximumFlingVelocity = 784 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i2 = 75 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i3 = $$b;
            Object[] objArr6 = new Object[1];
            a((byte) (i3 & 32), (byte) (i3 & 15), $$a[30], objArr6);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup, maximumFlingVelocity, i2, 150322061, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = MediaDescriptionCompat + 87;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
            if (objRemoteActionCompatParcelizer3 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int iResolveSize = View.resolveSize(0, 0) + 784;
                int i6 = 75 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b3 = (byte) ($$b & 47);
                byte[] bArr = $$a;
                Object[] objArr7 = new Object[1];
                a(b3, (byte) (bArr[17] - 1), bArr[20], objArr7);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(mirror, iResolveSize, i6, -2100268632, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr8[2])[0];
            int i8 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[1];
            int i9 = ~System.identityHashCode(this);
            int i10 = (((((~((-962145488) | i9)) | 676856846) * (-241)) - 1004334069) + (((~(i9 | (-285288642))) | 10654496) * 241)) - 577918136;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            int i13 = MediaDescriptionCompat + 87;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            b((byte) (19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), new char[]{'\"', '\f', 31, 15, 6, 1, '\"', '\t', 31, 18, 22, 7, 26, 2, 0, 1, 24, 4, 0, 2, 24, '\b', 17, 31, 31, '\"'}, 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b((byte) (36 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), new char[]{'!', 14, 13835, 13835, '\"', 17, 2, 23, 13837, 13837, 30, 1, '!', 31, 0, 1, '\n', '\r'}, TextUtils.indexOf("", "", 0) + 18, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i15 = RemoteActionCompatParcelizer + 21;
                MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b((byte) (14 - View.combineMeasuredStates(0, 0)), new char[]{0, '!', 24, '\"', 7, '\"', '\"', '\f', '\n', 16, 31, 4, 17, 11, ' ', 11}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b((byte) (TextUtils.lastIndexOf("", '0', 0) + 81), new char[]{3, 30, '\"', 17, 0, 1, 0, 2, 6, '!', 6, 7, 19, '\n', '\"', 30}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -577918136};
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                c((byte) (-bArr2[28]), bArr2[51], (byte) (-bArr2[10]), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b4 = bArr2[51];
                Object[] objArr15 = new Object[1];
                c(b4, (byte) (b4 | 36), (byte) (-bArr2[28]), objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int iLastIndexOf = 783 - TextUtils.lastIndexOf("", '0');
                        int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 73;
                        byte b5 = (byte) ($$b & 47);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(b5, (byte) (bArr3[17] - 1), bArr3[20], objArr17);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, iLastIndexOf, i17, -2100268632, false, (String) objArr17[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        b((byte) (TextUtils.lastIndexOf("", '0') + 14), new char[]{'\"', '\f', 31, 15, 6, 1, '\"', '\t', '\b', 6, 16, 4, 5, 7, 11, 5, '\n', 20, 1, '\r', '!', 26}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b((byte) (Process.getGidForName("") + 115), new char[]{30, ' ', 31, 18, 17, 5, 30, 27, 30, 31, '#', 1, 2, 6, 13937}, ExpandableListView.getPackedPositionGroup(0L) + 15, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int touchSlop = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 784;
                            int maximumFlingVelocity2 = 74 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i18 = $$b;
                            Object[] objArr20 = new Object[1];
                            a((byte) (i18 & 32), (byte) (i18 & 15), $$a[30], objArr20);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(trimmedLength, touchSlop, maximumFlingVelocity2, 150322061, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int iIndexOf = 784 - TextUtils.indexOf("", "");
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 75;
                            byte b6 = $$a[17];
                            byte b7 = (byte) (b6 - 1);
                            Object[] objArr21 = new Object[1];
                            a(b7, (byte) (b7 | 10), (byte) (b6 - 1), objArr21);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, iIndexOf, packedPositionChild, -940932292, false, (String) objArr21[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 == i19) {
            int i21 = MediaDescriptionCompat + 19;
            RemoteActionCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i22 = i21 % 2;
            Object[] objArr22 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i26 = i23 + (-1855207956) + (((~((~iMaxMemory) | 137005435)) | (-1512815612)) * 529) + (((~(iMaxMemory | 137005435)) | (-1512651395)) * 529);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[3])[0] = i28 ^ (i28 << 5);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i29 = ((int[]) objArr22[3])[0];
            int i30 = ((int[]) objArr22[2])[0];
            int i31 = ((int[]) objArr22[0])[0];
            String[] strArr3 = (String[]) objArr22[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i32 = ~iElapsedRealtime;
            int i33 = i29 + (-648494327) + (((~((-473589602) | i32)) | (~(iElapsedRealtime | 1176067228))) * 333) + (((~(iElapsedRealtime | (-473589602))) | (~(i32 | 1176067228))) * 333);
            int i34 = i33 ^ (i33 << 13);
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[3])[0] = i35 ^ (i35 << 5);
        } else {
            try {
                Object[] objArr23 = {Long.valueOf((((long) 1082810977) << 32) ^ (((long) (i19 ^ i20)) & 4294967295L)), Long.valueOf(1082810981)};
                byte[] bArr4 = $$d;
                byte b8 = bArr4[15];
                Object[] objArr24 = new Object[1];
                c(b8, (byte) (b8 | 34), (byte) (-bArr4[74]), objArr24);
                Class<?> cls6 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                c(bArr4[11], (byte) 109, bArr4[51], objArr25);
                cls6.getMethod((String) objArr25[0], Long.TYPE, Long.TYPE).invoke(null, objArr23);
                Object[] objArr26 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i36 = ((int[]) objArr[3])[0];
                int i37 = ((int[]) objArr[2])[0];
                int i38 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i39 = 1648720301 + (((~((-160520507) | iIdentityHashCode)) | 142624770 | (~((-1489136324) | iIdentityHashCode))) * (-880));
                int i40 = (~((-160520507) | (~iIdentityHashCode))) | 1489136323;
                int i41 = ~(iIdentityHashCode | 160520506);
                int i42 = i36 + i39 + ((i40 | i41) * (-880)) + (i41 * 880);
                int i43 = (i42 << 13) ^ i42;
                int i44 = i43 ^ (i43 >>> 17);
                ((int[]) objArr26[3])[0] = i44 ^ (i44 << 5);
                Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
                objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i45 = ((int[]) objArr26[3])[0];
                int i46 = ((int[]) objArr26[2])[0];
                int i47 = ((int[]) objArr26[0])[0];
                String[] strArr5 = (String[]) objArr26[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i48 = ~iIdentityHashCode2;
                int i49 = i45 + 176254482 + (((~((-1056461368) | i48)) | 593195462) * 519) + (((~(i48 | (-480248370))) | (~(1073443831 | iIdentityHashCode2))) * (-519)) + (((~(iIdentityHashCode2 | 593195462)) | 1056461367) * 519);
                int i50 = (i49 << 13) ^ i49;
                int i51 = i50 ^ (i50 >>> 17);
                ((int[]) objArr2[3])[0] = i51 ^ (i51 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidSqliteDriverKt) {
            AndroidSqliteDriverKt androidSqliteDriverKt = (AndroidSqliteDriverKt) obj;
            if (this.read == androidSqliteDriverKt.read) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, androidSqliteDriverKt.serializer}, getCieXyz.write())).booleanValue();
            }
            int i52 = MediaDescriptionCompat + 31;
            RemoteActionCompatParcelizer = i52 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i53 = i52 % 2;
            return false;
        }
        int i54 = RemoteActionCompatParcelizer + 45;
        MediaDescriptionCompat = i54 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i55 = i54 % 2;
        int i56 = ((int[]) objArr2[3])[0];
        int i57 = ((i56 * i56) - (~(-(747237775 * i56)))) - 1;
        int i58 = -(i56 * 205153133);
        int i59 = ((i57 ^ i58) + ((i58 & i57) << 1)) - (-528848388);
        int i60 = i59 >> 16;
        int i61 = ((((i60 | (-131071)) << 1) - (i60 ^ (-131071))) / 65536) + 1;
        int i62 = (i59 & i61) + (i59 | i61);
        int i63 = i59 >> 21;
        int i64 = (((i63 | (-4095)) << 1) - (i63 ^ (-4095))) / androidx.compose.ui.graphics.Fields.CameraDistance;
        int i65 = -(i62 ^ (((i64 | 1) << 1) - (i64 ^ 1)));
        int i66 = ((i65 | 5) << 1) - (i65 ^ 5);
        int i67 = (((i66 >> 19) - 16383) / 8192) + 1;
        return 0 / (((-(((i67 | 1) << 1) - (i67 ^ 1))) & i66) * 67);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LoginActivityViewState(showLoading=" + this.read + ", dialog=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 65;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
