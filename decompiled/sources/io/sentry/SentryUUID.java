package io.sentry;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.sentry.util.MediaSessionCompatToken;
import io.sentry.util.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DispatchException;
import o.FocusOrderModifierKt;
import o.FocusRequesterCompanionFocusRequesterFactory;
import o.InAppMessageHtmlBaseView;
import o.ShadowContext;
import o.ShortNewsContentCardView;
import o.component10;
import o.createFromAutofillValue;
import o.createOuterShadowBitmapD_oqF2M;
import o.ensureSubscribedToInAppMessageEvents;
import o.getBirthDateFull;
import o.getCreditCardExpirationDay;
import o.getCurrentSemanticsNodesui;
import o.getDefault;
import o.getInAppMessageEventMap;
import o.getPhoneNumberDevice;
import o.getPostalCode;
import o.getType;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaST4AYLA9Q2b7l2QguExdjNYtig;
import o.setCarryoverInAppMessage;
import o.updateBuffersOnDisappeared;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryUUID {
    public static final GapComposer$CompositionContextImpl RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.serializer(Constant.ERROR_ACC_JUMP, getCreditCardExpirationDay.serializer);
        if (getpostalcode.ComponentActivity) {
            getType.read(getpostalcode.onBackPressedDispatcher_delegatelambda00);
        }
        Object objParcelableVolumeInfo = getpostalcode.ParcelableVolumeInfo();
        createFromAutofillValue createfromautofillvalue = objParcelableVolumeInfo instanceof createFromAutofillValue ? (createFromAutofillValue) objParcelableVolumeInfo : null;
        if (createfromautofillvalue == null) {
            getCurrentSemanticsNodesui getcurrentsemanticsnodesui = new getCurrentSemanticsNodesui(new getPhoneNumberDevice(new GapComposer$CompositionContextImpl(getpostalcode, getpostalcode.RatingCompat, getpostalcode.MediaSessionCompatResultReceiverWrapper, getpostalcode.fullyDrawnReporter_delegatelambda00, getpostalcode.MediaDescriptionCompat.PlaybackStateCompat)), -1);
            getpostalcode.serializer(getcurrentsemanticsnodesui);
            createfromautofillvalue = getcurrentsemanticsnodesui;
        }
        updateBuffersOnDisappeared updatebuffersondisappeared = createfromautofillvalue.read;
        updatebuffersondisappeared.getClass();
        GapComposer$CompositionContextImpl gapComposer$CompositionContextImpl = ((getPhoneNumberDevice) updatebuffersondisappeared).serializer;
        ((onShowTranslationui) gapComposer$CompositionContextImpl.IconCompatParcelizer).setValue(getpostalcode.serializer());
        getpostalcode.IconCompatParcelizer(false);
        return gapComposer$CompositionContextImpl;
    }

    public static final GesturesSettings GesturesSettings(RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1) {
        GesturesSettings.Builder builder = new GesturesSettings.Builder();
        builder.rotateEnabled = true;
        builder.pinchToZoomEnabled = true;
        builder.scrollEnabled = true;
        builder.simultaneousRotateAndPinchToZoomEnabled = true;
        builder.pitchEnabled = true;
        builder.scrollMode = ScrollMode.HORIZONTAL_AND_VERTICAL;
        builder.doubleTapToZoomInEnabled = true;
        builder.doubleTouchToZoomOutEnabled = true;
        builder.quickZoomEnabled = true;
        builder.pinchToZoomDecelerationEnabled = true;
        builder.rotateDecelerationEnabled = true;
        builder.scrollDecelerationEnabled = true;
        builder.increaseRotateThresholdWhenPinchingToZoom = true;
        builder.increasePinchToZoomThresholdWhenRotating = true;
        builder.zoomAnimationAmount = 1.0f;
        builder.pinchScrollEnabled = true;
        rootViewsSpy$Companion$install$1$1.invoke(builder);
        return new GesturesSettings(builder.rotateEnabled, builder.pinchToZoomEnabled, builder.scrollEnabled, builder.simultaneousRotateAndPinchToZoomEnabled, builder.pitchEnabled, builder.scrollMode, builder.doubleTapToZoomInEnabled, builder.doubleTouchToZoomOutEnabled, builder.quickZoomEnabled, builder.focalPoint, builder.pinchToZoomDecelerationEnabled, builder.rotateDecelerationEnabled, builder.scrollDecelerationEnabled, builder.increaseRotateThresholdWhenPinchingToZoom, builder.increasePinchToZoomThresholdWhenRotating, builder.zoomAnimationAmount, builder.pinchScrollEnabled, builder.useNativeFlingDeceleration);
    }

    public static TimeInterpolator IconCompatParcelizer(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!IconCompatParcelizer(strValueOf, "cubic-bezier") && !IconCompatParcelizer(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!IconCompatParcelizer(strValueOf, "cubic-bezier")) {
            if (IconCompatParcelizer(strValueOf, "path")) {
                return new PathInterpolator(FocusOrderModifierKt.write(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(read(strArrSplit, 0), read(strArrSplit, 1), read(strArrSplit, 2), read(strArrSplit, 3));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static boolean IconCompatParcelizer(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float read(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        FieldType$$ExternalSyntheticBUOutline0.read(f, "Motion easing control point value must be between 0 and 1; instead got: ");
        return 0.0f;
    }

    public static final ExecutorService read(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static final boolean IconCompatParcelizer(ShadowContext shadowContext, createOuterShadowBitmapD_oqF2M createoutershadowbitmapd_oqf2m, String str) {
        str.getClass();
        List list = createoutershadowbitmapd_oqf2m.read;
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "sm_", false)) {
            return createoutershadowbitmapd_oqf2m.IconCompatParcelizer;
        }
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "rclt_", false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "smu_", false)) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        return list.contains(str);
    }

    public static void RemoteActionCompatParcelizer(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static final int serializer(getBirthDateFull getbirthdatefull) {
        getbirthdatefull.getClass();
        return Long.hashCode(((getPostalCode) getbirthdatefull).RatingCompat);
    }

    public static final void IconCompatParcelizer(Throwable th, ShortNewsContentCardView shortNewsContentCardView) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).write;
        }
        shortNewsContentCardView.resumeWith(ExtrasKt.IconCompatParcelizer(th));
        throw th;
    }

    public static final onViewAttachedToWindowlambda0 serializer(InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Charset charset = ensureSubscribedToInAppMessageEvents.write;
        if (inAppMessageHtmlBaseView != null) {
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            Charset charsetSerializer = inAppMessageHtmlBaseView.serializer(null);
            if (charsetSerializer == null) {
                try {
                    inAppMessageHtmlBaseView = SQLite.write(inAppMessageHtmlBaseView + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    inAppMessageHtmlBaseView = null;
                }
            } else {
                charset = charsetSerializer;
            }
        }
        return new onViewAttachedToWindowlambda0(charset, inAppMessageHtmlBaseView);
    }

    public static final void write() {
        throw new IllegalStateException("Invalid applier");
    }

    public static String IconCompatParcelizer() {
        byte[] bArr = new byte[16];
        MediaSessionCompatToken.read().IconCompatParcelizer(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        UUID uuid = new UUID(j2, j);
        char[] cArr = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(cArr2, mostSignificantBits);
        char[] cArr3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer;
        return new String(cArr2);
    }

    public static void read(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            FocusRequesterCompanionFocusRequesterFactory.write(window, z);
        } else if (i >= 30) {
            getDefault.serializer(window, z);
        } else {
            component10.write(window, z);
        }
    }

    public static int write(Context context, int i, int i2) {
        TypedValue typedValueSerializer = BuildersKt.serializer(context, i);
        return (typedValueSerializer == null || typedValueSerializer.type != 16) ? i2 : typedValueSerializer.data;
    }

    public static final byte[] write(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        RemoteActionCompatParcelizer(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
