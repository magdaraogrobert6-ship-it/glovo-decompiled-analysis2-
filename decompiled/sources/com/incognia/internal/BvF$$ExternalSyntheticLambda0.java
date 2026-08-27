package com.incognia.internal;

import android.location.Location;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.function.Consumer;
import o.getChannelType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BvF$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;

    public /* synthetic */ BvF$$ExternalSyntheticLambda0(int i, Serializable serializable) {
        this.$r8$classId = i;
        this.f$0 = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Serializable serializable = this.f$0;
        if (i != 0) {
            ((LinkedList) serializable).addLast((getChannelType) obj);
        } else {
            BvF.BGx((io2) serializable, (Location) obj);
        }
    }
}
