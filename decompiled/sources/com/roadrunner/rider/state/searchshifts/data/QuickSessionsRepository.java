package com.roadrunner.rider.state.searchshifts.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickSessionsRepository {
    private static int read = 0;
    private static int write = 1;
    public final ExecuteApiRequest IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer = StateFlowKt.read(null);
    public final Lazy serializer;

    public QuickSessionsRepository(Lazy lazy, ExecuteApiRequest executeApiRequest) {
        this.serializer = lazy;
        this.IconCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: assign-yxL6bBk, reason: not valid java name */
    public final Object m5032assignyxL6bBk(int i, int i2, String str, String str2, ContinuationImpl continuationImpl) {
        QuickSessionsRepository$assign$1 quickSessionsRepository$assign$1;
        int i3 = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof QuickSessionsRepository$assign$1) {
            int i4 = read + 109;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = ((QuickSessionsRepository$assign$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            quickSessionsRepository$assign$1 = (QuickSessionsRepository$assign$1) continuationImpl;
            int i6 = quickSessionsRepository$assign$1.write;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                quickSessionsRepository$assign$1.write = i6 - Integer.MIN_VALUE;
            } else {
                quickSessionsRepository$assign$1 = new QuickSessionsRepository$assign$1(this, continuationImpl);
                int i7 = read + 109;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            quickSessionsRepository$assign$1 = new QuickSessionsRepository$assign$1(this, continuationImpl);
            int i9 = read + 109;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        QuickSessionsRepository$assign$1 quickSessionsRepository$assign$2 = quickSessionsRepository$assign$1;
        int i11 = read + 45;
        write = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        Object obj2 = quickSessionsRepository$assign$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = quickSessionsRepository$assign$2.write;
        if (i13 != 0) {
            if (i13 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        QuickSessionsRepository$assign$2 quickSessionsRepository$assign$3 = new QuickSessionsRepository$assign$2(this, i, i2, str, str2, null);
        quickSessionsRepository$assign$2.write = 1;
        Object objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(quickSessionsRepository$assign$3, quickSessionsRepository$assign$2);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i14 = read + 25;
        write = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            return coroutineSingletons;
        }
        obj.hashCode();
        throw null;
    }
}
