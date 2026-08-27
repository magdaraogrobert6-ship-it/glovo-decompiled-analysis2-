package com.sentiance.core.model.thrift;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.location.Location;
import android.os.Build;
import android.os.Trace;
import android.util.TypedValue;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.n5;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.data.util.exception.FoodoraPermissionDeniedException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.material.datepicker.MaterialCalendar;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.sentiance.core.model.events.C$b;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import io.socket.parser.IOParser$Decoder;
import java.lang.ref.WeakReference;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustConfig;
import o.AndroidIndirectPointerEvent_androidKt;
import o.AnimatedContentMeasurePolicy;
import o.BrazeExternalSyntheticLambda45;
import o.BrazeExternalSyntheticLambda5;
import o.BulletSpan_androidKt;
import o.CameraInfoUnavailableException;
import o.CameraXExternalSyntheticLambda2;
import o.DBUtil__DBUtil_androidKtperformInTransactionSuspending2;
import o.FocusListener;
import o.FocusMeteringAction;
import o.FrameworkServiceWorkerClient;
import o.ImageCapture1;
import o.InvalidVideoProfilesQuirk;
import o.ObjectListtoString1;
import o.PassthroughConnection;
import o.PreferenceGroupAdapter;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewPixelHDRnetQuirk;
import o.Recorder3;
import o.ScaleFactorKt;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.ShortNewsContentCardView;
import o.UseCaseGroup;
import o.accessgetGreencp;
import o.accessgetModulatecp;
import o.accessisRenderNodeCompatiblecp;
import o.acquire;
import o.checkAppToken;
import o.disableFbIdReading;
import o.enableCostDataInAttribution;
import o.enableFirstSessionDelay;
import o.enablePlayStoreKidsCompliance;
import o.enablePreinstallTracking;
import o.endRearDisplaySession;
import o.getButtonXEK5gGoQ;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getContextClick5zf0vsI;
import o.getCostDataInAttributionEnabled;
import o.getCurrentContentInsetLeft;
import o.getCurrentContentInsetRight;
import o.getDataStoreFileName;
import o.getDefaultTracker;
import o.getDoubleOrNull;
import o.getEnvironment;
import o.getEventDeduplicationIdsMaxSize;
import o.getExternalDeviceId;
import o.getLogger;
import o.getLogoDescription;
import o.getNavButtonView;
import o.getOnEventTrackingFailedListener;
import o.getOnRemoteTriggerListener;
import o.getOnSessionTrackingSucceededListener;
import o.getPreinstallFilePath;
import o.getPresentationContext;
import o.getQueryParameterslambda2;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getToggleOff5zf0vsI;
import o.inCompatibilityMode;
import o.isFbIdReadingEnabled;
import o.isHiddenannotations;
import o.maxIntrinsicHeight;
import o.mergeJsonObjects;
import o.nativeWriteJpegToSurface;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.requestGeofences;
import o.requestInputModeiuPiT84;
import o.setAdRevenuePlacement;
import o.setAdRevenueUnit;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setMeasuredSizeozmzZPI;
import o.setPresentationView;
import o.setRefreshing;
import o.setRevenue;
import o.subscribeToNoMatchingTriggerForEvent;
import o.subscribeToSdkAuthenticationFailures;
import o.switchToOfflineMode;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.valueOf;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class k$c implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, FrameworkServiceWorkerClient {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static final CameraInfoUnavailableException RemoteActionCompatParcelizer(k$c k_c, getLogoDescription getlogodescription) {
        Iterator it = getlogodescription.RemoteActionCompatParcelizer.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = getCurrentContentInsetLeft.write;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{previewPixelHDRnetQuirk, previewPixelHDRnetQuirk}, iWrite3)).booleanValue()) {
                synchronized (UseCaseGroup.write) {
                }
                ((Context) k_c.MediaBrowserCompatMediaItem).getClass();
            }
        }
        return CameraXExternalSyntheticLambda2.write;
    }

    public static final void write(k$c k_c, int i) {
        getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
        if (getcurrentcontentinsetright == null) {
            return;
        }
        Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright.RemoteActionCompatParcelizer;
        if (camera2CameraFactory == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("CameraX not initialized yet.");
            return;
        }
        Camera2CameraCoordinator camera2CameraCoordinator = camera2CameraFactory.IconCompatParcelizer;
        synchronized (camera2CameraCoordinator.MediaMetadataCompat) {
            int i2 = camera2CameraCoordinator.write;
            if (i == i2) {
                return;
            }
            camera2CameraCoordinator.write = i;
            ArrayList<nativeWriteJpegToSurface> arrayList = new ArrayList(camera2CameraCoordinator.MediaBrowserCompatMediaItem);
            if (i2 == 2 && i != 2) {
                camera2CameraCoordinator.serializer.clear();
            }
            for (nativeWriteJpegToSurface nativewritejpegtosurface : arrayList) {
                synchronized (nativewritejpegtosurface.write) {
                    boolean z = true;
                    nativewritejpegtosurface.MediaMetadataCompat = i == 2 ? 2 : 1;
                    boolean z2 = i2 != 2 && i == 2;
                    if (i2 != 2 || i == 2) {
                        z = false;
                    }
                    if (z2 || z) {
                        nativewritejpegtosurface.serializer();
                    }
                }
            }
        }
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(Location location) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 5;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaBrowserCompatMediaItem = location;
            return;
        }
        this.MediaBrowserCompatMediaItem = location;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static maxIntrinsicHeight serializer(k$c k_c, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getLogoDescription getlogodescription, LegacySessionConfig legacySessionConfig) {
        maxIntrinsicHeight maxintrinsicheightIconCompatParcelizer;
        Collection collectionUnmodifiableCollection;
        boolean zContains;
        valueOf valueof = valueOf.read;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:bindToLifecycle-internal");
        try {
            PrematureEndOfStreamVideoQuirk.write();
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            getcurrentcontentinsetright.getClass();
            ImageCapture1 imageCapture1IconCompatParcelizer = getlogodescription.IconCompatParcelizer(getcurrentcontentinsetright.MediaBrowserCompatMediaItem.serializer());
            imageCapture1IconCompatParcelizer.getClass();
            imageCapture1IconCompatParcelizer.RemoteActionCompatParcelizer(true);
            InvalidVideoProfilesQuirk invalidVideoProfilesQuirkSerializer = k_c.serializer(getlogodescription);
            PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = ((CameraInfoUnavailableException) invalidVideoProfilesQuirkSerializer.IconCompatParcelizer).RatingCompat;
            previewPixelHDRnetQuirk.getClass();
            String str = invalidVideoProfilesQuirkSerializer.write.read();
            str.getClass();
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            getNavButtonView getnavbuttonview = new getNavButtonView((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer), previewPixelHDRnetQuirk);
            ObjectListtoString1 objectListtoString1 = (ObjectListtoString1) k_c.read;
            synchronized (objectListtoString1.MediaSessionCompatQueueItem) {
                maxintrinsicheightIconCompatParcelizer = (maxIntrinsicHeight) objectListtoString1.RemoteActionCompatParcelizer.get(new AnimatedContentMeasurePolicy(System.identityHashCode(accessisrendernodecompatiblecp), getnavbuttonview));
            }
            ObjectListtoString1 objectListtoString2 = (ObjectListtoString1) k_c.read;
            synchronized (objectListtoString2.MediaSessionCompatQueueItem) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(objectListtoString2.RemoteActionCompatParcelizer.values());
            }
            for (UseCase useCase : (List) legacySessionConfig.RatingCompat) {
                for (Object obj : collectionUnmodifiableCollection) {
                    obj.getClass();
                    maxIntrinsicHeight maxintrinsicheight = (maxIntrinsicHeight) obj;
                    synchronized (maxintrinsicheight.read) {
                        zContains = ((ArrayList) maxintrinsicheight.RemoteActionCompatParcelizer.serializer()).contains(useCase);
                    }
                    if (zContains) {
                        Object[] objArr = {maxintrinsicheight.write(), accessisrendernodecompatiblecp};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1)));
                        }
                    }
                }
            }
            if (maxintrinsicheightIconCompatParcelizer == null) {
                ObjectListtoString1 objectListtoString3 = (ObjectListtoString1) k_c.read;
                getCurrentContentInsetRight getcurrentcontentinsetright2 = (getCurrentContentInsetRight) k_c.serializer;
                getcurrentcontentinsetright2.getClass();
                TransitionValuesMaps transitionValuesMaps = getcurrentcontentinsetright2.MediaSessionCompatQueueItem;
                if (transitionValuesMaps == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                maxintrinsicheightIconCompatParcelizer = objectListtoString3.IconCompatParcelizer(accessisrendernodecompatiblecp, new CameraUseCaseAdapter(imageCapture1IconCompatParcelizer, null, invalidVideoProfilesQuirkSerializer, null, valueof, valueof, (Camera2CameraCoordinator) transitionValuesMaps.MediaDescriptionCompat, (accessgetGreencp) transitionValuesMaps.RatingCompat, (Recorder3) transitionValuesMaps.MediaMetadataCompat));
            }
            if (!((List) legacySessionConfig.RatingCompat).isEmpty()) {
                ObjectListtoString1 objectListtoString4 = (ObjectListtoString1) k_c.read;
                getCurrentContentInsetRight getcurrentcontentinsetright3 = (getCurrentContentInsetRight) k_c.serializer;
                getcurrentcontentinsetright3.getClass();
                Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright3.RemoteActionCompatParcelizer;
                if (camera2CameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                objectListtoString4.RemoteActionCompatParcelizer(maxintrinsicheightIconCompatParcelizer, legacySessionConfig, camera2CameraFactory.IconCompatParcelizer);
                ((HashSet) k_c.MediaDescriptionCompat).add(new AnimatedContentMeasurePolicy(System.identityHashCode(accessisrendernodecompatiblecp), getnavbuttonview));
            }
            Trace.endSection();
            return maxintrinsicheightIconCompatParcelizer;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public k$c(Context context) {
        Object[] objArr = {context, Integer.valueOf(R.attr.materialCalendarStyle), MaterialCalendar.class.getCanonicalName()};
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(((TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, objArr, iRemoteActionCompatParcelizer)).data, setMeasuredSizeozmzZPI.MaterialCalendar);
        this.RemoteActionCompatParcelizer = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.MediaSessionCompatQueueItem = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.write = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.IconCompatParcelizer = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 7);
        this.read = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.serializer = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.MediaBrowserCompatMediaItem = accessgetModulatecp.IconCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.MediaDescriptionCompat = paint;
        paint.setColor(colorStateListIconCompatParcelizer.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public InvalidVideoProfilesQuirk serializer(getLogoDescription getlogodescription) {
        Object invalidVideoProfilesQuirk;
        getlogodescription.getClass();
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:getCameraInfo");
        try {
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) this.serializer;
            getcurrentcontentinsetright.getClass();
            FocusMeteringAction focusMeteringActionMediaMetadataCompat = getlogodescription.IconCompatParcelizer(getcurrentcontentinsetright.MediaBrowserCompatMediaItem.serializer()).MediaMetadataCompat();
            focusMeteringActionMediaMetadataCompat.getClass();
            CameraInfoUnavailableException cameraInfoUnavailableExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this, getlogodescription);
            String str = focusMeteringActionMediaMetadataCompat.read();
            str.getClass();
            PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = cameraInfoUnavailableExceptionRemoteActionCompatParcelizer.RatingCompat;
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            getNavButtonView getnavbuttonview = new getNavButtonView((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer), previewPixelHDRnetQuirk);
            synchronized (this.RemoteActionCompatParcelizer) {
                invalidVideoProfilesQuirk = ((HashMap) this.MediaSessionCompatQueueItem).get(getnavbuttonview);
                if (invalidVideoProfilesQuirk == null) {
                    invalidVideoProfilesQuirk = new InvalidVideoProfilesQuirk(focusMeteringActionMediaMetadataCompat, cameraInfoUnavailableExceptionRemoteActionCompatParcelizer);
                    ((HashMap) this.MediaSessionCompatQueueItem).put(getnavbuttonview, invalidVideoProfilesQuirk);
                }
            }
            InvalidVideoProfilesQuirk invalidVideoProfilesQuirk2 = (InvalidVideoProfilesQuirk) invalidVideoProfilesQuirk;
            Trace.endSection();
            return invalidVideoProfilesQuirk2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static k$c read(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2, setPresentationView setpresentationview, PreferenceGroupAdapter preferenceGroupAdapter, acquire acquireVar, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt3) {
        int i = 2 % 2;
        k$c k_c = new k$c(mergejsonobjects, mergejsonobjects2, androidIndirectPointerEvent_androidKt, androidIndirectPointerEvent_androidKt2, setpresentationview, preferenceGroupAdapter, acquireVar, androidIndirectPointerEvent_androidKt3);
        int i2 = RatingCompat + 121;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return k_c;
    }

    public static getPreinstallFilePath IconCompatParcelizer(enableCostDataInAttribution enablecostdatainattribution) {
        int i = 2 % 2;
        float f = enablecostdatainattribution.serializer;
        getPreinstallFilePath getpreinstallfilepath = new getPreinstallFilePath(f, ((int) f) + "%", enablecostdatainattribution.IconCompatParcelizer);
        int i2 = RatingCompat + 7;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getpreinstallfilepath;
        }
        throw null;
    }

    public void write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:unbindAll");
        try {
            PrematureEndOfStreamVideoQuirk.write();
            write(this, 0);
            ((ObjectListtoString1) this.read).serializer((HashSet) this.MediaDescriptionCompat);
            Trace.endSection();
            int i4 = RatingCompat + 125;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v7 io.reactivex.disposables.Disposable) = (r1v6 io.reactivex.disposables.Disposable), (r1v15 io.reactivex.disposables.Disposable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.FrameworkServiceWorkerClient
    public void PlaybackStateCompatCustomAction() {
        Disposable disposable;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 49;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("LocationChangeListener clear called", new Object[1]);
            disposable = (Disposable) this.serializer;
            if (disposable != null) {
                disposable.dispose();
            }
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("LocationChangeListener clear called", new Object[0]);
            disposable = (Disposable) this.serializer;
            if (disposable != null) {
                disposable.dispose();
            }
        }
        Disposable disposable2 = ((getContextClick5zf0vsI) this.write).RemoteActionCompatParcelizer;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) this.MediaSessionCompatQueueItem;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i3 = MediaMetadataCompat + 77;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.MediaSessionCompatQueueItem = null;
        YieldKt.write((ContextScope) this.MediaDescriptionCompat, (CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public Object getGreetingState(ContinuationImpl continuationImpl) {
        getEnvironment getenvironment;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof getEnvironment) {
            int i2 = RatingCompat + 15;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((getEnvironment) continuationImpl).read;
                throw null;
            }
            getenvironment = (getEnvironment) continuationImpl;
            int i4 = getenvironment.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getenvironment.read = i4 - Integer.MIN_VALUE;
            } else {
                getenvironment = new getEnvironment(this, continuationImpl);
            }
        } else {
            getenvironment = new getEnvironment(this, continuationImpl);
        }
        Object objInvoke = getenvironment.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getenvironment.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetRiderNameUseCaseImpl getRiderNameUseCaseImpl = (GetRiderNameUseCaseImpl) this.RemoteActionCompatParcelizer;
            getenvironment.read = 1;
            objInvoke = getRiderNameUseCaseImpl.invoke(getenvironment);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = MediaMetadataCompat + 121;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i7 = MediaMetadataCompat + 125;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                int i8 = 80 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
        }
        String str = (String) objInvoke;
        return str == null ? getExternalDeviceId.IconCompatParcelizer : new getEventDeduplicationIdsMaxSize(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[EXC_TOP_SPLITTER, PHI: r2 r4 r5
  0x003d: PHI (r2v9 long) = (r2v8 long), (r2v18 long) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r4v1 io.reactivex.Scheduler) = (r4v0 io.reactivex.Scheduler), (r4v12 io.reactivex.Scheduler) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r5v1 androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) = 
  (r5v0 androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0)
  (r5v4 androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0)
 binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public Disposable startTimer() {
        long jWrite;
        Scheduler scheduler;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            jWrite = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.RemoteActionCompatParcelizer)).IconCompatParcelizer.write("location_update_interval");
            scheduler = Schedulers.RemoteActionCompatParcelizer;
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.write;
            int i3 = 87 / 0;
            if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
                try {
                    scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
                } catch (Throwable th) {
                    throw ExceptionHelper.write(th);
                }
            }
        } else {
            jWrite = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.RemoteActionCompatParcelizer)).IconCompatParcelizer.write("location_update_interval");
            scheduler = Schedulers.RemoteActionCompatParcelizer;
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.write;
            if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
                scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
            }
        }
        Scheduler scheduler2 = scheduler;
        int i4 = RatingCompat + 55;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        scheduler2.getClass();
        ObjectHelper.write(TimeUnit.MILLISECONDS, "unit is null");
        return SubscribersKt.write(new ObservableInterval(Math.max(0L, 0L), Math.max(0L, jWrite), scheduler2), new NetworkFetcher.AnonymousClass2(1, Timber.RemoteActionCompatParcelizer, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 6), new f2$$ExternalSyntheticLambda4(19, this));
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) obj;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
        livenessDetectionActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
        int iIconCompatParcelizer = n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
        livenessDetectionActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
        livenessDetectionActivity.ParcelableVolumeInfo = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.IconCompatParcelizer);
        livenessDetectionActivity.MediaSessionCompatResultReceiverWrapper = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getDataStoreFileName) this.read);
        livenessDetectionActivity.MediaSessionCompatToken = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((setRefreshing) this.serializer);
        livenessDetectionActivity.PlaybackStateCompat = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((acquire) this.MediaBrowserCompatMediaItem);
        livenessDetectionActivity.MediaBrowserCompatMediaItem = (PassthroughConnection) ((getDoubleOrNull) this.MediaSessionCompatQueueItem).write;
        livenessDetectionActivity.MediaDescriptionCompat = (DBUtil__DBUtil_androidKtperformInTransactionSuspending2) ((getDoubleOrNull) this.MediaDescriptionCompat).write;
        livenessDetectionActivity.PlaybackStateCompatCustomAction = (SemanticsOwner) getstyleable_vector_drawable_group_rotation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write();
        livenessDetectionActivity.MediaSessionCompatQueueItem = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
        livenessDetectionActivity.RatingCompat = (requestGeofences) getstyleable_vector_drawable_group_rotation.ImageCaptureException.write();
        int i2 = MediaMetadataCompat + 81;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    public void read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 7;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = false;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("LocationUpdateTaskExecutor stop", new Object[0]);
        requestInputModeiuPiT84 requestinputmodeiupit84 = (requestInputModeiuPiT84) this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (requestinputmodeiupit84.read != null) {
            requestinputmodeiupit84.IconCompatParcelizer.getApplicationContext().unregisterReceiver(requestinputmodeiupit84.read);
            requestinputmodeiupit84.read = null;
            int i4 = MediaMetadataCompat + 117;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        ((BulletSpan_androidKt) this.serializer).getClass();
        ((getPresentationContext) this.MediaSessionCompatQueueItem).serializer((accessgetGreencp) this.write);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.IconCompatParcelizer);
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.ACTIVITY_MONITORING_ENABLED)) {
            if (Build.VERSION.SDK_INT >= 29) {
                int i6 = RatingCompat + 97;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    FocusListener.write((Application) this.RemoteActionCompatParcelizer, "android.permission.ACTIVITY_RECOGNITION");
                    throw null;
                }
                if (FocusListener.write((Application) this.RemoteActionCompatParcelizer, "android.permission.ACTIVITY_RECOGNITION") == 0) {
                    getToggleOff5zf0vsI gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) this.MediaBrowserCompatMediaItem;
                    gettoggleoff5zf0vsi.read();
                    gettoggleoff5zf0vsi.RemoteActionCompatParcelizer();
                }
            } else {
                getToggleOff5zf0vsI gettoggleoff5zf0vsi2 = (getToggleOff5zf0vsI) this.MediaBrowserCompatMediaItem;
                gettoggleoff5zf0vsi2.read();
                gettoggleoff5zf0vsi2.RemoteActionCompatParcelizer();
            }
        }
        IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) this.MediaDescriptionCompat;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = incogniaManagerImpl.IconCompatParcelizer;
        ((inCompatibilityMode) incogniaManagerImpl.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new TextFieldSelectionManager$copy$1(incogniaManagerImpl, z, shortNewsContentCardView, 6), 2);
    }

    public k$c(transferSessionPackageI transfersessionpackagei, IOParser$Decoder iOParser$Decoder, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, FormBody.Builder builder, subscribeToNoMatchingTriggerForEvent subscribetonomatchingtriggerforevent, k$c k_c, O$b o$b, subscribeToSdkAuthenticationFailures subscribetosdkauthenticationfailures) {
        transfersessionpackagei.getClass();
        subscribetonomatchingtriggerforevent.getClass();
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.write = iOParser$Decoder;
        this.IconCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.read = builder;
        this.serializer = subscribetonomatchingtriggerforevent;
        this.MediaBrowserCompatMediaItem = k_c;
        this.MediaSessionCompatQueueItem = o$b;
        this.MediaDescriptionCompat = subscribetosdkauthenticationfailures;
    }

    public /* synthetic */ k$c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.read = obj4;
        this.serializer = obj5;
        this.MediaBrowserCompatMediaItem = obj6;
        this.MediaSessionCompatQueueItem = obj7;
        this.MediaDescriptionCompat = obj8;
    }

    public boolean serializer() {
        Activity activity;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 117;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetGreencp accessgetgreencp = (accessgetGreencp) this.write;
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.IconCompatParcelizer;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("LocationUpdateTaskExecutor start", new Object[0]);
        Application application = (Application) this.RemoteActionCompatParcelizer;
        boolean z = true;
        boolean z2 = FocusListener.write(application, "android.permission.ACCESS_FINE_LOCATION") == 0 && FocusListener.write(application, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (z2) {
            accessgetgreencp.PlaybackStateCompatCustomAction();
            accessgetgreencp.write = (FrameworkServiceWorkerClient) ((getDataStoreFileName) accessgetgreencp.IconCompatParcelizer).write();
            getPresentationContext getpresentationcontext = (getPresentationContext) this.MediaSessionCompatQueueItem;
            CourierApplication courierApplication = CourierApplication.write;
            if (courierApplication == null) {
                removeNodeAtDepth.serializer("application");
                throw null;
            }
            WeakReference weakReference = courierApplication.defaultViewModelProviderFactory_delegatelambda0;
            if (weakReference != null) {
                int i5 = MediaMetadataCompat + 79;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    throw null;
                }
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            getpresentationcontext.RemoteActionCompatParcelizer(activity, ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("location_update_interval"), endRearDisplaySession.PRIORITY_HIGH_ACCURACY, accessgetgreencp);
        } else {
            forest.write(new FoodoraPermissionDeniedException(String.format(Locale.getDefault(), "FoodoraPermission %s (%d) denied", "Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION", 3301)));
        }
        if (!z2) {
            forest.IconCompatParcelizer("LocationUpdateTaskExecutor start updates failed: Location permission is not granted", new Object[0]);
            return false;
        }
        requestInputModeiuPiT84 requestinputmodeiupit84 = (requestInputModeiuPiT84) this.read;
        if (requestinputmodeiupit84.read == null) {
            requestinputmodeiupit84.read = new getButtonXEK5gGoQ(i, requestinputmodeiupit84);
        }
        ((TraceTimeMeasurementWithPerformanceKit) requestinputmodeiupit84.serializer).read("broadcast_register_battery", new BrazeUser$$ExternalSyntheticLambda28(11, requestinputmodeiupit84));
        ((BulletSpan_androidKt) this.serializer).getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.ACTIVITY_MONITORING_ENABLED) && (Build.VERSION.SDK_INT < 29 || FocusListener.write(application, "android.permission.ACTIVITY_RECOGNITION") == 0)) {
            getToggleOff5zf0vsI gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) this.MediaBrowserCompatMediaItem;
            gettoggleoff5zf0vsi.IconCompatParcelizer();
            gettoggleoff5zf0vsi.write();
        }
        IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) this.MediaDescriptionCompat;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = incogniaManagerImpl.IconCompatParcelizer;
        ((inCompatibilityMode) incogniaManagerImpl.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new TextFieldSelectionManager$copy$1(incogniaManagerImpl, z, shortNewsContentCardView, 6), 2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0207  */
    /* JADX WARN: Code duplicated, block: B:76:0x0228 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0229  */
    /* JADX WARN: Code duplicated, block: B:79:0x022d  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Code duplicated, block: B:81:0x024f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0266  */
    /* JADX WARN: Code duplicated, block: B:85:0x026a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0270  */
    /* JADX WARN: Code duplicated, block: B:89:0x0287  */
    public Object invoke$implementation(ContinuationImpl continuationImpl) throws Throwable {
        getCostDataInAttributionEnabled getcostdatainattributionenabled;
        setAdRevenuePlacement setadrevenueplacement;
        getOnRemoteTriggerListener getonremotetriggerlistener;
        int i;
        int i2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        int i3;
        Object greetingState;
        setAdRevenuePlacement setadrevenueplacement2;
        getDefaultTracker getdefaulttracker;
        Object objShouldDisplayWelcomeMessage;
        getDefaultTracker getdefaulttracker2;
        int i4;
        setAdRevenuePlacement setadrevenueplacement3;
        boolean z;
        boolean z2;
        int i5 = 2 % 2;
        BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = (BrazeExternalSyntheticLambda5) this.read;
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.MediaSessionCompatQueueItem;
        if (continuationImpl instanceof getCostDataInAttributionEnabled) {
            getcostdatainattributionenabled = (getCostDataInAttributionEnabled) continuationImpl;
            int i6 = getcostdatainattributionenabled.write;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = MediaMetadataCompat + 95;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getcostdatainattributionenabled.write = i6 - Integer.MIN_VALUE;
            } else {
                getcostdatainattributionenabled = new getCostDataInAttributionEnabled(this, continuationImpl);
            }
        } else {
            getcostdatainattributionenabled = new getCostDataInAttributionEnabled(this, continuationImpl);
        }
        Object objInvoke = getcostdatainattributionenabled.MediaMetadataCompat;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = getcostdatainattributionenabled.write;
        String str = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase = (IsSafetyTrackingAllowedUseCase) this.MediaBrowserCompatMediaItem;
            getcostdatainattributionenabled.write = 1;
            objInvoke = isSafetyTrackingAllowedUseCase.invoke(getcostdatainattributionenabled);
            if (objInvoke != obj) {
            }
            return obj;
        }
        if (i9 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        } else {
            if (i9 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                setadrevenueplacement = (setAdRevenuePlacement) objInvoke;
                if (setadrevenueplacement instanceof setAdRevenueUnit) {
                    if (!(setadrevenueplacement instanceof setRevenue)) {
                        return ((setRevenue) setadrevenueplacement).RemoteActionCompatParcelizer ? new getOnRemoteTriggerListener(R.string.rider_safety_report_error_no_permission_title, R.string.rider_safety_report_error_no_permission_description, R.string.rider_safety_error_button_grant_permission, R.drawable.ic_rider_safety_no_permissions, enablePlayStoreKidsCompliance.GRANT_PERMISSIONS, enableFirstSessionDelay.NO_PERMISSIONS) : new getOnRemoteTriggerListener(R.string.rider_safety_report_error_non_retryable_title, R.string.rider_safety_report_error_non_retryable_description, R.string.rider_safety_error_button_go_back, R.drawable.ic_rider_safety_non_retryable_error, enablePlayStoreKidsCompliance.GO_BACK, enableFirstSessionDelay.NON_RETRYABLE);
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setadrevenueplacement, checkAppToken.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setadrevenueplacement, checkAppToken.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                            return new getOnRemoteTriggerListener(R.string.rider_safety_report_error_retryable_title, R.string.rider_safety_report_error_retryable_description, R.string.rider_safety_error_button_retry, R.drawable.ic_rider_safety_retryable_error, enablePlayStoreKidsCompliance.RETRY, enableFirstSessionDelay.RETRYABLE);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    getonremotetriggerlistener = new getOnRemoteTriggerListener(R.string.rider_safety_report_error_not_available_title, R.string.rider_safety_report_error_not_available_description, R.string.rider_safety_error_button_go_back, R.drawable.ic_rider_safety_no_permissions, enablePlayStoreKidsCompliance.GO_BACK, enableFirstSessionDelay.NOT_ALLOWED);
                    i = MediaMetadataCompat + 53;
                    RatingCompat = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return getonremotetriggerlistener;
                    }
                    str.hashCode();
                    throw null;
                }
                i2 = RatingCompat + 103;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                    firebaseRemoteConfigImpl2.getClass();
                    firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED);
                    throw null;
                }
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED) || ((switchToOfflineMode) this.MediaDescriptionCompat).RemoteActionCompatParcelizer) {
                    i3 = 0;
                } else {
                    int i10 = MediaMetadataCompat + 15;
                    RatingCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i3 = 1;
                }
                getcostdatainattributionenabled.serializer = setadrevenueplacement;
                getcostdatainattributionenabled.read = i3;
                getcostdatainattributionenabled.write = 3;
                greetingState = getGreetingState(getcostdatainattributionenabled);
                if (greetingState != obj) {
                    setadrevenueplacement2 = setadrevenueplacement;
                    objInvoke = greetingState;
                    getdefaulttracker = (getDefaultTracker) objInvoke;
                    AdjustConfig adjustConfig = (AdjustConfig) this.write;
                    getcostdatainattributionenabled.serializer = setadrevenueplacement2;
                    getcostdatainattributionenabled.RemoteActionCompatParcelizer = getdefaulttracker;
                    getcostdatainattributionenabled.read = i3;
                    getcostdatainattributionenabled.IconCompatParcelizer = i3;
                    getcostdatainattributionenabled.write = 4;
                    objShouldDisplayWelcomeMessage = adjustConfig.write.shouldDisplayWelcomeMessage(getcostdatainattributionenabled);
                    if (objShouldDisplayWelcomeMessage != obj) {
                        getdefaulttracker2 = getdefaulttracker;
                        i4 = i3;
                        objInvoke = objShouldDisplayWelcomeMessage;
                        setadrevenueplacement3 = setadrevenueplacement2;
                    }
                }
                return obj;
            }
            int i12 = RatingCompat;
            int i13 = i12 + 63;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (i9 == 3) {
                i3 = getcostdatainattributionenabled.read;
                setadrevenueplacement2 = getcostdatainattributionenabled.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                getdefaulttracker = (getDefaultTracker) objInvoke;
                AdjustConfig adjustConfig2 = (AdjustConfig) this.write;
                getcostdatainattributionenabled.serializer = setadrevenueplacement2;
                getcostdatainattributionenabled.RemoteActionCompatParcelizer = getdefaulttracker;
                getcostdatainattributionenabled.read = i3;
                getcostdatainattributionenabled.IconCompatParcelizer = i3;
                getcostdatainattributionenabled.write = 4;
                objShouldDisplayWelcomeMessage = adjustConfig2.write.shouldDisplayWelcomeMessage(getcostdatainattributionenabled);
                if (objShouldDisplayWelcomeMessage != obj) {
                    getdefaulttracker2 = getdefaulttracker;
                    i4 = i3;
                    objInvoke = objShouldDisplayWelcomeMessage;
                    setadrevenueplacement3 = setadrevenueplacement2;
                }
                return obj;
            }
            if (i9 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = i12 + 95;
            MediaMetadataCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i3 = getcostdatainattributionenabled.IconCompatParcelizer;
            i4 = getcostdatainattributionenabled.read;
            getDefaultTracker getdefaulttracker3 = getcostdatainattributionenabled.RemoteActionCompatParcelizer;
            setadrevenueplacement3 = getcostdatainattributionenabled.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            getdefaulttracker2 = getdefaulttracker3;
        }
        if (((Boolean) objInvoke).booleanValue() || i4 != 0) {
            z = false;
        } else {
            z = true;
        }
        isFbIdReadingEnabled isfbidreadingenabled = new isFbIdReadingEnabled(z, ((Paint) ((GetAppStateImpl) this.serializer).serializer).hasGlyph("👋") ? "👋" : null);
        setAdRevenueUnit setadrevenueunit = (setAdRevenueUnit) setadrevenueplacement3;
        disableFbIdReading disablefbidreading = setadrevenueunit.read;
        disableFbIdReading disablefbidreading2 = setadrevenueunit.read;
        String str2 = disablefbidreading.IconCompatParcelizer;
        brazeExternalSyntheticLambda5.getClass();
        str2.getClass();
        String str3 = DateTimeFormatter.ofPattern("MMM d", Locale.getDefault()).format(OffsetDateTime.parse(str2).atZoneSameInstant(ZoneId.systemDefault()));
        str3.getClass();
        String str4 = disablefbidreading2.read;
        getLogger getlogger = new getLogger(str3, str4 != null ? DateTimeFormatter.ofPattern("MMM d, HH:mm", Locale.getDefault()).format(OffsetDateTime.parse(str4).atZoneSameInstant(ZoneId.systemDefault())) : null);
        enablePreinstallTracking enablepreinstalltracking = disablefbidreading2.write;
        getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener = new getOnSessionTrackingSucceededListener(IconCompatParcelizer(enablepreinstalltracking.read), IconCompatParcelizer(enablepreinstalltracking.serializer), IconCompatParcelizer(enablepreinstalltracking.write), IconCompatParcelizer(enablepreinstalltracking.IconCompatParcelizer));
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl3.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl3.IconCompatParcelizer(updateAdidI.HIDE_RIDER_SAFETY_BATCH_CALCULATION_MESSAGE);
        List list = disablefbidreading2.serializer;
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new getOnEventTrackingFailedListener(getdefaulttracker2, z2, isfbidreadingenabled, getlogger, getonsessiontrackingsucceededlistener, !zIconCompatParcelizer, list);
        if (!((Boolean) objInvoke).booleanValue()) {
            return new getOnRemoteTriggerListener(R.string.rider_safety_report_error_not_available_title, R.string.rider_safety_report_error_not_available_description, R.string.rider_safety_error_button_go_back, R.drawable.ic_rider_safety_no_permissions, enablePlayStoreKidsCompliance.GO_BACK, enableFirstSessionDelay.NOT_ALLOWED);
        }
        C$b c$b = (C$b) this.IconCompatParcelizer;
        getcostdatainattributionenabled.write = 2;
        objInvoke = c$b.invoke$implementation(getcostdatainattributionenabled);
        if (objInvoke != obj) {
            setadrevenueplacement = (setAdRevenuePlacement) objInvoke;
            if (setadrevenueplacement instanceof setAdRevenueUnit) {
                if (!(setadrevenueplacement instanceof setRevenue)) {
                    if (((setRevenue) setadrevenueplacement).RemoteActionCompatParcelizer) {
                    }
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setadrevenueplacement, checkAppToken.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setadrevenueplacement, checkAppToken.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return new getOnRemoteTriggerListener(R.string.rider_safety_report_error_retryable_title, R.string.rider_safety_report_error_retryable_description, R.string.rider_safety_error_button_retry, R.drawable.ic_rider_safety_retryable_error, enablePlayStoreKidsCompliance.RETRY, enableFirstSessionDelay.RETRYABLE);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getonremotetriggerlistener = new getOnRemoteTriggerListener(R.string.rider_safety_report_error_not_available_title, R.string.rider_safety_report_error_not_available_description, R.string.rider_safety_error_button_go_back, R.drawable.ic_rider_safety_no_permissions, enablePlayStoreKidsCompliance.GO_BACK, enableFirstSessionDelay.NOT_ALLOWED);
                i = MediaMetadataCompat + 53;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return getonremotetriggerlistener;
                }
                str.hashCode();
                throw null;
            }
            i2 = RatingCompat + 103;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl4 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                firebaseRemoteConfigImpl4.getClass();
                firebaseRemoteConfigImpl4.IconCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED);
                throw null;
            }
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED)) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            getcostdatainattributionenabled.serializer = setadrevenueplacement;
            getcostdatainattributionenabled.read = i3;
            getcostdatainattributionenabled.write = 3;
            greetingState = getGreetingState(getcostdatainattributionenabled);
            if (greetingState != obj) {
                setadrevenueplacement2 = setadrevenueplacement;
                objInvoke = greetingState;
                getdefaulttracker = (getDefaultTracker) objInvoke;
                AdjustConfig adjustConfig3 = (AdjustConfig) this.write;
                getcostdatainattributionenabled.serializer = setadrevenueplacement2;
                getcostdatainattributionenabled.RemoteActionCompatParcelizer = getdefaulttracker;
                getcostdatainattributionenabled.read = i3;
                getcostdatainattributionenabled.IconCompatParcelizer = i3;
                getcostdatainattributionenabled.write = 4;
                objShouldDisplayWelcomeMessage = adjustConfig3.write.shouldDisplayWelcomeMessage(getcostdatainattributionenabled);
                if (objShouldDisplayWelcomeMessage != obj) {
                    getdefaulttracker2 = getdefaulttracker;
                    i4 = i3;
                    objInvoke = objShouldDisplayWelcomeMessage;
                    setadrevenueplacement3 = setadrevenueplacement2;
                    if (((Boolean) objInvoke).booleanValue()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    isFbIdReadingEnabled isfbidreadingenabled2 = new isFbIdReadingEnabled(z, ((Paint) ((GetAppStateImpl) this.serializer).serializer).hasGlyph("👋") ? "👋" : null);
                    setAdRevenueUnit setadrevenueunit2 = (setAdRevenueUnit) setadrevenueplacement3;
                    disableFbIdReading disablefbidreading3 = setadrevenueunit2.read;
                    disableFbIdReading disablefbidreading4 = setadrevenueunit2.read;
                    String str5 = disablefbidreading3.IconCompatParcelizer;
                    brazeExternalSyntheticLambda5.getClass();
                    str5.getClass();
                    String str6 = DateTimeFormatter.ofPattern("MMM d", Locale.getDefault()).format(OffsetDateTime.parse(str5).atZoneSameInstant(ZoneId.systemDefault()));
                    str6.getClass();
                    String str7 = disablefbidreading4.read;
                    getLogger getlogger2 = new getLogger(str6, str7 != null ? DateTimeFormatter.ofPattern("MMM d, HH:mm", Locale.getDefault()).format(OffsetDateTime.parse(str7).atZoneSameInstant(ZoneId.systemDefault())) : null);
                    enablePreinstallTracking enablepreinstalltracking2 = disablefbidreading4.write;
                    getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener2 = new getOnSessionTrackingSucceededListener(IconCompatParcelizer(enablepreinstalltracking2.read), IconCompatParcelizer(enablepreinstalltracking2.serializer), IconCompatParcelizer(enablepreinstalltracking2.write), IconCompatParcelizer(enablepreinstalltracking2.IconCompatParcelizer));
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl5 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                    firebaseRemoteConfigImpl5.getClass();
                    boolean zIconCompatParcelizer2 = firebaseRemoteConfigImpl5.IconCompatParcelizer(updateAdidI.HIDE_RIDER_SAFETY_BATCH_CALCULATION_MESSAGE);
                    List list2 = disablefbidreading4.serializer;
                    if (i3 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new getOnEventTrackingFailedListener(getdefaulttracker2, z2, isfbidreadingenabled2, getlogger2, getonsessiontrackingsucceededlistener2, !zIconCompatParcelizer2, list2);
                }
            }
        }
        return obj;
    }

    public k$c() {
    }
}
