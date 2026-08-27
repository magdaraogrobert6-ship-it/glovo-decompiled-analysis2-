package com.roadrunner.customerchat.selfservice.data.repository;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.collectRangeTransitions;
import o.createFromParcel;
import o.handleUlStart;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.skippedEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ WebChatNativeAssetRepositoryImpl MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ String MediaMetadataCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = webChatNativeAssetRepositoryImpl;
        this.MediaSessionCompatQueueItem = str;
        this.MediaMetadataCompat = str2;
        this.read = str3;
        this.write = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.IconCompatParcelizer = str6;
        this.serializer = str7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2 webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2 = new WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2(this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        int i2 = RatingCompat + 19;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.MediaDescriptionCompat;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i5 = MediaSessionCompatToken + 73;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl = this.MediaBrowserCompatMediaItem;
        handleUlStart handleulstart = webChatNativeAssetRepositoryImpl.serializer;
        String string = Uri.parse(skippedEntity.read((collectRangeTransitions) webChatNativeAssetRepositoryImpl.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), this.MediaSessionCompatQueueItem, "/native-cache/api/v1/cache/release")).buildUpon().appendPath(this.MediaMetadataCompat).build().toString();
        string.getClass();
        this.MediaDescriptionCompat = 1;
        Object objRemoteActionCompatParcelizer = handleulstart.RemoteActionCompatParcelizer(string, this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, "rider", null, null, null, this);
        return objRemoteActionCompatParcelizer == coroutineSingletons ? coroutineSingletons : objRemoteActionCompatParcelizer;
    }
}
