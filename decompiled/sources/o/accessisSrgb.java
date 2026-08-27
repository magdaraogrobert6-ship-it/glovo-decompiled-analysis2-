package o;

import com.google.firebase.Timestamp;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class accessisSrgb implements accessgetDefaultJoincp {
    public static final Timestamp.Companion serializer = new Timestamp.Companion(0);
    public generateOetf ComponentActivity;
    public final clamp IconCompatParcelizer;
    public com.bumptech.glide.load.engine.GlideException MediaBrowserCompatMediaItem;
    public generateEotflambda0 MediaMetadataCompat;
    public final clamp MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public generateEotf MediaSessionCompatToken;
    public volatile boolean ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final area RatingCompat;
    public com.bumptech.glide.load.engine.DecodeJob RemoteActionCompatParcelizer;
    public final setRootFocusNodeui r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final clamp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final area r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I read;
    public final computeXYZMatrix write = new computeXYZMatrix(new ArrayList(2));
    public final ChildLayerDependenciesTracker r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new ChildLayerDependenciesTracker();
    public final AtomicInteger ResultReceiver = new AtomicInteger();
    public final Timestamp.Companion MediaDescriptionCompat = serializer;

    public final void IconCompatParcelizer(generateEotf generateeotf, boolean z, boolean z2) {
        synchronized (this) {
            this.MediaSessionCompatToken = generateeotf;
            this.PlaybackStateCompat = z;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = z2;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        generateEotflambda0 generateeotflambda0;
        synchronized (this) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
            UrlUtils.IconCompatParcelizer("Not yet complete!", serializer());
            int iDecrementAndGet = this.ResultReceiver.decrementAndGet();
            UrlUtils.IconCompatParcelizer("Can't decrement below 0", iDecrementAndGet >= 0);
            if (iDecrementAndGet == 0) {
                generateeotflambda0 = this.MediaMetadataCompat;
                read();
            } else {
                generateeotflambda0 = null;
            }
        }
        if (generateeotflambda0 != null) {
            generateeotflambda0.RatingCompat();
        }
    }

    @Override // o.accessgetDefaultJoincp
    public final ChildLayerDependenciesTracker n_() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public final void read() {
        boolean zIconCompatParcelizer;
        synchronized (this) {
            if (this.MediaSessionCompatToken == null) {
                throw new IllegalArgumentException();
            }
            this.write.RemoteActionCompatParcelizer.clear();
            this.MediaSessionCompatToken = null;
            this.MediaMetadataCompat = null;
            this.ComponentActivity = null;
            this.PlaybackStateCompatCustomAction = false;
            this.ParcelableVolumeInfo = false;
            this.MediaSessionCompatResultReceiverWrapper = false;
            com.bumptech.glide.load.engine.DecodeJob decodeJob = this.RemoteActionCompatParcelizer;
            accessgenerateEotf accessgenerateeotf = decodeJob.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            synchronized (accessgenerateeotf) {
                accessgenerateeotf.IconCompatParcelizer = true;
                zIconCompatParcelizer = accessgenerateeotf.IconCompatParcelizer();
            }
            if (zIconCompatParcelizer) {
                decodeJob.serializer();
            }
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = null;
            this.read = null;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(this);
        }
    }

    public final void read(com.bumptech.glide.request.SingleRequest singleRequest, Executor executor) {
        synchronized (this) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
            this.write.RemoteActionCompatParcelizer.add(new computeWhitePoint(singleRequest, executor));
            int i = 1;
            if (this.MediaSessionCompatResultReceiverWrapper) {
                write(1);
                executor.execute(new accessxyPrimaries(this, singleRequest, i));
            } else if (this.PlaybackStateCompatCustomAction) {
                write(1);
                executor.execute(new accessxyPrimaries(this, singleRequest, 0));
            } else {
                UrlUtils.IconCompatParcelizer("Cannot add callbacks to a cancelled EngineJob", !this.ParcelableVolumeInfo);
            }
        }
    }

    public final void serializer(com.bumptech.glide.request.SingleRequest singleRequest) {
        synchronized (this) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
            this.write.RemoteActionCompatParcelizer.remove(new computeWhitePoint(singleRequest, DrawTransformKt.write));
            if (this.write.RemoteActionCompatParcelizer.isEmpty()) {
                if (!serializer()) {
                    this.ParcelableVolumeInfo = true;
                    com.bumptech.glide.load.engine.DecodeJob decodeJob = this.RemoteActionCompatParcelizer;
                    decodeJob.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                    r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w r8lambdaf_r03apgk3yrrx0m4apr6mxy0w = decodeJob.MediaMetadataCompat;
                    if (r8lambdaf_r03apgk3yrrx0m4apr6mxy0w != null) {
                        r8lambdaf_r03apgk3yrrx0m4apr6mxy0w.IconCompatParcelizer();
                    }
                    area areaVar = this.RatingCompat;
                    generateEotf generateeotf = this.MediaSessionCompatToken;
                    synchronized (areaVar) {
                        generateOetflambda0 generateoetflambda0 = areaVar.MediaDescriptionCompat;
                        generateoetflambda0.getClass();
                        HashMap map = generateoetflambda0.serializer;
                        if (this == map.get(generateeotf)) {
                            map.remove(generateeotf);
                        }
                    }
                }
                if ((this.MediaSessionCompatResultReceiverWrapper || this.PlaybackStateCompatCustomAction) && this.ResultReceiver.get() == 0) {
                    read();
                }
            }
        }
    }

    public final void write(int i) {
        generateEotflambda0 generateeotflambda0;
        synchronized (this) {
            UrlUtils.IconCompatParcelizer("Not yet complete!", serializer());
            if (this.ResultReceiver.getAndAdd(i) == 0 && (generateeotflambda0 = this.MediaMetadataCompat) != null) {
                generateeotflambda0.serializer();
            }
        }
    }

    public final void write(com.bumptech.glide.load.engine.DecodeJob decodeJob) {
        clamp clampVar;
        synchronized (this) {
            this.RemoteActionCompatParcelizer = decodeJob;
            accesscomputeWhitePoint accesscomputewhitepointWrite = decodeJob.write(accesscomputeWhitePoint.INITIALIZE);
            if (accesscomputewhitepointWrite == accesscomputeWhitePoint.RESOURCE_CACHE || accesscomputewhitepointWrite == accesscomputeWhitePoint.DATA_CACHE) {
                clampVar = this.MediaSessionCompatQueueItem;
            } else {
                clampVar = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ? this.IconCompatParcelizer : this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            }
            clampVar.execute(decodeJob);
        }
    }

    public final boolean serializer() {
        return this.PlaybackStateCompatCustomAction || this.MediaSessionCompatResultReceiverWrapper || this.ParcelableVolumeInfo;
    }

    public accessisSrgb(clamp clampVar, clamp clampVar2, clamp clampVar3, clamp clampVar4, area areaVar, area areaVar2, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.MediaSessionCompatQueueItem = clampVar;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = clampVar2;
        this.IconCompatParcelizer = clampVar4;
        this.RatingCompat = areaVar;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = areaVar2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = emojiProcessor;
    }
}
