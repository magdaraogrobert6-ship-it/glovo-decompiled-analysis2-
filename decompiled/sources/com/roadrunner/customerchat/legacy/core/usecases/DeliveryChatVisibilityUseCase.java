package com.roadrunner.customerchat.legacy.core.usecases;

import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.domain.usecase.ObservableUseCase;
import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableFromCallable;
import java.util.concurrent.Callable;
import o.TextUnitType;
import o.getPivotOffsetF1C5BW0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryChatVisibilityUseCase extends ObservableUseCase {
    private static int read = 1;
    private static int write;
    public final TextUnitType RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryChatVisibilityUseCase(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, TextUnitType textUnitType) {
        super(((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        textUnitType.getClass();
        this.RemoteActionCompatParcelizer = textUnitType;
    }

    @Override // com.roadrunner.domain.usecase.ObservableUseCase
    public final Flowable write(Object obj) {
        int i = 2 % 2;
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Callable callable = new Callable() { // from class: o.getWindowSize
            private static int read = 1;
            private static int serializer;

            /* JADX WARN: Code duplicated, block: B:7:0x002d  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                int i2 = 2 % 2;
                if (zBooleanValue) {
                    int i3 = read + 59;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (((ChatDeliveryRepositoryImpl) this.RemoteActionCompatParcelizer).read().isEmpty()) {
                        z = false;
                    } else {
                        int i5 = serializer + 83;
                        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        int i2 = Flowable.write;
        FlowableFromCallable flowableFromCallable = new FlowableFromCallable(callable);
        int i3 = read + 95;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return flowableFromCallable;
    }
}
