package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: renamed from: o.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0209u extends AbstractC0210v {
    public final g6 IconCompatParcelizer;
    private static final byte[] $$b = {95, 96, 101, 94};
    private static final int $$c = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int write = 0;
    private static int read = 1;
    private static int RemoteActionCompatParcelizer = 1417631049;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r5, short r6, int r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 112
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = o.C0209u.$$b
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
        L29:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0209u.$$d(byte, short, int):java.lang.String");
    }

    public C0209u(g6 g6Var) {
        g6Var.getClass();
        this.IconCompatParcelizer = g6Var;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(8 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 10, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 138, false, new char[]{6, '\t', 65530, 7, 2, '\b', 7, 65500, '\b'}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(TextUtils.indexOf("", "", 0, 0) + 1, 2 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.graphics.Color.rgb(0, 0, 0) + 16777362, false, new char[]{6, 5, 65527}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
                int i4 = write + 69;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.graphics.Color.blue(0) + 37, 132 - (Process.myTid() >> 22), true, new char[]{'\f', 1, '\t', 20, '\t', 14, '\t', 65472, 20, 15, 14, 65472, 18, 5, 7, 7, 15, 65516, 65472, 65498, 20, 18, 15, 16, 16, 21, 65523, 65472, 18, 5, 4, '\t', 65522, 4, 5, 26, '\t'}, objArr5);
                String str = (String) objArr5[0];
                int i6 = read + 105;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    Object[] objArr6 = new Object[3];
                    objArr6[1] = objArr4;
                    objArr6[1] = str;
                    Class[] clsArr = new Class[3];
                    clsArr[1] = String.class;
                    clsArr[1] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(false);
                    method2.invoke(obj3, objArr6);
                } else {
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method3.setAccessible(true);
                    method3.invoke(obj3, str, objArr4);
                }
            }
            int i7 = write + 119;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 16 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 81;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UpdateSafeArea(safeArea=" + this.IconCompatParcelizer + ")";
        int i2 = write + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof C0209u)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((C0209u) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i5 = read + 21;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = write + 9;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = i3 + 25;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i8 % 2 == 0;
        int i9 = i3 + 71;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return z;
    }

    private static void a(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr2 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        while (true) {
            i4 = 907743172;
            j = 0;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            int i6 = $10 + 47;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i8 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), 176 - View.resolveSizeAndState(0, 0, 0), 21 - View.getDefaultSize(0, 0), 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20063 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2838, 16 - ImageFormat.getBitsPerPixel(0), -422891995, false, $$d(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i9 = $11 + 67;
                $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr3, accesstoviewtypegyeprt8.serializer, cArr2, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (!(!z)) {
            int i11 = $11 + 21;
            $10 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            accesstoviewtypegyeprt8.write = 0;
            while (accesstoviewtypegyeprt8.write < i2) {
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                try {
                    Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20064 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), 2838 - TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0, 0) + 18, -422891995, false, $$d(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    i4 = 907743172;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
