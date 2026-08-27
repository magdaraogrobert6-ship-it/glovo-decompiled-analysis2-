package com.roadrunner.rider.safety.authentication.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getIsClick;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyRepository$getSafetyTrackingPermission$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ RiderSafetyRepository read;
    public int serializer;
    public getIsClick write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderSafetyRepository$getSafetyTrackingPermission$1(RiderSafetyRepository riderSafetyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = riderSafetyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5022getSafetyTrackingPermissionIoAF18A = this.read.m5022getSafetyTrackingPermissionIoAF18A(this);
        if (objM5022getSafetyTrackingPermissionIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5022getSafetyTrackingPermissionIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5022getSafetyTrackingPermissionIoAF18A);
        int i4 = MediaBrowserCompatMediaItem + 115;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
