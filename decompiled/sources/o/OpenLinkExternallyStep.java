package o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OpenLinkExternallyStep implements r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM {
    public final /* synthetic */ int read;
    public final /* synthetic */ SetCustomUserAttributeStep serializer;

    public /* synthetic */ OpenLinkExternallyStep(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0, SetCustomUserAttributeStep setCustomUserAttributeStep) {
        this.read = 1;
        this.serializer = setCustomUserAttributeStep;
    }

    @Override // o.r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM
    public final Object read() {
        int i = this.read;
        SetCustomUserAttributeStep setCustomUserAttributeStep = this.serializer;
        if (i == 0) {
            return setCustomUserAttributeStep.serializer.ParcelableVolumeInfo();
        }
        if (i != 1) {
            return Boolean.valueOf(setCustomUserAttributeStep.serializer.RatingCompat());
        }
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setCustomUserAttributeStep.serializer;
        try {
            try {
                return Integer.valueOf(remoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
            } catch (Exception unused) {
                return Double.valueOf(remoteActionCompatParcelizer.MediaMetadataCompat());
            }
        } catch (Exception unused2) {
            return Long.valueOf(remoteActionCompatParcelizer.PlaybackStateCompat());
        }
    }

    public /* synthetic */ OpenLinkExternallyStep(SetCustomUserAttributeStep setCustomUserAttributeStep, int i) {
        this.read = i;
        this.serializer = setCustomUserAttributeStep;
    }
}
