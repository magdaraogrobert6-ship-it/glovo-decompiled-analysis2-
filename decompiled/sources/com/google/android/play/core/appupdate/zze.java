package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
public final class zze extends ResultReceiver {
    public final /* synthetic */ ParentDataModifierDefaultImpls read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(Handler handler, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super(handler);
        this.read = parentDataModifierDefaultImpls;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.read;
        if (i == 1) {
            parentDataModifierDefaultImpls.write(-1);
        } else if (i != 2) {
            parentDataModifierDefaultImpls.write(1);
        } else {
            parentDataModifierDefaultImpls.write(0);
        }
    }
}
