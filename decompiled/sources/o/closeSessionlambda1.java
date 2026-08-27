package o;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.mapbox.api.directions.v5.models.C$AutoValue_RouteOptions;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class closeSessionlambda1 implements Parcelable.Creator {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {82, 119, 68, 102, -14, 13, -9, -8, 11, -3, 17, -21, 13, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -13, -4, 3, 3, -7};
    private static final int $$b = 94;
    private static int read = 0;
    private static int IconCompatParcelizer = 1;
    private static long write = 2474163271902580411L;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 115 - r7
            int r6 = r6 + 4
            int r0 = r5 + 3
            byte[] r1 = o.closeSessionlambda1.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 2
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.closeSessionlambda1.b(byte, int, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new StartWorkingNavAction.StartInstantShift[i];
        }
        StartWorkingNavAction.StartInstantShift[] startInstantShiftArr = new StartWorkingNavAction.StartInstantShift[i];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        StartWorkingNavAction.StartInstantShift startInstantShift = new StartWorkingNavAction.StartInstantShift(parcel.readInt());
        int i2 = read + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return startInstantShift;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        accesstoViewVelocity accesstoviewvelocity = new accesstoViewVelocity();
        accesstoviewvelocity.IconCompatParcelizer = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i3 = $10 + 107;
            $11 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = accesstoviewvelocity.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[accesstoviewvelocity.write]), accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1166805757);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (45251 - android.view.KeyEvent.getDeadChar(0, 0)), 2179 - android.view.KeyEvent.normalizeMetaState(0), 14 - android.view.KeyEvent.keyCodeFromString(""), 1789121762, false, com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 7879248456549226868L);
                Object[] objArr3 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.view.KeyEvent.normalizeMetaState(0), 231 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20, 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i6 = $10 + 77;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
                try {
                    Object[] objArr4 = {accesstoviewvelocity, accesstoviewvelocity};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 231, 21 - android.view.KeyEvent.getDeadChar(0, 0), 107586304, false, "e", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    int i7 = 42 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
                Object[] objArr5 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 231, 20 - TextUtils.lastIndexOf("", '0', 0), 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:117:0x0771  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x021a A[EXC_TOP_SPLITTER, PHI: r20
  0x021a: PHI (r20v3 ??) = (r20v22 ??), (r20v23 ??) binds: [B:32:0x0206, B:30:0x0200] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0202 A[PHI: r20
  0x0202: PHI (r20v2 java.lang.String) = (r20v30 java.lang.String), (r20v31 java.lang.String) binds: [B:24:0x01a3, B:30:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0208  */
    /* JADX WARN: Code duplicated, block: B:35:0x0213  */
    /* JADX WARN: Code duplicated, block: B:39:0x021e A[Catch: Exception -> 0x05b7, TRY_LEAVE, TryCatch #5 {Exception -> 0x05b7, blocks: (B:37:0x021a, B:39:0x021e, B:47:0x0269, B:49:0x0282, B:48:0x0277), top: B:136:0x021a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0232  */
    /* JADX WARN: Code duplicated, block: B:43:0x0239  */
    /* JADX WARN: Code duplicated, block: B:46:0x0262  */
    /* JADX WARN: Code duplicated, block: B:48:0x0277 A[Catch: Exception -> 0x05b7, TryCatch #5 {Exception -> 0x05b7, blocks: (B:37:0x021a, B:39:0x021e, B:47:0x0269, B:49:0x0282, B:48:0x0277), top: B:136:0x021a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x02cd A[Catch: all -> 0x0364, TryCatch #1 {all -> 0x0364, blocks: (B:52:0x02c0, B:54:0x02cd, B:55:0x0309), top: B:129:0x02c0, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x036f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0380 A[Catch: all -> 0x0497, TryCatch #2 {all -> 0x0497, blocks: (B:64:0x0373, B:66:0x0380, B:67:0x03c0), top: B:131:0x0373, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x04a0 A[Catch: Exception -> 0x05b9, TRY_LEAVE, TryCatch #3 {Exception -> 0x05b9, blocks: (B:70:0x0427, B:69:0x03d1, B:73:0x0498, B:75:0x049e, B:76:0x049f, B:59:0x0367, B:61:0x036d, B:62:0x036e, B:77:0x04a0, B:81:0x04e6, B:83:0x04f9, B:88:0x058b, B:94:0x05af, B:96:0x05b5, B:97:0x05b6, B:82:0x04ea, B:52:0x02c0, B:54:0x02cd, B:55:0x0309, B:64:0x0373, B:66:0x0380, B:67:0x03c0, B:84:0x052e, B:86:0x053b, B:87:0x0584), top: B:133:0x021c, inners: #1, #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x04da  */
    /* JADX WARN: Code duplicated, block: B:82:0x04ea A[Catch: Exception -> 0x05b9, TryCatch #3 {Exception -> 0x05b9, blocks: (B:70:0x0427, B:69:0x03d1, B:73:0x0498, B:75:0x049e, B:76:0x049f, B:59:0x0367, B:61:0x036d, B:62:0x036e, B:77:0x04a0, B:81:0x04e6, B:83:0x04f9, B:88:0x058b, B:94:0x05af, B:96:0x05b5, B:97:0x05b6, B:82:0x04ea, B:52:0x02c0, B:54:0x02cd, B:55:0x0309, B:64:0x0373, B:66:0x0380, B:67:0x03c0, B:84:0x052e, B:86:0x053b, B:87:0x0584), top: B:133:0x021c, inners: #1, #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x053b A[Catch: all -> 0x05ae, TryCatch #6 {all -> 0x05ae, blocks: (B:84:0x052e, B:86:0x053b, B:87:0x0584), top: B:138:0x052e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0592  */
    /* JADX WARN: Code duplicated, block: B:92:0x059d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public static Object[] RemoteActionCompatParcelizer(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        ?? r3;
        int i7;
        Object[] objArr;
        int i8;
        Object obj;
        int i9;
        int i10;
        ?? r20;
        int i11;
        ?? r21;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        Object[] objArr2;
        Object objRemoteActionCompatParcelizer;
        int keyRepeatDelay;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String str2;
        int i27;
        Object objRemoteActionCompatParcelizer2;
        ?? r22;
        long j;
        int i28;
        Object objRemoteActionCompatParcelizer3;
        String str3;
        String str4;
        int i29 = 2 % 2;
        int i30 = read;
        int i31 = ((i30 | 7) << 1) - (i30 ^ 7);
        int i32 = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i32;
        if (i31 % 2 == 0) {
            throw null;
        }
        int i33 = ((i32 | 93) << 1) - (i32 ^ 93);
        int i34 = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i34;
        int i35 = i33 % 2;
        if (context != null) {
            int i36 = i34 + 47;
            IconCompatParcelizer = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i37 = i36 % 2;
            try {
                Object[] objArr3 = new Object[1];
                a(34231 - TextUtils.getTrimmedLength(""), new char[]{6062, 37398, 7365, 34456, 380, 35637, 13793, 49120, 14868, 42191, 11911, 43366, 21310, 56810, 18361, 49752, 19708, 63111, 29055, 64302, 26086, 61364, 27137}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                int iMyTid = Process.myTid() >> 22;
                Object[] objArr4 = new Object[1];
                a((iMyTid & 6421) + (iMyTid | 6421), new char[]{6056, 3775, 9617, 23729, 29675, 27350, 33245, 47157, 57092, 62995, 60777, 1089, 15196, 20912, 18592, 28570, 34553, 48581}, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                int i38 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr5 = new Object[1];
                a(((i38 | 43206) << 1) - (i38 ^ 43206), new char[]{6062, 48998, 17957, 60904, 46268, 23621, 58113, 35472, 20884, 63839, 32871, 22326, 65278, 34234, 11609, 62536, 39887, 8853, 51743, 37195, 14387, 53228, 38585, 15943, 50436, 27841, 13197, 56155, 25188, 2346, 53460, 26552, 3913, 54791}, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                int i39 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr6 = new Object[1];
                a((i39 ^ 26839) + ((i39 & 26839) << 1), new char[]{6057, 32628, 50688, 11565, 46304}, objArr6);
                int i40 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                int i41 = (i & (-2)) | ((~i) & 1);
                int i42 = -i40;
                int i43 = ((i40 & i42) | (i40 ^ i42)) >> 31;
                int i44 = (~i43) & i;
                int i45 = i43 & i41;
                int i46 = (i45 & i44) | (i44 ^ i45);
                int i47 = (~(i & i)) & (i | i);
                int i48 = -i47;
                int i49 = ((i47 & i48) | (i47 ^ i48)) >> 31;
                int i50 = (i46 & (~i49)) | (i49 & i);
                int i51 = IconCompatParcelizer + 117;
                read = i51 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i52 = i51 % 2;
                i4 = i50;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2120081762);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cBlue = (char) android.graphics.Color.blue(0);
                int maximumDrawingCacheSize = 2193 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i53 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                byte[] bArr = $$a;
                byte b = bArr[10];
                byte b2 = bArr[33];
                Object[] objArr7 = new Object[1];
                b(b, b2, (byte) (b2 | 34), objArr7);
                str4 = (String) objArr7[0];
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cBlue, maximumDrawingCacheSize, i53, -1366441853, false, str4, new Class[0]);
            }
            Set set = (Set) ((Method) objRemoteActionCompatParcelizer4).invoke(null, null);
            int i54 = IconCompatParcelizer;
            int i55 = (i54 ^ 33) + ((i54 & 33) << 1);
            read = i55 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i56 = i55 % 2;
            Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-298760278);
            String str5 = str4;
            if (objRemoteActionCompatParcelizer5 == null) {
                char cRgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                int scrollBarFadeDuration = 2193 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                byte[] bArr2 = $$a;
                byte b3 = (byte) (bArr2[13] - 1);
                Object[] objArr8 = new Object[1];
                b(b3, (byte) (b3 + 2), (byte) (bArr2[38] - 1), objArr8);
                str5 = null;
                objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRgb, scrollBarFadeDuration, trimmedLength, 1054959179, false, (String) objArr8[0], null);
            }
            String str6 = str5;
            if (set.contains(((Field) objRemoteActionCompatParcelizer5).get(null))) {
                r20 = str6;
                if (Build.VERSION.SDK_INT == 30) {
                    i5 = read + 49;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i57 = 60 / 0;
                    }
                    i6 = i;
                    r3 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                int i58 = read;
                                i20 = (i58 & 113) + (i58 | 113);
                                int i59 = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                IconCompatParcelizer = i59;
                                if (i20 % 2 == 0) {
                                    i21 = (keyRepeatDelay * 755) >> (-21054633);
                                } else {
                                    int i60 = keyRepeatDelay * 755;
                                    i21 = ((i60 | (-21054633)) << 1) - (i60 ^ (-21054633));
                                }
                                int i61 = ~(((keyRepeatDelay ^ (-1)) & 27961) | (keyRepeatDelay ^ (-27962)));
                                i22 = ~keyRepeatDelay;
                                int i62 = ~((i22 ^ i) | (i22 & i));
                                i23 = (i61 & i62) | (i61 ^ i62);
                                i24 = i59 + 51;
                                read = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i24 % 2 != 0) {
                                    int i63 = ~(i | 27961);
                                    int i64 = -((-754) % ((i63 & i23) | (i23 ^ i63)));
                                    i25 = (i21 & i64) + (i64 | i21);
                                    int i65 = ~keyRepeatDelay;
                                    i26 = (i65 & 27961) | (i65 ^ 27961);
                                } else {
                                    int i66 = ((~(i | 27961)) | i23) * (-754);
                                    i25 = (i21 & i66) + (i66 | i21);
                                    i26 = i22 | 27961;
                                }
                                int i67 = ~((i26 & i) | (i26 ^ i));
                                int i68 = ~i;
                                int i69 = i68 | keyRepeatDelay;
                                int i70 = ~((i69 & 27961) | (i69 ^ 27961));
                                int i71 = -(-(((i67 & i70) | (i67 ^ i70)) * (-754)));
                                Object[] objArr9 = new Object[1];
                                a((((i25 & i71) + (i71 | i25)) - (~(((~keyRepeatDelay) | i68) * 754))) - 1, new char[]{6112, 31379, 52681, 20487, 41732, 13755, 39159, 60201, 32371, 49377, 21401, 42704, 2312, 40014, 61180, 29180, 50234, 22372, 47544, 3219, 40924, 57859, 30027, 51132, 10994, 48496, 'w', 37551}, objArr9);
                                str2 = (String) objArr9[0];
                                int i72 = read;
                                i27 = (i72 & 71) + (i72 | 71);
                                IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i27 % 2 == 0) {
                                    try {
                                        Object[] objArr10 = {str2};
                                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                        r20 = r20;
                                        if (objRemoteActionCompatParcelizer2 == null) {
                                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                            int maximumDrawingCacheSize2 = 2645 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                                            byte b4 = $$a[15];
                                            Object[] objArr11 = new Object[1];
                                            b((byte) (-b4), (byte) 54, (byte) (-b4), objArr11);
                                            Class[] clsArr = {String.class};
                                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(capsMode, maximumDrawingCacheSize2, offsetAfter, 1171920412, false, (String) objArr11[0], clsArr);
                                            r20 = clsArr;
                                        }
                                        long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr10)).longValue();
                                        long j2 = 161076600;
                                        long j3 = -754;
                                        r22 = i4;
                                        long j4 = -1;
                                        long j5 = j2 ^ j4;
                                        long j6 = j5 | jLongValue;
                                        long j7 = i;
                                        long j8 = (((long) 755) * j2) + (((long) (-753)) * jLongValue) + (((j6 ^ j4) | ((j5 | j7) ^ j4) | ((jLongValue | j7) ^ j4)) * j3);
                                        long j9 = (j6 | j7) ^ j4;
                                        long j10 = j7 ^ j4;
                                        j = j8 + (j3 * (j9 | (((j10 | j2) | jLongValue) ^ j4))) + (((long) 754) * (j5 | j10)) + ((long) 932374050);
                                        i28 = (int) (j >> 28);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r20 = i4;
                                    try {
                                        Object[] objArr12 = {str2};
                                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                        if (objRemoteActionCompatParcelizer3 == null) {
                                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                            int i73 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                                            int iArgb = 22 - android.graphics.Color.argb(0, 0, 0, 0);
                                            byte b5 = $$a[15];
                                            Object[] objArr13 = new Object[1];
                                            b((byte) (-b5), (byte) 54, (byte) (-b5), objArr13);
                                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority, i73, iArgb, 1171920412, false, (String) objArr13[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr12)).longValue();
                                        long j11 = -107741341;
                                        long j12 = -1;
                                        long j13 = j11 ^ j12;
                                        long jNextInt = new Random().nextInt();
                                        long j14 = jNextInt ^ j12;
                                        long j15 = (((long) 905) * j11) + (((long) (-903)) * jLongValue2) + (((long) (-1808)) * (((j13 | jNextInt) ^ j12) | ((j14 | jLongValue2) ^ j12)));
                                        long j16 = 904;
                                        long j17 = jLongValue2 ^ j12;
                                        long j18 = j14 | j11;
                                        j = ((long) 1201191991) + j15 + (((((j13 | j17) | jNextInt) ^ j12) | ((j18 | jLongValue2) ^ j12)) * j16) + (j16 * (((j13 | jLongValue2) ^ j12) | ((j17 | jNextInt) ^ j12) | (j18 ^ j12)));
                                        i28 = (int) (j >> 32);
                                        r22 = r20;
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i74 = 994605886 + (((~(1694039261 | elapsedCpuTime)) | android.R.string.accessibility_system_action_screenshot_label | (~((-1163701624) | elapsedCpuTime))) * (-754));
                                int i75 = ~((-17039651) | elapsedCpuTime);
                                int i76 = ~elapsedCpuTime;
                                int i77 = i28 & (i74 + ((i75 | (~((-1146661974) | i76))) * (-754)) + ((i76 | 1694039261) * 754));
                                int i78 = ((int) j) & (1788176917 + ((i68 | 1096089892) * (-192)) + (((~((-947935450) | i68)) | 813715544) * (-384)) + (((~((-813715545) | i)) | (~(i68 | (-134219906))) | (~(2044025341 | i))) * 192));
                                i11 = (i77 & i78) | (i77 ^ i78);
                                int i79 = read + 83;
                                IconCompatParcelizer = i79 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i80 = i79 % 2;
                                r21 = r22;
                            } else {
                                r20 = i4;
                                Object[] objArr14 = new Object[1];
                                a(29008 - (~(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{6142}, objArr14);
                                str = (String) objArr14[0];
                                i16 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i81 = i16 * 628;
                                i17 = ((i81 | 5172208) << 1) - (i81 ^ 5172208);
                                i18 = IconCompatParcelizer + 109;
                                read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i18 % 2 != 0) {
                                    int i82 = (i ^ 8236) | (i & 8236);
                                    int i83 = ~i16;
                                    i19 = i17 >>> ((-627) / ((i82 & i83) | (i82 ^ i83)));
                                } else {
                                    int i84 = i | 8236;
                                    int i85 = ~i16;
                                    int i86 = ((i84 & i85) | (i84 ^ i85)) * (-627);
                                    i19 = ((i86 & i17) << 1) + (i17 ^ i86);
                                }
                                int i87 = -(-((-627) * ((~(((-8237) & i) | ((-8237) ^ i))) | i16)));
                                int i88 = ((i19 | i87) << 1) - (i19 ^ i87);
                                int i89 = ~i;
                                int i90 = ~((i89 & 8236) | (i89 ^ 8236));
                                int i91 = ~(i16 | i);
                                Object[] objArr15 = new Object[1];
                                a(i88 + (((i91 & i90) | (i90 ^ i91)) * 627), new char[]{6077, 14221, 22459, 30508, 38686, 46924, 54964, 63123, 5824, 13883, 22127, 30284, 38326}, objArr15);
                                try {
                                    objArr2 = new Object[]{(String) objArr15[0]};
                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 58126);
                                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0) + 947;
                                        int minimumFlingVelocity = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27;
                                        byte b6 = $$a[15];
                                        byte b7 = (byte) (b6 + 1);
                                        Object[] objArr16 = new Object[1];
                                        b(b7, (byte) (b7 | 57), (byte) (-b6), objArr16);
                                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec, deadChar, minimumFlingVelocity, 2024488889, false, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2))) {
                                        int i92 = IconCompatParcelizer + 11;
                                        read = i92 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i93 = i92 % 2;
                                        i11 = 0;
                                        r21 = r20;
                                    } else {
                                        int i94 = IconCompatParcelizer;
                                        int i95 = (i94 ^ 23) + ((i94 & 23) << 1);
                                        read = i95 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i96 = i95 % 2;
                                        i11 = 1;
                                        r21 = r20;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause4 = th4.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th4;
                                }
                            }
                        } catch (Exception unused) {
                            i11 = 0;
                            r21 = r20;
                        }
                    } catch (Exception unused2) {
                        r20 = i4;
                    }
                    i12 = i ^ 10;
                    int i97 = -i11;
                    i13 = ((i11 & i97) | (i11 ^ i97)) >> 31;
                    int i98 = read;
                    i14 = (i98 ^ 101) + ((i98 & 101) << 1);
                    i15 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i15;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i99 = (i13 & i12) | ((~i13) & i);
                    int i100 = i2 & 32;
                    int i101 = ((i15 | 125) << 1) - (i15 ^ 125);
                    int i102 = i101 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i102;
                    int i103 = i101 % 2;
                    int i104 = (i100 | (-i100)) >> 31;
                    int i105 = i102 + 123;
                    int i106 = i105 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i106;
                    int i107 = i105 % 2;
                    i6 = (i99 & (~i104)) | (i104 & i);
                    int i108 = i106 + 43;
                    read = i108 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i109 = i108 % 2;
                    r3 = r21;
                }
            } else {
                int i110 = IconCompatParcelizer;
                int i111 = ((i110 | 75) << 1) - (i110 ^ 75);
                read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i112 = i111 % 2;
                Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109429865);
                if (objRemoteActionCompatParcelizer6 == null) {
                    str3 = str5;
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2194;
                    int i113 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[27];
                    byte b9 = bArr3[15];
                    Object[] objArr17 = new Object[1];
                    b(b8, b9, (byte) (b9 + 1), objArr17);
                    str3 = null;
                    objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cCombineMeasuredStates, iLastIndexOf, i113, 1829720182, false, (String) objArr17[0], null);
                }
                str3 = str5;
                r20 = str3;
                str6 = str3;
                if (set.contains(((Field) objRemoteActionCompatParcelizer6).get(null))) {
                    r20 = str6;
                    if (Build.VERSION.SDK_INT == 30) {
                        i5 = read + 49;
                        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            int i510 = 60 / 0;
                        }
                        i6 = i;
                        r3 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                            int i511 = read;
                            i20 = (i511 & 113) + (i511 | 113);
                            int i512 = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            IconCompatParcelizer = i512;
                            if (i20 % 2 == 0) {
                                i21 = (keyRepeatDelay * 755) >> (-21054633);
                            } else {
                                int i610 = keyRepeatDelay * 755;
                                i21 = ((i610 | (-21054633)) << 1) - (i610 ^ (-21054633));
                            }
                            int i611 = ~(((keyRepeatDelay ^ (-1)) & 27961) | (keyRepeatDelay ^ (-27962)));
                            i22 = ~keyRepeatDelay;
                            int i612 = ~((i22 ^ i) | (i22 & i));
                            i23 = (i611 & i612) | (i611 ^ i612);
                            i24 = i512 + 51;
                            read = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i24 % 2 != 0) {
                                int i613 = ~(i | 27961);
                                int i614 = -((-754) % ((i613 & i23) | (i23 ^ i613)));
                                i25 = (i21 & i614) + (i614 | i21);
                                int i615 = ~keyRepeatDelay;
                                i26 = (i615 & 27961) | (i615 ^ 27961);
                            } else {
                                int i616 = ((~(i | 27961)) | i23) * (-754);
                                i25 = (i21 & i616) + (i616 | i21);
                                i26 = i22 | 27961;
                            }
                            int i617 = ~((i26 & i) | (i26 ^ i));
                            int i618 = ~i;
                            int i619 = i618 | keyRepeatDelay;
                            int i710 = ~((i619 & 27961) | (i619 ^ 27961));
                            int i711 = -(-(((i617 & i710) | (i617 ^ i710)) * (-754)));
                            Object[] objArr18 = new Object[1];
                            a((((i25 & i711) + (i711 | i25)) - (~(((~keyRepeatDelay) | i618) * 754))) - 1, new char[]{6112, 31379, 52681, 20487, 41732, 13755, 39159, 60201, 32371, 49377, 21401, 42704, 2312, 40014, 61180, 29180, 50234, 22372, 47544, 3219, 40924, 57859, 30027, 51132, 10994, 48496, 'w', 37551}, objArr18);
                            str2 = (String) objArr18[0];
                            int i712 = read;
                            i27 = (i712 & 71) + (i712 | 71);
                            IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i27 % 2 == 0) {
                                Object[] objArr19 = {str2};
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                r20 = r20;
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                    int maximumDrawingCacheSize3 = 2645 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 22;
                                    byte b10 = $$a[15];
                                    Object[] objArr110 = new Object[1];
                                    b((byte) (-b10), (byte) 54, (byte) (-b10), objArr110);
                                    Class[] clsArr2 = {String.class};
                                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(capsMode2, maximumDrawingCacheSize3, offsetAfter2, 1171920412, false, (String) objArr110[0], clsArr2);
                                    r20 = clsArr2;
                                }
                                long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr19)).longValue();
                                long j19 = 161076600;
                                long j20 = -754;
                                r22 = i4;
                                long j21 = -1;
                                long j22 = j19 ^ j21;
                                long j23 = j22 | jLongValue3;
                                long j24 = i;
                                long j25 = (((long) 755) * j19) + (((long) (-753)) * jLongValue3) + (((j23 ^ j21) | ((j22 | j24) ^ j21) | ((jLongValue3 | j24) ^ j21)) * j20);
                                long j26 = (j23 | j24) ^ j21;
                                long j110 = j24 ^ j21;
                                j = j25 + (j20 * (j26 | (((j110 | j19) | jLongValue3) ^ j21))) + (((long) 754) * (j22 | j110)) + ((long) 932374050);
                                i28 = (int) (j >> 28);
                            } else {
                                r20 = i4;
                                Object[] objArr111 = {str2};
                                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                    int i713 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                                    int iArgb2 = 22 - android.graphics.Color.argb(0, 0, 0, 0);
                                    byte b11 = $$a[15];
                                    Object[] objArr112 = new Object[1];
                                    b((byte) (-b11), (byte) 54, (byte) (-b11), objArr112);
                                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority2, i713, iArgb2, 1171920412, false, (String) objArr112[0], new Class[]{String.class});
                                }
                                long jLongValue4 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr111)).longValue();
                                long j111 = -107741341;
                                long j112 = -1;
                                long j113 = j111 ^ j112;
                                long jNextInt2 = new Random().nextInt();
                                long j114 = jNextInt2 ^ j112;
                                long j115 = (((long) 905) * j111) + (((long) (-903)) * jLongValue4) + (((long) (-1808)) * (((j113 | jNextInt2) ^ j112) | ((j114 | jLongValue4) ^ j112)));
                                long j116 = 904;
                                long j117 = jLongValue4 ^ j112;
                                long j118 = j114 | j111;
                                j = ((long) 1201191991) + j115 + (((((j113 | j117) | jNextInt2) ^ j112) | ((j118 | jLongValue4) ^ j112)) * j116) + (j116 * (((j113 | jLongValue4) ^ j112) | ((j117 | jNextInt2) ^ j112) | (j118 ^ j112)));
                                i28 = (int) (j >> 32);
                                r22 = r20;
                            }
                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                            int i714 = 994605886 + (((~(1694039261 | elapsedCpuTime2)) | android.R.string.accessibility_system_action_screenshot_label | (~((-1163701624) | elapsedCpuTime2))) * (-754));
                            int i715 = ~((-17039651) | elapsedCpuTime2);
                            int i716 = ~elapsedCpuTime2;
                            int i717 = i28 & (i714 + ((i715 | (~((-1146661974) | i716))) * (-754)) + ((i716 | 1694039261) * 754));
                            int i718 = ((int) j) & (1788176917 + ((i618 | 1096089892) * (-192)) + (((~((-947935450) | i618)) | 813715544) * (-384)) + (((~((-813715545) | i)) | (~(i618 | (-134219906))) | (~(2044025341 | i))) * 192));
                            i11 = (i717 & i718) | (i717 ^ i718);
                            int i719 = read + 83;
                            IconCompatParcelizer = i719 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i810 = i719 % 2;
                            r21 = r22;
                        } else {
                            r20 = i4;
                            Object[] objArr113 = new Object[1];
                            a(29008 - (~(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{6142}, objArr113);
                            str = (String) objArr113[0];
                            i16 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i811 = i16 * 628;
                            i17 = ((i811 | 5172208) << 1) - (i811 ^ 5172208);
                            i18 = IconCompatParcelizer + 109;
                            read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i18 % 2 != 0) {
                                int i812 = (i ^ 8236) | (i & 8236);
                                int i813 = ~i16;
                                i19 = i17 >>> ((-627) / ((i812 & i813) | (i812 ^ i813)));
                            } else {
                                int i814 = i | 8236;
                                int i815 = ~i16;
                                int i816 = ((i814 & i815) | (i814 ^ i815)) * (-627);
                                i19 = ((i816 & i17) << 1) + (i17 ^ i816);
                            }
                            int i817 = -(-((-627) * ((~(((-8237) & i) | ((-8237) ^ i))) | i16)));
                            int i818 = ((i19 | i817) << 1) - (i19 ^ i817);
                            int i819 = ~i;
                            int i910 = ~((i819 & 8236) | (i819 ^ 8236));
                            int i911 = ~(i16 | i);
                            Object[] objArr114 = new Object[1];
                            a(i818 + (((i911 & i910) | (i910 ^ i911)) * 627), new char[]{6077, 14221, 22459, 30508, 38686, 46924, 54964, 63123, 5824, 13883, 22127, 30284, 38326}, objArr114);
                            objArr2 = new Object[]{(String) objArr114[0]};
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                            if (objRemoteActionCompatParcelizer == null) {
                                char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 58126);
                                int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0) + 947;
                                int minimumFlingVelocity2 = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27;
                                byte b12 = $$a[15];
                                byte b13 = (byte) (b12 + 1);
                                Object[] objArr115 = new Object[1];
                                b(b13, (byte) (b13 | 57), (byte) (-b12), objArr115);
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec2, deadChar2, minimumFlingVelocity2, 2024488889, false, (String) objArr115[0], new Class[]{String.class});
                            }
                            if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2))) {
                                int i912 = IconCompatParcelizer + 11;
                                read = i912 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i913 = i912 % 2;
                                i11 = 0;
                                r21 = r20;
                            } else {
                                int i914 = IconCompatParcelizer;
                                int i915 = (i914 ^ 23) + ((i914 & 23) << 1);
                                read = i915 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i916 = i915 % 2;
                                i11 = 1;
                                r21 = r20;
                            }
                        }
                        i12 = i ^ 10;
                        int i917 = -i11;
                        i13 = ((i11 & i917) | (i11 ^ i917)) >> 31;
                        int i918 = read;
                        i14 = (i918 ^ 101) + ((i918 & 101) << 1);
                        i15 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        IconCompatParcelizer = i15;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        int i919 = (i13 & i12) | ((~i13) & i);
                        int i1010 = i2 & 32;
                        int i1011 = ((i15 | 125) << 1) - (i15 ^ 125);
                        int i1012 = i1011 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        read = i1012;
                        int i1013 = i1011 % 2;
                        int i1014 = (i1010 | (-i1010)) >> 31;
                        int i1015 = i1012 + 123;
                        int i1016 = i1015 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        IconCompatParcelizer = i1016;
                        int i1017 = i1015 % 2;
                        i6 = (i919 & (~i1014)) | (i1014 & i);
                        int i1018 = i1016 + 43;
                        read = i1018 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i1019 = i1018 % 2;
                        r3 = r21;
                    }
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i513 = read;
                        i20 = (i513 & 113) + (i513 | 113);
                        int i514 = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        IconCompatParcelizer = i514;
                        if (i20 % 2 == 0) {
                            i21 = (keyRepeatDelay * 755) >> (-21054633);
                        } else {
                            int i6110 = keyRepeatDelay * 755;
                            i21 = ((i6110 | (-21054633)) << 1) - (i6110 ^ (-21054633));
                        }
                        int i6111 = ~(((keyRepeatDelay ^ (-1)) & 27961) | (keyRepeatDelay ^ (-27962)));
                        i22 = ~keyRepeatDelay;
                        int i6112 = ~((i22 ^ i) | (i22 & i));
                        i23 = (i6111 & i6112) | (i6111 ^ i6112);
                        i24 = i514 + 51;
                        read = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i24 % 2 != 0) {
                            int i6113 = ~(i | 27961);
                            int i6114 = -((-754) % ((i6113 & i23) | (i23 ^ i6113)));
                            i25 = (i21 & i6114) + (i6114 | i21);
                            int i6115 = ~keyRepeatDelay;
                            i26 = (i6115 & 27961) | (i6115 ^ 27961);
                        } else {
                            int i6116 = ((~(i | 27961)) | i23) * (-754);
                            i25 = (i21 & i6116) + (i6116 | i21);
                            i26 = i22 | 27961;
                        }
                        int i6117 = ~((i26 & i) | (i26 ^ i));
                        int i6118 = ~i;
                        int i6119 = i6118 | keyRepeatDelay;
                        int i7110 = ~((i6119 & 27961) | (i6119 ^ 27961));
                        int i7111 = -(-(((i6117 & i7110) | (i6117 ^ i7110)) * (-754)));
                        Object[] objArr116 = new Object[1];
                        a((((i25 & i7111) + (i7111 | i25)) - (~(((~keyRepeatDelay) | i6118) * 754))) - 1, new char[]{6112, 31379, 52681, 20487, 41732, 13755, 39159, 60201, 32371, 49377, 21401, 42704, 2312, 40014, 61180, 29180, 50234, 22372, 47544, 3219, 40924, 57859, 30027, 51132, 10994, 48496, 'w', 37551}, objArr116);
                        str2 = (String) objArr116[0];
                        int i7112 = read;
                        i27 = (i7112 & 71) + (i7112 | 71);
                        IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i27 % 2 == 0) {
                            Object[] objArr117 = {str2};
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                            r20 = r20;
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                                int maximumDrawingCacheSize4 = 2645 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 22;
                                byte b14 = $$a[15];
                                Object[] objArr118 = new Object[1];
                                b((byte) (-b14), (byte) 54, (byte) (-b14), objArr118);
                                Class[] clsArr3 = {String.class};
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(capsMode3, maximumDrawingCacheSize4, offsetAfter3, 1171920412, false, (String) objArr118[0], clsArr3);
                                r20 = clsArr3;
                            }
                            long jLongValue5 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr117)).longValue();
                            long j119 = 161076600;
                            long j27 = -754;
                            r22 = i4;
                            long j28 = -1;
                            long j29 = j119 ^ j28;
                            long j210 = j29 | jLongValue5;
                            long j211 = i;
                            long j212 = (((long) 755) * j119) + (((long) (-753)) * jLongValue5) + (((j210 ^ j28) | ((j29 | j211) ^ j28) | ((jLongValue5 | j211) ^ j28)) * j27);
                            long j213 = (j210 | j211) ^ j28;
                            long j1110 = j211 ^ j28;
                            j = j212 + (j27 * (j213 | (((j1110 | j119) | jLongValue5) ^ j28))) + (((long) 754) * (j29 | j1110)) + ((long) 932374050);
                            i28 = (int) (j >> 28);
                        } else {
                            r20 = i4;
                            Object[] objArr119 = {str2};
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int i7113 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                                int iArgb3 = 22 - android.graphics.Color.argb(0, 0, 0, 0);
                                byte b15 = $$a[15];
                                Object[] objArr1110 = new Object[1];
                                b((byte) (-b15), (byte) 54, (byte) (-b15), objArr1110);
                                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority3, i7113, iArgb3, 1171920412, false, (String) objArr1110[0], new Class[]{String.class});
                            }
                            long jLongValue6 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr119)).longValue();
                            long j1111 = -107741341;
                            long j1112 = -1;
                            long j1113 = j1111 ^ j1112;
                            long jNextInt3 = new Random().nextInt();
                            long j1114 = jNextInt3 ^ j1112;
                            long j1115 = (((long) 905) * j1111) + (((long) (-903)) * jLongValue6) + (((long) (-1808)) * (((j1113 | jNextInt3) ^ j1112) | ((j1114 | jLongValue6) ^ j1112)));
                            long j1116 = 904;
                            long j1117 = jLongValue6 ^ j1112;
                            long j1118 = j1114 | j1111;
                            j = ((long) 1201191991) + j1115 + (((((j1113 | j1117) | jNextInt3) ^ j1112) | ((j1118 | jLongValue6) ^ j1112)) * j1116) + (j1116 * (((j1113 | jLongValue6) ^ j1112) | ((j1117 | jNextInt3) ^ j1112) | (j1118 ^ j1112)));
                            i28 = (int) (j >> 32);
                            r22 = r20;
                        }
                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                        int i7114 = 994605886 + (((~(1694039261 | elapsedCpuTime3)) | android.R.string.accessibility_system_action_screenshot_label | (~((-1163701624) | elapsedCpuTime3))) * (-754));
                        int i7115 = ~((-17039651) | elapsedCpuTime3);
                        int i7116 = ~elapsedCpuTime3;
                        int i7117 = i28 & (i7114 + ((i7115 | (~((-1146661974) | i7116))) * (-754)) + ((i7116 | 1694039261) * 754));
                        int i7118 = ((int) j) & (1788176917 + ((i6118 | 1096089892) * (-192)) + (((~((-947935450) | i6118)) | 813715544) * (-384)) + (((~((-813715545) | i)) | (~(i6118 | (-134219906))) | (~(2044025341 | i))) * 192));
                        i11 = (i7117 & i7118) | (i7117 ^ i7118);
                        int i7119 = read + 83;
                        IconCompatParcelizer = i7119 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8110 = i7119 % 2;
                        r21 = r22;
                    } else {
                        r20 = i4;
                        Object[] objArr1111 = new Object[1];
                        a(29008 - (~(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{6142}, objArr1111);
                        str = (String) objArr1111[0];
                        i16 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        int i8111 = i16 * 628;
                        i17 = ((i8111 | 5172208) << 1) - (i8111 ^ 5172208);
                        i18 = IconCompatParcelizer + 109;
                        read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i18 % 2 != 0) {
                            int i8112 = (i ^ 8236) | (i & 8236);
                            int i8113 = ~i16;
                            i19 = i17 >>> ((-627) / ((i8112 & i8113) | (i8112 ^ i8113)));
                        } else {
                            int i8114 = i | 8236;
                            int i8115 = ~i16;
                            int i8116 = ((i8114 & i8115) | (i8114 ^ i8115)) * (-627);
                            i19 = ((i8116 & i17) << 1) + (i17 ^ i8116);
                        }
                        int i8117 = -(-((-627) * ((~(((-8237) & i) | ((-8237) ^ i))) | i16)));
                        int i8118 = ((i19 | i8117) << 1) - (i19 ^ i8117);
                        int i8119 = ~i;
                        int i9110 = ~((i8119 & 8236) | (i8119 ^ 8236));
                        int i9111 = ~(i16 | i);
                        Object[] objArr1112 = new Object[1];
                        a(i8118 + (((i9111 & i9110) | (i9110 ^ i9111)) * 627), new char[]{6077, 14221, 22459, 30508, 38686, 46924, 54964, 63123, 5824, 13883, 22127, 30284, 38326}, objArr1112);
                        objArr2 = new Object[]{(String) objArr1112[0]};
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                        if (objRemoteActionCompatParcelizer == null) {
                            char cMakeMeasureSpec3 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 58126);
                            int deadChar3 = android.view.KeyEvent.getDeadChar(0, 0) + 947;
                            int minimumFlingVelocity3 = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27;
                            byte b16 = $$a[15];
                            byte b17 = (byte) (b16 + 1);
                            Object[] objArr1113 = new Object[1];
                            b(b17, (byte) (b17 | 57), (byte) (-b16), objArr1113);
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec3, deadChar3, minimumFlingVelocity3, 2024488889, false, (String) objArr1113[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2))) {
                            int i9112 = IconCompatParcelizer + 11;
                            read = i9112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9113 = i9112 % 2;
                            i11 = 0;
                            r21 = r20;
                        } else {
                            int i9114 = IconCompatParcelizer;
                            int i9115 = (i9114 ^ 23) + ((i9114 & 23) << 1);
                            read = i9115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9116 = i9115 % 2;
                            i11 = 1;
                            r21 = r20;
                        }
                    }
                    i12 = i ^ 10;
                    int i9117 = -i11;
                    i13 = ((i11 & i9117) | (i11 ^ i9117)) >> 31;
                    int i9118 = read;
                    i14 = (i9118 ^ 101) + ((i9118 & 101) << 1);
                    i15 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i15;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i9119 = (i13 & i12) | ((~i13) & i);
                    int i10110 = i2 & 32;
                    int i10111 = ((i15 | 125) << 1) - (i15 ^ 125);
                    int i10112 = i10111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i10112;
                    int i10113 = i10111 % 2;
                    int i10114 = (i10110 | (-i10110)) >> 31;
                    int i10115 = i10112 + 123;
                    int i10116 = i10115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i10116;
                    int i10117 = i10115 % 2;
                    i6 = (i9119 & (~i10114)) | (i10114 & i);
                    int i10118 = i10116 + 43;
                    read = i10118 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10119 = i10118 % 2;
                    r3 = r21;
                }
            }
            int i114 = (~r3) & i;
            int i115 = ~i;
            int i116 = i114 | (r3 & i115);
            int i117 = -i116;
            int i118 = ((i116 & i117) | (i116 ^ i117)) >> 31;
            int i119 = read;
            int i120 = i119 + 45;
            IconCompatParcelizer = i120 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i120 % 2 == 0) {
                int i121 = i6 & (~i118);
                int i122 = r3 & i118;
                i7 = (i121 & i122) | (i121 ^ i122);
                objArr = new Object[2];
                objArr[1] = new int[0];
                objArr[5] = new int[0];
                objArr[3] = new int[1];
            } else {
                i7 = (i6 & (~i118)) | (r3 & i118);
                objArr = new Object[4];
                objArr[0] = new int[1];
                objArr[2] = new int[1];
                objArr[3] = new int[1];
            }
            int i123 = (i119 & 43) + (i119 | 43);
            IconCompatParcelizer = i123 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i123 % 2 == 0) {
                int i124 = i ^ i7;
                int i125 = -i124;
                i8 = (((i124 & i125) | (i124 ^ i125)) >> 10) & 4;
                obj = objArr[4];
            } else {
                int i126 = (~(i & i7)) & (i | i7);
                i8 = ((i126 | (-i126)) >> 31) & 16;
                obj = objArr[2];
            }
            ((int[]) obj)[0] = i;
            ((int[]) objArr[0])[0] = i7;
            objArr[1] = null;
            int i127 = (-1943102123) + (((~((-39769884) | i115)) | 39109634 | (~((-1609886947) | i115))) * (-1136)) + (((~((-39769884) | i)) | (~((-1609886947) | i)) | (~(1610547195 | i115))) * (-568)) + (((~(39769883 | i115)) | (~(1609886946 | i115)) | (~((-39109635) | i))) * 568);
            int i128 = (i8 * 491) + (i127 * (-489));
            int i129 = ~i8;
            int i130 = ~i127;
            int i131 = (i129 ^ i130) | (i129 & i130);
            int i132 = ((i115 & i131) | (i131 ^ i115)) * (-490);
            int i133 = (i128 & i132) + (i128 | i132);
            int i134 = ~i127;
            int i135 = ~((i134 & i8) | (i134 ^ i8));
            int i136 = ~(i | i130);
            int i137 = -(-(((i135 & i136) | (i135 ^ i136)) * 490));
            int i138 = (i133 & i137) + (i137 | i133);
            int i139 = i129 * 490;
            int i140 = (i138 ^ i139) + ((i138 & i139) << 1);
            int iSerializer = C$AutoValue_RouteOptions.AnonymousClass1.serializer();
            int i141 = (i140 * (-167)) + (i3 * (-167));
            int i142 = read;
            int i143 = (i142 & 75) + (i142 | 75);
            IconCompatParcelizer = i143 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i144 = i143 % 2;
            int i145 = ~i140;
            if (i144 == 0) {
                i10 = ~i3;
                int i146 = i141 >> (336 >> ((~(i145 | i10)) | (~((~i3) | iSerializer))));
                int i147 = ~((i3 & i140) | (i140 ^ i3));
                int i148 = ~((i140 ^ iSerializer) | (i140 & iSerializer));
                i9 = i146 / ((-168) % ((i147 & i148) | (i147 ^ i148)));
            } else {
                int i149 = ~i3;
                int i150 = ~((i145 & i149) | (i145 ^ i149));
                int i151 = ~(i149 | iSerializer);
                int i152 = -(-(((i150 & i151) | (i150 ^ i151)) * 336));
                int i153 = (i141 ^ i152) + ((i141 & i152) << 1);
                int i154 = ~(i140 | i3);
                int i155 = ~((i140 ^ iSerializer) | (i140 & iSerializer));
                i9 = (((i154 & i155) | (i154 ^ i155)) * (-168)) + i153;
                i10 = ~i3;
            }
            int i156 = DateTimeConstants.HOURS_PER_WEEK * ((~(i140 | (iSerializer ^ (-1)))) | i10);
            int i157 = (i9 & i156) + (i156 | i9);
            int i158 = i157 ^ (i157 << 13);
            int i159 = i158 >>> 17;
            int i160 = ((~i158) & i159) | ((~i159) & i158);
            int i161 = i160 << 5;
            ((int[]) objArr[3])[0] = ((~i160) & i161) | ((~i161) & i160);
            return objArr;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }
}
