package kotlinx.coroutines.flow;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import java.lang.reflect.Method;
import o.accesstoOffsetmoWRBKg;
import o.getScrollAxesk4lQ0M;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FlowKt__CollectionKt {
    private static final byte[] $$a = {94, -68, 1, -105};
    private static final int $$b = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] IconCompatParcelizer = {20490, 20511, 20492, 20488, 20543, 20533, 20539, 20542, 20528, 20713, 20501, 20532, 20523, 20548, 20534, 20733, 20510, 20516, 20506, 20531, 20520, 20551, 20545, 20735, 20538, 20522, 20549, 20544, 20529, 20484, 20729, 20513, 20505, 20537, 20541, 20540, 20530, 20508, 20480, 20496, 20491};
    private static int RemoteActionCompatParcelizer = 1336103113;
    private static boolean serializer = true;
    private static boolean read = true;
    private static long write = -7009568347796326538L;
    private static int MediaMetadataCompat = -658032778;
    private static char MediaBrowserCompatMediaItem = 34667;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = 111 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.$$a
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__CollectionKt.$$c(int, int, byte):java.lang.String");
    }

    private static void b(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        char c3 = 2;
        int i2 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        int i4 = $10 + 37;
        $11 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i6 = $10 + 5;
            $11 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 230;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 21;
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority, i8, tapTimeout, 1436720535, false, "j", clsArr);
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 1);
                    int absoluteGravity = 2546 - Gravity.getAbsoluteGravity(i3, i3);
                    int bitsPerPixel = 29 - ImageFormat.getBitsPerPixel(i3);
                    byte b = $$a[c3];
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b2, (byte) (b2 | 7), (byte) (b - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, absoluteGravity, bitsPerPixel, -73045399, false, str$$c, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i3] = accesstooffsetmowrbkg;
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int capsMode = TextUtils.getCapsMode("", i3, i3) + 887;
                    int i10 = 60 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                    byte b3 = (byte) ($$a[2] - 1);
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maxKeyCode, capsMode, i10, -562850980, false, $$c(b3, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char absoluteGravity2 = (char) (65450 - Gravity.getAbsoluteGravity(0, 0));
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1244;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                    byte b5 = (byte) ($$a[2] - 1);
                    byte b6 = (byte) (b5 + 3);
                    String str$$c2 = $$c(b5, b6, (byte) (b6 - 3));
                    c2 = 2;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(absoluteGravity2, capsMode2, maximumFlingVelocity, 1854554309, false, str$$c2, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (write ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaMetadataCompat) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaBrowserCompatMediaItem) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
                c3 = c2;
                i3 = 0;
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

    private static void a(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getScrollAxesk4lQ0M getscrollaxesk4lq0m = new getScrollAxesk4lQ0M();
        char[] cArr2 = IconCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 63;
                $11 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1214572153);
                    if (objRemoteActionCompatParcelizer == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 50817);
                        int touchSlop = 2087 - (ViewConfiguration.getTouchSlop() >> 8);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14;
                        byte b = $$a[i2];
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(fadingEdgeLength, touchSlop, keyRepeatTimeout, -1732982888, false, $$c(b2, (byte) (b2 | 45), (byte) (b - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 27;
            $11 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1093774937);
        if (objRemoteActionCompatParcelizer2 == null) {
            char packedPositionGroup = (char) (4678 - ExpandableListView.getPackedPositionGroup(0L));
            int iNormalizeMetaState = 2803 - KeyEvent.normalizeMetaState(0);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 18;
            byte b3 = $$a[2];
            byte b4 = (byte) (b3 - 1);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup, iNormalizeMetaState, edgeSlop, 1847488582, false, $$c(b4, (byte) (b4 | 44), (byte) (b3 - 1)), new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i9 = -206402645;
        if (read) {
            int i10 = $10 + 109;
            $11 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getscrollaxesk4lq0m.IconCompatParcelizer = bArr.length;
            char[] cArr4 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
            getscrollaxesk4lq0m.serializer = 0;
            while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
                cArr4[getscrollaxesk4lq0m.serializer] = (char) (cArr2[bArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] + i] - iIntValue);
                Object[] objArr4 = {getscrollaxesk4lq0m, getscrollaxesk4lq0m};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i9);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (2100 - TextUtils.indexOf("", "")), KeyEvent.keyCodeFromString("") + 4635, ((Process.getThreadPriority(0) + 20) >> 6) + 71, 593668682, false, "G", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i9 = -206402645;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!serializer) {
            getscrollaxesk4lq0m.IconCompatParcelizer = iArr.length;
            char[] cArr5 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
            getscrollaxesk4lq0m.serializer = 0;
            while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
                cArr5[getscrollaxesk4lq0m.serializer] = (char) (cArr2[iArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] - i] - iIntValue);
                getscrollaxesk4lq0m.serializer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getscrollaxesk4lq0m.IconCompatParcelizer = cArr.length;
        char[] cArr6 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
        getscrollaxesk4lq0m.serializer = 0;
        while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
            int i12 = $11 + 59;
            $10 = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            cArr6[getscrollaxesk4lq0m.serializer] = (char) (cArr2[cArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] - i] - iIntValue);
            try {
                Object[] objArr5 = {getscrollaxesk4lq0m, getscrollaxesk4lq0m};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-206402645);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (2100 - TextUtils.getTrimmedLength("")), 4635 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 71, 593668682, false, "G", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r6v80, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v136, types: [int] */
    /* JADX WARN: Type inference failed for: r7v148, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v153, types: [int] */
    /* JADX WARN: Type inference failed for: r7v156 */
    /* JADX WARN: Type inference failed for: r7v157 */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v159 */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v161 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24, types: [int] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v95, types: [java.lang.Object] */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] write(android.content.Context r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 4423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__CollectionKt.write(android.content.Context, int, int):java.lang.Object[]");
    }
}
