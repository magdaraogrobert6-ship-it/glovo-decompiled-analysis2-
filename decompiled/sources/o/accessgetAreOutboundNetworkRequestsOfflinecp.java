package o;

import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.sentiance.core.model.thrift.O$b;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetAreOutboundNetworkRequestsOfflinecp implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public accessgetAreOutboundNetworkRequestsOfflinecp(r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 r8lambdamcfkchlmwyb5a6y_zopzjd5uq4, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3, getDoubleOrNull getdoubleornull4, getDoubleOrNull getdoubleornull5, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, setPresentationView setpresentationview) {
        this.RatingCompat = r8lambdamcfkchlmwyb5a6y_zopzjd5uq4;
        this.MediaMetadataCompat = mergejsonobjects;
        this.ParcelableVolumeInfo = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = getdoubleornull;
        this.write = getdoubleornull2;
        this.serializer = getdoubleornull3;
        this.IconCompatParcelizer = getdoubleornull4;
        this.MediaDescriptionCompat = getdoubleornull5;
        this.MediaSessionCompatQueueItem = mergejsonobjects3;
        this.MediaBrowserCompatMediaItem = mergejsonobjects4;
        this.read = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        SideMenuViewModel sideMenuViewModel = new SideMenuViewModel((O$b) this.RatingCompat.write(), (SideMenuRepository) this.MediaMetadataCompat.write(), (accessgetCustomBrazeNotificationFactorycp) this.ParcelableVolumeInfo.write(), new getQueryContext(), (r8lambdaf_FvuSyJcHtV7a7XxEaY3w461U) this.RemoteActionCompatParcelizer.write(), (r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8) this.write.write(), (r8lambdauAwsGBloCOQii2by57Eo3_9jYD4) this.serializer.write(), (r8lambdarhKt8LqXnUTuWnrd33rLhsW_3I) this.IconCompatParcelizer.write(), (r8lambdazKMAJ4AIoYVNmFfjP9fATFnmODI) this.MediaDescriptionCompat.write(), (accessgetSdkEnablementProvidercp) this.MediaSessionCompatQueueItem.write(), (r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4) this.MediaBrowserCompatMediaItem.write(), (isOpenInternalroom_runtime) this.read.write());
        int i2 = MediaSessionCompatResultReceiverWrapper + 3;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return sideMenuViewModel;
        }
        throw null;
    }
}
