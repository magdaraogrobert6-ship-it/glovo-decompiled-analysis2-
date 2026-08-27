package com.incognia.internal;

import com.google.android.gms.tasks.OnFailureListener;
import o.PinnableContainerPinnedHandle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2w$$ExternalSyntheticLambda4 implements OnFailureListener, PinnableContainerPinnedHandle {
    public final /* synthetic */ C2w f$0;
    public final /* synthetic */ THn f$1;

    public /* synthetic */ C2w$$ExternalSyntheticLambda4(C2w c2w, THn tHn) {
        this.f$0 = c2w;
        this.f$1 = tHn;
    }

    @Override // o.PinnableContainerPinnedHandle
    public void onCanceled() {
        C2w.mbG(this.f$0, this.f$1);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        C2w.BGx(this.f$0, this.f$1, exc);
    }
}
