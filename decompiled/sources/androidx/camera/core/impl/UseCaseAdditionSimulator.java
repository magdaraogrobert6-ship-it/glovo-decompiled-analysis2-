package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$prepareNavigationForRoutesParsing$2;
import com.mapbox.navigation.core.MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$ActiveGuidance;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$Idle;
import io.grpc.LoadBalancer$Helper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.CameraControlOperationCanceledException;
import o.CameraIdUtil;
import o.CameraXExternalSyntheticLambda2;
import o.FocusMeteringAction;
import o.ImageCapture1;
import o.InvalidVideoProfilesQuirk;
import o.JpegHalCorruptImageQuirk;
import o.Recorder3;
import o.SupportedSurfaceCombination;
import o.accessgetGreencp;
import o.createFromParcel;
import o.getCieXyz;
import o.getScreenFlashInternal;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setInflatedId;
import o.valueOf;

/* JADX INFO: loaded from: classes.dex */
public abstract class UseCaseAdditionSimulator {
    private static int read = 1;
    public static TransitionValuesMaps serializer;
    private static int write;

    public static final void read(FocusMeteringAction focusMeteringAction, LegacySessionConfig legacySessionConfig, SupportedSurfaceCombination supportedSurfaceCombination) {
        getScreenFlashInternal getscreenflashinternalIconCompatParcelizer;
        TransitionValuesMaps transitionValuesMaps = serializer;
        if (transitionValuesMaps == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String str = focusMeteringAction.read();
        str.getClass();
        ImageCapture1 imageCapture1Write = ((CameraRepository) transitionValuesMaps.MediaBrowserCompatMediaItem).write(str);
        InvalidVideoProfilesQuirk invalidVideoProfilesQuirk = new InvalidVideoProfilesQuirk(imageCapture1Write.MediaMetadataCompat(), CameraXExternalSyntheticLambda2.write);
        valueOf valueof = valueOf.read;
        CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(imageCapture1Write, null, invalidVideoProfilesQuirk, null, valueof, valueof, (Camera2CameraCoordinator) transitionValuesMaps.MediaDescriptionCompat, (accessgetGreencp) transitionValuesMaps.RatingCompat, (Recorder3) transitionValuesMaps.MediaMetadataCompat);
        CameraIdUtil cameraIdUtil = (CameraIdUtil) legacySessionConfig.MediaDescriptionCompat;
        synchronized (cameraUseCaseAdapter.PlaybackStateCompat) {
            cameraUseCaseAdapter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = cameraIdUtil;
        }
        List list = (List) legacySessionConfig.write;
        synchronized (cameraUseCaseAdapter.PlaybackStateCompat) {
            cameraUseCaseAdapter.RatingCompat = list;
        }
        synchronized (cameraUseCaseAdapter.PlaybackStateCompat) {
        }
        Range range = (Range) legacySessionConfig.IconCompatParcelizer;
        synchronized (cameraUseCaseAdapter.PlaybackStateCompat) {
            cameraUseCaseAdapter.MediaMetadataCompat = range;
        }
        List list2 = (List) legacySessionConfig.RatingCompat;
        Objects.toString(list2);
        Objects.toString(supportedSurfaceCombination);
        setInflatedId.IconCompatParcelizer(3, "CameraUseCaseAdapter");
        synchronized (cameraUseCaseAdapter.PlaybackStateCompat) {
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk = cameraUseCaseAdapter.MediaSessionCompatQueueItem;
            CameraControlOperationCanceledException cameraControlOperationCanceledException = cameraUseCaseAdapter.serializer;
            jpegHalCorruptImageQuirk.write(cameraControlOperationCanceledException);
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk2 = cameraUseCaseAdapter.PlaybackStateCompatCustomAction;
            if (jpegHalCorruptImageQuirk2 != null) {
                jpegHalCorruptImageQuirk2.write(cameraControlOperationCanceledException);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.RemoteActionCompatParcelizer);
            linkedHashSet.addAll(list2);
            HashMap mapSerializer = CameraUseCaseAdapter.serializer(linkedHashSet, supportedSurfaceCombination);
            try {
                try {
                    getscreenflashinternalIconCompatParcelizer = cameraUseCaseAdapter.IconCompatParcelizer(linkedHashSet, cameraUseCaseAdapter.PlaybackStateCompatCustomAction != null);
                    CameraUseCaseAdapter.read(mapSerializer);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter.CameraException(e);
                }
            } catch (Throwable th) {
                CameraUseCaseAdapter.read(mapSerializer);
                throw th;
            }
        }
        getscreenflashinternalIconCompatParcelizer.getClass();
    }

    public static final boolean isNavigationInActiveGuidance(MapboxNavigation mapboxNavigation) {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mapboxNavigation.getClass();
            z = mapboxNavigation.navigationSession.state instanceof NavigationSessionState$ActiveGuidance;
            int i3 = 4 / 0;
        } else {
            mapboxNavigation.getClass();
            z = mapboxNavigation.navigationSession.state instanceof NavigationSessionState$ActiveGuidance;
        }
        int i4 = write + 9;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    public static final void IconCompatParcelizer(MapboxNavigation mapboxNavigation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        mapboxNavigation.getClass();
        if (!isNavigationActive(mapboxNavigation)) {
            int i2 = read + 101;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mapboxNavigation);
            int i4 = write + 29;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = write + 119;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public static final Flow IconCompatParcelizer(MapboxNavigation mapboxNavigation) {
        int i = 2 % 2;
        mapboxNavigation.getClass();
        Flow flowWrite = FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, null, 2));
        int i2 = read + 111;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowWrite;
    }

    public static final boolean isNavigationActive(MapboxNavigation mapboxNavigation) {
        Object objRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            mapboxNavigation.getClass();
            objRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxNavigation.navigationSession.state, NavigationSessionState$Idle.INSTANCE}, getCieXyz.write());
        } else {
            mapboxNavigation.getClass();
            objRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxNavigation.navigationSession.state, NavigationSessionState$Idle.INSTANCE}, getCieXyz.write());
        }
        return !((Boolean) objRemoteActionCompatParcelizer).booleanValue();
    }

    public static final Object awaitNavigationRoutes(MapboxNavigation mapboxNavigation, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
        cancellableContinuationImpl.read();
        MapboxNavigation.setNavigationRoutes$default(mapboxNavigation, instance_delegatelambda0.write, new MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1(1, cancellableContinuationImpl), 2);
        Object result = cancellableContinuationImpl.getResult();
        if (result != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = read;
        int i3 = i2 + 41;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return result;
    }
}
