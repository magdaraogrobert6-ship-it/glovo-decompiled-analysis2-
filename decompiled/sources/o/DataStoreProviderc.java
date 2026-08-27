package o;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DataStoreProviderc implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ DataStoreProviderc(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.RemoteActionCompatParcelizer = 2;
        this.IconCompatParcelizer = mediaCodecCallback;
        this.write = bufferInfo;
        this.read = mediaCodec;
        this.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0259  */
    /* JADX WARN: Code duplicated, block: B:120:0x0267  */
    /* JADX WARN: Code duplicated, block: B:122:0x026e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:127:0x027f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x032a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0330  */
    /* JADX WARN: Code duplicated, block: B:172:0x033e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0342  */
    /* JADX WARN: Code duplicated, block: B:176:0x0348  */
    /* JADX WARN: Code duplicated, block: B:178:0x035a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0361  */
    /* JADX WARN: Code duplicated, block: B:206:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[LOOP:1: B:70:0x0186->B:209:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x019e  */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl;
        animateDecay animatedecay;
        Executor executor;
        animateDecay animatedecay2;
        long j;
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2;
        long j2;
        long j3;
        boolean z4;
        long j4;
        long j5;
        long j6;
        boolean z5;
        MediaCodec.BufferInfo bufferInfo;
        Executor executor2;
        animateDecay animatedecay3;
        Range range;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl3;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            r8lambdalmSvIZk2OaypKCEb55V0vnTE72k.IconCompatParcelizer((r8lambdalmSvIZk2OaypKCEb55V0vnTE72k) this.IconCompatParcelizer, (Location) this.write, this.serializer, (r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI) this.read);
            return;
        }
        if (i == 1) {
            ((androidx.camera.video.internal.encoder.EncoderImpl) this.IconCompatParcelizer).write(this.serializer, (String) this.write, (Throwable) this.read);
            return;
        }
        if (i != 2) {
            com.huawei.wisesecurity.ucs_credential.x xVar = (com.huawei.wisesecurity.ucs_credential.x) this.IconCompatParcelizer;
            byte[] bArr = (byte[]) this.write;
            int i2 = this.serializer;
            Map map = (Map) this.read;
            NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write = xVar.write(i2, bArr);
            synchronized (map) {
                map.put(nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write.serializer.read, nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write);
            }
            return;
        }
        androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = (androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback) this.IconCompatParcelizer;
        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.write;
        MediaCodec mediaCodec = (MediaCodec) this.read;
        int i3 = this.serializer;
        boolean z6 = mediaCodecCallback.MediaBrowserCompatMediaItem;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl4 = androidx.camera.video.internal.encoder.EncoderImpl.this;
        if (z6) {
            setInflatedId.read(encoderImpl4._init_lambda1, "Receives frame after codec is reset.");
            return;
        }
        switch (encoderImpl4.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.ResultReceiver) {
                    encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                    animatedecay = encoderImpl.MediaSessionCompatQueueItem;
                    executor = encoderImpl.MediaDescriptionCompat;
                    break;
                }
                if (encoderImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && encoderImpl.write()) {
                    bufferInfo2.presentationTimeUs = androidx.camera.video.internal.encoder.EncoderImpl.this.read(bufferInfo2.presentationTimeUs);
                }
                boolean z7 = false;
                if (!mediaCodecCallback.write) {
                    mediaCodecCallback.write = true;
                    try {
                        Objects.requireNonNull(animatedecay);
                        executor.execute(new onTransitionEndanimation_core(animatedecay, 0));
                    } catch (RejectedExecutionException e) {
                        setInflatedId.read(androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1, "Unable to post to the supplied executor.", e);
                    }
                }
                try {
                    if (!mediaCodecCallback.IconCompatParcelizer && bufferInfo2.size > 0 && (bufferInfo2.flags & 2) == 0) {
                        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = mediaCodecCallback.MediaSessionCompatResultReceiverWrapper;
                        if (vectorizedFloatDecaySpec != null) {
                            bufferInfo2.presentationTimeUs = vectorizedFloatDecaySpec.RemoteActionCompatParcelizer(bufferInfo2.presentationTimeUs);
                        }
                        long j7 = bufferInfo2.presentationTimeUs;
                        if (j7 <= mediaCodecCallback.MediaSessionCompatQueueItem) {
                            setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                        } else {
                            mediaCodecCallback.MediaSessionCompatQueueItem = j7;
                            boolean zContains = androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.contains(Long.valueOf(j7));
                            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl5 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                            if (zContains) {
                                long j8 = bufferInfo2.presentationTimeUs;
                                ArrayDeque arrayDeque = encoderImpl5.read;
                                while (!arrayDeque.isEmpty()) {
                                    Range range2 = (Range) arrayDeque.getFirst();
                                    if (j8 > ((Long) range2.getUpper()).longValue()) {
                                        arrayDeque.removeFirst();
                                        long jLongValue = (((Long) range2.getUpper()).longValue() - ((Long) range2.getLower()).longValue()) + encoderImpl5._init_lambda4;
                                        encoderImpl5._init_lambda4 = jLongValue;
                                        String str = encoderImpl5._init_lambda1;
                                        SeekableTransitionState.RemoteActionCompatParcelizer(jLongValue);
                                        setInflatedId.IconCompatParcelizer(3, str);
                                        animatedecay = animatedecay;
                                    } else {
                                        animatedecay2 = animatedecay;
                                        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl6 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                        j = bufferInfo2.presentationTimeUs;
                                        it = encoderImpl6.read.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                range = (Range) it.next();
                                                if (range.contains(Long.valueOf(j))) {
                                                    z = true;
                                                } else if (j < ((Long) range.getLower()).longValue()) {
                                                }
                                            }
                                            z = false;
                                        }
                                        z2 = mediaCodecCallback.MediaMetadataCompat;
                                        if (z2 && z) {
                                            setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                                            mediaCodecCallback.MediaMetadataCompat = true;
                                            synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.ResultReceiver) {
                                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl7 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                                executor2 = encoderImpl7.MediaDescriptionCompat;
                                                animatedecay3 = encoderImpl7.MediaSessionCompatQueueItem;
                                                break;
                                            }
                                            Objects.requireNonNull(animatedecay3);
                                            executor2.execute(new onTransitionEndanimation_core(animatedecay3, 0));
                                            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl8 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                            if (encoderImpl8.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == clearInitialAnimationsanimation_core.PAUSED && ((encoderImpl8.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                SuspendAnimationKt suspendAnimationKt = androidx.camera.video.internal.encoder.EncoderImpl.this.PlaybackStateCompatCustomAction;
                                                if (suspendAnimationKt instanceof Transition) {
                                                    ((Transition) suspendAnimationKt).serializer(false);
                                                }
                                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl9 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("drop-input-frames", 1);
                                                setInflatedId.IconCompatParcelizer(3, encoderImpl9._init_lambda1);
                                                encoderImpl9.ComponentActivity.setParameters(bundle);
                                            }
                                            androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl10 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                            if (encoderImpl10.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                                                ScheduledFuture scheduledFuture = encoderImpl10._init_lambda2;
                                                if (scheduledFuture != null) {
                                                    scheduledFuture.cancel(true);
                                                }
                                                androidx.camera.video.internal.encoder.EncoderImpl.this.MediaMetadataCompat();
                                                androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
                                            }
                                        } else if (z2 && !z) {
                                            setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                                            mediaCodecCallback.MediaMetadataCompat = false;
                                            if (androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && (bufferInfo2.flags & 1) == 0) {
                                                mediaCodecCallback.read = true;
                                            }
                                        }
                                        z3 = mediaCodecCallback.MediaMetadataCompat;
                                        encoderImpl2 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                        if (z3) {
                                            j2 = encoderImpl2._init_lambda4;
                                            j3 = bufferInfo2.presentationTimeUs;
                                            if (j2 > 0) {
                                                j3 -= j2;
                                            }
                                            if (j3 <= mediaCodecCallback.RatingCompat) {
                                                z4 = mediaCodecCallback.RemoteActionCompatParcelizer;
                                                if (!z4 && !mediaCodecCallback.read && encoderImpl2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                                                    mediaCodecCallback.read = true;
                                                }
                                                if (mediaCodecCallback.read) {
                                                    if ((bufferInfo2.flags & 1) != 0) {
                                                        mediaCodecCallback.read = false;
                                                    } else {
                                                        z7 = false;
                                                        setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                                        androidx.camera.video.internal.encoder.EncoderImpl.this.RemoteActionCompatParcelizer();
                                                    }
                                                }
                                                if (!z4) {
                                                    mediaCodecCallback.RemoteActionCompatParcelizer = true;
                                                    String str2 = encoderImpl2._init_lambda1;
                                                    Objects.toString(encoderImpl2.MediaSessionCompatToken);
                                                    SystemClock.uptimeMillis();
                                                    SystemClock.elapsedRealtime();
                                                    setInflatedId.IconCompatParcelizer(3, str2);
                                                }
                                                j4 = androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda4;
                                                j5 = bufferInfo2.presentationTimeUs;
                                                if (j4 > 0) {
                                                    j5 -= j4;
                                                }
                                                j6 = j5;
                                                if (bufferInfo2.presentationTimeUs == j6) {
                                                    bufferInfo = bufferInfo2;
                                                } else {
                                                    if (j6 > mediaCodecCallback.RatingCompat) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, z5);
                                                    bufferInfo = new MediaCodec.BufferInfo();
                                                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j6, bufferInfo2.flags);
                                                }
                                                mediaCodecCallback.RatingCompat = bufferInfo.presentationTimeUs;
                                                try {
                                                    mediaCodecCallback.RemoteActionCompatParcelizer(new animate(mediaCodec, i3, bufferInfo), animatedecay2, executor);
                                                } catch (MediaCodec.CodecException e2) {
                                                    androidx.camera.video.internal.encoder.EncoderImpl.this.read(1, e2.getMessage(), e2);
                                                    return;
                                                }
                                                break;
                                            } else {
                                                setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                                if (androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && (bufferInfo2.flags & 1) != 0) {
                                                    mediaCodecCallback.read = true;
                                                }
                                            }
                                            if (!mediaCodecCallback.IconCompatParcelizer) {
                                                if ((bufferInfo2.flags & 4) == 0 && (!mediaCodecCallback.serializer || accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk.class) == null)) {
                                                    mediaCodecCallback.read();
                                                } else if (mediaCodecCallback.MediaDescriptionCompat) {
                                                    encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                                    if (encoderImpl3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && bufferInfo2.presentationTimeUs > ((Long) encoderImpl3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getUpper()).longValue()) {
                                                        mediaCodecCallback.read();
                                                    }
                                                }
                                            }
                                            if (mediaCodecCallback.serializer) {
                                                mediaCodecCallback.serializer = false;
                                                return;
                                            }
                                            return;
                                        }
                                        setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                        z7 = false;
                                    }
                                }
                                animatedecay2 = animatedecay;
                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl11 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                j = bufferInfo2.presentationTimeUs;
                                it = encoderImpl11.read.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        range = (Range) it.next();
                                        if (range.contains(Long.valueOf(j))) {
                                            z = true;
                                        } else if (j < ((Long) range.getLower()).longValue()) {
                                        }
                                    }
                                    z = false;
                                }
                                z2 = mediaCodecCallback.MediaMetadataCompat;
                                if (z2) {
                                    if (z2) {
                                        setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                                        mediaCodecCallback.MediaMetadataCompat = false;
                                        if (androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                                            mediaCodecCallback.read = true;
                                        }
                                    }
                                } else if (z2) {
                                    setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                                    mediaCodecCallback.MediaMetadataCompat = false;
                                    if (androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                                        mediaCodecCallback.read = true;
                                    }
                                }
                                z3 = mediaCodecCallback.MediaMetadataCompat;
                                encoderImpl2 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                if (z3) {
                                    j2 = encoderImpl2._init_lambda4;
                                    j3 = bufferInfo2.presentationTimeUs;
                                    if (j2 > 0) {
                                        j3 -= j2;
                                    }
                                    if (j3 <= mediaCodecCallback.RatingCompat) {
                                        z4 = mediaCodecCallback.RemoteActionCompatParcelizer;
                                        if (!z4) {
                                            mediaCodecCallback.read = true;
                                        }
                                        if (mediaCodecCallback.read) {
                                            if ((bufferInfo2.flags & 1) != 0) {
                                                mediaCodecCallback.read = false;
                                            } else {
                                                z7 = false;
                                                setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                                androidx.camera.video.internal.encoder.EncoderImpl.this.RemoteActionCompatParcelizer();
                                            }
                                        }
                                        if (!z4) {
                                            mediaCodecCallback.RemoteActionCompatParcelizer = true;
                                            String str3 = encoderImpl2._init_lambda1;
                                            Objects.toString(encoderImpl2.MediaSessionCompatToken);
                                            SystemClock.uptimeMillis();
                                            SystemClock.elapsedRealtime();
                                            setInflatedId.IconCompatParcelizer(3, str3);
                                        }
                                        j4 = androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda4;
                                        j5 = bufferInfo2.presentationTimeUs;
                                        if (j4 > 0) {
                                            j5 -= j4;
                                        }
                                        j6 = j5;
                                        if (bufferInfo2.presentationTimeUs == j6) {
                                            bufferInfo = bufferInfo2;
                                        } else {
                                            if (j6 > mediaCodecCallback.RatingCompat) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, z5);
                                            bufferInfo = new MediaCodec.BufferInfo();
                                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j6, bufferInfo2.flags);
                                        }
                                        mediaCodecCallback.RatingCompat = bufferInfo.presentationTimeUs;
                                        mediaCodecCallback.RemoteActionCompatParcelizer(new animate(mediaCodec, i3, bufferInfo), animatedecay2, executor);
                                        break;
                                    } else {
                                        setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                        if (androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                                            mediaCodecCallback.read = true;
                                        }
                                    }
                                    if (!mediaCodecCallback.IconCompatParcelizer) {
                                        if ((bufferInfo2.flags & 4) == 0) {
                                            if (mediaCodecCallback.MediaDescriptionCompat) {
                                                encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                                if (encoderImpl3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                                    mediaCodecCallback.read();
                                                }
                                            }
                                        } else if (mediaCodecCallback.MediaDescriptionCompat) {
                                            encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                            if (encoderImpl3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                                mediaCodecCallback.read();
                                            }
                                        }
                                    }
                                    if (mediaCodecCallback.serializer) {
                                        mediaCodecCallback.serializer = false;
                                        return;
                                    }
                                    return;
                                }
                                setInflatedId.IconCompatParcelizer(3, encoderImpl2._init_lambda1);
                                z7 = false;
                            } else {
                                setInflatedId.IconCompatParcelizer(3, encoderImpl5._init_lambda1);
                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl12 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                if (encoderImpl12.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 && bufferInfo2.presentationTimeUs >= ((Long) encoderImpl12.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getUpper()).longValue()) {
                                    ScheduledFuture scheduledFuture2 = androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda2;
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(true);
                                    }
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Long.valueOf(bufferInfo2.presentationTimeUs);
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.MediaMetadataCompat();
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
                                }
                            }
                        }
                    } else {
                        setInflatedId.IconCompatParcelizer(3, androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1);
                    }
                    androidx.camera.video.internal.encoder.EncoderImpl.this.ComponentActivity.releaseOutputBuffer(i3, z7);
                    if (!mediaCodecCallback.IconCompatParcelizer) {
                        if ((bufferInfo2.flags & 4) == 0) {
                            if (mediaCodecCallback.MediaDescriptionCompat) {
                                encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                if (encoderImpl3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                    mediaCodecCallback.read();
                                }
                            }
                        } else if (mediaCodecCallback.MediaDescriptionCompat) {
                            encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                            if (encoderImpl3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                mediaCodecCallback.read();
                            }
                        }
                    }
                    if (mediaCodecCallback.serializer) {
                        mediaCodecCallback.serializer = false;
                        return;
                    }
                    return;
                } catch (MediaCodec.CodecException e3) {
                    androidx.camera.video.internal.encoder.EncoderImpl.this.read(1, e3.getMessage(), e3);
                    return;
                }
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                return;
        }
    }

    public /* synthetic */ DataStoreProviderc(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = i;
        this.read = obj3;
    }

    public /* synthetic */ DataStoreProviderc(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, int i, String str, Throwable th) {
        this.RemoteActionCompatParcelizer = 1;
        this.IconCompatParcelizer = encoderImpl;
        this.serializer = i;
        this.write = str;
        this.read = th;
    }
}
