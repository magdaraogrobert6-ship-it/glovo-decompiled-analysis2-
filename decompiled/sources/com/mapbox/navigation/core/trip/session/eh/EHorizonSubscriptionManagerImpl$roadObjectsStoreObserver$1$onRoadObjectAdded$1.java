package com.mapbox.navigation.core.trip.session.eh;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $roadObjectId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(int i, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.$roadObjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.$r8$classId;
        String str = this.$roadObjectId;
        if (i == 0) {
            EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1 = new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(0, str, shortNewsContentCardView);
            eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1.L$0 = obj;
            return eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1;
        }
        int i2 = 1;
        if (i != 1) {
            EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$2 = new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(2, str, shortNewsContentCardView);
            eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$2.L$0 = obj;
            return eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$2;
        }
        EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$3 = new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(i2, str, shortNewsContentCardView);
        eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$3.L$0 = obj;
        return eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            if (obj != null) {
                throw new ClassCastException();
            }
            ((EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            throw null;
        }
        if (i != 1) {
            if (obj != null) {
                throw new ClassCastException();
            }
            ((EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            throw null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        ((EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw c8$$ExternalSyntheticOutline0.m(this.L$0);
        }
        if (i != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw c8$$ExternalSyntheticOutline0.m(this.L$0);
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        throw c8$$ExternalSyntheticOutline0.m(this.L$0);
    }
}
