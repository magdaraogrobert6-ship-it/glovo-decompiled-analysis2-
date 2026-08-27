package androidx.camera.core.streamsharing;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowInsetsCompat$Impl;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.v8;
import coil3.util.UtilsKt;
import com.braze.location.GooglePlayLocationUtils;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda16;
import com.braze.managers.IBrazeGeofenceLocationUpdateListener;
import com.deliveryhero.chatui.view.util.DialogUtils$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidEdgeEffectOverscrollEffect;
import o.Animatable;
import o.CameraControlInternalCameraControlException;
import o.DisplayInfoManager;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.ExtraSupportedOutputSizeQuirk;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.FloatingActionButtonKtFloatingActionButton31;
import o.FocusPropertiesImpl;
import o.FocusRequesterModifierKt;
import o.GlowEdgeEffectCompat;
import o.GraphicsViewLayer;
import o.ImageCapture1;
import o.ImageCaptureFailWithAutoFlashQuirk;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.InlineChildren;
import o.InputModeCompanion;
import o.LayerSnapshotImpl;
import o.PinnableContainer;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.TransitionState;
import o.UseCaseAdditionSimulator;
import o.VideoQualityQuirk;
import o.accessassignFocus3ESFkO8;
import o.accessisProcessingCustomExitp;
import o.discardDisplayListInternalui_graphics;
import o.drawBehind;
import o.getCurrentContentInsetRight;
import o.getDefaultImageFormat;
import o.getFixedWidthMajor;
import o.getInflatedId;
import o.getLastBaselineToBottomHeight;
import o.getLayoutResource;
import o.getNavigationEventDispatcher;
import o.getSurfaceClass;
import o.getThumbTextPadding;
import o.getTrackDrawable;
import o.isPlacementApproachInProgress;
import o.isUnspecifieduvyYCjk;
import o.obtainDropShadowRenderereZhPAX0;
import o.obtainShadowContext;
import o.onContentCardClicked;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onForwardedEvent;
import o.r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setContentDrawScopeui;
import o.setContentInsetEndWithActions;
import o.setInflatedId;
import o.setRight;
import o.setTextClassifier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class StreamSharing$$ExternalSyntheticLambda0 implements obtainShadowContext, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, getSurfaceClass, setContentInsetEndWithActions, setTextClassifier, FloatingActionButtonKtFloatingActionButton31, FocusPropertiesImpl, isUnspecifieduvyYCjk, PinnableContainer, OnSuccessListener, OnFailureListener, getNavigationEventDispatcher, Consumer {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ StreamSharing$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    @Override // o.getSurfaceClass
    public void RemoteActionCompatParcelizer(getDefaultImageFormat getdefaultimageformat) {
        boolean z;
        int i = this.write;
        Object obj = this.serializer;
        if (i == 4) {
            getThumbTextPadding getthumbtextpadding = (getThumbTextPadding) obj;
            getthumbtextpadding.getClass();
            try {
                getInflatedId getinflatedidWrite = getdefaultimageformat.write();
                if (getinflatedidWrite != null) {
                    getthumbtextpadding.RemoteActionCompatParcelizer.write(getinflatedidWrite);
                    return;
                }
                return;
            } catch (IllegalStateException e) {
                setInflatedId.serializer("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
                return;
            }
        }
        boolean z2 = true;
        if (i == 7) {
            getLayoutResource getlayoutresource = (getLayoutResource) obj;
            synchronized (getlayoutresource.MediaBrowserCompatMediaItem) {
                getlayoutresource.PlaybackStateCompatCustomAction++;
            }
            getlayoutresource.RemoteActionCompatParcelizer(getdefaultimageformat);
            return;
        }
        BlockRunner blockRunner = (BlockRunner) obj;
        int i2 = 21;
        try {
            getInflatedId getinflatedidWrite2 = getdefaultimageformat.write();
            if (getinflatedidWrite2 != null) {
                blockRunner.read(getinflatedidWrite2);
                return;
            }
            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read;
            if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk != null) {
                int i3 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaDescriptionCompat;
                ImageCaptureException imageCaptureException = new ImageCaptureException(2, "Failed to acquire latest image", null);
                PrematureEndOfStreamVideoQuirk.write();
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read;
                if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 == null || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat != i3) {
                    return;
                }
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                    return;
                }
                PrematureEndOfStreamVideoQuirk.write();
                int i4 = extraSupportedOutputSizeQuirk.RatingCompat;
                if (i4 > 0) {
                    extraSupportedOutputSizeQuirk.RatingCompat = i4 - 1;
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    PrematureEndOfStreamVideoQuirk.write();
                    extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk, i2, imageCaptureException));
                }
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer();
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.serializer(imageCaptureException);
                if (z) {
                    imageCaptureFailWithAutoFlashQuirk.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(extraSupportedOutputSizeQuirk);
                }
            }
        } catch (IllegalStateException e2) {
            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk3 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read;
            if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk3 != null) {
                int i5 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk3.MediaDescriptionCompat;
                ImageCaptureException imageCaptureException2 = new ImageCaptureException(2, "Failed to acquire latest image", e2);
                PrematureEndOfStreamVideoQuirk.write();
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk4 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read;
                if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk4 == null || imageCaptureFailedWhenVideoCaptureIsBoundQuirk4.MediaDescriptionCompat != i5) {
                    return;
                }
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk2 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk4.write;
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk2 = imageCaptureFailWithAutoFlashQuirk2.MediaDescriptionCompat;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk2.MediaMetadataCompat) {
                    return;
                }
                PrematureEndOfStreamVideoQuirk.write();
                int i6 = extraSupportedOutputSizeQuirk2.RatingCompat;
                if (i6 > 0) {
                    extraSupportedOutputSizeQuirk2.RatingCompat = i6 - 1;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    PrematureEndOfStreamVideoQuirk.write();
                    extraSupportedOutputSizeQuirk2.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk2, i2, imageCaptureException2));
                }
                imageCaptureFailWithAutoFlashQuirk2.RemoteActionCompatParcelizer();
                imageCaptureFailWithAutoFlashQuirk2.RemoteActionCompatParcelizer.serializer(imageCaptureException2);
                if (z2) {
                    imageCaptureFailWithAutoFlashQuirk2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(extraSupportedOutputSizeQuirk2);
                }
            }
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        DrawModifierNodeKt drawModifierNodeKt;
        int i = this.write;
        Object obj = this.serializer;
        int i2 = 1;
        if (i == 1) {
            Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) obj;
            try {
                camera2CameraControlImpl.MediaDescriptionCompat.execute(new getLastBaselineToBottomHeight(camera2CameraControlImpl, ondrawwithcontent, i2));
                return "isRepeatingRequestAvailable";
            } catch (RejectedExecutionException unused) {
                ondrawwithcontent.serializer(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
                return "isRepeatingRequestAvailable";
            }
        }
        int i3 = 0;
        if (i != 5) {
            if (i != 9) {
                UseCaseAdditionSimulator useCaseAdditionSimulator = (UseCaseAdditionSimulator) obj;
                ((CameraControlInternalCameraControlException) useCaseAdditionSimulator.serializer.IconCompatParcelizer).IconCompatParcelizer.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(ondrawwithcontent.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Animatable animatable = new Animatable(atomicBoolean, ondrawwithcontent, useCaseAdditionSimulator);
                ondrawwithcontent.RemoteActionCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(atomicBoolean, useCaseAdditionSimulator, animatable, 13), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                useCaseAdditionSimulator.serializer.read(animatable);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(ondrawwithcontent.hashCode()));
            }
            NavArgsLazy navArgsLazy = (NavArgsLazy) obj;
            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(navArgsLazy, 29, ondrawwithcontent));
            return navArgsLazy + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
        getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) obj;
        getcurrentcontentinsetright.serializer.serializer();
        CameraRepository cameraRepository = getcurrentcontentinsetright.MediaBrowserCompatMediaItem;
        synchronized (cameraRepository.write) {
            boolean zIsEmpty = cameraRepository.read.isEmpty();
            onDrawBehind ondrawbehind = cameraRepository.IconCompatParcelizer;
            DrawModifierNodeKt drawModifierNodeKt2 = ondrawbehind;
            onDrawBehind ondrawbehind2 = ondrawbehind;
            if (zIsEmpty) {
                if (ondrawbehind == null) {
                    drawModifierNodeKt2 = EncoderImplMediaCodecCallback.IconCompatParcelizer;
                }
                drawModifierNodeKt = drawModifierNodeKt2;
            } else {
                if (ondrawbehind == null) {
                    onDrawWithContent ondrawwithcontent2 = new onDrawWithContent();
                    ondrawwithcontent2.IconCompatParcelizer = new setContentDrawScopeui();
                    onDrawBehind ondrawbehind3 = new onDrawBehind(ondrawwithcontent2);
                    ondrawwithcontent2.read = ondrawbehind3;
                    ondrawwithcontent2.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
                    try {
                        synchronized (cameraRepository.write) {
                            cameraRepository.RemoteActionCompatParcelizer = ondrawwithcontent2;
                        }
                        ondrawwithcontent2.RemoteActionCompatParcelizer = "CameraRepository-deinit";
                    } catch (Exception e) {
                        ondrawbehind3.write(e);
                    }
                    cameraRepository.IconCompatParcelizer = ondrawbehind3;
                    ondrawbehind2 = ondrawbehind3;
                }
                cameraRepository.MediaSessionCompatQueueItem.addAll(cameraRepository.read.values());
                for (ImageCapture1 imageCapture1 : cameraRepository.read.values()) {
                    imageCapture1.ParcelableVolumeInfo().RemoteActionCompatParcelizer(new CameraX$$ExternalSyntheticLambda2(cameraRepository, 25, imageCapture1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                }
                cameraRepository.read.clear();
                drawModifierNodeKt = ondrawbehind2;
            }
        }
        drawModifierNodeKt.RemoteActionCompatParcelizer(new CameraX$$ExternalSyntheticLambda2(getcurrentcontentinsetright, i3, ondrawwithcontent), getcurrentcontentinsetright.read);
        return "CameraX shutdownInternal";
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = read + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        v8.a((v8) this.serializer, task);
        int i4 = read + 69;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$3((IBrazeGeofenceLocationUpdateListener) this.serializer, exc);
            return;
        }
        GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$3((IBrazeGeofenceLocationUpdateListener) this.serializer, exc);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isUnspecifieduvyYCjk
    public void onFragmentResult(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((StringsKt__StringsKt$$ExternalSyntheticLambda1) this.serializer).invoke(str, bundle);
        int i4 = IconCompatParcelizer + 119;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setContentInsetEndWithActions
    public void serializer(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = read + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((setContentInsetEndWithActions) this.serializer).serializer(featureCombinationQueryImplExternalSyntheticLambda2);
        int i4 = read + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public /* synthetic */ StreamSharing$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.write = i;
        this.serializer = obj2;
    }

    public float IconCompatParcelizer(float f) {
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float density = ((drawBehind) this.serializer).write.getDensity() * f;
        int i4 = read + 113;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return density;
    }

    @Override // o.FloatingActionButtonKtFloatingActionButton31
    public int serializer(LayoutDirection layoutDirection, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 5;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.write;
        Object obj = this.serializer;
        if (i4 == 14) {
            return ((Alignment.Horizontal) obj).align(0, i, layoutDirection);
        }
        int iAlign = ((Alignment.Vertical) obj).align(0, i);
        int i5 = IconCompatParcelizer + 15;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return iAlign;
        }
        throw null;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = this.serializer;
        if (i2 == 26) {
            ((Navigator$$ExternalSyntheticLambda1) obj2).invoke(obj);
            int i3 = read + 7;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        if (i2 != 27) {
            ((f2$$ExternalSyntheticLambda4) obj2).invoke(obj);
            return;
        }
        ((f2$$ExternalSyntheticLambda4) obj2).invoke(obj);
        int i5 = IconCompatParcelizer + 35;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = read + 123;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.serializer;
        if (i4 == 21) {
            ((f2$$ExternalSyntheticLambda4) obj2).invoke(obj);
            int i5 = read + 81;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        if (i4 == 23) {
            ((GooglePlayLocationUtils$$ExternalSyntheticLambda16) obj2).invoke(obj);
            return;
        }
        if (i4 == 24) {
            ((GooglePlayLocationUtils$$ExternalSyntheticLambda16) obj2).invoke(obj);
            return;
        }
        ((InputModeCompanion) obj2).invoke(obj);
        int i7 = IconCompatParcelizer + 1;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[SYNTHETIC] */
    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int size;
        int i;
        int i2 = 2 % 2;
        accessassignFocus3ESFkO8 accessassignfocus3esfko8 = (accessassignFocus3ESFkO8) this.serializer;
        ArrayList arrayList = accessassignfocus3esfko8.read;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setRight setrightRemoteActionCompatParcelizer = setRight.RemoteActionCompatParcelizer(windowInsetsCompat$Impl.getInsets(519), windowInsetsCompat$Impl.getInsets(64));
        setRight setrightRemoteActionCompatParcelizer2 = setRight.RemoteActionCompatParcelizer(windowInsetsCompat$Impl.getInsetsIgnoringVisibility(519), windowInsetsCompat$Impl.getInsetsIgnoringVisibility(64));
        if (setrightRemoteActionCompatParcelizer.equals(accessassignfocus3esfko8.write)) {
            int i3 = read + 95;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
                if (!setrightRemoteActionCompatParcelizer2.equals(accessassignfocus3esfko8.IconCompatParcelizer)) {
                    accessassignfocus3esfko8.write = setrightRemoteActionCompatParcelizer;
                    accessassignfocus3esfko8.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                    size = arrayList.size() - 1;
                    int i5 = read + 113;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    while (size >= 0) {
                        i = IconCompatParcelizer + 3;
                        read = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            accessisProcessingCustomExitp accessisprocessingcustomexitp = (accessisProcessingCustomExitp) arrayList.get(size);
                            accessisprocessingcustomexitp.write = setrightRemoteActionCompatParcelizer;
                            accessisprocessingcustomexitp.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                            accessisprocessingcustomexitp.IconCompatParcelizer();
                            size += 65;
                        } else {
                            accessisProcessingCustomExitp accessisprocessingcustomexitp2 = (accessisProcessingCustomExitp) arrayList.get(size);
                            accessisprocessingcustomexitp2.write = setrightRemoteActionCompatParcelizer;
                            accessisprocessingcustomexitp2.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                            accessisprocessingcustomexitp2.IconCompatParcelizer();
                            size--;
                        }
                    }
                }
            } else if (!setrightRemoteActionCompatParcelizer2.equals(accessassignfocus3esfko8.IconCompatParcelizer)) {
                accessassignfocus3esfko8.write = setrightRemoteActionCompatParcelizer;
                accessassignfocus3esfko8.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                size = arrayList.size() - 1;
                int i7 = read + 113;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                while (size >= 0) {
                    i = IconCompatParcelizer + 3;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        accessisProcessingCustomExitp accessisprocessingcustomexitp3 = (accessisProcessingCustomExitp) arrayList.get(size);
                        accessisprocessingcustomexitp3.write = setrightRemoteActionCompatParcelizer;
                        accessisprocessingcustomexitp3.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                        accessisprocessingcustomexitp3.IconCompatParcelizer();
                        size += 65;
                    } else {
                        accessisProcessingCustomExitp accessisprocessingcustomexitp4 = (accessisProcessingCustomExitp) arrayList.get(size);
                        accessisprocessingcustomexitp4.write = setrightRemoteActionCompatParcelizer;
                        accessisprocessingcustomexitp4.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                        accessisprocessingcustomexitp4.IconCompatParcelizer();
                        size--;
                    }
                }
            }
        } else {
            accessassignfocus3esfko8.write = setrightRemoteActionCompatParcelizer;
            accessassignfocus3esfko8.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
            size = arrayList.size() - 1;
            int i9 = read + 113;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            while (size >= 0) {
                i = IconCompatParcelizer + 3;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    accessisProcessingCustomExitp accessisprocessingcustomexitp5 = (accessisProcessingCustomExitp) arrayList.get(size);
                    accessisprocessingcustomexitp5.write = setrightRemoteActionCompatParcelizer;
                    accessisprocessingcustomexitp5.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                    accessisprocessingcustomexitp5.IconCompatParcelizer();
                    size += 65;
                } else {
                    accessisProcessingCustomExitp accessisprocessingcustomexitp6 = (accessisProcessingCustomExitp) arrayList.get(size);
                    accessisprocessingcustomexitp6.write = setrightRemoteActionCompatParcelizer;
                    accessisprocessingcustomexitp6.IconCompatParcelizer = setrightRemoteActionCompatParcelizer2;
                    accessisprocessingcustomexitp6.IconCompatParcelizer();
                    size--;
                }
            }
        }
        return focusRequesterModifierKt;
    }

    public void RemoteActionCompatParcelizer(r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs r8lambda9zisiqwdkc3dd5mjtz1f1xgfcgs) {
        TransitionState transitionState;
        float fM;
        int i = 2 % 2;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) this.serializer;
        if (!(!(r8lambda9zisiqwdkc3dd5mjtz1f1xgfcgs instanceof GlowEdgeEffectCompat)) && (transitionState = androidEdgeEffectOverscrollEffect.IconCompatParcelizer) != null) {
            int i2 = IconCompatParcelizer + 75;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                float f = ((GlowEdgeEffectCompat) r8lambda9zisiqwdkc3dd5mjtz1f1xgfcgs).RemoteActionCompatParcelizer;
                transitionState.RemoteActionCompatParcelizer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f2 = ((GlowEdgeEffectCompat) r8lambda9zisiqwdkc3dd5mjtz1f1xgfcgs).RemoteActionCompatParcelizer;
            if (!transitionState.RemoteActionCompatParcelizer()) {
                setInflatedId.read("CameraController", "Use cases not attached to camera.");
                int i3 = read + 119;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else if (transitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                PrematureEndOfStreamVideoQuirk.write();
                DisplayInfoManager displayInfoManager = (DisplayInfoManager) transitionState._init_lambda3.IconCompatParcelizer();
                if (displayInfoManager != null) {
                    float f3 = displayInfoManager.read();
                    if (f2 > 1.0f) {
                        int i5 = IconCompatParcelizer + 23;
                        read = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        fM = c8$$ExternalSyntheticOutline0.m(f2, 1.0f, 2.0f, 1.0f);
                        int i7 = IconCompatParcelizer + 23;
                        read = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    } else {
                        fM = 1.0f - ((1.0f - f2) * 2.0f);
                    }
                    transitionState.write(Math.min(Math.max(f3 * fM, displayInfoManager.IconCompatParcelizer()), displayInfoManager.RemoteActionCompatParcelizer()));
                }
            } else {
                int i9 = read + 85;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                setInflatedId.IconCompatParcelizer(3, "CameraController");
            }
        }
        int i11 = IconCompatParcelizer + 81;
        read = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            int i12 = 84 / 0;
        }
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.serializer;
        if (i4 != 2) {
            if (i4 != 3) {
                return (DrawModifierNodeKt) ((InlineChildren) obj2).invoke(obj);
            }
            ArrayList arrayList = (ArrayList) obj2;
            List list = (List) obj;
            Objects.toString(list);
            setInflatedId.IconCompatParcelizer(3, "SyncCaptureSessionBase");
            int i5 = 0;
            if (list.isEmpty()) {
                return new EncoderImplMediaCodecCallback(i5, new IllegalArgumentException("Unable to open capture session without surfaces"));
            }
            if (!list.contains(null)) {
                return VideoQualityQuirk.read(list);
            }
            EncoderImplMediaCodecCallback encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(i5, new DeferrableSurface$SurfaceClosedException("Surface closed", (PreviewExternalSyntheticLambda0) arrayList.get(list.indexOf(null))));
            int i6 = IconCompatParcelizer + 31;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return encoderImplMediaCodecCallback;
        }
        getFixedWidthMajor getfixedwidthmajor = (getFixedWidthMajor) obj2;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            EncoderImplMediaCodecCallback encoderImplMediaCodecCallback2 = EncoderImplMediaCodecCallback.IconCompatParcelizer;
            int i8 = IconCompatParcelizer + 55;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return encoderImplMediaCodecCallback2;
            }
            int i9 = 4 / 3;
            return encoderImplMediaCodecCallback2;
        }
        long j = getfixedwidthmajor.RatingCompat;
        ScheduledExecutorService scheduledExecutorService = getfixedwidthmajor.MediaMetadataCompat;
        Camera2CameraControlImpl camera2CameraControlImpl = getfixedwidthmajor.serializer;
        long j2 = j / 1000000;
        onForwardedEvent onforwardedevent = new onForwardedEvent(new getTrackDrawable(10));
        camera2CameraControlImpl.write(onforwardedevent);
        CameraX$$ExternalSyntheticLambda2 cameraX$$ExternalSyntheticLambda2 = new CameraX$$ExternalSyntheticLambda2(camera2CameraControlImpl, 8, onforwardedevent);
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = camera2CameraControlImpl.MediaDescriptionCompat;
        onDrawBehind ondrawbehind = onforwardedevent.IconCompatParcelizer;
        ondrawbehind.serializer.RemoteActionCompatParcelizer(cameraX$$ExternalSyntheticLambda2, previewFreezeAfterHighSpeedRecordingQuirk);
        return UtilsKt.RemoteActionCompatParcelizer(new Futures$$ExternalSyntheticLambda3(ondrawbehind, scheduledExecutorService, j2, 1));
    }

    @Override // o.setTextClassifier
    public Object read(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EncoderImpl encoderImpl = (EncoderImpl) this.serializer;
        Long l = (Long) obj;
        if (i3 != 0) {
            return Long.valueOf(encoderImpl.read(l.longValue()));
        }
        Long.valueOf(encoderImpl.read(l.longValue()));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0 A[EDGE_INSN: B:31:0x00e0->B:33:0x013b BREAK  A[LOOP:0: B:17:0x00a1->B:32:0x0137]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[SYNTHETIC] */
    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        Context context;
        isPlacementApproachInProgress isplacementapproachinprogress;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 7;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        WebChatFragment webChatFragment = (WebChatFragment) this.serializer;
        int i5 = 0;
        if (((Boolean) obj).booleanValue()) {
            int i6 = IconCompatParcelizer + 73;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                isplacementapproachinprogress = webChatFragment.IconCompatParcelizer().MediaSessionCompatToken;
                int i7 = 34 / 0;
                if (isplacementapproachinprogress == null) {
                    return;
                }
            } else {
                isplacementapproachinprogress = webChatFragment.IconCompatParcelizer().MediaSessionCompatToken;
                if (isplacementapproachinprogress == null) {
                    return;
                }
            }
            discardDisplayListInternalui_graphics discarddisplaylistinternalui_graphics = (discardDisplayListInternalui_graphics) webChatFragment.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
            Context contextRequireContext = webChatFragment.requireContext();
            contextRequireContext.getClass();
            ((GraphicsViewLayer) discarddisplaylistinternalui_graphics).serializer(contextRequireContext, isplacementapproachinprogress);
            return;
        }
        SharedPreferences sharedPreferences = ((LayerSnapshotImpl) webChatFragment.RatingCompat.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        String str = LayerSnapshotImpl.IconCompatParcelizer[0];
        Context contextRequireContext2 = webChatFragment.requireContext();
        contextRequireContext2.getClass();
        String[] strArr = contextRequireContext2.getPackageManager().getPackageInfo(contextRequireContext2.getPackageName(), Fields.TransformOrigin).requestedPermissions;
        strArr.getClass();
        if (onContentCardClicked.IconCompatParcelizer(strArr, str)) {
            int i8 = read + 47;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            arrayList.add(str);
            int i10 = read + 85;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        int length = strArr2.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = IconCompatParcelizer + 73;
            read = i13 % Fields.SpotShadowColor;
            int i14 = 1;
            if (i13 % 2 == 0) {
                int i15 = 32 / 0;
                if (webChatFragment.shouldShowRequestPermissionRationale(strArr2[i12])) {
                    continue;
                } else {
                    if (sharedPreferences.getBoolean("IS_PERMISSION_DENIED_PERMANENTLY_JUST_NOW", true)) {
                        context = webChatFragment.getContext();
                        if (context != null) {
                            break;
                        }
                        obtainDropShadowRenderereZhPAX0 obtaindropshadowrendererezhpax0 = (obtainDropShadowRenderereZhPAX0) webChatFragment.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                        LayerUtils$getLayer$source$2 layerUtils$getLayer$source$2 = new LayerUtils$getLayer$source$2(context, i, webChatFragment);
                        obtaindropshadowrendererezhpax0.getClass();
                        String strWrite = obtaindropshadowrendererezhpax0.write(context, R.attr.customerChatEnableCameraAlertTitle);
                        String strWrite2 = obtaindropshadowrendererezhpax0.write(context, R.attr.customerChatEnableCameraAlertMessage);
                        String strWrite3 = obtaindropshadowrendererezhpax0.write(context, R.attr.customerChatEnableCameraAlertOpenSetting);
                        String strWrite4 = obtaindropshadowrendererezhpax0.write(context, R.attr.customerChatEnableCameraAlertDismiss);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).create();
                        alertDialogCreate.getClass();
                        alertDialogCreate.setTitle(strWrite);
                        alertDialogCreate.setMessage(strWrite2);
                        alertDialogCreate.setCancelable(false);
                        alertDialogCreate.setButton(-2, strWrite4, new DialogUtils$$ExternalSyntheticLambda0(i5, alertDialogCreate));
                        alertDialogCreate.setButton(-1, strWrite3, new DialogUtils$$ExternalSyntheticLambda0(i14, layerUtils$getLayer$source$2));
                        alertDialogCreate.show();
                        break;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.getClass();
                    editorEdit.putBoolean("IS_PERMISSION_DENIED_PERMANENTLY_JUST_NOW", false);
                    editorEdit.apply();
                }
            } else if (!webChatFragment.shouldShowRequestPermissionRationale(strArr2[i12])) {
                if (sharedPreferences.getBoolean("IS_PERMISSION_DENIED_PERMANENTLY_JUST_NOW", true)) {
                    context = webChatFragment.getContext();
                    if (context != null) {
                        break;
                    }
                    obtainDropShadowRenderereZhPAX0 obtaindropshadowrendererezhpax1 = (obtainDropShadowRenderereZhPAX0) webChatFragment.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    LayerUtils$getLayer$source$2 layerUtils$getLayer$source$3 = new LayerUtils$getLayer$source$2(context, i, webChatFragment);
                    obtaindropshadowrendererezhpax1.getClass();
                    String strWrite5 = obtaindropshadowrendererezhpax1.write(context, R.attr.customerChatEnableCameraAlertTitle);
                    String strWrite6 = obtaindropshadowrendererezhpax1.write(context, R.attr.customerChatEnableCameraAlertMessage);
                    String strWrite7 = obtaindropshadowrendererezhpax1.write(context, R.attr.customerChatEnableCameraAlertOpenSetting);
                    String strWrite8 = obtaindropshadowrendererezhpax1.write(context, R.attr.customerChatEnableCameraAlertDismiss);
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context).create();
                    alertDialogCreate2.getClass();
                    alertDialogCreate2.setTitle(strWrite5);
                    alertDialogCreate2.setMessage(strWrite6);
                    alertDialogCreate2.setCancelable(false);
                    alertDialogCreate2.setButton(-2, strWrite8, new DialogUtils$$ExternalSyntheticLambda0(i5, alertDialogCreate2));
                    alertDialogCreate2.setButton(-1, strWrite7, new DialogUtils$$ExternalSyntheticLambda0(i14, layerUtils$getLayer$source$3));
                    alertDialogCreate2.show();
                    break;
                }
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.getClass();
                editorEdit2.putBoolean("IS_PERMISSION_DENIED_PERMANENTLY_JUST_NOW", false);
                editorEdit2.apply();
            } else {
                continue;
            }
        }
        ValueCallback valueCallback = webChatFragment.MediaSessionCompatQueueItem;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        webChatFragment.MediaSessionCompatQueueItem = null;
    }
}
