package o;

import com.google.firebase.Timestamp;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class getVirtualKey5zf0vsI implements getColorIntegerOrNulllambda0 {
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final AndroidIndirectPointerEvent_androidKt MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public getVirtualKey5zf0vsI(Timestamp.Companion companion, mergeJsonObjects mergejsonobjects, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, mergeJsonObjects mergejsonobjects8, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda2) {
        this.MediaSessionCompatResultReceiverWrapper = mergejsonobjects;
        this.MediaMetadataCompat = requestsinglelocationupdatelambda1;
        this.serializer = dataModule_ProvideSchedulerFactory;
        this.MediaSessionCompatQueueItem = mergejsonobjects2;
        this.write = mergejsonobjects3;
        this.MediaSessionCompatToken = mergejsonobjects4;
        this.MediaDescriptionCompat = androidIndirectPointerEvent_androidKt;
        this.IconCompatParcelizer = mergejsonobjects5;
        this.MediaBrowserCompatMediaItem = mergejsonobjects6;
        this.read = mergejsonobjects7;
        this.RemoteActionCompatParcelizer = mergejsonobjects8;
        this.RatingCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.ParcelableVolumeInfo = requestsinglelocationupdatelambda2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) this.MediaSessionCompatResultReceiverWrapper.write();
        r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) this.MediaMetadataCompat.write();
        getConfirm5zf0vsI getconfirm5zf0vsi = (getConfirm5zf0vsI) this.serializer.write();
        setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = (setOnEventTrackingSucceededListener) this.MediaSessionCompatQueueItem.write();
        requestInputModeiuPiT84 requestinputmodeiupit84 = (requestInputModeiuPiT84) this.write.write();
        BulletSpan_androidKt bulletSpan_androidKt = (BulletSpan_androidKt) this.MediaSessionCompatToken.write();
        toContentCaptureSessionCompat tocontentcapturesessioncompat = (toContentCaptureSessionCompat) this.MediaDescriptionCompat.write();
        getToggleOff5zf0vsI gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) this.IconCompatParcelizer.write();
        WebViewBuilderException webViewBuilderException = (WebViewBuilderException) this.MediaBrowserCompatMediaItem.write();
        accessgetLinearcp accessgetlinearcp = (accessgetLinearcp) this.read.write();
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.RemoteActionCompatParcelizer.write();
        withRect withrect = (withRect) this.RatingCompat.write();
        UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) this.ParcelableVolumeInfo.write();
        getpivotoffsetf1c5bw0.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        getconfirm5zf0vsi.getClass();
        setoneventtrackingsucceededlistener.getClass();
        requestinputmodeiupit84.getClass();
        bulletSpan_androidKt.getClass();
        gettoggleoff5zf0vsi.getClass();
        webViewBuilderException.getClass();
        accessgetlinearcp.getClass();
        transfersessionpackagei.getClass();
        withrect.getClass();
        updateStateUseCaseImpl.getClass();
        getContextClick5zf0vsI getcontextclick5zf0vsi = new getContextClick5zf0vsI(r8lambda4txk7kovp_j84hgvzl3zo6mzli8, getpivotoffsetf1c5bw0, getconfirm5zf0vsi, setoneventtrackingsucceededlistener, requestinputmodeiupit84, bulletSpan_androidKt, tocontentcapturesessioncompat, gettoggleoff5zf0vsi, webViewBuilderException, accessgetlinearcp, transfersessionpackagei, withrect, updateStateUseCaseImpl);
        int i2 = PlaybackStateCompat + 15;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getcontextclick5zf0vsi;
    }
}
