package androidx.camera.view;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import coil3.ImageLoader$Builder;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.braze.events.IValueCallback;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.FirestoreCallCredentials;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.huawei.location.logic.zp;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.QueriedFeature;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.SnapshotCompleteCallback;
import com.mapbox.maps.SnapshotOverlayCallback;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.NativeSetRouteValue;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.sentiance.core.model.events.I$b;
import com.sentiance.sdk.util.BoundingBox;
import io.grpc.Status;
import io.grpc.internal.MetadataApplierImpl;
import io.sentry.SentryClient;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.android.core.internal.gestures.serializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.io.TextStreamsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.AbstractClickableNodehandlePressInteractionStart11;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsAbstractTextSegmentIterator;
import o.AndroidClipboardManager_androidKt;
import o.AndroidEdgeEffectOverscrollEffect;
import o.AnimatablesnapTo2;
import o.BackgroundKt;
import o.BrazeActionUtils;
import o.Camera2CameraImpl;
import o.CameraControlInternalCameraControlException;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.ClickableElement;
import o.ClipboardExtensions_androidKt;
import o.Crossfade;
import o.CrossfadeKtCrossfade51alpha2;
import o.DrawModifierNodeKt;
import o.DustDataStoreProviderCompanion;
import o.EncoderImplMediaCodecCallback;
import o.ImageCapture1;
import o.InitializationException;
import o.JsonUtilsExternalSyntheticLambda1;
import o.JsonUtilsa;
import o.NodeChainKtfillVector1;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.OnGloballyPositionedModifierDefaultImpls;
import o.OnePixelShiftQuirk;
import o.OuterPlacementScope;
import o.ParentDataModifierDefaultImpls;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.Preview3AThreadCrashQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.SessionConfigExternalSyntheticLambda1;
import o.SpringSimulation;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.SuspendAnimationKt;
import o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import o.access701;
import o.accessgetBrowsercp;
import o.accessgetEightcp;
import o.accessgetFunctioncp;
import o.accessgetGcp;
import o.accessgetGravecp;
import o.accessgetHcp;
import o.accessgetHeadsetHookcp;
import o.accessgetHelpcp;
import o.accessgetHenkancp;
import o.accessgetIcp;
import o.accessgetLastChannelcp;
import o.accessgetMediaEjectcp;
import o.accessgetMediaFastForwardcp;
import o.accesssetDrawBlockCanvasp;
import o.accessupdateUnsafe;
import o.animateOneFrame;
import o.applyToFlingBMRW4eQ;
import o.asList;
import o.assertConsistent;
import o.attachedToWindow;
import o.calculateLocalPositionMKHz9U;
import o.createLayerdefault;
import o.eh;
import o.ehExternalSyntheticLambda0;
import o.f8;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getCieXyz;
import o.getClipMetadata;
import o.getCollapseContentDescription;
import o.getFocusOwner;
import o.getMinimumTouchTargetSizeNHjbRc;
import o.getOwner;
import o.getPointerInputSource;
import o.getRectManager;
import o.getSemanticsSource;
import o.getThumbPosition;
import o.getThumbScrollRange;
import o.getTrackDrawable;
import o.headH91voCI;
import o.hf;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isInline;
import o.isTreeConsistent;
import o.isUnspecifieduvyYCjk;
import o.logTree;
import o.mapToBase;
import o.mergeJsonObjectslambda10;
import o.migrateBlocklistedListslambda0;
import o.nativeGetYUVImageVUOff;
import o.nodeToString;
import o.obtainShadowContext;
import o.onContentCardDismissed;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onEndApplyChanges;
import o.onFrameanimation_core;
import o.onRequestMeasure;
import o.onRequestRelayoutdefault;
import o.onSemanticsChange;
import o.pullTopk4lQ0M;
import o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0;
import o.r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.removeNodeAtDepth;
import o.removeStaleIds;
import o.requestFocusCurrent;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.setBaselineAligned;
import o.setDividerDrawable;
import o.setHorizontalGravity;
import o.setInflatedId;
import o.setLastShapeui;
import o.setNode;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import o.setResourcePackageName;
import o.setShowLayoutBounds;
import o.setShowText;
import o.setSwitchPadding;
import o.setSwitchTypeface;
import o.setTextOff;
import o.setThumbDrawable;
import o.snapTo;
import o.updateLayerParameters;
import o.visitNodes;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PreviewView$1$$ExternalSyntheticLambda2 implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, obtainShadowContext, SpringSimulation, Camera2CameraImpl, IWebViewClientStateListener, accessgetMediaFastForwardcp, accessgetMediaEjectcp, OuterPlacementScope, onRequestMeasure, PinnableContainer, OnSuccessListener, AccessibilityIteratorsAbstractTextSegmentIterator, PausedPrecompositionImpl, SnapshotCompleteCallback, Expected.Transformer, isUnspecifieduvyYCjk, IValueCallback, QueryRenderedFeaturesCallback, migrateBlocklistedListslambda0, r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda2(PendingValue pendingValue, ImageCapture1 imageCapture1, SurfaceRequest surfaceRequest) {
        this.RemoteActionCompatParcelizer = 5;
        this.serializer = pendingValue;
        this.IconCompatParcelizer = imageCapture1;
        this.read = surfaceRequest;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014c A[Catch: all -> 0x0296, TryCatch #1 {all -> 0x0296, blocks: (B:4:0x0015, B:12:0x0027, B:13:0x0041, B:15:0x0043, B:16:0x0049, B:18:0x004f, B:19:0x0065, B:20:0x00c8, B:22:0x00ce, B:23:0x00e6, B:25:0x00f8, B:27:0x00fc, B:28:0x0108, B:29:0x0122, B:31:0x0128, B:33:0x0136, B:35:0x013e, B:39:0x014c, B:41:0x015e, B:43:0x0174, B:44:0x017f, B:45:0x018f, B:47:0x0195, B:50:0x01ae, B:51:0x01c1, B:53:0x01db, B:55:0x01df, B:57:0x01e5, B:59:0x01fb, B:58:0x01f0, B:60:0x0206, B:61:0x0227, B:63:0x022d, B:64:0x023d, B:66:0x025f, B:67:0x0266, B:68:0x026e, B:71:0x0271, B:72:0x0277, B:74:0x0279, B:75:0x0294), top: B:82:0x0015, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015e A[Catch: all -> 0x0296, TryCatch #1 {all -> 0x0296, blocks: (B:4:0x0015, B:12:0x0027, B:13:0x0041, B:15:0x0043, B:16:0x0049, B:18:0x004f, B:19:0x0065, B:20:0x00c8, B:22:0x00ce, B:23:0x00e6, B:25:0x00f8, B:27:0x00fc, B:28:0x0108, B:29:0x0122, B:31:0x0128, B:33:0x0136, B:35:0x013e, B:39:0x014c, B:41:0x015e, B:43:0x0174, B:44:0x017f, B:45:0x018f, B:47:0x0195, B:50:0x01ae, B:51:0x01c1, B:53:0x01db, B:55:0x01df, B:57:0x01e5, B:59:0x01fb, B:58:0x01f0, B:60:0x0206, B:61:0x0227, B:63:0x022d, B:64:0x023d, B:66:0x025f, B:67:0x0266, B:68:0x026e, B:71:0x0271, B:72:0x0277, B:74:0x0279, B:75:0x0294), top: B:82:0x0015, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x0174 A[SYNTHETIC] */
    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        InputConfiguration inputConfiguration;
        int i;
        setSwitchTypeface setswitchtypefaceIconCompatParcelizer;
        String str;
        setBaselineAligned setbaselinealigned = (setBaselineAligned) this.serializer;
        mapToBase maptobase = (mapToBase) this.read;
        CameraDevice cameraDevice = (CameraDevice) this.IconCompatParcelizer;
        List list = (List) obj;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            try {
                int iOrdinal = setbaselinealigned.MediaSessionCompatToken.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return new EncoderImplMediaCodecCallback(0, new IllegalStateException("openCaptureSession() should not be possible in state: " + setbaselinealigned.MediaSessionCompatToken));
                }
                if (iOrdinal != 3) {
                    return new EncoderImplMediaCodecCallback(0, new CancellationException("openCaptureSession() not execute in state: " + setbaselinealigned.MediaSessionCompatToken));
                }
                setbaselinealigned.RemoteActionCompatParcelizer.clear();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    setbaselinealigned.RemoteActionCompatParcelizer.put((PreviewExternalSyntheticLambda0) setbaselinealigned.read.get(i2), (Surface) list.get(i2));
                }
                setbaselinealigned.RemoteActionCompatParcelizer(setHorizontalGravity.OPENING);
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                setDividerDrawable setdividerdrawable = new setDividerDrawable(Arrays.asList(setbaselinealigned.IconCompatParcelizer, new setDividerDrawable(maptobase.MediaMetadataCompat, 1)), 2);
                nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobase.MediaDescriptionCompat;
                access701 access701Var = new access701(23, nativegetyuvimagevuoff.MediaDescriptionCompat);
                HashSet hashSet = new HashSet();
                CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
                ArrayList arrayList = new ArrayList();
                CameraControlInternalCameraControlException.write();
                hashSet.addAll(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem);
                CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
                int i3 = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
                arrayList.addAll(nativegetyuvimagevuoff.IconCompatParcelizer);
                boolean z = nativegetyuvimagevuoff.ParcelableVolumeInfo;
                OnePixelShiftQuirk onePixelShiftQuirk = nativegetyuvimagevuoff.RatingCompat;
                ArrayMap arrayMap = new ArrayMap();
                for (Iterator it = onePixelShiftQuirk.IconCompatParcelizer.keySet().iterator(); it.hasNext(); it = it) {
                    String str2 = (String) it.next();
                    arrayMap.put(str2, onePixelShiftQuirk.IconCompatParcelizer.get(str2));
                }
                CameraControlInternalCameraControlException cameraControlInternalCameraControlException = new CameraControlInternalCameraControlException(arrayMap);
                boolean z2 = nativegetyuvimagevuoff.MediaMetadataCompat;
                HashMap map = new HashMap();
                if (setbaselinealigned.serializer && Build.VERSION.SDK_INT >= 35) {
                    map = setBaselineAligned.serializer(setBaselineAligned.IconCompatParcelizer(maptobase.IconCompatParcelizer), setbaselinealigned.RemoteActionCompatParcelizer);
                }
                ArrayList<setSwitchTypeface> arrayList2 = new ArrayList();
                String str3 = (String) ((InitializationException) access701Var.MediaSessionCompatQueueItem).read(access701.RemoteActionCompatParcelizer, null);
                Iterator it2 = maptobase.IconCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    Preview3AThreadCrashQuirk preview3AThreadCrashQuirk = (Preview3AThreadCrashQuirk) it2.next();
                    Iterator it3 = it2;
                    if (setbaselinealigned.serializer) {
                        i = i3;
                        setswitchtypefaceIconCompatParcelizer = Build.VERSION.SDK_INT >= 35 ? (setSwitchTypeface) map.get(preview3AThreadCrashQuirk) : null;
                        if (setswitchtypefaceIconCompatParcelizer == null) {
                            setswitchtypefaceIconCompatParcelizer = setbaselinealigned.IconCompatParcelizer(preview3AThreadCrashQuirk, setbaselinealigned.RemoteActionCompatParcelizer, str3);
                            str = str3;
                            if (setbaselinealigned.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.containsKey(preview3AThreadCrashQuirk.serializer)) {
                                setswitchtypefaceIconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(((Long) setbaselinealigned.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(preview3AThreadCrashQuirk.serializer)).longValue());
                            }
                        } else {
                            str = str3;
                        }
                        arrayList2.add(setswitchtypefaceIconCompatParcelizer);
                        it2 = it3;
                        i3 = i;
                        str3 = str;
                    } else {
                        i = i3;
                    }
                    if (setswitchtypefaceIconCompatParcelizer == null) {
                        setswitchtypefaceIconCompatParcelizer = setbaselinealigned.IconCompatParcelizer(preview3AThreadCrashQuirk, setbaselinealigned.RemoteActionCompatParcelizer, str3);
                        str = str3;
                        if (setbaselinealigned.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.containsKey(preview3AThreadCrashQuirk.serializer)) {
                            setswitchtypefaceIconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(((Long) setbaselinealigned.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(preview3AThreadCrashQuirk.serializer)).longValue());
                        }
                    } else {
                        str = str3;
                    }
                    arrayList2.add(setswitchtypefaceIconCompatParcelizer);
                    it2 = it3;
                    i3 = i;
                    str3 = str;
                }
                int i4 = i3;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (setSwitchTypeface setswitchtypeface : arrayList2) {
                    if (!arrayList3.contains(((OutputConfiguration) setswitchtypeface.IconCompatParcelizer.write()).getSurface())) {
                        arrayList3.add(((OutputConfiguration) setswitchtypeface.IconCompatParcelizer.write()).getSurface());
                        arrayList4.add(setswitchtypeface);
                    }
                }
                getThumbScrollRange getthumbscrollrange = setbaselinealigned.ParcelableVolumeInfo;
                int i5 = maptobase.RatingCompat;
                getthumbscrollrange.IconCompatParcelizer = setdividerdrawable;
                setThumbDrawable setthumbdrawable = new setThumbDrawable(i5, arrayList4, getthumbscrollrange.MediaBrowserCompatMediaItem, new getThumbPosition(2, getthumbscrollrange));
                if (maptobase.MediaDescriptionCompat.MediaSessionCompatQueueItem == 5 && (inputConfiguration = maptobase.write) != null) {
                    setthumbdrawable.read.RemoteActionCompatParcelizer.setInputConfiguration((Build.VERSION.SDK_INT >= 31 ? new setShowText(new setSwitchPadding(inputConfiguration)) : new setShowText(new setTextOff(inputConfiguration))).write.read);
                }
                try {
                    ArrayList arrayList5 = new ArrayList(hashSet);
                    CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
                    ArrayList arrayList6 = new ArrayList(arrayList);
                    OnePixelShiftQuirk onePixelShiftQuirk2 = OnePixelShiftQuirk.read;
                    ArrayMap arrayMap2 = new ArrayMap();
                    for (String str4 : cameraControlInternalCameraControlException.IconCompatParcelizer.keySet()) {
                        arrayMap2.put(str4, cameraControlInternalCameraControlException.IconCompatParcelizer.get(str4));
                    }
                    CaptureRequest captureRequestIconCompatParcelizer = removeStaleIds.IconCompatParcelizer(new nativeGetYUVImageVUOff(arrayList5, cameraRepositorySerializer, i4, z2, arrayList6, z, new OnePixelShiftQuirk(arrayMap2), null), cameraDevice, setbaselinealigned.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    if (captureRequestIconCompatParcelizer != null) {
                        setthumbdrawable.read.RemoteActionCompatParcelizer.setSessionParameters(captureRequestIconCompatParcelizer);
                    }
                    return setbaselinealigned.ParcelableVolumeInfo.read(cameraDevice, setthumbdrawable, setbaselinealigned.read);
                } catch (CameraAccessException e) {
                    return new EncoderImplMediaCodecCallback(0, e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        attachedToWindow attachedtowindow = (attachedToWindow) this.serializer;
        String str = (String) this.read;
        nodeToString nodetostring = (nodeToString) this.IconCompatParcelizer;
        if (attachedtowindow.read == attachedToWindow.RemoteActionCompatParcelizer) {
            return;
        }
        assertConsistent assertconsistentIconCompatParcelizer = ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).IconCompatParcelizer(str, nodetostring);
        attachedtowindow.read = assertconsistentIconCompatParcelizer;
        synchronized (attachedtowindow) {
            if (!attachedtowindow.serializer.isEmpty()) {
                assertconsistentIconCompatParcelizer.serializer(attachedtowindow.serializer);
                attachedtowindow.serializer = new HashSet();
            }
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        Surface surface;
        if (this.RemoteActionCompatParcelizer == 2) {
            onDrawBehind ondrawbehind = (onDrawBehind) this.serializer;
            PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = (PreviewFreezeAfterHighSpeedRecordingQuirk) this.read;
            ArrayList arrayList = (ArrayList) this.IconCompatParcelizer;
            ondrawwithcontent.RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(16, ondrawbehind), previewFreezeAfterHighSpeedRecordingQuirk);
            ondrawbehind.RemoteActionCompatParcelizer(new zza(ondrawbehind, 1, new SessionConfigExternalSyntheticLambda1(ondrawwithcontent, 0)), previewFreezeAfterHighSpeedRecordingQuirk);
            return "surfaceList[" + arrayList + "]";
        }
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.serializer;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.read;
        animateOneFrame animateoneframe = (animateOneFrame) this.IconCompatParcelizer;
        try {
            getTrackDrawable gettrackdrawable = (getTrackDrawable) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.IconCompatParcelizer;
            Executor executor = (Executor) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.read;
            int i = surfaceRequest.MediaSessionCompatToken;
            gettrackdrawable.getClass();
            EncoderImpl encoderImpl = new EncoderImpl(executor, animateoneframe, i);
            r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer = encoderImpl;
            SuspendAnimationKt suspendAnimationKt = encoderImpl.PlaybackStateCompatCustomAction;
            if (suspendAnimationKt instanceof onFrameanimation_core) {
                onFrameanimation_core onframeanimation_core = (onFrameanimation_core) suspendAnimationKt;
                Executor executor2 = (Executor) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer;
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(r8lambdauosl1ojcz1lncaiooglfrbn5pcg, ondrawwithcontent, surfaceRequest, 4);
                synchronized (onframeanimation_core.write) {
                    onframeanimation_core.IconCompatParcelizer = previewView$1$$ExternalSyntheticLambda2;
                    executor2.getClass();
                    onframeanimation_core.serializer = executor2;
                    surface = onframeanimation_core.read;
                }
                if (surface != null) {
                    try {
                        executor2.execute(new Crossfade(previewView$1$$ExternalSyntheticLambda2, 27, surface));
                    } catch (RejectedExecutionException e) {
                        setInflatedId.read(onframeanimation_core.MediaDescriptionCompat._init_lambda1, "Unable to post to the supplied executor.", e);
                    }
                }
            } else {
                ondrawwithcontent.serializer(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e2) {
            setInflatedId.read("VideoEncoderSession", "Unable to initialize video encoder.", e2);
            ondrawwithcontent.serializer(e2);
        }
        return "ConfigureVideoEncoderFuture " + r8lambdauosl1ojcz1lncaiooglfrbn5pcg;
    }

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
        this.IconCompatParcelizer = obj3;
    }

    @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
    public void onPageFinished() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 109;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            BrazeInAppMessageManager.displayInAppMessage$lambda$12((IInAppMessageViewWrapper) this.serializer, (BrazeInAppMessageManager) this.read, (Activity) this.IconCompatParcelizer);
        } else {
            BrazeInAppMessageManager.displayInAppMessage$lambda$12((IInAppMessageViewWrapper) this.serializer, (BrazeInAppMessageManager) this.read, (Activity) this.IconCompatParcelizer);
            int i3 = 69 / 0;
        }
    }

    public void IconCompatParcelizer() {
        int i = 2 % 2;
        setNode setnode = (setNode) this.serializer;
        accessupdateUnsafe accessupdateunsafe = (accessupdateUnsafe) this.read;
        accesssetDrawBlockCanvasp accesssetdrawblockcanvasp = (accesssetDrawBlockCanvasp) this.IconCompatParcelizer;
        setnode.read = true;
        accessupdateunsafe.serializer.RemoteActionCompatParcelizer(new NodeChainKtfillVector1(accessupdateunsafe, accesssetdrawblockcanvasp, 0));
        int i2 = write + 91;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4
    public void accept(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        serializer serializerVar = (serializer) this.serializer;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.read;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = (getChildStepIteratorandroid_sdk_ui_release) this.IconCompatParcelizer;
        if (getchildstepiteratorandroid_sdk_ui_release != null) {
            serializerVar.IconCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", getchildstepiteratorandroid_sdk_ui_release2.PlaybackStateCompat());
            return;
        }
        brazeActionUtils.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release2);
        int i4 = write + 79;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PendingValue pendingValue = (PendingValue) this.serializer;
        AbstractClickableNodehandlePressInteractionStart11 abstractClickableNodehandlePressInteractionStart11 = (AbstractClickableNodehandlePressInteractionStart11) this.read;
        ImageCapture1 imageCapture1 = (ImageCapture1) this.IconCompatParcelizer;
        AtomicReference atomicReference = ((AndroidEdgeEffectOverscrollEffect) pendingValue.serializer).RemoteActionCompatParcelizer;
        do {
            if (!(!atomicReference.compareAndSet(abstractClickableNodehandlePressInteractionStart11, null))) {
                int i4 = write + 45;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    abstractClickableNodehandlePressInteractionStart11.write(pullTopk4lQ0M.IDLE);
                    break;
                } else {
                    abstractClickableNodehandlePressInteractionStart11.write(pullTopk4lQ0M.IDLE);
                    int i5 = 17 / 0;
                    break;
                }
            }
        } while (atomicReference.get() == abstractClickableNodehandlePressInteractionStart11);
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = abstractClickableNodehandlePressInteractionStart11.serializer;
        if (videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk != null) {
            videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.cancel(false);
            abstractClickableNodehandlePressInteractionStart11.serializer = null;
        }
        imageCapture1.MediaDescriptionCompat().write(abstractClickableNodehandlePressInteractionStart11);
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 49;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetHelpcp accessgethelpcp = (accessgetHelpcp) this.serializer;
        accessgetEightcp accessgeteightcp = (accessgetEightcp) this.read;
        Object obj = this.IconCompatParcelizer;
        SQLiteEventStore sQLiteEventStore = accessgethelpcp.serializer;
        sQLiteEventStore.getClass();
        accessgetBrowsercp accessgetbrowsercp = accessgeteightcp.IconCompatParcelizer;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            Objects.toString(accessgetbrowsercp);
            int i5 = MediaSessionCompatQueueItem + 37;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        ((Long) sQLiteEventStore.write(new SentryClient$$ExternalSyntheticLambda1(sQLiteEventStore, obj, accessgeteightcp, i))).getClass();
        accessgethelpcp.RatingCompat.IconCompatParcelizer(accessgeteightcp, 1, false);
        return null;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 5;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        NavigationRoute navigationRoute = (NavigationRoute) this.serializer;
        MapboxTripSession mapboxTripSession = (MapboxTripSession) this.read;
        List list = (List) this.IconCompatParcelizer;
        List list2 = (List) obj;
        navigationRoute.getClass();
        mapboxTripSession.getClass();
        list.getClass();
        list2.getClass();
        NavigationRoute navigationRouteCopy$base_release$default = NavigationRoute.copy$base_release$default(navigationRoute, null, null, null, null, null, null, 511);
        mapboxTripSession.primaryRoute = navigationRouteCopy$base_release$default;
        ArrayList arrayList = navigationRouteCopy$base_release$default.upcomingRoadObjects;
        Object[] objArr = {mapboxTripSession.roadObjects, arrayList};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatQueueItem + 15;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            mapboxTripSession.roadObjects = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(onContentCardDismissed.serializer(list, 1));
        arrayList2.add(0, navigationRouteCopy$base_release$default);
        return new NativeSetRouteValue(arrayList2, list2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    @Override // o.isUnspecifieduvyYCjk
    public void onFragmentResult(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.serializer;
        if (i2 == 22) {
            RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = (RoomDatabase$createConnectionManager$2) obj3;
            isInline isinline = (isInline) obj2;
            FragmentActivity fragmentActivity = (FragmentActivity) obj;
            bundle.getClass();
            String string = bundle.getString("TransferChangeFragment_amount");
            if (string != null) {
                int i3 = write + 89;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                roomDatabase$createConnectionManager$2.invoke(string, isinline.uid);
            }
            fragmentActivity.getSupportFragmentManager().write("TransferChangeFragment");
            return;
        }
        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj3;
        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj2;
        FragmentActivity fragmentActivity2 = (FragmentActivity) obj;
        bundle.getClass();
        String string2 = bundle.getString("InAppCameraWithTagsFragment_screen_data");
        if (string2 != null) {
            int i5 = MediaSessionCompatQueueItem + 119;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string2)) {
                darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
            } else {
                darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2.invoke();
            }
        } else {
            darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
        }
        fragmentActivity2.getSupportFragmentManager().write("InAppCameraWithTagsFragment");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    @Override // o.Camera2CameraImpl
    public void write(getCollapseContentDescription getcollapsecontentdescription) {
        boolean z;
        int i = 2 % 2;
        int i2 = write + 45;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PendingValue pendingValue = (PendingValue) this.serializer;
        ImageCapture1 imageCapture1 = (ImageCapture1) this.IconCompatParcelizer;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.read;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) pendingValue.serializer;
        Objects.toString(getcollapsecontentdescription);
        setInflatedId.IconCompatParcelizer(3, "PreviewView");
        if (imageCapture1.MediaMetadataCompat().MediaBrowserCompatMediaItem() == 0) {
            int i4 = write + 1;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        applyToFlingBMRW4eQ applytoflingbmrw4eq = androidEdgeEffectOverscrollEffect.MediaBrowserCompatMediaItem;
        Size size = surfaceRequest.MediaSessionCompatQueueItem;
        applytoflingbmrw4eq.getClass();
        Objects.toString(getcollapsecontentdescription);
        Objects.toString(size);
        setInflatedId.IconCompatParcelizer(3, "PreviewTransform");
        applytoflingbmrw4eq.MediaBrowserCompatMediaItem = getcollapsecontentdescription.serializer;
        applytoflingbmrw4eq.serializer = getcollapsecontentdescription.IconCompatParcelizer;
        applytoflingbmrw4eq.MediaMetadataCompat = getcollapsecontentdescription.read;
        applytoflingbmrw4eq.IconCompatParcelizer = size;
        applytoflingbmrw4eq.write = z;
        applytoflingbmrw4eq.RemoteActionCompatParcelizer = getcollapsecontentdescription.write;
        applytoflingbmrw4eq.MediaSessionCompatQueueItem = getcollapsecontentdescription.RemoteActionCompatParcelizer;
        if (getcollapsecontentdescription.read == -1) {
            androidEdgeEffectOverscrollEffect.PlaybackStateCompat = true;
        } else {
            BackgroundKt backgroundKt = androidEdgeEffectOverscrollEffect.RatingCompat;
            if (backgroundKt != null) {
                int i6 = write + 115;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (backgroundKt instanceof ClickableElement) {
                    androidEdgeEffectOverscrollEffect.PlaybackStateCompat = true;
                }
            }
            androidEdgeEffectOverscrollEffect.PlaybackStateCompat = false;
        }
        androidEdgeEffectOverscrollEffect.RemoteActionCompatParcelizer();
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 47;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        Object obj4 = this.serializer;
        if (i3 == 10) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj4;
            AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
            getOwner getowner = (getOwner) obj2;
            if (task.isSuccessful()) {
                parentDataModifierDefaultImpls.write(task.getResult());
            } else if (task.getException() != null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(task.getException());
            } else if (atomicBoolean.getAndSet(true)) {
                getowner.IconCompatParcelizer();
            }
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) obj4;
        Task task2 = (Task) obj3;
        Task task3 = (Task) obj2;
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        }
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) task2.getResult();
        if (task3.isSuccessful()) {
            int i4 = write + 89;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui2 = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) task3.getResult();
            if (setprimarydirectionalmotionaxisoverrider2eplt8ui2 != null && setprimarydirectionalmotionaxisoverrider2eplt8ui.read.equals(setprimarydirectionalmotionaxisoverrider2eplt8ui2.read)) {
                return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(Boolean.FALSE);
            }
        }
        return firebaseRemoteConfig.RemoteActionCompatParcelizer.IconCompatParcelizer(setprimarydirectionalmotionaxisoverrider2eplt8ui).continueWith(firebaseRemoteConfig.IconCompatParcelizer, new FirebaseRemoteConfig$$ExternalSyntheticLambda0(firebaseRemoteConfig));
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) throws Exception {
        Task taskLambda$blockingGetToken$13;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 51;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            taskLambda$blockingGetToken$13 = ((FirebaseMessaging) this.serializer).lambda$blockingGetToken$13((String) this.read, (AndroidClipboardManager_androidKt) this.IconCompatParcelizer, (String) obj);
            int i3 = 15 / 0;
        } else {
            taskLambda$blockingGetToken$13 = ((FirebaseMessaging) this.serializer).lambda$blockingGetToken$13((String) this.read, (AndroidClipboardManager_androidKt) this.IconCompatParcelizer, (String) obj);
        }
        int i4 = MediaSessionCompatQueueItem + 9;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return taskLambda$blockingGetToken$13;
    }

    @Override // o.SpringSimulation
    public void RemoteActionCompatParcelizer(Surface surface) {
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk;
        int i = 2 % 2;
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.serializer;
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.read;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.IconCompatParcelizer;
        int iOrdinal = ((AnimatablesnapTo2) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat).ordinal();
        if (iOrdinal != 0) {
            int i2 = write + 85;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i3;
            int i4 = i2 % 2;
            if (iOrdinal == 1) {
                if (!surfaceRequest.write()) {
                    r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem = surface;
                    Objects.toString(surface);
                    setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
                    surfaceRequest.write(surface, (Executor) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer, new snapTo(0, r8lambdauosl1ojcz1lncaiooglfrbn5pcg));
                    r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat = AnimatablesnapTo2.READY;
                    ondrawwithcontent.RemoteActionCompatParcelizer((EncoderImpl) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer);
                    return;
                }
                int i5 = write + 109;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    Objects.toString(surfaceRequest, "EMPTY");
                    setInflatedId.IconCompatParcelizer(4, "VideoEncoderSession");
                } else {
                    Objects.toString(surfaceRequest, "EMPTY");
                    setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
                }
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer();
                return;
            }
            if (iOrdinal != 2) {
                int i6 = i3 + 37;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (iOrdinal == 3) {
                    if (((CrossfadeKtCrossfade51alpha2) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaDescriptionCompat) != null && (previewFreezeAfterHighSpeedRecordingQuirk = (PreviewFreezeAfterHighSpeedRecordingQuirk) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem) != null) {
                        previewFreezeAfterHighSpeedRecordingQuirk.execute(new Crossfade(r8lambdauosl1ojcz1lncaiooglfrbn5pcg, 16, surface));
                    }
                    setInflatedId.read("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("State ", (AnimatablesnapTo2) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat, " is not handled");
                    return;
                }
            }
        }
        Objects.toString((AnimatablesnapTo2) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat);
        setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
        ondrawwithcontent.RemoteActionCompatParcelizer(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1 != 16) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r9 = (com.braze.BrazeUser) r9;
        r9.getClass();
        r9.setCustomUserAttribute("courier_id", (java.lang.String) r6);
        r0 = ((java.lang.String) r5).toUpperCase(java.util.Locale.ROOT);
        r0.getClass();
        r9.setCustomUserAttribute("rider_country", r0);
        r9.setCustomUserAttribute("rider_city", (java.lang.String) r4);
        r0 = java.util.Locale.getDefault().getDisplayLanguage();
        r0.getClass();
        r9.setCustomUserAttribute("rider_language", r0);
        r9.setPushNotificationSubscriptionType(com.braze.enums.NotificationSubscriptionType.OPTED_IN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        r6 = (com.google.firebase.inappmessaging.internal.MetricsLoggerClient) r6;
        r1 = r6.RatingCompat;
        r2 = (o.observeMeasureSnapshotReadsui) com.google.firebase.inappmessaging.internal.MetricsLoggerClient.write.get((o.ParentDataModifierNode) r4);
        r9 = r6.write((o.internalOnMeasureui) r5, (java.lang.String) r9);
        r9.RemoteActionCompatParcelizer();
        ((com.google.firebase.inappmessaging.CampaignAnalytics) r9.RemoteActionCompatParcelizer).setDismissType(r2);
        r1.RemoteActionCompatParcelizer(((com.google.firebase.inappmessaging.CampaignAnalytics) r9.serializer()).toByteArray());
        r9 = androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2.MediaSessionCompatQueueItem + 11;
        androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2.write = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 != 16) goto L11;
     */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    @Override // com.mapbox.maps.SnapshotCompleteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        QueriedRenderedFeature queriedRenderedFeature;
        Boolean boolValueOf;
        JsonElement property;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.serializer;
        if (i2 == 20) {
            Snapshotter.start$lambda$17((Snapshotter) obj3, (SnapshotResultCallback) obj2, (SnapshotOverlayCallback) obj, expected);
            return;
        }
        SharedFlowImpl sharedFlowImpl = ((hf) obj3).IconCompatParcelizer;
        MapboxMap mapboxMap = (MapboxMap) obj2;
        Point point = (Point) obj;
        expected.getClass();
        List list = (List) expected.getValue();
        if (list != null) {
            int i3 = MediaSessionCompatQueueItem + 23;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            queriedRenderedFeature = (QueriedRenderedFeature) onContentCardDismissed.MediaMetadataCompat(list);
            int i5 = write + 97;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            int i7 = MediaSessionCompatQueueItem + 93;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            queriedRenderedFeature = null;
        }
        if (queriedRenderedFeature != null) {
            int i9 = MediaSessionCompatQueueItem + 89;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            QueriedFeature queriedFeature = queriedRenderedFeature.getQueriedFeature();
            if (queriedFeature != null) {
                int i11 = write + 61;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                Feature feature = queriedFeature.getFeature();
                if (feature == null || (property = feature.getProperty("cluster")) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(property.getAsBoolean());
                }
            } else {
                boolValueOf = null;
            }
        } else {
            boolValueOf = null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{boolValueOf, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            sharedFlowImpl.write(new eh(new f8(point.latitude(), point.longitude())));
            return;
        }
        sharedFlowImpl.write(ehExternalSyntheticLambda0.write);
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center(point).zoom(Double.valueOf(mapboxMap.getCameraState().getZoom() + 2.0d)).build();
        cameraOptionsBuild.getClass();
        mapboxMap.cameraAnimationsPlugin(new MapboxNavigation$notification$1$1(cameraOptionsBuild, 4, new MapAnimationOptions(null, 500L, null)));
    }

    @Override // o.migrateBlocklistedListslambda0
    public Object A_() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 55;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listRemoteActionCompatParcelizer = DustDataStoreProviderCompanion.RemoteActionCompatParcelizer((DustDataStoreProviderCompanion) this.serializer, (BoundingBox) this.read, (ArrayList) this.IconCompatParcelizer);
        int i4 = MediaSessionCompatQueueItem + 33;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return listRemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0122 A[PHI: r12
  0x0122: PHI (r12v33 java.lang.String) = (r12v32 java.lang.String), (r12v36 java.lang.String) binds: [B:34:0x0120, B:31:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        setResourcePackageName setresourcepackagename;
        setResourcePackageName setresourcepackagenameIconCompatParcelizer;
        String str;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 51;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer != 13) {
            calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u = (calculateLocalPositionMKHz9U) this.serializer;
            JsonUtilsa[] jsonUtilsaArr = (JsonUtilsa[]) this.read;
            zp zpVar = (zp) this.IconCompatParcelizer;
            calculatelocalpositionmkhz9u.getClass();
            JsonUtilsa jsonUtilsa = (JsonUtilsa) task.getResult();
            jsonUtilsaArr[0] = jsonUtilsa;
            onRequestRelayoutdefault onrequestrelayoutdefault = new onRequestRelayoutdefault(calculatelocalpositionmkhz9u, zpVar, jsonUtilsaArr);
            r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa2 = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
            r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(calculateLocalPositionMKHz9U.write, calculateLocalPositionMKHz9U.read + " fire/26.1.1 grpc/");
            r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(calculateLocalPositionMKHz9U.serializer, calculatelocalpositionmkhz9u.MediaBrowserCompatMediaItem);
            r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(calculateLocalPositionMKHz9U.IconCompatParcelizer, calculatelocalpositionmkhz9u.MediaBrowserCompatMediaItem);
            createLayerdefault createlayerdefault = calculatelocalpositionmkhz9u.RatingCompat;
            if (createlayerdefault != null) {
                int i4 = MediaSessionCompatQueueItem + 117;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = createlayerdefault.MediaDescriptionCompat;
                    createlayerdefault.RemoteActionCompatParcelizer.write();
                    throw null;
                }
                AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1 = createlayerdefault.MediaDescriptionCompat;
                AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda2 = createlayerdefault.RemoteActionCompatParcelizer;
                if (abstractComposeViewExternalSyntheticLambda2.write() != null && abstractComposeViewExternalSyntheticLambda1.write() != null) {
                    int code = ((onSemanticsChange) ((setShowLayoutBounds) abstractComposeViewExternalSyntheticLambda2.write())).IconCompatParcelizer().getCode();
                    if (code != 0) {
                        r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(createLayerdefault.serializer, Integer.toString(code));
                    }
                    r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(createLayerdefault.write, ((requestFocusCurrent) abstractComposeViewExternalSyntheticLambda1.write()).read());
                    isTreeConsistent istreeconsistent = createlayerdefault.IconCompatParcelizer;
                    if (istreeconsistent != null) {
                        String str2 = istreeconsistent.IconCompatParcelizer;
                        if (str2.length() != 0) {
                            int i5 = write + 75;
                            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            r8lambdaqn1du6uas6agx4srbugfttxtpwa2.read(createLayerdefault.read, str2);
                        }
                    }
                }
            }
            jsonUtilsa.read(onrequestrelayoutdefault, r8lambdaqn1du6uas6agx4srbugfttxtpwa2);
            ((resizeGraphicFrameIfAppropriatelambda0) zpVar.serializer).serializer(new RxWorker$1$$ExternalSyntheticLambda0(22, zpVar));
            jsonUtilsaArr[0].serializer(1);
            return;
        }
        Task task2 = (Task) this.serializer;
        MetadataApplierImpl metadataApplierImpl = (MetadataApplierImpl) this.read;
        Task task3 = (Task) this.IconCompatParcelizer;
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa3 = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
        try {
            if (task2.isSuccessful()) {
                int i7 = MediaSessionCompatQueueItem + 57;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    str = (String) task2.getResult();
                    onEndApplyChanges.read("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        r8lambdaqn1du6uas6agx4srbugfttxtpwa3.read(FirestoreCallCredentials.read, "Bearer ".concat(str));
                    }
                } else {
                    str = (String) task2.getResult();
                    onEndApplyChanges.read("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        r8lambdaqn1du6uas6agx4srbugfttxtpwa3.read(FirestoreCallCredentials.read, "Bearer ".concat(str));
                    }
                }
            } else {
                Exception exception = task2.getException();
                if (!(exception instanceof FirebaseApiNotAvailableException)) {
                    if (exception instanceof FirebaseNoSignedInUserException) {
                        int i8 = write + 49;
                        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        onEndApplyChanges.read("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    } else {
                        onEndApplyChanges.RemoteActionCompatParcelizer("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                        metadataApplierImpl.serializer(Status.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(exception));
                    }
                    int i10 = write + 89;
                    MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return;
                }
                int i12 = write + 63;
                MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                onEndApplyChanges.read("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            }
            if (!task3.isSuccessful()) {
                Exception exception2 = task3.getException();
                if (exception2 instanceof FirebaseApiNotAvailableException) {
                    onEndApplyChanges.read("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                } else {
                    onEndApplyChanges.RemoteActionCompatParcelizer("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                    metadataApplierImpl.serializer(Status.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(exception2));
                }
                int i14 = write + 89;
                MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return;
            }
            String str3 = (String) task3.getResult();
            if (str3 != null && !str3.isEmpty()) {
                onEndApplyChanges.read("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                r8lambdaqn1du6uas6agx4srbugfttxtpwa3.read(FirestoreCallCredentials.serializer, str3);
            }
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer = ((r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano) metadataApplierImpl.PlaybackStateCompat).IconCompatParcelizer((SentryClient) metadataApplierImpl.MediaBrowserCompatMediaItem, r8lambdaqn1du6uas6agx4srbugfttxtpwa, (mergeJsonObjectslambda10) metadataApplierImpl.RemoteActionCompatParcelizer, (JsonUtilsExternalSyntheticLambda1[]) metadataApplierImpl.RatingCompat);
            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            metadataApplierImpl.read(r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer);
            int i16 = MediaSessionCompatQueueItem + 121;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            int i18 = write + 89;
            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            return;
        } catch (Throwable th) {
            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            throw th;
        }
        TextStreamsKt.RemoteActionCompatParcelizer("apply() or fail() already called", !metadataApplierImpl.IconCompatParcelizer);
        r8lambdaqn1du6uas6agx4srbugfttxtpwa = (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) metadataApplierImpl.MediaSessionCompatQueueItem;
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.write(r8lambdaqn1du6uas6agx4srbugfttxtpwa3);
        setresourcepackagename = (setResourcePackageName) metadataApplierImpl.write;
        setresourcepackagenameIconCompatParcelizer = setresourcepackagename.IconCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x024e  */
    @Override // o.onRequestMeasure
    public Object write() {
        long j;
        int i = 2 % 2;
        I$b i$b = (I$b) this.serializer;
        DropShadowEffect dropShadowEffect = (DropShadowEffect) this.read;
        SnapshotVersion snapshotVersion = (SnapshotVersion) this.IconCompatParcelizer;
        SparseArray sparseArray = (SparseArray) i$b.MediaSessionCompatResultReceiverWrapper;
        SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) i$b.MediaBrowserCompatMediaItem;
        Map map = (Map) dropShadowEffect.RatingCompat;
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc = (getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer;
        long jIconCompatParcelizer = getminimumtouchtargetsizenhjbrc.write().IconCompatParcelizer();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            getFocusOwner getfocusowner = (getFocusOwner) entry.getValue();
            setLastShapeui setlastshapeui = (setLastShapeui) sparseArray.get(iIntValue);
            if (setlastshapeui != null) {
                asList aslist = getfocusowner.read;
                getClipMetadata getclipmetadata = getfocusowner.serializer;
                headH91voCI headh91voci = sQLiteTargetCache.write;
                Iterator it2 = it;
                SnapshotVersion snapshotVersion2 = snapshotVersion;
                SQLiteStatement sQLiteStatementCompileStatement = headh91voci.serializer.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
                OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = headh91voci.RemoteActionCompatParcelizer;
                Iterator it3 = aslist.iterator();
                while (true) {
                    zzkh zzkhVar = (zzkh) it3;
                    Iterator it4 = it3;
                    if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                        break;
                    }
                    int i2 = MediaSessionCompatQueueItem + 109;
                    I$b i$b2 = i$b;
                    write = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    visitNodes visitnodes = (visitNodes) zzkhVar.next();
                    Object[] objArr = {Integer.valueOf(iIntValue), updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer)};
                    sQLiteStatementCompileStatement.clearBindings();
                    headH91voCI.write(sQLiteStatementCompileStatement, objArr);
                    sQLiteStatementCompileStatement.executeUpdateDelete();
                    onGloballyPositionedModifierDefaultImpls.serializer(visitnodes);
                    it3 = it4;
                    i$b = i$b2;
                }
                I$b i$b3 = i$b;
                asList aslist2 = getfocusowner.IconCompatParcelizer;
                headH91voCI headh91voci2 = sQLiteTargetCache.write;
                SQLiteStatement sQLiteStatementCompileStatement2 = headh91voci2.serializer.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
                OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls2 = headh91voci2.RemoteActionCompatParcelizer;
                Iterator it5 = aslist2.iterator();
                while (true) {
                    zzkh zzkhVar2 = (zzkh) it5;
                    if (!((Iterator) zzkhVar2.RemoteActionCompatParcelizer).hasNext()) {
                        break;
                    }
                    visitNodes visitnodes2 = (visitNodes) zzkhVar2.next();
                    Iterator it6 = it5;
                    Object[] objArr2 = {Integer.valueOf(iIntValue), updateLayerParameters.write(visitnodes2.RemoteActionCompatParcelizer)};
                    sQLiteStatementCompileStatement2.clearBindings();
                    headH91voCI.write(sQLiteStatementCompileStatement2, objArr2);
                    sQLiteStatementCompileStatement2.executeUpdateDelete();
                    onGloballyPositionedModifierDefaultImpls2.serializer(visitnodes2);
                    it5 = it6;
                }
                setLastShapeui setlastshapeuiWrite = setlastshapeui.write(jIconCompatParcelizer);
                if (((Map) dropShadowEffect.write).containsKey(num)) {
                    ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
                    SnapshotVersion snapshotVersion3 = SnapshotVersion.IconCompatParcelizer;
                    setLastShapeui setlastshapeuiRemoteActionCompatParcelizer = setlastshapeuiWrite.RemoteActionCompatParcelizer(clipboardExtensions_androidKt, snapshotVersion3);
                    j = jIconCompatParcelizer;
                    setlastshapeuiWrite = new setLastShapeui(setlastshapeuiRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, setlastshapeuiRemoteActionCompatParcelizer.MediaSessionCompatQueueItem, setlastshapeuiRemoteActionCompatParcelizer.read, setlastshapeuiRemoteActionCompatParcelizer.IconCompatParcelizer, setlastshapeuiRemoteActionCompatParcelizer.RatingCompat, snapshotVersion3, setlastshapeuiRemoteActionCompatParcelizer.write, null);
                } else {
                    j = jIconCompatParcelizer;
                    if (!getclipmetadata.serializer()) {
                        setlastshapeuiWrite = setlastshapeuiWrite.RemoteActionCompatParcelizer(getclipmetadata, (SnapshotVersion) dropShadowEffect.read);
                    }
                }
                sparseArray.put(iIntValue, setlastshapeuiWrite);
                if (I$b.RemoteActionCompatParcelizer(setlastshapeui, setlastshapeuiWrite, getfocusowner)) {
                    int i4 = MediaSessionCompatQueueItem + 33;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    sQLiteTargetCache.write(setlastshapeuiWrite);
                }
                it = it2;
                snapshotVersion = snapshotVersion2;
                i$b = i$b3;
                jIconCompatParcelizer = j;
            }
        }
        I$b i$b4 = i$b;
        SnapshotVersion snapshotVersion4 = snapshotVersion;
        Map map2 = (Map) dropShadowEffect.serializer;
        Set set = (Set) dropShadowEffect.MediaDescriptionCompat;
        for (visitNodes visitnodes3 : map2.keySet()) {
            int i6 = write + 59;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (set.contains(visitnodes3)) {
                getminimumtouchtargetsizenhjbrc.write().serializer(visitnodes3);
            }
        }
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        LocalDocumentsView localDocumentsView = (LocalDocumentsView) i$b4.RemoteActionCompatParcelizer;
        HashMap mapWrite = localDocumentsView.write(map2.keySet());
        Iterator it7 = map2.entrySet().iterator();
        int i8 = MediaSessionCompatQueueItem + 33;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it7.next();
            visitNodes visitnodes4 = (visitNodes) entry2.getKey();
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) entry2.getValue();
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) mapWrite.get(visitnodes4);
            if (nodeCoordinatorCompanionPointerInputSource1.read() != nodeCoordinatorCompanionPointerInputSource2.read()) {
                hashSet.add(visitnodes4);
            }
            if (nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.NO_DOCUMENT) && nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.equals(SnapshotVersion.IconCompatParcelizer)) {
                arrayList.add(nodeCoordinatorCompanionPointerInputSource1.read);
                map3.put(visitnodes4, nodeCoordinatorCompanionPointerInputSource1);
            } else if (!(!nodeCoordinatorCompanionPointerInputSource2.serializer.equals(getSemanticsSource.INVALID)) || nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.compareTo(nodeCoordinatorCompanionPointerInputSource2.MediaDescriptionCompat) > 0) {
                getRectManager.RemoteActionCompatParcelizer(true ^ SnapshotVersion.IconCompatParcelizer.equals(nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer), "Cannot add a document when the remote version is zero", new Object[0]);
                localDocumentsView.read(nodeCoordinatorCompanionPointerInputSource1, nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer);
                map3.put(visitnodes4, nodeCoordinatorCompanionPointerInputSource1);
            } else {
                int i10 = MediaSessionCompatQueueItem + 43;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 93 / 0;
                    if (nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.compareTo(nodeCoordinatorCompanionPointerInputSource2.MediaDescriptionCompat) == 0) {
                        if (!nodeCoordinatorCompanionPointerInputSource2.IconCompatParcelizer() || nodeCoordinatorCompanionPointerInputSource2.RemoteActionCompatParcelizer.equals(getPointerInputSource.HAS_COMMITTED_MUTATIONS)) {
                            getRectManager.RemoteActionCompatParcelizer(true ^ SnapshotVersion.IconCompatParcelizer.equals(nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer), "Cannot add a document when the remote version is zero", new Object[0]);
                            localDocumentsView.read(nodeCoordinatorCompanionPointerInputSource1, nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer);
                            map3.put(visitnodes4, nodeCoordinatorCompanionPointerInputSource1);
                        }
                    }
                } else if (nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.compareTo(nodeCoordinatorCompanionPointerInputSource2.MediaDescriptionCompat) == 0) {
                    if (!nodeCoordinatorCompanionPointerInputSource2.IconCompatParcelizer()) {
                    }
                    getRectManager.RemoteActionCompatParcelizer(true ^ SnapshotVersion.IconCompatParcelizer.equals(nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer), "Cannot add a document when the remote version is zero", new Object[0]);
                    localDocumentsView.read(nodeCoordinatorCompanionPointerInputSource1, nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer);
                    map3.put(visitnodes4, nodeCoordinatorCompanionPointerInputSource1);
                }
                onEndApplyChanges.read("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", visitnodes4, nodeCoordinatorCompanionPointerInputSource2.MediaDescriptionCompat, nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat);
            }
        }
        localDocumentsView.read(arrayList);
        SnapshotVersion snapshotVersionRemoteActionCompatParcelizer = sQLiteTargetCache.RemoteActionCompatParcelizer();
        if (!snapshotVersion4.equals(SnapshotVersion.IconCompatParcelizer)) {
            getRectManager.RemoteActionCompatParcelizer(snapshotVersion4.compareTo(snapshotVersionRemoteActionCompatParcelizer) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion4, snapshotVersionRemoteActionCompatParcelizer);
            sQLiteTargetCache.RemoteActionCompatParcelizer = snapshotVersion4;
            sQLiteTargetCache.IconCompatParcelizer();
        }
        return ((LocalDocumentsView) i$b4.MediaDescriptionCompat).write(map3, hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[PHI: r9
  0x0039: PHI (r9v12 o.accessgetHcp) = 
  (r9v5 o.accessgetHcp)
  (r9v6 o.accessgetHcp)
  (r9v7 o.accessgetHcp)
  (r9v8 o.accessgetHcp)
  (r9v9 o.accessgetHcp)
  (r9v10 o.accessgetHcp)
  (r9v10 o.accessgetHcp)
 binds: [B:9:0x0037, B:12:0x0041, B:15:0x004a, B:18:0x0053, B:21:0x005c, B:26:0x0070, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.accessgetMediaEjectcp
    public Object apply(Object obj) {
        int i = 2 % 2;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.serializer;
        HashMap map = (HashMap) this.read;
        ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.IconCompatParcelizer;
        ArrayList arrayList = (ArrayList) imageLoader$Builder.IconCompatParcelizer;
        Cursor cursor = (Cursor) obj;
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i2 = cursor.getInt(1);
            accessgetHcp accessgethcp = accessgetHcp.REASON_UNKNOWN;
            if (i2 != accessgethcp.getNumber()) {
                accessgetHcp accessgethcp2 = accessgetHcp.MESSAGE_TOO_OLD;
                if (i2 == accessgethcp2.getNumber()) {
                    accessgethcp = accessgethcp2;
                } else {
                    accessgethcp2 = accessgetHcp.CACHE_FULL;
                    if (i2 == accessgethcp2.getNumber()) {
                        accessgethcp = accessgethcp2;
                    } else {
                        accessgethcp2 = accessgetHcp.PAYLOAD_TOO_BIG;
                        if (i2 == accessgethcp2.getNumber()) {
                            accessgethcp = accessgethcp2;
                        } else {
                            accessgethcp2 = accessgetHcp.MAX_RETRIES_REACHED;
                            if (i2 == accessgethcp2.getNumber()) {
                                accessgethcp = accessgethcp2;
                            } else {
                                accessgethcp2 = accessgetHcp.INVALID_PAYLOD;
                                if (i2 == accessgethcp2.getNumber()) {
                                    accessgethcp = accessgethcp2;
                                } else {
                                    accessgethcp2 = accessgetHcp.SERVER_ERROR;
                                    if (i2 == accessgethcp2.getNumber()) {
                                        int i3 = write + 39;
                                        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                                        if (i3 % 2 == 0) {
                                            int i4 = 37 / 0;
                                        }
                                        accessgethcp = accessgethcp2;
                                    } else {
                                        RangesKt.serializer(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new accessgetFunctioncp(j, accessgethcp));
        }
        int i5 = MediaSessionCompatQueueItem + 115;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        for (Map.Entry entry : map.entrySet()) {
            int i7 = accessgetHeadsetHookcp.RemoteActionCompatParcelizer;
            new ArrayList();
            arrayList.add(new accessgetHeadsetHookcp((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long jIconCompatParcelizer = sQLiteEventStore.MediaMetadataCompat.IconCompatParcelizer();
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = sQLiteEventStore.IconCompatParcelizer();
        sQLiteDatabaseIconCompatParcelizer.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseIconCompatParcelizer.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
            try {
                cursorRawQuery.moveToNext();
                accessgetIcp accessgeticp = new accessgetIcp(cursorRawQuery.getLong(0), jIconCompatParcelizer);
                cursorRawQuery.close();
                sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                sQLiteDatabaseIconCompatParcelizer.endTransaction();
                imageLoader$Builder.RemoteActionCompatParcelizer = accessgeticp;
                long jSimpleQueryForLong = sQLiteEventStore.IconCompatParcelizer().compileStatement("PRAGMA page_count").simpleQueryForLong();
                imageLoader$Builder.read = new accessgetGcp(new accessgetHenkancp(sQLiteEventStore.IconCompatParcelizer().compileStatement("PRAGMA page_size").simpleQueryForLong() * jSimpleQueryForLong, accessgetLastChannelcp.RemoteActionCompatParcelizer.MediaDescriptionCompat));
                imageLoader$Builder.serializer = (String) sQLiteEventStore.serializer.write();
                return new accessgetGravecp((accessgetIcp) imageLoader$Builder.RemoteActionCompatParcelizer, Collections.unmodifiableList(arrayList), (accessgetGcp) imageLoader$Builder.read, (String) imageLoader$Builder.serializer);
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseIconCompatParcelizer.endTransaction();
            throw th2;
        }
    }
}
