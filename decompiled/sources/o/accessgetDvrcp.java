package o;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDvrcp {
    public final Map IconCompatParcelizer;
    public final byte[] MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final Integer MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final accessgetF1cp RemoteActionCompatParcelizer;
    public final Integer read;
    public final byte[] serializer;
    public final long write;
    private static final byte[] $$b = {13, -50, -112, -45};
    private static final int $$c = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PlaybackStateCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    private static long PlaybackStateCompatCustomAction = -7009568347796326538L;
    private static int MediaSessionCompatResultReceiverWrapper = -658032778;
    private static char MediaSessionCompatToken = 19320;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r6, int r7, int r8) {
        /*
            byte[] r0 = o.accessgetDvrcp.$$b
            int r6 = 111 - r6
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetDvrcp.$$d(byte, int, int):java.lang.String");
    }

    public accessgetDvrcp(String str, Integer num, accessgetF1cp accessgetf1cp, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.RatingCompat = str;
        this.read = num;
        this.RemoteActionCompatParcelizer = accessgetf1cp;
        this.write = j;
        this.MediaMetadataCompat = j2;
        this.IconCompatParcelizer = map;
        this.MediaSessionCompatQueueItem = num2;
        this.MediaDescriptionCompat = str2;
        this.serializer = bArr;
        this.MediaBrowserCompatMediaItem = bArr2;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 89;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(114363616 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (MotionEvent.axisFromString("") + 1), new char[]{57525, 53516, 49158, 2464}, new char[]{0, 0, 0, 0}, new char[]{26104, 58546, 12930, 37799, 11931, 12324, 6080, 24898, 50409}, objArr);
        Object obj = null;
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj2 != null) {
                int i4 = PlaybackStateCompat + 101;
                ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                    obj.hashCode();
                    throw null;
                }
                Object obj3 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                int i5 = ParcelableVolumeInfo + 123;
                PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a((-2123130292) - TextUtils.indexOf((CharSequence) "", '0'), (char) (17666 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), new char[]{19734, 29594, 385, 4933}, new char[]{0, 0, 0, 0}, new char[]{62884, 54058, 17901}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj3, objArr2);
            } else {
                Object obj4 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(View.MeasureSpec.getSize(0) + 1061898851, (char) ExpandableListView.getPackedPositionType(0L), new char[]{25475, 19274, 31295, 62915}, new char[]{0, 0, 0, 0}, new char[]{61479, 38835, 29186, 2009, 57120, 301, 63204, 3260, 60906, 33491, 37817, 25467, 1490, 37903, 33642, 36328, 56198, 40077, 50443, 62541, 32792, 1810, 24755, 62311, 5053, 5889, 59814, 36147, 29147, 48805, 30624, 56969, 13909, 17337, 40388, 20571, 35763}, objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj4, objArr6);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String IconCompatParcelizer(String str) {
        int i = 2 % 2;
        String str2 = (String) this.IconCompatParcelizer.get(str);
        if (str2 != null) {
            return str2;
        }
        int i2 = PlaybackStateCompat + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "";
    }

    public final int write(String str) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 125;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str2 = (String) this.IconCompatParcelizer.get(str);
        if (str2 != null) {
            return Integer.valueOf(str2).intValue();
        }
        int i4 = PlaybackStateCompat + 27;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 109;
        PlaybackStateCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final accessgetEndCallcp IconCompatParcelizer() {
        int i = 2 % 2;
        accessgetEndCallcp accessgetendcallcp = new accessgetEndCallcp();
        String str = this.RatingCompat;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null transportName");
            int i2 = PlaybackStateCompat + 33;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = ParcelableVolumeInfo + 47;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        accessgetendcallcp.MediaMetadataCompat = str;
        accessgetendcallcp.RemoteActionCompatParcelizer = this.read;
        accessgetendcallcp.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
        accessgetendcallcp.RatingCompat = this.MediaDescriptionCompat;
        accessgetendcallcp.serializer = this.serializer;
        accessgetendcallcp.MediaBrowserCompatMediaItem = this.MediaBrowserCompatMediaItem;
        accessgetF1cp accessgetf1cp = this.RemoteActionCompatParcelizer;
        if (accessgetf1cp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null encodedPayload");
            return null;
        }
        accessgetendcallcp.read = accessgetf1cp;
        accessgetendcallcp.IconCompatParcelizer = Long.valueOf(this.write);
        accessgetendcallcp.MediaDescriptionCompat = Long.valueOf(this.MediaMetadataCompat);
        accessgetendcallcp.write = new HashMap(this.IconCompatParcelizer);
        return accessgetendcallcp;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 33;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.RatingCompat.hashCode();
        Integer num = this.read;
        int iHashCode3 = 0;
        if (num == null) {
            int i4 = ParcelableVolumeInfo + 89;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        long j = this.write;
        int i6 = (int) (j ^ (j >>> 32));
        long j2 = this.MediaMetadataCompat;
        int i7 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode5 = this.IconCompatParcelizer.hashCode();
        Integer num2 = this.MediaSessionCompatQueueItem;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i8 = PlaybackStateCompat + 71;
            ParcelableVolumeInfo = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return ((Arrays.hashCode(this.serializer) ^ ((((((((((((((((iHashCode2 ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode4) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode3) * 1000003)) * 1000003) ^ Arrays.hashCode(this.MediaBrowserCompatMediaItem);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EventInternal{transportName=" + this.RatingCompat + ", code=" + this.read + ", encodedPayload=" + this.RemoteActionCompatParcelizer + ", eventMillis=" + this.write + ", uptimeMillis=" + this.MediaMetadataCompat + ", autoMetadata=" + this.IconCompatParcelizer + ", productId=" + this.MediaSessionCompatQueueItem + ", pseudonymousId=" + this.MediaDescriptionCompat + ", experimentIdsClear=" + Arrays.toString(this.serializer) + ", experimentIdsEncrypted=" + Arrays.toString(this.MediaBrowserCompatMediaItem) + "}";
        int i2 = ParcelableVolumeInfo + 15;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i4 = $10 + 1;
            $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Process.getGidForName("") + 1), android.graphics.Color.blue(0) + 231, AndroidCharacter.getMirror('0') - 27, 1436720535, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.green(0), 2545 - MotionEvent.axisFromString(""), android.graphics.Color.argb(0, 0, 0, 0) + 30, -73045399, false, $$d((byte) ($$c & 7), b, b), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {accesstooffsetmowrbkg, Integer.valueOf(cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 887, 60 - TextUtils.getOffsetAfter("", 0), -562850980, false, $$d(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char mode = (char) (65450 - View.MeasureSpec.getMode(0));
                    int i6 = 1244 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                    byte b4 = (byte) ($$c & 3);
                    byte b5 = (byte) (b4 - 3);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(mode, i6, iMakeMeasureSpec, 1854554309, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (PlaybackStateCompatCustomAction ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaSessionCompatResultReceiverWrapper) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaSessionCompatToken) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 115;
        $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 49 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de A[RETURN] */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        Object obj2;
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = PlaybackStateCompat + 93;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i6;
        int i7 = i5 % 2;
        if (obj == this) {
            int i8 = i6 + 115;
            PlaybackStateCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return true;
        }
        if (obj instanceof accessgetDvrcp) {
            accessgetDvrcp accessgetdvrcp = (accessgetDvrcp) obj;
            if (!(!this.RatingCompat.equals(accessgetdvrcp.RatingCompat))) {
                Integer num = accessgetdvrcp.read;
                Integer num2 = this.read;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.RemoteActionCompatParcelizer.equals(accessgetdvrcp.RemoteActionCompatParcelizer) && this.write == accessgetdvrcp.write && this.MediaMetadataCompat == accessgetdvrcp.MediaMetadataCompat) {
                        int i10 = ParcelableVolumeInfo + 63;
                        PlaybackStateCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        if (this.IconCompatParcelizer.equals(accessgetdvrcp.IconCompatParcelizer)) {
                            Integer num3 = accessgetdvrcp.MediaSessionCompatQueueItem;
                            Integer num4 = this.MediaSessionCompatQueueItem;
                            if (num4 != null) {
                                if (num4.equals(num3)) {
                                    str = accessgetdvrcp.MediaDescriptionCompat;
                                    str2 = this.MediaDescriptionCompat;
                                    obj2 = null;
                                    if (str2 == null) {
                                        if (str2.equals(str)) {
                                            z = accessgetdvrcp instanceof accessgetDvrcp;
                                            if (z) {
                                                bArr = accessgetdvrcp.serializer;
                                            } else {
                                                i2 = ParcelableVolumeInfo + 83;
                                                PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i2 % 2 != 0) {
                                                    bArr = accessgetdvrcp.serializer;
                                                    int i12 = 57 / 0;
                                                } else {
                                                    bArr = accessgetdvrcp.serializer;
                                                }
                                            }
                                            if (Arrays.equals(this.serializer, bArr)) {
                                                if (z) {
                                                    i = ParcelableVolumeInfo + 55;
                                                    PlaybackStateCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    if (i % 2 == 0) {
                                                        bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                    } else {
                                                        byte[] bArr3 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                        throw null;
                                                    }
                                                } else {
                                                    bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                }
                                                if (Arrays.equals(this.MediaBrowserCompatMediaItem, bArr2)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    } else {
                                        i3 = ParcelableVolumeInfo + 119;
                                        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i3 % 2 == 0) {
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (str == null) {
                                            z = accessgetdvrcp instanceof accessgetDvrcp;
                                            if (z) {
                                                bArr = accessgetdvrcp.serializer;
                                            } else {
                                                i2 = ParcelableVolumeInfo + 83;
                                                PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i2 % 2 != 0) {
                                                    bArr = accessgetdvrcp.serializer;
                                                    int i13 = 57 / 0;
                                                } else {
                                                    bArr = accessgetdvrcp.serializer;
                                                }
                                            }
                                            if (Arrays.equals(this.serializer, bArr)) {
                                                if (z) {
                                                    i = ParcelableVolumeInfo + 55;
                                                    PlaybackStateCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    if (i % 2 == 0) {
                                                        bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                    } else {
                                                        byte[] bArr4 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                        throw null;
                                                    }
                                                } else {
                                                    bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                }
                                                if (Arrays.equals(this.MediaBrowserCompatMediaItem, bArr2)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int i14 = PlaybackStateCompat + 37;
                                ParcelableVolumeInfo = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                if (num3 == null) {
                                    str = accessgetdvrcp.MediaDescriptionCompat;
                                    str2 = this.MediaDescriptionCompat;
                                    obj2 = null;
                                    if (str2 == null) {
                                        if (str2.equals(str)) {
                                            z = accessgetdvrcp instanceof accessgetDvrcp;
                                            if (z) {
                                                bArr = accessgetdvrcp.serializer;
                                            } else {
                                                i2 = ParcelableVolumeInfo + 83;
                                                PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i2 % 2 != 0) {
                                                    bArr = accessgetdvrcp.serializer;
                                                    int i16 = 57 / 0;
                                                } else {
                                                    bArr = accessgetdvrcp.serializer;
                                                }
                                            }
                                            if (Arrays.equals(this.serializer, bArr)) {
                                                if (z) {
                                                    i = ParcelableVolumeInfo + 55;
                                                    PlaybackStateCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    if (i % 2 == 0) {
                                                        bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                    } else {
                                                        byte[] bArr5 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                        throw null;
                                                    }
                                                } else {
                                                    bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                }
                                                if (Arrays.equals(this.MediaBrowserCompatMediaItem, bArr2)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    } else {
                                        i3 = ParcelableVolumeInfo + 119;
                                        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i3 % 2 == 0) {
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (str == null) {
                                            z = accessgetdvrcp instanceof accessgetDvrcp;
                                            if (z) {
                                                bArr = accessgetdvrcp.serializer;
                                            } else {
                                                i2 = ParcelableVolumeInfo + 83;
                                                PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i2 % 2 != 0) {
                                                    bArr = accessgetdvrcp.serializer;
                                                    int i17 = 57 / 0;
                                                } else {
                                                    bArr = accessgetdvrcp.serializer;
                                                }
                                            }
                                            if (Arrays.equals(this.serializer, bArr)) {
                                                if (z) {
                                                    i = ParcelableVolumeInfo + 55;
                                                    PlaybackStateCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    if (i % 2 == 0) {
                                                        bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                    } else {
                                                        byte[] bArr6 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                        throw null;
                                                    }
                                                } else {
                                                    bArr2 = accessgetdvrcp.MediaBrowserCompatMediaItem;
                                                }
                                                if (Arrays.equals(this.MediaBrowserCompatMediaItem, bArr2)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
