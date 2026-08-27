package com.roadrunner.delivery.accept.autoaccept.preferences.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.copy2BkPm_w;
import o.getNoActiveChildannotations;
import o.isRoot;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesDataStoreImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final performCustomExitMxy_nc0 read;
    public final isRoot serializer;
    public final isRoot write;

    public AutoAcceptPreferencesDataStoreImpl(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        performcustomexitmxy_nc0.getClass();
        this.read = performcustomexitmxy_nc0;
        this.write = new isRoot("end_shift_toggle_checked");
        this.serializer = new isRoot("auto_accept_toggle_checked");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final Object getEndShiftOpted(ContinuationImpl continuationImpl) {
        copy2BkPm_w copy2bkpm_w;
        int i;
        Object objFirst;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            if (continuationImpl instanceof copy2BkPm_w) {
                copy2bkpm_w = (copy2BkPm_w) continuationImpl;
                i = copy2bkpm_w.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i5 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    copy2bkpm_w.read = i - Integer.MIN_VALUE;
                }
            }
            objFirst = copy2bkpm_w.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = copy2bkpm_w.read;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
                Flow flowSerializer = this.read.serializer();
                copy2bkpm_w.read = 1;
                objFirst = FlowKt.first(flowSerializer, copy2bkpm_w);
                if (objFirst == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            }
            Boolean bool = (Boolean) ((getNoActiveChildannotations) objFirst).serializer(this.write);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
        int i7 = 88 / 0;
        if (continuationImpl instanceof copy2BkPm_w) {
            copy2bkpm_w = (copy2BkPm_w) continuationImpl;
            i = copy2bkpm_w.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i8 = RemoteActionCompatParcelizer + 61;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                copy2bkpm_w.read = i - Integer.MIN_VALUE;
            }
        }
        objFirst = copy2bkpm_w.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = copy2bkpm_w.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer2 = this.read.serializer();
            copy2bkpm_w.read = 1;
            objFirst = FlowKt.first(flowSerializer2, copy2bkpm_w);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        Boolean bool2 = (Boolean) ((getNoActiveChildannotations) objFirst).serializer(this.write);
        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        copy2bkpm_w = new copy2BkPm_w(this, continuationImpl);
        objFirst = copy2bkpm_w.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = copy2bkpm_w.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer3 = this.read.serializer();
            copy2bkpm_w.read = 1;
            objFirst = FlowKt.first(flowSerializer3, copy2bkpm_w);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        Boolean bool3 = (Boolean) ((getNoActiveChildannotations) objFirst).serializer(this.write);
        return Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
    }
}
