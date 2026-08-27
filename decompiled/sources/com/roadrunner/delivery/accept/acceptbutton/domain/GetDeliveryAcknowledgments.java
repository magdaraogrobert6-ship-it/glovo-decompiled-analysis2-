package com.roadrunner.delivery.accept.acceptbutton.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidView;
import o.SpanStyleSaverlambda1;
import o.accessrequireViewFactoryHolder;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onItemDismiss;
import o.setFitInsetsSides;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDeliveryAcknowledgments {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final accessrequireViewFactoryHolder write;

    public GetDeliveryAcknowledgments(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        this.write = accessrequireviewfactoryholder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        SpanStyleSaverlambda1 spanStyleSaverlambda1;
        List list;
        int i = 2 % 2;
        if (continuationImpl instanceof SpanStyleSaverlambda1) {
            spanStyleSaverlambda1 = (SpanStyleSaverlambda1) continuationImpl;
            int i2 = spanStyleSaverlambda1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spanStyleSaverlambda1.read = i2 - Integer.MIN_VALUE;
            } else {
                spanStyleSaverlambda1 = new SpanStyleSaverlambda1(this, continuationImpl);
            }
        } else {
            spanStyleSaverlambda1 = new SpanStyleSaverlambda1(this, continuationImpl);
        }
        Object objFirstOrNull = spanStyleSaverlambda1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = spanStyleSaverlambda1.read;
        Object obj = null;
        if (i3 != 0) {
            int i4 = serializer + 47;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$4 = ((StateProviderImpl) ((AndroidView) this.write)).RemoteActionCompatParcelizer;
            spanStyleSaverlambda1.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(stateProviderImpl$special$$inlined$map$4, spanStyleSaverlambda1);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        onItemDismiss onitemdismiss = (onItemDismiss) objFirstOrNull;
        if (onitemdismiss != null) {
            int i6 = serializer + 113;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                boolean z = onitemdismiss.IconCompatParcelizer instanceof isItemDismissable;
                obj.hashCode();
                throw null;
            }
            Object obj2 = onitemdismiss.IconCompatParcelizer;
            setFitInsetsSides setfitinsetssides = (setFitInsetsSides) (obj2 instanceof isItemDismissable ? null : obj2);
            if (setfitinsetssides != null && (list = setfitinsetssides.acknowledgements) != null) {
                return list;
            }
        }
        return instance_delegatelambda0.write;
    }
}
