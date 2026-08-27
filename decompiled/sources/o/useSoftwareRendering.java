package o;

import android.app.Application;
import android.os.Process;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class useSoftwareRendering {
    private static final byte[] IconCompatParcelizer = {50, -28, 114, 103, -13, 10, -14, 3, 6, 5, 54, -70, 15, -19, 4, 70, -38, -17, -19, 4, 31, -31, 11, -3, -7, 11, -18, -1, 43, -37, 10, -1, -19, 41, -23, 9, -21, 21, 51, -62, 11, -13, 7, 57, -21, -37, 7, -17, 31, -18, -12, -4, 16, -9, 11, -2, -13, 10, -14, 3, 6, 5, 54, -72, 13, 4, -18, 73, -29, -26, -20, 52, -49, 17, -9, -6, 2, -15, 39, -34, 11, -5, 3, -3, 4, -13, 37, -24, -15, 19, 14, -33, 19, -19, 15, 24, -20, -18, 8, 9, -21, 21, 51, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, 51, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -21, -44, 1, -6, 15, -19, 4, 2, -15, 36, -17, -2, -8, 10, -6, 2, 24, -20, -13, 13, -6, 2, -13, 2, -15, 36, -17, -2, -8, 10, -6, 2, 23, -19, -12, 8, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -34, -17, -2, -8, 10, -6, 2, 24, -20, -13, 13, -6, 2, -13, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -34, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9, 10, 2, -7, 5, -5, 7, 30, -37, 8, -9, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -37, -22, 2, -7, 5, -5, 7, 30, -37, 8, -9, 2, -15, 51, -47, 5, 40, -44, 1, -6, 15, -9, -6, 1, 32, -22, 2, -7, 9, -13, -1, 9, -21, 21, 51, -71, 1, 11, -3, 62, -19, -49, 0, 17, -24, 45, -29, -10, -1, -13, 10, -14, 3, 6, 5, 54, -53, -12, 1, -6, 15, -9, -6, 70, -66, 3, 63, -37, -22, 2, -7, 13, -19, -1, 3, 13, 7, -18, 11, 37, -44, 11, -1, 9, -21, 21, 51, -71, 1, 11, -3, 62, -21, -44, 3, 0, 7, 2, -17, 11, -6, 1, -3, 0, 9, -21, 21, 51, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17};
    private static final int MediaSessionCompatQueueItem = 109;
    private static long RemoteActionCompatParcelizer;
    private static int read;
    private static int write;
    private final Application serializer;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public useSoftwareRendering(Application application) {
        application.getClass();
        this.serializer = application;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        accesstoViewVelocity accesstoviewvelocity = new accesstoViewVelocity();
        accesstoviewvelocity.IconCompatParcelizer = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i2 = accesstoviewvelocity.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[accesstoviewvelocity.write]), accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1166805757);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 45251), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2179, 14 - Gravity.getAbsoluteGravity(0, 0), 1789121762, false, com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i2] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RemoteActionCompatParcelizer ^ 7879248456549226868L);
                Object[] objArr3 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 231 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 21, 107586304, false, "e", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
            Object[] objArr4 = {accesstoviewvelocity, accesstoviewvelocity};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.alpha(0), Process.getGidForName("") + 232, 21 - android.graphics.Color.blue(0), 107586304, false, "e", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 3
            byte[] r1 = o.useSoftwareRendering.IconCompatParcelizer
            int r6 = 118 - r6
            int r7 = 403 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 2
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.useSoftwareRendering.a(int, short, int, java.lang.Object[]):void");
    }

    static void read() {
        RemoteActionCompatParcelizer = 7304728516276585190L;
    }

    static {
        read();
        write = 0;
        read = 1;
    }

    /* JADX WARN: Code duplicated, block: B:218:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:286:0x07db A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final List<Integer> RemoteActionCompatParcelizer() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        clearDataIfNeeded cleardataifneeded = new clearDataIfNeeded(this);
        try {
            char c = 0;
            Object[] objArr = {"", '0', 0};
            byte[] bArr = IconCompatParcelizer;
            Object[] objArr2 = new Object[1];
            a(bArr[37], (short) 400, bArr[89], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[5];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 369), bArr[98], objArr3);
            String str = (String) objArr3[0];
            char c2 = '2';
            Object[] objArr4 = new Object[1];
            a((byte) (-bArr[50]), (short) 369, bArr[89], objArr4);
            Object[] objArr5 = new Object[1];
            b(12670 - ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Character.TYPE, Integer.TYPE).invoke(null, objArr)).intValue(), new char[]{23487, 27356, 14656, 53211, 40514, 44228, 29530, 455, 53343, 59081, 46409, 31700, 2634, 55511, 61260, 48590, 19536, 4817, 8523, 63443, 34374, 21717, 6997, 10703, 63574, 36546, 23896, 25550, 12890, 49372, 38725, 42463, 29791, 15099, 51552, 40954, 44642, 31972, 895, 53735, 57471, 46825, 17769, 3071, 55914, 59628, 49017, 19951, 7279, 8940, 61804, 34803, 22127, 25834, 11124, 63990, 34923, 24292, 28024, 13282, 49786, 37116, 42849, 30177, 1150, 51840, 39197, 44956, 32258, 3204, 54041, 57759, 45062, 18068, 5392, 56203, 59927, 47252, 20236, 7570, 11284, 62097, 33041, 22414, 26123, 13461, 64271, 35223, 22539, 28290, 15640, 50054, 37390, 41117, 30493, 1410, 54276, 39585, 43325, 32697, 3618, 56504, 58161, 45479, 16423, 5812, 9523, 60331, 47659, 18608, 7992, 11695, 64559, 33452, 20773, 26547, 13868, 50344, 35636, 22953, 26664, 16057, 52518, 37796, 41530, 28860, 1826, 54691, 58430, 43871, 31192, 2115, 57046, 60741, 46042, 16990, 4294, 10056, 62934, 33878, 19146, 6476, 12242, 65105, 36046, 21327, 25034, 12371, 50899, 38219, 23499, 27223, 14530, 53081, 40409, 44101, 29378, 349, 55234, 58955, 46302, 31584, 2558, 55419, 61154, 48507, 17393, 4711, 8440, 63356, 34280, 21620, 6902, 10605, 65517, 36465, 23799, 25457, 12783, 49262, 38642, 42346, 27626, 14967, 51447, 40807, 44519, 31867, 763, 53603, 59366, 46719, 17633, 2846, 55680, 59420, 48794, 19717, 5019, 8734, 61574, 34568, 21910, 25616, 10890, 63762, 36758, 24079, 27791, 13071, 49540, 36883, 42643, 29963, 15233, 51735, 39063, 44806, 32132, 3099, 53915, 57602, 46977, 17951, 5251, 56126, 59808, 47138, 20159, 7480, 9124, 62008, 32946, 22313, 26037, 13364, 64170, 35123, 24504, 28207, 15537, 49956, 37296, 41004, 30380, 1333, 52149, 39464, 43176, 32569, 3513, 56358, 58021, 45373, 18365, 5666, 9382, 60353, 47681, 18653, 8024, 11717, 64604, 33499, 20806, 26582, 13905, 50379, 35659, 22995, 26711, 16079, 52561, 37835, 41552, 28882, 1869, 54730, 58452, 43734, 31049, 4033, 56920, 60634, 45893, 16836, 4188, 9950, 62785, 48120, 19040, 6370, 12157, 65023, 35940, 21247, 24955, 14313, 50800, 38133, 23402, 27125, 14451, 52975, 40303, 41966, 29291, 243, 55148, 58848, 46196, 31471, 2409, 57337, 61049, 48356, 17262, 4605, 8317, 63200, 34155, 19329, 6657, 10395, 65310, 36229, 23557, 25247, 12570, 51081, 38409, 42131, 27415, 14733, 51220, 40597, 44302, 29584, 520, 53389, 59154, 46477, 17423, 2711, 55575, 61313, 48646, 19611, 4891, 8581, 61443, 34463, 21766, 7093, 10784, 63650, 36666, 23997, 27684, 12991, 49459, 38825, 42537, 29875, 15154}, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[37], (short) 348, (byte) (-bArr[26]), objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[12], (short) 328, bArr[37], objArr7);
            Object[] objArr8 = new Object[1];
            b(((byte) ((Integer) cls2.getMethod((String) objArr7[0], null).invoke(null, null)).intValue()) + 35090, new char[]{23486}, objArr8);
            Object[] objArr9 = {(String) objArr8[0]};
            short s = (short) 305;
            Object[] objArr10 = new Object[1];
            a((byte) (-bArr[50]), s, bArr[64], objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[7], (short) 290, bArr[76], objArr11);
            String str3 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a((byte) (-bArr[50]), s, bArr[64], objArr12);
            Object[] objArr13 = (Object[]) cls3.getMethod(str3, Class.forName((String) objArr12[0])).invoke(str2, objArr9);
            int[] iArr = new int[objArr13.length];
            int i5 = 0;
            while (i5 < objArr13.length) {
                Object[] objArr14 = {objArr13[i5]};
                byte[] bArr2 = IconCompatParcelizer;
                byte b2 = (byte) (-bArr2[c2]);
                Object[] objArr15 = new Object[1];
                a(b2, (short) (b2 | 274), bArr2[90], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b3 = bArr2[342];
                Object[] objArr16 = new Object[1];
                a(b3, (short) (b3 | 270), bArr2[14], objArr16);
                String str4 = (String) objArr16[0];
                Object[] objArr17 = new Object[1];
                a((byte) (-bArr2[c2]), s, bArr2[64], objArr17);
                Object objInvoke = cls4.getMethod(str4, Class.forName((String) objArr17[0])).invoke(null, objArr14);
                byte b4 = (byte) (-bArr2[50]);
                Object[] objArr18 = new Object[1];
                a(b4, (short) (b4 | 274), bArr2[90], objArr18);
                Class<?> cls5 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                a(bArr2[64], (short) Constant.ERROR_ROTATION_ANGLE_INVALID, bArr2[9], objArr19);
                iArr[i5] = ((Integer) cls5.getMethod((String) objArr19[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c2 = '2';
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    switch (cleardataifneeded.RemoteActionCompatParcelizer(iArr[i6])) {
                        case -44:
                            c = c;
                            i6 = GwiErrorCode.ALG_LIBRARY_NOT_EXIST;
                            c = c;
                            break;
                        case -43:
                            c = c;
                            cleardataifneeded.RemoteActionCompatParcelizer(45);
                            i7 = cleardataifneeded.IconCompatParcelizer != 89 ? 71 : 20;
                            i6 = i7;
                            c = c;
                            break;
                        case -42:
                            c = c;
                            i6 = 101;
                            c = c;
                            break;
                        case -41:
                            c = c;
                            cleardataifneeded.RemoteActionCompatParcelizer(45);
                            if (cleardataifneeded.IconCompatParcelizer != 77) {
                                i7 = 61;
                                i6 = i7;
                            } else {
                                i6 = 52;
                            }
                            c = c;
                            break;
                        case -40:
                            c = c;
                            i6 = 58;
                            c = c;
                            break;
                        case -39:
                            c = c;
                            i6 = 100;
                            c = c;
                            break;
                        case -38:
                            c = c;
                            cleardataifneeded.RemoteActionCompatParcelizer(44);
                            if (cleardataifneeded.IconCompatParcelizer == 0) {
                                i7 = 99;
                            }
                            i6 = i7;
                            c = c;
                            break;
                        case -37:
                            c = c;
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(11);
                            read = cleardataifneeded.IconCompatParcelizer;
                            i6 = i7;
                            c = c;
                            break;
                        case -36:
                            c = c;
                            cleardataifneeded.write = write;
                            cleardataifneeded.RemoteActionCompatParcelizer(10);
                            i6 = i7;
                            c = c;
                            break;
                        case -35:
                            i6 = 1;
                            break;
                        case -34:
                            i6 = 89;
                            break;
                        case -33:
                            c = c;
                            try {
                                cleardataifneeded.RemoteActionCompatParcelizer(37);
                                i6 = cleardataifneeded.IconCompatParcelizer;
                                if (i6 == 0) {
                                    i7 = 88;
                                }
                                i6 = i7;
                                c = c;
                            } catch (Throwable th) {
                                th = th;
                                if (i6 >= 75) {
                                }
                                throw th;
                            }
                            break;
                        case -32:
                            c = c;
                            try {
                                cleardataifneeded.RemoteActionCompatParcelizer(12);
                                if (cleardataifneeded.IconCompatParcelizer == 0) {
                                    i7 = 80;
                                }
                                i6 = i7;
                                c = c;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i6 >= 75) {
                                }
                                throw th;
                            }
                            break;
                        case -31:
                            cleardataifneeded.RemoteActionCompatParcelizer(27);
                            throw ((Throwable) cleardataifneeded.serializer);
                        case -30:
                            i6 = 107;
                            break;
                        case -29:
                            i6 = 109;
                            break;
                        case -28:
                            c = c;
                            cleardataifneeded.RemoteActionCompatParcelizer(37);
                            if (cleardataifneeded.IconCompatParcelizer == 0) {
                                i7 = 69;
                            }
                            i6 = i7;
                            c = c;
                            break;
                        case -27:
                            c = c;
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(11);
                            write = cleardataifneeded.IconCompatParcelizer;
                            i6 = i7;
                            c = c;
                            break;
                        case -26:
                            c = c;
                            cleardataifneeded.write = read;
                            i = 10;
                            cleardataifneeded.RemoteActionCompatParcelizer(i);
                            i6 = i7;
                            c = c;
                            break;
                        case -25:
                            i6 = 81;
                            break;
                        case -24:
                            cleardataifneeded.RemoteActionCompatParcelizer(27);
                            return (List) cleardataifneeded.serializer;
                        case -23:
                            i6 = 34;
                            break;
                        case -22:
                            try {
                                cleardataifneeded.write = 2;
                                cleardataifneeded.RemoteActionCompatParcelizer(1);
                                cleardataifneeded.RemoteActionCompatParcelizer(2);
                                Object obj = cleardataifneeded.serializer;
                                cleardataifneeded.RemoteActionCompatParcelizer(2);
                                try {
                                    Object[] objArr20 = {cleardataifneeded.serializer};
                                    byte[] bArr3 = IconCompatParcelizer;
                                    Object[] objArr21 = new Object[1];
                                    a((byte) (-bArr3[50]), bArr3[37], bArr3[73], objArr21);
                                    Class<?> cls6 = Class.forName((String) objArr21[c]);
                                    Object[] objArr22 = new Object[1];
                                    a(bArr3[37], bArr3[76], bArr3[342], objArr22);
                                    String str5 = (String) objArr22[c];
                                    Class<?>[] clsArr = new Class[1];
                                    try {
                                        try {
                                            Object[] objArr23 = new Object[1];
                                            a((byte) (-bArr3[50]), bArr3[342], bArr3[64], objArr23);
                                            c = 0;
                                            try {
                                                clsArr[0] = Class.forName((String) objArr23[0]);
                                                try {
                                                    cleardataifneeded.write = ((Boolean) cls6.getMethod(str5, clsArr).invoke(obj, objArr20)).booleanValue() ? 1 : 0;
                                                    i = 10;
                                                    cleardataifneeded.RemoteActionCompatParcelizer(i);
                                                    i6 = i7;
                                                    c = c;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    if (i6 >= 75) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                c = c;
                            }
                            break;
                        case -21:
                            try {
                                cleardataifneeded.write = 1;
                                cleardataifneeded.RemoteActionCompatParcelizer(1);
                                cleardataifneeded.RemoteActionCompatParcelizer(11);
                                try {
                                    Object[] objArr24 = new Object[1];
                                    objArr24[c] = Integer.valueOf(cleardataifneeded.IconCompatParcelizer);
                                    byte[] bArr4 = IconCompatParcelizer;
                                    byte b5 = (byte) (-bArr4[50]);
                                    try {
                                        Object[] objArr25 = new Object[1];
                                        a(b5, (short) (b5 | 274), bArr4[90], objArr25);
                                        Class<?> cls7 = Class.forName((String) objArr25[c]);
                                        byte b6 = bArr4[342];
                                        Object[] objArr26 = new Object[1];
                                        a(b6, (short) (b6 | 270), bArr4[14], objArr26);
                                        String str6 = (String) objArr26[c];
                                        Class<?>[] clsArr2 = new Class[1];
                                        clsArr2[c] = Integer.TYPE;
                                        try {
                                            try {
                                                cleardataifneeded.RemoteActionCompatParcelizer = cls7.getMethod(str6, clsArr2).invoke(null, objArr24);
                                                i2 = 3;
                                                cleardataifneeded.RemoteActionCompatParcelizer(i2);
                                                i6 = i7;
                                                c = c;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                if (i6 >= 75) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            Throwable cause2 = th.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                            }
                            break;
                        case -20:
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            Object obj2 = cleardataifneeded.serializer;
                            try {
                                byte[] bArr5 = IconCompatParcelizer;
                                byte b7 = bArr5[37];
                                Object[] objArr27 = new Object[1];
                                a(b7, (short) (b7 | 34), (byte) (bArr5[95] + 1), objArr27);
                                Class<?> cls8 = Class.forName((String) objArr27[c]);
                                Object[] objArr28 = new Object[1];
                                a(bArr5[90], bArr5[239], bArr5[9], objArr28);
                                cleardataifneeded.write = ((Integer) cls8.getMethod((String) objArr28[c], null).invoke(obj2, null)).intValue();
                                cleardataifneeded.RemoteActionCompatParcelizer(10);
                                i6 = i7;
                                c = c;
                            } catch (Throwable th14) {
                                Throwable cause3 = th14.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th14;
                            }
                            break;
                        case -19:
                            i6 = 50;
                            break;
                        case -18:
                            i6 = 39;
                            break;
                        case -17:
                            cleardataifneeded.RemoteActionCompatParcelizer(20);
                            if (cleardataifneeded.IconCompatParcelizer == 0) {
                                i7 = 38;
                            }
                            i6 = i7;
                            break;
                        case -16:
                            i6 = 90;
                            break;
                        case -15:
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(11);
                            try {
                                Object[] objArr29 = new Object[1];
                                objArr29[c] = Integer.valueOf(cleardataifneeded.IconCompatParcelizer);
                                byte[] bArr6 = IconCompatParcelizer;
                                Object[] objArr30 = new Object[1];
                                a((byte) (-bArr6[50]), bArr6[67], bArr6[52], objArr30);
                                Class<?> cls9 = Class.forName((String) objArr30[c]);
                                Class<?>[] clsArr3 = new Class[1];
                                clsArr3[c] = Integer.TYPE;
                                cleardataifneeded.RemoteActionCompatParcelizer = cls9.getDeclaredConstructor(clsArr3).newInstance(objArr29);
                                i2 = 3;
                                cleardataifneeded.RemoteActionCompatParcelizer(i2);
                                i6 = i7;
                                c = c;
                            } catch (Throwable th15) {
                                Throwable cause4 = th15.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th15;
                            }
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i6 = 52;
                            break;
                        case -13:
                            i6 = 26;
                            break;
                        case -12:
                            cleardataifneeded.RemoteActionCompatParcelizer(12);
                            if (cleardataifneeded.IconCompatParcelizer == 0) {
                                i7 = 25;
                            }
                            i6 = i7;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            try {
                                cleardataifneeded.write = 1;
                                cleardataifneeded.RemoteActionCompatParcelizer(1);
                                cleardataifneeded.RemoteActionCompatParcelizer(2);
                                Object obj3 = cleardataifneeded.serializer;
                                try {
                                    byte[] bArr7 = IconCompatParcelizer;
                                    Object[] objArr31 = new Object[1];
                                    a(bArr7[37], (short) 122, (byte) (-bArr7[127]), objArr31);
                                    Class<?> cls10 = Class.forName((String) objArr31[c]);
                                    try {
                                        Object[] objArr32 = new Object[1];
                                        a(bArr7[12], (short) 93, (byte) (-bArr7[26]), objArr32);
                                        try {
                                            cleardataifneeded.RemoteActionCompatParcelizer = cls10.getMethod((String) objArr32[c], null).invoke(obj3, null);
                                            i2 = 3;
                                            cleardataifneeded.RemoteActionCompatParcelizer(i2);
                                            i6 = i7;
                                            c = c;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            if (i6 >= 75) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        Throwable cause5 = th.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                if (i6 >= 75) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i6 = 102;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i6 = 104;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleardataifneeded.RemoteActionCompatParcelizer(12);
                            if (cleardataifneeded.IconCompatParcelizer == 0) {
                                i7 = 19;
                            }
                            i6 = i7;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            try {
                                cleardataifneeded.write = 1;
                                cleardataifneeded.RemoteActionCompatParcelizer(1);
                                cleardataifneeded.RemoteActionCompatParcelizer(2);
                                Object obj4 = cleardataifneeded.serializer;
                                byte[] bArr8 = IconCompatParcelizer;
                                Object[] objArr33 = new Object[1];
                                a(bArr8[37], (short) 161, (byte) (-bArr8[127]), objArr33);
                                Class<?> cls11 = Class.forName((String) objArr33[c]);
                                try {
                                    Object[] objArr34 = new Object[1];
                                    a(bArr8[7], (short) 132, bArr8[98], objArr34);
                                    cleardataifneeded.RemoteActionCompatParcelizer = cls11.getField((String) objArr34[c]).get(obj4);
                                    i3 = 3;
                                    cleardataifneeded.RemoteActionCompatParcelizer(i3);
                                    i6 = i7;
                                    c = c;
                                } catch (Throwable th20) {
                                    th = th20;
                                    if (i6 >= 75 || i6 >= 81) {
                                        throw th;
                                    }
                                    cleardataifneeded.RemoteActionCompatParcelizer = th;
                                    cleardataifneeded.RemoteActionCompatParcelizer(50);
                                    c = c;
                                    i6 = 70;
                                }
                            } catch (Throwable th21) {
                                th = th21;
                            }
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleardataifneeded.write = 3;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            Object obj5 = cleardataifneeded.serializer;
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            Object obj6 = cleardataifneeded.serializer;
                            cleardataifneeded.RemoteActionCompatParcelizer(11);
                            try {
                                Object[] objArr35 = new Object[2];
                                objArr35[1] = Integer.valueOf(cleardataifneeded.IconCompatParcelizer);
                                objArr35[c] = obj6;
                                byte[] bArr9 = IconCompatParcelizer;
                                Object[] objArr36 = new Object[1];
                                a(bArr9[37], (short) Constant.ERROR_ACC_JUMP, bArr9[142], objArr36);
                                Class<?> cls12 = Class.forName((String) objArr36[c]);
                                Object[] objArr37 = new Object[1];
                                a(bArr9[12], (short) 174, bArr9[22], objArr37);
                                String str7 = (String) objArr37[c];
                                Class<?>[] clsArr4 = new Class[2];
                                Object[] objArr38 = new Object[1];
                                a((byte) (-bArr9[50]), s, bArr9[64], objArr38);
                                clsArr4[c] = Class.forName((String) objArr38[c]);
                                clsArr4[1] = Integer.TYPE;
                                cleardataifneeded.RemoteActionCompatParcelizer = cls12.getMethod(str7, clsArr4).invoke(obj5, objArr35);
                                i3 = 3;
                                cleardataifneeded.RemoteActionCompatParcelizer(i3);
                                i6 = i7;
                                c = c;
                            } catch (Throwable th22) {
                                Throwable cause6 = th22.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th22;
                            }
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleardataifneeded.write = 134217728;
                            cleardataifneeded.RemoteActionCompatParcelizer(10);
                            i6 = i7;
                            c = c;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            Object obj7 = cleardataifneeded.serializer;
                            try {
                                byte[] bArr10 = IconCompatParcelizer;
                                Object[] objArr39 = new Object[1];
                                a(bArr10[37], (short) 257, (byte) (-bArr10[70]), objArr39);
                                Class<?> cls13 = Class.forName((String) objArr39[c]);
                                Object[] objArr40 = new Object[1];
                                a(bArr10[12], (short) 219, bArr10[22], objArr40);
                                cleardataifneeded.RemoteActionCompatParcelizer = cls13.getMethod((String) objArr40[c], null).invoke(obj7, null);
                                i4 = 3;
                                cleardataifneeded.RemoteActionCompatParcelizer(i4);
                                i6 = i7;
                                c = c;
                            } catch (Throwable th23) {
                                Throwable cause7 = th23.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th23;
                            }
                            break;
                        case -3:
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            Object obj8 = cleardataifneeded.serializer;
                            try {
                                byte[] bArr11 = IconCompatParcelizer;
                                Object[] objArr41 = new Object[1];
                                a(bArr11[37], (short) 257, (byte) (-bArr11[70]), objArr41);
                                Class<?> cls14 = Class.forName((String) objArr41[c]);
                                Object[] objArr42 = new Object[1];
                                a(bArr11[12], (short) 235, bArr11[90], objArr42);
                                cleardataifneeded.RemoteActionCompatParcelizer = cls14.getMethod((String) objArr42[c], null).invoke(obj8, null);
                                i4 = 3;
                                cleardataifneeded.RemoteActionCompatParcelizer(i4);
                                i6 = i7;
                                c = c;
                            } catch (Throwable th24) {
                                Throwable cause8 = th24.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th24;
                            }
                            break;
                        case -2:
                            cleardataifneeded.write = 1;
                            cleardataifneeded.RemoteActionCompatParcelizer(1);
                            cleardataifneeded.RemoteActionCompatParcelizer(2);
                            cleardataifneeded.RemoteActionCompatParcelizer = ((useSoftwareRendering) cleardataifneeded.serializer).serializer;
                            i4 = 3;
                            cleardataifneeded.RemoteActionCompatParcelizer(i4);
                            i6 = i7;
                            c = c;
                            break;
                        case -1:
                            i6 = 54;
                            break;
                        default:
                            i6 = i7;
                            c = c;
                            break;
                    }
                } catch (Throwable th25) {
                    th = th25;
                    if (i6 >= 75) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th26) {
            Throwable cause9 = th26.getCause();
            if (cause9 != null) {
                throw cause9;
            }
            throw th26;
        }
    }
}
