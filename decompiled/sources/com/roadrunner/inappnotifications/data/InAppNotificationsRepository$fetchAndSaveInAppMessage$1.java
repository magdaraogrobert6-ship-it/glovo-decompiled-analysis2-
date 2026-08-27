package com.roadrunner.inappnotifications.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.processAdapterUpdatesAndSetAnimationFlags;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsRepository$fetchAndSaveInAppMessage$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public processAdapterUpdatesAndSetAnimationFlags read;
    public final /* synthetic */ InAppNotificationsRepository serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppNotificationsRepository$fetchAndSaveInAppMessage$1(InAppNotificationsRepository inAppNotificationsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = inAppNotificationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4981fetchAndSaveInAppMessage0E7RQCE = this.serializer.m4981fetchAndSaveInAppMessage0E7RQCE(null, null, this);
        if (objM4981fetchAndSaveInAppMessage0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4981fetchAndSaveInAppMessage0E7RQCE);
        }
        int i2 = RatingCompat;
        int i3 = i2 + 29;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = i2 + 93;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM4981fetchAndSaveInAppMessage0E7RQCE;
    }
}
