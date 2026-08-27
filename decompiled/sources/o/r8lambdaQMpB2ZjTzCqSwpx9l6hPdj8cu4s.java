package o;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import com.sentiance.core.model.datasync.CallEvent;
import com.sentiance.core.model.datasync.CallEvents;
import com.sentiance.core.model.datasync.Data;
import com.sentiance.core.model.datasync.DateTime;
import com.sentiance.core.model.datasync.GeoLocation;
import com.sentiance.core.model.datasync.Geofence;
import com.sentiance.core.model.datasync.GeofenceEvent;
import com.sentiance.core.model.datasync.GeofenceEventType;
import com.sentiance.core.model.datasync.OS;
import com.sentiance.core.model.datasync.OccupantRoleFeedback;
import com.sentiance.core.model.datasync.Payload;
import com.sentiance.core.model.datasync.PhoneUsageEvent;
import com.sentiance.core.model.datasync.SafetyScores;
import com.sentiance.core.model.datasync.Sdk;
import com.sentiance.core.model.datasync.SpeedingEvent;
import com.sentiance.core.model.datasync.SpeedingEvents;
import com.sentiance.core.model.datasync.TransportInfo;
import com.sentiance.core.model.datasync.TransportMode;
import com.sentiance.core.model.datasync.TransportOccupantRole;
import com.sentiance.core.model.datasync.TransportTag;
import com.sentiance.core.model.datasync.VehicleCrashDetectionFeedback;
import com.sentiance.core.model.datasync.VehicleCrashDetectionFeedbackAppInput;
import com.sentiance.core.model.datasync.VehicleCrashDetectionFeedbackSdkInput;
import com.sentiance.core.model.datasync.VehicleCrashEvent;
import com.sentiance.core.model.datasync.Waypoint;
import com.sentiance.core.model.datasync.WrongWayDrivingEvent;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.util.Optional;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s {
    private static short[] read;
    private static final byte[] $$b = {61, 70, 55};
    private static final int $$c = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int IconCompatParcelizer = -2044237971;
    private static int serializer = 459299276;
    private static int write = 639457923;
    private static byte[] RemoteActionCompatParcelizer = {107, -110, 111, -103, 101, -105, 106, -72, -101, 102, 107, 127, -123, 105, -97, 108, 97, -97, 111, -111, -35, 56, -111, -107, -38, 58, -103, 106, -108, 108, -73, -72, 114, 82, -106, -105, 107, -108, 111, -74, -89, 58, -103, -107, 111, -125, -108, -108, -108};

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(short r7, short r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = o.r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.$$b
            int r7 = 115 - r7
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.$$d(short, short, short):java.lang.String");
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a((byte) android.graphics.Color.argb(0, 0, 0, 0), (short) Drawable.resolveOpacity(0, 0), (-79) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1031602901) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1656275207 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i2 = MediaSessionCompatQueueItem + 109;
                MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a((byte) ExpandableListView.getPackedPositionType(0L), (short) (Process.myTid() >> 22), (-85) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1031602852) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1656275215 - android.view.KeyEvent.getDeadChar(0, 0), objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a((byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0) - 50, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1031602886, 1656275217 - TextUtils.indexOf("", ""), objArr5);
                String str = (String) objArr5[0];
                int i4 = MediaSessionCompatQueueItem + 61;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, str, objArr4);
                int i6 = MediaDescriptionCompat + 109;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 4;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01bf A[PHI: r0
  0x01bf: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:41:0x01bd, B:38:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x01c1 A[PHI: r0
  0x01c1: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:41:0x01bd, B:38:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(serializer)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                char cMakeMeasureSpec = (char) (15495 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int minimumFlingVelocity = 2821 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 17;
                byte b2 = (byte) ($$c & 1);
                byte b3 = (byte) (b2 - 1);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cMakeMeasureSpec, minimumFlingVelocity, offsetBefore, 1193962993, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = RemoteActionCompatParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char pressedStateDuration = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4453);
                                int iIndexOf = 2484 - TextUtils.indexOf("", "");
                                int minimumFlingVelocity2 = 18 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte b4 = (byte) ($$c & 10);
                                byte b5 = (byte) (b4 - 2);
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(pressedStateDuration, iIndexOf, minimumFlingVelocity2, 59692417, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $10 + 105;
                    $11 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    byte[] bArr3 = RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char scrollBarFadeDuration = (char) (15495 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2821;
                        int i10 = 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b6 = (byte) ($$c & 1);
                        byte b7 = (byte) (b6 - 1);
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, maximumDrawingCacheSize, i10, 1193962993, false, $$d(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) serializer) ^ (-565326573115254380L))));
                    int i11 = $11 + 1;
                    $10 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) read[i3 + ((int) (((long) IconCompatParcelizer) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) serializer) ^ (-565326573115254380L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 121;
                $10 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    i4 = ((i3 / iIntValue) - 4) + ((int) (((long) IconCompatParcelizer) | (-565326573115254380L)));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) IconCompatParcelizer) ^ (-565326573115254380L)));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                toviewvelocity.RemoteActionCompatParcelizer = i4 + i5;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i2), Integer.valueOf(write), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getOffsetBefore("", 0), Drawable.resolveOpacity(0, 0) + 2411, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, 1203812429, false, $$d(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = RemoteActionCompatParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-565326573115254380L));
                    }
                    int i15 = $10 + 51;
                    $11 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    if (z2) {
                        int i17 = $11 + 105;
                        $10 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        byte[] bArr6 = RemoteActionCompatParcelizer;
                        int i19 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i19 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i19]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = read;
                        int i20 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i20 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i20]) ^ (-565326573115254380L))) + s)) ^ b));
                    }
                    sb.append(toviewvelocity.serializer);
                    toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                    toviewvelocity.read++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01ac A[PHI: r14
  0x01ac: PHI (r14v52 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) = (r14v51 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ), (r14v63 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) binds: [B:45:0x01aa, B:42:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ae A[PHI: r14 r15
  0x01ae: PHI (r14v61 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) = (r14v51 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ), (r14v63 o.r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) binds: [B:45:0x01aa, B:42:0x019d] A[DONT_GENERATE, DONT_INLINE]
  0x01ae: PHI (r15v11 com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType) = 
  (r15v8 com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType)
  (r15v14 com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType)
 binds: [B:45:0x01aa, B:42:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public static final Payload RemoteActionCompatParcelizer(getConversationalPushStyle getconversationalpushstyle, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, ConfigurationManager configurationManager) {
        ?? arrayList;
        TransportMode transportMode;
        ?? arrayList2;
        ?? arrayList3;
        ArrayList arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        ?? arrayList7;
        r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ r8lambdarwoojtarbuu1yb4g_0x9vnceeq;
        SafetyScoreType safetyScoreTypeSerializer;
        int i;
        int i2 = 2 % 2;
        getconversationalpushstyle.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        configurationManager.getClass();
        boolean zAddOnNewIntentListener = configurationManager.addOnNewIntentListener();
        boolean zAddOnConfigurationChangedListener = configurationManager.addOnConfigurationChangedListener();
        if (!configurationManager.write((byte) 0) && (!configurationManager.write((byte) 1) || getconversationalpushstyle.MediaMetadataCompat().isEmpty())) {
            return null;
        }
        String strM = d$$ExternalSyntheticOutline0.m();
        configurelambda10 configurelambda10VarNewBuilder = Payload.newBuilder();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setUuid(strM);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, System.currentTimeMillis(), migratefeatureflagstoragetojsonlambda20);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setCreationTime(dateTimeRemoteActionCompatParcelizer);
        Sdk sdkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaw447glwjfoun4bg91upxnadqezs);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setSdk(sdkRemoteActionCompatParcelizer);
        r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder = Data.newBuilder();
        Iterable iterable = instance_delegatelambda0.write;
        if (zAddOnNewIntentListener) {
            arrayList = iterable;
        } else {
            List<handleLogClickdefault> listIconCompatParcelizer = getconversationalpushstyle.IconCompatParcelizer();
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
            Iterator it = listIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int i3 = MediaSessionCompatQueueItem + 99;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                arrayList.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer((handleLogClickdefault) it.next(), migratefeatureflagstoragetojsonlambda20));
            }
        }
        enableSdklambda1 enablesdklambda1NewBuilder = TransportInfo.newBuilder();
        String strMediaDescriptionCompat = getconversationalpushstyle.MediaDescriptionCompat();
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).setEventId(strMediaDescriptionCompat);
        TransportChangeType transportChangeTypeWrite = getconversationalpushstyle.write();
        switch (r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.IconCompatParcelizer[transportChangeTypeWrite.ordinal()]) {
            case 1:
                transportMode = TransportMode.TRANSPORT_MODE_UNKNOWN;
                break;
            case 2:
                transportMode = TransportMode.TRANSPORT_MODE_BICYCLE;
                break;
            case 3:
                transportMode = TransportMode.TRANSPORT_MODE_WALKING;
                break;
            case 4:
                transportMode = TransportMode.TRANSPORT_MODE_RUNNING;
                break;
            case 5:
                transportMode = TransportMode.TRANSPORT_MODE_TRAM;
                break;
            case 6:
                transportMode = TransportMode.TRANSPORT_MODE_TRAIN;
                break;
            case 7:
                transportMode = TransportMode.TRANSPORT_MODE_CAR;
                break;
            case 8:
                transportMode = TransportMode.TRANSPORT_MODE_BUS;
                break;
            case 9:
                transportMode = TransportMode.TRANSPORT_MODE_MOTORCYCLE;
                break;
            case 10:
                transportMode = TransportMode.TRANSPORT_MODE_RAIL;
                break;
            case 11:
                transportMode = TransportMode.TRANSPORT_MODE_VEHICLE;
                break;
            case 12:
                transportMode = TransportMode.TRANSPORT_MODE_ON_FOOT;
                break;
            case 13:
                transportMode = TransportMode.TRANSPORT_MODE_IDLE;
                break;
            default:
                Gson$$ExternalSyntheticBUOutline0.m(transportChangeTypeWrite, "Unsupported transport mode: ");
                return null;
        }
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).setMode(transportMode);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, getconversationalpushstyle.PlaybackStateCompat(), migratefeatureflagstoragetojsonlambda20);
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer2);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer3 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3, getconversationalpushstyle.MediaSessionCompatQueueItem(), migratefeatureflagstoragetojsonlambda20);
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).setStop(dateTimeRemoteActionCompatParcelizer3);
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).addAllWaypoints(arrayList);
        List<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> listMediaMetadataCompat = getconversationalpushstyle.MediaMetadataCompat();
        ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(listMediaMetadataCompat, 10));
        for (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0 : listMediaMetadataCompat) {
            getSdkEnablementProviderandroid_sdk_base_releaseannotations getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder = VehicleCrashEvent.newBuilder();
            getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder.getClass();
            arrayList8.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder, r8lambda5plvmmyc7msph8a8xignikxwbe0, migratefeatureflagstoragetojsonlambda20, zAddOnNewIntentListener));
        }
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).addAllVehicleCrashEvents(arrayList8);
        disableDelayedInitializationlambda0 disabledelayedinitializationlambda0NewBuilder = SafetyScores.newBuilder();
        disabledelayedinitializationlambda0NewBuilder.getClass();
        Iterator it2 = getconversationalpushstyle.ParcelableVolumeInfo().iterator();
        while (it2.hasNext()) {
            int i5 = MediaSessionCompatQueueItem + 77;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                r8lambdarwoojtarbuu1yb4g_0x9vnceeq = (r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) it2.next();
                safetyScoreTypeSerializer = r8lambdarwoojtarbuu1yb4g_0x9vnceeq.serializer();
                int i6 = 2 / 0;
                if (safetyScoreTypeSerializer == null) {
                    i = -1;
                } else {
                    i = r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.write[safetyScoreTypeSerializer.ordinal()];
                    int i7 = MediaDescriptionCompat + 113;
                    MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            } else {
                r8lambdarwoojtarbuu1yb4g_0x9vnceeq = (r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) it2.next();
                safetyScoreTypeSerializer = r8lambdarwoojtarbuu1yb4g_0x9vnceeq.serializer();
                if (safetyScoreTypeSerializer == null) {
                    i = -1;
                } else {
                    i = r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.write[safetyScoreTypeSerializer.ordinal()];
                    int i9 = MediaDescriptionCompat + 113;
                    MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            }
            switch (i) {
                case 1:
                    float f = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setSmooth(f);
                    break;
                case 2:
                    float f2 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setLegal(f2);
                    break;
                case 3:
                    float f3 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setOverallSafety(f3);
                    break;
                case 4:
                    float f4 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setFocus(f4);
                    break;
                case 5:
                    float f5 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setCallWhileMoving(f5);
                    break;
                case 6:
                    float f6 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setWrongWayDriving(f6);
                    break;
                case 7:
                    float f7 = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
                    disabledelayedinitializationlambda0NewBuilder.serializer();
                    ((SafetyScores) disabledelayedinitializationlambda0NewBuilder.write).setAttention(f7);
                    break;
            }
        }
        SafetyScores safetyScores = (SafetyScores) disabledelayedinitializationlambda0NewBuilder.write();
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).setSafetyScores(safetyScores);
        List<r8lambdaToWEBn4vVR9WqvyA_znNRwHzM> listRatingCompat = getconversationalpushstyle.RatingCompat();
        ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(listRatingCompat, 10));
        Iterator it3 = listRatingCompat.iterator();
        while (it3.hasNext()) {
            arrayList9.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.write((r8lambdaToWEBn4vVR9WqvyA_znNRwHzM) it3.next(), migratefeatureflagstoragetojsonlambda20, zAddOnNewIntentListener));
        }
        enablesdklambda1NewBuilder.serializer();
        ((TransportInfo) enablesdklambda1NewBuilder.write).addAllHarshDrivingEvents(arrayList9);
        List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> listMediaSessionCompatResultReceiverWrapper = getconversationalpushstyle.MediaSessionCompatResultReceiverWrapper();
        ArrayList arrayList10 = new ArrayList(accessgetInstancedelegatecp.write(listMediaSessionCompatResultReceiverWrapper, 10));
        for (r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj0 : listMediaSessionCompatResultReceiverWrapper) {
            r8lambdauqhb7dt0btnjovszzbervrbdwj0.getClass();
            disableSdklambda1 disablesdklambda1NewBuilder = PhoneUsageEvent.newBuilder();
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder4 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder4.getClass();
            enableSdklambda1 enablesdklambda1 = enablesdklambda1NewBuilder;
            DateTime dateTimeRemoteActionCompatParcelizer4 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder4, r8lambdauqhb7dt0btnjovszzbervrbdwj0.serializer(), migratefeatureflagstoragetojsonlambda20);
            disablesdklambda1NewBuilder.serializer();
            ((PhoneUsageEvent) disablesdklambda1NewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer4);
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder5 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder5.getClass();
            DateTime dateTimeRemoteActionCompatParcelizer5 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder5, r8lambdauqhb7dt0btnjovszzbervrbdwj0.IconCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
            disablesdklambda1NewBuilder.serializer();
            ((PhoneUsageEvent) disablesdklambda1NewBuilder.write).setEnd(dateTimeRemoteActionCompatParcelizer5);
            if (zAddOnNewIntentListener) {
                arrayList7 = iterable;
            } else {
                List<handleLogClickdefault> listMediaDescriptionCompat = r8lambdauqhb7dt0btnjovszzbervrbdwj0.MediaDescriptionCompat();
                arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(listMediaDescriptionCompat, 10));
                Iterator it4 = listMediaDescriptionCompat.iterator();
                while (it4.hasNext()) {
                    int i11 = MediaDescriptionCompat + 33;
                    MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    arrayList7.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer((handleLogClickdefault) it4.next(), migratefeatureflagstoragetojsonlambda20));
                }
            }
            disablesdklambda1NewBuilder.serializer();
            ((PhoneUsageEvent) disablesdklambda1NewBuilder.write).addAllWaypoints(arrayList7);
            boolean zWrite = r8lambdauqhb7dt0btnjovszzbervrbdwj0.write();
            disablesdklambda1NewBuilder.serializer();
            ((PhoneUsageEvent) disablesdklambda1NewBuilder.write).setIsCallInProgress(zWrite);
            arrayList10.add((PhoneUsageEvent) disablesdklambda1NewBuilder.write());
            enablesdklambda1NewBuilder = enablesdklambda1;
        }
        enableSdklambda1 enablesdklambda2 = enablesdklambda1NewBuilder;
        enablesdklambda2.serializer();
        ((TransportInfo) enablesdklambda2.write).addAllPhoneUsageEvents(arrayList10);
        List<r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc> list = getconversationalpushstyle.read();
        r8lambdaY3dtkULL93vi8xHNZeBitkB4C4 r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder = CallEvents.newBuilder();
        r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.serializer();
        ((CallEvents) r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.write).setIsCallDetectionAttempted(true);
        ArrayList arrayList11 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc r8lambdasfg0h956dzq3kmqujvkuygx6fc : list) {
            int i13 = MediaSessionCompatQueueItem + 85;
            MediaDescriptionCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            r8lambdasfg0h956dzq3kmqujvkuygx6fc.getClass();
            r8lambdagYqwiMZfyjqAmRs9yp00LePsOs r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder = CallEvent.newBuilder();
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder6 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder6.getClass();
            DateTime dateTimeRemoteActionCompatParcelizer6 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder6, r8lambdasfg0h956dzq3kmqujvkuygx6fc.serializer(), migratefeatureflagstoragetojsonlambda20);
            r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
            ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer6);
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder7 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder7.getClass();
            DateTime dateTimeRemoteActionCompatParcelizer7 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder7, r8lambdasfg0h956dzq3kmqujvkuygx6fc.IconCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
            r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
            ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).setEnd(dateTimeRemoteActionCompatParcelizer7);
            if (zAddOnNewIntentListener) {
                arrayList6 = iterable;
            } else {
                List<handleLogClickdefault> listMediaDescriptionCompat2 = r8lambdasfg0h956dzq3kmqujvkuygx6fc.MediaDescriptionCompat();
                arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(listMediaDescriptionCompat2, 10));
                Iterator it5 = listMediaDescriptionCompat2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer((handleLogClickdefault) it5.next(), migratefeatureflagstoragetojsonlambda20));
                }
            }
            r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
            ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).addAllWaypoints(arrayList6);
            if (r8lambdasfg0h956dzq3kmqujvkuygx6fc.read() == null) {
                int i15 = MediaDescriptionCompat + 61;
                MediaSessionCompatQueueItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                    ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).clearMinSpeedMps2();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).clearMinSpeedMps2();
            } else {
                float fFloatValue = r8lambdasfg0h956dzq3kmqujvkuygx6fc.read().floatValue();
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).setMinSpeedMps2(fFloatValue);
            }
            if (r8lambdasfg0h956dzq3kmqujvkuygx6fc.write() == null) {
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).clearMaxSpeedMps2();
            } else {
                float fFloatValue2 = r8lambdasfg0h956dzq3kmqujvkuygx6fc.write().floatValue();
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).setMaxSpeedMps2(fFloatValue2);
            }
            if (r8lambdasfg0h956dzq3kmqujvkuygx6fc.RemoteActionCompatParcelizer() == null) {
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).clearIsHandsFree();
            } else {
                boolean zBooleanValue = r8lambdasfg0h956dzq3kmqujvkuygx6fc.RemoteActionCompatParcelizer().booleanValue();
                r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.serializer();
                ((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write).setIsHandsFree(zBooleanValue);
                int i16 = MediaDescriptionCompat + 107;
                MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            arrayList11.add((CallEvent) r8lambdagyqwimzfyjqamrs9yp00lepsosNewBuilder.write());
        }
        r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.serializer();
        ((CallEvents) r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.write).addAllCallEvents(arrayList11);
        CallEvents callEvents = (CallEvents) r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.write();
        enablesdklambda2.serializer();
        ((TransportInfo) enablesdklambda2.write).setCallEvents(callEvents);
        List<r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80> listMediaSessionCompatToken = getconversationalpushstyle.MediaSessionCompatToken();
        enableMockNetworkRequestsAndDropEventsModelambda00 enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder = SpeedingEvents.newBuilder();
        ArrayList arrayList12 = new ArrayList(accessgetInstancedelegatecp.write(listMediaSessionCompatToken, 10));
        for (r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80 r8lambdarledsxhyru7hnnayr0dpxgvox80 : listMediaSessionCompatToken) {
            if (zAddOnNewIntentListener) {
                arrayList5 = iterable;
            } else {
                List<handleLogClickdefault> listMediaDescriptionCompat3 = r8lambdarledsxhyru7hnnayr0dpxgvox80.MediaDescriptionCompat();
                arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(listMediaDescriptionCompat3, 10));
                Iterator it6 = listMediaDescriptionCompat3.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer((handleLogClickdefault) it6.next(), migratefeatureflagstoragetojsonlambda20));
                }
            }
            enableDelayedInitializationlambda2 enabledelayedinitializationlambda2NewBuilder = SpeedingEvent.newBuilder();
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder8 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder8.getClass();
            DateTime dateTimeRemoteActionCompatParcelizer8 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder8, r8lambdarledsxhyru7hnnayr0dpxgvox80.serializer(), migratefeatureflagstoragetojsonlambda20);
            enabledelayedinitializationlambda2NewBuilder.serializer();
            ((SpeedingEvent) enabledelayedinitializationlambda2NewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer8);
            r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder9 = DateTime.newBuilder();
            r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder9.getClass();
            DateTime dateTimeRemoteActionCompatParcelizer9 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder9, r8lambdarledsxhyru7hnnayr0dpxgvox80.IconCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
            enabledelayedinitializationlambda2NewBuilder.serializer();
            ((SpeedingEvent) enabledelayedinitializationlambda2NewBuilder.write).setEnd(dateTimeRemoteActionCompatParcelizer9);
            enabledelayedinitializationlambda2NewBuilder.serializer();
            ((SpeedingEvent) enabledelayedinitializationlambda2NewBuilder.write).addAllWaypoints(arrayList5);
            arrayList12.add((SpeedingEvent) enabledelayedinitializationlambda2NewBuilder.write());
            zAddOnNewIntentListener = zAddOnNewIntentListener;
        }
        boolean z = zAddOnNewIntentListener;
        enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder.serializer();
        ((SpeedingEvents) enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder.write).addAllSpeedingEvents(arrayList12);
        SpeedingEvents speedingEvents = (SpeedingEvents) enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder.write();
        enablesdklambda2.serializer();
        ((TransportInfo) enablesdklambda2.write).setSpeedingEvents(speedingEvents);
        TransportOccupantRole transportOccupantRoleSerializer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer(getconversationalpushstyle.MediaBrowserCompatMediaItem());
        enablesdklambda2.serializer();
        ((TransportInfo) enablesdklambda2.write).setTransportOccupantRole(transportOccupantRoleSerializer);
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iqSerializer = getconversationalpushstyle.serializer();
        if (r8lambdavofb8wwxngiixelwle1ybluc3iqSerializer.read()) {
            arrayList2 = iterable;
        } else {
            List<r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ> listRemoteActionCompatParcelizer = r8lambdavofb8wwxngiixelwle1ybluc3iqSerializer.RemoteActionCompatParcelizer();
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
            for (r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ r8lambdaw2zgeworkx0mwnt812prufswtq : listRemoteActionCompatParcelizer) {
                isDelayedInitializationEnabledannotations isdelayedinitializationenabledannotationsNewBuilder = WrongWayDrivingEvent.newBuilder();
                r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder10 = DateTime.newBuilder();
                r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder10.getClass();
                DateTime dateTimeRemoteActionCompatParcelizer10 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder10, r8lambdaw2zgeworkx0mwnt812prufswtq.serializer(), migratefeatureflagstoragetojsonlambda20);
                isdelayedinitializationenabledannotationsNewBuilder.serializer();
                ((WrongWayDrivingEvent) isdelayedinitializationenabledannotationsNewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer10);
                r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder11 = DateTime.newBuilder();
                r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder11.getClass();
                DateTime dateTimeRemoteActionCompatParcelizer11 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder11, r8lambdaw2zgeworkx0mwnt812prufswtq.IconCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
                isdelayedinitializationenabledannotationsNewBuilder.serializer();
                ((WrongWayDrivingEvent) isdelayedinitializationenabledannotationsNewBuilder.write).setEnd(dateTimeRemoteActionCompatParcelizer11);
                if (z) {
                    arrayList3 = iterable;
                } else {
                    List<handleLogClickdefault> listMediaDescriptionCompat4 = r8lambdaw2zgeworkx0mwnt812prufswtq.MediaDescriptionCompat();
                    arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(listMediaDescriptionCompat4, 10));
                    Iterator it7 = listMediaDescriptionCompat4.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer((handleLogClickdefault) it7.next(), migratefeatureflagstoragetojsonlambda20));
                    }
                }
                isdelayedinitializationenabledannotationsNewBuilder.serializer();
                ((WrongWayDrivingEvent) isdelayedinitializationenabledannotationsNewBuilder.write).addAllWaypoints(arrayList3);
                arrayList2.add((WrongWayDrivingEvent) isdelayedinitializationenabledannotationsNewBuilder.write());
            }
        }
        enablesdklambda2.serializer();
        ((TransportInfo) enablesdklambda2.write).addAllWrongWayDrivingEvents(arrayList2);
        if (zAddOnConfigurationChangedListener) {
            int i18 = MediaDescriptionCompat + 47;
            MediaSessionCompatQueueItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            parseString parsestringPlaybackStateCompatCustomAction = getconversationalpushstyle.PlaybackStateCompatCustomAction();
            if (parsestringPlaybackStateCompatCustomAction != null) {
                Map<String, String> map = parsestringPlaybackStateCompatCustomAction.read();
                arrayList4 = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    int i20 = MediaSessionCompatQueueItem + 57;
                    MediaDescriptionCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    getDeviceDataProviderandroid_sdk_base_releaseannotations getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder = TransportTag.newBuilder();
                    String key = entry.getKey();
                    getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder.serializer();
                    ((TransportTag) getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder.write).setName(key);
                    String value = entry.getValue();
                    getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder.serializer();
                    ((TransportTag) getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder.write).setValue(value);
                    arrayList4.add((TransportTag) getdevicedataproviderandroid_sdk_base_releaseannotationsNewBuilder.write());
                }
            } else {
                arrayList4 = null;
            }
            if (arrayList4 != null) {
                iterable = arrayList4;
            }
            enablesdklambda2.serializer();
            ((TransportInfo) enablesdklambda2.write).addAllTransportTags(iterable);
        }
        Integer numRemoteActionCompatParcelizer = getconversationalpushstyle.RemoteActionCompatParcelizer();
        if (numRemoteActionCompatParcelizer != null) {
            int i22 = MediaSessionCompatQueueItem + 117;
            MediaDescriptionCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i23 = i22 % 2;
            int iIntValue = numRemoteActionCompatParcelizer.intValue();
            enablesdklambda2.serializer();
            ((TransportInfo) enablesdklambda2.write).setTravelledDistanceMeters(iIntValue);
        }
        TransportInfo transportInfo = (TransportInfo) enablesdklambda2.write();
        r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.serializer();
        ((Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write).setTransportInfo(transportInfo);
        Data data = (Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setData(data);
        return (Payload) configurelambda10VarNewBuilder.write();
    }

    public static final Payload serializer(getFlushMaxMinutes getflushmaxminutes, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs) {
        int i = 2 % 2;
        getflushmaxminutes.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        configurelambda10 configurelambda10VarNewBuilder = Payload.newBuilder();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setUuid(string);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, System.currentTimeMillis(), migratefeatureflagstoragetojsonlambda20);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setCreationTime(dateTimeRemoteActionCompatParcelizer);
        Sdk sdkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaw447glwjfoun4bg91upxnadqezs);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setSdk(sdkRemoteActionCompatParcelizer);
        r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder = Data.newBuilder();
        configurelambda11 configurelambda11VarNewBuilder = OccupantRoleFeedback.newBuilder();
        String strMediaSessionCompatQueueItem = getflushmaxminutes.MediaSessionCompatQueueItem();
        configurelambda11VarNewBuilder.serializer();
        ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setTransportId(strMediaSessionCompatQueueItem);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, getflushmaxminutes.RemoteActionCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
        configurelambda11VarNewBuilder.serializer();
        ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setFeedbackTime(dateTimeRemoteActionCompatParcelizer2);
        TransportOccupantRole transportOccupantRoleSerializer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer(getflushmaxminutes.serializer());
        configurelambda11VarNewBuilder.serializer();
        ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setPredictedOccupantRole(transportOccupantRoleSerializer);
        TransportOccupantRole transportOccupantRoleSerializer2 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.serializer(getflushmaxminutes.write().toOccupantRole());
        configurelambda11VarNewBuilder.serializer();
        ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setFeedbackOccupantRole(transportOccupantRoleSerializer2);
        Double dIconCompatParcelizer = getflushmaxminutes.IconCompatParcelizer();
        Object obj = null;
        if (dIconCompatParcelizer != null) {
            int i2 = MediaSessionCompatQueueItem + 65;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                float fDoubleValue = (float) dIconCompatParcelizer.doubleValue();
                configurelambda11VarNewBuilder.serializer();
                ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setProbability(fDoubleValue);
                throw null;
            }
            float fDoubleValue2 = (float) dIconCompatParcelizer.doubleValue();
            configurelambda11VarNewBuilder.serializer();
            ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setProbability(fDoubleValue2);
        }
        Double d = getflushmaxminutes.read();
        if (d != null) {
            float fDoubleValue3 = (float) d.doubleValue();
            configurelambda11VarNewBuilder.serializer();
            ((OccupantRoleFeedback) configurelambda11VarNewBuilder.write).setThreshold(fDoubleValue3);
        }
        OccupantRoleFeedback occupantRoleFeedback = (OccupantRoleFeedback) configurelambda11VarNewBuilder.write();
        r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.serializer();
        ((Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write).setOccupantRoleFeedback(occupantRoleFeedback);
        Data data = (Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setData(data);
        Payload payload = (Payload) configurelambda10VarNewBuilder.write();
        int i3 = MediaDescriptionCompat + 125;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return payload;
        }
        obj.hashCode();
        throw null;
    }

    @SuppressLint
    public static final Payload read(r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, ConfigurationManager configurationManager, long j) {
        GeofenceEventType geofenceEventType;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda9xibbb_uawpsuoulwklfvxtang.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        configurationManager.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        configurelambda10 configurelambda10VarNewBuilder = Payload.newBuilder();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setUuid(string);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, System.currentTimeMillis(), migratefeatureflagstoragetojsonlambda20);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setCreationTime(dateTimeRemoteActionCompatParcelizer);
        Sdk sdkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaw447glwjfoun4bg91upxnadqezs);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setSdk(sdkRemoteActionCompatParcelizer);
        r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder = Data.newBuilder();
        _set_outboundNetworkRequestsOffline_lambda0 _set_outboundnetworkrequestsoffline_lambda0NewBuilder = GeofenceEvent.newBuilder();
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, j, migratefeatureflagstoragetojsonlambda20);
        _set_outboundnetworkrequestsoffline_lambda0NewBuilder.serializer();
        ((GeofenceEvent) _set_outboundnetworkrequestsoffline_lambda0NewBuilder.write).setTime(dateTimeRemoteActionCompatParcelizer2);
        Byte b = r8lambda9xibbb_uawpsuoulwklfvxtang.serializer;
        b.getClass();
        byte bByteValue = b.byteValue();
        Waypoint waypoint = null;
        Float fValueOf = null;
        if (bByteValue == 1) {
            geofenceEventType = GeofenceEventType.GEOFENCE_EVENT_TYPE_ENTRY;
        } else {
            if (bByteValue != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(bByteValue, "Unknown smart geofence event type: "));
                return null;
            }
            geofenceEventType = GeofenceEventType.GEOFENCE_EVENT_TYPE_EXIT;
        }
        _set_outboundnetworkrequestsoffline_lambda0NewBuilder.serializer();
        ((GeofenceEvent) _set_outboundnetworkrequestsoffline_lambda0NewBuilder.write).setType(geofenceEventType);
        List list = r8lambda9xibbb_uawpsuoulwklfvxtang.read;
        list.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        int i4 = MediaSessionCompatQueueItem + 23;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 5 / 2;
        }
        while (!(!it.hasNext())) {
            r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E r8lambda6bgutj7riyvbau8xsuqbilxtz6e = (r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E) it.next();
            r8lambda6bgutj7riyvbau8xsuqbilxtz6e.getClass();
            _get_isDisabled_lambda1 _get_isdisabled_lambda1NewBuilder = Geofence.newBuilder();
            String str = r8lambda6bgutj7riyvbau8xsuqbilxtz6e.write;
            _get_isdisabled_lambda1NewBuilder.serializer();
            ((Geofence) _get_isdisabled_lambda1NewBuilder.write).setSentianceId(str);
            String str2 = r8lambda6bgutj7riyvbau8xsuqbilxtz6e.MediaDescriptionCompat;
            _get_isdisabled_lambda1NewBuilder.serializer();
            ((Geofence) _get_isdisabled_lambda1NewBuilder.write).setGeofenceListId(str2);
            arrayList.add((Geofence) _get_isdisabled_lambda1NewBuilder.write());
        }
        _set_outboundnetworkrequestsoffline_lambda0NewBuilder.serializer();
        ((GeofenceEvent) _set_outboundnetworkrequestsoffline_lambda0NewBuilder.write).addAllGeofences(arrayList);
        if (configurationManager.onBackPressedDispatcher_delegatelambda00()) {
            int i6 = MediaSessionCompatQueueItem + 17;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambda9xibbb_uawpsuoulwklfvxtang.RemoteActionCompatParcelizer;
            if (brazeCompanionExternalSyntheticLambda4 != null) {
                isDisabledannotations isdisabledannotationsNewBuilder = Waypoint.newBuilder();
                double dIntValue = ((double) brazeCompanionExternalSyntheticLambda4.read.intValue()) / 100000.0d;
                double dIntValue2 = ((double) brazeCompanionExternalSyntheticLambda4.write.intValue()) / 100000.0d;
                Short sh = brazeCompanionExternalSyntheticLambda4.serializer;
                GeoLocation geoLocationRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(dIntValue, dIntValue2, sh != null ? Integer.valueOf(sh.shortValue()) : null);
                isdisabledannotationsNewBuilder.serializer();
                ((Waypoint) isdisabledannotationsNewBuilder.write).setLocation(geoLocationRemoteActionCompatParcelizer);
                r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3 = DateTime.newBuilder();
                r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3.getClass();
                Long l = brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer;
                l.getClass();
                DateTime dateTimeRemoteActionCompatParcelizer3 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3, l.longValue(), migratefeatureflagstoragetojsonlambda20);
                isdisabledannotationsNewBuilder.serializer();
                ((Waypoint) isdisabledannotationsNewBuilder.write).setTimestamp(dateTimeRemoteActionCompatParcelizer3);
                Short sh2 = brazeCompanionExternalSyntheticLambda4.RatingCompat;
                if (sh2 != null) {
                    int i8 = MediaSessionCompatQueueItem + 15;
                    MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    fValueOf = Float.valueOf(sh2.shortValue());
                    int i10 = MediaSessionCompatQueueItem + 81;
                    MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        int i11 = 4 / 4;
                    }
                }
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    isdisabledannotationsNewBuilder.serializer();
                    ((Waypoint) isdisabledannotationsNewBuilder.write).setSpeedMps(fFloatValue);
                } else {
                    isdisabledannotationsNewBuilder.serializer();
                    ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedMps();
                }
                isdisabledannotationsNewBuilder.serializer();
                ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedLimit();
                waypoint = (Waypoint) isdisabledannotationsNewBuilder.write();
            }
            _set_outboundnetworkrequestsoffline_lambda0NewBuilder.serializer();
            ((GeofenceEvent) _set_outboundnetworkrequestsoffline_lambda0NewBuilder.write).setTriggeringWaypoint(waypoint);
        }
        GeofenceEvent geofenceEvent = (GeofenceEvent) _set_outboundnetworkrequestsoffline_lambda0NewBuilder.write();
        r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.serializer();
        ((Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write).setGeofenceEvent(geofenceEvent);
        Data data = (Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setData(data);
        return (Payload) configurelambda10VarNewBuilder.write();
    }

    public static final Payload serializer(invokeSuspendlambda1 invokesuspendlambda1, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, long j, List<? extends r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> list, String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        invokesuspendlambda1.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        configurelambda10 configurelambda10VarNewBuilder = Payload.newBuilder();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setUuid(string);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, System.currentTimeMillis(), migratefeatureflagstoragetojsonlambda20);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setCreationTime(dateTimeRemoteActionCompatParcelizer);
        Sdk sdkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaw447glwjfoun4bg91upxnadqezs);
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setSdk(sdkRemoteActionCompatParcelizer);
        r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder = Data.newBuilder();
        getConfiguredApiKeylambda0 getconfiguredapikeylambda0NewBuilder = VehicleCrashDetectionFeedback.newBuilder();
        getCustomBrazeNotificationFactoryannotations getcustombrazenotificationfactoryannotationsNewBuilder = VehicleCrashDetectionFeedbackAppInput.newBuilder();
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        Long l = invokesuspendlambda1.IconCompatParcelizer;
        l.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, l.longValue(), migratefeatureflagstoragetojsonlambda20);
        getcustombrazenotificationfactoryannotationsNewBuilder.serializer();
        ((VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.write).setEventTime(dateTimeRemoteActionCompatParcelizer2);
        Boolean bool = invokesuspendlambda1.read;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        getcustombrazenotificationfactoryannotationsNewBuilder.serializer();
        ((VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.write).setIsCrash(zBooleanValue);
        Boolean bool2 = invokesuspendlambda1.MediaDescriptionCompat;
        bool2.getClass();
        boolean zBooleanValue2 = bool2.booleanValue();
        getcustombrazenotificationfactoryannotationsNewBuilder.serializer();
        ((VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.write).setCrashDetectedBySdk(zBooleanValue2);
        Integer num = invokesuspendlambda1.serializer;
        Integer num2 = invokesuspendlambda1.write;
        if (num != null) {
            int i4 = MediaSessionCompatQueueItem + 19;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (num2 != null) {
                GeoLocation geoLocationRemoteActionCompatParcelizer = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(((double) num.intValue()) / 100000.0d, ((double) num2.intValue()) / 100000.0d, (Integer) null);
                getcustombrazenotificationfactoryannotationsNewBuilder.serializer();
                ((VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.write).setEventLocation(geoLocationRemoteActionCompatParcelizer);
            }
        }
        VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput = (VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.write();
        getconfiguredapikeylambda0NewBuilder.serializer();
        ((VehicleCrashDetectionFeedback) getconfiguredapikeylambda0NewBuilder.write).setAppInput(vehicleCrashDetectionFeedbackAppInput);
        getInstancelambda00 getinstancelambda00NewBuilder = VehicleCrashDetectionFeedbackSdkInput.newBuilder();
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer3 = r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder3, j, migratefeatureflagstoragetojsonlambda20);
        getinstancelambda00NewBuilder.serializer();
        ((VehicleCrashDetectionFeedbackSdkInput) getinstancelambda00NewBuilder.write).setFeedbackTime(dateTimeRemoteActionCompatParcelizer3);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0 : list) {
            getSdkEnablementProviderandroid_sdk_base_releaseannotations getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder = VehicleCrashEvent.newBuilder();
            getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder.getClass();
            arrayList.add(r8lambdaRCRU6D22OHh6TjuvCYuaaTno78.RemoteActionCompatParcelizer(getsdkenablementproviderandroid_sdk_base_releaseannotationsNewBuilder, r8lambda5plvmmyc7msph8a8xignikxwbe0, migratefeatureflagstoragetojsonlambda20, false));
            int i5 = MediaDescriptionCompat + 63;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        getinstancelambda00NewBuilder.serializer();
        ((VehicleCrashDetectionFeedbackSdkInput) getinstancelambda00NewBuilder.write).addAllCrashEventsInRange(arrayList);
        if (str != null) {
            getinstancelambda00NewBuilder.serializer();
            ((VehicleCrashDetectionFeedbackSdkInput) getinstancelambda00NewBuilder.write).setTimelineEventId(str);
            int i7 = MediaDescriptionCompat + 91;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput = (VehicleCrashDetectionFeedbackSdkInput) getinstancelambda00NewBuilder.write();
        getconfiguredapikeylambda0NewBuilder.serializer();
        ((VehicleCrashDetectionFeedback) getconfiguredapikeylambda0NewBuilder.write).setSdkInput(vehicleCrashDetectionFeedbackSdkInput);
        VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback = (VehicleCrashDetectionFeedback) getconfiguredapikeylambda0NewBuilder.write();
        r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.serializer();
        ((Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write).setVehicleCrashDetectionFeedback(vehicleCrashDetectionFeedback);
        Data data = (Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.write();
        configurelambda10VarNewBuilder.serializer();
        ((Payload) configurelambda10VarNewBuilder.write).setData(data);
        return (Payload) configurelambda10VarNewBuilder.write();
    }

    private static final Sdk RemoteActionCompatParcelizer(r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableDelayedInitializationlambda3 enabledelayedinitializationlambda3NewBuilder = Sdk.newBuilder();
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = r8lambdaw447glwjfoun4bg91upxnadqezs.write();
        String str = null;
        String strIconCompatParcelizer = optionalWrite.IconCompatParcelizer() ? optionalWrite.write().IconCompatParcelizer() : null;
        if (strIconCompatParcelizer != null) {
            enabledelayedinitializationlambda3NewBuilder.serializer();
            ((Sdk) enabledelayedinitializationlambda3NewBuilder.write).setPersonId(strIconCompatParcelizer);
        }
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite2 = r8lambdaw447glwjfoun4bg91upxnadqezs.write();
        if (optionalWrite2.IconCompatParcelizer()) {
            String[] strArrSplit = optionalWrite2.write().write().split("/");
            str = strArrSplit[strArrSplit.length - 1];
            int i4 = MediaSessionCompatQueueItem + 103;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        if (str != null) {
            int i6 = MediaDescriptionCompat + 83;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            enabledelayedinitializationlambda3NewBuilder.serializer();
            ((Sdk) enabledelayedinitializationlambda3NewBuilder.write).setInstallId(str);
        }
        String strRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.read().RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            enabledelayedinitializationlambda3NewBuilder.serializer();
            ((Sdk) enabledelayedinitializationlambda3NewBuilder.write).setAppId(strRemoteActionCompatParcelizer);
            int i8 = MediaDescriptionCompat + 79;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        enabledelayedinitializationlambda3NewBuilder.serializer();
        ((Sdk) enabledelayedinitializationlambda3NewBuilder.write).setSdkVersion("6.27.1");
        OS os = OS.OS_ANDROID;
        enabledelayedinitializationlambda3NewBuilder.serializer();
        ((Sdk) enabledelayedinitializationlambda3NewBuilder.write).setOs(os);
        return (Sdk) enabledelayedinitializationlambda3NewBuilder.write();
    }
}
