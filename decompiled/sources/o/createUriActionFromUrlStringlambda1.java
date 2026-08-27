package o;

import com.huawei.riemann.location.common.utils.Constant;
import io.grpc.Status;
import io.grpc.internal.SharedResourcePool;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class createUriActionFromUrlStringlambda1 implements Closeable {
    public boolean IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final logPurchaseWithJSONlambda0 MediaSessionCompatToken;
    public volatile boolean ParcelableVolumeInfo;
    public BrazeDeeplinkHandlerCompanion PlaybackStateCompat;
    public final r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 PlaybackStateCompatCustomAction;
    public r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int read;
    public boolean serializer;
    public r8lambdakcTilwmporjFCAWe8ASdQv1Ks write;

    public final boolean write() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null;
    }

    public createUriActionFromUrlStringlambda1(r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q r8lambdaxth6frtbzsfmvd4nangmrxzlf8q, int i, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0, logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0) {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer;
        this.PlaybackStateCompat = BrazeDeeplinkHandlerCompanion.HEADER;
        this.MediaSessionCompatResultReceiverWrapper = 5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM();
        this.RemoteActionCompatParcelizer = false;
        this.read = -1;
        this.IconCompatParcelizer = false;
        this.ParcelableVolumeInfo = false;
        this.RatingCompat = r8lambdaxth6frtbzsfmvd4nangmrxzlf8q;
        this.write = r8lambdakctilwmporjfcawe8asdqv1ks;
        this.MediaSessionCompatQueueItem = i;
        this.PlaybackStateCompatCustomAction = r8lambdamwysina6epuugeuvjtl8aepfjn0;
        TextStreamsKt.serializer(logpurchasewithjsonlambda0, "transportTracer");
        this.MediaSessionCompatToken = logpurchasewithjsonlambda0;
    }

    public final void IconCompatParcelizer() {
        Object createuriactionfromurlstringlambda0;
        int i = this.read;
        long j = this.MediaMetadataCompat;
        r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0 = this.PlaybackStateCompatCustomAction;
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : r8lambdamwysina6epuugeuvjtl8aepfjn0.write) {
            jsonUtilsExternalSyntheticLambda1.read(i, j);
        }
        this.MediaMetadataCompat = 0;
        if (this.serializer) {
            r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = this.write;
            if (r8lambdakctilwmporjfcawe8asdqv1ks == r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer) {
                throw Status.write.IconCompatParcelizer("Can't decode compressed gRPC message as compression not configured").RemoteActionCompatParcelizer();
            }
            try {
                r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm = this.MediaDescriptionCompat;
                BrazeWebViewClient brazeWebViewClient = BrazeWebViewActivitycreateWebChromeClient1ExternalSyntheticLambda0.read;
                handleUrlOverridelambda0 handleurloverridelambda0 = new handleUrlOverridelambda0();
                TextStreamsKt.serializer(r8lambda8xhnvmmjfix_greebgpvlyhkgtm, "buffer");
                handleurloverridelambda0.read = r8lambda8xhnvmmjfix_greebgpvlyhkgtm;
                createuriactionfromurlstringlambda0 = new createUriActionFromUrlStringlambda0(r8lambdakctilwmporjfcawe8asdqv1ks.RemoteActionCompatParcelizer != 0 ? handleurloverridelambda0 : new GZIPInputStream(handleurloverridelambda0), this.MediaSessionCompatQueueItem, r8lambdamwysina6epuugeuvjtl8aepfjn0);
            } catch (IOException e) {
                DrawableTransformation.read((Throwable) e);
                return;
            }
        } else {
            long j2 = this.MediaDescriptionCompat.MediaMetadataCompat;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda2 : r8lambdamwysina6epuugeuvjtl8aepfjn0.write) {
                jsonUtilsExternalSyntheticLambda2.read(j2);
            }
            r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm2 = this.MediaDescriptionCompat;
            BrazeWebViewClient brazeWebViewClient2 = BrazeWebViewActivitycreateWebChromeClient1ExternalSyntheticLambda0.read;
            handleUrlOverridelambda0 handleurloverridelambda1 = new handleUrlOverridelambda0();
            TextStreamsKt.serializer(r8lambda8xhnvmmjfix_greebgpvlyhkgtm2, "buffer");
            handleurloverridelambda1.read = r8lambda8xhnvmmjfix_greebgpvlyhkgtm2;
            createuriactionfromurlstringlambda0 = handleurloverridelambda1;
        }
        this.MediaDescriptionCompat.getClass();
        this.MediaDescriptionCompat = null;
        r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q r8lambdaxth6frtbzsfmvd4nangmrxzlf8q = this.RatingCompat;
        SharedResourcePool sharedResourcePool = new SharedResourcePool();
        sharedResourcePool.IconCompatParcelizer = createuriactionfromurlstringlambda0;
        r8lambdaxth6frtbzsfmvd4nangmrxzlf8q.MediaDescriptionCompat.serializer(sharedResourcePool);
        this.PlaybackStateCompat = BrazeDeeplinkHandlerCompanion.HEADER;
        this.MediaSessionCompatResultReceiverWrapper = 5;
    }

    public final void serializer() {
        int iIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer();
        if ((iIconCompatParcelizer & Constant.ERROR_ROAD_AREA_INVALID) != 0) {
            throw Status.write.IconCompatParcelizer("gRPC frame header malformed: reserved bits not zero").RemoteActionCompatParcelizer();
        }
        this.serializer = (iIconCompatParcelizer & 1) != 0;
        r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm = this.MediaDescriptionCompat;
        r8lambda8xhnvmmjfix_greebgpvlyhkgtm.RemoteActionCompatParcelizer(4);
        int iIconCompatParcelizer2 = r8lambda8xhnvmmjfix_greebgpvlyhkgtm.IconCompatParcelizer() | (r8lambda8xhnvmmjfix_greebgpvlyhkgtm.IconCompatParcelizer() << 24) | (r8lambda8xhnvmmjfix_greebgpvlyhkgtm.IconCompatParcelizer() << 16) | (r8lambda8xhnvmmjfix_greebgpvlyhkgtm.IconCompatParcelizer() << 8);
        this.MediaSessionCompatResultReceiverWrapper = iIconCompatParcelizer2;
        if (iIconCompatParcelizer2 < 0 || iIconCompatParcelizer2 > this.MediaSessionCompatQueueItem) {
            Status status = Status.MediaSessionCompatQueueItem;
            java.util.Locale locale = java.util.Locale.US;
            throw status.IconCompatParcelizer("gRPC message exceeds maximum size " + this.MediaSessionCompatQueueItem + ": " + iIconCompatParcelizer2).RemoteActionCompatParcelizer();
        }
        int i = this.read + 1;
        this.read = i;
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : this.PlaybackStateCompatCustomAction.write) {
            jsonUtilsExternalSyntheticLambda1.IconCompatParcelizer(i);
        }
        logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = this.MediaSessionCompatToken;
        ((replacePrefetchedUrlsWithLocalAssetslambda0) logpurchasewithjsonlambda0.write).read();
        ((WebContentUtils) logpurchasewithjsonlambda0.serializer).write();
        this.PlaybackStateCompat = BrazeDeeplinkHandlerCompanion.BODY;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean read() throws Throwable {
        r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0 = this.PlaybackStateCompatCustomAction;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        try {
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.MediaSessionCompatResultReceiverWrapper - this.MediaDescriptionCompat.MediaMetadataCompat;
                    if (i3 <= 0) {
                        z = true;
                        z = true;
                        z = true;
                        if (i2 > 0) {
                            this.RatingCompat.write(i2);
                            if (this.PlaybackStateCompat == BrazeDeeplinkHandlerCompanion.BODY) {
                                break;
                            }
                        }
                    } else {
                        int i4 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaMetadataCompat;
                        if (i4 != 0) {
                            int iMin = Math.min(i3, i4);
                            i2 += iMin;
                            this.MediaDescriptionCompat.read(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(iMin));
                        } else if (i2 > 0) {
                            this.RatingCompat.write(i2);
                            if (this.PlaybackStateCompat == BrazeDeeplinkHandlerCompanion.BODY) {
                                break;
                            }
                        }
                    }
                    return z;
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.RatingCompat.write(i);
                        if (this.PlaybackStateCompat == BrazeDeeplinkHandlerCompanion.BODY) {
                            r8lambdamwysina6epuugeuvjtl8aepfjn0.read(i);
                            this.MediaMetadataCompat += i;
                        }
                    }
                    throw th;
                }
            }
            r8lambdamwysina6epuugeuvjtl8aepfjn0.read(i2);
            this.MediaMetadataCompat += i2;
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        while (!this.ParcelableVolumeInfo && this.MediaBrowserCompatMediaItem > 0 && read()) {
            try {
                int i = accessgetCustomHandlercp.write[this.PlaybackStateCompat.ordinal()];
                if (i == 1) {
                    serializer();
                } else {
                    if (i != 2) {
                        throw new AssertionError("Invalid state: " + this.PlaybackStateCompat);
                    }
                    IconCompatParcelizer();
                    this.MediaBrowserCompatMediaItem--;
                }
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer = false;
                throw th;
            }
        }
        if (this.ParcelableVolumeInfo) {
            close();
            this.RemoteActionCompatParcelizer = false;
        } else {
            if (this.IconCompatParcelizer && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaMetadataCompat == 0) {
                close();
            }
            this.RemoteActionCompatParcelizer = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (write()) {
            return;
        }
        r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm = this.MediaDescriptionCompat;
        boolean z = r8lambda8xhnvmmjfix_greebgpvlyhkgtm != null && r8lambda8xhnvmmjfix_greebgpvlyhkgtm.MediaMetadataCompat > 0;
        try {
            r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (r8lambda8xhnvmmjfix_greebgpvlyhkgtm2 != null) {
                r8lambda8xhnvmmjfix_greebgpvlyhkgtm2.close();
            }
            r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm3 = this.MediaDescriptionCompat;
            if (r8lambda8xhnvmmjfix_greebgpvlyhkgtm3 != null) {
                r8lambda8xhnvmmjfix_greebgpvlyhkgtm3.close();
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            this.MediaDescriptionCompat = null;
            this.RatingCompat.write(z);
        } catch (Throwable th) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            this.MediaDescriptionCompat = null;
            throw th;
        }
    }
}
