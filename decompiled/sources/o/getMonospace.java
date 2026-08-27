package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Dispatcher$Companion;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlinx.serialization.Serializable;
import o.getCursive;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMonospace {
    public static final CustomerUnavailable$Dispatcher$Companion Companion;
    private static char IconCompatParcelizer;
    private static char RemoteActionCompatParcelizer;
    private static char read;
    private static int serializer;
    private static char write;
    public final String afterTimerDescription;
    public final resolveDPcqOEQdefault chat;
    public final String description;
    public final String duringTimerDescription;
    public final String title;
    private static final byte[] $$c = {94, -68, 1, -105};
    private static final int $$f = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {39, 22, -92, -36, -10, -11, 2, -3, -11, -16, 68, -59, -18, -9, -3, -12, -5, 5, -11, 3, -20, 63, -62, -12, -9, -14, 67, -30, -44, -9, -14, 38, -47, 15, -6, 22, -50, -3, -6, 1, -4, -23, 5, -12, -5, 29, -47, -1, 3, -17, 9, 59, -63, -4, -21, 27, -24, -19, 3, 2, -17, -3, -23, 15, -19, 6, -23, 11, 1, -10, -15, -3, -2, -15, -12, 15, -25, 7, -13, 1, -2, -24, 8, -6, -67};
    private static final int $$e = 187;
    private static final byte[] $$a = {44, -88, -93, -100, -5, -9, 11, -15, -14, 13, -9, -8, 11, -3, 17, -21, 13, 24, -1, 5, -8, -14, 18, 14, 0, -10, 6, -1, -43, 44, -2, 3, -15, 19, -35, 36, -16, 16, -16, -28, 43, -15, 8};
    private static final int $$b = 119;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 107
            byte[] r0 = o.getMonospace.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMonospace.$$g(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 16 - r9
            byte[] r0 = o.getMonospace.$$a
            int r8 = r8 * 2
            int r8 = r8 + 77
            int r7 = 27 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r9 = r9 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMonospace.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.getMonospace.$$d
            int r8 = r8 + 3
            int r9 = r9 + 4
            int r7 = 119 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L2b
        L10:
            r3 = r2
        L11:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMonospace.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Dispatcher$Companion] */
    static {
        serializer = 0;
        MediaDescriptionCompat();
        Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Dispatcher$Companion
            private static int IconCompatParcelizer = 1;
            private static int serializer;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 69;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                getCursive getcursive = getCursive.read;
                int i4 = IconCompatParcelizer + 77;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
                return getcursive;
            }
        };
        int i = MediaMetadataCompat + 107;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 35;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final resolveDPcqOEQdefault RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 85;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        resolveDPcqOEQdefault resolvedpcqoeqdefault = this.chat;
        int i4 = i2 + 81;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return resolvedpcqoeqdefault;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 39;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 35;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 1;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.duringTimerDescription;
        int i4 = i2 + 65;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.afterTimerDescription;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getMonospace(int i, String str, String str2, String str3, String str4, resolveDPcqOEQdefault resolvedpcqoeqdefault) {
        if (31 == (i & 31)) {
            this.title = str;
            this.description = str2;
            this.afterTimerDescription = str3;
            this.duringTimerDescription = str4;
            this.chat = resolvedpcqoeqdefault;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, getCursive.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.chat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.afterTimerDescription), 31, this.duringTimerDescription);
        int i4 = MediaDescriptionCompat + 85;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getMonospace)) {
                return false;
            }
            getMonospace getmonospace = (getMonospace) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getmonospace.title}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getmonospace.description}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.afterTimerDescription, getmonospace.afterTimerDescription}, getCieXyz.write())).booleanValue()) {
                        int i2 = MediaSessionCompatQueueItem + 19;
                        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringTimerDescription, getmonospace.duringTimerDescription}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chat, getmonospace.chat}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = MediaDescriptionCompat + 41;
                    MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = MediaDescriptionCompat + 69;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 != 0;
            }
            int i7 = MediaSessionCompatQueueItem + 103;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 16 / 0;
            }
            return false;
        }
        int i9 = MediaSessionCompatQueueItem + 81;
        MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char[] cArr3 = new char[2];
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            cArr3[i3] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i4 = $10 + 109;
            $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 33;
                $10 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) IconCompatParcelizer) ^ 7962313315467514595L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 65450);
                        int i10 = 1244 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b = $$c[2];
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c3, i10, iIndexOf, 402902884, false, $$g(b2, b2, b), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 65450);
                        int iIndexOf2 = 1244 - TextUtils.indexOf("", "", 0, 0);
                        int edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 33;
                        byte b3 = $$c[2];
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(size, iIndexOf2, edgeSlop, 402902884, false, $$g(b4, b4, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr3[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr3[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int i11 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2545;
                int mirror = 'N' - AndroidCharacter.getMirror('0');
                byte b5 = (byte) ($$c[2] - 1);
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(trimmedLength, i11, mirror, -261026534, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i12 = $10 + 59;
            $11 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 4 % 3;
            }
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01fc  */
    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109610714);
        if (objRemoteActionCompatParcelizer == null) {
            char cKeyCodeFromString = (char) android.view.KeyEvent.keyCodeFromString("");
            int doubleTapTimeout = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 784;
            int packedPositionType = 74 - ExpandableListView.getPackedPositionType(0L);
            byte b = (byte) ($$b & 30);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b, (byte) (-bArr[15]), bArr[9], objArr2);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cKeyCodeFromString, doubleTapTimeout, packedPositionType, 1829539527, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(22 - Gravity.getAbsoluteGravity(0, 0), new char[]{7497, 4274, 10723, 58010, 37413, 48888, 4321, 7921, 37484, 11846, 27473, 42305, 9987, 315, 35555, 32138, 22792, 18261, 29305, 35376, 9924, 60720}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, new char[]{11701, 22172, 12861, 283, 53888, 'E', 10670, 23972, 42745, 33584, 28658, 2133, 15536, 25340, 25566, 49300}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1363128103);
        if (objRemoteActionCompatParcelizer2 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i4 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 783;
            int iLastIndexOf = 73 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[14], bArr2[33], (byte) (-bArr2[5]), objArr5);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, i4, iLastIndexOf, 2115006776, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1569297559);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 784;
                int iAlpha = 74 - android.graphics.Color.alpha(0);
                byte b2 = $$a[24];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b2, b3, b3, objArr6);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cCombineMeasuredStates, absoluteGravity, iAlpha, -1923500682, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (-1123762791) + (((~((-487201018) | i7)) | (~(iIdentityHashCode | 1162455812))) * 333) + (((~(iIdentityHashCode | (-487201018))) | (~(i7 | 1162455812))) * 333) + 414759987;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(26 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{7497, 4274, 10723, 58010, 37413, 48888, 4321, 7921, 12861, 283, 13580, 24543, 6799, 37427, 30918, 55888, 5267, 32159, 40022, 61609, 18683, 28552, 26771, 4810, 18464, 60185}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{51638, 22125, 46490, 25057, 23277, 41151, 25232, 47184, 55628, 61552, 30361, 54229, 26472, 38640, 30918, 55888, 12170, 23534}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = MediaDescriptionCompat + 75;
                    MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            b(TextUtils.getTrimmedLength("") + 16, new char[]{7357, 46237, 50962, 63139, 1692, 22531, 7497, 4274, 18853, 15502, 11146, 36496, 46373, 49918, 31907, 16514}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(16 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{9502, 22348, 23277, 41151, 30918, 55888, 40022, 61609, 60375, 20395, 64966, 13796, 9163, 34643, 32072, 1087}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = MediaDescriptionCompat + 99;
            MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 414759987};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                c((byte) (-bArr3[15]), (byte) ($$e & 109), bArr3[47], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = (byte) (bArr3[39] - 1);
                byte b5 = bArr3[6];
                Object[] objArr14 = new Object[1];
                c(b4, b5, (byte) (b5 | 40), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i15 = MediaDescriptionCompat + 81;
                    MediaSessionCompatQueueItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1569297559);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iIndexOf = 783 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i17 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 73;
                        byte b6 = $$a[24];
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        a(b6, b7, b7, objArr16);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, iIndexOf, i17, -1923500682, false, (String) objArr16[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(22 - (android.view.KeyEvent.getMaxKeyCode() >> 16), new char[]{7497, 4274, 10723, 58010, 37413, 48888, 4321, 7921, 37484, 11846, 27473, 42305, 9987, 315, 35555, 32138, 22792, 18261, 29305, 35376, 9924, 60720}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(Process.getGidForName("") + 16, new char[]{11701, 22172, 12861, 283, 53888, 'E', 10670, 23972, 42745, 33584, 28658, 2133, 15536, 25340, 25566, 49300}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1363128103);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iResolveOpacity = 784 - Drawable.resolveOpacity(0, 0);
                            int scrollBarFadeDuration2 = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74;
                            byte[] bArr4 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr4[14], bArr4[33], (byte) (-bArr4[5]), objArr19);
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, iResolveOpacity, scrollBarFadeDuration2, 2115006776, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109610714);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int edgeSlop = 784 - (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            int jumpTapTimeout = 74 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b8 = (byte) ($$b & 30);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(b8, (byte) (-bArr5[15]), bArr5[9], objArr20);
                            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveSize, edgeSlop, jumpTapTimeout, 1829539527, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 != i18) {
            try {
                Object[] objArr21 = {Long.valueOf((((long) (-2054235437)) << 32) ^ (((long) (i18 ^ i19)) & 4294967295L)), Long.valueOf(-2054235949)};
                byte[] bArr6 = $$d;
                Object[] objArr22 = new Object[1];
                c(bArr6[82], (byte) (-bArr6[27]), (byte) ($$e >>> 2), objArr22);
                Class<?> cls6 = Class.forName((String) objArr22[0]);
                byte b9 = (byte) (bArr6[39] - 1);
                Object[] objArr23 = new Object[1];
                c((byte) 83, b9, (byte) (b9 | 78), objArr23);
                cls6.getMethod((String) objArr23[0], Long.TYPE, Long.TYPE).invoke(null, objArr21);
                Object[] objArr24 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
                int i20 = ((int[]) objArr[3])[0];
                int i21 = ((int[]) objArr[2])[0];
                int i22 = ((int[]) objArr[0])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i23 = i20 + (-731974311) + ((~((~iIdentityHashCode2) | 1069480955)) * (-116)) + ((865913443 | iIdentityHashCode2) * 116) + (((~(iIdentityHashCode2 | (-783743387))) | 580175874) * 116);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr24[3])[0] = i25 ^ (i25 << 5);
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object[] objArr25 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
        int i26 = ((int[]) objArr[3])[0];
        int i27 = ((int[]) objArr[2])[0];
        int i28 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[1];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i29 = ~startElapsedRealtime;
        int i30 = i26 + ((((~(i29 | 692294419)) | ((~((-957362411) | i29)) | 269492456)) * (-397)) - 106855776) + ((startElapsedRealtime | 273916921) * 397);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr25[3])[0] = i32 ^ (i32 << 5);
        Object[] objArr26 = {new int[]{i}, strArr, new int[]{i}, new int[1]};
        int i33 = ((int[]) objArr25[3])[0];
        int i34 = ((int[]) objArr25[2])[0];
        int i35 = ((int[]) objArr25[0])[0];
        String[] strArr4 = (String[]) objArr25[1];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i36 = ~iIdentityHashCode3;
        int i37 = i33 + 946728717 + ((~(626046833 | i36)) * (-560)) + ((~(iIdentityHashCode3 | (-402851981))) * (-560)) + (((~(1023609996 | i36)) | 5288817) * 560);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr26[3])[0] = i39 ^ (i39 << 5);
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Dispatcher(title=", this.title, ", description=", this.description, ", afterTimerDescription=");
        String str = this.afterTimerDescription;
        String str2 = this.duringTimerDescription;
        String strConcat = "0|30|1|30|".concat(", chat=");
        int i40 = ((int[]) objArr26[3])[0];
        int i41 = ((i40 * i40) - (~(-(1490575637 * i40)))) - 1;
        int i42 = -(i40 * 407083255);
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        int i44 = (i43 & 1387322404) + (1387322404 | i43);
        int i45 = i44 >> 23;
        int i46 = (((i45 | (-1023)) << 1) - (i45 ^ (-1023))) / androidx.compose.ui.graphics.Fields.RotationY;
        int i47 = (i46 & 1) + (i46 | 1);
        int i48 = ((i44 | i47) << 1) - (i47 ^ i44);
        int i49 = i44 >> 27;
        int i50 = ((i49 & (-63)) + (i49 | (-63))) / 32;
        int i51 = -(((i50 & 1) + (i50 | 1)) ^ i48);
        int i52 = ((i51 | 8) << 1) - (i51 ^ 8);
        int i53 = i52 >> 26;
        int i54 = ((i53 & (-127)) + (i53 | (-127))) / 64;
        int i55 = (i54 ^ 1) + ((i54 & 1) << 1);
        c8$$ExternalSyntheticOutline0.m(sbM, str, ", duringTimerDescription=", str2, strConcat.substring(86960 / (((-(((i55 | 1) << 1) - (i55 ^ 1))) & i52) * 1087)));
        sbM.append(this.chat);
        sbM.append(")");
        return sbM.toString();
    }

    static void MediaDescriptionCompat() {
        read = (char) 21249;
        RemoteActionCompatParcelizer = (char) 42755;
        IconCompatParcelizer = (char) 60420;
        write = (char) 16224;
    }
}
