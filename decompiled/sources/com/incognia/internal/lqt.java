package com.incognia.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.braze.Constants;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import o.NestedScrollInteropConnection;
import o.rememberNestedScrollInteropConnection;
import o.setCarryoverInAppMessage;
import o.setFontSizeR2X_6o;
import o.setFontStylemLjRB2g;
import o.setLocaleList;
import o.stopNestedScrolls;

/* JADX INFO: loaded from: classes2.dex */
public final class lqt {
    private static char[] IconCompatParcelizer;
    private static byte RemoteActionCompatParcelizer;
    private static long read;
    private static long serializer;
    public final AtomicReference BGx = new AtomicReference();
    private static final byte[] $$a = {39, 22, -92, -36};
    private static final int $$b = 191;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    private static final byte[] write = {78, 109, -55, 24, -6, 10, -13, 7, -8, 4, 7, 50, -67, -3, 2, -2, 10, -14, -3, 10, 3, -15, -14, 9, -15, 2, 5, 4, 53, -54, -13, 0, -7, 14, -10, -7, 69, -69, 12, -15, 68, -20, -51, -1, 13, -16, 38, -21, -14, 12, -7, 1, -14, -2, 10, -10};
    private static final int MediaMetadataCompat = 245;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            int r5 = r5 * 2
            int r5 = 98 - r5
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = com.incognia.internal.lqt.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.lqt.$$c(short, short, int):java.lang.String");
    }

    public lqt(k kVar, Context context, VOk vOk) throws Throwable {
        Properties properties;
        String string;
        int iIntValue;
        if (vOk == null) {
            Object obj = null;
            try {
                AssetManager assets = context.getAssets();
                byte[] bArr = write;
                Object[] objArr = new Object[1];
                a(bArr[44], bArr[9], bArr[43], objArr);
                try {
                    Object[] objArr2 = {(String) objArr[0]};
                    byte b = bArr[31];
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 | 17), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a((byte) 28, bArr[7], (byte) (MediaMetadataCompat & 56), objArr4);
                    InputStream inputStreamWrite = write((InputStream) cls.getMethod((String) objArr4[0], String.class).invoke(assets, objArr2), 9 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-8, 89, 81, -119, -105, 90, -103, 43, 80, -82, 23, 119, -50, 62, -47, -126}, ((byte) KeyEvent.getModifierMetaStateMask()) - 1824922545);
                    properties = new Properties();
                    properties.load(inputStreamWrite);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable unused) {
                properties = null;
            }
            if (properties == null) {
                int i = RatingCompat;
                int i2 = i + 17;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = i + 105;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                vOk = null;
            } else {
                Object obj2 = properties.get("APP_ID");
                if (obj2 != null) {
                    int i7 = MediaSessionCompatQueueItem + 75;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        obj2.toString();
                        throw null;
                    }
                    string = obj2.toString();
                } else {
                    string = null;
                }
                boolean z = Boolean.parseBoolean(properties.getProperty("LOG_ENABLED", "false"));
                Object[] objArr5 = new Object[1];
                b(ViewConfiguration.getPressedStateDuration() >> 16, (char) TextUtils.indexOf("", ""), 16 - TextUtils.getTrimmedLength(""), objArr5);
                boolean z2 = Boolean.parseBoolean(properties.getProperty((String) objArr5[0], "true"));
                boolean z3 = Boolean.parseBoolean(properties.getProperty("INSTALLED_APPS_COLLECTION_ENABLED", "false"));
                Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat(properties.getProperty("REQUEST_TOKEN_MAX_LENGTH", "8000"));
                if (numPlaybackStateCompat != null) {
                    int i8 = RatingCompat + 115;
                    MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        numPlaybackStateCompat.intValue();
                        obj.hashCode();
                        throw null;
                    }
                    iIntValue = numPlaybackStateCompat.intValue();
                    int i9 = 2 % 2;
                } else {
                    iIntValue = JosStatusCodes.RTN_CODE_COMMON_ERROR;
                }
                int i10 = 2 % 2;
                vOk = new VOk(string, z, z2, z3, true, iIntValue);
            }
            if (vOk == null) {
                vOk = new VOk((String) null, false, false, false, 0, 62);
                if (IU.BGx.get()) {
                    Log.e("Incognia", "No Incognia options were provided, Incognia's SDK will not work at all");
                    int i11 = 2 % 2;
                }
            }
        }
        this.BGx.set(vOk);
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i2];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i2) {
            int i3 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i + i3])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getOffsetAfter("", 0) + 50817), 2086 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, -1734126664, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(serializer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getCapsMode("", 0, 0) + 197, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (KeyEvent.getDeadChar(0, 0) + 6915), View.getDefaultSize(0, 0) + 159, 17 - View.resolveSize(0, 0), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i2) {
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Color.alpha(0) + 6915), 159 - (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - ExpandableListView.getPackedPositionType(0L), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static InputStream write(InputStream inputStream, int i, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        setFontStylemLjRB2g.write(bArr2, RemoteActionCompatParcelizer, read);
        return new setLocaleList(new NestedScrollInteropConnection(inputStream, i, bArr2, stopNestedScrolls.IconCompatParcelizer(i2)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 32 - r5
            byte[] r1 = com.incognia.internal.lqt.write
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 97
            byte[] r0 = new byte[r0]
            int r5 = 31 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.lqt.a(int, short, short, java.lang.Object[]):void");
    }

    static void read() {
        IconCompatParcelizer = new char[]{39390, 3185, 45705, 22743, 53110, 30087, 7125, 36456, 13485, 56027, 16740, 63415, 40384, 'b', 46783, 23746};
        serializer = 398349170377690174L;
    }

    static {
        read();
        read = -459046597369036021L;
        RemoteActionCompatParcelizer = (byte) -125;
    }
}
