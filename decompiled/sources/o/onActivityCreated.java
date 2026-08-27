package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class onActivityCreated implements getPersonMiddleInitial {
    private static final byte[] $$b = {53, 114, -40, -92};
    private static final int $$c = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int serializer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int[] IconCompatParcelizer = {-1851848477, 499320403, -578783173, 678963968, 612008148, -1651169038, -1035679846, 1719540120, -2105125169, 256991751, 146509204, 1615789858, -1353648948, -46440347, 124423948, 2043808192, 1473606931, -838381660};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(short r6, short r7, short r8) {
        /*
            byte[] r0 = o.onActivityCreated.$$b
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 116
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityCreated.$$d(short, short, short):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:9:0x006f A[PHI: r7 r9
  0x006f: PHI (r7v3 long) = (r7v2 long), (r7v10 long) binds: [B:8:0x006d, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r9v7 java.lang.Object) = (r9v6 java.lang.Object), (r9v18 java.lang.Object) binds: [B:8:0x006d, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public static void $$a(long j, long j2) throws Throwable {
        long j3;
        Object obj;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                j3 = j + (j2 >>> 63);
                Object[] objArr = new Object[1];
                a(63 >>> View.MeasureSpec.getSize(1), new int[]{-1970440283, -1942225506, 1720843644, 1918821004, -148929575, -565656572}, objArr);
                RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
                obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
                if (obj != null) {
                    Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                    int i3 = serializer + 41;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    Object[] objArr2 = {Long.valueOf(j3)};
                    Object[] objArr3 = new Object[1];
                    a(android.graphics.Color.rgb(0, 0, 0) + 16777219, new int[]{-291574396, 2109881835}, objArr3);
                    Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                    method.setAccessible(true);
                    method.invoke(obj2, objArr2);
                } else {
                    Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                    Object[] objArr4 = new Object[0];
                    Object[] objArr5 = new Object[1];
                    a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, new int[]{1031698719, 714400851, -1375249538, -284726386, -744004397, -469225709, -1994833801, 2098258041, 1063494354, -1288722469, -1731108161, 990114705, -1819433830, -1775982531, 837672135, -740488512, -994038915, -1235074699, -1569283593, -11492096}, objArr5);
                    Object[] objArr6 = {(String) objArr5[0], objArr4};
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method2.setAccessible(true);
                    method2.invoke(obj3, objArr6);
                }
            } else {
                j3 = j ^ (j2 << 32);
                Object[] objArr7 = new Object[1];
                a(View.MeasureSpec.getSize(0) + 9, new int[]{-1970440283, -1942225506, 1720843644, 1918821004, -148929575, -565656572}, objArr7);
                RiderSupportBreakRequestLogger.class.getField((String) objArr7[0]).get(null);
                obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
                if (obj != null) {
                    Object obj4 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                    int i5 = serializer + 41;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    Object[] objArr8 = {Long.valueOf(j3)};
                    Object[] objArr9 = new Object[1];
                    a(android.graphics.Color.rgb(0, 0, 0) + 16777219, new int[]{-291574396, 2109881835}, objArr9);
                    Method method3 = AtomicLong.class.getMethod((String) objArr9[0], Long.TYPE);
                    method3.setAccessible(true);
                    method3.invoke(obj4, objArr8);
                } else {
                    Object obj5 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                    Object[] objArr10 = new Object[0];
                    Object[] objArr11 = new Object[1];
                    a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, new int[]{1031698719, 714400851, -1375249538, -284726386, -744004397, -469225709, -1994833801, 2098258041, 1063494354, -1288722469, -1731108161, 990114705, -1819433830, -1775982531, 837672135, -740488512, -994038915, -1235074699, -1569283593, -11492096}, objArr11);
                    Object[] objArr12 = {(String) objArr11[0], objArr10};
                    Method method4 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method4.setAccessible(true);
                    method4.invoke(obj5, objArr12);
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

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        ceilAwayFromZero ceilawayfromzero = new ceilAwayFromZero();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IconCompatParcelizer;
        int i4 = -25295696;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 1;
            $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 19;
                $10 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i9]);
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                        if (objRemoteActionCompatParcelizer == null) {
                            byte b = (byte) i6;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2751 - MotionEvent.axisFromString(""), (-16777207) - android.graphics.Color.rgb(i6, i6, i6), 783164753, false, $$d(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2752 - View.resolveSizeAndState(0, 0, 0), 9 - TextUtils.getOffsetAfter("", 0), 783164753, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i2 = 2;
                i4 = -25295696;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IconCompatParcelizer;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i11]);
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.green(0) + 2752, ExpandableListView.getPackedPositionGroup(0L) + 9, 783164753, false, $$d(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i11++;
                    iArr5 = iArr5;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        ceilawayfromzero.serializer = 0;
        while (ceilawayfromzero.serializer < iArr.length) {
            cArr[c] = (char) (iArr[ceilawayfromzero.serializer] >> 16);
            cArr[1] = (char) iArr[ceilawayfromzero.serializer];
            cArr[2] = (char) (iArr[ceilawayfromzero.serializer + 1] >> 16);
            cArr[3] = (char) iArr[ceilawayfromzero.serializer + 1];
            ceilawayfromzero.RemoteActionCompatParcelizer = (cArr[0] << 16) + cArr[1];
            ceilawayfromzero.read = (cArr[2] << 16) + cArr[3];
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[i12];
                try {
                    Object[] objArr5 = {ceilawayfromzero, Integer.valueOf(ceilAwayFromZero.read(ceilawayfromzero.RemoteActionCompatParcelizer)), ceilawayfromzero, ceilawayfromzero};
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-98334374);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1758 - Gravity.getAbsoluteGravity(0, 0), 45 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 720611515, false, $$d(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
                    ceilawayfromzero.read = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i13 = ceilawayfromzero.RemoteActionCompatParcelizer;
            ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
            ceilawayfromzero.read = i13;
            ceilawayfromzero.read ^= iArr4[16];
            ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[17];
            int i14 = ceilawayfromzero.RemoteActionCompatParcelizer;
            int i15 = ceilawayfromzero.read;
            cArr[0] = (char) (ceilawayfromzero.RemoteActionCompatParcelizer >>> 16);
            cArr[1] = (char) ceilawayfromzero.RemoteActionCompatParcelizer;
            cArr[2] = (char) (ceilawayfromzero.read >>> 16);
            cArr[3] = (char) ceilawayfromzero.read;
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            cArr2[ceilawayfromzero.serializer * 2] = cArr[0];
            cArr2[(ceilawayfromzero.serializer * 2) + 1] = cArr[1];
            cArr2[(ceilawayfromzero.serializer * 2) + 2] = cArr[2];
            cArr2[(ceilawayfromzero.serializer * 2) + 3] = cArr[3];
            Object[] objArr6 = {ceilawayfromzero, ceilawayfromzero};
            Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(82275544);
            if (objRemoteActionCompatParcelizer5 == null) {
                byte b9 = (byte) 0;
                byte b10 = (byte) (b9 + 2);
                objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.indexOf("", "", 0), (Process.myTid() >> 22) + 1277, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, -734573255, false, $$d(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
