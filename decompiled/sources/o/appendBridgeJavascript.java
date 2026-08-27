package o;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class appendBridgeJavascript extends JsonUtilsExternalSyntheticLambda1 {
    public final handleUrlOverridelambda00 IconCompatParcelizer;
    public long serializer;
    public final /* synthetic */ replacePrefetchedUrlsWithLocalAssetslambda1 write;

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void IconCompatParcelizer(long j) {
        if (this.write.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat != null) {
            return;
        }
        synchronized (this.write.ResultReceiver) {
            if (this.write.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == null) {
                handleUrlOverridelambda00 handleurloverridelambda00 = this.IconCompatParcelizer;
                if (!handleurloverridelambda00.RemoteActionCompatParcelizer) {
                    long j2 = this.serializer + j;
                    this.serializer = j2;
                    replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = this.write;
                    long j3 = replaceprefetchedurlswithlocalassetslambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > replaceprefetchedurlswithlocalassetslambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                        handleurloverridelambda00.write = true;
                    } else {
                        long jAddAndGet = ((AtomicLong) replaceprefetchedurlswithlocalassetslambda1.MediaMetadataCompat.jsonReflectionObjectSerializer).addAndGet(j2 - j3);
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda2 = this.write;
                        replaceprefetchedurlswithlocalassetslambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.serializer;
                        if (jAddAndGet > replaceprefetchedurlswithlocalassetslambda2.MediaBrowserCompatMediaItem) {
                            this.IconCompatParcelizer.write = true;
                        }
                    }
                    handleUrlOverridelambda00 handleurloverridelambda01 = this.IconCompatParcelizer;
                    getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer = handleurloverridelambda01.write ? this.write.RemoteActionCompatParcelizer(handleurloverridelambda01) : null;
                    if (getclearek5ggoqRemoteActionCompatParcelizer != null) {
                        getclearek5ggoqRemoteActionCompatParcelizer.run();
                    }
                }
            }
        }
    }

    public appendBridgeJavascript(replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1, handleUrlOverridelambda00 handleurloverridelambda00) {
        this.write = replaceprefetchedurlswithlocalassetslambda1;
        this.IconCompatParcelizer = handleurloverridelambda00;
    }
}
