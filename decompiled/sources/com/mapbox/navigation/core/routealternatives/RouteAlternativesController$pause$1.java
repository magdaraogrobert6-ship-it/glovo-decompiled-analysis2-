package com.mapbox.navigation.core.routealternatives;

import com.mapbox.navigation.utils.internal.ThreadController;
import io.grpc.internal.MetadataApplierImpl;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteAlternativesController$pause$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetadataApplierImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RouteAlternativesController$pause$1(MetadataApplierImpl metadataApplierImpl, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = metadataApplierImpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MetadataApplierImpl metadataApplierImpl = this.this$0;
        if (i == 0) {
            metadataApplierImpl.IconCompatParcelizer = false;
            return createfromparcel;
        }
        if (i == 1) {
            return ((ThreadController) metadataApplierImpl.MediaSessionCompatQueueItem).getMainScopeAndRootJob();
        }
        metadataApplierImpl.IconCompatParcelizer = true;
        return createfromparcel;
    }
}
