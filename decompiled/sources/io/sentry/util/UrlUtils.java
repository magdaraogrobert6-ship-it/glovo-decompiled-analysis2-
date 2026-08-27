package io.sentry.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.layers.CustomLayer;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.SkyLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import io.grpc.LoadBalancer$Helper;
import java.net.ProtocolException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.math.MathKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ResumeUndispatchedRunnable;
import kotlinx.coroutines.YieldKt;
import o.AndroidContentCaptureManager;
import o.BackgroundInAppMessagePreparer;
import o.BrazeInAppMessageManagerExternalSyntheticLambda6;
import o.CSSParseException;
import o.DrawableTransformation;
import o.ProtoClauseMsg;
import o.ShortNewsContentCardView;
import o.accessgetchildSerializerscp;
import o.accessisRenderNodeCompatiblecp;
import o.accessprepareInAppMessage;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.getAsClause;
import o.getAttribute;
import o.getBeforehoxUOeE;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getTransparent0d7_KjU;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.localError;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.prepareInAppMessageWithBitmapDownloadlambda3;
import o.prepareInAppMessageWithHtmllambda1;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resetTransientState;
import o.resizeGraphicFrameIfAppropriate;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.setUnregisteredInAppMessage;
import o.supportsColorMatrixQuery;
import o.syncCustomerProfile;
import o.toColorLong8_81llA;
import o.trackEventI;
import o.truncslo4al4;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UrlUtils {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~((~i5) | i4)) | (~(i5 | i));
        int i8 = ~i4;
        int i9 = (~(i8 | i)) | i5;
        int i10 = (~(i | i4)) | (~(i8 | (~i))) | i5;
        int i11 = i4 + i5 + i3 + ((-737137436) * i6) + ((-1840598144) * i2);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i4) - 818937856) + (24099949 * i5) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i3) + (1335885824 * i6) + ((-1946157056) * i2) + ((-1593638912) * i12);
        int i14 = (i4 * 1252406331) + 1981669868 + (i5 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i3 * 1252407325) + (i6 * (-1820396076)) + (i2 * 1320834432) + (i12 * (-447283200));
        switch (i13 + (i14 * i14 * 1511325696)) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return read(objArr);
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                return serializer(objArr);
            case 5:
                return MediaDescriptionCompat(objArr);
            case 6:
                return MediaSessionCompatQueueItem(objArr);
            default:
                return write(objArr);
        }
    }

    public abstract int write(int i, int i2, LayoutDirection layoutDirection, Placeable placeable, int i3);

    public Integer write(Placeable placeable) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 61;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 47;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static void IconCompatParcelizer(String str, boolean z) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
        int i4 = IconCompatParcelizer + 19;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        Object obj = objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
            return null;
        }
        int i5 = i3 + 51;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    public static onBackInvokedlambda0 serializer() {
        int i = 2 % 2;
        onBackInvokedlambda0 onbackinvokedlambda0 = new onBackInvokedlambda0(null);
        int i2 = serializer + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return onbackinvokedlambda0;
    }

    public static void serializer(Object obj, String str) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
        int i4 = serializer + 5;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static void read(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        serializer(obj, "Argument must not be null");
        int i4 = serializer + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        long id;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            id = Thread.currentThread().getId();
            int i3 = 60 / 0;
        } else {
            id = Thread.currentThread().getId();
        }
        int i4 = serializer + 25;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return Long.valueOf(id);
        }
        int i5 = 99 / 0;
        return Long.valueOf(id);
    }

    public static int PlaybackStateCompatCustomAction(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 75;
        serializer = i3 % Fields.SpotShadowColor;
        read(parcel, i, i3 % 2 != 0 ? 3 : 4);
        int i4 = parcel.readInt();
        int i5 = serializer + 97;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public static float RatingCompat(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 101;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        read(parcel, i, 4);
        float f = parcel.readFloat();
        int i5 = serializer + 115;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static double MediaMetadataCompat(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 23;
        serializer = i3 % Fields.SpotShadowColor;
        read(parcel, i, i3 % 2 != 0 ? 51 : 8);
        return parcel.readDouble();
    }

    public static long PlaybackStateCompat(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 87;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        read(parcel, i, 8);
        long j = parcel.readLong();
        int i5 = IconCompatParcelizer + 97;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public static void MediaSessionCompatResultReceiverWrapper(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 45;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.setDataPosition(parcel.dataPosition() + ParcelableVolumeInfo(parcel, i));
        int i5 = IconCompatParcelizer + 87;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    public static boolean MediaSessionCompatQueueItem(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 81;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        read(parcel, i, 4);
        boolean z = false;
        if (parcel.readInt() != 0) {
            int i5 = IconCompatParcelizer + 115;
            int i6 = i5 % Fields.SpotShadowColor;
            serializer = i6;
            z = i5 % 2 == 0;
            int i7 = i6 + 115;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return z;
    }

    public static int ParcelableVolumeInfo(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 9;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        int i4 = parcel.readInt();
        int i5 = serializer + 65;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r0 = r3.readBundle();
        r3.setDataPosition(r1 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r3 = io.sentry.util.UrlUtils.serializer + 21;
        io.sentry.util.UrlUtils.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle IconCompatParcelizer(android.os.Parcel r3, int r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.util.UrlUtils.serializer
            int r1 = r1 + 63
            int r2 = r1 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r4 = ParcelableVolumeInfo(r3, r4)
            int r1 = r3.dataPosition()
            r2 = 16
            int r2 = r2 / 0
            if (r4 != 0) goto L32
            goto L27
        L1d:
            int r4 = ParcelableVolumeInfo(r3, r4)
            int r1 = r3.dataPosition()
            if (r4 != 0) goto L32
        L27:
            int r3 = io.sentry.util.UrlUtils.serializer
            int r3 = r3 + 21
            int r4 = r3 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r4
            int r3 = r3 % r0
            r3 = 0
            return r3
        L32:
            android.os.Bundle r0 = r3.readBundle()
            int r1 = r1 + r4
            r3.setDataPosition(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.IconCompatParcelizer(android.os.Parcel, int):android.os.Bundle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r3 = r4.createStringArrayList();
        r4.setDataPosition(r1 + r5);
        r4 = io.sentry.util.UrlUtils.IconCompatParcelizer + 55;
        io.sentry.util.UrlUtils.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if ((r4 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList MediaBrowserCompatMediaItem(android.os.Parcel r4, int r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.util.UrlUtils.serializer
            int r1 = r1 + 111
            int r2 = r1 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1e
            int r5 = ParcelableVolumeInfo(r4, r5)
            int r1 = r4.dataPosition()
            r3 = 13
            int r3 = r3 / 0
            if (r5 != 0) goto L29
            goto L28
        L1e:
            int r5 = ParcelableVolumeInfo(r4, r5)
            int r1 = r4.dataPosition()
            if (r5 != 0) goto L29
        L28:
            return r2
        L29:
            java.util.ArrayList r3 = r4.createStringArrayList()
            int r1 = r1 + r5
            r4.setDataPosition(r1)
            int r4 = io.sentry.util.UrlUtils.IconCompatParcelizer
            int r4 = r4 + 55
            int r5 = r4 % 128
            io.sentry.util.UrlUtils.serializer = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L3d
            return r3
        L3d:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.MediaBrowserCompatMediaItem(android.os.Parcel, int):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r0 = r1.readStrongBinder();
        r1.setDataPosition(r3 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r5 = io.sentry.util.UrlUtils.serializer + 125;
        io.sentry.util.UrlUtils.IconCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object MediaSessionCompatQueueItem(java.lang.Object[] r5) {
        /*
            r0 = 0
            r1 = r5[r0]
            android.os.Parcel r1 = (android.os.Parcel) r1
            r2 = 1
            r5 = r5[r2]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r2 = 2
            int r3 = r2 % r2
            int r3 = io.sentry.util.UrlUtils.IconCompatParcelizer
            int r3 = r3 + 67
            int r4 = r3 % 128
            io.sentry.util.UrlUtils.serializer = r4
            int r3 = r3 % r2
            if (r3 == 0) goto L2a
            int r5 = ParcelableVolumeInfo(r1, r5)
            int r3 = r1.dataPosition()
            r4 = 69
            int r4 = r4 / r0
            if (r5 != 0) goto L3f
            goto L34
        L2a:
            int r5 = ParcelableVolumeInfo(r1, r5)
            int r3 = r1.dataPosition()
            if (r5 != 0) goto L3f
        L34:
            int r5 = io.sentry.util.UrlUtils.serializer
            int r5 = r5 + 125
            int r0 = r5 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r0
            int r5 = r5 % r2
            r5 = 0
            return r5
        L3f:
            android.os.IBinder r0 = r1.readStrongBinder()
            int r3 = r3 + r5
            r1.setDataPosition(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.MediaSessionCompatQueueItem(java.lang.Object[]):java.lang.Object");
    }

    public static byte[] RemoteActionCompatParcelizer(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 47;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            ParcelableVolumeInfo(parcel, i);
            parcel.dataPosition();
            throw null;
        }
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
        int i4 = IconCompatParcelizer + 27;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return bArrCreateByteArray;
    }

    public static int[] read(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 27;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
        int i5 = serializer + 37;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return iArrCreateIntArray;
    }

    public static String serializer(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 71;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo != 0) {
            String string = parcel.readString();
            parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
            return string;
        }
        int i5 = serializer + 5;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static Object[] serializer(Parcel parcel, int i, Parcelable.Creator creator) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 97;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo != 0) {
            Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
            parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
            return objArrCreateTypedArray;
        }
        int i5 = serializer + 23;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    public static ArrayList write(Parcel parcel, int i, Parcelable.Creator creator) {
        int i2 = 2 % 2;
        int i3 = serializer + 41;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo != 0) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
            return arrayListCreateTypedArrayList;
        }
        int i5 = IconCompatParcelizer + 63;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    public static String[] write(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 69;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iParcelableVolumeInfo != 0) {
            String[] strArrCreateStringArray = parcel.createStringArray();
            parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
            return strArrCreateStringArray;
        }
        int i5 = IconCompatParcelizer + 57;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r5 = (android.os.Parcelable) r5.createFromParcel(r3);
        r3.setDataPosition(r1 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r3 = io.sentry.util.UrlUtils.serializer + 43;
        io.sentry.util.UrlUtils.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Parcelable read(android.os.Parcel r3, int r4, android.os.Parcelable.Creator r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.util.UrlUtils.IconCompatParcelizer
            int r1 = r1 + 55
            int r2 = r1 % 128
            io.sentry.util.UrlUtils.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r4 = ParcelableVolumeInfo(r3, r4)
            int r1 = r3.dataPosition()
            r2 = 54
            int r2 = r2 / 0
            if (r4 != 0) goto L38
            goto L27
        L1d:
            int r4 = ParcelableVolumeInfo(r3, r4)
            int r1 = r3.dataPosition()
            if (r4 != 0) goto L38
        L27:
            int r3 = io.sentry.util.UrlUtils.serializer
            int r3 = r3 + 43
            int r4 = r3 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L34
            return r4
        L34:
            r4.hashCode()
            throw r4
        L38:
            java.lang.Object r5 = r5.createFromParcel(r3)
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            int r1 = r1 + r4
            r3.setDataPosition(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.read(android.os.Parcel, int, android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public static final void addPersistentLayer(MapboxStyleManager mapboxStyleManager, Layer layer, LayerPosition layerPosition) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        mapboxStyleManager.getClass();
        layer.getClass();
        layer.delegate = mapboxStyleManager;
        String str = (String) layer.addPersistentLayer(mapboxStyleManager, layerPosition).getError();
        if (str != null) {
            throw new MapboxStyleException("Add persistent layer failed: ".concat(str));
        }
        int i4 = serializer + 13;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        Parcel parcel = (Parcel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (parcel.dataPosition() != iIntValue) {
            throw new SafeParcelReader$ParseException(d$$ExternalSyntheticOutline0.m(iIntValue, "Overread allowed size end=", new StringBuilder(String.valueOf(iIntValue).length() + 26)), parcel);
        }
        int i4 = serializer + 39;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    public static final localError IconCompatParcelizer(long j, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 71;
        int i4 = i3 % Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 75;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            j = 500;
        }
        boolean zSerializer = ((getPostalCode) getbirthdatefull).serializer(j);
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (!(!zSerializer)) {
            objComponentActivity = new localError(j);
            getpostalcode.write(objComponentActivity);
        } else {
            int i8 = serializer + 105;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new localError(j);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                throw null;
            }
        }
        return (localError) objComponentActivity;
    }

    public static final Object awaitNullable(syncCustomerProfile synccustomerprofile, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ProtoClauseMsg(synccustomerprofile, 1));
        synccustomerprofile.IconCompatParcelizer(new getAsClause(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return result;
    }

    public static final Object await(syncCustomerProfile synccustomerprofile, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        int i2 = 0;
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ProtoClauseMsg(synccustomerprofile, i2));
        synccustomerprofile.IconCompatParcelizer(new accessgetchildSerializerscp(cancellableContinuationImpl, i2));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = serializer + 55;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return result;
    }

    public static final getTransparent0d7_KjU RemoteActionCompatParcelizer(View view) {
        getTransparent0d7_KjU gettransparent0d7_kju;
        int i = 2 % 2;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof getTransparent0d7_KjU) {
                gettransparent0d7_kju = (getTransparent0d7_KjU) tag;
            } else {
                int i2 = IconCompatParcelizer + 107;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                gettransparent0d7_kju = null;
            }
            if (gettransparent0d7_kju != null) {
                int i4 = serializer + 67;
                int i5 = i4 % Fields.SpotShadowColor;
                IconCompatParcelizer = i5;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i6 = i5 + 99;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 83 / 0;
                }
                return gettransparent0d7_kju;
            }
            Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
            view = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        return java.lang.Double.valueOf(r0 * r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        return java.lang.Double.valueOf(r0 / r2.getTimeUnit$kotlin_stdlib().convert(1, r11.getTimeUnit$kotlin_stdlib()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r9 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r9 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r11 = io.sentry.util.UrlUtils.serializer + 123;
        io.sentry.util.UrlUtils.IconCompatParcelizer = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r11 = r11 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r11) {
        /*
            r0 = 0
            r0 = r11[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2 = 1
            r2 = r11[r2]
            o.setUnregisteredInAppMessage r2 = (o.setUnregisteredInAppMessage) r2
            r3 = 2
            r11 = r11[r3]
            o.setUnregisteredInAppMessage r11 = (o.setUnregisteredInAppMessage) r11
            int r4 = r3 % r3
            int r4 = io.sentry.util.UrlUtils.IconCompatParcelizer
            int r4 = r4 + 83
            int r5 = r4 % 128
            io.sentry.util.UrlUtils.serializer = r5
            int r4 = r4 % r3
            r5 = 0
            r7 = 1
            if (r4 == 0) goto L3b
            r2.getClass()
            r11.getClass()
            java.util.concurrent.TimeUnit r4 = r11.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r9 = r2.getTimeUnit$kotlin_stdlib()
            long r9 = r4.convert(r7, r9)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L61
            goto L51
        L3b:
            r2.getClass()
            r11.getClass()
            java.util.concurrent.TimeUnit r4 = r11.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r9 = r2.getTimeUnit$kotlin_stdlib()
            long r9 = r4.convert(r7, r9)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L61
        L51:
            double r4 = (double) r9
            double r0 = r0 * r4
            int r11 = io.sentry.util.UrlUtils.serializer
            int r11 = r11 + 123
            int r2 = r11 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r2
            int r11 = r11 % r3
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            return r11
        L61:
            java.util.concurrent.TimeUnit r2 = r2.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r11 = r11.getTimeUnit$kotlin_stdlib()
            long r2 = r2.convert(r7, r11)
            double r2 = (double) r2
            double r0 = r0 / r2
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static final void read(resetTransientState resettransientstate, CSSParseException cSSParseException, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        truncslo4al4 truncslo4al4Var;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 87;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        setgraphicmodalmaxwidthdp.getClass();
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1 = prepareInAppMessageWithHtmllambda1.OBJ;
        BackgroundInAppMessagePreparer[] backgroundInAppMessagePreparerArr = new BackgroundInAppMessagePreparer[prepareInAppMessageWithHtmllambda1.getEntries().size()];
        prepareinappmessagewithhtmllambda1.getClass();
        if (resettransientstate.IconCompatParcelizer.MediaBrowserCompatMediaItem) {
            truncslo4al4Var = new accessprepareInAppMessage(cSSParseException, resettransientstate);
            i = IconCompatParcelizer + 105;
            i2 = i % Fields.SpotShadowColor;
        } else {
            truncslo4al4Var = new truncslo4al4(cSSParseException);
            i = IconCompatParcelizer + 125;
            i2 = i % Fields.SpotShadowColor;
        }
        serializer = i2;
        int i6 = i % 2;
        new prepareInAppMessageWithBitmapDownloadlambda3(truncslo4al4Var, resettransientstate, prepareinappmessagewithhtmllambda1, backgroundInAppMessagePreparerArr).read(setgraphicmodalmaxwidthdp, obj);
    }

    public static final Object repeatOnLifecycle(supportsColorMatrixQuery supportscolormatrixquery, toColorLong8_81llA tocolorlong8_81lla, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCoroutineScope;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.INITIALIZED;
            obj.hashCode();
            throw null;
        }
        if (tocolorlong8_81lla == toColorLong8_81llA.INITIALIZED) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat == toColorLong8_81llA.DESTROYED || (objCoroutineScope = YieldKt.coroutineScope(new PausingDispatcherKt$whenStateAtLeast$2(supportscolormatrixquery, tocolorlong8_81lla, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 2), shortNewsContentCardView)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i3 = IconCompatParcelizer + 5;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objCoroutineScope;
        }
        throw null;
    }

    public static final Object repeatOnLifecycle(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, toColorLong8_81llA tocolorlong8_81lla, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object objRepeatOnLifecycle = repeatOnLifecycle(accessisrendernodecompatiblecp.getLifecycle(), tocolorlong8_81lla, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
            if (objRepeatOnLifecycle == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objRepeatOnLifecycle;
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = IconCompatParcelizer + 107;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        repeatOnLifecycle(accessisrendernodecompatiblecp.getLifecycle(), tocolorlong8_81lla, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = serializer + 67;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (iIntValue < 0) {
            return getBeforehoxUOeE.serializer("%s (%s) must not be negative", str, Integer.valueOf(iIntValue));
        }
        if (iIntValue2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(iIntValue2, "negative size: "));
            return null;
        }
        int i5 = i3 + 113;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getBeforehoxUOeE.serializer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    public static void write(int i, int i2, int i3) {
        String strSerializer;
        int i4 = 2 % 2;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0) {
                int i5 = serializer + 77;
                int i6 = i5 % Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                if (i5 % 2 == 0) {
                    int i7 = 6 / 0;
                    if (i <= i3) {
                        int i8 = i6 + 57;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (i2 < 0 && i2 <= i3) {
                            strSerializer = getBeforehoxUOeE.serializer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        } else {
                            strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), "end index"});
                        }
                    } else {
                        strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i), Integer.valueOf(i3), "start index"});
                    }
                } else if (i <= i3) {
                    int i10 = i6 + 57;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (i2 < 0) {
                        strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), "end index"});
                    } else {
                        strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), "end index"});
                    }
                } else {
                    strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i), Integer.valueOf(i3), "start index"});
                }
            } else {
                strSerializer = (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), new Object[]{Integer.valueOf(i), Integer.valueOf(i3), "start index"});
            }
            throw new IndexOutOfBoundsException(strSerializer);
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Parcel parcel = (Parcel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (iIntValue != iIntValue2) {
            String hexString = Integer.toHexString(iIntValue);
            int length = String.valueOf(iIntValue2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iIntValue).length() + 4 + 1);
            c8$$ExternalSyntheticOutline0.m(iIntValue2, iIntValue, "Expected size ", " got ", sb);
            throw new SafeParcelReader$ParseException(d$$ExternalSyntheticOutline0.m(sb, " (0x", hexString, ")"), parcel);
        }
        int i5 = i2 + 3;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static void read(Parcel parcel, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = serializer + 63;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i);
        if (iParcelableVolumeInfo == i2) {
            int i6 = serializer + 125;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            String hexString = Integer.toHexString(iParcelableVolumeInfo);
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iParcelableVolumeInfo).length() + 4 + 1);
            c8$$ExternalSyntheticOutline0.m(i2, iParcelableVolumeInfo, "Expected size ", " got ", sb);
            throw new SafeParcelReader$ParseException(d$$ExternalSyntheticOutline0.m(sb, " (0x", hexString, ")"), parcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static final CoroutineSingletons suspendAndThrow(Throwable th, ShortNewsContentCardView shortNewsContentCardView) {
        getAttribute getattribute;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = shortNewsContentCardView instanceof getAttribute;
            obj.hashCode();
            throw null;
        }
        if (shortNewsContentCardView instanceof getAttribute) {
            getattribute = (getAttribute) shortNewsContentCardView;
            int i3 = getattribute.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getattribute.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getattribute = new getAttribute(shortNewsContentCardView);
                int i4 = serializer + 35;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            getattribute = new getAttribute(shortNewsContentCardView);
            int i6 = serializer + 35;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object obj2 = getattribute.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getattribute.IconCompatParcelizer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            getattribute.IconCompatParcelizer = 1;
            prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.dispatch(getattribute.getContext(), new ResumeUndispatchedRunnable(getattribute, 5, th));
            return coroutineSingletons;
        }
        if (i8 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            DrawableTransformation.read();
            return null;
        }
        int i9 = IconCompatParcelizer + 25;
        serializer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i10 = 46 / 0;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r5 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r5 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r3 = r3 + 29;
        io.sentry.util.UrlUtils.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(bo.app.c8$$ExternalSyntheticOutline0.m(r5, "negative size: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(bo.app.c8$$ExternalSyntheticOutline0.m(r5, "negative size: "));
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r4 = o.getBeforehoxUOeE.serializer("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void write(int r4, int r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            if (r4 < 0) goto L12
            int r1 = io.sentry.util.UrlUtils.serializer
            int r1 = r1 + 57
            int r2 = r1 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r4 < r5) goto L11
            goto L12
        L11:
            return
        L12:
            java.lang.String r1 = "index"
            if (r4 < 0) goto L5c
            int r2 = io.sentry.util.UrlUtils.serializer
            int r2 = r2 + 117
            int r3 = r2 % 128
            io.sentry.util.UrlUtils.IconCompatParcelizer = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L28
            r2 = 96
            int r2 = r2 / 0
            if (r5 >= 0) goto L49
            goto L2a
        L28:
            if (r5 >= 0) goto L49
        L2a:
            int r3 = r3 + 29
            int r4 = r3 % 128
            io.sentry.util.UrlUtils.serializer = r4
            int r3 = r3 % r0
            java.lang.String r4 = "negative size: "
            if (r3 != 0) goto L3d
            java.lang.String r4 = bo.app.c8$$ExternalSyntheticOutline0.m(r5, r4)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r4)
            return
        L3d:
            java.lang.String r4 = bo.app.c8$$ExternalSyntheticOutline0.m(r5, r4)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r4)
            r4 = 0
            r4.hashCode()
            throw r4
        L49:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r5}
            java.lang.String r5 = "%s (%s) must be less than size (%s)"
            java.lang.String r4 = o.getBeforehoxUOeE.serializer(r5, r4)
            goto L6a
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            java.lang.String r5 = "%s (%s) must not be negative"
            java.lang.String r4 = o.getBeforehoxUOeE.serializer(r5, r4)
        L6a:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.UrlUtils.write(int, int):void");
    }

    public static int write(Parcel parcel) {
        int i = 2 % 2;
        int i2 = parcel.readInt();
        int iParcelableVolumeInfo = ParcelableVolumeInfo(parcel, i2);
        char c = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = IconCompatParcelizer + 37;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        int i6 = iParcelableVolumeInfo + iDataPosition;
        if (i6 >= iDataPosition) {
            int i7 = i4 + 57;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                parcel.dataSize();
                throw null;
            }
            if (i6 <= parcel.dataSize()) {
                int i8 = IconCompatParcelizer + 105;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return i6;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i6).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i6);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final long write(long j, setUnregisteredInAppMessage setunregisteredinappmessage) {
        long j2;
        int i = 2 % 2;
        setunregisteredinappmessage.getClass();
        int i2 = BrazeInAppMessageManagerExternalSyntheticLambda6.RemoteActionCompatParcelizer[setunregisteredinappmessage.ordinal()];
        if (i2 != 1) {
            int i3 = IconCompatParcelizer + 91;
            int i4 = i3 % Fields.SpotShadowColor;
            serializer = i4;
            if (i3 % 2 == 0 ? i2 == 2 : i2 == 4) {
                j2 = 3600000;
            } else {
                int i5 = i4 + 125;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i2 == 3) {
                    j2 = 60000;
                } else if (i2 != 4) {
                    int i7 = i4 + 83;
                    int i8 = i7 % Fields.SpotShadowColor;
                    IconCompatParcelizer = i8;
                    int i9 = i7 % 2;
                    if (i2 != 5) {
                        DrawableTransformation.read(setunregisteredinappmessage, "Wrong unit for millisMultiplier: ");
                        return 0L;
                    }
                    int i10 = i8 + 111;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    j2 = 1;
                } else {
                    j2 = 1000;
                }
            }
        } else {
            j2 = CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            int i12 = serializer + 81;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    int i14 = IconCompatParcelizer + 39;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:3:0x0013, B:7:0x0023, B:24:0x0072, B:26:0x0078, B:29:0x0082, B:30:0x0086, B:32:0x008c, B:34:0x0098, B:36:0x009e, B:10:0x002d, B:11:0x0031, B:13:0x0037, B:17:0x004e, B:19:0x0054, B:21:0x006d), top: B:42:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b8, blocks: (B:3:0x0013, B:7:0x0023, B:24:0x0072, B:26:0x0078, B:29:0x0082, B:30:0x0086, B:32:0x008c, B:34:0x0098, B:36:0x009e, B:10:0x002d, B:11:0x0031, B:13:0x0037, B:17:0x004e, B:19:0x0054, B:21:0x006d), top: B:42:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[Catch: Exception -> 0x00b8, TRY_ENTER, TryCatch #0 {Exception -> 0x00b8, blocks: (B:3:0x0013, B:7:0x0023, B:24:0x0072, B:26:0x0078, B:29:0x0082, B:30:0x0086, B:32:0x008c, B:34:0x0098, B:36:0x009e, B:10:0x002d, B:11:0x0031, B:13:0x0037, B:17:0x004e, B:19:0x0054, B:21:0x006d), top: B:42:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0031 A[SYNTHETIC] */
    public static final boolean IconCompatParcelizer(Set set, Set set2, String str, String str2) {
        int i;
        int i2 = 2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m("Device Info for FPS check - Model: ", str, ", SoC: ", str2), new Object[0]);
        try {
            Set<String> set3 = set;
            if (set3 instanceof Collection) {
                int i3 = IconCompatParcelizer + 75;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (!set3.isEmpty()) {
                    for (String str3 : set3) {
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                            i = IconCompatParcelizer + 21;
                            serializer = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                str.equalsIgnoreCase(str3);
                                throw null;
                            }
                            if (str.equalsIgnoreCase(str3)) {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FPS reduction active for device model: " + str, new Object[0]);
                                return true;
                            }
                        }
                    }
                }
            } else {
                while (r6.hasNext()) {
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        i = IconCompatParcelizer + 21;
                        serializer = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            str.equalsIgnoreCase(str3);
                            throw null;
                        }
                        if (str.equalsIgnoreCase(str3)) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FPS reduction active for device model: " + str, new Object[0]);
                            return true;
                        }
                    }
                }
            }
            Set<String> set4 = set2;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                for (String str4 : set4) {
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4) && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) str4, true)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FPS reduction active for SoC name: " + str2, new Object[0]);
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Error checking FPS reduction targets", new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public static resizeGraphicFrameIfAppropriate read(String str) throws ProtocolException {
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        int i;
        String strSubstring;
        int iCharAt;
        int i2;
        int i3 = 2 % 2;
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "HTTP/1.", false)) {
            int i4 = IconCompatParcelizer + 43;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                if (str.length() >= 127) {
                    i = 87;
                    if (str.charAt(8) == ' ') {
                        iCharAt = str.charAt(7) - '0';
                        if (iCharAt != 0) {
                            i2 = serializer + 13;
                            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 == 0 ? iCharAt != 1 : iCharAt != 1) {
                                throw new ProtocolException("Unexpected status line: ".concat(str));
                            }
                            r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
                        } else {
                            r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0;
                        }
                    }
                }
            } else if (str.length() >= 9) {
                i = 9;
                if (str.charAt(8) == ' ') {
                    iCharAt = str.charAt(7) - '0';
                    if (iCharAt != 0) {
                        i2 = serializer + 13;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            throw new ProtocolException("Unexpected status line: ".concat(str));
                        }
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0;
                }
            }
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "ICY ", false)) {
            r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc2 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0;
            int i5 = IconCompatParcelizer + 93;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdacwme7obcpvw4lrr1hr7xiufmyc2;
            i = 4;
        } else {
            if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
            i = 12;
        }
        int i7 = i + 3;
        if (str.length() < i7) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str.substring(i, i7));
        if (numMediaSessionCompatQueueItem == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numMediaSessionCompatQueueItem.intValue();
        if (str.length() <= i7) {
            strSubstring = "";
        } else {
            if (str.charAt(i7) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new resizeGraphicFrameIfAppropriate(r8lambdacwme7obcpvw4lrr1hr7xiufmyc, iIntValue, strSubstring);
    }

    public static ComponentActivity IconCompatParcelizer(String str) {
        String str2;
        int i = 2 % 2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                int i2 = IconCompatParcelizer + 59;
                serializer = i2 % Fields.SpotShadowColor;
                try {
                    if (i2 % 2 != 0) {
                        uri.toURL();
                        throw null;
                    }
                    uri.toURL();
                } catch (Exception unused) {
                    return new ComponentActivity((String) null, (String) null, (String) null);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                int i3 = serializer + 121;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            String rawQuery = uri.getRawQuery();
            String rawFragment = uri.getRawFragment();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (rawAuthority.contains("@")) {
                String str3 = "[Filtered]";
                if (rawAuthority.startsWith("@")) {
                    int i5 = serializer + 13;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    rawAuthority = "[Filtered]".concat(rawAuthority);
                } else {
                    if (rawAuthority.substring(0, rawAuthority.indexOf(64)).contains(":")) {
                        int i7 = serializer + 13;
                        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            int i8 = 3 / 3;
                        }
                        str3 = "[Filtered]:[Filtered]";
                    }
                    rawAuthority = str3.concat(rawAuthority.substring(rawAuthority.indexOf(64)));
                }
            }
            sb.append(rawAuthority);
            sb.append(rawPath);
            return new ComponentActivity(sb.toString(), rawQuery, rawFragment);
        } catch (Exception unused2) {
            return new ComponentActivity((String) null, (String) null, (String) null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0198, please report this as an issue */
    public static final Layer getLayer(Style style, String str) {
        Object objUnwrap;
        Layer skyLayer;
        Layer circleLayer;
        int i = 2 % 2;
        style.getClass();
        str.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new LayerUtils$getLayer$source$2(style, 0, str));
        try {
            objUnwrap = TypeUtilsKt.unwrap(style.getStyleLayerProperty(str, "type"), String.class);
        } catch (RuntimeException unused) {
            objUnwrap = null;
        }
        String str2 = (String) objUnwrap;
        if (str2 != null) {
            int i2 = IconCompatParcelizer + 1;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            switch (str2) {
                case "circle":
                    circleLayer = new CircleLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    skyLayer = circleLayer;
                    break;
                case "custom":
                    circleLayer = new CustomLayer(str, new g0());
                    skyLayer = circleLayer;
                    break;
                case "background":
                    skyLayer = new SkyLayer(str, 1);
                    break;
                case "fill-extrusion":
                    circleLayer = new FillExtrusionLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    int i4 = serializer + 105;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    skyLayer = circleLayer;
                    break;
                case "raster":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 7);
                    skyLayer = circleLayer;
                    break;
                case "symbol":
                    circleLayer = new SymbolLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    skyLayer = circleLayer;
                    break;
                case "hillshade":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 4);
                    skyLayer = circleLayer;
                    break;
                case "sky":
                    skyLayer = new SkyLayer(str, 0);
                    break;
                case "clip":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 2);
                    skyLayer = circleLayer;
                    break;
                case "fill":
                    circleLayer = new FillLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    skyLayer = circleLayer;
                    break;
                case "line":
                    circleLayer = new LineLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    skyLayer = circleLayer;
                    break;
                case "slot":
                    skyLayer = new SkyLayer(str, 9);
                    break;
                case "model":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 6);
                    skyLayer = circleLayer;
                    break;
                case "raster-particle":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 8);
                    skyLayer = circleLayer;
                    break;
                case "heatmap":
                    circleLayer = new SkyLayer(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 3);
                    skyLayer = circleLayer;
                    break;
                case "location-indicator":
                    skyLayer = new SkyLayer(str, 5);
                    break;
                default:
                    MapboxLogger.logW("Mbgl-LayerUtils", "Layer type: " + str2 + " unknown.");
                    skyLayer = null;
                    break;
            }
        } else {
            MapboxLogger.logW("Mbgl-LayerUtils", "Layer type: " + str2 + " unknown.");
            skyLayer = null;
        }
        if (skyLayer != null) {
            skyLayer.delegate = style;
            skyLayer.appliedLayerPropertiesValue = style.getStyleLayerProperties(str).getValue();
        } else {
            skyLayer = null;
        }
        int i6 = serializer + 97;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return skyLayer;
        }
        throw null;
    }

    public static String RemoteActionCompatParcelizer(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        return (String) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), objArr);
    }

    public static void IconCompatParcelizer(Parcel parcel, int i, int i2) {
        Object[] objArr = {parcel, Integer.valueOf(i), Integer.valueOf(i2)};
        RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), objArr);
    }

    public static IBinder MediaSessionCompatToken(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        return (IBinder) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), objArr);
    }

    public static void MediaDescriptionCompat(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
    }

    public static final long RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        return ((Long) RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue();
    }

    public static final double serializer(double d, setUnregisteredInAppMessage setunregisteredinappmessage, setUnregisteredInAppMessage setunregisteredinappmessage2) {
        Object[] objArr = {Double.valueOf(d), setunregisteredinappmessage, setunregisteredinappmessage2};
        return ((Double) RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -703904562, 703904565, trackEventI.IconCompatParcelizer(), objArr)).doubleValue();
    }

    public static void RemoteActionCompatParcelizer(Object obj, String str) {
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, 1390870901, -1390870897, iIconCompatParcelizer3, new Object[]{obj, str});
    }
}
