package com.roadrunner.sidemenu.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;
import o.r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuApiRequest {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk serializer;
    public final ExecuteApiRequest write;

    public SideMenuApiRequest(r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk r8lambdagplbn0uaazb2mygq2phh4h1kok, ExecuteApiRequest executeApiRequest) {
        r8lambdagplbn0uaazb2mygq2phh4h1kok.getClass();
        executeApiRequest.getClass();
        this.serializer = r8lambdagplbn0uaazb2mygq2phh4h1kok;
        this.write = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: getSideMenu-IoAF18A, reason: not valid java name */
    public final Object m5067getSideMenuIoAF18A(ContinuationImpl continuationImpl) {
        SideMenuApiRequest$getSideMenu$1 sideMenuApiRequest$getSideMenu$1;
        int i = 2 % 2;
        int i2 = read + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SideMenuApiRequest$getSideMenu$1) {
            sideMenuApiRequest$getSideMenu$1 = (SideMenuApiRequest$getSideMenu$1) continuationImpl;
            int i4 = sideMenuApiRequest$getSideMenu$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 107;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                sideMenuApiRequest$getSideMenu$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                sideMenuApiRequest$getSideMenu$1 = new SideMenuApiRequest$getSideMenu$1(this, continuationImpl);
            }
        } else {
            sideMenuApiRequest$getSideMenu$1 = new SideMenuApiRequest$getSideMenu$1(this, continuationImpl);
        }
        Object obj = sideMenuApiRequest$getSideMenu$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = sideMenuApiRequest$getSideMenu$1.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 25);
            sideMenuApiRequest$getSideMenu$1.serializer = 1;
            Object objM4875invokegIAlus = this.write.m4875invokegIAlus(mapboxNavigation$parsing$2, sideMenuApiRequest$getSideMenu$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i8 = RemoteActionCompatParcelizer + 43;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }
}
