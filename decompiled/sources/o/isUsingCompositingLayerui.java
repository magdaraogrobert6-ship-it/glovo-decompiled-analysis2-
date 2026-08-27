package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioTrack;
import android.os.Looper;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class isUsingCompositingLayerui implements getHorizontalScrollAxisRange {
    private final int IconCompatParcelizer;
    private static final byte[] $$d = {35, -71, 20, -41, -9, 62, -71, 10, 1, -5, -20, 8, -16, 14, -22, 71, -62, -8, -9, 12, -16, 1, 10, -14, 59, -68, -4, 8, -16, 14, -22, 2, -6, -4, 66, -66, 9, -27, 20, -6, 52, -34, -23, -27, 20, -6, 28, -47, 0, -1, 39, -47, -1, -6, 1, 4, -18, 16, -4, -13, 4, 62, -37, -47, 0, -1, 39, -47, -1, -6, 1, 4, -18, 16, -4, -13, 4, 19, -22, -20, 11, -16, -7, 14, -16, -3, -64};
    private static final int $$e = Constant.ERROR_ROAD_AREA_INVALID;
    private static final byte[] $$a = {86, 123, -90, 3, 7, -13, 13, 11, 2, -5, 12, -15, 7, 6, -13, 1, -19, 19, -15};
    private static final int $$b = 24;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 114
            byte[] r0 = o.isUsingCompositingLayerui.$$a
            int r1 = 10 - r6
            int r7 = 9 - r7
            byte[] r1 = new byte[r1]
            int r6 = 9 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-2)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isUsingCompositingLayerui.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 69
            int r7 = 105 - r7
            byte[] r0 = o.isUsingCompositingLayerui.$$d
            int r8 = r8 * 79
            int r8 = 82 - r8
            int r6 = r6 * 81
            int r6 = 85 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r5 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-3)
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isUsingCompositingLayerui.b(short, int, byte, java.lang.Object[]):void");
    }

    @Override // o.getHorizontalScrollAxisRange
    public void write(Object[] objArr) throws Throwable {
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(931007611);
        if (objRemoteActionCompatParcelizer == null) {
            char doubleTapTimeout = (char) (35249 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
            int deadChar = 1529 - android.view.KeyEvent.getDeadChar(0, 0);
            int packedPositionGroup = 35 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b = bArr[9];
            Object[] objArr2 = new Object[1];
            a((byte) (-b), bArr[4], (byte) (-b), objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(doubleTapTimeout, deadChar, packedPositionGroup, -408015462, false, (String) objArr2[0], null);
        }
        ((Field) objRemoteActionCompatParcelizer).set(null, objArr);
        try {
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf = Long.valueOf(jLongValue);
            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1979565800);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c = (char) (35249 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int touchSlop = 1529 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
                int mirror = 'S' - AndroidCharacter.getMirror('0');
                byte[] bArr2 = $$a;
                byte b2 = bArr2[13];
                byte b3 = bArr2[3];
                Object[] objArr3 = new Object[1];
                a(b2, b3, (byte) (b3 - 3), objArr3);
                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, touchSlop, mirror, -1523718391, false, (String) objArr3[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer2).set(null, lValueOf);
            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1434255524);
            if (objRemoteActionCompatParcelizer3 == null) {
                char windowTouchSlop = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 35249);
                int i = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1529;
                int iCombineMeasuredStates = 35 - View.combineMeasuredStates(0, 0);
                byte b4 = $$a[15];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr4 = new Object[1];
                a(b5, b5, b4, objArr4);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(windowTouchSlop, i, iCombineMeasuredStates, -2052251323, false, (String) objArr4[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer3).set(null, lValueOf2);
            int i2 = ((int[]) objArr[1])[0];
            int i3 = ((int[]) objArr[2])[0];
            if (i3 == i2) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (Looper.myLooper() == null) {
                applicationContext = null;
            }
            try {
                Object[] objArr5 = {applicationContext, Long.valueOf((((long) (-171629156)) << 32) ^ (((long) (i2 ^ i3)) & 4294967295L)), Long.valueOf(-171629154)};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[8];
                byte b7 = bArr3[48];
                Object[] objArr6 = new Object[1];
                b(b6, b7, b7, objArr6);
                Class<?> cls = Class.forName((String) objArr6[0]);
                byte b8 = bArr3[48];
                byte b9 = bArr3[8];
                Object[] objArr7 = new Object[1];
                b(b8, b9, b9, objArr7);
                cls.getMethod((String) objArr7[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr5);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Exception unused) {
            throw new RuntimeException();
        }
    }

    public isUsingCompositingLayerui(int i) {
        this.IconCompatParcelizer = i;
    }
}
