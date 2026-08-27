package com.qualtrics.digital;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ClientSideInterceptUtils$$ExternalSyntheticLambda0 implements IHydratedDCFRequest {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IMakeDCFRequestCallback f$0;
    public final /* synthetic */ HashMap f$1;

    public /* synthetic */ ClientSideInterceptUtils$$ExternalSyntheticLambda0(IMakeDCFRequestCallback iMakeDCFRequestCallback, HashMap map, int i) {
        this.$r8$classId = i;
        this.f$0 = iMakeDCFRequestCallback;
        this.f$1 = map;
    }

    @Override // com.qualtrics.digital.IHydratedDCFRequest
    public final void run() {
        int i = this.$r8$classId;
        HashMap map = this.f$1;
        IMakeDCFRequestCallback iMakeDCFRequestCallback = this.f$0;
        if (i != 0) {
            iMakeDCFRequestCallback.run(map);
        } else {
            iMakeDCFRequestCallback.run(map);
        }
    }
}
