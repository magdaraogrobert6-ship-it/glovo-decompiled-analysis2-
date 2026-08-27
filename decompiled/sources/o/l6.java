package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l6 {
    private static final byte[] $$b = {112, 92, -119, 6};
    private static final int $$c = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int serializer = 0;
    private static int IconCompatParcelizer = 1;
    private static int write = 1417631099;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r7, int r8, byte r9) {
        /*
            byte[] r0 = o.l6.$$b
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 * 4
            int r7 = r7 + 112
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l6.$$d(byte, int, byte):java.lang.String");
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, 125 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), false, new char[]{65500, '\b', 6, '\t', 65530, 7, 2, '\b', 7}, objArr);
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = IconCompatParcelizer + 23;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(TextUtils.getOffsetBefore("", 0) + 1, 2 - TextUtils.lastIndexOf("", '0'), 132 - View.MeasureSpec.getMode(0), false, new char[]{6, 5, 65527}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
                int i6 = serializer + 87;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(View.MeasureSpec.getSize(0) + 21, View.combineMeasuredStates(0, 0) + 37, 118 - TextUtils.indexOf("", ""), true, new char[]{18, 5, 7, 7, 15, 65516, 65472, 65498, 20, 18, 15, 16, 16, 21, 65523, 65472, 18, 5, 4, '\t', 65522, 4, 5, 26, '\t', '\f', 1, '\t', 20, '\t', 14, '\t', 65472, 20, 15, 14, 65472}, objArr5);
                String str = (String) objArr5[0];
                int i8 = IconCompatParcelizer + 39;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    Object[] objArr6 = new Object[4];
                    objArr6[0] = objArr4;
                    objArr6[1] = str;
                    Class[] clsArr = new Class[3];
                    clsArr[0] = String.class;
                    clsArr[1] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(true);
                    method2.invoke(obj3, objArr6);
                } else {
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method3.setAccessible(true);
                    method3.invoke(obj3, str, objArr4);
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

    /* JADX WARN: Code duplicated, block: B:32:0x0154  */
    /* JADX WARN: Code duplicated, block: B:33:0x0155  */
    private static void a(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        float f;
        Throwable cause;
        int i5 = 2 % 2;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr2 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        while (true) {
            i4 = 907743172;
            f = 0.0f;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i6 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 177 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 21, 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf("", "", 0) + 20063), View.MeasureSpec.makeMeasureSpec(0, 0) + 2838, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 17, -422891995, false, $$d(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 3;
            $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr3, accesstoviewtypegyeprt8.serializer, cArr2, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            accesstoviewtypegyeprt8.write = 0;
            while (accesstoviewtypegyeprt8.write < i2) {
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 20062), TextUtils.getCapsMode("", 0, 0) + 2838, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, -422891995, false, $$d(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = 907743172;
                f = 0.0f;
            }
            int i9 = $11 + 25;
            $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
