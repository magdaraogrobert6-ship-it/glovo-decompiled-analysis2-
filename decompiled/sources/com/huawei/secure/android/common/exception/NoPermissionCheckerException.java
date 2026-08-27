package com.huawei.secure.android.common.exception;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.QueryListener;
import o.accesstoOffsetmoWRBKg;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class NoPermissionCheckerException extends Exception {
    private static final byte[] $$b = {77, -89, -118, -2};
    private static final int $$c = Constant.ERROR_LOCATION_INVALID;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int serializer = 0;
    private static int read = 1;
    private static long RemoteActionCompatParcelizer = -214936978200894339L;
    private static int IconCompatParcelizer = -658032778;
    private static char write = 14198;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(short r7, short r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = 111 - r9
            byte[] r0 = com.huawei.secure.android.common.exception.NoPermissionCheckerException.$$b
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.exception.NoPermissionCheckerException.$$d(short, short, int):java.lang.String");
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 105;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a((-1364436916) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), new char[]{19618, 44120, 44718, 12467}, new char[]{21259, 56826, 24908, 25533}, new char[]{47998, 38478, 3101, 15383, 25626, 12022, 34197, 9244, 15614}, objArr);
        Object obj = null;
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj2 != null) {
                int i4 = read + 65;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                    obj.hashCode();
                    throw null;
                }
                Object obj3 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1053770004, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 48115), new char[]{60491, 12478, 62401, 57019}, new char[]{21259, 56826, 24908, 25533}, new char[]{31083, 20738, 55989}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj3, objArr2);
            } else {
                Object obj4 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a((-1694209401) - (Process.myTid() >> 22), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{34653, 1130, 24731, 9393}, new char[]{21259, 56826, 24908, 25533}, new char[]{19559, 25776, 18150, 42206, 13933, 14012, 25726, 11312, 1433, 56297, 50798, 7613, 33863, 2789, 23058, 65453, 39847, 29063, 60948, 57808, 18085, 37449, 53994, 30701, 42972, 11905, 33636, 8607, 38567, 5038, 20530, 63863, 25494, 60833, 59630, 22634, 41340}, objArr5);
                String str = (String) objArr5[0];
                int i5 = serializer + 67;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj4, str, objArr4);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        int i6 = $11 + 57;
        $10 = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 2 / 2;
        }
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i8 = $11 + 61;
            $10 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", i5);
                    int modifierMetaStateMask = 230 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iResolveSize = 21 - View.resolveSize(i5, i5);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, modifierMetaStateMask, iResolveSize, 1436720535, false, "j", clsArr);
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {accesstooffsetmowrbkg};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int scrollBarSize = 2546 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29;
                        byte b = (byte) i5;
                        byte b2 = (byte) (b - 1);
                        String str$$d = $$d(b, b2, (byte) (b2 & 7));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maximumFlingVelocity, scrollBarSize, i10, -73045399, false, str$$d, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i11);
                        objArr4[i5] = accesstooffsetmowrbkg;
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 - 1);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 1), 887 - TextUtils.getOffsetAfter("", i5), (Process.myPid() >> 22) + 60, -562850980, false, $$d(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 65450);
                                int i12 = 1245 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int iAlpha = Color.alpha(0) + 33;
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                String str$$d2 = $$d(b5, b6, (byte) (b6 + 4));
                                i2 = 2;
                                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter2, i12, iAlpha, 1854554309, false, str$$d2, new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                            cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) IconCompatParcelizer) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) write) ^ (-7009568347796326538L)))));
                            accesstooffsetmowrbkg.IconCompatParcelizer++;
                            i3 = i2;
                            i5 = 0;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
