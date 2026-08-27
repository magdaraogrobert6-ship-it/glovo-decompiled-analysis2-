package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrappercreateAnimationListener1 extends CancellableContinuationImpl {
    public final JobSupport MediaMetadataCompat;

    public DefaultInAppMessageViewWrappercreateAnimationListener1(ShortNewsContentCardView shortNewsContentCardView, JobSupport jobSupport) {
        super(1, shortNewsContentCardView);
        this.MediaMetadataCompat = jobSupport;
    }

    @Override // kotlinx.coroutines.CancellableContinuationImpl
    public final String MediaDescriptionCompat() {
        return "AwaitContinuation";
    }

    @Override // kotlinx.coroutines.CancellableContinuationImpl
    public final Throwable write(JobSupport jobSupport) {
        Throwable thSerializer;
        Object objParcelableVolumeInfo = this.MediaMetadataCompat.ParcelableVolumeInfo();
        if (!(objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) || (thSerializer = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).serializer()) == null) {
            return objParcelableVolumeInfo instanceof getClosingAnimation ? ((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer : jobSupport.write();
        }
        return thSerializer;
    }
}
