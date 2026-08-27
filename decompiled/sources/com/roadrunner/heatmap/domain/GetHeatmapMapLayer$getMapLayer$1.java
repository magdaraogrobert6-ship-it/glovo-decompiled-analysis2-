package com.roadrunner.heatmap.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.VelocityKt;
import o.WorkDatabase_Impl;
import o.WorkerWrapperlaunch1;
import o.createFromParcel;
import o.f9;
import o.ffExternalSyntheticOutline0;
import o.g0ExternalSyntheticLambda1;
import o.g5;
import o.instance_delegatelambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.unaryMinus9UxMQ8M;

/* JADX INFO: loaded from: classes3.dex */
public final class GetHeatmapMapLayer$getMapLayer$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetHeatmapMapLayer$getMapLayer$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 117;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = 0;
        int i7 = 3;
        if (i5 == 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            GetHeatmapMapLayer$getMapLayer$1 getHeatmapMapLayer$getMapLayer$1 = new GetHeatmapMapLayer$getMapLayer$1(i7, i6, (ShortNewsContentCardView) obj3);
            getHeatmapMapLayer$getMapLayer$1.IconCompatParcelizer = (String) obj;
            getHeatmapMapLayer$getMapLayer$1.write = zBooleanValue;
            return getHeatmapMapLayer$getMapLayer$1.invokeSuspend(createfromparcel);
        }
        int i8 = 1;
        if (i5 == 1) {
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            GetHeatmapMapLayer$getMapLayer$1 getHeatmapMapLayer$getMapLayer$2 = new GetHeatmapMapLayer$getMapLayer$1(i7, i8, (ShortNewsContentCardView) obj3);
            getHeatmapMapLayer$getMapLayer$2.IconCompatParcelizer = (VelocityKt) obj;
            getHeatmapMapLayer$getMapLayer$2.write = zBooleanValue2;
            return getHeatmapMapLayer$getMapLayer$2.invokeSuspend(createfromparcel);
        }
        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
        GetHeatmapMapLayer$getMapLayer$1 getHeatmapMapLayer$getMapLayer$3 = new GetHeatmapMapLayer$getMapLayer$1(i7, i, (ShortNewsContentCardView) obj3);
        getHeatmapMapLayer$getMapLayer$3.IconCompatParcelizer = (WorkDatabase_Impl) obj;
        getHeatmapMapLayer$getMapLayer$3.write = zBooleanValue3;
        Object objInvokeSuspend = getHeatmapMapLayer$getMapLayer$3.invokeSuspend(createfromparcel);
        int i9 = serializer + 39;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 68 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        boolean z = false;
        boolean z2 = true;
        if (i2 == 0) {
            String str = (String) this.IconCompatParcelizer;
            boolean z3 = this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return (!z3 || str == null || str.length() == 0) ? new f9(instance_delegatelambda0.write) : new f9(SQLite.read(new g0ExternalSyntheticLambda1(g5.ALWAYS), new ffExternalSyntheticOutline0(str)));
        }
        if (i2 == 1) {
            VelocityKt velocityKt = (VelocityKt) this.IconCompatParcelizer;
            boolean z4 = this.write;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!(!z4) && !(!(velocityKt instanceof unaryMinus9UxMQ8M))) {
                int i3 = serializer + 123;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            }
            return Boolean.valueOf(z);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.IconCompatParcelizer;
        boolean z5 = this.write;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        switch (WorkerWrapperlaunch1.read[workDatabase_Impl.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                int i5 = serializer + 49;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z2 = z5;
                break;
            case 5:
            case 6:
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
        return Boolean.valueOf(z2);
    }
}
