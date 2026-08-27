package o;

import io.sentry.SentryClient;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxUnpackedZipSizeBytesandroid_sdk_base_release extends parseJsonObjectIntoBundlelambda0 {
    public final /* synthetic */ getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release RemoteActionCompatParcelizer;

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final JsonUtilsa read(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.RemoteActionCompatParcelizer.write;
        java.util.logging.Logger logger = hasTooManyZipEntrieslambda0.MediaMetadataCompat;
        Executor executor = mergejsonobjectslambda10.write;
        if (executor == null) {
            executor = hastoomanyzipentrieslambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        }
        isBlank isblank = new isBlank(sentryClient, executor, mergejsonobjectslambda10, hastoomanyzipentrieslambda0.getFullyDrawnReporter, hastoomanyzipentrieslambda0.addOnMultiWindowModeChangedListener ? null : this.RemoteActionCompatParcelizer.write.addOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer.MediaSessionCompatToken, this.RemoteActionCompatParcelizer.write.MediaSessionCompatToken);
        isblank.ParcelableVolumeInfo = this.RemoteActionCompatParcelizer.write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return isblank;
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final String write() {
        return this.RemoteActionCompatParcelizer.serializer;
    }

    public getMaxUnpackedZipSizeBytesandroid_sdk_base_release(getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release) {
        this.RemoteActionCompatParcelizer = getmaxunpackedzipentrysizebytesandroid_sdk_base_release;
    }
}
