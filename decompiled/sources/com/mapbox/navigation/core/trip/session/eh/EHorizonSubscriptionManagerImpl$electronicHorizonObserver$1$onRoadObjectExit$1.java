package com.mapbox.navigation.core.trip.session.eh;

import coil3.ExtrasKt;
import com.google.android.gms.internal.mlkit_vision_face.zzli;
import com.mapbox.navigator.RoadObjectEnterExitInfo;
import com.mapbox.navigator.RoadObjectType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RoadObjectEnterExitInfo $roadObjectInfo;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1(RoadObjectEnterExitInfo roadObjectEnterExitInfo, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.$roadObjectInfo = roadObjectEnterExitInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.$r8$classId;
        RoadObjectEnterExitInfo roadObjectEnterExitInfo = this.$roadObjectInfo;
        if (i != 0) {
            EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1 eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1 = new EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1(roadObjectEnterExitInfo, shortNewsContentCardView, 1);
            eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1.L$0 = obj;
            return eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1;
        }
        EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1 eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$2 = new EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1(roadObjectEnterExitInfo, shortNewsContentCardView, 0);
        eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$2.L$0 = obj;
        return eHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            if (obj != null) {
                throw new ClassCastException();
            }
            ((EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            throw null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        ((EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RoadObjectEnterExitInfo roadObjectEnterExitInfo = this.$roadObjectInfo;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            roadObjectEnterExitInfo.getRoadObjectId().getClass();
            roadObjectEnterExitInfo.getEnterFromStartOrExitFromEnd();
            RoadObjectType type = roadObjectEnterExitInfo.getType();
            type.getClass();
            zzli.mapToRoadObjectType(type);
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (this.L$0 != null) {
            throw new ClassCastException();
        }
        roadObjectEnterExitInfo.getRoadObjectId().getClass();
        roadObjectEnterExitInfo.getEnterFromStartOrExitFromEnd();
        RoadObjectType type2 = roadObjectEnterExitInfo.getType();
        type2.getClass();
        zzli.mapToRoadObjectType(type2);
        throw null;
    }
}
