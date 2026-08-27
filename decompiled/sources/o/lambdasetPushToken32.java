package o;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetPushToken32 {
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public final lambdaremoveGlobalCallbackParameter24 IconCompatParcelizer;
    public final SharedFlowImpl MediaBrowserCompatMediaItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public double RatingCompat;
    public final lambdasetCoppaComplianceInDelay49 RemoteActionCompatParcelizer;
    public final qdExternalSyntheticLambda8 read;
    public final SharedFlowImpl serializer;
    public final getContentViewGroupParentLayout write;

    public lambdasetPushToken32(lambdasetCoppaComplianceInDelay49 lambdasetcoppacomplianceindelay49, qdExternalSyntheticLambda8 qdexternalsyntheticlambda8, lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = lambdasetcoppacomplianceindelay49;
        this.read = qdexternalsyntheticlambda8;
        this.IconCompatParcelizer = lambdaremoveglobalcallbackparameter24;
        this.write = getcontentviewgroupparentlayout;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST);
        this.serializer = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = sharedFlowImplRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r1
  0x002a: PHI (r1v6 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) = (r1v5 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU), (r1v11 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void RemoteActionCompatParcelizer() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 47;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime socket reconnection: reset", new Object[1]);
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaMetadataCompat;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i3 = ParcelableVolumeInfo + 105;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime socket reconnection: reset", new Object[0]);
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaMetadataCompat;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i5 = ParcelableVolumeInfo + 105;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        this.MediaMetadataCompat = null;
        this.MediaSessionCompatQueueItem = 0;
        this.RatingCompat = 0.0d;
    }
}
