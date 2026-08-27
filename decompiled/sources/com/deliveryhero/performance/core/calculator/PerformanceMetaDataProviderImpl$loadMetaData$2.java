package com.deliveryhero.performance.core.calculator;

import android.os.Build;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import o.InnerShadowRendererProviderCompanion;
import o.PlatformShadowContext;
import o.ShortNewsContentCardView;
import o.copyWithoutOffsetui_graphics;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOpeningAnimation;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceMetaDataProviderImpl$loadMetaData$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public final /* synthetic */ Extras$Key PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        PerformanceMetaDataProviderImpl$loadMetaData$2 performanceMetaDataProviderImpl$loadMetaData$2 = new PerformanceMetaDataProviderImpl$loadMetaData$2(this.PlaybackStateCompat, shortNewsContentCardView);
        performanceMetaDataProviderImpl$loadMetaData$2.serializer = obj;
        return performanceMetaDataProviderImpl$loadMetaData$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((PerformanceMetaDataProviderImpl$loadMetaData$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x016a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getOpeningAnimation getopeninganimationIconCompatParcelizer;
        Object objAwaitInternal;
        String str;
        getOpeningAnimation getopeninganimation;
        copyWithoutOffsetui_graphics copywithoutoffsetui_graphics;
        String str2;
        getOpeningAnimation getopeninganimation2;
        String str3;
        String str4;
        int i;
        Object objAwait;
        int i2;
        int i3;
        String str5;
        int iIntValue;
        Object objAwait2;
        copyWithoutOffsetui_graphics copywithoutoffsetui_graphics2;
        int i4;
        int i5;
        int i6;
        int iIntValue2;
        Object objAwait3;
        int i7;
        int i8;
        int i9;
        int i10;
        String str6;
        copyWithoutOffsetui_graphics copywithoutoffsetui_graphics3;
        String str7;
        String str8;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.MediaSessionCompatResultReceiverWrapper;
        int i12 = 2;
        int i13 = 1;
        int i14 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
            InnerShadowRendererProviderCompanion innerShadowRendererProviderCompanion = (InnerShadowRendererProviderCompanion) this.PlaybackStateCompat.IconCompatParcelizer;
            DeferredCoroutine deferredCoroutineIconCompatParcelizer = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, i13), 3);
            DeferredCoroutine deferredCoroutineIconCompatParcelizer2 = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, i12), 3);
            DeferredCoroutine deferredCoroutineIconCompatParcelizer3 = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, i14), 3);
            getopeninganimationIconCompatParcelizer = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, 0), 3);
            String str9 = Build.DEVICE;
            str9.getClass();
            String str10 = Build.MANUFACTURER;
            str10.getClass();
            String strIconCompatParcelizer = innerShadowRendererProviderCompanion.IconCompatParcelizer();
            String strRemoteActionCompatParcelizer = innerShadowRendererProviderCompanion.RemoteActionCompatParcelizer();
            int i15 = Build.VERSION.SDK_INT;
            this.serializer = innerShadowRendererProviderCompanion;
            this.MediaMetadataCompat = deferredCoroutineIconCompatParcelizer2;
            this.RatingCompat = deferredCoroutineIconCompatParcelizer3;
            this.MediaSessionCompatQueueItem = getopeninganimationIconCompatParcelizer;
            this.MediaDescriptionCompat = strRemoteActionCompatParcelizer;
            this.MediaBrowserCompatMediaItem = strIconCompatParcelizer;
            this.ParcelableVolumeInfo = str10;
            this.PlaybackStateCompatCustomAction = str9;
            this.RemoteActionCompatParcelizer = i15;
            this.MediaSessionCompatResultReceiverWrapper = 1;
            objAwaitInternal = deferredCoroutineIconCompatParcelizer.awaitInternal(this);
            if (objAwaitInternal != coroutineSingletons) {
                str = strIconCompatParcelizer;
                getopeninganimation = deferredCoroutineIconCompatParcelizer2;
                copywithoutoffsetui_graphics = innerShadowRendererProviderCompanion;
                str2 = str10;
                getopeninganimation2 = deferredCoroutineIconCompatParcelizer3;
                str3 = strRemoteActionCompatParcelizer;
                str4 = str9;
                i = i15;
            }
            return coroutineSingletons;
        }
        if (i11 == 1) {
            i = this.RemoteActionCompatParcelizer;
            String str11 = this.PlaybackStateCompatCustomAction;
            str2 = this.ParcelableVolumeInfo;
            str = this.MediaBrowserCompatMediaItem;
            str3 = this.MediaDescriptionCompat;
            getopeninganimationIconCompatParcelizer = (getOpeningAnimation) this.MediaSessionCompatQueueItem;
            getopeninganimation2 = (getOpeningAnimation) this.RatingCompat;
            getOpeningAnimation getopeninganimation3 = (getOpeningAnimation) this.MediaMetadataCompat;
            copyWithoutOffsetui_graphics copywithoutoffsetui_graphics4 = (copyWithoutOffsetui_graphics) this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str4 = str11;
            objAwaitInternal = obj;
            getopeninganimation = getopeninganimation3;
            copywithoutoffsetui_graphics = copywithoutoffsetui_graphics4;
        } else {
            if (i11 == 2) {
                i3 = this.write;
                int i16 = this.RemoteActionCompatParcelizer;
                str5 = this.ParcelableVolumeInfo;
                str2 = this.MediaBrowserCompatMediaItem;
                str = this.MediaDescriptionCompat;
                str3 = (String) this.MediaSessionCompatQueueItem;
                getopeninganimationIconCompatParcelizer = (getOpeningAnimation) this.RatingCompat;
                getopeninganimation2 = (getOpeningAnimation) this.MediaMetadataCompat;
                copywithoutoffsetui_graphics = (copyWithoutOffsetui_graphics) this.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                i2 = i16;
                objAwait = obj;
                iIntValue = ((Number) objAwait).intValue();
                this.serializer = copywithoutoffsetui_graphics;
                this.MediaMetadataCompat = getopeninganimationIconCompatParcelizer;
                this.RatingCompat = str3;
                this.MediaSessionCompatQueueItem = str;
                this.MediaDescriptionCompat = str2;
                this.MediaBrowserCompatMediaItem = str5;
                this.ParcelableVolumeInfo = null;
                this.RemoteActionCompatParcelizer = i2;
                this.write = i3;
                this.read = iIntValue;
                this.MediaSessionCompatResultReceiverWrapper = 3;
                objAwait2 = getopeninganimation2.await(this);
                if (objAwait2 != coroutineSingletons) {
                    copywithoutoffsetui_graphics2 = copywithoutoffsetui_graphics;
                    int i17 = i2;
                    i4 = i3;
                    i5 = iIntValue;
                    i6 = i17;
                    iIntValue2 = ((Number) objAwait2).intValue();
                    this.serializer = copywithoutoffsetui_graphics2;
                    this.MediaMetadataCompat = str3;
                    this.RatingCompat = str;
                    this.MediaSessionCompatQueueItem = str2;
                    this.MediaDescriptionCompat = str5;
                    this.MediaBrowserCompatMediaItem = null;
                    this.RemoteActionCompatParcelizer = i6;
                    this.write = i4;
                    this.read = i5;
                    this.IconCompatParcelizer = iIntValue2;
                    this.MediaSessionCompatResultReceiverWrapper = 4;
                    objAwait3 = getopeninganimationIconCompatParcelizer.await(this);
                    if (objAwait3 != coroutineSingletons) {
                        i7 = i5;
                        i8 = i4;
                        i9 = i6;
                        i10 = iIntValue2;
                        str6 = str;
                        copywithoutoffsetui_graphics3 = copywithoutoffsetui_graphics2;
                        str7 = str3;
                        str8 = str2;
                    }
                }
                return coroutineSingletons;
            }
            if (i11 == 3) {
                i5 = this.read;
                int i18 = this.write;
                int i19 = this.RemoteActionCompatParcelizer;
                String str12 = this.MediaBrowserCompatMediaItem;
                str2 = this.MediaDescriptionCompat;
                str = (String) this.MediaSessionCompatQueueItem;
                str3 = (String) this.RatingCompat;
                getopeninganimationIconCompatParcelizer = (getOpeningAnimation) this.MediaMetadataCompat;
                copywithoutoffsetui_graphics2 = (copyWithoutOffsetui_graphics) this.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                i4 = i18;
                i6 = i19;
                str5 = str12;
                objAwait2 = obj;
                iIntValue2 = ((Number) objAwait2).intValue();
                this.serializer = copywithoutoffsetui_graphics2;
                this.MediaMetadataCompat = str3;
                this.RatingCompat = str;
                this.MediaSessionCompatQueueItem = str2;
                this.MediaDescriptionCompat = str5;
                this.MediaBrowserCompatMediaItem = null;
                this.RemoteActionCompatParcelizer = i6;
                this.write = i4;
                this.read = i5;
                this.IconCompatParcelizer = iIntValue2;
                this.MediaSessionCompatResultReceiverWrapper = 4;
                objAwait3 = getopeninganimationIconCompatParcelizer.await(this);
                if (objAwait3 != coroutineSingletons) {
                    i7 = i5;
                    i8 = i4;
                    i9 = i6;
                    i10 = iIntValue2;
                    str6 = str;
                    copywithoutoffsetui_graphics3 = copywithoutoffsetui_graphics2;
                    str7 = str3;
                    str8 = str2;
                }
                return coroutineSingletons;
            }
            if (i11 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i20 = this.IconCompatParcelizer;
            int i21 = this.read;
            int i22 = this.write;
            int i23 = this.RemoteActionCompatParcelizer;
            str5 = this.MediaDescriptionCompat;
            String str13 = (String) this.MediaSessionCompatQueueItem;
            String str14 = (String) this.RatingCompat;
            String str15 = (String) this.MediaMetadataCompat;
            copywithoutoffsetui_graphics3 = (copyWithoutOffsetui_graphics) this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i10 = i20;
            i7 = i21;
            i8 = i22;
            i9 = i23;
            str8 = str13;
            str6 = str14;
            str7 = str15;
            objAwait3 = obj;
        }
        long jLongValue = ((Number) objAwait3).longValue();
        ((InnerShadowRendererProviderCompanion) copywithoutoffsetui_graphics3).getClass();
        String str16 = Build.DEVICE;
        str16.getClass();
        String str17 = Build.MANUFACTURER;
        str17.getClass();
        return new PlatformShadowContext(str5, str8, str6, str7, i9, i8, i7, i10, jLongValue, str16 + str17 + Build.VERSION.SDK_INT);
        int iIntValue3 = ((Number) objAwaitInternal).intValue();
        this.serializer = copywithoutoffsetui_graphics;
        this.MediaMetadataCompat = getopeninganimation2;
        this.RatingCompat = getopeninganimationIconCompatParcelizer;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.ParcelableVolumeInfo = str4;
        this.PlaybackStateCompatCustomAction = null;
        this.RemoteActionCompatParcelizer = i;
        this.write = iIntValue3;
        this.MediaSessionCompatResultReceiverWrapper = 2;
        objAwait = getopeninganimation.await(this);
        if (objAwait != coroutineSingletons) {
            String str18 = str4;
            i2 = i;
            i3 = iIntValue3;
            str5 = str18;
            iIntValue = ((Number) objAwait).intValue();
            this.serializer = copywithoutoffsetui_graphics;
            this.MediaMetadataCompat = getopeninganimationIconCompatParcelizer;
            this.RatingCompat = str3;
            this.MediaSessionCompatQueueItem = str;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompatMediaItem = str5;
            this.ParcelableVolumeInfo = null;
            this.RemoteActionCompatParcelizer = i2;
            this.write = i3;
            this.read = iIntValue;
            this.MediaSessionCompatResultReceiverWrapper = 3;
            objAwait2 = getopeninganimation2.await(this);
            if (objAwait2 != coroutineSingletons) {
                copywithoutoffsetui_graphics2 = copywithoutoffsetui_graphics;
                int i110 = i2;
                i4 = i3;
                i5 = iIntValue;
                i6 = i110;
                iIntValue2 = ((Number) objAwait2).intValue();
                this.serializer = copywithoutoffsetui_graphics2;
                this.MediaMetadataCompat = str3;
                this.RatingCompat = str;
                this.MediaSessionCompatQueueItem = str2;
                this.MediaDescriptionCompat = str5;
                this.MediaBrowserCompatMediaItem = null;
                this.RemoteActionCompatParcelizer = i6;
                this.write = i4;
                this.read = i5;
                this.IconCompatParcelizer = iIntValue2;
                this.MediaSessionCompatResultReceiverWrapper = 4;
                objAwait3 = getopeninganimationIconCompatParcelizer.await(this);
                if (objAwait3 != coroutineSingletons) {
                    i7 = i5;
                    i8 = i4;
                    i9 = i6;
                    i10 = iIntValue2;
                    str6 = str;
                    copywithoutoffsetui_graphics3 = copywithoutoffsetui_graphics2;
                    str7 = str3;
                    str8 = str2;
                    long jLongValue2 = ((Number) objAwait3).longValue();
                    ((InnerShadowRendererProviderCompanion) copywithoutoffsetui_graphics3).getClass();
                    String str19 = Build.DEVICE;
                    str19.getClass();
                    String str110 = Build.MANUFACTURER;
                    str110.getClass();
                    return new PlatformShadowContext(str5, str8, str6, str7, i9, i8, i7, i10, jLongValue2, str19 + str110 + Build.VERSION.SDK_INT);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceMetaDataProviderImpl$loadMetaData$2(Extras$Key extras$Key, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.PlaybackStateCompat = extras$Key;
    }
}
