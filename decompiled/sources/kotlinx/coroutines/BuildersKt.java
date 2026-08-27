package kotlinx.coroutines;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.g0$$ExternalSyntheticLambda8;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.sources.CustomRasterSource;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import io.grpc.LoadBalancer$Helper;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.EOFException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.math.MathKt;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.protobuf.internal.ProtobufReader;
import o.DefaultInAppMessageViewWrappercreateAnimationListener2;
import o.DrawableTransformation;
import o.IInAppMessageAnimationFactory;
import o.IInAppMessageManagerListener;
import o.ImageOnlyContentCardViewViewHolder;
import o.RegistryMissingComponentException;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.SurfaceVerificationHelper;
import o.TextAnnouncementContentCardView;
import o.TextFieldLayout;
import o.ViewLayer;
import o.accessgetInstancedelegatecp;
import o.accessgetTvMediaContextMenucp;
import o.addDismissRunnable;
import o.asFrameworkPaint;
import o.buildMapping;
import o.canDismiss;
import o.convertStringJsonArrayToList;
import o.createFromParcel;
import o.createInAppMessageViewlambda4;
import o.fetchCustomEnterOrExitULY8qGw;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getClosingAnimation;
import o.getContentViewGroupParentLayout;
import o.getNewPassword;
import o.getPostalCode;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.isLockHardwareCanvasAvailable;
import o.lockCanvasFallback;
import o.onDrawBehind;
import o.open;
import o.pauseWebviewIfNecessarylambda10;
import o.performMeasureDjhGOtQ;
import o.prepareForActivityTransitionCarryover;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.registerInAppMessageManagerlambda40;
import o.registerInAppMessageManagerlambda50;
import o.removeNodeAtDepth;
import o.resetLayoutParamsIfAppropriate;
import o.setGraphicModalMaxWidthDp;
import o.setNativeShader;
import o.setSpotShadowColor;
import okhttp3.internal.http2.Huffman$Node;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BuildersKt {
    private static int read = 1;
    private static int serializer;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i));
        int i13 = i5 + i + i4 + (1112421973 * i2) + ((-1897213938) * i3);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i5) - 781189120) + ((-1395624931) * i) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i4) + ((-1446510592) * i2) + (892338176 * i3) + ((-1657864192) * i14);
        int i16 = (i5 * 2010092721) + 1217064380 + (i * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i4 * 2010091741) + (i2 * (-1378896031)) + (i3 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            return read(objArr);
        }
        if (i17 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i17 == 3) {
            return serializer(objArr);
        }
        if (i17 != 4) {
            return i17 != 5 ? IconCompatParcelizer(objArr) : MediaMetadataCompat(objArr);
        }
        return write(objArr);
    }

    public static void write(String str) {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SentryLogcatAdapter.serializer("FIAM.Display", str);
        } else {
            SentryLogcatAdapter.serializer("FIAM.Display", str);
            throw null;
        }
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        TextFieldLayout textFieldLayout = (TextFieldLayout) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (textFieldLayout == null) {
            return Float.valueOf(0.0f);
        }
        int i4 = i2 + 75;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            float f = textFieldLayout.serializer;
            throw null;
        }
        float f2 = textFieldLayout.serializer;
        int i5 = serializer + 25;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return Float.valueOf(f2);
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Log.isLoggable("FIAM.Display", 3);
        int i4 = read + 21;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        int i2 = read + 95;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objSerializer = serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        int i4 = serializer + 37;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objSerializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r0 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return (o.TextFieldLayout) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return (o.TextFieldLayout) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r3 = kotlinx.coroutines.BuildersKt.serializer + 125;
        kotlinx.coroutines.BuildersKt.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r3 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((r3 instanceof o.TextFieldLayout) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof o.TextFieldLayout) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = kotlinx.coroutines.BuildersKt.read + 61;
        kotlinx.coroutines.BuildersKt.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.TextFieldLayout RemoteActionCompatParcelizer(androidx.compose.ui.layout.IntrinsicMeasurable r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlinx.coroutines.BuildersKt.serializer
            int r1 = r1 + 107
            int r2 = r1 % 128
            kotlinx.coroutines.BuildersKt.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            java.lang.Object r3 = r3.getParentData()
            boolean r1 = r3 instanceof o.TextFieldLayout
            r2 = 62
            int r2 = r2 / 0
            if (r1 == 0) goto L38
            goto L23
        L1b:
            java.lang.Object r3 = r3.getParentData()
            boolean r1 = r3 instanceof o.TextFieldLayout
            if (r1 == 0) goto L38
        L23:
            int r1 = kotlinx.coroutines.BuildersKt.read
            int r1 = r1 + 61
            int r2 = r1 % 128
            kotlinx.coroutines.BuildersKt.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            o.TextFieldLayout r3 = (o.TextFieldLayout) r3
            r0 = 36
            int r0 = r0 / 0
            return r3
        L35:
            o.TextFieldLayout r3 = (o.TextFieldLayout) r3
            return r3
        L38:
            int r3 = kotlinx.coroutines.BuildersKt.serializer
            int r3 = r3 + 125
            int r1 = r3 % 128
            kotlinx.coroutines.BuildersKt.read = r1
            int r3 = r3 % r0
            r0 = 0
            if (r3 != 0) goto L48
            r3 = 96
            int r3 = r3 / 0
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(androidx.compose.ui.layout.IntrinsicMeasurable):o.TextFieldLayout");
    }

    public static float write(EdgeEffect edgeEffect) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        int i2 = read + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float fSerializer = fetchCustomEnterOrExitULY8qGw.serializer(edgeEffect);
        int i4 = serializer + 101;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return fSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long IconCompatParcelizer(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jSupportRequestWindowFeature = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).supportRequestWindowFeature();
        int i4 = serializer + 93;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jSupportRequestWindowFeature;
    }

    public static long MediaBrowserCompatMediaItem(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long presenter = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
        int i3 = serializer + 1;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return presenter;
    }

    public static long MediaDescriptionCompat(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 65;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
            throw null;
        }
        long emojiCompatEnabled = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
        int i3 = serializer + 57;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return emojiCompatEnabled;
    }

    public static long MediaMetadataCompat(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
        }
        ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
        throw null;
    }

    public static long MediaSessionCompatQueueItem(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = serializer + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long supportBackgroundTintMode = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
        int i4 = read + 115;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return supportBackgroundTintMode;
    }

    public static long RatingCompat(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            obj.hashCode();
            throw null;
        }
        long popupTheme = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
        int i3 = read + 111;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return popupTheme;
        }
        obj.hashCode();
        throw null;
    }

    public static long RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 77;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).reportFullyDrawn();
        }
        ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).reportFullyDrawn();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long read(getBirthDateFull getbirthdatefull) {
        long supportProgress;
        int i = 2 % 2;
        int i2 = read + 79;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            supportProgress = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportProgress();
            int i3 = 31 / 0;
        } else {
            supportProgress = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportProgress();
        }
        int i4 = serializer + 31;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return supportProgress;
    }

    public static long serializer(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jWindowCallbackWrapper = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper();
        int i4 = serializer + 75;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jWindowCallbackWrapper;
    }

    public static float write(EdgeEffect edgeEffect, float f, float f2) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = read + 57;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return fetchCustomEnterOrExitULY8qGw.write(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        int i4 = read + 37;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return f;
    }

    public static long write(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
            throw null;
        }
        long jIconCompatParcelizer = ((buildMapping) ((getPostalCode) getbirthdatefull).write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
        int i3 = serializer + 51;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return jIconCompatParcelizer;
    }

    public static /* synthetic */ DeferredCoroutine IconCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextAnnouncementContentCardView textAnnouncementContentCardView, CoroutineStart coroutineStart, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = serializer + 11;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        }
        if ((i & 2) != 0) {
            int i5 = read + 45;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                coroutineStart = CoroutineStart.DEFAULT;
            } else {
                CoroutineStart coroutineStart2 = CoroutineStart.DEFAULT;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return write(getcontentviewgroupparentlayout, textAnnouncementContentCardView, coroutineStart, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextAnnouncementContentCardView textAnnouncementContentCardView, CoroutineStart coroutineStart, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 37;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 25;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return IconCompatParcelizer(getcontentviewgroupparentlayout, textAnnouncementContentCardView, coroutineStart, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static TypedValue serializer(Context context, int i) {
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            int i3 = serializer + 109;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = read + 69;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return typedValue;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) objArr[0];
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objArr[1];
        int i = 2 % 2;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        textAnnouncementContentCardView.getClass();
        coroutineStart.getClass();
        onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new SentryClient$$ExternalSyntheticLambda1(textAnnouncementContentCardView, coroutineStart, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 1));
        int i2 = serializer + 119;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return ondrawbehindRemoteActionCompatParcelizer;
    }

    public static boolean IconCompatParcelizer(Context context, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = read + 79;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TypedValue typedValueSerializer = serializer(context, i);
        if (typedValueSerializer != null) {
            int i5 = read + 85;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? typedValueSerializer.type == 18 : typedValueSerializer.type == 13) {
                return typedValueSerializer.data != 0;
            }
        }
        return z;
    }

    public static final ProtobufReader RemoteActionCompatParcelizer(ProtobufReader protobufReader, long j) {
        Huffman$Node huffman$NodeWrite;
        int i;
        int i2 = 2 % 2;
        if (j == 19500) {
            huffman$NodeWrite = protobufReader.read();
            i = read + 79;
        } else {
            huffman$NodeWrite = protobufReader.write();
            i = read + 31;
        }
        serializer = i % Fields.SpotShadowColor;
        int i3 = i % 2;
        return new ProtobufReader(huffman$NodeWrite);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = serializer + 11;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            serializer(context, iIntValue);
            throw null;
        }
        TypedValue typedValueSerializer = serializer(context, iIntValue);
        if (typedValueSerializer == null) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(iIntValue)});
            return null;
        }
        int i3 = read + 81;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return typedValueSerializer;
    }

    public static final r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextAnnouncementContentCardView textAnnouncementContentCardView, CoroutineStart coroutineStart, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextAnnouncementContentCardView textAnnouncementContentCardViewWrite = SQLite.write(getcontentviewgroupparentlayout, textAnnouncementContentCardView);
        if (coroutineStart.isLazy()) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = new DefaultInAppMessageViewWrappercreateAnimationListener2(textAnnouncementContentCardViewWrite, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        } else {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = new r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU(textAnnouncementContentCardViewWrite, true, true);
            int i4 = serializer + 41;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        coroutineStart.invoke(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu, r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu);
        return r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
    }

    public static final DeferredCoroutine write(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextAnnouncementContentCardView textAnnouncementContentCardView, CoroutineStart coroutineStart, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        DeferredCoroutine deferredCoroutine;
        int i = 2 % 2;
        int i2 = serializer + 115;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextAnnouncementContentCardView textAnnouncementContentCardViewWrite = SQLite.write(getcontentviewgroupparentlayout, textAnnouncementContentCardView);
        if (coroutineStart.isLazy()) {
            deferredCoroutine = new canDismiss(textAnnouncementContentCardViewWrite, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            int i4 = serializer + 85;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            }
        } else {
            deferredCoroutine = new DeferredCoroutine(textAnnouncementContentCardViewWrite, true, true);
        }
        coroutineStart.invoke(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, deferredCoroutine, deferredCoroutine);
        int i6 = serializer + 51;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return deferredCoroutine;
    }

    public static final boolean write(setSpotShadowColor setspotshadowcolor) {
        int i = 2 % 2;
        Object[] objArr = {setspotshadowcolor, lockCanvasFallback.INSTANCE};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {setspotshadowcolor, isLockHardwareCanvasAvailable.INSTANCE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {setspotshadowcolor, ViewLayer.INSTANCE};
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
            }
        } else {
            int i2 = serializer + 111;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = serializer + 113;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0090  */
    /* JADX WARN: Code duplicated, block: B:11:0x00a1  */
    public static final boolean RemoteActionCompatParcelizer(setSpotShadowColor setspotshadowcolor) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = read + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, SurfaceVerificationHelper.INSTANCE}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, lockCanvasFallback.INSTANCE}, getCieXyz.write())).booleanValue()) {
                zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, isLockHardwareCanvasAvailable.INSTANCE}, getCieXyz.write())).booleanValue();
            }
            if (zBooleanValue) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue();
            }
            int i4 = read;
            int i5 = i4 + 69;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 51;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = read + 71;
        serializer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        zBooleanValue = true;
        if (zBooleanValue) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue();
        }
        int i11 = read;
        int i12 = i11 + 69;
        serializer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        int i14 = i11 + 51;
        serializer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return true;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        asFrameworkPaint asframeworkpaint;
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            view.getClass();
            int i3 = 89 / 0;
        } else {
            view.getClass();
        }
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof asFrameworkPaint) {
                int i4 = read + 73;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                asframeworkpaint = (asFrameworkPaint) tag;
            } else {
                asframeworkpaint = null;
            }
            if (asframeworkpaint != null) {
                int i5 = serializer + 125;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return asframeworkpaint;
            }
            Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
            if (objRemoteActionCompatParcelizer instanceof View) {
                view = (View) objRemoteActionCompatParcelizer;
            } else {
                int i7 = serializer + 99;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 4 % 3;
                }
                view = null;
            }
        }
        return null;
    }

    public static byte[] read(Context context, String str) {
        MessageDigest messageDigest;
        int i = 2 % 2;
        PackageInfo packageInfo = accessgetTvMediaContextMenucp.serializer(context).read(64, str);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            int i2 = serializer;
            int i3 = i2 + 55;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (signatureArr.length == 1) {
                int i5 = i2 + 31;
                int i6 = i5 % Fields.SpotShadowColor;
                read = i6;
                int i7 = i5 % 2 != 0 ? 0 : 1;
                int i8 = i6 + 73;
                serializer = i8 % Fields.SpotShadowColor;
                while (true) {
                    int i9 = i8 % 2;
                    if (i7 >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                        if (messageDigest != null) {
                            break;
                        }
                        i7++;
                        i8 = serializer + 43;
                        read = i8 % Fields.SpotShadowColor;
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }
                if (messageDigest != null) {
                    return messageDigest.digest(packageInfo.signatures[0].toByteArray());
                }
            }
        }
        return null;
    }

    public static final boolean serializer(RegistryMissingComponentException registryMissingComponentException) {
        long j;
        int i = 2 % 2;
        registryMissingComponentException.getClass();
        try {
            RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
            long j2 = registryMissingComponentException.size;
            if (j2 > 64) {
                int i2 = serializer + 85;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                j = 64;
            } else {
                j = j2;
            }
            registryMissingComponentException.IconCompatParcelizer(registryMissingComponentException2, 0L, j);
            int i4 = serializer + 19;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < 16 && !registryMissingComponentException2.RatingCompat(); i6++) {
                int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = registryMissingComponentException2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                if (Character.isISOControl(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) && !Character.isWhitespace(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                    int i7 = serializer + 41;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object serializer(Object[] objArr) {
        convertStringJsonArrayToList convertstringjsonarraytolist;
        Fragment fragment = (Fragment) objArr[0];
        int i = 2 % 2;
        setNativeShader.RemoteActionCompatParcelizer(fragment, "fragment");
        Fragment parentFragment = fragment;
        while (true) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                FragmentActivity activity = fragment.getActivity();
                if (!(activity instanceof convertStringJsonArrayToList)) {
                    if (activity.getApplication() instanceof convertStringJsonArrayToList) {
                        convertstringjsonarraytolist = (convertStringJsonArrayToList) activity.getApplication();
                        break;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No injector was found for ", fragment.getClass().getCanonicalName()));
                    return null;
                }
                int i2 = serializer + 117;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    convertstringjsonarraytolist = (convertStringJsonArrayToList) activity;
                    break;
                }
                convertstringjsonarraytolist = (convertStringJsonArrayToList) activity;
                int i3 = 94 / 0;
                break;
            }
            if (parentFragment instanceof convertStringJsonArrayToList) {
                convertstringjsonarraytolist = (convertStringJsonArrayToList) parentFragment;
                int i4 = read + 19;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            convertstringjsonarraytolist.getClass();
        }
        r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer = convertstringjsonarraytolist.IconCompatParcelizer();
        setNativeShader.IconCompatParcelizer(r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer, "%s.androidInjector() returned null", convertstringjsonarraytolist.getClass());
        r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer.inject(fragment);
        return null;
    }

    public static final Object withContext(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        TextAnnouncementContentCardView textAnnouncementContentCardViewIconCompatParcelizer;
        Object objIconCompatParcelizer;
        int i = 2 % 2;
        TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        if (((Boolean) textAnnouncementContentCardView.fold(Boolean.FALSE, new SaversKt$$ExternalSyntheticLambda7(5))).booleanValue()) {
            textAnnouncementContentCardViewIconCompatParcelizer = SQLite.IconCompatParcelizer(context, textAnnouncementContentCardView, false);
        } else {
            int i2 = serializer + 29;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                context.plus(textAnnouncementContentCardView);
                throw null;
            }
            textAnnouncementContentCardViewIconCompatParcelizer = context.plus(textAnnouncementContentCardView);
        }
        JobKt.RemoteActionCompatParcelizer(textAnnouncementContentCardViewIconCompatParcelizer);
        if (textAnnouncementContentCardViewIconCompatParcelizer == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(shortNewsContentCardView, textAnnouncementContentCardViewIconCompatParcelizer);
            objIconCompatParcelizer = MathKt.startUndspatched(scopeCoroutine, true, scopeCoroutine, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        } else {
            ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnouncementContentCardViewIconCompatParcelizer.get(shortNewsContentCardViewCompanion), context.get(shortNewsContentCardViewCompanion)}, getCieXyz.write())).booleanValue()) {
                IInAppMessageAnimationFactory iInAppMessageAnimationFactory = new IInAppMessageAnimationFactory(shortNewsContentCardView, textAnnouncementContentCardViewIconCompatParcelizer);
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = iInAppMessageAnimationFactory.RemoteActionCompatParcelizer;
                Object objSerializer = ThreadContextKt.serializer(textAnnouncementContentCardView2, null);
                try {
                    objIconCompatParcelizer = MathKt.startUndspatched(iInAppMessageAnimationFactory, true, iInAppMessageAnimationFactory, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                    ThreadContextKt.write(textAnnouncementContentCardView2, objSerializer);
                } catch (Throwable th) {
                    ThreadContextKt.write(textAnnouncementContentCardView2, objSerializer);
                    throw th;
                }
            } else {
                open openVar = new open(shortNewsContentCardView, textAnnouncementContentCardViewIconCompatParcelizer);
                try {
                    DispatchedContinuationKt.serializer(createFromParcel.INSTANCE, LoadBalancer$Helper.intercepted(LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, openVar, openVar)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = open.write;
                    do {
                        int i3 = atomicIntegerFieldUpdater.get(openVar);
                        if (i3 != 0) {
                            int i4 = serializer + 125;
                            read = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0 ? i3 != 2 : i3 != 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Already suspended");
                                int i5 = serializer + 95;
                                read = i5 % Fields.SpotShadowColor;
                                int i6 = i5 % 2;
                                return null;
                            }
                            objIconCompatParcelizer = JobKt.IconCompatParcelizer(openVar.ParcelableVolumeInfo());
                            if (objIconCompatParcelizer instanceof getClosingAnimation) {
                                throw ((getClosingAnimation) objIconCompatParcelizer).IconCompatParcelizer;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(openVar, 0, 1));
                    objIconCompatParcelizer = CoroutineSingletons.COROUTINE_SUSPENDED;
                } catch (Throwable th2) {
                    SentryUUID.IconCompatParcelizer(th2, openVar);
                    throw null;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objIconCompatParcelizer;
    }

    public static final Object serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        EventLoop eventLoopWrite;
        TextAnnouncementContentCardView textAnnouncementContentCardViewIconCompatParcelizer;
        long j;
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % Fields.SpotShadowColor;
        getClosingAnimation getclosinganimation = null;
        if (i2 % 2 != 0) {
            Thread.currentThread();
            r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            getclosinganimation.hashCode();
            throw null;
        }
        Thread threadCurrentThread = Thread.currentThread();
        ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder = ShortNewsContentCardViewCompanion.serializer;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) textAnnouncementContentCardView.get(imageOnlyContentCardViewViewHolder);
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc2 = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        if (coroutineDispatcher == null) {
            eventLoopWrite = ThreadLocalEventLoop.write();
            textAnnouncementContentCardViewIconCompatParcelizer = SQLite.IconCompatParcelizer((TextAnnouncementContentCardView) r8lambda2qmxd75iptxkfld4rjabqemoamc2, textAnnouncementContentCardView.plus(eventLoopWrite), true);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            if (textAnnouncementContentCardViewIconCompatParcelizer != defaultScheduler && textAnnouncementContentCardViewIconCompatParcelizer.get(imageOnlyContentCardViewViewHolder) == null) {
                textAnnouncementContentCardViewIconCompatParcelizer = textAnnouncementContentCardViewIconCompatParcelizer.plus(defaultScheduler);
            }
        } else {
            eventLoopWrite = (EventLoop) ThreadLocalEventLoop.RemoteActionCompatParcelizer.get();
            textAnnouncementContentCardViewIconCompatParcelizer = SQLite.IconCompatParcelizer((TextAnnouncementContentCardView) r8lambda2qmxd75iptxkfld4rjabqemoamc2, textAnnouncementContentCardView, true);
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            if (textAnnouncementContentCardViewIconCompatParcelizer != defaultScheduler2) {
                int i3 = serializer + 95;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    textAnnouncementContentCardViewIconCompatParcelizer.get(imageOnlyContentCardViewViewHolder);
                    throw null;
                }
                if (textAnnouncementContentCardViewIconCompatParcelizer.get(imageOnlyContentCardViewViewHolder) == null) {
                    textAnnouncementContentCardViewIconCompatParcelizer = textAnnouncementContentCardViewIconCompatParcelizer.plus(defaultScheduler2);
                }
            }
        }
        addDismissRunnable adddismissrunnable = new addDismissRunnable(textAnnouncementContentCardViewIconCompatParcelizer, threadCurrentThread, eventLoopWrite);
        CoroutineStart.DEFAULT.invoke(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, adddismissrunnable, adddismissrunnable);
        EventLoop eventLoop = adddismissrunnable.IconCompatParcelizer;
        if (eventLoop != null) {
            int i4 = serializer + 45;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = EventLoop.RemoteActionCompatParcelizer;
            eventLoop.serializer(false);
            int i7 = serializer + 99;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        while (true) {
            if (eventLoop != null) {
                try {
                    j = eventLoop.read();
                } catch (Throwable th) {
                    if (eventLoop != null) {
                        int i9 = EventLoop.RemoteActionCompatParcelizer;
                        eventLoop.read(false);
                    }
                    throw th;
                }
            } else {
                j = Long.MAX_VALUE;
            }
            if (adddismissrunnable.PlaybackStateCompat()) {
                break;
            }
            int i10 = read + 41;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                LockSupport.parkNanos(adddismissrunnable, j);
                int i11 = 13 / 0;
                if (Thread.interrupted()) {
                    adddismissrunnable.MediaDescriptionCompat(new InterruptedException());
                }
            } else {
                LockSupport.parkNanos(adddismissrunnable, j);
                if (Thread.interrupted()) {
                    adddismissrunnable.MediaDescriptionCompat(new InterruptedException());
                }
            }
        }
        if (eventLoop != null) {
            int i12 = EventLoop.RemoteActionCompatParcelizer;
            eventLoop.read(false);
        }
        Object objIconCompatParcelizer = JobKt.IconCompatParcelizer(adddismissrunnable.ParcelableVolumeInfo());
        if (objIconCompatParcelizer instanceof getClosingAnimation) {
            int i13 = serializer + 3;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getclosinganimation = (getClosingAnimation) objIconCompatParcelizer;
        }
        if (getclosinganimation != null) {
            throw getclosinganimation.IconCompatParcelizer;
        }
        int i15 = read + 81;
        serializer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return objIconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144 A[RETURN] */
    public static final setGraphicModalMaxWidthDp read(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml, registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50, boolean z) {
        Object objSerializer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpWrite;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp resetlayoutparamsifappropriate;
        int i = 2 % 2;
        getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.read(registerinappmessagemanagerlambda50);
        boolean z2 = registerinappmessagemanagerlambda50.read();
        List listIconCompatParcelizer = registerinappmessagemanagerlambda50.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
        Iterator it = listIconCompatParcelizer.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                List list = instance_delegatelambda0.write;
                int i2 = 5;
                if (!(!zIsEmpty)) {
                    if (!Options.Companion.read(getunregisteredinappmessageannotations).isInterface() || prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, list) == null) {
                        IInAppMessageManagerListener iInAppMessageManagerListener = createInAppMessageViewlambda4.RemoteActionCompatParcelizer;
                        if (z2) {
                            setgraphicmodalmaxwidthdpWrite = createInAppMessageViewlambda4.write.write(getunregisteredinappmessageannotations);
                        } else {
                            setgraphicmodalmaxwidthdpWrite = createInAppMessageViewlambda4.RemoteActionCompatParcelizer.write(getunregisteredinappmessageannotations);
                            if (setgraphicmodalmaxwidthdpWrite == null) {
                                setgraphicmodalmaxwidthdpWrite = null;
                            }
                        }
                    } else {
                        setgraphicmodalmaxwidthdpWrite = null;
                    }
                } else if (prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer) {
                    setgraphicmodalmaxwidthdpWrite = null;
                } else {
                    IInAppMessageManagerListener iInAppMessageManagerListener2 = createInAppMessageViewlambda4.RemoteActionCompatParcelizer;
                    if (z2) {
                        objSerializer = createInAppMessageViewlambda4.read.serializer(getunregisteredinappmessageannotations, arrayList);
                        int i3 = serializer + 5;
                        read = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                    } else {
                        objSerializer = createInAppMessageViewlambda4.IconCompatParcelizer.serializer(getunregisteredinappmessageannotations, arrayList);
                    }
                    if (objSerializer instanceof isItemDismissable) {
                        int i5 = read + 93;
                        serializer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            int i6 = 78 / 0;
                        }
                        objSerializer = null;
                    }
                    setgraphicmodalmaxwidthdpWrite = (setGraphicModalMaxWidthDp) objSerializer;
                }
                if (setgraphicmodalmaxwidthdpWrite != null) {
                    return setgraphicmodalmaxwidthdpWrite;
                }
                if (arrayList.isEmpty()) {
                    setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations);
                    if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer == null && (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, list)) == null) {
                        int i7 = read + 75;
                        serializer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            Options.Companion.read(getunregisteredinappmessageannotations).isInterface();
                            throw null;
                        }
                        if (Options.Companion.read(getunregisteredinappmessageannotations).isInterface()) {
                            resetlayoutparamsifappropriate = new resetLayoutParamsIfAppropriate(getunregisteredinappmessageannotations);
                            setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = resetlayoutparamsifappropriate;
                        } else {
                            setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = null;
                        }
                    }
                    if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
                        if (z2) {
                            return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
                        }
                        int i8 = read + 33;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer);
                    }
                } else {
                    ArrayList arrayListIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, arrayList, z);
                    if (arrayListIconCompatParcelizer != null) {
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, arrayListIconCompatParcelizer, new g0$$ExternalSyntheticLambda8(i2, arrayList));
                        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 == null) {
                            setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, arrayListIconCompatParcelizer);
                            if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer == null) {
                                int i10 = serializer + 35;
                                read = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 == 0) {
                                    int i11 = 4 / 0;
                                    if (Options.Companion.read(getunregisteredinappmessageannotations).isInterface()) {
                                        resetlayoutparamsifappropriate = new resetLayoutParamsIfAppropriate(getunregisteredinappmessageannotations);
                                        setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = resetlayoutparamsifappropriate;
                                    } else {
                                        setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = null;
                                    }
                                } else if (Options.Companion.read(getunregisteredinappmessageannotations).isInterface()) {
                                    resetlayoutparamsifappropriate = new resetLayoutParamsIfAppropriate(getunregisteredinappmessageannotations);
                                    setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = resetlayoutparamsifappropriate;
                                } else {
                                    setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = null;
                                }
                            }
                        } else {
                            setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2;
                        }
                        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
                            if (z2) {
                                return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
                            }
                            int i12 = read + 33;
                            serializer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            return LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer);
                        }
                    }
                }
                return null;
            }
            registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40 = (registerInAppMessageManagerlambda40) it.next();
            registerinappmessagemanagerlambda40.getClass();
            registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda51 = registerinappmessagemanagerlambda40.serializer;
            if (registerinappmessagemanagerlambda51 == null) {
                DrawableTransformation.serializer(registerinappmessagemanagerlambda51, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            int i14 = read + 93;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                arrayList.add(registerinappmessagemanagerlambda51);
                obj.hashCode();
                throw null;
            }
            arrayList.add(registerinappmessagemanagerlambda51);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x013f, please report this as an issue */
    public static final Source getSource(Style style, String str) {
        Object objUnwrap;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 99;
        read = i3 % Fields.SpotShadowColor;
        Source sourceBuild$2 = null;
        try {
            if (i3 % 2 == 0) {
                style.getClass();
                str.getClass();
                objUnwrap = TypeUtilsKt.unwrap(style.getStyleSourceProperty(str, "type"), String.class);
                int i4 = 78 / 0;
            } else {
                style.getClass();
                str.getClass();
                objUnwrap = TypeUtilsKt.unwrap(style.getStyleSourceProperty(str, "type"), String.class);
            }
        } catch (RuntimeException unused) {
            objUnwrap = null;
        }
        String str2 = (String) objUnwrap;
        if (str2 != null) {
            int i5 = read + 121;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                str2.hashCode();
                throw null;
            }
            switch (str2) {
                case "raster-array":
                    sourceBuild$2 = new HttpGetRequest(str, 3).build$2();
                    sourceBuild$2.delegate = style;
                    break;
                case "custom-geometry":
                    CustomGeometrySourceOptions customGeometrySourceOptionsBuild = new CustomGeometrySourceOptions.Builder().build();
                    customGeometrySourceOptionsBuild.getClass();
                    sourceBuild$2 = new CustomRasterSource(str, customGeometrySourceOptionsBuild);
                    sourceBuild$2.delegate = style;
                    break;
                case "raster":
                    sourceBuild$2 = new HttpGetRequest(str, 5).build$4();
                    sourceBuild$2.delegate = style;
                    break;
                case "vector":
                    sourceBuild$2 = new HttpGetRequest(str, 6).build$5();
                    sourceBuild$2.delegate = style;
                    i = serializer + 29;
                    read = i % Fields.SpotShadowColor;
                    int i6 = i % 2;
                    break;
                case "custom-raster":
                    CustomRasterSourceOptions customRasterSourceOptionsBuild = new CustomRasterSourceOptions.Builder().build();
                    customRasterSourceOptionsBuild.getClass();
                    sourceBuild$2 = new CustomRasterSource(str, customRasterSourceOptionsBuild);
                    sourceBuild$2.delegate = style;
                    break;
                case "geojson":
                    sourceBuild$2 = new GeoJsonSource.Builder(str).build();
                    sourceBuild$2.delegate = style;
                    break;
                case "image":
                    sourceBuild$2 = new HttpGetRequest(str, 1).build();
                    sourceBuild$2.delegate = style;
                    i = read + 79;
                    serializer = i % Fields.SpotShadowColor;
                    int i7 = i % 2;
                    break;
                case "model":
                    sourceBuild$2 = new HttpGetRequest(str, 2).build$1();
                    sourceBuild$2.delegate = style;
                    break;
                case "raster-dem":
                    sourceBuild$2 = new HttpGetRequest(str, 4).build$3();
                    sourceBuild$2.delegate = style;
                    break;
                default:
                    MapboxLogger.logW("StyleSourcePlugin", "Source type: " + str2 + " unknown.");
                    break;
            }
        }
        int i8 = serializer + 25;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
        return sourceBuild$2;
    }

    public static TypedValue read(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (TypedValue) IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, objArr, iRemoteActionCompatParcelizer);
    }

    public static void read() {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    public static onDrawBehind RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (onDrawBehind) IconCompatParcelizer(775282581, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -775282577, new Object[]{textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, iRemoteActionCompatParcelizer);
    }

    public static void read(Fragment fragment) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{fragment}, iRemoteActionCompatParcelizer);
    }

    public static final float read(TextFieldLayout textFieldLayout) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return ((Float) IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -386167695, new Object[]{textFieldLayout}, iRemoteActionCompatParcelizer)).floatValue();
    }

    public static final asFrameworkPaint IconCompatParcelizer(View view) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (asFrameworkPaint) IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, 1340292178, new Object[]{view}, iRemoteActionCompatParcelizer);
    }
}
