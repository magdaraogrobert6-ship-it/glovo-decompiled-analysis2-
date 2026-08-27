package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.navigation.NavArgsLazy;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import com.huawei.location.ut;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import o.AnimatablerunAnimation2;
import o.AnimatedContentTransitionScopeImplSizeModifierNode;
import o.AnimatedContentTransitionScopeImplSizeModifierNodemeasure1;
import o.AnimatedEnterExitMeasurePolicy;
import o.AnimatedEnterExitMeasurePolicymeasure1;
import o.AnimatedVisibilityKt;
import o.AnimationModifierKt;
import o.BiometricFragmentExternalSyntheticLambda1;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.Crossfade;
import o.CubicBezierEasing;
import o.DeferrableSurfaceSurfaceUnavailableException;
import o.DrawModifierNodeKt;
import o.EnterExitTransitionKtexpandIn1;
import o.EnterExitTransitionKtexpandVertically2;
import o.EnterExitTransitionKtslideOutHorizontally2;
import o.FocusMeteringAction;
import o.ImageCapture1;
import o.ImageCaptureMetadata;
import o.ImageUtilCodecFailedException;
import o.InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2;
import o.InfiniteTransitionrun113;
import o.InitializationException;
import o.InterruptedRuntimeException;
import o.MediaStoreVideoCannotWrite;
import o.PrematureEndOfStreamVideoQuirk;
import o.Preview3AThreadCrashQuirk;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewGreenTintQuirk;
import o.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import o.PreviewView1ExternalSyntheticLambda2;
import o.Recorder3;
import o.RepeatingStreamConstraintForVideoRecordingQuirk;
import o.ScreenFlashView2;
import o.SizeAnimationModifierNodemeasure2;
import o.SmallDisplaySizeQuirk;
import o.StreamSharingExternalSyntheticLambda0;
import o.SurfaceViewStretchedQuirk;
import o.UseCaseAdditionSimulator;
import o.VideoQualityQuirk;
import o.abandonFocus;
import o.accessgetGreencp;
import o.accessrunAnimations;
import o.accesswaitForCompositionAfterTargetStateChange;
import o.getCameraProvider;
import o.getImageFormatdefault;
import o.getNavigationIcon;
import o.getValueFromNanos;
import o.minIntrinsicHeight;
import o.onDrawBehind;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.resetAnimationFractionanimation_core;
import o.setBrightness;
import o.setController;
import o.setInflatedId;
import o.setInitialAnimationsanimation_core;
import o.setMaxCardElevation;
import o.setScreenFlashWindow;
import o.updateInitialValuesanimation_core;
import o.updateTargetanimation_core;
import o.values;

/* JADX INFO: loaded from: classes.dex */
public final class VideoCapture extends UseCase {
    public static final EnterExitTransitionKtslideOutHorizontally2 RemoteActionCompatParcelizer = new EnterExitTransitionKtslideOutHorizontally2();
    public setBrightness IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public AnimatablerunAnimation2 MediaDescriptionCompat;
    public UseCaseAdditionSimulator MediaMetadataCompat;
    public NavArgsLazy MediaSessionCompatQueueItem;
    public AnimatedEnterExitMeasurePolicymeasure1 ParcelableVolumeInfo;
    public final SizeAnimationModifierNodemeasure2 PlaybackStateCompat;
    public InfiniteTransitionrun113 RatingCompat;
    public SurfaceRequest r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public onDrawBehind r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public Rect read;
    public PreviewExternalSyntheticLambda0 serializer;
    public InterruptedRuntimeException write;

