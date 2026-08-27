package com.sentiance.sdk.crashloop;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkInitGate$fetchSdkInitConfig$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $whenDone;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU r8lambdahx9hhykrmmijaguk5gvk7zxhzu = (r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU) obj;
        r8lambdahx9hhykrmmijaguk5gvk7zxhzu.getClass();
        if ((r8lambdahx9hhykrmmijaguk5gvk7zxhzu instanceof r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU.write) && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$whenDone) != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU.write) r8lambdahx9hhykrmmijaguk5gvk7zxhzu).serializer());
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkInitGate$fetchSdkInitConfig$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.$whenDone = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
