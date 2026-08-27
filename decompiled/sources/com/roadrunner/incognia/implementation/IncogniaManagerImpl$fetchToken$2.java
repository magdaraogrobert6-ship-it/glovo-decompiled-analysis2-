package com.roadrunner.incognia.implementation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.Incognia;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class IncogniaManagerImpl$fetchToken$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ IncogniaManagerImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IncogniaManagerImpl$fetchToken$2(IncogniaManagerImpl incogniaManagerImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = incogniaManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 53;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        IncogniaManagerImpl incogniaManagerImpl = this.serializer;
        if (i4 == 0) {
            return new IncogniaManagerImpl$fetchToken$2(incogniaManagerImpl, shortNewsContentCardView, 0);
        }
        IncogniaManagerImpl$fetchToken$2 incogniaManagerImpl$fetchToken$2 = new IncogniaManagerImpl$fetchToken$2(incogniaManagerImpl, shortNewsContentCardView, 1);
        int i5 = write + 69;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return incogniaManagerImpl$fetchToken$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 115;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((IncogniaManagerImpl$fetchToken$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((IncogniaManagerImpl$fetchToken$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 47;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        IncogniaManagerImpl incogniaManagerImpl = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                int i4 = write + 69;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                IncogniaInitializerImpl incogniaInitializerImpl = incogniaManagerImpl.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = 1;
                obj = incogniaInitializerImpl.checkIfIncogniaEnabledInitIfRequired("", this);
                if (obj == coroutineSingletons) {
                    int i5 = write + 123;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return coroutineSingletons;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("Clear accountId start", new Object[0]);
                Incognia.clearAccountId();
                forest.IconCompatParcelizer("Clear accountId end", new Object[0]);
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            IncogniaInitializerImpl incogniaInitializerImpl2 = incogniaManagerImpl.MediaMetadataCompat;
            this.RemoteActionCompatParcelizer = 1;
            obj = incogniaInitializerImpl2.checkIfIncogniaEnabledInitIfRequired("", this);
            if (obj != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i7 == 2) {
                int i8 = write + 117;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        }
        return null;
        if (((Boolean) obj).booleanValue()) {
            incogniaManagerImpl.write.logEvent("incognia_token_trigger", null);
            getAllSemanticsNodesToMap getallsemanticsnodestomap = incogniaManagerImpl.MediaSessionCompatQueueItem;
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(incogniaManagerImpl, shortNewsContentCardView, 14);
            this.RemoteActionCompatParcelizer = 2;
            Object objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_incognia_fetch_token", mapboxNavigation$parsing$2, this);
            if (objOfSuspend != coroutineSingletons2) {
                return objOfSuspend;
            }
            return coroutineSingletons2;
        }
        return null;
    }
}
