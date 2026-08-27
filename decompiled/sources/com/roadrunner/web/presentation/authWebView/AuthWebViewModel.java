package com.roadrunner.web.presentation.authWebView;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import com.roadrunner.auth.domain.token.GetAccessTokenUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseRxViewModel;
import com.ui.common.base.BaseRxViewModelKt;
import io.reactivex.subjects.BehaviorSubject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.AndroidGraphicsContext2;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getPivotOffsetF1C5BW0;
import o.subscribeToBannersDismissedEventandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;
import o.unpackInt2;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthWebViewModel extends BaseRxViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final AndroidGraphicsContext2 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final GetAccessTokenUseCaseImpl MediaDescriptionCompat;
    public final unpackInt2 MediaMetadataCompat;
    public final subscribeToBannersDismissedEventandroid_sdk_base_release MediaSessionCompatQueueItem;
    public final AndroidGraphicsContext2 MediaSessionCompatToken;
    public final BehaviorSubject ParcelableVolumeInfo;
    public final AndroidGraphicsContext2 PlaybackStateCompat;
    public boolean RatingCompat;
    public final AndroidGraphicsContext2 RemoteActionCompatParcelizer;
    public final AndroidGraphicsContext2 read;
    public final BlockRunner serializer;
    public final AndroidGraphicsContext2 write;

    public final AndroidGraphicsContext2 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 77;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        AndroidGraphicsContext2 androidGraphicsContext2 = this.MediaSessionCompatToken;
        int i5 = i2 + 75;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return androidGraphicsContext2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AndroidGraphicsContext2 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 59;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        AndroidGraphicsContext2 androidGraphicsContext2 = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 99;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return androidGraphicsContext2;
    }

    public final AndroidGraphicsContext2 read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        AndroidGraphicsContext2 androidGraphicsContext2 = this.PlaybackStateCompat;
        int i5 = i3 + 77;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return androidGraphicsContext2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthWebViewModel(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, BlockRunner blockRunner, subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release, GetAccessTokenUseCaseImpl getAccessTokenUseCaseImpl, unpackInt2 unpackint2) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        blockRunner.getClass();
        subscribetobannersdismissedeventandroid_sdk_base_release.getClass();
        getAccessTokenUseCaseImpl.getClass();
        unpackint2.getClass();
        getpivotoffsetf1c5bw0.getClass();
        this.RatingCompat = true;
        AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
        this.read = androidGraphicsContext2;
        this.RemoteActionCompatParcelizer = androidGraphicsContext2;
        AndroidGraphicsContext2 androidGraphicsContext3 = new AndroidGraphicsContext2();
        this.write = androidGraphicsContext3;
        this.MediaSessionCompatToken = androidGraphicsContext3;
        AndroidGraphicsContext2 androidGraphicsContext4 = new AndroidGraphicsContext2();
        this.IconCompatParcelizer = androidGraphicsContext4;
        this.PlaybackStateCompat = androidGraphicsContext4;
        this.serializer = blockRunner;
        this.MediaSessionCompatQueueItem = subscribetobannersdismissedeventandroid_sdk_base_release;
        this.MediaDescriptionCompat = getAccessTokenUseCaseImpl;
        this.MediaMetadataCompat = unpackint2;
        this.ParcelableVolumeInfo = new BehaviorSubject();
    }

    public final void write() {
        int i = 2 % 2;
        BaseRxViewModelKt.read(this, this.ParcelableVolumeInfo, new TncContentKt$$ExternalSyntheticLambda2(25, this));
        int i2 = MediaSessionCompatResultReceiverWrapper + 115;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void read(String str) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 115;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = this.MediaSessionCompatQueueItem;
            subscribetobannersdismissedeventandroid_sdk_base_release.getClass();
            subscribetobannersdismissedeventandroid_sdk_base_release.read.IconCompatParcelizer(str, null);
            subscribetobannersdismissedeventandroid_sdk_base_release.IconCompatParcelizer.getClass();
            return;
        }
        subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release2 = this.MediaSessionCompatQueueItem;
        subscribetobannersdismissedeventandroid_sdk_base_release2.getClass();
        subscribetobannersdismissedeventandroid_sdk_base_release2.read.IconCompatParcelizer(str, null);
        subscribetobannersdismissedeventandroid_sdk_base_release2.IconCompatParcelizer.getClass();
        obj.hashCode();
        throw null;
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asFlow$1(this, str, (ShortNewsContentCardView) null, 25), 3);
        int i2 = MediaSessionCompatResultReceiverWrapper + 89;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 77;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = false;
            this.read.RemoteActionCompatParcelizer(createFromParcel.INSTANCE);
        }
        if (!this.RatingCompat) {
            return;
        }
        int i3 = MediaSessionCompatResultReceiverWrapper + 23;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.MediaBrowserCompatMediaItem = true;
        this.RatingCompat = false;
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaSessionCompatToken.IconCompatParcelizer());
    }

    public final boolean write(String str) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 105;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        unpackInt2 unpackint2 = this.MediaMetadataCompat;
        unpackint2.getClass();
        Uri uri = Uri.parse(str);
        boolean zContains = uri.getQueryParameterNames().contains("nested_mode");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("nested_mode", false);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) unpackint2.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_WEBVIEW_HEADER_HIDING_ENABLED) || !zContains || booleanQueryParameter) {
            return false;
        }
        int i4 = PlaybackStateCompatCustomAction + 47;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
