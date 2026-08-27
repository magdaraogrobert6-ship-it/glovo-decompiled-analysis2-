package com.deliveryhero.performance.core.calculator;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.InnerShadowRendererProviderCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ InnerShadowRendererProviderCompanion serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(InnerShadowRendererProviderCompanion innerShadowRendererProviderCompanion, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = innerShadowRendererProviderCompanion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        InnerShadowRendererProviderCompanion innerShadowRendererProviderCompanion = this.serializer;
        if (i == 0) {
            return new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, 3) : new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, 2);
        }
        return new PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1(innerShadowRendererProviderCompanion, shortNewsContentCardView, i2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            return ((PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((PerformanceMetaDataProviderImpl$loadMetaData$2$1$ramSize$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.RemoteActionCompatParcelizer;
        InnerShadowRendererProviderCompanion innerShadowRendererProviderCompanion = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.write = 1;
                Object objWithContext = BuildersKt.withContext(innerShadowRendererProviderCompanion.read, new SingleProcessDataStore$data$1.AnonymousClass1(innerShadowRendererProviderCompanion, shortNewsContentCardView, 4), this);
                return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.write = 1;
                Object objWithContext2 = BuildersKt.withContext(innerShadowRendererProviderCompanion.read, new Recomposer$join$2(2, 1, null), this);
                return objWithContext2 == coroutineSingletons2 ? coroutineSingletons2 : objWithContext2;
            }
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.write = 1;
                Object objWithContext3 = BuildersKt.withContext(innerShadowRendererProviderCompanion.read, new MapLayersUiModel$1(innerShadowRendererProviderCompanion, null, 3), this);
                return objWithContext3 == coroutineSingletons3 ? coroutineSingletons3 : objWithContext3;
            }
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.write = 1;
            Object objWithContext4 = BuildersKt.withContext(innerShadowRendererProviderCompanion.read, new SimpleActor$offer$2(innerShadowRendererProviderCompanion, (ShortNewsContentCardView) null, 11), this);
            return objWithContext4 == coroutineSingletons4 ? coroutineSingletons4 : objWithContext4;
        }
        if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
