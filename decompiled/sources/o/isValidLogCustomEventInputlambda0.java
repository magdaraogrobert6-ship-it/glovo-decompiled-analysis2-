package o;

import io.grpc.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogCustomEventInputlambda0 extends isValidLogPurchaseInput {
    public final r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU IconCompatParcelizer;
    public final /* synthetic */ isValidEmailAddress read;
    public final setResourcePackageName serializer = setResourcePackageName.read();
    public final JsonUtilsExternalSyntheticLambda1[] write;

    public isValidLogCustomEventInputlambda0(isValidEmailAddress isvalidemailaddress, r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        this.read = isvalidemailaddress;
        this.IconCompatParcelizer = r8lambdagkh6tfshup2g_hd0a6i5ejd8pu;
        this.write = jsonUtilsExternalSyntheticLambda1Arr;
    }

    @Override // o.isValidLogPurchaseInput, o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        if (Boolean.TRUE.equals(this.IconCompatParcelizer.write.RatingCompat)) {
            applydisplaycutoutmarginstocontentarealambda0.write.add("wait_for_ready");
        }
        super.serializer(applydisplaycutoutmarginstocontentarealambda0);
    }

    @Override // o.isValidLogPurchaseInput
    public final void write(Status status) {
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : this.write) {
            jsonUtilsExternalSyntheticLambda1.serializer(status);
        }
    }

    @Override // o.isValidLogPurchaseInput, o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void RemoteActionCompatParcelizer(Status status) {
        super.RemoteActionCompatParcelizer(status);
        synchronized (this.read.write) {
            isValidEmailAddress isvalidemailaddress = this.read;
            if (isvalidemailaddress.MediaBrowserCompatMediaItem != null) {
                boolean zRemove = isvalidemailaddress.RatingCompat.remove(this);
                if (!this.read.IconCompatParcelizer() && zRemove) {
                    isValidEmailAddress isvalidemailaddress2 = this.read;
                    isvalidemailaddress2.PlaybackStateCompatCustomAction.read(isvalidemailaddress2.MediaMetadataCompat);
                    isValidEmailAddress isvalidemailaddress3 = this.read;
                    if (isvalidemailaddress3.MediaSessionCompatToken != null) {
                        isvalidemailaddress3.PlaybackStateCompatCustomAction.read(isvalidemailaddress3.MediaBrowserCompatMediaItem);
                        this.read.MediaBrowserCompatMediaItem = null;
                    }
                }
            }
        }
        this.read.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
    }
}
