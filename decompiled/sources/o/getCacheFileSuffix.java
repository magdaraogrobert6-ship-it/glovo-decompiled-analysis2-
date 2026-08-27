package o;

import com.huawei.location.logic.E5;
import io.grpc.Status;
import io.sentry.JsonObjectSerializer;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCacheFileSuffix implements r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(getCacheFileSuffix.class.getName());
    public final boolean MediaSessionCompatQueueItem;
    public final logPurchaseWithJSONlambda0 RatingCompat;
    public volatile boolean RemoteActionCompatParcelizer;
    public r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA read;
    public final boolean serializer;
    public final isValidPushStoryClickInputlambda0 write;

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final boolean IconCompatParcelizer() {
        return ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).ParcelableVolumeInfo.read() && !this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void read(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this;
        r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo;
        TextStreamsKt.RemoteActionCompatParcelizer("Already called setListener", r8lambdakeppeuftpwazbc7drhg_qad0y4.MediaDescriptionCompat == null);
        TextStreamsKt.serializer(r8lambda6lgseszbuanebuadyycwzpxp5kw, "listener");
        r8lambdakeppeuftpwazbc7drhg_qad0y4.MediaDescriptionCompat = r8lambda6lgseszbuanebuadyycwzpxp5kw;
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        r8lambda1govqe20wmpp9dwezhg5pphjsce.MediaSessionCompatResultReceiverWrapper.serializer(this.read, (byte[]) null);
        this.read = null;
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void write() {
        r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this;
        if (r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo.MediaSessionCompatToken) {
            return;
        }
        r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo.MediaSessionCompatToken = true;
        this.write.serializer();
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void IconCompatParcelizer(int i) {
        ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).ParcelableVolumeInfo.serializer.MediaSessionCompatQueueItem = i;
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void IconCompatParcelizer(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        this.write.write(r8lambdakctilwmporjfcawe8asdqv1ks);
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void RemoteActionCompatParcelizer(setDateOfBirthlambda3 setdateofbirthlambda3) {
        isValidPushStoryClickInputlambda0 isvalidpushstoryclickinputlambda0 = this.write;
        try {
            if (!isvalidpushstoryclickinputlambda0.MediaBrowserCompatMediaItem()) {
                isvalidpushstoryclickinputlambda0.write(setdateofbirthlambda3);
            }
        } finally {
            r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer(setdateofbirthlambda3);
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read() {
        isValidPushStoryClickInputlambda0 isvalidpushstoryclickinputlambda0 = this.write;
        if (isvalidpushstoryclickinputlambda0.MediaBrowserCompatMediaItem()) {
            return;
        }
        isvalidpushstoryclickinputlambda0.RatingCompat();
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read(int i) {
        r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).ParcelableVolumeInfo;
        r8lambdakeppeuftpwazbc7drhg_qad0y4.getClass();
        executelambda2.write();
        isValidLocation isvalidlocation = new isValidLocation(r8lambdakeppeuftpwazbc7drhg_qad0y4, i, 1);
        synchronized (r8lambdakeppeuftpwazbc7drhg_qad0y4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
            isvalidlocation.run();
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void serializer() {
        r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).ParcelableVolumeInfo;
        createUriActionFromUrlStringlambda1 createuriactionfromurlstringlambda1 = r8lambdakeppeuftpwazbc7drhg_qad0y4.PlaybackStateCompatCustomAction;
        createuriactionfromurlstringlambda1.RatingCompat = r8lambdakeppeuftpwazbc7drhg_qad0y4;
        r8lambdakeppeuftpwazbc7drhg_qad0y4.serializer = createuriactionfromurlstringlambda1;
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(int i) {
        this.write.read(i);
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).MediaMetadataCompat.read.get(r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc.write), "remote_addr");
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs r8lambda5t3l_1jntlbjtf0fr47kg54a0bs) {
        r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).ParcelableVolumeInfo;
        TextStreamsKt.RemoteActionCompatParcelizer("Already called start", r8lambdakeppeuftpwazbc7drhg_qad0y4.MediaDescriptionCompat == null);
        TextStreamsKt.serializer(r8lambda5t3l_1jntlbjtf0fr47kg54a0bs, "decompressorRegistry");
        r8lambdakeppeuftpwazbc7drhg_qad0y4.read = r8lambda5t3l_1jntlbjtf0fr47kg54a0bs;
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty) {
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa = this.read;
        ReflectionUtils reflectionUtils = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaSessionCompatResultReceiverWrapper;
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(reflectionUtils);
        this.read.read(reflectionUtils, Long.valueOf(Math.max(0L, r8lambda9bwhxitij38r9epvsmivfryty.RemoteActionCompatParcelizer())));
    }

    public getCacheFileSuffix(AndroidUiFrameClock androidUiFrameClock, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0, logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, boolean z) {
        TextStreamsKt.serializer(r8lambdaqn1du6uas6agx4srbugfttxtpwa, "headers");
        TextStreamsKt.serializer(logpurchasewithjsonlambda0, "transportTracer");
        this.RatingCompat = logpurchasewithjsonlambda0;
        this.serializer = !Boolean.TRUE.equals(mergejsonobjectslambda10.serializer(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.write));
        this.MediaSessionCompatQueueItem = z;
        if (z) {
            this.write = new E5(this, r8lambdaqn1du6uas6agx4srbugfttxtpwa, r8lambdamwysina6epuugeuvjtl8aepfjn0);
        } else {
            this.write = new BrazeDeeplinkHandlerWhenMappings(this, androidUiFrameClock, r8lambdamwysina6epuugeuvjtl8aepfjn0);
            this.read = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        }
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void RemoteActionCompatParcelizer(Status status) {
        TextStreamsKt.read("Should not cancel with OK status", !status.IconCompatParcelizer());
        this.RemoteActionCompatParcelizer = true;
        JsonObjectSerializer jsonObjectSerializer = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).MediaSessionCompatResultReceiverWrapper;
        jsonObjectSerializer.getClass();
        executelambda2.serializer();
        try {
            synchronized (((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).ParcelableVolumeInfo.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).ParcelableVolumeInfo.write(status, true, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) null);
            }
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void read(r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs, boolean z, boolean z2, int i) {
        RegistryMissingComponentException registryMissingComponentException;
        TextStreamsKt.read("null frame before EOS", r8lambdaoaqvy__5d9hmn5g6gasyvakdzs != null || z);
        JsonObjectSerializer jsonObjectSerializer = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this).MediaSessionCompatResultReceiverWrapper;
        jsonObjectSerializer.getClass();
        executelambda2.serializer();
        try {
            if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs == null) {
                registryMissingComponentException = r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE.MediaBrowserCompatMediaItem;
            } else {
                registryMissingComponentException = r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.RemoteActionCompatParcelizer;
                int i2 = (int) registryMissingComponentException.size;
                if (i2 > 0) {
                    r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).ParcelableVolumeInfo;
                    synchronized (r8lambdakeppeuftpwazbc7drhg_qad0y4.PlaybackStateCompat) {
                        r8lambdakeppeuftpwazbc7drhg_qad0y4.ParcelableVolumeInfo += i2;
                    }
                }
            }
            synchronized (((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).ParcelableVolumeInfo.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4.RemoteActionCompatParcelizer(((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).ParcelableVolumeInfo, registryMissingComponentException, z, z2);
                logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) jsonObjectSerializer.jsonReflectionObjectSerializer).RatingCompat;
                if (i == 0) {
                    logpurchasewithjsonlambda0.getClass();
                } else {
                    logpurchasewithjsonlambda0.getClass();
                    ((WebContentUtils) logpurchasewithjsonlambda0.serializer).write();
                }
            }
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
