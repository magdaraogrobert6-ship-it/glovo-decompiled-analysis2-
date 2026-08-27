package o;

import android.app.Application;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.overlay.bubble.service.OverlayCoordinator;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getWriteEnabled implements getColorIntegerOrNulllambda0 {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompat;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public /* synthetic */ getWriteEnabled(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, mergeJsonObjects mergejsonobjects3, getColorIntegerOrNulllambda0 getcolorintegerornulllambda4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda5, getColorIntegerOrNulllambda0 getcolorintegerornulllambda6, mergeJsonObjects mergejsonobjects4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda7, mergeJsonObjects mergejsonobjects5, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.RatingCompat = mergejsonobjects2;
        this.PlaybackStateCompat = getcolorintegerornulllambda0;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda1;
        this.write = getcolorintegerornulllambda2;
        this.MediaSessionCompatToken = getcolorintegerornulllambda3;
        this.ParcelableVolumeInfo = mergejsonobjects3;
        this.MediaDescriptionCompat = getcolorintegerornulllambda4;
        this.serializer = getcolorintegerornulllambda5;
        this.MediaSessionCompatResultReceiverWrapper = getcolorintegerornulllambda6;
        this.MediaSessionCompatQueueItem = mergejsonobjects4;
        this.MediaMetadataCompat = getcolorintegerornulllambda7;
        this.read = mergejsonobjects5;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 115;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.read;
        mergeJsonObjects mergejsonobjects2 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects3 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects4 = this.MediaSessionCompatResultReceiverWrapper;
        mergeJsonObjects mergejsonobjects5 = this.serializer;
        mergeJsonObjects mergejsonobjects6 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects7 = this.ParcelableVolumeInfo;
        mergeJsonObjects mergejsonobjects8 = this.MediaSessionCompatToken;
        mergeJsonObjects mergejsonobjects9 = this.write;
        mergeJsonObjects mergejsonobjects10 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects11 = this.PlaybackStateCompat;
        mergeJsonObjects mergejsonobjects12 = this.RatingCompat;
        mergeJsonObjects mergejsonobjects13 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new onFailure((Application) mergejsonobjects13.write(), (q4ExternalSyntheticLambda9) mergejsonobjects12.write(), (accessdoFetch) mergejsonobjects11.write(), (SubcomposeContentPainterNode) mergejsonobjects10.write(), (isPunctuationStartBoundary) mergejsonobjects9.write(), (OverlayCoordinator) mergejsonobjects8.write(), (r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA) mergejsonobjects7.write(), (isOpenInternalroom_runtime) mergejsonobjects6.write(), (SubcomposeAsyncImageKt) mergejsonobjects5.write(), (AbstractContentPainterNode) mergejsonobjects4.write(), (DiskLruCachelaunchCleanup1) mergejsonobjects3.write(), (DiskLruCacheEditor) mergejsonobjects2.write(), (SubcomposeAsyncImageContent) mergejsonobjects.write());
        }
        x1 x1Var = new x1((setLastHorizontalStyle) mergejsonobjects13.write(), (OpportunitiesRepository) mergejsonobjects12.write(), (v9) mergejsonobjects11.write(), (va) mergejsonobjects10.write(), (v4) mergejsonobjects9.write(), (GetRiderStatusImpl) mergejsonobjects8.write(), (AndroidUiFrameClock) we.read.write(), (subscribeToBannersUpdateslambda2) mergejsonobjects7.write(), (checkSdkClickResponse) mergejsonobjects6.write(), (CanRequestLocationUpdatesImpl) mergejsonobjects5.write(), (GetOfflineLocationRequestStateImpl) mergejsonobjects4.write(), (removeRearDisplayPresentationStatusListener) mergejsonobjects3.write(), (IsRiderInsideAreaUseCaseImpl) mergejsonobjects2.write(), (readFileContent) mergejsonobjects.write());
        int i5 = PlaybackStateCompatCustomAction + 33;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return x1Var;
    }
}
