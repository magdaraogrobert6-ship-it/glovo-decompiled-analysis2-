package o;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class getSalt implements WildcardType {
    public final Type RemoteActionCompatParcelizer;
    public final Type serializer;
    private static final byte[] $$b = {23, -98, 35, 29};
    private static final int $$c = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] write = {52600, 52580, 52579, 52584, 52585, 52574, 52589, 52581, 52578, 52598, 52604, 52590, 52559, 52601, 52524, 52583, 52534, 52576, 52544, 52575, 52582, 52577, 52607, 52606, 52587};
    private static char read = 63635;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r7, byte r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = o.getSalt.$$b
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 2
            int r7 = r7 + 103
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSalt.$$d(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r6[0] == java.lang.Object.class) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r6[0] == java.lang.Object.class) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r5.serializer = r7[0];
        r5.RemoteActionCompatParcelizer = java.lang.Object.class;
        r6 = o.getSalt.MediaDescriptionCompat + 65;
        o.getSalt.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if ((r6 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r6 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        o.DrawableTransformation.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public getSalt(java.lang.reflect.Type[] r6, java.lang.reflect.Type[] r7) {
        /*
            r5 = this;
            r5.<init>()
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L6d
            int r0 = r6.length
            if (r0 != r2) goto L69
            int r0 = r7.length
            r3 = 0
            if (r0 != r2) goto L58
            int r0 = o.getSalt.IconCompatParcelizer
            int r0 = r0 + 81
            int r4 = r0 % 128
            o.getSalt.MediaDescriptionCompat = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L2c
            r0 = r7[r2]
            r0.getClass()
            r0 = r7[r2]
            o.getKind.IconCompatParcelizer(r0)
            r6 = r6[r3]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r6 != r0) goto L54
            goto L3c
        L2c:
            r0 = r7[r3]
            r0.getClass()
            r0 = r7[r3]
            o.getKind.IconCompatParcelizer(r0)
            r6 = r6[r3]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r6 != r0) goto L54
        L3c:
            r6 = r7[r3]
            r5.serializer = r6
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5.RemoteActionCompatParcelizer = r6
            int r6 = o.getSalt.MediaDescriptionCompat
            int r6 = r6 + 65
            int r7 = r6 % 128
            o.getSalt.IconCompatParcelizer = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L53
            r6 = 78
            int r6 = r6 / r3
        L53:
            return
        L54:
            o.DrawableTransformation.write()
            throw r1
        L58:
            r7 = r6[r3]
            r7.getClass()
            r7 = r6[r3]
            o.getKind.IconCompatParcelizer(r7)
            r5.serializer = r1
            r6 = r6[r3]
            r5.RemoteActionCompatParcelizer = r6
            return
        L69:
            o.DrawableTransformation.write()
            throw r1
        L6d:
            o.DrawableTransformation.write()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSalt.<init>(java.lang.reflect.Type[], java.lang.reflect.Type[]):void");
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(new char[]{17, 7, 20, 11, 7, '\t', '\f', 7, 13813}, (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1), TextUtils.lastIndexOf("", '0') + 10, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i2 = IconCompatParcelizer + 99;
                MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = MediaDescriptionCompat + 109;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(new char[]{24, 2, 13816}, (byte) (11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 3, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(new char[]{6, '\b', 4, 0, 24, '\r', 18, 14, 13927, 13927, 3, 22, 1, 15, '\r', 19, 4, 22, 4, '\t', 24, '\r', 7, 3, 4, '\n', '\b', '\t', 5, 2, '\b', 7, 22, '\f', 14, '\t', 13947}, (byte) ((-16777091) - android.graphics.Color.rgb(0, 0, 0)), android.graphics.Color.rgb(0, 0, 0) + 16777253, objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr6);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            typeArr = new Type[0];
            typeArr[0] = this.RemoteActionCompatParcelizer;
        } else {
            typeArr = new Type[]{this.RemoteActionCompatParcelizer};
        }
        int i4 = i3 + 21;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Type type = this.serializer;
        if (type == null) {
            return getKind.serializer;
        }
        Type[] typeArr = {type};
        int i4 = i3 + 67;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return typeArr;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaDescriptionCompat;
        int i5 = i4 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
            if (obj instanceof WildcardType) {
                i = i4 + 59;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    getKind.serializer(this, (WildcardType) obj);
                    throw null;
                }
                if (getKind.serializer(this, (WildcardType) obj)) {
                    i2 = MediaDescriptionCompat + 13;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
        } else if (obj instanceof WildcardType) {
            i = i4 + 59;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                getKind.serializer(this, (WildcardType) obj);
                throw null;
            }
            if (getKind.serializer(this, (WildcardType) obj)) {
                i2 = MediaDescriptionCompat + 13;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Type type = this.serializer;
        int iHashCode = (type != null ? type.hashCode() + 31 : 1) ^ (this.RemoteActionCompatParcelizer.hashCode() + 31);
        int i3 = MediaDescriptionCompat + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        Type type = this.serializer;
        if (type != null) {
            return "? super " + getKind.RemoteActionCompatParcelizer(type);
        }
        Type type2 = this.RemoteActionCompatParcelizer;
        if (type2 == Object.class) {
            int i2 = IconCompatParcelizer + 101;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
            return "?";
        }
        String str = "? extends " + getKind.RemoteActionCompatParcelizer(type2);
        int i4 = MediaDescriptionCompat + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = write;
        int i5 = -556721944;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 41;
                $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int i9 = 2016 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        int i10 = 25 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAxisFromString, i9, i10, 234961161, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = -556721944;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 25;
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 4 % 2;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(read)};
            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
            if (objRemoteActionCompatParcelizer2 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.red(0), android.graphics.Color.rgb(0, 0, 0) + 16779231, TextUtils.indexOf("", "", 0, 0) + 24, 234961161, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i13 = $10 + 25;
                $11 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    extractintegerpixels.IconCompatParcelizer = 1;
                } else {
                    extractintegerpixels.IconCompatParcelizer = 0;
                }
                while (extractintegerpixels.IconCompatParcelizer < i2) {
                    extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                    extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                    if (extractintegerpixels.read == extractintegerpixels.write) {
                        cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Process.getGidForName("") + 1), 141 - TextUtils.getOffsetBefore("", 0), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                                int i14 = $11 + 33;
                                $10 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    char size = (char) View.MeasureSpec.getSize(0);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2371;
                                    int bitsPerPixel = 16 - ImageFormat.getBitsPerPixel(0);
                                    byte b6 = (byte) ($$c & 7);
                                    byte b7 = (byte) (b6 - 1);
                                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(size, packedPositionChild, bitsPerPixel, 1616580640, false, $$d(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                int i16 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                                cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                                cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i16];
                            } else {
                                obj = null;
                                if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                                    int i17 = $10 + 23;
                                    $11 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i18 = i17 % 2;
                                    extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                                    extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                                    int i19 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                                    int i20 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                                    cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i19];
                                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i20];
                                } else {
                                    int i21 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                                    int i22 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                                    cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i21];
                                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i22];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    extractintegerpixels.IconCompatParcelizer += 2;
                    obj2 = obj;
                }
            }
            for (int i23 = 0; i23 < i; i23++) {
                cArr4[i23] = (char) (cArr4[i23] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }
}
