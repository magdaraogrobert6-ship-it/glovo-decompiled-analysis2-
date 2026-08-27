package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.graphics.Fields;
import com.braze.Constants;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.QueryListener;
import o.accesstoViewTypeGyEprt8;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public class JosGetNoticeResp extends JosBaseResp {

    @Packed
    private Intent noticeIntent;
    private static final byte[] $$b = {87, -111, 66, 14};
    private static final int $$c = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int write = 0;
    private static int serializer = 1;
    private static int read = 1417631019;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(int r7, int r8, byte r9) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = com.huawei.hms.support.api.entity.core.JosGetNoticeResp.$$b
            int r8 = r8 * 2
            int r8 = 112 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.api.entity.core.JosGetNoticeResp.$$d(int, int, byte):java.lang.String");
    }

    public void setNoticeIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 27;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.noticeIntent = intent;
            int i4 = 39 / 0;
        } else {
            this.noticeIntent = intent;
        }
        int i5 = i2 + 103;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 81;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(6 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, 174 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, new char[]{7, 65530, '\t', 6, '\b', 65500, 7, '\b', 2}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(3 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 3, TextUtils.lastIndexOf("", '0') + 181, false, new char[]{5, 65527, 6}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 37 - Color.blue(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 166, false, new char[]{20, 65472, '\t', 14, '\t', 20, '\t', 1, '\f', '\t', 26, 5, 4, 65522, '\t', 4, 5, 18, 65472, 65523, 21, 16, 16, 15, 18, 20, 65498, 65472, 65516, 15, 7, 7, 5, 18, 65472, 14, 15}, objArr5);
                String str = (String) objArr5[0];
                int i4 = write + 61;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    Class[] clsArr = new Class[5];
                    clsArr[0] = String.class;
                    clsArr[1] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(false);
                    method2.invoke(obj3, str, objArr4);
                } else {
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method3.setAccessible(true);
                    method3.invoke(obj3, str, objArr4);
                }
            }
            int i5 = serializer + 55;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public Intent getNoticeIntent() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intent intent = (Intent) get(this.noticeIntent);
        int i3 = serializer + 81;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x016c  */
    /* JADX WARN: Code duplicated, block: B:36:0x016d  */
    private static void a(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr3 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        while (true) {
            i4 = 907743172;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            int i6 = $10 + 115;
            $11 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr3[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i8 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.MeasureSpec.getMode(0), 176 - View.resolveSize(0, 0), 21 - (ViewConfiguration.getPressedStateDuration() >> 16), 1932485450, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20063 - (ViewConfiguration.getScrollBarSize() >> 8)), View.getDefaultSize(0, 0) + 2838, 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -422891995, false, $$d(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i9 = $10 + 115;
            $11 = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr4, accesstoviewtypegyeprt8.serializer, cArr3, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (z) {
            int i11 = $10 + 37;
            $11 = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                cArr2 = new char[i2];
                accesstoviewtypegyeprt8.write = 1;
            } else {
                cArr2 = new char[i2];
                accesstoviewtypegyeprt8.write = 0;
            }
            while (accesstoviewtypegyeprt8.write < i2) {
                cArr2[accesstoviewtypegyeprt8.write] = cArr3[(i2 - accesstoviewtypegyeprt8.write) - 1];
                Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20063 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 2838, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -422891995, false, $$d(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = 907743172;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static <T> T get(T t) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 119;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return t;
    }
}
