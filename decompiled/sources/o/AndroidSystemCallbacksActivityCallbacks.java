package o;

import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSystemCallbacksActivityCallbacks {
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final getOutputTransform serializer;
    private static final byte[] $$c = {20, 111, -65, 89};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {9, 78, -50, 40, -10, 4, 65, -56, -11, 22, -20, 20, -2, 61, -67, 16, 4, -16, 5, 15, 57, -49, -11, 12, -12, 5, 8, 7, 56, -51, -10, 4, 2, 0, 3, 66, -53, -17, 23, 0, -9, -2, 13, -4, 3, 66, -30, -31, 33, -19, -11, 7, 6, -8, 2, 12, -4, 3, 45, -35, 5, 4, -6, 8, -11, 47, -49, 23, 0, -9, -2, 13, -4, 3, 2, -59};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {89, -90, 60, -111, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 13, 4, -3, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 14, -13, 9, 8, -11, 3, -17, 21, -13};
    private static final int $$b = 87;
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int[] write = {-1584646852, 254360501, -1569120957, 1228961438, -2037651543, 747383657, 885597921, 1178933372, 1538303143, -1076211434, -213837457, -1182738424, 1318562807, 372495039, 1968543017, -2008622427, 144716063, 67120893};

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 120 - r6
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = o.AndroidSystemCallbacksActivityCallbacks.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidSystemCallbacksActivityCallbacks.$$g(byte, short, short):java.lang.String");
    }

    private static void a(int i, byte b, int i2, Object[] objArr) {
        int i3 = b * 2;
        byte[] bArr = $$a;
        int i4 = 115 - i;
        int i5 = 53 - i2;
        byte[] bArr2 = new byte[i3 + 4];
        int i6 = i3 + 3;
        int i7 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (-bArr[i5]) + i4;
            i5++;
            i7 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 63
            int r8 = r8 + 36
            byte[] r0 = o.AndroidSystemCallbacksActivityCallbacks.$$d
            int r7 = r7 * 68
            int r7 = 71 - r7
            int r9 = r9 * 70
            int r9 = 74 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            int r8 = r8 + 2
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidSystemCallbacksActivityCallbacks.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static AndroidSystemCallbacksActivityCallbacks write(AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks, String str, getOutputTransform getoutputtransform, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 15;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = androidSystemCallbacksActivityCallbacks.RemoteActionCompatParcelizer;
            int i5 = i4 + 55;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        String str2 = androidSystemCallbacksActivityCallbacks.read;
        if ((i & 4) != 0) {
            getoutputtransform = androidSystemCallbacksActivityCallbacks.serializer;
        }
        str.getClass();
        return new AndroidSystemCallbacksActivityCallbacks(str, str2, getoutputtransform);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        ceilAwayFromZero ceilawayfromzero = new ceilAwayFromZero();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = write;
        int i4 = -25295696;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10;
            int i8 = i7 + 125;
            $11 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            int i9 = i7 + 71;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i2]);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) i6;
                        byte b2 = (byte) (b + 2);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getCapsMode("", i6, i6), 2751 - Process.getGidForName(""), 8 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 783164753, false, $$g(b, b2, (byte) (b2 - 3)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = -25295696;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = write;
        char c = '0';
        if (iArr5 != null) {
            int i11 = $10 + 83;
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i13]);
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - TextUtils.indexOf("", c, 0)), 2752 - android.view.KeyEvent.normalizeMetaState(0), 9 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 783164753, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                c = '0';
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        ceilawayfromzero.serializer = 0;
        int i14 = $10 + 95;
        $11 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        while (ceilawayfromzero.serializer < iArr.length) {
            cArr[0] = (char) (iArr[ceilawayfromzero.serializer] >> 16);
            cArr[1] = (char) iArr[ceilawayfromzero.serializer];
            cArr[2] = (char) (iArr[ceilawayfromzero.serializer + 1] >> 16);
            cArr[3] = (char) iArr[ceilawayfromzero.serializer + 1];
            ceilawayfromzero.RemoteActionCompatParcelizer = (cArr[0] << 16) + cArr[1];
            ceilawayfromzero.read = (cArr[2] << 16) + cArr[3];
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[i16];
                Object[] objArr4 = {ceilawayfromzero, Integer.valueOf(ceilAwayFromZero.read(ceilawayfromzero.RemoteActionCompatParcelizer)), ceilawayfromzero, ceilawayfromzero};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-98334374);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), 1758 - android.view.KeyEvent.normalizeMetaState(0), 46 - (Process.myPid() >> 22), 720611515, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
                ceilawayfromzero.read = iIntValue;
                i16++;
            }
            int i18 = ceilawayfromzero.RemoteActionCompatParcelizer;
            ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
            ceilawayfromzero.read = i18;
            ceilawayfromzero.read ^= iArr4[16];
            ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[17];
            int i19 = ceilawayfromzero.RemoteActionCompatParcelizer;
            int i20 = ceilawayfromzero.read;
            cArr[0] = (char) (ceilawayfromzero.RemoteActionCompatParcelizer >>> 16);
            cArr[1] = (char) ceilawayfromzero.RemoteActionCompatParcelizer;
            cArr[2] = (char) (ceilawayfromzero.read >>> 16);
            cArr[3] = (char) ceilawayfromzero.read;
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            cArr2[ceilawayfromzero.serializer * 2] = cArr[0];
            cArr2[(ceilawayfromzero.serializer * 2) + 1] = cArr[1];
            cArr2[(ceilawayfromzero.serializer * 2) + 2] = cArr[2];
            cArr2[(ceilawayfromzero.serializer * 2) + 3] = cArr[3];
            try {
                Object[] objArr5 = {ceilawayfromzero, ceilawayfromzero};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(82275544);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.graphics.Color.blue(0) + 1277, TextUtils.indexOf((CharSequence) "", '0') + 29, -734573255, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArr2, 0, i);
        int i21 = $10 + 69;
        $11 = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i21 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    public AndroidSystemCallbacksActivityCallbacks(String str, String str2, getOutputTransform getoutputtransform) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.serializer = getoutputtransform;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode() / af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() >> 58, 35, this.read);
        } else {
            iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.read);
        }
        int i3 = IconCompatParcelizer + 49;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PasswordData(password=", this.RemoteActionCompatParcelizer, ", placeHolder=", this.read, ", passwordState=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0511, code lost:
    
        if (r27.serializer.equals(r0.serializer) == false) goto L50;
     */
    /* JADX WARN: Type inference failed for: r2v68, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidSystemCallbacksActivityCallbacks.equals(java.lang.Object):boolean");
    }
}
