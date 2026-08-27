package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.transition.Transition$1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.net.zza;
import io.socket.emitter.Emitter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.Crossfade;
import o.CrossfadeKt;
import o.DataStoreProviderc;
import o.DrawModifierNodeKt;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.PreviewGreenTintQuirk;
import o.SeekableTransitionState;
import o.SeekableTransitionStateseekTo3;
import o.SeekableTransitionStateseekTo31;
import o.SuspendAnimationKt;
import o.Transition;
import o.TransitionKtrememberTransitionlambda10inlinedonDispose1;
import o.VectorizedFloatDecaySpec;
import o.VideoQualityQuirk;
import o.accessgetGreencp;
import o.accesswaitForCompositionAfterTargetStateChange;
import o.animate;
import o.animateDecay;
import o.animateOneFrame;
import o.animateTo;
import o.brazelogdefault;
import o.clearInitialAnimationsanimation_core;
import o.colorResource;
import o.getHasInitialValueAnimations;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onFrameanimation_core;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setContentDrawScopeui;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final class EncoderImpl {
    public static final Range RemoteActionCompatParcelizer = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public final MediaCodec ComponentActivity;
    public final boolean IconCompatParcelizer;
    public final animateTo MediaBrowserCompatMediaItem;
    public final PreviewGreenTintQuirk MediaSessionCompatToken;
    public final Emitter PlaybackStateCompat;
    public final SuspendAnimationKt PlaybackStateCompatCustomAction;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk RatingCompat;
    public final String _init_lambda1;
    public final accessgetGreencp _init_lambda3;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final onDrawWithContent r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final MediaFormat r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ScheduledFuture r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final DrawModifierNodeKt r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public clearInitialAnimationsanimation_core r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final Rational serializer;
    public final Object ResultReceiver = new Object();
    public final ArrayDeque ParcelableVolumeInfo = new ArrayDeque();
    public final ArrayDeque write = new ArrayDeque();
    public final HashSet MediaSessionCompatResultReceiverWrapper = new HashSet();
    public final HashSet MediaMetadataCompat = new HashSet();
    public final ArrayDeque read = new ArrayDeque();
    public animateDecay MediaSessionCompatQueueItem = animateDecay.write;
    public Executor MediaDescriptionCompat = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read();
    public Range r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = RemoteActionCompatParcelizer;
    public long _init_lambda4 = 0;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
    public Long r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    public ScheduledFuture _init_lambda2 = null;
    public MediaCodecCallback r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;

    public final class MediaCodecCallback extends MediaCodec.Callback {
        public final boolean MediaDescriptionCompat;
        public final VectorizedFloatDecaySpec MediaSessionCompatResultReceiverWrapper;
        public boolean serializer;
        public boolean write = false;
        public boolean RemoteActionCompatParcelizer = false;
        public boolean IconCompatParcelizer = false;
        public long MediaSessionCompatQueueItem = 0;
        public long RatingCompat = 0;
        public boolean MediaMetadataCompat = false;
        public boolean read = false;
        public boolean MediaBrowserCompatMediaItem = false;

        public MediaCodecCallback() {
            this.MediaDescriptionCompat = true;
            boolean z = EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            this.serializer = z;
            if (z) {
                this.MediaSessionCompatResultReceiverWrapper = new VectorizedFloatDecaySpec(EncoderImpl.this._init_lambda3, EncoderImpl.this.MediaSessionCompatToken, (CameraUseInconsistentTimebaseQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.MediaSessionCompatResultReceiverWrapper = null;
            }
            if (((CodecStuckOnFlushQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(EncoderImpl.this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getString("mime"))) {
                return;
            }
            this.MediaDescriptionCompat = false;
        }

        public final void RemoteActionCompatParcelizer(animate animateVar, animateDecay animatedecay, Executor executor) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            encoderImpl.MediaMetadataCompat.add(animateVar);
            DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) animateVar.serializer);
            colorResource colorresource = new colorResource(this, 7, animateVar);
            drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtWrite, 1, colorresource), encoderImpl.RatingCompat);
            try {
                executor.execute(new Crossfade(animatedecay, 26, animateVar));
            } catch (RejectedExecutionException e) {
                setInflatedId.read(encoderImpl._init_lambda1, "Unable to post to the supplied executor.", e);
                animateVar.close();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            EncoderImpl.this.RatingCompat.execute(new Crossfade(this, 24, codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            EncoderImpl.this.RatingCompat.execute(new brazelogdefault(this, i, 3));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.RatingCompat.execute(new DataStoreProviderc(this, bufferInfo, mediaCodec, i));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            String str = encoderImpl._init_lambda1;
            Objects.toString(mediaFormat);
            SeekableTransitionState.RemoteActionCompatParcelizer(mediaFormat.getByteBuffer("csd-0"));
            if (mediaFormat.containsKey("csd-1")) {
                SeekableTransitionState.RemoteActionCompatParcelizer(mediaFormat.getByteBuffer("csd-1"));
            }
            if (mediaFormat.containsKey("csd-2")) {
                SeekableTransitionState.RemoteActionCompatParcelizer(mediaFormat.getByteBuffer("csd-2"));
            }
            setInflatedId.IconCompatParcelizer(3, str);
            encoderImpl.RatingCompat.execute(new Crossfade(this, 25, mediaFormat));
        }

        public final void read() {
            EncoderImpl encoderImpl;
            animateDecay animatedecay;
            Executor executor;
            setInflatedId.IconCompatParcelizer(3, EncoderImpl.this._init_lambda1);
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            ScheduledFuture scheduledFuture = EncoderImpl.this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                EncoderImpl.this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
            }
            synchronized (EncoderImpl.this.ResultReceiver) {
                encoderImpl = EncoderImpl.this;
                animatedecay = encoderImpl.MediaSessionCompatQueueItem;
                executor = encoderImpl.MediaDescriptionCompat;
            }
            encoderImpl.serializer(new WorkerKt$$ExternalSyntheticLambda2(this, executor, animatedecay, 17));
        }
    }

    public final void serializer(Runnable runnable) {
        String str = this._init_lambda1;
        setInflatedId.IconCompatParcelizer(3, str);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.MediaMetadataCompat;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(VideoQualityQuirk.write((DrawModifierNodeKt) ((animate) it.next()).serializer));
        }
        HashSet hashSet2 = this.MediaSessionCompatResultReceiverWrapper;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(VideoQualityQuirk.write((DrawModifierNodeKt) ((getHasInitialValueAnimations) it2.next()).MediaBrowserCompatMediaItem));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
            setInflatedId.IconCompatParcelizer(3, str);
        }
        VideoQualityQuirk.RemoteActionCompatParcelizer(arrayList).RemoteActionCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(this, arrayList, runnable, 14), this.RatingCompat);
    }

    public final boolean write() {
        Rational rational = this.serializer;
        return !(rational != null && rational.getDenominator() == rational.getNumerator());
    }

    public EncoderImpl(Executor executor, animateTo animateto, int i) throws InvalidConfigException {
        boolean z = false;
        executor.getClass();
        this.MediaBrowserCompatMediaItem = animateto;
        LruCache lruCache = CodecUtil.serializer;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(animateto.IconCompatParcelizer());
            this.ComponentActivity = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.RatingCompat = new PreviewFreezeAfterHighSpeedRecordingQuirk(executor);
            MediaFormat mediaFormatRemoteActionCompatParcelizer = animateto.RemoteActionCompatParcelizer();
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = mediaFormatRemoteActionCompatParcelizer;
            PreviewGreenTintQuirk previewGreenTintQuirkWrite = animateto.write();
            this.MediaSessionCompatToken = previewGreenTintQuirkWrite;
            this._init_lambda3 = new accessgetGreencp(new StreamSharing$$ExternalSyntheticLambda0(12, this), 8, new Transition$1(7));
            if (animateto instanceof SeekableTransitionStateseekTo31) {
                this._init_lambda1 = "AudioEncoder";
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
                this.PlaybackStateCompatCustomAction = new Transition(this);
                SeekableTransitionStateseekTo3 seekableTransitionStateseekTo3 = new SeekableTransitionStateseekTo3(codecInfo, null);
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) seekableTransitionStateseekTo3.ComponentActivity).getAudioCapabilities());
                this.PlaybackStateCompat = seekableTransitionStateseekTo3;
                this.serializer = new Rational(0, 0);
            } else {
                if (!(animateto instanceof animateOneFrame)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                animateOneFrame animateoneframe = (animateOneFrame) animateto;
                this._init_lambda1 = "VideoEncoder";
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                this.PlaybackStateCompatCustomAction = new onFrameanimation_core(this);
                TransitionKtrememberTransitionlambda10inlinedonDispose1 transitionKtrememberTransitionlambda10inlinedonDispose1 = new TransitionKtrememberTransitionlambda10inlinedonDispose1(codecInfo, animateoneframe.MediaSessionCompatQueueItem);
                if (mediaFormatRemoteActionCompatParcelizer.containsKey("bitrate")) {
                    int integer = mediaFormatRemoteActionCompatParcelizer.getInteger("bitrate");
                    int iIntValue = ((Integer) transitionKtrememberTransitionlambda10inlinedonDispose1.read.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatRemoteActionCompatParcelizer.setInteger("bitrate", iIntValue);
                        setInflatedId.IconCompatParcelizer(3, "VideoEncoder");
                    }
                }
                this.PlaybackStateCompat = transitionKtrememberTransitionlambda10inlinedonDispose1;
                this.serializer = new Rational(animateoneframe.read, animateoneframe.MediaBrowserCompatMediaItem);
            }
            String str = this._init_lambda1;
            Objects.toString(previewGreenTintQuirkWrite);
            setInflatedId.IconCompatParcelizer(3, str);
            String str2 = this._init_lambda1;
            Objects.toString(mediaFormatRemoteActionCompatParcelizer);
            setInflatedId.IconCompatParcelizer(3, str2);
            String str3 = this._init_lambda1;
            Objects.toString(this.serializer);
            setInflatedId.IconCompatParcelizer(3, str3);
            try {
                IconCompatParcelizer();
                AtomicReference atomicReference = new AtomicReference();
                onDrawWithContent ondrawwithcontent = new onDrawWithContent();
                ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
                onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
                ondrawwithcontent.read = ondrawbehind;
                ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
                try {
                    atomicReference.set(ondrawwithcontent);
                    ondrawwithcontent.RemoteActionCompatParcelizer = "mReleasedFuture";
                } catch (Exception e) {
                    ondrawbehind.write(e);
                }
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind);
                onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) atomicReference.get();
                ondrawwithcontent2.getClass();
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ondrawwithcontent2;
                if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && i == 1 && accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                    z = true;
                }
                this.IconCompatParcelizer = z;
                IconCompatParcelizer(clearInitialAnimationsanimation_core.CONFIGURED);
            } catch (MediaCodec.CodecException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            throw new InvalidConfigException(e3);
        }
    }

    public final void IconCompatParcelizer() {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2;
        Executor executor;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = RemoteActionCompatParcelizer;
        this._init_lambda4 = 0L;
        this.read.clear();
        this.ParcelableVolumeInfo.clear();
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            ((onDrawWithContent) it.next()).serializer();
        }
        this.write.clear();
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.ComponentActivity.reset();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        ScheduledFuture scheduledFuture = this._init_lambda2;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this._init_lambda2 = null;
        }
        ScheduledFuture scheduledFuture2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        }
        MediaCodecCallback mediaCodecCallback = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.MediaBrowserCompatMediaItem = true;
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new MediaCodecCallback();
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.ComponentActivity.setCallback(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.ComponentActivity.configure(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, (Surface) null, (MediaCrypto) null, 1);
        SuspendAnimationKt suspendAnimationKt = this.PlaybackStateCompatCustomAction;
        if (suspendAnimationKt instanceof onFrameanimation_core) {
            onFrameanimation_core onframeanimation_core = (onFrameanimation_core) suspendAnimationKt;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) accesswaitForCompositionAfterTargetStateChange.read.read(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (onframeanimation_core.write) {
                Surface surface = onframeanimation_core.read;
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (surface == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            onframeanimation_core.read = surfaceCreateInputSurface;
                        }
                        onframeanimation_core.MediaDescriptionCompat.ComponentActivity.setInputSurface(onframeanimation_core.read);
                    } else {
                        if (surface != null) {
                            onframeanimation_core.RemoteActionCompatParcelizer.add(surface);
                        }
                        surfaceCreateInputSurface = onframeanimation_core.MediaDescriptionCompat.ComponentActivity.createInputSurface();
                        onframeanimation_core.read = surfaceCreateInputSurface;
                    }
                    previewView$1$$ExternalSyntheticLambda2 = onframeanimation_core.IconCompatParcelizer;
                    executor = onframeanimation_core.serializer;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || previewView$1$$ExternalSyntheticLambda2 == null || executor == null) {
                return;
            }
            try {
                executor.execute(new Crossfade(previewView$1$$ExternalSyntheticLambda2, 27, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e) {
                setInflatedId.read(onframeanimation_core.MediaDescriptionCompat._init_lambda1, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.ComponentActivity.setParameters(bundle);
    }

    public final void read(int i, String str, Throwable th) {
        switch (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
            case 0:
                write(i, str, th);
                IconCompatParcelizer();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                IconCompatParcelizer(clearInitialAnimationsanimation_core.ERROR);
                serializer(new DataStoreProviderc(this, i, str, th));
                break;
            case 7:
                setInflatedId.RemoteActionCompatParcelizer(this._init_lambda1, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }

    public final void serializer() {
        while (true) {
            ArrayDeque arrayDeque = this.write;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.ParcelableVolumeInfo;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            onDrawWithContent ondrawwithcontent = (onDrawWithContent) arrayDeque.poll();
            Objects.requireNonNull(ondrawwithcontent);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                getHasInitialValueAnimations gethasinitialvalueanimations = new getHasInitialValueAnimations(this, this.ComponentActivity, num.intValue());
                if (ondrawwithcontent.RemoteActionCompatParcelizer(gethasinitialvalueanimations)) {
                    this.MediaSessionCompatResultReceiverWrapper.add(gethasinitialvalueanimations);
                    VideoQualityQuirk.write((DrawModifierNodeKt) gethasinitialvalueanimations.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(new Crossfade(this, 17, gethasinitialvalueanimations), this.RatingCompat);
                } else {
                    onDrawWithContent ondrawwithcontent2 = gethasinitialvalueanimations.MediaDescriptionCompat;
                    if (!gethasinitialvalueanimations.MediaSessionCompatQueueItem.getAndSet(true)) {
                        try {
                            gethasinitialvalueanimations.serializer.queueInputBuffer(gethasinitialvalueanimations.IconCompatParcelizer, 0, 0, 0L, 0);
                            ondrawwithcontent2.RemoteActionCompatParcelizer(null);
                        } catch (IllegalStateException e) {
                            ondrawwithcontent2.serializer(e);
                        }
                    }
                }
            } catch (MediaCodec.CodecException e2) {
                read(1, e2.getMessage(), e2);
                return;
            }
        }
    }

    public final void write(int i, String str, Throwable th) {
        animateDecay animatedecay;
        Executor executor;
        synchronized (this.ResultReceiver) {
            animatedecay = this.MediaSessionCompatQueueItem;
            executor = this.MediaDescriptionCompat;
        }
        try {
            executor.execute(new WorkerKt$$ExternalSyntheticLambda2(animatedecay, i, str, th));
        } catch (RejectedExecutionException e) {
            setInflatedId.read(this._init_lambda1, "Unable to post to the supplied executor.", e);
        }
    }

    public final void MediaMetadataCompat() {
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        SuspendAnimationKt suspendAnimationKt = this.PlaybackStateCompatCustomAction;
        int i = 1;
        if (suspendAnimationKt instanceof Transition) {
            ((Transition) suspendAnimationKt).serializer(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                arrayList.add(VideoQualityQuirk.write((DrawModifierNodeKt) ((getHasInitialValueAnimations) it.next()).MediaBrowserCompatMediaItem));
            }
            VideoQualityQuirk.RemoteActionCompatParcelizer(arrayList).RemoteActionCompatParcelizer(new CrossfadeKt(this, i), this.RatingCompat);
            return;
        }
        if (suspendAnimationKt instanceof onFrameanimation_core) {
            try {
                if (accesswaitForCompositionAfterTargetStateChange.read.read(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    MediaCodecCallback mediaCodecCallback = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = this.RatingCompat;
                    ScheduledFuture scheduledFuture = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().schedule(new Crossfade(previewFreezeAfterHighSpeedRecordingQuirk, 18, mediaCodecCallback), 1000L, TimeUnit.MILLISECONDS);
                }
                setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
                this.ComponentActivity.signalEndOfInputStream();
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            } catch (MediaCodec.CodecException e) {
                read(1, e.getMessage(), e);
            }
        }
    }

    public final void read() {
        Surface surface;
        HashSet hashSet;
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            if (!this.IconCompatParcelizer) {
                setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
                this.ComponentActivity.stop();
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        }
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.ComponentActivity.release();
        SuspendAnimationKt suspendAnimationKt = this.PlaybackStateCompatCustomAction;
        if (suspendAnimationKt instanceof onFrameanimation_core) {
            onFrameanimation_core onframeanimation_core = (onFrameanimation_core) suspendAnimationKt;
            synchronized (onframeanimation_core.write) {
                surface = onframeanimation_core.read;
                onframeanimation_core.read = null;
                hashSet = new HashSet(onframeanimation_core.RemoteActionCompatParcelizer);
                onframeanimation_core.RemoteActionCompatParcelizer.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        IconCompatParcelizer(clearInitialAnimationsanimation_core.RELEASED);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer(null);
    }

    public final void IconCompatParcelizer(clearInitialAnimationsanimation_core clearinitialanimationsanimation_core) {
        clearInitialAnimationsanimation_core clearinitialanimationsanimation_core2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (clearinitialanimationsanimation_core2 == clearinitialanimationsanimation_core) {
            return;
        }
        Objects.toString(clearinitialanimationsanimation_core2);
        Objects.toString(clearinitialanimationsanimation_core);
        setInflatedId.IconCompatParcelizer(3, this._init_lambda1);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = clearinitialanimationsanimation_core;
    }

    public final long read(long j) {
        if (!write()) {
            return j;
        }
        return Math.round(this.serializer.doubleValue() * j);
    }
}