    @Override // androidx.camera.core.UseCase
    public final void ResultReceiver() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        PlaybackStateCompatCustomAction();
        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatToken;
        if (smallDisplaySizeQuirk == null || this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
            return;
        }
        DeferrableSurfaceSurfaceUnavailableException deferrableSurfaceSurfaceUnavailableExceptionRemoteActionCompatParcelizer = MediaSessionCompatQueueItem().RemoteActionCompatParcelizer();
        Object obj = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = deferrableSurfaceSurfaceUnavailableExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (drawModifierNodeKtRemoteActionCompatParcelizer.isDone()) {
            try {
                obj = drawModifierNodeKtRemoteActionCompatParcelizer.get();
            } catch (InterruptedException | ExecutionException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                return;
            }
        }
        this.ParcelableVolumeInfo = (AnimatedEnterExitMeasurePolicymeasure1) obj;
        UseCaseAdditionSimulator useCaseAdditionSimulator = read((getValueFromNanos) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, smallDisplaySizeQuirk);
        this.MediaMetadataCompat = useCaseAdditionSimulator;
        IconCompatParcelizer(useCaseAdditionSimulator, this.ParcelableVolumeInfo, smallDisplaySizeQuirk);
        Object[] objArr = {this.MediaMetadataCompat.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.ACTIVE;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        MediaSessionCompatQueueItem().RemoteActionCompatParcelizer().serializer(removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer(), this.PlaybackStateCompat);
        AnimatablerunAnimation2 animatablerunAnimation2 = this.MediaDescriptionCompat;
        if (animatablerunAnimation2 != null) {
            animatablerunAnimation2.read();
        }
        ImageCaptureMetadata imageCaptureMetadataMediaDescriptionCompat = MediaDescriptionCompat();
        AnimatablerunAnimation2 animatablerunAnimation3 = new AnimatablerunAnimation2();
        animatablerunAnimation3.write = false;
        animatablerunAnimation3.RemoteActionCompatParcelizer = imageCaptureMetadataMediaDescriptionCompat;
        this.MediaDescriptionCompat = animatablerunAnimation3;
        MediaSessionCompatQueueItem().read().serializer(removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer(), this.MediaDescriptionCompat);
        InfiniteTransitionrun113 infiniteTransitionrun113 = InfiniteTransitionrun113.ACTIVE_NON_STREAMING;
        if (infiniteTransitionrun113 != this.RatingCompat) {
            this.RatingCompat = infiniteTransitionrun113;
            MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(infiniteTransitionrun113);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final Set read(FocusMeteringAction focusMeteringAction) {
        return MediaSessionCompatQueueItem().write(focusMeteringAction, 0).write();
    }

    public static void RemoteActionCompatParcelizer(HashSet hashSet, int i, int i2, Size size, setInitialAnimationsanimation_core setinitialanimationsanimation_core) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) setinitialanimationsanimation_core.read(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            setInflatedId.RemoteActionCompatParcelizer("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) setinitialanimationsanimation_core.RemoteActionCompatParcelizer(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            setInflatedId.RemoteActionCompatParcelizer("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public final boolean ComponentActivity() {
        this.ParcelableVolumeInfo.getClass();
        return false;
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException IconCompatParcelizer(boolean z, Recorder3 recorder3) {
        RemoteActionCompatParcelizer.getClass();
        getValueFromNanos getvaluefromnanos = EnterExitTransitionKtslideOutHorizontally2.RemoteActionCompatParcelizer;
        InitializationException initializationExceptionRemoteActionCompatParcelizer = recorder3.RemoteActionCompatParcelizer(getvaluefromnanos.write(), 1);
        if (z) {
            initializationExceptionRemoteActionCompatParcelizer = InitializationException.RemoteActionCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer, getvaluefromnanos);
        }
        if (initializationExceptionRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new getValueFromNanos(CameraRepository.serializer(((getCameraProvider) IconCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer)).serializer));
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSharingExternalSyntheticLambda0 IconCompatParcelizer(InitializationException initializationException) {
        return new getCameraProvider(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException), 3);
    }

    public final CubicBezierEasing MediaSessionCompatQueueItem() {
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) ((getValueFromNanos) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(getValueFromNanos.write);
        Objects.requireNonNull(cubicBezierEasing);
        return cubicBezierEasing;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException RemoteActionCompatParcelizer(FocusMeteringAction focusMeteringAction, StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0) {
        Object obj;
        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1;
        int i;
        ArrayList<AnimatedVisibilityKt> arrayList;
        List listSerializer;
        LinkedHashMap linkedHashMap;
        InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer;
        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure2;
        HashMap map;
        Iterator it;
        getNavigationIcon getnavigationicon;
        setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer;
        Iterator it2;
        getNavigationIcon getnavigationicon2;
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = MediaSessionCompatQueueItem().serializer().RemoteActionCompatParcelizer();
        if (drawModifierNodeKtRemoteActionCompatParcelizer.isDone()) {
            try {
                obj = drawModifierNodeKtRemoteActionCompatParcelizer.get();
            } catch (InterruptedException | ExecutionException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                return null;
            }
        } else {
            obj = null;
        }
        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure3 = (AnimatedContentTransitionScopeImplSizeModifierNodemeasure1) obj;
        if (animatedContentTransitionScopeImplSizeModifierNodemeasure3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("MediaSpec can't be null");
            return null;
        }
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = animatedContentTransitionScopeImplSizeModifierNodemeasure3.IconCompatParcelizer;
        accessgetGreencp accessgetgreencp = animatedEnterExitMeasurePolicy.RatingCompat;
        getValueFromNanos getvaluefromnanos = (getValueFromNanos) streamSharingExternalSyntheticLambda0.RemoteActionCompatParcelizer();
        if (getvaluefromnanos.read(getImageFormatdefault.d_)) {
            UtilsKt.IconCompatParcelizer("Custom ordered resolutions and QualitySelector can't both be set", accessgetgreencp == AnimatedEnterExitMeasurePolicy.serializer);
        } else {
            getNavigationIcon getnavigationiconIconCompatParcelizer = getvaluefromnanos.IconCompatParcelizer();
            int iIntValue = ((Integer) getvaluefromnanos.read(ImageUtilCodecFailedException.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, 0)).intValue();
            Range range = (Range) getvaluefromnanos.read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
            Objects.requireNonNull(range);
            EnterExitTransitionKtexpandVertically2 enterExitTransitionKtexpandVertically2Write = MediaSessionCompatQueueItem().write(focusMeteringAction, iIntValue);
            getnavigationiconIconCompatParcelizer.toString();
            range.toString();
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
            ArrayList arrayListWrite = enterExitTransitionKtexpandVertically2Write.write(getnavigationiconIconCompatParcelizer);
            Objects.toString(arrayListWrite);
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
            if (arrayListWrite.isEmpty() && iIntValue == 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (arrayListWrite.isEmpty()) {
                setInflatedId.read("VideoCapture", "Can't find any supported quality on the device.");
            } else {
                accessgetgreencp.getClass();
                if (arrayListWrite.isEmpty()) {
                    setInflatedId.read("QualitySelector", "No supported quality on the device.");
                    arrayList = new ArrayList();
                    animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure3;
                    i = iIntValue;
                    range = range;
                } else {
                    arrayListWrite.toString();
                    setInflatedId.IconCompatParcelizer(3, "QualitySelector");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Iterator it3 = ((List) accessgetgreencp.IconCompatParcelizer).iterator(); it3.hasNext(); it3 = it3) {
                        AnimatedVisibilityKt animatedVisibilityKt = (AnimatedVisibilityKt) it3.next();
                        if (animatedVisibilityKt == AnimatedVisibilityKt.serializer) {
                            linkedHashSet.addAll(arrayListWrite);
                            break;
                        }
                        if (animatedVisibilityKt == AnimatedVisibilityKt.IconCompatParcelizer) {
                            ArrayList arrayList2 = new ArrayList(arrayListWrite);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (arrayListWrite.contains(animatedVisibilityKt)) {
                            linkedHashSet.add(animatedVisibilityKt);
                        } else {
                            setInflatedId.read("QualitySelector", "quality is not supported and will be ignored: " + animatedVisibilityKt);
                        }
                    }
                    minIntrinsicHeight minintrinsicheight = (minIntrinsicHeight) accessgetgreencp.write;
                    if (arrayListWrite.isEmpty() || linkedHashSet.containsAll(arrayListWrite)) {
                        animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure3;
                        i = iIntValue;
                        range = range;
                    } else {
                        Objects.toString(minintrinsicheight);
                        setInflatedId.IconCompatParcelizer(3, "QualitySelector");
                        if (minintrinsicheight == minIntrinsicHeight.serializer) {
                            animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure3;
                            i = iIntValue;
                            range = range;
                        } else {
                            UtilsKt.RemoteActionCompatParcelizer("Currently only support type RuleStrategy", Objects.nonNull(minintrinsicheight));
                            ArrayList arrayList3 = new ArrayList(AnimatedVisibilityKt.MediaSessionCompatQueueItem);
                            AnimatedVisibilityKt animatedVisibilityKt2 = minintrinsicheight.IconCompatParcelizer;
                            animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure3;
                            if (animatedVisibilityKt2 == AnimatedVisibilityKt.serializer) {
                                animatedVisibilityKt2 = (AnimatedVisibilityKt) arrayList3.get(0);
                            } else if (animatedVisibilityKt2 == AnimatedVisibilityKt.IconCompatParcelizer) {
                                animatedVisibilityKt2 = (AnimatedVisibilityKt) af$$ExternalSyntheticOutline0.m(1, arrayList3);
                            }
                            int iIndexOf = arrayList3.indexOf(animatedVisibilityKt2);
                            UtilsKt.RemoteActionCompatParcelizer((String) null, iIndexOf != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i2 = iIndexOf - 1;
                            while (i2 >= 0) {
                                int i3 = iIntValue;
                                AnimatedVisibilityKt animatedVisibilityKt3 = (AnimatedVisibilityKt) arrayList3.get(i2);
                                if (arrayListWrite.contains(animatedVisibilityKt3)) {
                                    arrayList4.add(animatedVisibilityKt3);
                                }
                                i2--;
                                iIntValue = i3;
                            }
                            i = iIntValue;
                            ArrayList arrayList5 = new ArrayList();
                            for (int i4 = iIndexOf + 1; i4 < arrayList3.size(); i4++) {
                                AnimatedVisibilityKt animatedVisibilityKt4 = (AnimatedVisibilityKt) arrayList3.get(i4);
                                if (arrayListWrite.contains(animatedVisibilityKt4)) {
                                    arrayList5.add(animatedVisibilityKt4);
                                }
                            }
                            arrayList3.toString();
                            Objects.toString(animatedVisibilityKt2);
                            arrayList4.toString();
                            arrayList5.toString();
                            setInflatedId.IconCompatParcelizer(3, "QualitySelector");
                            int i5 = minintrinsicheight.write;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    throw new AssertionError("Unhandled fallback strategy: " + minintrinsicheight);
                                }
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                arrayList.toString();
                accessgetgreencp.toString();
                setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                if (arrayList.isEmpty()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unable to find selected quality");
                    return null;
                }
                Objects.requireNonNull((updateInitialValuesanimation_core) getvaluefromnanos.write(getValueFromNanos.read));
                int i6 = animatedEnterExitMeasurePolicy.IconCompatParcelizer;
                HashMap map2 = new HashMap();
                for (AnimatedVisibilityKt animatedVisibilityKt5 : enterExitTransitionKtexpandVertically2Write.write(getnavigationiconIconCompatParcelizer)) {
                    InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2Serializer = enterExitTransitionKtexpandVertically2Write.serializer(animatedVisibilityKt5, getnavigationiconIconCompatParcelizer);
                    Objects.requireNonNull(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2Serializer);
                    map2.put(animatedVisibilityKt5, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2Serializer.serializer.read());
                }
                if (i == 1) {
                    Range range2 = range;
                    listSerializer = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range2) ? focusMeteringAction.MediaSessionCompatResultReceiverWrapper() : focusMeteringAction.RemoteActionCompatParcelizer(range2);
                } else {
                    listSerializer = focusMeteringAction.serializer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer());
                }
                AnimationModifierKt animationModifierKt = new AnimationModifierKt(listSerializer, map2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (AnimatedVisibilityKt animatedVisibilityKt6 : arrayList) {
                    List list = (List) animationModifierKt.write.get(new AnimatedContentTransitionScopeImplSizeModifierNode(animatedVisibilityKt6, i6));
                    linkedHashMap2.put(animatedVisibilityKt6, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size = (Size) it5.next();
                            if (!map2.containsValue(size) && (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer = enterExitTransitionKtexpandVertically2Write.IconCompatParcelizer(size, getnavigationiconIconCompatParcelizer)) != null) {
                                if (getnavigationiconIconCompatParcelizer.serializer()) {
                                    animatedContentTransitionScopeImplSizeModifierNodemeasure2 = animatedContentTransitionScopeImplSizeModifierNodemeasure1;
                                    setinitialanimationsanimation_coreSerializer = serializer(getnavigationiconIconCompatParcelizer, animatedContentTransitionScopeImplSizeModifierNodemeasure2, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer);
                                    map = map2;
                                    it = it4;
                                    getnavigationicon = getnavigationiconIconCompatParcelizer;
                                } else {
                                    animatedContentTransitionScopeImplSizeModifierNodemeasure2 = animatedContentTransitionScopeImplSizeModifierNodemeasure1;
                                    int i7 = Integer.MIN_VALUE;
                                    setInitialAnimationsanimation_core setinitialanimationsanimation_core = null;
                                    for (PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk : infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer.MediaDescriptionCompat) {
                                        HashMap map3 = map2;
                                        if (updateTargetanimation_core.read(previewDelayWhenVideoCaptureIsBoundQuirk, getnavigationiconIconCompatParcelizer)) {
                                            it2 = it4;
                                            int i8 = previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat;
                                            HashMap map4 = updateTargetanimation_core.serializer;
                                            getnavigationicon2 = getnavigationiconIconCompatParcelizer;
                                            UtilsKt.serializer(map4.containsKey(Integer.valueOf(i8)));
                                            Integer num = (Integer) map4.get(Integer.valueOf(i8));
                                            Objects.requireNonNull(num);
                                            int iIntValue2 = num.intValue();
                                            int i9 = previewDelayWhenVideoCaptureIsBoundQuirk.serializer;
                                            HashMap map5 = updateTargetanimation_core.read;
                                            UtilsKt.serializer(map5.containsKey(Integer.valueOf(i9)));
                                            Integer num2 = (Integer) map5.get(Integer.valueOf(i9));
                                            Objects.requireNonNull(num2);
                                            setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer2 = serializer(new getNavigationIcon(iIntValue2, num2.intValue()), animatedContentTransitionScopeImplSizeModifierNodemeasure2, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer);
                                            if (setinitialanimationsanimation_coreSerializer2 != null) {
                                                int iIntValue3 = ((Integer) setinitialanimationsanimation_coreSerializer2.write().getUpper()).intValue();
                                                int iIntValue4 = ((Integer) setinitialanimationsanimation_coreSerializer2.read().getUpper()).intValue();
                                                Size size2 = setController.MediaDescriptionCompat;
                                                int i10 = iIntValue3 * iIntValue4;
                                                if (i10 > i7) {
                                                    setinitialanimationsanimation_core = setinitialanimationsanimation_coreSerializer2;
                                                    i7 = i10;
                                                }
                                            }
                                        } else {
                                            it2 = it4;
                                            getnavigationicon2 = getnavigationiconIconCompatParcelizer;
                                        }
                                        it4 = it2;
                                        getnavigationiconIconCompatParcelizer = getnavigationicon2;
                                        map2 = map3;
                                    }
                                    map = map2;
                                    it = it4;
                                    getnavigationicon = getnavigationiconIconCompatParcelizer;
                                    setinitialanimationsanimation_coreSerializer = setinitialanimationsanimation_core;
                                }
                                if (setinitialanimationsanimation_coreSerializer != null && !setinitialanimationsanimation_coreSerializer.IconCompatParcelizer(size.getWidth(), size.getHeight())) {
                                    it5.remove();
                                }
                                it4 = it;
                                animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure2;
                                getnavigationiconIconCompatParcelizer = getnavigationicon;
                                map2 = map;
                            }
                        }
                        HashMap map6 = map2;
                        Iterator it6 = it4;
                        getNavigationIcon getnavigationicon3 = getnavigationiconIconCompatParcelizer;
                        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure4 = animatedContentTransitionScopeImplSizeModifierNodemeasure1;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap.put((AnimatedVisibilityKt) entry.getKey(), arrayList6);
                        }
                        it4 = it6;
                        animatedContentTransitionScopeImplSizeModifierNodemeasure1 = animatedContentTransitionScopeImplSizeModifierNodemeasure4;
                        getnavigationiconIconCompatParcelizer = getnavigationicon3;
                        map2 = map6;
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it7 = linkedHashMap.values().iterator();
                while (it7.hasNext()) {
                    arrayList7.addAll((List) it7.next());
                }
                arrayList7.toString();
                setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getImageFormatdefault.d_, arrayList7);
            }
        }
        return streamSharingExternalSyntheticLambda0.RemoteActionCompatParcelizer();
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk RemoteActionCompatParcelizer(InitializationException initializationException) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(initializationException);
        Object[] objArr = {this.MediaMetadataCompat.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatToken;
        Objects.requireNonNull(smallDisplaySizeQuirk);
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = smallDisplaySizeQuirk.read();
        repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = initializationException;
        return repeatingStreamConstraintForVideoRecordingQuirk.read();
    }

    @Override // androidx.camera.core.UseCase
    public final Set e_() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk write(SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        Objects.toString(smallDisplaySizeQuirk);
        Objects.toString(smallDisplaySizeQuirk2);
        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        List list = (List) ((getValueFromNanos) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read(getImageFormatdefault.d_, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(size)) {
            setInflatedId.read("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + arrayList);
        }
        return smallDisplaySizeQuirk;
    }

    @Override // androidx.camera.core.UseCase
    public final void write(Rect rect) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    public VideoCapture(getValueFromNanos getvaluefromnanos) {
        super(getvaluefromnanos);
        this.ParcelableVolumeInfo = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
        this.MediaMetadataCompat = new UseCaseAdditionSimulator();
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
        this.RatingCompat = InfiniteTransitionrun113.INACTIVE;
        Map map = Collections.EMPTY_MAP;
        this.PlaybackStateCompat = new SizeAnimationModifierNodemeasure2(0, this);
    }

    @Override // androidx.camera.core.UseCase
    public final void MediaBrowserCompatMediaItem() {
        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        UtilsKt.RemoteActionCompatParcelizer("VideoCapture can only be detached on the main thread.", PrematureEndOfStreamVideoQuirk.read());
        if (this.MediaDescriptionCompat != null) {
            MediaSessionCompatQueueItem().read().write(this.MediaDescriptionCompat);
            this.MediaDescriptionCompat.read();
            this.MediaDescriptionCompat = null;
        }
        InfiniteTransitionrun113 infiniteTransitionrun113 = InfiniteTransitionrun113.INACTIVE;
        if (infiniteTransitionrun113 != this.RatingCompat) {
            this.RatingCompat = infiniteTransitionrun113;
            MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(infiniteTransitionrun113);
        }
        MediaSessionCompatQueueItem().RemoteActionCompatParcelizer().write(this.PlaybackStateCompat);
        onDrawBehind ondrawbehind = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (ondrawbehind != null && ondrawbehind.cancel(false)) {
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        }
        read();
    }

    public final void read() {
        PrematureEndOfStreamVideoQuirk.write();
        InterruptedRuntimeException interruptedRuntimeException = this.write;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
            this.write = null;
        }
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = this.serializer;
        if (previewExternalSyntheticLambda0 != null) {
            previewExternalSyntheticLambda0.write();
            this.serializer = null;
        }
        NavArgsLazy navArgsLazy = this.MediaSessionCompatQueueItem;
        if (navArgsLazy != null) {
            navArgsLazy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            this.MediaSessionCompatQueueItem = null;
        }
        setBrightness setbrightness = this.IconCompatParcelizer;
        if (setbrightness != null) {
            setbrightness.read();
            this.IconCompatParcelizer = null;
        }
        this.read = null;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = null;
        this.ParcelableVolumeInfo = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = 0;
    }

    public static setInitialAnimationsanimation_core serializer(getNavigationIcon getnavigationicon, AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1, InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) {
        setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer = updateInitialValuesanimation_core.serializer(accessrunAnimations.read(getnavigationicon, animatedContentTransitionScopeImplSizeModifierNodemeasure1, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2).write);
        if (setinitialanimationsanimation_coreSerializer != null) {
            return VideoEncoderInfoWrapper.serializer(setinitialanimationsanimation_coreSerializer, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 != null ? infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.serializer.read() : null);
        }
        setInflatedId.read("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        setBrightness setbrightness = this.IconCompatParcelizer;
        if (imageCapture1RatingCompat == null || setbrightness == null) {
            return;
        }
        int i = read(imageCapture1RatingCompat);
        this.MediaBrowserCompatMediaItem = i;
        PrematureEndOfStreamVideoQuirk.write(new ScreenFlashView2(setbrightness, i, MediaMetadataCompat()));
    }

    public final int read(ImageCapture1 imageCapture1) {
        int iSerializer = serializer(imageCapture1, write(imageCapture1));
        ComponentActivity();
        return iSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    public final boolean write(ImageCapture1 imageCapture1, getValueFromNanos getvaluefromnanos, int i, Rect rect, Size size, getNavigationIcon getnavigationicon) {
        if (i == 1) {
            return false;
        }
        if (imageCapture1.c_()) {
            Boolean bool = (Boolean) getvaluefromnanos.read(getValueFromNanos.RemoteActionCompatParcelizer, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (!bool.booleanValue()) {
                if (imageCapture1.c_() || (!SurfaceProcessingQuirk.write(accesswaitForCompositionAfterTargetStateChange.read) && !SurfaceProcessingQuirk.write(imageCapture1.MediaMetadataCompat().serializer()))) {
                    HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(HdrRepeatingRequestFailureQuirk.class);
                    if (!imageCapture1.c_() && hdrRepeatingRequestFailureQuirk != null) {
                        boolean z = getnavigationicon != getNavigationIcon.MediaDescriptionCompat;
                        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) || !"pa3q".equalsIgnoreCase(Build.DEVICE) || !z) {
                            if (size.getWidth() == rect.width()) {
                                if (!imageCapture1.c_()) {
                                }
                                ComponentActivity();
                                return false;
                            }
                        }
                    } else if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                        if (!imageCapture1.c_() && write(imageCapture1)) {
                            return true;
                        }
                        ComponentActivity();
                        return false;
                    }
                }
            }
        } else if (imageCapture1.c_()) {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk2 = (HdrRepeatingRequestFailureQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(HdrRepeatingRequestFailureQuirk.class);
            if (!imageCapture1.c_()) {
                if (size.getWidth() == rect.width()) {
                    if (!imageCapture1.c_()) {
                    }
                    ComponentActivity();
                    return false;
                }
            } else if (size.getWidth() == rect.width()) {
                if (!imageCapture1.c_()) {
                }
                ComponentActivity();
                return false;
            }
        } else {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk3 = (HdrRepeatingRequestFailureQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(HdrRepeatingRequestFailureQuirk.class);
            if (!imageCapture1.c_()) {
                if (size.getWidth() == rect.width()) {
                    if (!imageCapture1.c_()) {
                    }
                    ComponentActivity();
                    return false;
                }
            } else if (size.getWidth() == rect.width()) {
                if (!imageCapture1.c_()) {
                }
                ComponentActivity();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02d0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final UseCaseAdditionSimulator read(final getValueFromNanos getvaluefromnanos, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        Object obj;
        setInitialAnimationsanimation_core setinitialanimationsanimation_core;
        getNavigationIcon getnavigationicon;
        int i;
        int i2;
        Rect rect;
        NavArgsLazy navArgsLazy;
        PreviewGreenTintQuirk previewGreenTintQuirkParcelableVolumeInfo;
        boolean z;
        String str;
        Set hashSet;
        PrematureEndOfStreamVideoQuirk.write();
        final ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        imageCapture1RatingCompat.getClass();
        Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(24, this);
        Range range = smallDisplaySizeQuirk.IconCompatParcelizer;
        if (Objects.equals(range, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer)) {
            if (smallDisplaySizeQuirk.MediaDescriptionCompat == 1) {
                range = EnterExitTransitionKtslideOutHorizontally2.write;
            } else {
                range = EnterExitTransitionKtslideOutHorizontally2.IconCompatParcelizer;
            }
        }
        Range range2 = range;
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = MediaSessionCompatQueueItem().serializer().RemoteActionCompatParcelizer();
        if (drawModifierNodeKtRemoteActionCompatParcelizer.isDone()) {
            try {
                obj = drawModifierNodeKtRemoteActionCompatParcelizer.get();
            } catch (InterruptedException | ExecutionException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                return null;
            }
        } else {
            obj = null;
        }
        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1 = (AnimatedContentTransitionScopeImplSizeModifierNodemeasure1) obj;
        Objects.requireNonNull(animatedContentTransitionScopeImplSizeModifierNodemeasure1);
        int i3 = smallDisplaySizeQuirk.MediaDescriptionCompat;
        EnterExitTransitionKtexpandVertically2 enterExitTransitionKtexpandVertically2Write = MediaSessionCompatQueueItem().write(imageCapture1RatingCompat.ResultReceiver(), i3);
        getNavigationIcon getnavigationicon2 = smallDisplaySizeQuirk.read;
        InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer = enterExitTransitionKtexpandVertically2Write.IconCompatParcelizer(size, getnavigationicon2);
        Objects.requireNonNull((updateInitialValuesanimation_core) getvaluefromnanos.write(getValueFromNanos.read));
        setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer = serializer(getnavigationicon2, animatedContentTransitionScopeImplSizeModifierNodemeasure1, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer);
        this.MediaBrowserCompatMediaItem = read(imageCapture1RatingCompat);
        Rect rect2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (setinitialanimationsanimation_coreSerializer != null) {
            if (setinitialanimationsanimation_coreSerializer.IconCompatParcelizer(rect2.width(), rect2.height())) {
                setinitialanimationsanimation_core = setinitialanimationsanimation_coreSerializer;
                getnavigationicon = getnavigationicon2;
            } else {
                getnavigationicon = getnavigationicon2;
                String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", MediaStoreVideoCannotWrite.read(rect2), Integer.valueOf(setinitialanimationsanimation_coreSerializer.MediaSessionCompatQueueItem()), Integer.valueOf(setinitialanimationsanimation_coreSerializer.RemoteActionCompatParcelizer()), setinitialanimationsanimation_coreSerializer.write(), setinitialanimationsanimation_coreSerializer.read());
                setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                setInitialAnimationsanimation_core resetanimationfractionanimation_core = (!(setinitialanimationsanimation_coreSerializer.write().contains(Integer.valueOf(rect2.width())) && setinitialanimationsanimation_coreSerializer.read().contains(Integer.valueOf(rect2.height()))) && setinitialanimationsanimation_coreSerializer.IconCompatParcelizer() && setinitialanimationsanimation_coreSerializer.read().contains(Integer.valueOf(rect2.width())) && setinitialanimationsanimation_coreSerializer.write().contains(Integer.valueOf(rect2.height()))) ? new resetAnimationFractionanimation_core(setinitialanimationsanimation_coreSerializer) : setinitialanimationsanimation_coreSerializer;
                int iMediaSessionCompatQueueItem = resetanimationfractionanimation_core.MediaSessionCompatQueueItem();
                int iRemoteActionCompatParcelizer = resetanimationfractionanimation_core.RemoteActionCompatParcelizer();
                Range rangeWrite = resetanimationfractionanimation_core.write();
                Range range3 = resetanimationfractionanimation_core.read();
                setinitialanimationsanimation_core = setinitialanimationsanimation_coreSerializer;
                int i4 = read(true, rect2.width(), iMediaSessionCompatQueueItem, rangeWrite);
                int i5 = read(false, rect2.width(), iMediaSessionCompatQueueItem, rangeWrite);
                int i6 = read(true, rect2.height(), iRemoteActionCompatParcelizer, range3);
                int i7 = read(false, rect2.height(), iRemoteActionCompatParcelizer, range3);
                HashSet hashSet2 = new HashSet();
                RemoteActionCompatParcelizer(hashSet2, i4, i6, size, resetanimationfractionanimation_core);
                RemoteActionCompatParcelizer(hashSet2, i4, i7, size, resetanimationfractionanimation_core);
                RemoteActionCompatParcelizer(hashSet2, i5, i6, size, resetanimationfractionanimation_core);
                RemoteActionCompatParcelizer(hashSet2, i5, i7, size, resetanimationfractionanimation_core);
                if (hashSet2.isEmpty()) {
                    setInflatedId.read("VideoCapture", "Can't find valid cropped size");
                } else {
                    ArrayList arrayList = new ArrayList(hashSet2);
                    arrayList.toString();
                    setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                    Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda5(0, rect2));
                    arrayList.toString();
                    setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                    Size size2 = (Size) arrayList.get(0);
                    int width = size2.getWidth();
                    int height = size2.getHeight();
                    if (width == rect2.width() && height == rect2.height()) {
                        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                    } else {
                        UtilsKt.RemoteActionCompatParcelizer((String) null, width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
                        Rect rect3 = new Rect(rect2);
                        if (width != rect2.width()) {
                            int iMax = Math.max(0, rect2.centerX() - (width / 2));
                            rect3.left = iMax;
                            int i8 = iMax + width;
                            rect3.right = i8;
                            if (i8 > size.getWidth()) {
                                int width2 = size.getWidth();
                                rect3.right = width2;
                                rect3.left = width2 - width;
                            }
                        }
                        if (height != rect2.height()) {
                            i2 = 0;
                            int iMax2 = Math.max(0, rect2.centerY() - (height / 2));
                            rect3.top = iMax2;
                            int i9 = iMax2 + height;
                            rect3.bottom = i9;
                            if (i9 > size.getHeight()) {
                                int height2 = size.getHeight();
                                rect3.bottom = height2;
                                rect3.top = height2 - height;
                            }
                        } else {
                            i2 = 0;
                        }
                        MediaStoreVideoCannotWrite.read(rect2);
                        MediaStoreVideoCannotWrite.read(rect3);
                        i = 3;
                        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
                        rect2 = rect3;
                    }
                }
            }
            i = 3;
            i2 = 0;
        } else {
            setinitialanimationsanimation_core = setinitialanimationsanimation_coreSerializer;
            getnavigationicon = getnavigationicon2;
            i = 3;
            i2 = 0;
        }
        ComponentActivity();
        this.read = rect2;
        ComponentActivity();
        ComponentActivity();
        Rect rect4 = this.read;
        int i10 = this.MediaBrowserCompatMediaItem;
        int i11 = i;
        int i12 = i2;
        getNavigationIcon getnavigationicon3 = getnavigationicon;
        boolean zWrite = write(imageCapture1RatingCompat, getvaluefromnanos, i3, rect4, size, getnavigationicon3);
        if (((SizeCannotEncodeVideoQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(SizeCannotEncodeVideoQuirk.class)) == null) {
            rect = rect4;
        } else {
            Size size3 = MediaStoreVideoCannotWrite.read(MediaStoreVideoCannotWrite.write(rect4), zWrite ? i10 : i12);
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                hashSet = new HashSet(Collections.singletonList(new Size(720, 1280)));
            } else {
                hashSet = Collections.EMPTY_SET;
            }
            if (hashSet.contains(size3)) {
                int iRemoteActionCompatParcelizer2 = setinitialanimationsanimation_core != null ? setinitialanimationsanimation_core.RemoteActionCompatParcelizer() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == size3.getHeight()) {
                    rect5.left += iRemoteActionCompatParcelizer2;
                    rect5.right -= iRemoteActionCompatParcelizer2;
                } else {
                    rect5.top += iRemoteActionCompatParcelizer2;
                    rect5.bottom -= iRemoteActionCompatParcelizer2;
                }
                rect = rect5;
            } else {
                rect = rect4;
            }
        }
        this.read = rect;
        if (write(imageCapture1RatingCompat, getvaluefromnanos, i3, rect, size, getnavigationicon3)) {
            setInflatedId.IconCompatParcelizer(i11, "VideoCapture");
            ImageCapture1 imageCapture1RatingCompat2 = RatingCompat();
            Objects.requireNonNull(imageCapture1RatingCompat2);
            navArgsLazy = new NavArgsLazy(imageCapture1RatingCompat2, new PreviewView1ExternalSyntheticLambda2(getnavigationicon3));
        } else {
            navArgsLazy = null;
        }
        this.MediaSessionCompatQueueItem = navArgsLazy;
        boolean z2 = (imageCapture1RatingCompat.c_() && this.MediaSessionCompatQueueItem == null) ? i12 : 1;
        if (this.MediaSessionCompatQueueItem == null && imageCapture1RatingCompat.c_()) {
            previewGreenTintQuirkParcelableVolumeInfo = PreviewGreenTintQuirk.UPTIME;
        } else {
            previewGreenTintQuirkParcelableVolumeInfo = imageCapture1RatingCompat.MediaMetadataCompat().ParcelableVolumeInfo();
        }
        final PreviewGreenTintQuirk previewGreenTintQuirk = previewGreenTintQuirkParcelableVolumeInfo;
        Objects.toString(imageCapture1RatingCompat.MediaMetadataCompat().ParcelableVolumeInfo());
        Objects.toString(previewGreenTintQuirk);
        setInflatedId.IconCompatParcelizer(i11, "VideoCapture");
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = smallDisplaySizeQuirk.read();
        if (size != null) {
            repeatingStreamConstraintForVideoRecordingQuirk.serializer = size;
            if (range2 != null) {
                repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = range2;
                SmallDisplaySizeQuirk smallDisplaySizeQuirk2 = repeatingStreamConstraintForVideoRecordingQuirk.read();
                if (this.IconCompatParcelizer == null) {
                    str = null;
                    z = 1;
                } else {
                    z = i12;
                    str = null;
                }
                UtilsKt.RemoteActionCompatParcelizer(str, z);
                setBrightness setbrightness = new setBrightness(2, 34, smallDisplaySizeQuirk2, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, imageCapture1RatingCompat.c_(), this.read, this.MediaBrowserCompatMediaItem, MediaMetadataCompat(), (imageCapture1RatingCompat.c_() && write(imageCapture1RatingCompat)) ? 1 : i12);
                this.IconCompatParcelizer = setbrightness;
                setbrightness.read(preview$$ExternalSyntheticLambda0);
                NavArgsLazy navArgsLazy2 = this.MediaSessionCompatQueueItem;
                setBrightness setbrightness2 = this.IconCompatParcelizer;
                if (navArgsLazy2 != null) {
                    int i13 = setbrightness2.PlaybackStateCompatCustomAction;
                    int i14 = setbrightness2.read;
                    Rect rect6 = setbrightness2.write;
                    setMaxCardElevation setmaxcardelevation = new setMaxCardElevation(UUID.randomUUID(), i13, i14, rect6, MediaStoreVideoCannotWrite.read(MediaStoreVideoCannotWrite.write(rect6), setbrightness2.MediaDescriptionCompat), setbrightness2.MediaDescriptionCompat, setbrightness2.MediaMetadataCompat);
                    final setBrightness setbrightness3 = (setBrightness) this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new setScreenFlashWindow(this.IconCompatParcelizer, Collections.singletonList(setmaxcardelevation))).get(setmaxcardelevation);
                    Objects.requireNonNull(setbrightness3);
                    final boolean z3 = z2;
                    setbrightness3.read(new Runnable() { // from class: o.EnterExitTransitionModifierNode
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.VideoCapture videoCapture = this.serializer;
                            ImageCapture1 imageCapture1RatingCompat3 = videoCapture.RatingCompat();
                            ImageCapture1 imageCapture1 = imageCapture1RatingCompat;
                            if (imageCapture1 == imageCapture1RatingCompat3) {
                                videoCapture.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = setbrightness3.RemoteActionCompatParcelizer(imageCapture1, true);
                                CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) getvaluefromnanos.write(getValueFromNanos.write);
                                Objects.requireNonNull(cubicBezierEasing);
                                cubicBezierEasing.serializer(videoCapture.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, previewGreenTintQuirk, z3);
                                videoCapture.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            }
                        }
                    });
                    this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = setbrightness3.RemoteActionCompatParcelizer(imageCapture1RatingCompat, true);
                    setBrightness setbrightness4 = this.IconCompatParcelizer;
                    setbrightness4.getClass();
                    PrematureEndOfStreamVideoQuirk.write();
                    setbrightness4.write();
                    UtilsKt.RemoteActionCompatParcelizer("Consumer can only be linked once.", !setbrightness4.IconCompatParcelizer);
                    setbrightness4.IconCompatParcelizer = true;
                    SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = setbrightness4.MediaSessionCompatToken;
                    this.serializer = surfaceViewStretchedQuirk;
                    VideoQualityQuirk.write((DrawModifierNodeKt) surfaceViewStretchedQuirk.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new Crossfade(this, 14, surfaceViewStretchedQuirk), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
                } else {
                    SurfaceRequest surfaceRequestRemoteActionCompatParcelizer = setbrightness2.RemoteActionCompatParcelizer(imageCapture1RatingCompat, true);
                    this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = surfaceRequestRemoteActionCompatParcelizer;
                    this.serializer = surfaceRequestRemoteActionCompatParcelizer.write;
                }
                CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) getvaluefromnanos.write(getValueFromNanos.write);
                Objects.requireNonNull(cubicBezierEasing);
                cubicBezierEasing.serializer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, previewGreenTintQuirk, z2);
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                this.serializer.MediaDescriptionCompat = MediaCodec.class;
                UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer(getvaluefromnanos, smallDisplaySizeQuirk.MediaMetadataCompat);
                useCaseAdditionSimulatorIconCompatParcelizer.MediaSessionCompatQueueItem = i3;
                serializer(useCaseAdditionSimulatorIconCompatParcelizer, smallDisplaySizeQuirk);
                int iMediaSessionCompatQueueItem2 = getvaluefromnanos.MediaSessionCompatQueueItem();
                if (iMediaSessionCompatQueueItem2 != 0) {
                    abandonFocus abandonfocus = useCaseAdditionSimulatorIconCompatParcelizer.serializer;
                    abandonfocus.getClass();
                    if (iMediaSessionCompatQueueItem2 != 0) {
                        ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, Integer.valueOf(iMediaSessionCompatQueueItem2));
                    }
                }
                InterruptedRuntimeException interruptedRuntimeException = this.write;
                if (interruptedRuntimeException != null) {
                    interruptedRuntimeException.write();
                }
                InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new BiometricFragmentExternalSyntheticLambda1(4, this));
                this.write = interruptedRuntimeException2;
                useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
                InitializationException initializationException = smallDisplaySizeQuirk.serializer;
                if (initializationException != null) {
                    useCaseAdditionSimulatorIconCompatParcelizer.serializer.RemoteActionCompatParcelizer(initializationException);
                }
                return useCaseAdditionSimulatorIconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null expectedFrameRateRange");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null resolution");
        return null;
    }

    public final String toString() {
        return "VideoCapture:".concat(MediaSessionCompatToken());
    }

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        if (RatingCompat() == null) {
            return;
        }
        read();
        getValueFromNanos getvaluefromnanos = (getValueFromNanos) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatToken;
        smallDisplaySizeQuirk.getClass();
        UseCaseAdditionSimulator useCaseAdditionSimulator = read(getvaluefromnanos, smallDisplaySizeQuirk);
        this.MediaMetadataCompat = useCaseAdditionSimulator;
        IconCompatParcelizer(useCaseAdditionSimulator, this.ParcelableVolumeInfo, this.MediaSessionCompatToken);
        Object[] objArr = {this.MediaMetadataCompat.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        ParcelableVolumeInfo();
    }

    public final void IconCompatParcelizer(UseCaseAdditionSimulator useCaseAdditionSimulator, AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0;
        int i = 1;
        boolean z = animatedEnterExitMeasurePolicymeasure1.serializer == -1;
        boolean z2 = animatedEnterExitMeasurePolicymeasure1.write == EnterExitTransitionKtexpandIn1.ACTIVE;
        if (z && z2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected stream state, stream is error but active");
            return;
        }
        useCaseAdditionSimulator.write.clear();
        ((HashSet) useCaseAdditionSimulator.serializer.MediaSessionCompatQueueItem).clear();
        getNavigationIcon getnavigationicon = smallDisplaySizeQuirk.read;
        if (!z && (previewExternalSyntheticLambda0 = this.serializer) != null) {
            if (z2) {
                useCaseAdditionSimulator.serializer(previewExternalSyntheticLambda0, getnavigationicon, -1);
            } else {
                PreviewStretchWhenVideoCaptureIsBoundQuirk previewStretchWhenVideoCaptureIsBoundQuirk = Preview3AThreadCrashQuirk.read(previewExternalSyntheticLambda0);
                if (getnavigationicon == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null dynamicRange");
                    return;
                } else {
                    previewStretchWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer = getnavigationicon;
                    useCaseAdditionSimulator.write.add(previewStretchWhenVideoCaptureIsBoundQuirk.serializer());
                }
            }
        }
        onDrawBehind ondrawbehind = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (ondrawbehind != null && ondrawbehind.cancel(false)) {
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        }
        onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(this, 11, useCaseAdditionSimulator));
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = ondrawbehindRemoteActionCompatParcelizer;
        ondrawbehindRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new zza(ondrawbehindRemoteActionCompatParcelizer, i, new ut(this, ondrawbehindRemoteActionCompatParcelizer, z2)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
    }

    public static int read(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }
}
