package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class canReadAppSetId {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int IconCompatParcelizer;
    private static int serializer;
    private static long write;
    private static final byte[] $$c = {118, -29, -86, -87};
    private static final int $$f = 73;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, int r9) {
        /*
            byte[] r0 = o.canReadAppSetId.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 4
            int r9 = r9 + 117
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L2a:
            r3 = r0[r9]
        L2c:
            int r8 = r8 + r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.canReadAppSetId.$$g(byte, byte, int):java.lang.String");
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public canReadAppSetId() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 130 - r7
            int r8 = 119 - r8
            byte[] r0 = o.canReadAppSetId.$$a
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.canReadAppSetId.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = o.canReadAppSetId.$$d
            int r6 = r6 + 36
            int r1 = r8 + 3
            byte[] r1 = new byte[r1]
            int r8 = r8 + 2
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2d
        L12:
            r3 = r2
        L13:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.canReadAppSetId.c(byte, int, byte, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        NestedScrollInteropConnectionKt nestedScrollInteropConnectionKt = new NestedScrollInteropConnectionKt();
        char[] cArr2 = NestedScrollInteropConnectionKt.read(write ^ (-9145095368803948559L), cArr, i);
        nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer = 4;
        while (nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer < cArr2.length) {
            int i3 = $11 + 47;
            $10 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            nestedScrollInteropConnectionKt.read = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer - 4;
            int i5 = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer;
            try {
                Object[] objArr2 = {Long.valueOf(cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer] ^ cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer % 4]), Long.valueOf(nestedScrollInteropConnectionKt.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(533537292);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (58680 - (Process.myPid() >> 22)), 1929 - android.graphics.Color.alpha(0), TextUtils.getTrimmedLength("") + 36, -820182035, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {nestedScrollInteropConnectionKt, nestedScrollInteropConnectionKt};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1638115501);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2194 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 28, -1317828276, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i6 = $11 + 31;
                    $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2, 4, cArr2.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x020c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0216  */
    public final void write() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1772778910);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int iNormalizeMetaState = android.view.KeyEvent.normalizeMetaState(0) + 516;
            int maximumFlingVelocity = 27 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b = $$a[138];
            byte b2 = (byte) (b | 127);
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 & 165), objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, iNormalizeMetaState, maximumFlingVelocity, -1183165313, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(-((byte) android.view.KeyEvent.getModifierMetaStateMask()), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(1 - TextUtils.getOffsetAfter("", 0), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-895189637);
        if (objRemoteActionCompatParcelizer2 == null) {
            char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
            int iNormalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0) + 516;
            int i2 = 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr5 = new Object[1];
            a($$a[5], (byte) ($$b & 486), (byte) 46, objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(touchSlop, iNormalizeMetaState2, i2, 443833498, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1807615028);
            if (objRemoteActionCompatParcelizer3 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 516;
                int iResolveSize = 27 - View.resolveSize(0, 0);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr[57] - 1), (byte) ($$b & 467), bArr[138], objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionChild, i3, iResolveSize, -1150409259, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 1856717548 + (((~((-768261627) | i6)) | (~(246570054 | i6))) * (-867)) + (((~((-768261627) | iIdentityHashCode)) | 558408120 | (~(246570054 | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | 804978174)) | (~(i6 | (-558408121))) | (~((-209853507) | iIdentityHashCode))) * 867) + 1684403288;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((android.view.ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = IconCompatParcelizer + 121;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 67 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
                int i12 = serializer + 93;
                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            Object[] objArr10 = new Object[1];
            b(1 - android.view.KeyEvent.getDeadChar(0, 0), new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(1 - TextUtils.getOffsetBefore("", 0), new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            b(Drawable.resolveOpacity(0, 0) + 1, new char[]{17921, 17974, 46110, 57673, 55435, 63712, 29394, 1864, 4837, 7713, 10198, 44279, 61342, 19194, 36009, 20929, 47178, 59287, 28766, 1730, 5472, 7337, 9474, 43578, 60948, 18806, 35427, 24390, 47768, 58883, 32735, 1093, 6142, 4905, 9359, 43498, 57540, 20466, 35298, 24296, 48404, 58579, 32102, 960, 5675, 4359, 8705, 46901, 58154, 20086, 38718, 23650, 49095, 64266, 31924, 347, 2295, 6103, 8594, 46823, 58879, 19681, 38634, 23475, 48729, 63886, 31332, 217}, objArr12);
            String[] strArr2 = {(String) objArr12[0]};
            int i14 = serializer + 15;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            try {
                Object[] objArr13 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1684403288};
                byte[] bArr2 = $$d;
                byte b3 = bArr2[22];
                short s = bArr2[5];
                Object[] objArr14 = new Object[1];
                c(b3, s, (byte) (s & 40), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                c(bArr2[381], (short) (-bArr2[2]), bArr2[378], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                int i16 = ((int[]) objArr16[3])[0];
                int i17 = ((int[]) objArr16[2])[0];
                if (applicationContext != null) {
                    int i18 = IconCompatParcelizer + 19;
                    serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1807615028);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                        int scrollDefaultDelay = (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 516;
                        int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 27;
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((byte) (bArr3[57] - 1), (byte) ($$b & 467), bArr3[138], objArr17);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(windowTouchSlop, scrollDefaultDelay, jumpTapTimeout, -1150409259, false, (String) objArr17[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        b(1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b(1 - TextUtils.indexOf("", ""), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-895189637);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int size = View.MeasureSpec.getSize(0) + 516;
                            int i20 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27;
                            Object[] objArr20 = new Object[1];
                            a($$a[5], (byte) ($$b & 486), (byte) 46, objArr20);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cCombineMeasuredStates, size, i20, 443833498, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1772778910);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int jumpTapTimeout2 = 516 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i21 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26;
                            byte b4 = $$a[138];
                            byte b5 = (byte) (b4 | 127);
                            Object[] objArr21 = new Object[1];
                            a(b4, b5, (byte) (b5 & 165), objArr21);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec, jumpTapTimeout2, i21, -1183165313, false, (String) objArr21[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i22 = ((int[]) objArr[3])[0];
        int i23 = ((int[]) objArr[2])[0];
        if (i23 == i22) {
            int i24 = IconCompatParcelizer + 59;
            serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i25 = i24 % 2;
            Object[] objArr22 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i26 = ((int[]) objArr[1])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i29 = ~iMaxMemory;
            int i30 = i26 + (-2096301377) + ((iMaxMemory | 268571778) * 988) + (((~(273315466 | i29)) | 243632417) * (-1976)) + (((~(iMaxMemory | (-248376106))) | 268571778 | (~(248376105 | i29))) * 988);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr22[1])[0] = i32 ^ (i32 << 5);
            Object[] objArr23 = {strArr3, new int[1], new int[]{i}, new int[]{i}};
            int i33 = ((int[]) objArr22[1])[0];
            int i34 = ((int[]) objArr22[2])[0];
            int i35 = ((int[]) objArr22[3])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i36 = ~iIdentityHashCode2;
            int i37 = 1629696091 + (((~((-555876869) | i36)) | (~((-47822044) | iIdentityHashCode2))) * 520);
            int i38 = ~(47822043 | i36);
            int i39 = ~(iIdentityHashCode2 | 569513615);
            int i40 = i33 + i37 + ((i38 | i39) * (-1040)) + ((i39 | (~(i36 | (-569513616))) | (-603698912)) * 520);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr23[1])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i43 = serializer + 67;
            IconCompatParcelizer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i44 = i43 % 2 == 0 ? 1 : 0;
            while (i44 < strArr4.length) {
                int i45 = serializer + 49;
                IconCompatParcelizer = i45 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i45 % 2 == 0) {
                    arrayList.add(strArr4[i44]);
                    i44 += 23;
                } else {
                    arrayList.add(strArr4[i44]);
                    i44++;
                }
            }
        }
        try {
            Object[] objArr24 = {Long.valueOf((((long) (-22927059)) << 32) ^ (((long) (i22 ^ i23)) & 4294967295L)), Long.valueOf(-22926995)};
            byte[] bArr4 = $$d;
            Object[] objArr25 = new Object[1];
            c((byte) 75, bArr4[1], bArr4[221], objArr25);
            Class<?> cls6 = Class.forName((String) objArr25[0]);
            byte b6 = bArr4[29];
            byte b7 = b6;
            Object[] objArr26 = new Object[1];
            c(b7, (short) (b7 | 94), b6, objArr26);
            cls6.getMethod((String) objArr26[0], Long.TYPE, Long.TYPE).invoke(null, objArr24);
            Object[] objArr27 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i46 = ((int[]) objArr[1])[0];
            int i47 = ((int[]) objArr[2])[0];
            int i48 = ((int[]) objArr[3])[0];
            String[] strArr5 = (String[]) objArr[0];
            int iMyPid = Process.myPid();
            int i49 = i46 + 135011479 + ((~((~iMyPid) | 502267311)) * (-116)) + ((86768655 | iMyPid) * 116) + (((~(iMyPid | (-434922917))) | 19424260) * 116);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr27[1])[0] = i51 ^ (i51 << 5);
            int[] iArr = new int[i23];
            int i52 = i23 - 1;
            iArr[i52] = 1;
            Toast.makeText((Context) null, iArr[((i23 * i52) % 2) - 1], 1).show();
            Object[] objArr28 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i53 = ((int[]) objArr27[1])[0];
            int i54 = ((int[]) objArr27[2])[0];
            int i55 = ((int[]) objArr27[3])[0];
            String[] strArr6 = (String[]) objArr27[0];
            int iMyPid2 = Process.myPid();
            int i56 = i53 + (-1069780613) + (((~(7582202 | iMyPid2)) | (-519553020) | (~(514109369 | iMyPid2))) * (-744)) + (((~iMyPid2) | 2138552) * 744) + ((iMyPid2 | 519553019) * 744);
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr28[1])[0] = i58 ^ (i58 << 5);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0bea  */
    public final void RemoteActionCompatParcelizer() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Long lValueOf;
        Object objRemoteActionCompatParcelizer;
        char offsetAfter;
        int iKeyCodeFromString;
        int iBlue;
        int i;
        boolean z;
        Object obj;
        Object[] objArr4;
        int i2 = 2 % 2;
        Object[] objArr5 = new Object[1];
        b(-MotionEvent.axisFromString(""), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr5);
        String str = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        b(android.graphics.Color.green(0) + 1, new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr6);
        String str2 = (String) objArr6[0];
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 784;
            int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 74;
            byte[] bArr = $$a;
            Object[] objArr7 = new Object[1];
            a(bArr[57], (byte) ($$b & 463), bArr[7], objArr7);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, i3, i4, -940932292, false, (String) objArr7[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer2).getLong(null);
        long jLongValue = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
        if (objRemoteActionCompatParcelizer3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 785;
            int maximumFlingVelocity = 74 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b = $$a[138];
            byte b2 = (byte) (b | 127);
            Object[] objArr8 = new Object[1];
            a(b, b2, (byte) (b2 & 165), objArr8);
            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(bitsPerPixel, iLastIndexOf, maximumFlingVelocity, 150322061, false, (String) objArr8[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer3).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
            if (objRemoteActionCompatParcelizer4 == null) {
                char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iRed = android.graphics.Color.red(0) + 784;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 74;
                Object[] objArr9 = new Object[1];
                a($$a[5], (byte) ($$b & 486), (byte) 46, objArr9);
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(doubleTapTimeout, iRed, packedPositionGroup, -2100268632, false, (String) objArr9[0], null);
            }
            Object[] objArr10 = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr10[2])[0];
            int i6 = ((int[]) objArr10[0])[0];
            String[] strArr = (String[]) objArr10[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((1048760832 + (((-633602) | iIdentityHashCode) * (-381))) + (((~((~iIdentityHashCode) | 1072043198)) | (-495696770)) * 381)) - 1761827876;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr11 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0) + 1, new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr11);
            Class<?> cls = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr12);
            Context applicationContext = (Context) cls.getMethod((String) objArr12[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr13 = new Object[1];
            b(android.graphics.Color.red(0) + 1, new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr13);
            Class<?> cls2 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            b(-Process.getGidForName(""), new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr14);
            try {
                Object[] objArr15 = {applicationContext, Integer.valueOf(((Integer) cls2.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue()), 0, -2003229857};
                byte[] bArr2 = $$d;
                Object[] objArr16 = new Object[1];
                c(bArr2[22], (short) ($$e << 1), bArr2[381], objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                c((byte) (-bArr2[307]), (short) 144, (byte) (-bArr2[11]), objArr17);
                objArr = (Object[]) cls3.getMethod((String) objArr17[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                if (applicationContext != null) {
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1375752265);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char longPressTimeout = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 783;
                        int iAxisFromString = MotionEvent.axisFromString("") + 75;
                        Object[] objArr18 = new Object[1];
                        a($$a[5], (byte) ($$b & 486), (byte) 46, objArr18);
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(longPressTimeout, i10, iAxisFromString, -2100268632, false, (String) objArr18[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf2 = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-668624276);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int i11 = 785 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int keyRepeatDelay = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 74;
                            byte b3 = $$a[138];
                            byte b4 = (byte) (b3 | 127);
                            Object[] objArr19 = new Object[1];
                            a(b3, b4, (byte) (b4 & 165), objArr19);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(touchSlop, i11, keyRepeatDelay, 150322061, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                        Long lValueOf3 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(389718749);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char touchSlop2 = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int keyRepeatTimeout = 784 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iAxisFromString2 = MotionEvent.axisFromString("") + 75;
                            byte[] bArr3 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr3[57], (byte) ($$b & 463), bArr3[7], objArr20);
                            objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(touchSlop2, keyRepeatTimeout, iAxisFromString2, -940932292, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf3);
                    } catch (Exception unused) {
                        throw new RuntimeException();
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i17 = ~iElapsedRealtime;
            int i18 = i14 + (-998643010) + (((~((-1210685477) | i17)) | 1073844260) * 98) + (((~(i17 | (-438971354))) | (-1210685477) | (~(438971353 | iElapsedRealtime))) * (-49)) + (((~(iElapsedRealtime | (-1210685477))) | (-1512815614)) * 49);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[3])[0] = i20 ^ (i20 << 5);
            Object[] objArr22 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i21 = ((int[]) objArr21[3])[0];
            int i22 = ((int[]) objArr21[2])[0];
            int i23 = ((int[]) objArr21[0])[0];
            String[] strArr3 = (String[]) objArr21[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i21 + 487670698 + ((1572058103 | i24) * (-369)) + (((~((-211882088) | i24)) | 1437774742) * (-369)) + (((~(iIdentityHashCode2 | 211882087)) | 1360176016 | (~(i24 | (-134283362)))) * 369);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[3])[0] = i27 ^ (i27 << 5);
        } else {
            try {
                Object[] objArr23 = {Long.valueOf((((long) (-1236076418)) << 32) ^ (((long) (i12 ^ i13)) & 4294967295L)), Long.valueOf(-1236076422)};
                byte[] bArr4 = $$d;
                Object[] objArr24 = new Object[1];
                c((byte) 75, (short) 163, bArr4[545], objArr24);
                Class<?> cls4 = Class.forName((String) objArr24[0]);
                byte b5 = bArr4[29];
                byte b6 = b5;
                Object[] objArr25 = new Object[1];
                c(b6, (short) (b6 | 94), b5, objArr25);
                cls4.getMethod((String) objArr25[0], Long.TYPE, Long.TYPE).invoke(null, objArr23);
                Object[] objArr26 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i28 = ((int[]) objArr[3])[0];
                int i29 = ((int[]) objArr[2])[0];
                int i30 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[1];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i31 = i28 + (-614783499) + (((~((-1142664741) | startElapsedRealtime)) | 68682752) * 336) + (((~(startElapsedRealtime | 506992089)) | (-1580974078)) * (-168)) + (((~((~startElapsedRealtime) | 506992089)) | (-1142664741)) * DateTimeConstants.HOURS_PER_WEEK);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr26[3])[0] = i33 ^ (i33 << 5);
                int[] iArr = new int[i13];
                int i34 = i13 - 1;
                iArr[i34] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i34) % 2) - 1], 1).show();
                Object[] objArr27 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i35 = ((int[]) objArr26[3])[0];
                int i36 = ((int[]) objArr26[2])[0];
                int i37 = ((int[]) objArr26[0])[0];
                String[] strArr5 = (String[]) objArr26[1];
                int i38 = (~System.identityHashCode(this)) | 902854584;
                int i39 = i35 + (-833598996) + (i38 * 495) + (((~i38) | 612385792) * 495);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr27[3])[0] = i41 ^ (i41 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1888477567);
        if (objRemoteActionCompatParcelizer8 == null) {
            char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i42 = 784 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int touchSlop3 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 74;
            byte[] bArr5 = $$a;
            byte b7 = (byte) (bArr5[119] - 1);
            Object[] objArr28 = new Object[1];
            a(bArr5[13], (byte) 74, b7, objArr28);
            objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maximumFlingVelocity2, i42, touchSlop3, 1604337504, false, (String) objArr28[0], null);
        }
        long j2 = ((Field) objRemoteActionCompatParcelizer8).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-884503364);
        if (objRemoteActionCompatParcelizer9 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "") + 784;
            int i43 = 75 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            byte[] bArr6 = $$a;
            Object[] objArr29 = new Object[1];
            a((byte) (-bArr6[51]), (byte) ($$b & 183), (byte) (bArr6[119] - 1), objArr29);
            objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMyPid, iIndexOf, i43, 462925149, false, (String) objArr29[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objRemoteActionCompatParcelizer9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(8913560);
            if (objRemoteActionCompatParcelizer10 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int i44 = 784 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iResolveSize = 74 - View.resolveSize(0, 0);
                byte[] bArr7 = $$a;
                Object[] objArr30 = new Object[1];
                a((byte) (-bArr7[3]), (byte) (-bArr7[148]), (byte) (bArr7[119] - 1), objArr30);
                objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, i44, iResolveSize, -799530119, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objRemoteActionCompatParcelizer10).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i45 = ((int[]) objArr31[2])[0];
            int i46 = ((int[]) objArr31[0])[0];
            String[] strArr6 = (String[]) objArr31[1];
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i47 = ~startElapsedRealtime2;
            int i48 = (-1636126411) + (((~((-576966659) | i47)) | (~(862966770 | startElapsedRealtime2))) * 520);
            int i49 = ~((-862966771) | i47);
            int i50 = ~(startElapsedRealtime2 | 786690059);
            int i51 = ((i48 + ((i49 | i50) * (-1040))) + ((i50 | ((~(i47 | (-786690060))) | 286000112)) * 520)) - 1792942828;
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr2[3])[0] = i53 ^ (i53 << 5);
        } else {
            Object[] objArr32 = new Object[1];
            b(1 - android.graphics.Color.alpha(0), new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr32);
            Class<?> cls5 = Class.forName((String) objArr32[0]);
            Object[] objArr33 = new Object[1];
            b(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr33);
            Object[] objArr34 = {Integer.valueOf(((Integer) cls5.getMethod((String) objArr33[0], Object.class).invoke(null, this)).intValue()), -1792942828};
            byte[] bArr8 = $$d;
            Object[] objArr35 = new Object[1];
            c((byte) 75, (short) 195, bArr8[545], objArr35);
            Class<?> cls6 = Class.forName((String) objArr35[0]);
            Object[] objArr36 = new Object[1];
            c((byte) 79, (short) 227, bArr8[28], objArr36);
            objArr2 = (Object[]) cls6.getMethod((String) objArr36[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr34);
            Object objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(8913560);
            if (objRemoteActionCompatParcelizer11 == null) {
                char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 784;
                int maxKeyCode = (android.view.KeyEvent.getMaxKeyCode() >> 16) + 74;
                byte[] bArr9 = $$a;
                Object[] objArr37 = new Object[1];
                a((byte) (-bArr9[3]), (byte) (-bArr9[148]), (byte) (bArr9[119] - 1), objArr37);
                objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(doubleTapTimeout2, mode, maxKeyCode, -799530119, false, (String) objArr37[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer11).set(null, objArr2);
            try {
                long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf4 = Long.valueOf(jLongValue4);
                Object objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-884503364);
                if (objRemoteActionCompatParcelizer12 == null) {
                    char cRed = (char) android.graphics.Color.red(0);
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 784;
                    int i54 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74;
                    byte[] bArr10 = $$a;
                    Object[] objArr38 = new Object[1];
                    a((byte) (-bArr10[51]), (byte) ($$b & 183), (byte) (bArr10[119] - 1), objArr38);
                    objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, packedPositionGroup2, i54, 462925149, false, (String) objArr38[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf4);
                Long lValueOf5 = Long.valueOf(jLongValue4 >> 12);
                Object objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1888477567);
                if (objRemoteActionCompatParcelizer13 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int bitsPerPixel2 = 783 - ImageFormat.getBitsPerPixel(0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 75;
                    byte[] bArr11 = $$a;
                    Object[] objArr39 = new Object[1];
                    a(bArr11[13], (byte) 74, (byte) (bArr11[119] - 1), objArr39);
                    objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(absoluteGravity, bitsPerPixel2, packedPositionChild, 1604337504, false, (String) objArr39[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer13).set(null, lValueOf5);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i55 = ((int[]) objArr2[0])[0];
        int i56 = ((int[]) objArr2[2])[0];
        if (i56 != i55) {
            ArrayList arrayList = new ArrayList();
            String[] strArr7 = (String[]) objArr2[1];
            if (strArr7 != null) {
                for (String str3 : strArr7) {
                    int i57 = serializer + 91;
                    IconCompatParcelizer = i57 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i58 = i57 % 2;
                    arrayList.add(str3);
                }
            }
            Object[] objArr40 = {Long.valueOf((((long) (i55 ^ i56)) & 4294967295L) ^ (((long) 1503247519) << 32)), Long.valueOf(1503247503)};
            byte[] bArr12 = $$d;
            Object[] objArr41 = new Object[1];
            c((byte) 75, (short) 236, bArr12[49], objArr41);
            Class<?> cls7 = Class.forName((String) objArr41[0]);
            byte b8 = bArr12[29];
            byte b9 = b8;
            Object[] objArr42 = new Object[1];
            c(b9, (short) (b9 | 94), b8, objArr42);
            cls7.getMethod((String) objArr42[0], Long.TYPE, Long.TYPE).invoke(null, objArr40);
            Object[] objArr43 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i59 = ((int[]) objArr2[3])[0];
            int i60 = ((int[]) objArr2[2])[0];
            int i61 = ((int[]) objArr2[0])[0];
            String[] strArr8 = (String[]) objArr2[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i62 = ~iIdentityHashCode3;
            int i63 = (~((-1572735034) | i62)) | 76810240;
            int i64 = ~(iIdentityHashCode3 | 1572846589);
            int i65 = i59 + (((i63 | i64) * (-252)) - 468999171) + ((i64 | (~(i62 | (-1495924794)))) * 252);
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr43[3])[0] = i67 ^ (i67 << 5);
            throw new RuntimeException(String.valueOf(i56));
        }
        Object[] objArr44 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
        int i68 = ((int[]) objArr2[3])[0];
        int i69 = ((int[]) objArr2[2])[0];
        int i70 = ((int[]) objArr2[0])[0];
        String[] strArr9 = (String[]) objArr2[1];
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i71 = ~iIdentityHashCode4;
        int i72 = i68 + (-1613205053) + (((~((-72614913) | i71)) | (~((-11209030) | iIdentityHashCode4)) | (~((-1493217977) | iIdentityHashCode4))) * 765) + (((~((-83823942) | i71)) | 72614912) * 1530) + (((~(iIdentityHashCode4 | (-83823942))) | (~(i71 | (-1493217977)))) * 765);
        int i73 = (i72 << 13) ^ i72;
        int i74 = i73 ^ (i73 >>> 17);
        ((int[]) objArr44[3])[0] = i74 ^ (i74 << 5);
        Object[] objArr45 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
        int i75 = ((int[]) objArr44[3])[0];
        int i76 = ((int[]) objArr44[2])[0];
        int i77 = ((int[]) objArr44[0])[0];
        String[] strArr10 = (String[]) objArr44[1];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i78 = (-1043624733) + (((~((-64247254) | iUptimeMillis)) | (-1585409577)) * (-318));
        int i79 = ~((-1585409577) | iUptimeMillis);
        int i80 = ~iUptimeMillis;
        int i81 = i75 + i78 + ((i79 | (~(1610579965 | i80))) * 318) + (((~(iUptimeMillis | 1610579965)) | (~((-1546332713) | i80))) * 318);
        int i82 = (i81 << 13) ^ i81;
        int i83 = i82 ^ (i82 >>> 17);
        ((int[]) objArr45[3])[0] = i83 ^ (i83 << 5);
        Object objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109610714);
        if (objRemoteActionCompatParcelizer14 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 784;
            int i84 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 73;
            byte[] bArr13 = $$a;
            Object[] objArr46 = new Object[1];
            a((byte) (bArr13[57] - 1), (byte) ($$b & 467), bArr13[138], objArr46);
            objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf2, tapTimeout, i84, 1829539527, false, (String) objArr46[0], null);
        }
        long j3 = ((Field) objRemoteActionCompatParcelizer14).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1363128103);
        if (objRemoteActionCompatParcelizer15 == null) {
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int windowTouchSlop = 784 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0) + 74;
            byte[] bArr14 = $$a;
            Object[] objArr47 = new Object[1];
            a(bArr14[136], (byte) (-bArr14[51]), bArr14[68], objArr47);
            objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, windowTouchSlop, deadChar, 2115006776, false, (String) objArr47[0], null);
        }
        if (j3 == ((jLongValue5 - ((((Field) objRemoteActionCompatParcelizer15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1569297559);
            if (objRemoteActionCompatParcelizer16 == null) {
                char maximumFlingVelocity3 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int size = 784 - View.MeasureSpec.getSize(0);
                int i85 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73;
                byte[] bArr15 = $$a;
                byte b10 = (byte) (-bArr15[3]);
                byte b11 = bArr15[138];
                Object[] objArr48 = new Object[1];
                a(b10, b11, (byte) (b11 | 42), objArr48);
                objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maximumFlingVelocity3, size, i85, -1923500682, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
            objArr3 = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i86 = ((int[]) objArr49[2])[0];
            int i87 = ((int[]) objArr49[0])[0];
            String[] strArr11 = (String[]) objArr49[1];
            int iMyTid = Process.myTid();
            int i88 = ~iMyTid;
            int i89 = (~((-913920344) | i88)) | 576212998;
            int i90 = ~(iMyTid | 1073443831);
            int i91 = ((i89 | i90) * (-252)) + 826444261 + ((i90 | (~(i88 | (-337707346)))) * 252) + 763299634;
            int i92 = (i91 << 13) ^ i91;
            int i93 = i92 ^ (i92 >>> 17);
            ((int[]) objArr3[3])[0] = i93 ^ (i93 << 5);
            int i94 = serializer + 31;
            IconCompatParcelizer = i94 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i95 = i94 % 2;
        } else {
            Object[] objArr50 = new Object[1];
            b(1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr50);
            Class<?> cls8 = Class.forName((String) objArr50[0]);
            Object[] objArr51 = new Object[1];
            b(android.graphics.Color.red(0) + 1, new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr51);
            Context applicationContext2 = (Context) cls8.getMethod((String) objArr51[0], new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                if (applicationContext2 instanceof ContextWrapper) {
                    int i96 = IconCompatParcelizer + 123;
                    serializer = i96 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i96 % 2 != 0) {
                        int i97 = 87 / 0;
                        if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                            applicationContext2 = applicationContext2.getApplicationContext();
                        } else {
                            applicationContext2 = null;
                        }
                    } else if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                        applicationContext2 = applicationContext2.getApplicationContext();
                    } else {
                        applicationContext2 = null;
                    }
                } else {
                    applicationContext2 = applicationContext2.getApplicationContext();
                }
            }
            Object[] objArr52 = new Object[1];
            b(View.getDefaultSize(0, 0) + 1, new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr52);
            Class<?> cls9 = Class.forName((String) objArr52[0]);
            Object[] objArr53 = new Object[1];
            b(1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr53);
            Object[] objArr54 = {applicationContext2, Integer.valueOf(((Integer) cls9.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 763299634};
            short s = (short) ($$e | 196);
            byte[] bArr16 = $$d;
            Object[] objArr55 = new Object[1];
            c((byte) 75, s, (byte) (-bArr16[11]), objArr55);
            Class<?> cls10 = Class.forName((String) objArr55[0]);
            Object[] objArr56 = new Object[1];
            c((byte) (bArr16[594] + 1), (short) 263, bArr16[20], objArr56);
            objArr3 = (Object[]) cls10.getMethod((String) objArr56[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr54);
            if (applicationContext2 != null) {
                int i98 = IconCompatParcelizer + 91;
                serializer = i98 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                try {
                    if (i98 % 2 != 0) {
                        Object objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1569297559);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char doubleTapTimeout3 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iArgb = android.graphics.Color.argb(0, 0, 0, 0) + 784;
                            int edgeSlop = 74 - (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr17 = $$a;
                            byte b12 = (byte) (-bArr17[3]);
                            byte b13 = bArr17[138];
                            Object[] objArr57 = new Object[1];
                            a(b12, b13, (byte) (b13 | 42), objArr57);
                            objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(doubleTapTimeout3, iArgb, edgeSlop, -1923500682, false, (String) objArr57[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr3);
                        long jLongValue6 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[0])).longValue();
                        Long lValueOf6 = Long.valueOf(jLongValue6);
                        Object objRemoteActionCompatParcelizer18 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1363128103);
                        if (objRemoteActionCompatParcelizer18 == null) {
                            char minimumFlingVelocity = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 785;
                            int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 75;
                            byte[] bArr18 = $$a;
                            Object[] objArr58 = new Object[1];
                            a(bArr18[136], (byte) (-bArr18[51]), bArr18[68], objArr58);
                            objRemoteActionCompatParcelizer18 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(minimumFlingVelocity, iIndexOf2, bitsPerPixel3, 2115006776, false, (String) objArr58[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf6);
                        lValueOf = Long.valueOf(jLongValue6 >> 107);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109610714);
                        if (objRemoteActionCompatParcelizer == null) {
                            offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            iKeyCodeFromString = Drawable.resolveOpacity(0, 0) + 784;
                            iBlue = 74 + TextUtils.indexOf("", "");
                            i = 1829539527;
                            z = false;
                            byte[] bArr19 = $$a;
                            Object[] objArr59 = new Object[1];
                            a((byte) (bArr19[57] - 1), (byte) ($$b & 467), bArr19[138], objArr59);
                            obj = objArr59[0];
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, iKeyCodeFromString, iBlue, i, z, (String) obj, null);
                        }
                    } else {
                        Object objRemoteActionCompatParcelizer19 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1569297559);
                        if (objRemoteActionCompatParcelizer19 == null) {
                            char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iLastIndexOf2 = 783 - TextUtils.lastIndexOf("", '0');
                            int maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 74;
                            byte[] bArr20 = $$a;
                            byte b14 = (byte) (-bArr20[3]);
                            byte b15 = bArr20[138];
                            Object[] objArr60 = new Object[1];
                            a(b14, b15, (byte) (b15 | 42), objArr60);
                            objRemoteActionCompatParcelizer19 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, iLastIndexOf2, maximumDrawingCacheSize, -1923500682, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer19).set(null, objArr3);
                        long jLongValue7 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue7);
                        Object objRemoteActionCompatParcelizer20 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1363128103);
                        if (objRemoteActionCompatParcelizer20 == null) {
                            char jumpTapTimeout = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            int mirror = AndroidCharacter.getMirror('0') + 736;
                            int jumpTapTimeout2 = 74 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte[] bArr21 = $$a;
                            Object[] objArr61 = new Object[1];
                            a(bArr21[136], (byte) (-bArr21[51]), bArr21[68], objArr61);
                            objRemoteActionCompatParcelizer20 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(jumpTapTimeout, mirror, jumpTapTimeout2, 2115006776, false, (String) objArr61[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf7);
                        lValueOf = Long.valueOf(jLongValue7 >> 12);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109610714);
                        if (objRemoteActionCompatParcelizer == null) {
                            offsetAfter = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            iKeyCodeFromString = android.view.KeyEvent.keyCodeFromString("") + 784;
                            iBlue = 74 - android.graphics.Color.blue(0);
                            i = 1829539527;
                            z = false;
                            byte[] bArr22 = $$a;
                            Object[] objArr62 = new Object[1];
                            a((byte) (bArr22[57] - 1), (byte) ($$b & 467), bArr22[138], objArr62);
                            obj = objArr62[0];
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, iKeyCodeFromString, iBlue, i, z, (String) obj, null);
                        }
                    }
                    ((Field) objRemoteActionCompatParcelizer).set(null, lValueOf);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        }
        int i99 = ((int[]) objArr3[0])[0];
        int i100 = ((int[]) objArr3[2])[0];
        if (i100 == i99) {
            Object[] objArr63 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i101 = ((int[]) objArr3[3])[0];
            int i102 = ((int[]) objArr3[2])[0];
            int i103 = ((int[]) objArr3[0])[0];
            String[] strArr12 = (String[]) objArr3[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i104 = ~iIdentityHashCode5;
            int i105 = i101 + (-1425197194) + (((~((-1398030981) | i104)) | 251625849) * (-90)) + (((~((-1398030981) | iIdentityHashCode5)) | (-1610597374)) * (-45)) + (((~(iIdentityHashCode5 | (-251625850))) | (-1398030981) | (~(i104 | 251625849))) * 45);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr63[3])[0] = i107 ^ (i107 << 5);
            Object[] objArr64 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i108 = ((int[]) objArr63[3])[0];
            int i109 = ((int[]) objArr63[2])[0];
            int i110 = ((int[]) objArr63[0])[0];
            String[] strArr13 = (String[]) objArr63[1];
            int iMyPid = Process.myPid();
            int i111 = ~iMyPid;
            int i112 = 472916597 + (((~((-9700359) | i111)) | (~(1100391942 | iMyPid))) * 520);
            int i113 = ~((-1100391943) | i111);
            int i114 = ~(iMyPid | 549264887);
            int i115 = i108 + i112 + ((i113 | i114) * (-1040)) + ((i114 | (~(i111 | (-549264888))) | 1090691584) * 520);
            int i116 = (i115 << 13) ^ i115;
            int i117 = i116 ^ (i116 >>> 17);
            ((int[]) objArr64[3])[0] = i117 ^ (i117 << 5);
        } else {
            long j4 = (((long) (-1798499866)) << 32) ^ (((long) (i99 ^ i100)) & 4294967295L);
            long j5 = -1798499354;
            int i118 = serializer + 15;
            IconCompatParcelizer = i118 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i119 = i118 % 2;
            Object[] objArr65 = {Long.valueOf(j4), Long.valueOf(j5)};
            byte[] bArr23 = $$d;
            Object[] objArr66 = new Object[1];
            c((byte) 75, (short) 236, bArr23[49], objArr66);
            Class<?> cls11 = Class.forName((String) objArr66[0]);
            byte b16 = bArr23[29];
            byte b17 = b16;
            Object[] objArr67 = new Object[1];
            c(b17, (short) (b17 | 94), b16, objArr67);
            cls11.getMethod((String) objArr67[0], Long.TYPE, Long.TYPE).invoke(null, objArr65);
            Object[] objArr68 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i120 = ((int[]) objArr3[3])[0];
            int i121 = ((int[]) objArr3[2])[0];
            int i122 = ((int[]) objArr3[0])[0];
            String[] strArr14 = (String[]) objArr3[1];
            int iNextInt = new Random().nextInt(60465327);
            int i123 = ~((-715448572) | iNextInt);
            int i124 = ~iNextInt;
            int i125 = i123 | (~(934208258 | i124));
            int i126 = ~(715448571 | i124);
            int i127 = i120 + 438808033 + ((i125 | i126) * (-516)) + (((~(iNextInt | (-581230595))) | (~((-352977665) | i124))) * 516) + ((352977664 | i126) * 516);
            int i128 = (i127 << 13) ^ i127;
            int i129 = i128 ^ (i128 >>> 17);
            ((int[]) objArr68[3])[0] = i129 ^ (i129 << 5);
            int[] iArr2 = new int[i100];
            int i130 = i100 - 1;
            iArr2[i130] = 1;
            Toast.makeText((Context) null, iArr2[((i100 * i130) % 2) - 1], 1).show();
            Object[] objArr69 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i131 = ((int[]) objArr68[3])[0];
            int i132 = ((int[]) objArr68[2])[0];
            int i133 = ((int[]) objArr68[0])[0];
            String[] strArr15 = (String[]) objArr68[1];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i134 = i131 + (((~((-437094410) | iIdentityHashCode6)) | 302612489) * (-566)) + 1129633763 + ((~(iIdentityHashCode6 | (-134481921))) * 566);
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr69[3])[0] = i136 ^ (i136 << 5);
        }
        Object objRemoteActionCompatParcelizer21 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1617220711);
        if (objRemoteActionCompatParcelizer21 == null) {
            char pressedStateDuration = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 52945);
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 651;
            int iRed2 = android.graphics.Color.red(0) + 28;
            byte b18 = $$a[138];
            byte b19 = (byte) (b18 | 127);
            Object[] objArr70 = new Object[1];
            a(b18, b19, (byte) (b19 & 165), objArr70);
            objRemoteActionCompatParcelizer21 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(pressedStateDuration, iLastIndexOf3, iRed2, 1330317944, false, (String) objArr70[0], null);
        }
        long j6 = ((Field) objRemoteActionCompatParcelizer21).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer22 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-808801526);
        if (objRemoteActionCompatParcelizer22 == null) {
            char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 52944);
            int iRgb = (-16776566) - android.graphics.Color.rgb(0, 0, 0);
            int iIndexOf3 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr24 = $$a;
            Object[] objArr71 = new Object[1];
            a(bArr24[57], (byte) ($$b & 463), bArr24[7], objArr71);
            objRemoteActionCompatParcelizer22 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c3, iRgb, iIndexOf3, 521833195, false, (String) objArr71[0], null);
        }
        if (j6 == ((jLongValue8 - ((((Field) objRemoteActionCompatParcelizer22).getLong(null) << 52) >>> 52)) >> 12)) {
            int i137 = IconCompatParcelizer + 5;
            serializer = i137 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i138 = i137 % 2;
            Object objRemoteActionCompatParcelizer23 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1734106742);
            if (objRemoteActionCompatParcelizer23 == null) {
                char maximumFlingVelocity4 = (char) (52945 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 650;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                Object[] objArr72 = new Object[1];
                a($$a[5], (byte) ($$b & 486), (byte) 46, objArr72);
                objRemoteActionCompatParcelizer23 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maximumFlingVelocity4, offsetAfter2, offsetBefore, -1215529065, false, (String) objArr72[0], null);
            }
            Object[] objArr73 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
            objArr4 = new Object[]{new String[0], new int[]{i}, new int[1], new int[]{i}};
            int i139 = ((int[]) objArr73[1])[0];
            int i140 = ((int[]) objArr73[3])[0];
            int iMyUid = Process.myUid();
            int i141 = ~iMyUid;
            int i142 = ~((-1020187091) | i141);
            int i143 = ~(993060545 | iMyUid);
            int i144 = 1609232928 + ((i142 | i143) * 1150) + (((~((-993060546) | i141)) | i143) * (-575)) + (((~(iMyUid | (-1020187091))) | (~(i141 | 1020187090))) * 575) + 1182139821;
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            ((int[]) objArr4[2])[0] = i146 ^ (i146 << 5);
        } else {
            try {
                Object objRemoteActionCompatParcelizer24 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1235385072);
                if (objRemoteActionCompatParcelizer24 == null) {
                    objRemoteActionCompatParcelizer24 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Process.getGidForName("") + 1455, 27 - TextUtils.getCapsMode("", 0, 0), 1720558833, false, null, new Class[0]);
                }
                Object[] objArr74 = {null, ((Constructor) objRemoteActionCompatParcelizer24).newInstance(null), 1182139821, 0};
                Object objRemoteActionCompatParcelizer25 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1036533368);
                if (objRemoteActionCompatParcelizer25 == null) {
                    char offsetBefore2 = (char) (52945 - TextUtils.getOffsetBefore("", 0));
                    int i147 = 649 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int defaultSize = 28 - View.getDefaultSize(0, 0);
                    byte[] bArr25 = $$a;
                    Object[] objArr75 = new Object[1];
                    a(bArr25[136], (byte) (-bArr25[51]), bArr25[68], objArr75);
                    objRemoteActionCompatParcelizer25 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetBefore2, i147, defaultSize, -317186151, false, (String) objArr75[0], new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 677 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 50), (Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (1606 - View.resolveSizeAndState(0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 727, 57 - View.getDefaultSize(0, 0)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr76 = (Object[]) ((Method) objRemoteActionCompatParcelizer25).invoke(null, objArr74);
                Object objRemoteActionCompatParcelizer26 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1734106742);
                if (objRemoteActionCompatParcelizer26 == null) {
                    char packedPositionChild2 = (char) (52944 - ExpandableListView.getPackedPositionChild(0L));
                    int mirror2 = 698 - AndroidCharacter.getMirror('0');
                    int i148 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr77 = new Object[1];
                    a($$a[5], (byte) ($$b & 486), (byte) 46, objArr77);
                    objRemoteActionCompatParcelizer26 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionChild2, mirror2, i148, -1215529065, false, (String) objArr77[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer26).set(null, objArr76);
                try {
                    long jLongValue9 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf8 = Long.valueOf(jLongValue9);
                    Object objRemoteActionCompatParcelizer27 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-808801526);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 52946);
                        int i149 = 651 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iGreen = 28 - android.graphics.Color.green(0);
                        byte[] bArr26 = $$a;
                        Object[] objArr78 = new Object[1];
                        a(bArr26[57], (byte) ($$b & 463), bArr26[7], objArr78);
                        objRemoteActionCompatParcelizer27 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, i149, iGreen, 521833195, false, (String) objArr78[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf8);
                    Long lValueOf9 = Long.valueOf(jLongValue9 >> 12);
                    Object objRemoteActionCompatParcelizer28 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1617220711);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 52946);
                        int i150 = 651 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iRed3 = android.graphics.Color.red(0) + 28;
                        byte b20 = $$a[138];
                        byte b21 = (byte) (b20 | 127);
                        Object[] objArr79 = new Object[1];
                        a(b20, b21, (byte) (b21 & 165), objArr79);
                        objRemoteActionCompatParcelizer28 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAxisFromString, i150, iRed3, 1330317944, false, (String) objArr79[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf9);
                    objArr4 = objArr76;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        int i151 = ((int[]) objArr4[3])[0];
        int i152 = ((int[]) objArr4[1])[0];
        if (i152 == i151) {
            int i153 = IconCompatParcelizer + 61;
            serializer = i153 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i154 = i153 % 2;
            Object[] objArr80 = {new String[0], new int[]{i}, new int[1], new int[]{i}};
            int i155 = ((int[]) objArr4[2])[0];
            int i156 = ((int[]) objArr4[1])[0];
            int i157 = ((int[]) objArr4[3])[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i158 = i155 + (((1916598256 + (((~iIdentityHashCode7) | 44178743) * 1444)) + (((~(iIdentityHashCode7 | (-949115676))) | ((~(976242220 | iIdentityHashCode7)) | 8526099)) * (-1444))) - 1832282096);
            int i159 = (i158 << 13) ^ i158;
            int i160 = i159 ^ (i159 >>> 17);
            ((int[]) objArr80[2])[0] = i160 ^ (i160 << 5);
            Object[] objArr81 = {new String[0], new int[]{i}, new int[1], new int[]{i}};
            int i161 = ((int[]) objArr80[2])[0];
            int i162 = ((int[]) objArr80[1])[0];
            int i163 = ((int[]) objArr80[3])[0];
            int i164 = (int) Runtime.getRuntime().totalMemory();
            int i165 = ~i164;
            int i166 = (~((-991630087) | i165)) | 957940484;
            int i167 = ~(i164 | 998193143);
            int i168 = i161 + (-1113967892) + ((i166 | i167) * (-713)) + (i167 * 1426) + ((~(964503541 | i165)) * 713);
            int i169 = i168 ^ (i168 << 13);
            int i170 = i169 ^ (i169 >>> 17);
            ((int[]) objArr81[2])[0] = i170 ^ (i170 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr16 = (String[]) objArr4[0];
        if (strArr16 != null) {
            for (String str4 : strArr16) {
                arrayList2.add(str4);
            }
        }
        Object[] objArr82 = {Long.valueOf((((long) (i151 ^ i152)) & 4294967295L) ^ (((long) (-327515576)) << 32)), Long.valueOf(-327511480)};
        byte[] bArr27 = $$d;
        Object[] objArr83 = new Object[1];
        c((byte) 75, (short) 163, bArr27[545], objArr83);
        Class<?> cls12 = Class.forName((String) objArr83[0]);
        byte b22 = bArr27[29];
        byte b23 = b22;
        Object[] objArr84 = new Object[1];
        c(b23, (short) (b23 | 94), b22, objArr84);
        cls12.getMethod((String) objArr84[0], Long.TYPE, Long.TYPE).invoke(null, objArr82);
        Object[] objArr85 = {new String[0], new int[]{i}, new int[1], new int[]{i}};
        int i171 = ((int[]) objArr4[2])[0];
        int i172 = ((int[]) objArr4[1])[0];
        int i173 = ((int[]) objArr4[3])[0];
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i174 = i171 + (-1559640080) + (((~(150575695 | iIdentityHashCode8)) | 6822415) * (-502)) + ((~((~iIdentityHashCode8) | 184524655)) * (-502)) + (((~(iIdentityHashCode8 | (-177702241))) | 150575695) * 502);
        int i175 = (i174 << 13) ^ i174;
        int i176 = i175 ^ (i175 >>> 17);
        ((int[]) objArr85[2])[0] = i176 ^ (i176 << 5);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0213  */
    /* JADX WARN: Code duplicated, block: B:26:0x021d  */
    public final void IconCompatParcelizer() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = serializer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1046760075);
        if (objRemoteActionCompatParcelizer == null) {
            char cAlpha = (char) android.graphics.Color.alpha(0);
            int i4 = 888 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i5 = 61 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[57], (byte) ($$b & 463), bArr[7], objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAlpha, i4, i5, 290165908, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(1 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1851890428);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i6 = 888 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int defaultSize = 60 - View.getDefaultSize(0, 0);
            byte b = $$a[138];
            byte b2 = (byte) (b | 127);
            Object[] objArr5 = new Object[1];
            a(b, b2, (byte) (b2 & 165), objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, i6, defaultSize, 1095648485, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1604185998);
            if (objRemoteActionCompatParcelizer3 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iAxisFromString = 886 - MotionEvent.axisFromString("");
                int iKeyCodeFromString = 60 - android.view.KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr2[57] - 1), (byte) ($$b & 467), bArr2[138], objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, iAxisFromString, iKeyCodeFromString, -1890726289, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, new int[1], (String[]) objArr7[3]};
            int iNextInt = new Random().nextInt(708746815);
            int i7 = ~iNextInt;
            int i8 = 284610232 + (((~(i7 | (-343646043))) | 686704176) * (-1042)) + (((-343646043) | iNextInt) * 521) + (((~(iNextInt | (-686704177))) | 679755808 | (~(i7 | (-336697675)))) * 521) + 422852651;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(1 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = serializer + 97;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
                int i13 = IconCompatParcelizer + 39;
                serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            Object[] objArr10 = new Object[1];
            b(-Process.getGidForName(""), new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 422852651};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                c((byte) (-bArr3[456]), (short) 266, (byte) ($$e - 5), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                c((byte) 79, (short) 227, bArr3[28], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1604185998);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int longPressTimeout = 887 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int iIndexOf = 60 - TextUtils.indexOf("", "", 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr15 = new Object[1];
                    a((byte) (bArr4[57] - 1), (byte) ($$b & 467), bArr4[138], objArr15);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveSize, longPressTimeout, iIndexOf, -1890726289, false, (String) objArr15[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    b((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1851890428);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int i15 = 888 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 60;
                        byte b3 = $$a[138];
                        byte b4 = (byte) (b3 | 127);
                        Object[] objArr18 = new Object[1];
                        a(b3, b4, (byte) (b4 & 165), objArr18);
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveOpacity, i15, offsetBefore, 1095648485, false, (String) objArr18[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1046760075);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int fadingEdgeLength = 887 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 60;
                        byte[] bArr5 = $$a;
                        Object[] objArr19 = new Object[1];
                        a(bArr5[57], (byte) ($$b & 463), bArr5[7], objArr19);
                        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf2, fadingEdgeLength, mode, 290165908, false, (String) objArr19[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[1])[0];
        if (i17 == i16) {
            int i18 = serializer + 31;
            IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[2])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i21 = (~((-1053214721) | iFreeMemory)) | 344115200;
            int i22 = i20 + 1984916005 + (i21 * 992) + ((i21 | (~((~iFreeMemory) | (-1057067)))) * (-496)) + ((iFreeMemory | (-710156587)) * 496);
            int i23 = i22 ^ (i22 << 13);
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
            int i25 = ((int[]) objArr20[2])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr20[0])[0]}, new int[]{((int[]) objArr20[1])[0]}, new int[1], (String[]) objArr20[3]};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i26 = i25 + ((((-1136556400) + (((~((-343933803) | iFreeMemory2)) | (~((-875669) | iFreeMemory2))) * 69)) + (((~(iFreeMemory2 | (-35609749))) | ((~((-378667883) | iFreeMemory2)) | 34734080)) * (-69))) - 418701243);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr21[2])[0] = i28 ^ (i28 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        try {
            Object[] objArr22 = {Long.valueOf((((long) 558555386) << 32) ^ (((long) (i16 ^ i17)) & 4294967295L)), Long.valueOf(558555378)};
            byte[] bArr6 = $$d;
            Object[] objArr23 = new Object[1];
            c(bArr6[22], (short) ($$e | 263), (byte) (-bArr6[456]), objArr23);
            Class<?> cls6 = Class.forName((String) objArr23[0]);
            byte b5 = bArr6[29];
            byte b6 = b5;
            Object[] objArr24 = new Object[1];
            c(b6, (short) (b6 | 94), b5, objArr24);
            cls6.getMethod((String) objArr24[0], Long.TYPE, Long.TYPE).invoke(null, objArr22);
            int i29 = ((int[]) objArr[2])[0];
            Object[] objArr25 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i30 = i29 + ((~((-16793605) | iMyUid)) * 521) + 158642664 + (((~((~iMyUid) | (-16793605))) | (-362675007)) * 521);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr25[2])[0] = i32 ^ (i32 << 5);
            throw new RuntimeException(String.valueOf(i17));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final void read() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1566317743);
        if (objRemoteActionCompatParcelizer == null) {
            char cRed = (char) (52878 - android.graphics.Color.red(0));
            int keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 991;
            int iResolveSize = 31 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) (bArr[57] - 1), (byte) ($$b & 467), bArr[138], objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, keyRepeatTimeout, iResolveSize, 1920189104, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(1 - android.graphics.Color.green(0), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(684123617);
        if (objRemoteActionCompatParcelizer2 == null) {
            char deadChar = (char) (52878 - android.view.KeyEvent.getDeadChar(0, 0));
            int scrollBarFadeDuration = 991 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int maximumFlingVelocity = 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b = $$a[138];
            byte b2 = (byte) (b | 127);
            Object[] objArr5 = new Object[1];
            a(b, b2, (byte) (b2 & 165), objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(deadChar, scrollBarFadeDuration, maximumFlingVelocity, -132725760, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = IconCompatParcelizer + 111;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1980318382);
            if (objRemoteActionCompatParcelizer3 == null) {
                char mode = (char) (52878 - View.MeasureSpec.getMode(0));
                int i4 = 990 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[57], (byte) ($$b & 463), bArr2[7], objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(mode, i4, iIndexOf, 1495702707, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((1784013066 + ((115855029 | i7) * (-757))) + ((~((-956309769) | iIdentityHashCode)) * 1514)) + (((~(iIdentityHashCode | 1072164797)) | ((~(i7 | (-1034151854))) | 77842085)) * 757)) - 1935540592;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(1 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) + 1, new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-944006910};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1516241891);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1157, 60 - Process.getGidForName(""), -1968168446, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1935540592, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr10), false};
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1160736261);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 52878);
                    int absoluteGravity = 991 - Gravity.getAbsoluteGravity(0, 0);
                    int minimumFlingVelocity = 31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    a(bArr3[57], (byte) ($$b & 463), bArr3[7], objArr12);
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(trimmedLength, absoluteGravity, minimumFlingVelocity, -1778429980, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (MotionEvent.axisFromString("") + 1), 1115 - (android.view.KeyEvent.getMaxKeyCode() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 42), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr11);
                Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1980318382);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cCombineMeasuredStates = (char) (52878 - View.combineMeasuredStates(0, 0));
                    int capsMode = 991 - TextUtils.getCapsMode("", 0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 31;
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(bArr4[57], (byte) ($$b & 463), bArr4[7], objArr13);
                    objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cCombineMeasuredStates, capsMode, packedPositionType, 1495702707, false, (String) objArr13[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(View.MeasureSpec.getMode(0) + 1, new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(1 - TextUtils.getTrimmedLength(""), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(684123617);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 52879);
                        int i11 = 991 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int trimmedLength2 = 31 - TextUtils.getTrimmedLength("");
                        byte b3 = $$a[138];
                        byte b4 = (byte) (b3 | 127);
                        Object[] objArr16 = new Object[1];
                        a(b3, b4, (byte) (b4 & 165), objArr16);
                        objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(bitsPerPixel, i11, trimmedLength2, -132725760, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1566317743);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char c = (char) (52879 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int packedPositionChild = 990 - ExpandableListView.getPackedPositionChild(0L);
                        int mirror = AndroidCharacter.getMirror('0') - 17;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((byte) (bArr5[57] - 1), (byte) ($$b & 467), bArr5[138], objArr17);
                        objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, packedPositionChild, mirror, 1920189104, false, (String) objArr17[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
                    int i12 = IconCompatParcelizer + 51;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = serializer + 65;
            IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i21 = (~((-1070758816) | startElapsedRealtime)) | 76561027;
            int i22 = i18 + 1977243778 + (i21 * 992) + ((i21 | (~((~startElapsedRealtime) | 1073445855))) * (-496)) + ((startElapsedRealtime | 79248067) * 496);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr18[2])[0];
            int i26 = ((int[]) objArr18[3])[0];
            int i27 = ((int[]) objArr18[1])[0];
            String[] strArr3 = (String[]) objArr18[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i28 = ~((-1027851545) | iIdentityHashCode2);
            int i29 = ~iIdentityHashCode2;
            int i30 = i25 + (-439376430) + ((i28 | (~(122155338 | i29))) * (-1808)) + (((~((-88326409) | iIdentityHashCode2)) | (~(i29 | 1061680474))) * 904) + (((~(iIdentityHashCode2 | (-122155339))) | 939525136 | (~(1027851544 | i29))) * 904);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i33 = IconCompatParcelizer + 47;
            serializer = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i34 = i33 % 2;
            for (String str : strArr4) {
                int i35 = serializer + 125;
                IconCompatParcelizer = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i36 = i35 % 2;
                arrayList.add(str);
            }
        }
        try {
            Object[] objArr20 = {Long.valueOf((((long) (-827902772)) << 32) ^ (((long) (i14 ^ i15)) & 4294967295L)), Long.valueOf(-827902771)};
            short s = (short) ($$e | 326);
            byte[] bArr6 = $$d;
            Object[] objArr21 = new Object[1];
            c((byte) 75, s, bArr6[221], objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            byte b5 = bArr6[29];
            byte b6 = b5;
            Object[] objArr22 = new Object[1];
            c(b6, (short) (b6 | 94), b5, objArr22);
            cls4.getMethod((String) objArr22[0], Long.TYPE, Long.TYPE).invoke(null, objArr20);
            Object[] objArr23 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[3])[0];
            int i39 = ((int[]) objArr[1])[0];
            String[] strArr5 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt(2020558355);
            int i40 = ~iNextInt;
            int i41 = i37 + 1222379026 + (((~((-627888359) | i40)) | 84721764) * DateTimeConstants.HOURS_PER_WEEK) + ((~((-84721765) | iNextInt)) * DateTimeConstants.HOURS_PER_WEEK) + (((~(iNextInt | (-543166595))) | (~(i40 | (-522118525))) | 437396760) * DateTimeConstants.HOURS_PER_WEEK);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr23[2])[0] = i43 ^ (i43 << 5);
            int[] iArr = new int[i15];
            int i44 = i15 - 1;
            iArr[i44] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i44) % 2) - 1], 1).show();
            Object[] objArr24 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i45 = ((int[]) objArr23[2])[0];
            int i46 = ((int[]) objArr23[3])[0];
            int i47 = ((int[]) objArr23[1])[0];
            String[] strArr6 = (String[]) objArr23[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i48 = ~iUptimeMillis;
            int i49 = i45 + (-1844969958) + (((~((-1055912901) | i48)) | (-94093983) | (~(1055912900 | iUptimeMillis))) * (-564)) + ((~(iUptimeMillis | (-17825819))) * 1128) + (((~((-94093983) | i48)) | (-1073738719)) * 564);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr24[2])[0] = i51 ^ (i51 << 5);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final void serializer() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1434255524);
        if (objRemoteActionCompatParcelizer == null) {
            char cBlue = (char) (35249 - android.graphics.Color.blue(0));
            int i2 = 1530 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iRed = android.graphics.Color.red(0) + 35;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[136], (byte) (-bArr[51]), bArr[68], objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cBlue, i2, iRed, -2052251323, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(1 - View.getDefaultSize(0, 0), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1979565800);
        if (objRemoteActionCompatParcelizer2 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 35249);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1529;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 36;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[57], (byte) ($$b & 463), bArr2[7], objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(size, threadPriority, iIndexOf, -1523718391, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(931007611);
            if (objRemoteActionCompatParcelizer3 == null) {
                char modifierMetaStateMask = (char) (35248 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                int fadingEdgeLength = (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1529;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 35;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr3[57] - 1), (byte) ($$b & 467), bArr3[138], objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(modifierMetaStateMask, fadingEdgeLength, offsetAfter, -408015462, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyPid = Process.myPid();
            int i5 = 298309784 + (((~((-50400739) | iMyPid)) | 33621090) * 336) + (((~(iMyPid | 642208886)) | (-658988535)) * (-168)) + (((~((~iMyPid) | 642208886)) | (-50400739)) * DateTimeConstants.HOURS_PER_WEEK) + 94433589;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(android.graphics.Color.green(0) + 1, new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(android.view.KeyEvent.normalizeMetaState(0) + 1, new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 16777216, new isUsingCompositingLayerui(2104588073), 94433589, false};
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                c(bArr4[22], (short) 400, (byte) (-bArr4[92]), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c((byte) (-bArr4[307]), (short) 144, (byte) (-bArr4[11]), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE, getHorizontalScrollAxisRange.class, Integer.TYPE, Boolean.TYPE).invoke(null, objArr10);
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(931007611);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cIndexOf = (char) (35249 - TextUtils.indexOf("", "", 0));
                    int iAlpha = 1529 - android.graphics.Color.alpha(0);
                    int iLastIndexOf = 34 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr13 = new Object[1];
                    a((byte) (bArr5[57] - 1), (byte) ($$b & 467), bArr5[138], objArr13);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, iAlpha, iLastIndexOf, -408015462, false, (String) objArr13[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(1 - android.view.KeyEvent.normalizeMetaState(0), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1979565800);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char threadPriority2 = (char) (35249 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int minimumFlingVelocity = 1529 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 35;
                        byte[] bArr6 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr6[57], (byte) ($$b & 463), bArr6[7], objArr16);
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority2, minimumFlingVelocity, iMakeMeasureSpec, -1523718391, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1434255524);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 35249);
                        int bitsPerPixel = 1528 - ImageFormat.getBitsPerPixel(0);
                        int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35;
                        byte[] bArr7 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr7[136], (byte) (-bArr7[51]), bArr7[68], objArr17);
                        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveSize, bitsPerPixel, i8, -2052251323, false, (String) objArr17[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i11 = ((int[]) objArr[3])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i14 = ~iMaxMemory;
            int i15 = i11 + (-110267808) + (((~((-986614490) | i14)) | (~(294004864 | i14))) * (-867)) + (((~((-986614490) | iMaxMemory)) | 709395033 | (~(294004864 | iMaxMemory))) * (-1734)) + (((~(iMaxMemory | 1003399897)) | (~(i14 | (-709395034))) | (~((-277219457) | iMaxMemory))) * 867);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr18[3])[0] = i17 ^ (i17 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[0];
        if (strArr3 != null) {
            int i18 = serializer + 119;
            IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < strArr3.length) {
                int i21 = serializer + 97;
                IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    arrayList.add(strArr3[i20]);
                    i20 += 117;
                } else {
                    arrayList.add(strArr3[i20]);
                    i20++;
                }
            }
        }
        Object[] objArr19 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr19);
        Class<?> cls5 = Class.forName((String) objArr19[0]);
        Object[] objArr20 = new Object[1];
        b(-ExpandableListView.getPackedPositionChild(0L), new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr20);
        Context applicationContext = (Context) cls5.getMethod((String) objArr20[0], new Class[0]).invoke(null, null);
        if (applicationContext != null) {
            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
        }
        if (Looper.myLooper() == null) {
            int i22 = serializer + 97;
            IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i22 % 2 == 0) {
                int i23 = 81 / 0;
            }
            applicationContext = null;
        }
        long j2 = (((long) (-1885012280)) << 32) ^ (((long) (i9 ^ i10)) & 4294967295L);
        long j3 = -1885012278;
        int i24 = IconCompatParcelizer + 55;
        serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i25 = i24 % 2;
        try {
            Object[] objArr21 = {applicationContext, Long.valueOf(j2), Long.valueOf(j3)};
            byte[] bArr8 = $$d;
            Object[] objArr22 = new Object[1];
            c(bArr8[14], (short) 431, (byte) 79, objArr22);
            Class<?> cls6 = Class.forName((String) objArr22[0]);
            byte b = bArr8[29];
            byte b2 = b;
            Object[] objArr23 = new Object[1];
            c(b2, (short) (b2 | 94), b, objArr23);
            cls6.getMethod((String) objArr23[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr21);
            Object[] objArr24 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ~System.identityHashCode(this);
            int i30 = i26 + 1163621776 + ((~((-184590865) | i29)) * 52) + (((~(878646761 | i29)) | (~(186037136 | i29)) | (-1063237626)) * (-52)) + (((~(i29 | (-878646762))) | 1446272) * 52);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr24[3])[0] = i32 ^ (i32 << 5);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final void MediaSessionCompatQueueItem() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-561053068);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int minimumFlingVelocity = 2001 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr2 = new Object[1];
            a($$a[5], (byte) ($$b & 486), (byte) 46, objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, minimumFlingVelocity, packedPositionGroup, 241116053, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(TextUtils.indexOf("", "") + 1, new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2129589496);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int edgeSlop = 2001 - (android.view.ViewConfiguration.getEdgeSlop() >> 16);
            int threadPriority = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[57], (byte) ($$b & 463), bArr[7], objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, edgeSlop, threadPriority, 1371613929, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1898754981);
            if (objRemoteActionCompatParcelizer3 == null) {
                char longPressTimeout = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                int scrollBarFadeDuration = 2001 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int edgeSlop2 = 14 - (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr2[57] - 1), (byte) ($$b & 467), bArr2[138], objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(longPressTimeout, scrollBarFadeDuration, edgeSlop2, 1577283002, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iMyTid = Process.myTid();
            int i6 = (((((~((-537270273) | iMyTid)) | 236535924) * 449) - 1336183394) + (((~((~iMyTid) | (-537270273))) | 236535924) * 449)) - 937450236;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, new char[]{65252, 65157, 64348, 44551, 4207, 56189, 47713, 9360, 43615, 20796, 61237, 36640, 22317, 1521, 17421, 29204, 217, 43150, 47357, 9487, 44482, 21424, 60833, 35307, 22164, 1645, 17043, 31963, 637, 43285}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, new char[]{926, 1021, 10350, 32046, 13006, 59770, 39126, 5783, 22319, 33289, 52612, 48456, 43590, 54979, 26288, 16468, 64897, 31678, 39516, 5896, 20641, 32901}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr10 = new Object[1];
            b((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, new char[]{17302, 17404, 45715, 59335, 47271, 40656, 4795, 24878, 5996, 6390, 18424, 51917, 59993, 19552, 60646, 14318, 48537, 57686, 4132, 24742}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(android.graphics.Color.argb(0, 0, 0, 0) + 1, new char[]{22747, 22706, 18504, 7449, 13155, 35779, 39276, 29746, 3195, 57896, 52265, 57289, 61755, 46836, 26370, 8940, 42724, 7062, 39905, 30141}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = serializer + 9;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -937450236};
                short s = (short) androidx.compose.ui.graphics.Fields.RotationY;
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                c((byte) 75, s, (byte) (-bArr3[211]), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                c((byte) 83, (short) 547, bArr3[105], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1898754981);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 2001;
                        int i11 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a((byte) (bArr4[57] - 1), (byte) ($$b & 467), bArr4[138], objArr16);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(touchSlop, packedPositionGroup2, i11, 1577283002, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(1 - android.graphics.Color.blue(0), new char[]{21224, 21129, 29806, 8501, 59180, 6142, 19746, 59411, 1619, 56846, 6262, 17315, 64303, 35520, 45840, 48874, 44269, 10156, 20414, 59776, 469, 56488, 6906, 17790, 64175, 35164}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{36495, 36586, 166, 22015, 55653, 38365, 29550, 27186, 55848, 43722, 9791, 49660, 10050, 65050, 36123, 15598, 28826, 21370, 29158}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2129589496);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int scrollDefaultDelay = (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2001;
                            int windowTouchSlop = 14 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr5[57], (byte) ($$b & 463), bArr5[7], objArr19);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, scrollDefaultDelay, windowTouchSlop, 1371613929, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-561053068);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                            int deadChar = android.view.KeyEvent.getDeadChar(0, 0) + 2001;
                            int mode = View.MeasureSpec.getMode(0) + 14;
                            Object[] objArr20 = new Object[1];
                            a($$a[5], (byte) ($$b & 486), (byte) 46, objArr20);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, deadChar, mode, 241116053, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i14 + 26073078 + (((~((-1009778428) | i17)) | (-326083980)) * (-865)) + ((~(iIdentityHashCode | 1009778427)) * 865) + (((~((-326083980) | i17)) | (~(i17 | 1009778427))) * 865);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr21[2])[0];
            int i22 = ((int[]) objArr21[0])[0];
            int i23 = ((int[]) objArr21[3])[0];
            String[] strArr3 = (String[]) objArr21[1];
            int iMyUid = Process.myUid();
            int i24 = ~iMyUid;
            int i25 = i21 + 249277590 + (((~((-1146323308) | i24)) | 4194571) * DateTimeConstants.HOURS_PER_WEEK) + ((~((-4194572) | iMyUid)) * DateTimeConstants.HOURS_PER_WEEK) + (((~(iMyUid | (-1142128737))) | (~(i24 | (-189539100))) | 185344528) * DateTimeConstants.HOURS_PER_WEEK);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[2])[0] = i27 ^ (i27 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr4 = (String[]) objArr[1];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList.add(str);
            }
        }
        try {
            Object[] objArr23 = {Long.valueOf((((long) 1453900392) << 32) ^ (((long) (i12 ^ i13)) & 4294967295L)), Long.valueOf(1453900360)};
            byte[] bArr6 = $$d;
            Object[] objArr24 = new Object[1];
            c(bArr6[22], (short) 551, bArr6[367], objArr24);
            Class<?> cls6 = Class.forName((String) objArr24[0]);
            byte b = bArr6[29];
            byte b2 = b;
            Object[] objArr25 = new Object[1];
            c(b2, (short) (b2 | 94), b, objArr25);
            cls6.getMethod((String) objArr25[0], Long.TYPE, Long.TYPE).invoke(null, objArr23);
            Object[] objArr26 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[3])[0];
            String[] strArr5 = (String[]) objArr[1];
            int iMyTid2 = Process.myTid();
            int i31 = ~iMyTid2;
            int i32 = i28 + (((~((-203299585) | i31)) | (~(788504573 | iMyTid2))) * 988) + 74147858 + (((~(iMyTid2 | (-750657418))) | 547357833 | (~(i31 | 788504573))) * 988);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr26[2])[0] = i34 ^ (i34 << 5);
            throw new RuntimeException(String.valueOf(i13));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        byte[] bArr = new byte[597];
        System.arraycopy("kD×U\rÿÂ;\u000eí\u0017ï\u0005ÆEøý\tõ\u000e\u0001Á?\u0004õÿ\u0014ö\u0007\u0000Á5\u0004ý\u000eÁ?\u0004ùÈ\u0015#\u0010â\u0016\u0005\u0014\t\u0003\u0006òÝ#\u0012ö\u0007\u0000Ö-ÿ\u0004ò\u0014Ý\u0012\u0012ò\u0003\bþ\u0012ì\u000eÀ:ÿ\u0010Ó$\nôÝ$\u0013ð\u000e\u0003ö\u000b÷\u0006úã\u001cÞ3\u0007öö\u0001>\rÿÂ7\u0002\bþ\u000eð\u000e\bðþ\u000eþÀ6\u0013ÿ\u0002üÿù\u000eò\u0006ú\u0014»Fó\u000e\u0005ôû\u0003Ê\u0016&ú\u0014à\u0013\u000e\u0005ôû\u0003\u001b\r\u0000Ö-ÿ\u0004ò\u0014Ý\u0012\u0012ò\u0003\bþ\u0012ì\u000eÀ:ÿ\u0010à\u0013\u000eøù\fþ\u0012ì\u000eõ\u0012ðú\u0005\nþý\n\u0007ì\u0014ô\búý\u0013óÀ<\u0006\tì\fþüþ\u0014òß-\u0000\u0006\u0003ùù\u000e\u0002Ý\u0018é\"ö\u0002â*\u0004Ú\u001b\u0015ó\u000eøù\fþ\u0012ì\u000eÀ:ÿ\u0010à\u000f\f\tÀCò\u0012\u0002óï\"ÿø\u0006ú\u0006ö\rö\u0003þÐôý\u0004\u0010\u0001¿6ÿ\u0013öÇFÿüù\u0002\bþÿ\u0002\r»7ÿÍ\"\"\u0005ö\u0005ý\u000b\u0002öûê$õ\tÛ4ì\u0003\f\u0005ö\u0007\u0000\rÿÂ@õ\u0010ó\u000e\n·6\rÿ\u0001\u0003\u0000Á?\u0004õÿ\u0014ö\u0007\u0000Á\u001f$õÿ\u0014ö\u0007\u0000è\u001cõþ\u0014ò\u000fà\u0014ÿ\u0003\u0005\u000eð\u000e³ '\nò\u0013øö\u0012Ð2\u0001ð\u0019À\u0014.\u0001\u0002\u0006î\u0014ò\u0000ð\"ÿø\u0006úÛ.\u0001\u0002\u0006î\u0014ö\u0007\u0000\rÿÂ4\u0004\u0007\fÿ\u0002»Fò\bÄ\u0014$\u0007\fÿ\u0002Ö&\u0006\u0002î\u000eö\u0003À\u000e\u0003\u0007ÀEôý\u0003\u0012ö\u000eð\u0014·<\u0006\u0007ò\u000eýô\fÃB\u0002ö\u000eð\u0014ü\u0004\u0002¼@õ\u0019ê\u0004Ê \u0015\u0019ê\u0004â-þÿ×-ÿ\u0004ýú\u0010î\u0002\u000búÀ#-þÿ×-ÿ\u0004ýú\u0010î\u0002\u000búë\u0014\u0012ó\u000e\u0005ð\u000eÀ:ÿ\u0010Ü æ\u0013\u000f\u0001÷\u0007\u0000ç\u001fð\u0003\tÿ\u0006úà\u001c\t\u0004ú\u0000é\u001e\u000b\u0002ò\nø\u000eüø\fò\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË:\u0007\u0007¼6\rÿ\u0001\u0003\u0000Á<\u0006\u0007ò\u000eýô\fÃM\u0001ö".getBytes("ISO-8859-1"), 0, bArr, 0, 597);
        $$d = bArr;
        $$e = 48;
        $$a = new byte[]{82, 90, 113, -1, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -5, -9, 11, -15, -13, -4, 3, 24, -1, 5, -8, -29, 33, 14, -16, 15, -9, 7, 4, -11, 6, -1, -43, 44, -2, 3, -15, 19, 24, -1, 5, -8, -20, 24, 15, -19, 3, -3, 19, -19, -30, 44, -2, 3, -15, 19, 24, -1, 5, -8, -31, 48, -3, 8, -4, -14, 13, -47, 44, -2, 3, -15, 19, -39, 24, -1, 5, -8, -24, 43, -15, 8, -14, 13, -9, -8, 11, -3, 17, -21, 13, 24, -1, 5, -8, -14, 18, 14, 0, -10, 6, -1, -43, 44, -2, 3, -15, 19, -35, 36, -16, 16, -16, -28, 43, -15, 8};
        $$b = 125;
        serializer = 0;
        IconCompatParcelizer = 1;
        write = -8167409937442229564L;
    }
}
