package o;

import android.net.Uri;
import android.util.Range;
import android.view.Surface;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.internal.zzm;
import com.google.re2j.Machine$Queue;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityKtAnimatedVisibilityImpl11 implements CubicBezierEasing {
    public static final AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 IconCompatParcelizer;
    public static final int MediaDescriptionCompat;
    public static final AnimatedEnterExitMeasurePolicy MediaSessionCompatQueueItem;
    public static final long RatingCompat;
    public static final getTrackDrawable RemoteActionCompatParcelizer;
    public static final accessgetGreencp read;
    public static final getTrackDrawable serializer;
    public boolean ComponentActivity;
    public Surface MediaMetadataCompat;
    public final ArrayList MediaSessionCompatResultReceiverWrapper;
    public EnterExitTransitionKtexpandHorizontally2 MediaSessionCompatToken;
    public final Executor ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final boolean PlaybackStateCompatCustomAction;
    public final Object ResultReceiver = new Object();
    public androidx.camera.video.internal.encoder.EncoderImpl _init_lambda1;
    public int _init_lambda2;
    public final getTrackDrawable _init_lambda3;
    public final zzm _init_lambda4;
    public final zzm accessensureViewModelStore;
    public r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg addObserverForBackInvokerlambda0;
    public r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg defaultViewModelProviderFactory_delegatelambda0;
    public PreviewGreenTintQuirk ensureViewModelStore;
    public final zzm r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Surface r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public androidx.camera.core.SurfaceRequest r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final zzm r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public animate r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final Machine$Queue r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public EnterExitTransitionKtshrinkHorizontally2 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public InfiniteTransitionrun113 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public ScheduledFuture r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public EnterExitTransitionKtshrinkVertically2 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public EnterExitTransitionKtshrinkHorizontally2 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final Set write = Collections.unmodifiableSet(EnumSet.of(EnterExitTransitionKtshrinkHorizontally2.PENDING_RECORDING, EnterExitTransitionKtshrinkHorizontally2.PENDING_PAUSED));
    public static final Set MediaBrowserCompatMediaItem = Collections.unmodifiableSet(EnumSet.of(EnterExitTransitionKtshrinkHorizontally2.CONFIGURING, EnterExitTransitionKtshrinkHorizontally2.IDLING, EnterExitTransitionKtshrinkHorizontally2.RESETTING, EnterExitTransitionKtshrinkHorizontally2.STOPPING, EnterExitTransitionKtshrinkHorizontally2.ERROR));

    @Override // o.CubicBezierEasing
    public final DeferrableSurfaceSurfaceUnavailableException RemoteActionCompatParcelizer() {
        return this.accessensureViewModelStore;
    }

    @Override // o.CubicBezierEasing
    public final DeferrableSurfaceSurfaceUnavailableException read() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // o.CubicBezierEasing
    public final DeferrableSurfaceSurfaceUnavailableException serializer() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public static void IconCompatParcelizer(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        if (encoderImpl != null) {
            setInflatedId.IconCompatParcelizer(3, encoderImpl._init_lambda1);
            encoderImpl.RatingCompat.execute(new CrossfadeKt(encoderImpl, 4));
        }
    }

    public static EnterExitTransitionKtexpandIn1 read(EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally2) {
        return (enterExitTransitionKtshrinkHorizontally2 == EnterExitTransitionKtshrinkHorizontally2.RECORDING || (enterExitTransitionKtshrinkHorizontally2 == EnterExitTransitionKtshrinkHorizontally2.STOPPING && ((androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? EnterExitTransitionKtexpandIn1.ACTIVE : EnterExitTransitionKtexpandIn1.INACTIVE;
    }

    public final void read(int i, IOException iOException) {
        boolean z;
        synchronized (this.ResultReceiver) {
            int iOrdinal = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal();
            if (iOrdinal == 0 || iOrdinal == 8 || iOrdinal == 3) {
                throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            }
            if (iOrdinal == 4 || iOrdinal == 5) {
                IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.STOPPING);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            serializer(i, iOException);
        }
    }

    @Override // o.CubicBezierEasing
    public final void serializer(androidx.camera.core.SurfaceRequest surfaceRequest, PreviewGreenTintQuirk previewGreenTintQuirk, boolean z) {
        synchronized (this.ResultReceiver) {
            Objects.toString(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == EnterExitTransitionKtshrinkHorizontally2.ERROR) {
                IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.CONFIGURING);
            }
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.execute(new CrossfadeKtCrossfade51(this, surfaceRequest, previewGreenTintQuirk, z));
    }

    public final void serializer(EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally2) {
        if (!write.contains(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        if (!MediaBrowserCompatMediaItem.contains(enterExitTransitionKtshrinkHorizontally2)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + enterExitTransitionKtshrinkHorizontally2);
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != enterExitTransitionKtshrinkHorizontally2) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = enterExitTransitionKtshrinkHorizontally2;
            int i = this._init_lambda2;
            EnterExitTransitionKtexpandIn1 enterExitTransitionKtexpandIn1 = read(enterExitTransitionKtshrinkHorizontally2);
            AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
            this.accessensureViewModelStore.read(new AnimatedEnterExitMeasurePolicymeasure1(i, enterExitTransitionKtexpandIn1));
        }
    }

    public final void write() {
        boolean z;
        boolean z2;
        synchronized (this.ResultReceiver) {
            switch (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                case 1:
                case 2:
                    serializer(EnterExitTransitionKtshrinkHorizontally2.RESETTING);
                case 0:
                case 3:
                case 8:
                    z = true;
                    z2 = false;
                    break;
                case 4:
                case 5:
                    coil3.util.UtilsKt.RemoteActionCompatParcelizer("In-progress recording shouldn't be null when in state " + this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, false);
                    IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.RESETTING);
                    z2 = true;
                    z = false;
                    break;
                case 6:
                    IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.RESETTING);
                    z = false;
                    z2 = false;
                    break;
                case 7:
                default:
                    z = false;
                    z2 = false;
                    break;
            }
        }
        if (!z) {
            if (z2) {
                serializer(4, null);
                return;
            }
            return;
        }
        EnterExitTransitionKtexpandHorizontally2 enterExitTransitionKtexpandHorizontally2 = EnterExitTransitionKtexpandHorizontally2.INITIALIZING;
        Objects.toString(this.MediaSessionCompatToken);
        Objects.toString(enterExitTransitionKtexpandHorizontally2);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        this.MediaSessionCompatToken = enterExitTransitionKtexpandHorizontally2;
        if (this._init_lambda1 != null) {
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = this.addObserverForBackInvokerlambda0;
            if (r8lambdauosl1ojcz1lncaiooglfrbn5pcg != null) {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, ((androidx.camera.video.internal.encoder.EncoderImpl) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer) == this._init_lambda1);
                Objects.toString(this._init_lambda1);
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                this.addObserverForBackInvokerlambda0.MediaDescriptionCompat();
                this.addObserverForBackInvokerlambda0 = null;
                this._init_lambda1 = null;
                IconCompatParcelizer((Surface) null);
            } else {
                Objects.toString(this._init_lambda1);
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg2 = this.defaultViewModelProviderFactory_delegatelambda0;
                r8lambdauosl1ojcz1lncaiooglfrbn5pcg2.serializer();
                VideoQualityQuirk.write((DrawModifierNodeKt) r8lambdauosl1ojcz1lncaiooglfrbn5pcg2.MediaSessionCompatToken);
            }
        }
        synchronized (this.ResultReceiver) {
            switch (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                case 1:
                case 2:
                    serializer(EnterExitTransitionKtshrinkHorizontally2.CONFIGURING);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.CONFIGURING);
                    break;
            }
        }
        androidx.camera.core.SurfaceRequest surfaceRequest = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (surfaceRequest == null || surfaceRequest.write()) {
            return;
        }
        write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.ensureViewModelStore, false);
    }

    @Override // o.CubicBezierEasing
    public final void RemoteActionCompatParcelizer(InfiniteTransitionrun113 infiniteTransitionrun113) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.execute(new Crossfade(this, 0, infiniteTransitionrun113));
    }

    public static Object write(zzm zzmVar) {
        try {
            return zzmVar.RemoteActionCompatParcelizer().get();
        } catch (InterruptedException | ExecutionException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public final void IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally2) {
        EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally3 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (enterExitTransitionKtshrinkHorizontally3 == enterExitTransitionKtshrinkHorizontally2) {
            throw new AssertionError("Attempted to transition to state " + enterExitTransitionKtshrinkHorizontally2 + ", but Recorder is already in state " + enterExitTransitionKtshrinkHorizontally2);
        }
        Objects.toString(enterExitTransitionKtshrinkHorizontally3);
        Objects.toString(enterExitTransitionKtshrinkHorizontally2);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        Set set = write;
        EnterExitTransitionKtexpandIn1 enterExitTransitionKtexpandIn1 = null;
        if (set.contains(enterExitTransitionKtshrinkHorizontally2)) {
            if (!set.contains(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0)) {
                boolean zContains = MediaBrowserCompatMediaItem.contains(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally4 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (!zContains) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + enterExitTransitionKtshrinkHorizontally4);
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = enterExitTransitionKtshrinkHorizontally4;
                enterExitTransitionKtexpandIn1 = read(enterExitTransitionKtshrinkHorizontally4);
            }
        } else if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = enterExitTransitionKtshrinkHorizontally2;
        if (enterExitTransitionKtexpandIn1 == null) {
            enterExitTransitionKtexpandIn1 = read(enterExitTransitionKtshrinkHorizontally2);
        }
        int i = this._init_lambda2;
        AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
        this.accessensureViewModelStore.read(new AnimatedEnterExitMeasurePolicymeasure1(i, enterExitTransitionKtexpandIn1));
    }

    static {
        accessgetGreencp accessgetgreencp = AnimatedEnterExitMeasurePolicy.serializer;
        read = accessgetgreencp;
        AnimatedEnterExitImpl animatedEnterExitImplRemoteActionCompatParcelizer = AnimatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer();
        if (accessgetgreencp != null) {
            animatedEnterExitImplRemoteActionCompatParcelizer.serializer = accessgetgreencp;
            animatedEnterExitImplRemoteActionCompatParcelizer.write = -1;
            AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicyWrite = animatedEnterExitImplRemoteActionCompatParcelizer.write();
            MediaSessionCompatQueueItem = animatedEnterExitMeasurePolicyWrite;
            AnimatedContentMeasurePolicymeasure3 animatedContentMeasurePolicymeasure3Write = AnimatedContentMeasurePolicymeasure3.read().write();
            AnimatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer().write();
            IconCompatParcelizer = new AnimatedContentTransitionScopeImplSizeModifierNodemeasure1(animatedEnterExitMeasurePolicyWrite, animatedContentMeasurePolicymeasure3Write, -1);
            new RuntimeException("The video frame producer became inactive before any data was received.");
            RemoteActionCompatParcelizer = new getTrackDrawable(28);
            serializer = new getTrackDrawable(29);
            new PreviewFreezeAfterHighSpeedRecordingQuirk(removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.RemoteActionCompatParcelizer());
            MediaDescriptionCompat = 3;
            RatingCompat = 1000L;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null qualitySelector");
    }

    public final void IconCompatParcelizer(Surface surface) {
        int iHashCode;
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == surface) {
            return;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = surface;
        synchronized (this.ResultReceiver) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            RemoteActionCompatParcelizer(iHashCode);
        }
    }

    public final void serializer(int i, IOException iOException) {
        if (this.ComponentActivity) {
            return;
        }
        this.ComponentActivity = true;
        if (this.MediaSessionCompatToken != EnterExitTransitionKtexpandHorizontally2.ENABLED) {
            animate animateVar = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (animateVar != null) {
                animateVar.close();
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            }
            InfiniteTransitionrun113 infiniteTransitionrun113 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            InfiniteTransitionrun113 infiniteTransitionrun114 = InfiniteTransitionrun113.ACTIVE_NON_STREAMING;
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = this._init_lambda1;
            if (infiniteTransitionrun113 != infiniteTransitionrun114) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().schedule(new Crossfade(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 13, new CrossfadeKt(encoderImpl, 0)), 1000L, TimeUnit.MILLISECONDS);
            } else {
                IconCompatParcelizer(encoderImpl);
            }
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = this._init_lambda1;
            encoderImpl2.RatingCompat.execute(new calculateTotalDurationNanos(encoderImpl2, encoderImpl2._init_lambda3.MediaSessionCompatQueueItem(), 2));
            return;
        }
        while (true) {
            Machine$Queue machine$Queue = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (machine$Queue.serializer()) {
                throw null;
            }
            machine$Queue.RemoteActionCompatParcelizer();
        }
    }

    public AnimatedVisibilityKtAnimatedVisibilityImpl11(AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1, getTrackDrawable gettrackdrawable, getTrackDrawable gettrackdrawable2, getTrackDrawable gettrackdrawable3) {
        this.PlaybackStateCompatCustomAction = accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this._init_lambda4 = new zzm(null);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = EnterExitTransitionKtshrinkHorizontally2.CONFIGURING;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        this._init_lambda2 = 0;
        this.ComponentActivity = false;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        this.MediaSessionCompatResultReceiverWrapper = new ArrayList();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.MediaMetadataCompat = null;
        this._init_lambda1 = null;
        this.MediaSessionCompatToken = EnterExitTransitionKtexpandHorizontally2.INITIALIZING;
        Uri uri = Uri.EMPTY;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Machine$Queue(60, (getTrackDrawable) null);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = InfiniteTransitionrun113.INACTIVE;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = null;
        this.addObserverForBackInvokerlambda0 = null;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = null;
        this.PlaybackStateCompat = false;
        minHeight minheightRemoteActionCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.RemoteActionCompatParcelizer();
        this.ParcelableVolumeInfo = minheightRemoteActionCompatParcelizer;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = new PreviewFreezeAfterHighSpeedRecordingQuirk(minheightRemoteActionCompatParcelizer);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = previewFreezeAfterHighSpeedRecordingQuirk;
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = animatedContentTransitionScopeImplSizeModifierNodemeasure1.IconCompatParcelizer;
        AnimatedContentMeasurePolicymeasure3 animatedContentMeasurePolicymeasure3 = animatedContentTransitionScopeImplSizeModifierNodemeasure1.RemoteActionCompatParcelizer;
        int i = animatedContentTransitionScopeImplSizeModifierNodemeasure1.serializer;
        if (animatedEnterExitMeasurePolicy.IconCompatParcelizer == -1) {
            if (animatedEnterExitMeasurePolicy != null) {
                accessgetGreencp accessgetgreencp = animatedEnterExitMeasurePolicy.RatingCompat;
                int i2 = animatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer;
                Range range = animatedEnterExitMeasurePolicy.read;
                int i3 = MediaSessionCompatQueueItem.IconCompatParcelizer;
                String strConcat = accessgetgreencp == null ? " qualitySelector" : "";
                strConcat = range == null ? strConcat.concat(" bitrate") : strConcat;
                if (strConcat.isEmpty()) {
                    animatedEnterExitMeasurePolicy = new AnimatedEnterExitMeasurePolicy(accessgetgreencp, i2, range, i3);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    throw null;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"videoSpec\" has not been set");
                throw null;
            }
        }
        String str = animatedEnterExitMeasurePolicy == null ? " videoSpec" : "";
        if (str.isEmpty()) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new zzm(new AnimatedContentTransitionScopeImplSizeModifierNodemeasure1(animatedEnterExitMeasurePolicy, animatedContentMeasurePolicymeasure3, i));
            int i4 = this._init_lambda2;
            EnterExitTransitionKtexpandIn1 enterExitTransitionKtexpandIn1 = read(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
            this.accessensureViewModelStore = new zzm(new AnimatedEnterExitMeasurePolicymeasure1(i4, enterExitTransitionKtexpandIn1));
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new zzm(Boolean.FALSE);
            this._init_lambda3 = gettrackdrawable;
            this.defaultViewModelProviderFactory_delegatelambda0 = new r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg(gettrackdrawable, previewFreezeAfterHighSpeedRecordingQuirk, minheightRemoteActionCompatParcelizer);
            String[] strArr = {"B", "KB", "MB", "GB", "TB"};
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            double d = 5.24288E7d;
            double d2 = 5.24288E7d;
            int i5 = 0;
            while (d2 >= 1024.0d && i5 < 4) {
                d2 /= 1024.0d;
                i5++;
            }
            if (i5 == 0) {
                decimalFormat.format(d2);
                String str2 = strArr[i5];
            } else {
                StringBuilder sb = new StringBuilder();
                while (-1 < i5) {
                    double dPow = Math.pow(1024.0d, i5);
                    double dFloor = Math.floor(d / dPow);
                    if (dFloor > 0.0d) {
                        sb.append(decimalFormat.format(dFloor));
                        sb.append(" ");
                        sb.append(strArr[i5]);
                        sb.append(" ");
                        d -= dFloor * dPow;
                    }
                    i5--;
                }
                hideCurrentlyDisplayingInAppMessage.read(sb).toString();
            }
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str));
        throw null;
    }

    @Override // o.CubicBezierEasing
    public final EnterExitTransitionKtexpandVertically2 write(FocusMeteringAction focusMeteringAction, int i) {
        return new EnterExitTransitionKtslideInVertically2(focusMeteringAction, i == 1 ? 2 : 1);
    }

    public final void write(androidx.camera.core.SurfaceRequest surfaceRequest, PreviewGreenTintQuirk previewGreenTintQuirk, boolean z) {
        Object value;
        AnimatedVisibilityKt animatedVisibilityKt;
        if (surfaceRequest.write()) {
            setInflatedId.read("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        getTrackDrawable gettrackdrawable = new getTrackDrawable(27, this);
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        surfaceRequest.IconCompatParcelizer(previewFreezeAfterHighSpeedRecordingQuirk, gettrackdrawable);
        android.util.Size size = surfaceRequest.MediaSessionCompatQueueItem;
        getNavigationIcon getnavigationicon = surfaceRequest.IconCompatParcelizer;
        EnterExitTransitionKtslideInVertically2 enterExitTransitionKtslideInVertically2 = (EnterExitTransitionKtslideInVertically2) write(surfaceRequest.RemoteActionCompatParcelizer.ResultReceiver(), surfaceRequest.MediaSessionCompatToken);
        animateEnterExit animateenterexitRemoteActionCompatParcelizer = enterExitTransitionKtslideInVertically2.RemoteActionCompatParcelizer(getnavigationicon);
        if (animateenterexitRemoteActionCompatParcelizer == null) {
            animatedVisibilityKt = AnimatedVisibilityKt.write;
        } else {
            TreeMap treeMap = animateenterexitRemoteActionCompatParcelizer.IconCompatParcelizer;
            android.util.Size size2 = setController.MediaDescriptionCompat;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            animatedVisibilityKt = (AnimatedVisibilityKt) value;
            if (animatedVisibilityKt == null) {
                animatedVisibilityKt = AnimatedVisibilityKt.write;
            }
        }
        Objects.toString(animatedVisibilityKt);
        Objects.toString(size);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        if (animatedVisibilityKt != AnimatedVisibilityKt.write) {
            animateEnterExit animateenterexitRemoteActionCompatParcelizer2 = enterExitTransitionKtslideInVertically2.RemoteActionCompatParcelizer(getnavigationicon);
            InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer = animateenterexitRemoteActionCompatParcelizer2 == null ? null : animateenterexitRemoteActionCompatParcelizer2.IconCompatParcelizer(animatedVisibilityKt);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer;
            if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                return;
            }
        }
        Objects.toString(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (enterExitTransitionKtshrinkVertically2 != null && !enterExitTransitionKtshrinkVertically2.read) {
            enterExitTransitionKtshrinkVertically2.read = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) enterExitTransitionKtshrinkVertically2.IconCompatParcelizer;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                enterExitTransitionKtshrinkVertically2.IconCompatParcelizer = null;
            }
        }
        EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically3 = new EnterExitTransitionKtshrinkVertically2(this, surfaceRequest, previewGreenTintQuirk, this.PlaybackStateCompat, z ? MediaDescriptionCompat : 0);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = enterExitTransitionKtshrinkVertically3;
        Objects.toString(this._init_lambda1);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = this.defaultViewModelProviderFactory_delegatelambda0;
        r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer();
        VideoQualityQuirk.write((DrawModifierNodeKt) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken).RemoteActionCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(enterExitTransitionKtshrinkVertically3, surfaceRequest, previewGreenTintQuirk, 12), previewFreezeAfterHighSpeedRecordingQuirk);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (this._init_lambda2 == i) {
            return;
        }
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        this._init_lambda2 = i;
        EnterExitTransitionKtexpandIn1 enterExitTransitionKtexpandIn1 = read(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = AnimatedEnterExitMeasurePolicymeasure1.IconCompatParcelizer;
        this.accessensureViewModelStore.read(new AnimatedEnterExitMeasurePolicymeasure1(i, enterExitTransitionKtexpandIn1));
    }

    @Override // o.CubicBezierEasing
    public final void serializer(androidx.camera.core.SurfaceRequest surfaceRequest) {
        serializer(surfaceRequest, PreviewGreenTintQuirk.UPTIME, false);
    }
}
