package com.roadrunner.face.verification.navigation.compose;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getStatusBarBackground;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relativeMoveTo;
import o.setFillTypeoQ8Xj4U;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ relativeMoveTo IconCompatParcelizer;
    public final /* synthetic */ getStatusBarBackground read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1(getStatusBarBackground getstatusbarbackground, relativeMoveTo relativemoveto, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = getstatusbarbackground;
        this.IconCompatParcelizer = relativemoveto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        relativeMoveTo relativemoveto = this.IconCompatParcelizer;
        getStatusBarBackground getstatusbarbackground = this.read;
        if (i4 != 0) {
            return new IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1(getstatusbarbackground, relativemoveto, shortNewsContentCardView, 1);
        }
        IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1 identityNavigationHostKt$IdentityNavigationHost$2$1$1$1 = new IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1(getstatusbarbackground, relativemoveto, shortNewsContentCardView, 0);
        int i5 = RemoteActionCompatParcelizer + 43;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return identityNavigationHostKt$IdentityNavigationHost$2$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            ((IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 91;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        relativeMoveTo relativemoveto = this.IconCompatParcelizer;
        getStatusBarBackground getstatusbarbackground = this.read;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getstatusbarbackground.getClass();
            relativeMoveTo.IconCompatParcelizer(relativemoveto, "selfie-camera", null, 6);
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getstatusbarbackground.getClass();
        relativeMoveTo.IconCompatParcelizer(relativemoveto, "identity-confirmation?userId={userId},token={token},invocationSite={invocationSite}", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(18)), 4);
        int i4 = serializer + 59;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
