package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ImeAction {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    private static final byte[] $$c = {35, 25, 50, 53};
    private static final int $$d = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {110, -118, -94, 113, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 13, 4, -3};
    private static final int $$b = 210;
    private static int read = 0;
    private static int write = 1;
    private static int serializer = 1417631022;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = r6 + 112
            byte[] r1 = o.ImeAction.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImeAction.$$e(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 41
            int r7 = 114 - r7
            int r6 = r6 * 16
            int r6 = r6 + 4
            int r8 = r8 * 19
            int r8 = r8 + 4
            byte[] r0 = o.ImeAction.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImeAction.a(int, int, byte, java.lang.Object[]):void");
    }

    public ImeAction(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PrimaryAddress(label=", this.RemoteActionCompatParcelizer, ", content=", this.IconCompatParcelizer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PrimaryAddress(label=", this.RemoteActionCompatParcelizer, ", content=", this.IconCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = read + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImeAction) {
            ImeAction imeAction = (ImeAction) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, imeAction.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, imeAction.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i2 = write;
        int i3 = i2 + 95;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0158  */
    /* JADX WARN: Code duplicated, block: B:33:0x0159  */
    private static void b(int i, char[] cArr, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
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
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i6 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(serializer)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 176 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ImageFormat.getBitsPerPixel(0) + 22, 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 20064), ((Process.getThreadPriority(0) + 20) >> 6) + 2838, 17 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), -422891995, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 27;
                $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getOffsetAfter("", 0) + 20063), 2838 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(j) + 18, -422891995, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = 907743172;
                j = 0;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i9 = $10 + 41;
        $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0444  */
    /* JADX WARN: Code duplicated, block: B:46:0x0452  */
    /* JADX WARN: Code duplicated, block: B:49:0x0517  */
    /* JADX WARN: Code duplicated, block: B:50:0x054a  */
    public static Object[] write(int i, int i2, int i3) throws Throwable {
        int[] iArr;
        String[][] strArr;
        int i4;
        char c;
        int i5;
        int i6;
        int i7;
        int iWrite;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String[] strArr2;
        Object[] objArr;
        int i18;
        int i19 = 2 % 2;
        int i20 = read;
        int i21 = ((i20 | 11) << 1) - (i20 ^ 11);
        write = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i21 % 2 == 0) {
            iArr = new int[]{352980245, -1550932487, 54668571, 1086356894, -477064396, -30564408, -2100156241, -1326864317, -43218369, 1632099561, -491197317, 426140701, -1933191726, -781930334, 1500779937, 1550966235, -723877731, 2060794255, -432823181, 1762482581, 71991576, -1472705734, -437871410, -1117292619, -362571191, 199037765, 2013238627, -1669505291, 1848789655, -510542772, 1210287644, 1881919003, -1779707935, -1902185705, 1845164434, -2051949706, 1546852760, -666487397, -314689525, -567924238, -2135893242, 939288706, -1460498586, 1571306488, -669651558, 1265983311, -383118945, -1591818210, 741937310, 1338626074};
            strArr = new String[0][];
        } else {
            iArr = new int[]{352980245, -1550932487, 54668571, 1086356894, -477064396, -30564408, -2100156241, -1326864317, -43218369, 1632099561, -491197317, 426140701, -1933191726, -781930334, 1500779937, 1550966235, -723877731, 2060794255, -432823181, 1762482581, 71991576, -1472705734, -437871410, -1117292619, -362571191, 199037765, 2013238627, -1669505291, 1848789655, -510542772, 1210287644, 1881919003, -1779707935, -1902185705, 1845164434, -2051949706, 1546852760, -666487397, -314689525, -567924238, -2135893242, 939288706, -1460498586, 1571306488, -669651558, 1265983311, -383118945, -1591818210, 741937310, 1338626074};
            strArr = new String[1][];
        }
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i22 = read + 121;
        write = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i23 = i22 % 2;
        int i24 = ((~iCurrentTimeMillis) & 343337308) | ((-343337309) & iCurrentTimeMillis);
        try {
            Object[] objArr2 = {Integer.valueOf((~(i & i24)) & (i | i24)), iArr, Integer.valueOf(i2), strArr};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1391739713);
            if (objRemoteActionCompatParcelizer == null) {
                char c2 = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 56288);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 579;
                int iMyTid = (Process.myTid() >> 22) + 33;
                byte b = $$a[6];
                byte b2 = (byte) (b - 1);
                Object[] objArr3 = new Object[1];
                a(b2, b2, b, objArr3);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, iIndexOf, iMyTid, -2111544672, false, (String) objArr3[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
            }
            long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue();
            long j = 1914169229;
            long j2 = -115;
            long j3 = i;
            long j4 = -1;
            long j5 = (j2 * j) + (j2 * jLongValue) + (((long) (-116)) * ((((j3 ^ j4) | j) | jLongValue) ^ j4));
            long j6 = 116;
            long j7 = jLongValue ^ j4;
            long j8 = j5 + ((j | j3) * j6) + (j6 * ((j4 ^ (j3 | j7)) | (((j ^ j4) | j7) ^ j4))) + ((long) (-2087486769));
            int i25 = ~((-168465873) | i);
            int i26 = ~i;
            int i27 = ((int) (j8 >> 32)) & ((-2071535760) + ((i25 | (~((-1098916361) | i26))) * 497) + (((~((-169844179) | i26)) | 1378306 | (~((-1098916361) | i))) * 497));
            int iMyTid2 = Process.myTid();
            int i28 = ~iMyTid2;
            int i29 = ((int) j8) & ((-501357939) + (((~(1047253820 | i28)) | (-1065341822)) * DateTimeConstants.HOURS_PER_WEEK) + ((~(1065341821 | iMyTid2)) * DateTimeConstants.HOURS_PER_WEEK) + (((~(iMyTid2 | (-18088002))) | (~(i28 | 389972589)) | 675369232) * DateTimeConstants.HOURS_PER_WEEK));
            int i30 = (i29 & i27) | (i27 ^ i29);
            int i31 = ((~i30) & i24) | ((~i24) & i30);
            int i32 = 16;
            if (i31 != i) {
                int i33 = write;
                int i34 = (i33 ^ 77) + ((i33 & 77) << 1);
                read = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i34 % 2 != 0) {
                    strArr2 = strArr[0];
                    objArr = new Object[5];
                    objArr[0] = new int[0];
                } else {
                    strArr2 = strArr[0];
                    objArr = new Object[4];
                    objArr[1] = new int[1];
                }
                int i35 = (i33 & 17) + (i33 | 17);
                read = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i35 % 2 != 0) {
                    objArr[2] = new int[0];
                    objArr[5] = new int[0];
                    i32 = 115;
                } else {
                    objArr[2] = new int[1];
                    objArr[3] = new int[1];
                }
                ((int[]) objArr[2])[0] = i;
                ((int[]) objArr[1])[0] = i31;
                int iMyPid = Process.myPid();
                int i36 = ~iMyPid;
                int i37 = (-1292576490) + ((iMyPid | 431038960) * (-859)) + (((~(iMyPid | (-25166209))) | (~(431038960 | i36))) * 859) + (((~((-1099320202) | i36)) | 1074153993) * 859);
                int i38 = (i37 & i32) + (i37 | i32);
                int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int i39 = ((i38 * (-559)) - (~(i3 * 561))) - 1;
                int i40 = ~iWrite2;
                int i41 = write + 105;
                int i42 = i41 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i42;
                if (i41 % 2 != 0) {
                    int i43 = i39 * (~((i40 ^ i38) | (i40 & i38))) * (-560);
                    int i44 = ~i3;
                    int i45 = (i44 & i38) | (i44 ^ i38);
                    i18 = i43 % ((-560) << (~((iWrite2 & i45) | (i45 ^ iWrite2))));
                } else {
                    int i46 = (i39 - (~((~((i40 ^ i38) | (i40 & i38))) * (-560)))) - 1;
                    int i47 = (~i3) | i38;
                    i18 = i46 + ((~((iWrite2 & i47) | (i47 ^ iWrite2))) * (-560));
                }
                int i48 = ~i38;
                int i49 = ~((i48 & i3) | (i48 ^ i3));
                int i50 = ~((i3 & i40) | (i40 ^ i3));
                int i51 = -(-(560 * ((i49 & i50) | (i49 ^ i50))));
                int i52 = ((i18 | i51) << 1) - (i51 ^ i18);
                int i53 = i52 << 13;
                int i54 = (i53 | i52) & (~(i52 & i53));
                int i55 = i42 + 73;
                write = i55 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i56 = i55 % 2;
                int i57 = i54 ^ (i54 >>> 17);
                ((int[]) objArr[3])[0] = i57 ^ (i57 << 5);
                objArr[0] = strArr2;
                return objArr;
            }
            try {
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                int i58 = 25 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i59 = -android.graphics.Color.rgb(0, 0, 0);
                int i60 = (i59 ^ (-16777050)) + ((i59 & (-16777050)) << 1);
                Object[] objArr4 = new Object[1];
                b((tapTimeout ^ 24) + ((tapTimeout & 24) << 1), new char[]{2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534}, i58, i60, true, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int i61 = (tapTimeout2 * 236) + 4239;
                int i62 = ~tapTimeout2;
                int i63 = ((~((~iWrite3) | i62)) | 9) * (-235);
                int i64 = (i61 & i63) + (i61 | i63);
                int i65 = ~((i62 ^ iWrite3) | (i62 & iWrite3));
                int i66 = -(-(((i65 & 9) | (i65 ^ 9)) * (-470)));
                int i67 = ((i64 | i66) << 1) - (i66 ^ i64);
                int i68 = read;
                int i69 = (i68 & 17) + (i68 | 17);
                write = i69 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i70 = i69 % 2;
                int i71 = ~((tapTimeout2 & (-10)) | ((-10) ^ tapTimeout2));
                int i72 = (i62 ^ 9) | (i62 & 9);
                int i73 = ~((iWrite3 & i72) | (i72 ^ iWrite3));
                int i74 = 235 * ((i71 & i73) | (i71 ^ i73));
                int i75 = (i67 & i74) + (i74 | i67);
                char[] cArr = {6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6};
                int i76 = -android.graphics.Color.red(0);
                int i77 = (i76 ^ 18) + ((i76 & 18) << 1);
                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                int iWrite4 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int i78 = edgeSlop * 868;
                int i79 = (i78 & 150164) + (i78 | 150164);
                int i80 = ~edgeSlop;
                int i81 = ~iWrite4;
                int i82 = ~((i80 ^ i81) | (i80 & i81));
                int i83 = read;
                int i84 = (i83 & 33) + (i83 | 33);
                int i85 = i84 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i85;
                if (i84 % 2 == 0) {
                    int i86 = ~iWrite4;
                    int i87 = ~(((-174) ^ i86) | ((-174) & i86));
                    i16 = i79 * ((-867) << ((i82 ^ i87) | (i82 & i87)));
                    int i88 = ~((i80 ^ (-174)) | (i80 & (-174)));
                    int i89 = ~edgeSlop;
                    i17 = i88 | (~((i89 & iWrite4) | (i89 ^ iWrite4)));
                } else {
                    int i90 = ~(((-174) ^ i81) | ((-174) & i81));
                    int i91 = -(-(((i82 ^ i90) | (i82 & i90)) * (-867)));
                    i16 = (i79 & i91) + (i91 | i79);
                    int i92 = ~((i80 ^ (-174)) | (i80 & (-174)));
                    int i93 = ~((~edgeSlop) | iWrite4);
                    i17 = (i92 & i93) | (i92 ^ i93);
                }
                int i94 = ~((-174) | iWrite4);
                int i95 = (-1734) * ((i17 & i94) | (i17 ^ i94));
                int i96 = (i16 & i95) + (i95 | i16);
                int i97 = (i80 ^ (-174)) | (i80 & (-174));
                int i98 = ~((i97 & i81) | (i97 ^ i81));
                int i99 = (~edgeSlop) | 173;
                int i100 = ~((i99 & iWrite4) | (i99 ^ iWrite4));
                int i101 = (i98 & i100) | (i98 ^ i100);
                int i102 = (i85 ^ 93) + ((i85 & 93) << 1);
                read = i102 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i103 = i102 % 2;
                int i104 = ((-174) & edgeSlop) | ((-174) ^ edgeSlop);
                int i105 = ~((i104 & iWrite4) | (i104 ^ iWrite4));
                int i106 = 867 * ((i101 & i105) | (i101 ^ i105));
                int i107 = (i96 ^ i106) + ((i96 & i106) << 1);
                Object[] objArr5 = new Object[1];
                b(i75, cArr, i77, i107, true, objArr5);
                if (cls.getMethod((String) objArr5[0], new Class[0]).invoke(null, null) != null) {
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-219743933);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iIndexOf2 = 422 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i108 = 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b3 = $$a[6];
                        byte b4 = b3;
                        Object[] objArr6 = new Object[1];
                        a(b3, b4, (byte) (b4 - 1), objArr6);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveSizeAndState, iIndexOf2, i108, 574019746, false, (String) objArr6[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer2).getInt(null) != 0) {
                        int i109 = read + 65;
                        write = i109 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i110 = i109 % 2;
                        i4 = i ^ 9;
                    }
                    if (i4 != i) {
                        int i111 = write + 101;
                        read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        c = 2;
                        int i112 = i111 % 2;
                        i5 = 0;
                        i6 = 16;
                    } else {
                        c = 2;
                        i5 = 0;
                        i6 = 0;
                    }
                    String[] strArr3 = new String[i5];
                    Object[] objArr7 = new Object[4];
                    int[] iArr2 = new int[1];
                    objArr7[1] = iArr2;
                    int[] iArr3 = new int[1];
                    objArr7[c] = iArr3;
                    objArr7[3] = new int[1];
                    iArr3[i5] = i;
                    iArr2[i5] = i4;
                    int i113 = (((~(i | (-1342095063))) | 1153831029) * 262) + 432743665 + (((~((-1342095063) | i26)) | 1153831029) * 262);
                    int iWrite5 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                    int i114 = i6 * 595;
                    int i115 = i113 * (-1187);
                    int i116 = ((i114 | i115) << 1) - (i114 ^ i115);
                    int i117 = ~i6;
                    int i118 = ~((i117 ^ i113) | (i117 & i113));
                    int i119 = ~iWrite5;
                    int i120 = ~((i119 ^ i113) | (i119 & i113));
                    int i121 = i116 + (((i118 & i120) | (i118 ^ i120)) * (-1188));
                    int i122 = ~((i117 & i113) | (i117 ^ i113));
                    int i123 = ~i113;
                    int i124 = read;
                    int i125 = ((i124 | 53) << 1) - (i124 ^ 53);
                    write = i125 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i126 = i125 % 2;
                    int i127 = ~((i123 ^ iWrite5) | (i123 & iWrite5));
                    int i128 = (i121 - (~(594 * (((i122 & i127) | (i122 ^ i127)) | (~(i119 | i6)))))) - 1;
                    int i129 = ~((i123 ^ i119) | (i123 & i119));
                    int i130 = ~i113;
                    int i131 = ~((i130 & i6) | (i130 ^ i6));
                    int i132 = ~iWrite5;
                    int i133 = -(-(((i131 & i129) | (i129 ^ i131) | (~((i132 & i6) | (i132 ^ i6)))) * 594));
                    i7 = (i128 & i133) + (i133 | i128);
                    iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                    i8 = ((i7 * 483) - (~(i3 * 242))) - 1;
                    i9 = ~i7;
                    i10 = ~i3;
                    i11 = ~((i9 ^ i10) | (i9 & i10));
                    int i134 = write;
                    i12 = ((i134 | 13) << 1) - (i134 ^ 13);
                    read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        int i135 = ~iWrite;
                        int i136 = ~((i9 ^ i135) | (i9 & i135));
                        int i137 = i8 << ((-242) - (~(-(-((i136 & i11) | (i11 ^ i136))))));
                        int i138 = -(-((i7 ^ i3) | (i7 & i3)));
                        i13 = i137 - ((i138 ^ (-482)) + ((i138 & (-482)) << 1));
                        int i139 = ~((i10 ^ i7) | (i10 & i7));
                        int i140 = ~i7;
                        int i141 = (i135 & i140) | (i140 ^ i135);
                        int i142 = ~((i141 & i3) | (i141 ^ i3));
                        i14 = i139 ^ i142;
                        i15 = i142 & i139;
                    } else {
                        int i143 = ~iWrite;
                        int i144 = ~((i143 & i9) | (i9 ^ i143));
                        int i145 = -(-(((i144 & i11) | (i11 ^ i144)) * (-241)));
                        int i146 = (i8 ^ i145) + ((i8 & i145) << 1);
                        int i147 = ((i7 ^ i3) | (i7 & i3)) * (-482);
                        i13 = ((i146 | i147) << 1) - (i147 ^ i146);
                        int i148 = ~i3;
                        int i149 = ~((i7 & i148) | (i148 ^ i7));
                        int i150 = ~iWrite;
                        int i151 = (i150 & i9) | (i9 ^ i150);
                        int i152 = ~((i151 & i3) | (i151 ^ i3));
                        i14 = i149 ^ i152;
                        i15 = i152 & i149;
                    }
                    int i153 = -(-(241 * (i15 | i14)));
                    int i154 = ((i13 | i153) << 1) - (i153 ^ i13);
                    int i155 = (i154 << 13) ^ i154;
                    int i156 = i155 ^ (i155 >>> 17);
                    int i157 = i156 << 5;
                    ((int[]) objArr7[3])[0] = (i156 | i157) & (~(i156 & i157));
                    objArr7[0] = strArr3;
                    return objArr7;
                }
                int i158 = read + 49;
                write = i158 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i159 = i158 % 2;
            } catch (Exception unused) {
            }
            i4 = i;
            if (i4 != i) {
                int i1110 = write + 101;
                read = i1110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                c = 2;
                int i1111 = i1110 % 2;
                i5 = 0;
                i6 = 16;
            } else {
                c = 2;
                i5 = 0;
                i6 = 0;
            }
            String[] strArr4 = new String[i5];
            Object[] objArr8 = new Object[4];
            int[] iArr4 = new int[1];
            objArr8[1] = iArr4;
            int[] iArr5 = new int[1];
            objArr8[c] = iArr5;
            objArr8[3] = new int[1];
            iArr5[i5] = i;
            iArr4[i5] = i4;
            int i1112 = (((~(i | (-1342095063))) | 1153831029) * 262) + 432743665 + (((~((-1342095063) | i26)) | 1153831029) * 262);
            int iWrite6 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            int i1113 = i6 * 595;
            int i1114 = i1112 * (-1187);
            int i1115 = ((i1113 | i1114) << 1) - (i1113 ^ i1114);
            int i1116 = ~i6;
            int i1117 = ~((i1116 ^ i1112) | (i1116 & i1112));
            int i1118 = ~iWrite6;
            int i1210 = ~((i1118 ^ i1112) | (i1118 & i1112));
            int i1211 = i1115 + (((i1117 & i1210) | (i1117 ^ i1210)) * (-1188));
            int i1212 = ~((i1116 & i1112) | (i1116 ^ i1112));
            int i1213 = ~i1112;
            int i1214 = read;
            int i1215 = ((i1214 | 53) << 1) - (i1214 ^ 53);
            write = i1215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i1216 = i1215 % 2;
            int i1217 = ~((i1213 ^ iWrite6) | (i1213 & iWrite6));
            int i1218 = (i1211 - (~(594 * (((i1212 & i1217) | (i1212 ^ i1217)) | (~(i1118 | i6)))))) - 1;
            int i1219 = ~((i1213 ^ i1118) | (i1213 & i1118));
            int i1310 = ~i1112;
            int i1311 = ~((i1310 & i6) | (i1310 ^ i6));
            int i1312 = ~iWrite6;
            int i1313 = -(-(((i1311 & i1219) | (i1219 ^ i1311) | (~((i1312 & i6) | (i1312 ^ i6)))) * 594));
            i7 = (i1218 & i1313) + (i1313 | i1218);
            iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            i8 = ((i7 * 483) - (~(i3 * 242))) - 1;
            i9 = ~i7;
            i10 = ~i3;
            i11 = ~((i9 ^ i10) | (i9 & i10));
            int i1314 = write;
            i12 = ((i1314 | 13) << 1) - (i1314 ^ 13);
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i1315 = ~iWrite;
                int i1316 = ~((i9 ^ i1315) | (i9 & i1315));
                int i1317 = i8 << ((-242) - (~(-(-((i1316 & i11) | (i11 ^ i1316))))));
                int i1318 = -(-((i7 ^ i3) | (i7 & i3)));
                i13 = i1317 - ((i1318 ^ (-482)) + ((i1318 & (-482)) << 1));
                int i1319 = ~((i10 ^ i7) | (i10 & i7));
                int i1410 = ~i7;
                int i1411 = (i1315 & i1410) | (i1410 ^ i1315);
                int i1412 = ~((i1411 & i3) | (i1411 ^ i3));
                i14 = i1319 ^ i1412;
                i15 = i1412 & i1319;
            } else {
                int i1413 = ~iWrite;
                int i1414 = ~((i1413 & i9) | (i9 ^ i1413));
                int i1415 = -(-(((i1414 & i11) | (i11 ^ i1414)) * (-241)));
                int i1416 = (i8 ^ i1415) + ((i8 & i1415) << 1);
                int i1417 = ((i7 ^ i3) | (i7 & i3)) * (-482);
                i13 = ((i1416 | i1417) << 1) - (i1417 ^ i1416);
                int i1418 = ~i3;
                int i1419 = ~((i7 & i1418) | (i1418 ^ i7));
                int i1510 = ~iWrite;
                int i1511 = (i1510 & i9) | (i9 ^ i1510);
                int i1512 = ~((i1511 & i3) | (i1511 ^ i3));
                i14 = i1419 ^ i1512;
                i15 = i1512 & i1419;
            }
            int i1513 = -(-(241 * (i15 | i14)));
            int i1514 = ((i13 | i1513) << 1) - (i1513 ^ i13);
            int i1515 = (i1514 << 13) ^ i1514;
            int i1516 = i1515 ^ (i1515 >>> 17);
            int i1517 = i1516 << 5;
            ((int[]) objArr8[3])[0] = (i1516 | i1517) & (~(i1516 & i1517));
            objArr8[0] = strArr4;
            return objArr8;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
