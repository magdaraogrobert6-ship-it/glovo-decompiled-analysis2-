package o;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tc {
    private static final byte[] $$b = {40, 23, 5, -32};
    private static final int $$c = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int serializer = 0;
    private static int read = 1;
    private static long RemoteActionCompatParcelizer = -2325661253920387920L;
    private static int write = -658032778;
    private static char IconCompatParcelizer = 14198;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = o.tc.$$b
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = 111 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tc.$$d(byte, int, byte):java.lang.String");
    }

    public abstract String IconCompatParcelizer();

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract String read();

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(1417916201 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.green(0), new char[]{10720, 33711, 16980, 12238}, new char[]{48070, 36072, 38352, 16640}, new char[]{38820, 39623, 64055, 33506, 4598, 56825, 16713, 2655, 26697}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i4 = read + 23;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(TextUtils.getOffsetBefore("", 0) + 1161511761, (char) (64115 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), new char[]{20910, 15171, 29253, 30458}, new char[]{48070, 36072, 38352, 16640}, new char[]{9795, 65093, 1773}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
                int i6 = serializer + 75;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(android.graphics.Color.blue(0) - 932436335, (char) android.view.KeyEvent.normalizeMetaState(0), new char[]{37245, 27686, 5064, 8298}, new char[]{48070, 36072, 38352, 16640}, new char[]{41230, 40302, 52944, 43665, 45107, 60483, 31679, 15286, 11690, 26314, 20761, 58077, 55287, 21063, 8018, 48693, 49508, 59070, 25569, 43228, 15097, 55074, 21186, 20688, 47731, 42375, 38293, 9758, 44647, 43794, 11253, 23364, 44131, 39666, 46976, 38156, 51046}, objArr5);
                String str = (String) objArr5[0];
                int i8 = serializer + 25;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, str, objArr4);
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
        int i6 = $10 + 49;
        $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i8 = $10 + 29;
            $11 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    char cArgb = (char) android.graphics.Color.argb(i5, i5, i5, i5);
                    int iIndexOf = 230 - TextUtils.indexOf((CharSequence) "", '0', i5, i5);
                    int modifierMetaStateMask = 20 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cArgb, iIndexOf, modifierMetaStateMask, 1436720535, false, "j", clsArr);
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int windowTouchSlop = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2546;
                    int iLastIndexOf = 29 - TextUtils.lastIndexOf("", '0', i5, i5);
                    byte b = (byte) i5;
                    String str$$d = $$d((byte) 7, b, b);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, windowTouchSlop, iLastIndexOf, -73045399, false, str$$d, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i5] = accesstooffsetmowrbkg;
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Drawable.resolveOpacity(i5, i5), 886 - TextUtils.indexOf((CharSequence) "", '0'), 61 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -562850980, false, $$d(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cArgb2 = (char) (65450 - android.graphics.Color.argb(0, 0, 0, 0));
                    int mirror = 1292 - AndroidCharacter.getMirror('0');
                    int iLastIndexOf2 = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 3);
                    String str$$d2 = $$d(b4, b5, b5);
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cArgb2, mirror, iLastIndexOf2, 1854554309, false, str$$d2, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) write) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) IconCompatParcelizer) ^ (-7009568347796326538L)))));
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
        }
        objArr[0] = new String(cArr6);
    }
}
