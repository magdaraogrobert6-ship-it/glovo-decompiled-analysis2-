package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.location.ActivityIdentificationData;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class accessstopTrackingTable {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final accessnotifyInvalidation read;
    public final generatePOSTBodyString serializer;
    public final String write;
    private static final byte[] $$c = {49, 55, -28, 33};
    private static final int $$f = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, 90, 113, -1, -24, 10, -5, 47, -60, -19, -5, 56, -63, -24, 10, -20, 8, -14, 54, -70, 5, -20, 6, -13, -5, -20, 61, -31, -24, 10, -5, -36, -26, 12, 13, -27, -20, 6, -13, -5, -20, 71, -24, 10, -20, 7, -20, 2, 1, -18, -4, -24, 14, -20, 58, -64, -5, -22, 39, -42, -16, 6, 29, -42, -25, 10, -20, -9, 4, -17, 3, -12, 0, 23, -34, 28, -57, -13, 4, 4, -7, -68};
    private static final int $$e = 1;
    private static final byte[] $$a = {118, -2, 102, 97, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -5, -9, 11, -15};
    private static final int $$b = ActivityIdentificationData.RUNNING;
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    private static long RatingCompat = -4851732251518731698L;
    private static int MediaSessionCompatQueueItem = -658032778;
    private static char MediaMetadataCompat = 14198;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = o.accessstopTrackingTable.$$c
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r7 = 111 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessstopTrackingTable.$$g(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 73
            int r6 = 50 - r6
            byte[] r0 = o.accessstopTrackingTable.$$a
            int r1 = r5 + 5
            byte[] r1 = new byte[r1]
            int r5 = r5 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r5
            r4 = r6
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessstopTrackingTable.a(short, byte, short, java.lang.Object[]):void");
    }

    private static void c(int i, byte b, short s, Object[] objArr) {
        int i2 = 115 - i;
        byte[] bArr = $$d;
        int i3 = b + 4;
        byte[] bArr2 = new byte[42 - s];
        int i4 = 41 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 7;
        }
        while (true) {
            i3++;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i3])) - 7;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (obj instanceof accessstopTrackingTable) {
                accessstopTrackingTable accessstoptrackingtable = (accessstopTrackingTable) obj;
                if (!this.MediaDescriptionCompat.equals(accessstoptrackingtable.MediaDescriptionCompat)) {
                    return false;
                }
                Object[] objArr = {this.MediaBrowserCompatMediaItem, accessstoptrackingtable.MediaBrowserCompatMediaItem};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    if (!this.IconCompatParcelizer.equals(accessstoptrackingtable.IconCompatParcelizer) || !this.write.equals(accessstoptrackingtable.write) || !this.RemoteActionCompatParcelizer.equals(accessstoptrackingtable.RemoteActionCompatParcelizer)) {
                        return false;
                    }
                    Object[] objArr2 = {this.serializer, accessstoptrackingtable.serializer};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr3 = {this.read, accessstoptrackingtable.read};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                } else {
                    i = MediaSessionCompatToken + 5;
                    MediaSessionCompatResultReceiverWrapper = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else {
                i = MediaSessionCompatResultReceiverWrapper + 95;
                MediaSessionCompatToken = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        return true;
    }

    private static void b(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        int i5 = $10 + 59;
        $11 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i7 = $11 + 107;
            $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.green(0), 231 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 20 - TextUtils.lastIndexOf("", '0', 0, 0), 1436720535, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 2547, TextUtils.lastIndexOf("", '0', 0, 0) + 31, -73045399, false, $$g(b, (byte) (b | 7), b), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i3] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[0] = accesstooffsetmowrbkg;
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 887, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 59, -562850980, false, $$g(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cMakeMeasureSpec = (char) (65450 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1244;
                    int edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 33;
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    String str$$g = $$g(b4, b5, (byte) (b5 - 3));
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec, tapTimeout, edgeSlop, 1854554309, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (RatingCompat ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaSessionCompatQueueItem) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaMetadataCompat) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
                i3 = i2;
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

    public accessstopTrackingTable(String str, String str2, String str3, String str4, String str5, generatePOSTBodyString generatepostbodystring, accessnotifyInvalidation accessnotifyinvalidation) {
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.serializer = generatepostbodystring;
        this.read = accessnotifyinvalidation;
    }

    public static accessstopTrackingTable IconCompatParcelizer(accessstopTrackingTable accessstoptrackingtable, generatePOSTBodyString generatepostbodystring, accessnotifyInvalidation accessnotifyinvalidation, int i) {
        int i2 = 2 % 2;
        accessstoptrackingtable.getClass();
        String str = accessstoptrackingtable.MediaDescriptionCompat;
        String str2 = accessstoptrackingtable.MediaBrowserCompatMediaItem;
        String str3 = accessstoptrackingtable.IconCompatParcelizer;
        String str4 = accessstoptrackingtable.write;
        String str5 = accessstoptrackingtable.RemoteActionCompatParcelizer;
        if ((i & 64) != 0) {
            generatepostbodystring = accessstoptrackingtable.serializer;
        }
        generatePOSTBodyString generatepostbodystring2 = generatepostbodystring;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i3 = MediaSessionCompatResultReceiverWrapper + 83;
            MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            accessnotifyinvalidation = accessstoptrackingtable.read;
        }
        accessstoptrackingtable.getClass();
        accessstopTrackingTable accessstoptrackingtable2 = new accessstopTrackingTable(str, str2, str3, str4, str5, generatepostbodystring2, accessnotifyinvalidation);
        int i5 = MediaSessionCompatResultReceiverWrapper + 15;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessstoptrackingtable2;
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 67;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FailureViewState(selfieFailedIconId=2131232079, retryButtonText=", this.MediaDescriptionCompat, ", proceedText=", this.MediaBrowserCompatMediaItem, ", centerTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", centerDescription=", this.write, ", centerSubTitleDescription=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", forceProceedState=");
        sbM.append(this.serializer);
        sbM.append(", failReasonsState=");
        sbM.append(this.read);
        sbM.append(")");
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1772778910);
        if (objRemoteActionCompatParcelizer == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int scrollBarFadeDuration = 516 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i4 = 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b = (byte) 23;
            Object[] objArr2 = new Object[1];
            a(b, (byte) (b << 1), (byte) (-$$a[51]), objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(capsMode, scrollBarFadeDuration, i4, -1183165313, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(android.view.KeyEvent.getMaxKeyCode() >> 16, new char[]{7520, 8384, 16206, 7903, 37789, 21549, 49161, 27055, 29036, 54884, 16378, 27760, 56801, 43027, 11254, 3849, 64131, 9810, 53856, 59923, 42433, 56905}, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), new char[]{52778, 44439, 7886, 64823}, new char[]{19768, 53804, 11648, 8722}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0) - 1121942413, new char[]{23342, 19510, 62592, 30130, 34094, 54982, 45329, 20592, 51334, 22446, 57462, 20808, 6894, 34251, 61431}, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5401), new char[]{29412, 8324, 6589, 38421}, new char[]{19768, 53804, 11648, 8722}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-895189637);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 516;
            int keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr[8]), bArr[4], (byte) (bArr[14] + 1), objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveOpacity, i5, keyRepeatTimeout, 443833498, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1807615028);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cArgb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                int size = 516 - View.MeasureSpec.getSize(0);
                int touchSlop = 27 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
                byte b2 = (byte) ($$a[14] + 1);
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b2, b3, (byte) (b3 | 46), objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cArgb, size, touchSlop, -1150409259, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i8 = (((((~((-193556489) | iMaxMemory)) | 134283264) * (-566)) - 783392333) + ((~(iMaxMemory | (-59273225))) * 566)) - 1595909246;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(TextUtils.indexOf("", ""), new char[]{43901, 23560, 9324, 55966, 36857, 20824, 57420, 49838, 11600, 42815, 3719, 2432, 15593, 56837, 32588, 24893, 60989, 49401, 65515, 45912, 65401, 2940, 59899, 9378, 40978, 19923}, (char) (ExpandableListView.getPackedPositionGroup(0L) + 56124), new char[]{33376, 12290, 15574, 46043}, new char[]{19768, 53804, 11648, 8722}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{10510, 37676, 6040, 12523, 60237, 61244, 59655, 23654, 39505, 17152, 52423, 30678, 2246, 36869, 30903, 1942, 660, 32760}, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 38477), new char[]{46420, 51351, 19480, 20374}, new char[]{19768, 53804, 11648, 8722}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(android.view.KeyEvent.getDeadChar(0, 0), new char[]{58090, 4578, 64946, 24620, 57311, 21386, 43387, 15159, 21472, 24991, 59131, 45742, 21471, 44947, 21518, 8535}, (char) (514 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), new char[]{10728, 20341, 522, 29698}, new char[]{19768, 53804, 11648, 8722}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(android.view.ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{4572, 50031, 40813, 34806, 10337, 50322, 21931, 5609, 3242, 44170, 28017, 7658, 19633, 43253, 39402, 64218}, (char) (40136 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{43832, 24594, 51353, 17308}, new char[]{19768, 53804, 11648, 8722}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{51070, 19954, 50768, 20132, 20134, 40935, 34713, 49712, 62609, 32810, 57541, 52311, 22189, 3174, 48668, 46061, 54828, 49571, 39129, 46235, 33141, 47142, 20182, 44480, 56972, 64065, 50927, 42748, 12905, 61631, 63048, 59664, 2738, 18224, 22316, 47543, 38096, 51389, 65113, 12293, 23115, 36160, 22922, 11954, 21999, 24528, 23242, 30701, 17237, 47517, 59883, 34867, 40854, 24785, 39754, 54708, 18853, 14254, 51377, 47411, 55428, 20650, 13461, 5624}, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), new char[]{6801, 37240, 18545, 17163}, new char[]{19768, 53804, 11648, 8722}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, new String[]{(String) objArr12[0]}, Integer.valueOf(iIntValue), 17, -1595909246};
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                c(bArr2[34], bArr2[3], bArr2[72], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b4 = bArr2[72];
                byte b5 = (byte) (b4 | 40);
                Object[] objArr15 = new Object[1];
                c(b4, b5, (byte) (b5 & 240), objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                int i11 = ((int[]) objArr[3])[0];
                int i12 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i13 = MediaSessionCompatToken + 39;
                    MediaSessionCompatResultReceiverWrapper = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1807615028);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int iMakeMeasureSpec = 516 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int keyRepeatTimeout2 = 27 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b6 = (byte) ($$a[14] + 1);
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        a(b6, b7, (byte) (b7 | 46), objArr16);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, iMakeMeasureSpec, keyRepeatTimeout2, -1150409259, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{7520, 8384, 16206, 7903, 37789, 21549, 49161, 27055, 29036, 54884, 16378, 27760, 56801, 43027, 11254, 3849, 64131, 9810, 53856, 59923, 42433, 56905}, (char) TextUtils.indexOf("", "", 0), new char[]{52778, 44439, 7886, 64823}, new char[]{19768, 53804, 11648, 8722}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(android.graphics.Color.red(0) - 1121942414, new char[]{23342, 19510, 62592, 30130, 34094, 54982, 45329, 20592, 51334, 22446, 57462, 20808, 6894, 34251, 61431}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5400), new char[]{29412, 8324, 6589, 38421}, new char[]{19768, 53804, 11648, 8722}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-895189637);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char pressedStateDuration = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                            int bitsPerPixel = 515 - ImageFormat.getBitsPerPixel(0);
                            int i15 = 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            a((byte) (-bArr3[8]), bArr3[4], (byte) (bArr3[14] + 1), objArr19);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(pressedStateDuration, bitsPerPixel, i15, 443833498, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1772778910);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int keyRepeatDelay = 516 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i16 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26;
                            byte b8 = (byte) 23;
                            Object[] objArr20 = new Object[1];
                            a(b8, (byte) (b8 << 1), (byte) (-$$a[51]), objArr20);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(threadPriority, keyRepeatDelay, i16, -1183165313, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i19 = MediaSessionCompatToken + 109;
                MediaSessionCompatResultReceiverWrapper = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                for (int i20 = i19 % 2 != 0 ? 1 : 0; i20 < strArr2.length; i20++) {
                    arrayList.add(strArr2[i20]);
                }
            }
            try {
                Object[] objArr21 = {Long.valueOf((((long) (-747914853)) << 32) ^ (((long) (i17 ^ i18)) & 4294967295L)), Long.valueOf(-747914789)};
                byte[] bArr4 = $$d;
                byte b9 = bArr4[68];
                int i21 = $$e;
                Object[] objArr22 = new Object[1];
                c(b9, (byte) (i21 | 48), (byte) (i21 | 14), objArr22);
                Class<?> cls6 = Class.forName((String) objArr22[0]);
                byte b10 = (byte) (i21 | 78);
                Object[] objArr23 = new Object[1];
                c(b10, (byte) (b10 - 4), bArr4[58], objArr23);
                cls6.getMethod((String) objArr23[0], Long.TYPE, Long.TYPE).invoke(null, objArr21);
                Object[] objArr24 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i22 = ((int[]) objArr[1])[0];
                int i23 = ((int[]) objArr[2])[0];
                int i24 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[0];
                int i25 = ~(((int) Runtime.getRuntime().totalMemory()) | 331218760);
                int i26 = i22 + ((279289088 | i25) * (-196)) + 2134464147 + ((i25 | 51929672) * 196);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr24[1])[0] = i28 ^ (i28 << 5);
                int[] iArr = new int[i18];
                int i29 = i18 - 1;
                iArr[i29] = 1;
                Toast.makeText((Context) null, iArr[((i18 * i29) % 2) - 1], 1).show();
                Object[] objArr25 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i30 = ((int[]) objArr24[1])[0];
                int i31 = ((int[]) objArr24[2])[0];
                int i32 = ((int[]) objArr24[3])[0];
                String[] strArr4 = (String[]) objArr24[0];
                int i33 = ~(System.identityHashCode(this) | (-491781946));
                int i34 = i30 + ((((-1847652111) + (((-1013473518) | i33) * (-220))) + ((i33 | 17276688) * 220)) - 1057402246);
                int i35 = (i34 << 13) ^ i34;
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr25[1])[0] = i36 ^ (i36 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } else {
            int i37 = MediaSessionCompatToken + 45;
            MediaSessionCompatResultReceiverWrapper = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i38 = i37 % 2;
            Object[] objArr26 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i39 = ((int[]) objArr[1])[0];
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[3])[0];
            String[] strArr5 = (String[]) objArr[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i42 = ~iFreeMemory;
            int i43 = i39 + (-87349545) + (((~(230680991 | i42)) | 272633856) * (-108)) + (((~(i42 | 291010580)) | (~((-291010581) | iFreeMemory)) | 212304267) * 54) + ((iFreeMemory | 212304267) * 54);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr26[1])[0] = i45 ^ (i45 << 5);
            Object[] objArr27 = {strArr5, new int[1], new int[]{i}, new int[]{i}};
            int i46 = ((int[]) objArr26[1])[0];
            int i47 = ((int[]) objArr26[2])[0];
            int i48 = ((int[]) objArr26[3])[0];
            int iMyTid = Process.myTid();
            int i49 = ~iMyTid;
            int i50 = i46 + 1902225395 + ((4210947 | i49) * (-192)) + (((~(37871971 | i49)) | 555352596) * (-384)) + (((~(iMyTid | (-33661025))) | (~(i49 | 593224567)) | (~((-555352597) | iMyTid))) * 192);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr27[1])[0] = i52 ^ (i52 << 5);
        }
        return sbM.toString();
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 53;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(com.logistics.rider.glovo.R.drawable.img_medium_brand_id_verf_seflie_failed) * 31, 31, this.MediaDescriptionCompat);
        String str = this.MediaBrowserCompatMediaItem;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = MediaSessionCompatToken + 9;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.IconCompatParcelizer), 31, this.write), 31, this.RemoteActionCompatParcelizer);
        generatePOSTBodyString generatepostbodystring = this.serializer;
        int iHashCode2 = generatepostbodystring == null ? 0 : generatepostbodystring.hashCode();
        accessnotifyInvalidation accessnotifyinvalidation = this.read;
        return ((iM2 + iHashCode2) * 31) + (accessnotifyinvalidation != null ? accessnotifyinvalidation.hashCode() : 0);
    }
}
