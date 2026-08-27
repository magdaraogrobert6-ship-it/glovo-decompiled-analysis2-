package o;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.location.LocationRequest;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlayV2$Companion;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getItalic_LCdwAannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getItalic_LCdwA {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final TakePicture$ImageOverlayV2$Companion Companion;
    private static long RemoteActionCompatParcelizer;
    private static int serializer;
    public final List components;
    private static final byte[] $$c = {30, -11, 99, -67};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {20, 111, -65, 89, 61, -31, -40, 4, 32, -38, -21, 7, -10, -3, 1, 5, -15, 11, -16, -2, 59, -67, 8, -19, 10, -17, -13, 70, -68, 9, -25, 9, -2, 2, -23, 7, -10, -3, 60, -75, 8, 55, -67, 8, -19, -7, 65, -75, -3, 7, -7, 58, -25, -34, -6, -9, -1, 15, -23, -18, -6, 5, -12, 27, -35, 7, -7, -11, 75, -67, -2, -6, -9, -1, 15, -23, -18, -6, 5, -12, 76, -17, -4, -65};
    private static final int $$e = 145;
    private static final byte[] $$a = {118, 85, -10, -52, -13, -4, 3, -5, -9, 11, -15, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 91;
    private static int read = 0;
    private static int IconCompatParcelizer = 1;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, short r7) {
        /*
            byte[] r0 = o.getItalic_LCdwA.$$c
            int r5 = r5 * 4
            int r5 = 121 - r5
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r5 = r6
            r3 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItalic_LCdwA.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 11 - r5
            byte[] r0 = o.getItalic_LCdwA.$$a
            int r1 = 20 - r7
            int r6 = r6 + 73
            byte[] r1 = new byte[r1]
            int r7 = 19 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItalic_LCdwA.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 3
            int r8 = r8 + 4
            int r7 = r7 + 36
            byte[] r0 = o.getItalic_LCdwA.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L2d
        L12:
            r3 = r2
        L13:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-4)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItalic_LCdwA.c(byte, int, short, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        NestedScrollInteropConnectionKt nestedScrollInteropConnectionKt = new NestedScrollInteropConnectionKt();
        char[] cArr2 = NestedScrollInteropConnectionKt.read(RemoteActionCompatParcelizer ^ (-9145095368803948559L), cArr, i);
        nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer = 4;
        while (nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer < cArr2.length) {
            nestedScrollInteropConnectionKt.read = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer - 4;
            int i3 = nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer;
            try {
                Object[] objArr2 = {Long.valueOf(cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer] ^ cArr2[nestedScrollInteropConnectionKt.RemoteActionCompatParcelizer % 4]), Long.valueOf(nestedScrollInteropConnectionKt.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(533537292);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (58680 - android.view.KeyEvent.keyCodeFromString("")), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1929, 36 - android.graphics.Color.blue(0), -820182035, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArr2[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nestedScrollInteropConnectionKt, nestedScrollInteropConnectionKt};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1638115501);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int scrollDefaultDelay = 2193 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iArgb = 28 - android.graphics.Color.argb(0, 0, 0, 0);
                    byte b3 = (byte) ($$f & 5);
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(keyRepeatTimeout, scrollDefaultDelay, iArgb, -1317828276, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $11 + 37;
                $10 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr2, 4, cArr2.length - 4);
        int i6 = $11 + 45;
        $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public /* synthetic */ getItalic_LCdwA(int i, List list) {
        if ((i & 1) == 0) {
            this.components = instance_delegatelambda0.write;
            int i2 = read + 97;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.components = list;
        int i4 = IconCompatParcelizer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlayV2$Companion] */
    static {
        serializer = 0;
        write();
        Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlayV2$Companion
            private static int IconCompatParcelizer = 1;
            private static int read;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = read + 117;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                getItalic_LCdwAannotations getitalic_lcdwaannotations = getItalic_LCdwAannotations.IconCompatParcelizer;
                int i4 = read + 119;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return getitalic_lcdwaannotations;
            }
        };
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(13))};
        int i = write + 45;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        List list = this.components;
        int i4 = i2 + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.components.hashCode();
            int i3 = 85 / 0;
        } else {
            iHashCode = this.components.hashCode();
        }
        int i4 = read + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("ImageOverlayV2(components=", ")", this.components);
        int i4 = read + 59;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v80, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2110493678);
        if (objRemoteActionCompatParcelizer == null) {
            char cIndexOf = (char) (56289 - TextUtils.indexOf("", ""));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 578;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 33;
            Object[] objArr2 = new Object[1];
            a($$a[25], (byte) 41, (byte) ($$b & 52), objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, iIndexOf, packedPositionType, -1390693873, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(TextUtils.getOffsetBefore("", 0) + 1, new char[]{5093, 29731, 4996, 57289, 52678, 44219, 61040, 49827, 62886, 60413, 34543, 53312, 57298, 61875, 57481, 14857, 41240, 6239, 64039, 7651, 35640, 9819, 54371, 1949, 27994, 19503}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(android.view.KeyEvent.getDeadChar(0, 0) + 1, new char[]{61400, 4821, 61373, 25296, 43826, 4519, 40721, 46016, 2439, 36103, 15350, 41311, 9189, 38743, 24018, 19277, 23861, 32439, 18223}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(694804533);
        if (objRemoteActionCompatParcelizer2 == null) {
            char fadingEdgeLength = (char) (56289 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
            int mirror = 626 - AndroidCharacter.getMirror('0');
            int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[5]);
            Object[] objArr5 = new Object[1];
            a(b, (byte) (b | 42), (byte) (-bArr[10]), objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(fadingEdgeLength, mirror, bitsPerPixel, -105266732, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = IconCompatParcelizer + 35;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-573112486);
            if (objRemoteActionCompatParcelizer3 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 56289);
                int windowTouchSlop = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 578;
                int iRed = 33 - android.graphics.Color.red(0);
                byte b2 = (byte) ($$a[13] + 1);
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b2, b3, b3, objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(defaultSize, windowTouchSlop, iRed, 218554043, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyUid = Process.myUid();
            int i8 = ~iMyUid;
            int i9 = ((((-993425351) + ((1507893 | i8) * (-192))) + (((~((-970997187) | i8)) | 557854082) * (-384))) + (((~(iMyUid | 972505079)) | ((~(i8 | (-413143105))) | (~((-557854083) | iMyUid)))) * 192)) - 302053496;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{57178, 36279, 57136, 45656, 13405, 49464, 19377, 26481, 14680, 4716, 60283, 30162, 4965, 2170, 36197, 40945, 28077, 57804, 38823, 47161}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{11603, 350, 11578, 55057, 47281, 42082, 28873, 23558, 51979, 40576, 36391, 20146, 57667, 34012, 59404, 42135, 40852, 27966, 62191, 33606}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i12 = read + 77;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), 0, -302053496};
                byte[] bArr2 = $$d;
                Object[] objArr11 = new Object[1];
                c(bArr2[68], bArr2[56], bArr2[7], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c((byte) 83, bArr2[29], bArr2[14], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-573112486);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cRed = (char) (android.graphics.Color.red(0) + 56289);
                    int iLastIndexOf = 577 - TextUtils.lastIndexOf("", '0');
                    int i14 = 34 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b4 = (byte) ($$a[13] + 1);
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    a(b4, b5, b5, objArr14);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, iLastIndexOf, i14, 218554043, false, (String) objArr14[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    b(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{5093, 29731, 4996, 57289, 52678, 44219, 61040, 49827, 62886, 60413, 34543, 53312, 57298, 61875, 57481, 14857, 41240, 6239, 64039, 7651, 35640, 9819, 54371, 1949, 27994, 19503}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b(1 - android.view.KeyEvent.keyCodeFromString(""), new char[]{61400, 4821, 61373, 25296, 43826, 4519, 40721, 46016, 2439, 36103, 15350, 41311, 9189, 38743, 24018, 19277, 23861, 32439, 18223}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(694804533);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char trimmedLength = (char) (56289 - TextUtils.getTrimmedLength(""));
                        int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 577;
                        int defaultSize2 = 33 - View.getDefaultSize(0, 0);
                        byte[] bArr3 = $$a;
                        byte b6 = (byte) (-bArr3[5]);
                        Object[] objArr17 = new Object[1];
                        a(b6, (byte) (b6 | 42), (byte) (-bArr3[10]), objArr17);
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(trimmedLength, i15, defaultSize2, -105266732, false, (String) objArr17[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2110493678);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cAlpha = (char) (android.graphics.Color.alpha(0) + 56289);
                        int i16 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 578;
                        int iIndexOf2 = 33 - TextUtils.indexOf("", "", 0);
                        Object[] objArr18 = new Object[1];
                        a($$a[25], (byte) 41, (byte) ($$b & 52), objArr18);
                        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAlpha, i16, iIndexOf2, -1390693873, false, (String) objArr18[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            long j2 = (((long) (-1533237501)) << 32) ^ (((long) (i17 ^ i18)) & 4294967295L);
            long j3 = -1533237373;
            int i19 = IconCompatParcelizer + 109;
            read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i20 = i19 % 2;
            try {
                Object[] objArr19 = {Long.valueOf(j2), Long.valueOf(j3)};
                byte[] bArr4 = $$d;
                Object[] objArr20 = new Object[1];
                c((byte) 63, (byte) (-bArr4[26]), (byte) (-bArr4[5]), objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                byte b7 = bArr4[14];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr21 = new Object[1];
                c(b8, (byte) (b8 | 77), (byte) (b7 - 1), objArr21);
                cls5.getMethod((String) objArr21[0], Long.TYPE, Long.TYPE).invoke(null, objArr19);
                Object[] objArr22 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
                int i21 = ((int[]) objArr[3])[0];
                int i22 = ((int[]) objArr[2])[0];
                int i23 = ((int[]) objArr[1])[0];
                String[] strArr3 = (String[]) objArr[0];
                int i24 = (int) Runtime.getRuntime().totalMemory();
                int i25 = i21 + (-1765321390) + ((~((~i24) | (-2113897))) * 433) + (((~((-1435872274) | i24)) | (-94486889)) * (-433)) + (((~(i24 | (-94486889))) | (-1437986170)) * 433);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr22[3])[0] = i27 ^ (i27 << 5);
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object[] objArr23 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
        int i28 = ((int[]) objArr[3])[0];
        int i29 = ((int[]) objArr[2])[0];
        int i30 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iMyPid = Process.myPid();
        int i31 = i28 + (-1388486830) + ((~(917465967 | iMyPid)) * (-301)) + (((~((-881617452) | iMyPid)) | (~((~iMyPid) | 648741710))) * (-301)) + (((~(iMyPid | (-648741711))) | (-881617452)) * LocationRequest.PRIORITY_MAG_POSITION);
        int i32 = (i31 << 13) ^ i31;
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr23[3])[0] = i33 ^ (i33 << 5);
        Object[] objArr24 = {strArr4, new int[]{i}, new int[]{i}, new int[1]};
        int i34 = ((int[]) objArr23[3])[0];
        int i35 = ((int[]) objArr23[2])[0];
        int i36 = ((int[]) objArr23[1])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i37 = i34 + ((((-1619603976) + (((~((-25198723) | iIdentityHashCode)) | (~(1505160439 | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | 1503833283)) | ((~((-26525879) | iIdentityHashCode)) | 1327156)) * (-69))) - 1053430395);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr24[3])[0] = i39 ^ (i39 << 5);
        if (this == obj) {
            int i40 = IconCompatParcelizer + 3;
            read = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i41 = i40 % 2;
            return true;
        }
        if (!(obj instanceof getItalic_LCdwA)) {
            int i42 = read + 63;
            IconCompatParcelizer = i42 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i43 = i42 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, ((getItalic_LCdwA) obj).components}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i44 = ((int[]) objArr24[3])[0];
        int i45 = i44 * i44;
        int i46 = -(1171167009 * i44);
        int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
        int i48 = -(i44 * 508814289);
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        int i50 = (i49 ^ 2094326577) + ((2094326577 & i49) << 1);
        int i51 = i50 >> 19;
        int i52 = ((i51 ^ (-16383)) + ((i51 & (-16383)) << 1)) / 8192;
        int i53 = (i52 & 1) + (i52 | 1);
        int i54 = (i50 ^ i53) + ((i53 & i50) << 1);
        int i55 = i50 >> 23;
        int i56 = -(i54 ^ ((((i55 ^ (-1023)) + ((i55 & (-1023)) << 1)) / androidx.compose.ui.graphics.Fields.RotationY) + 1));
        int i57 = ((i56 | 5) << 1) - (i56 ^ 5);
        int i58 = i57 >> 18;
        int i59 = ((i58 ^ (-32767)) + ((i58 & (-32767)) << 1)) / androidx.compose.ui.graphics.Fields.Clip;
        return 670 / (((-((((i59 | 1) << 1) - (i59 ^ 1)) + 1)) & i57) * 134);
    }

    static void write() {
        RemoteActionCompatParcelizer = -7037380728486011270L;
    }
}
