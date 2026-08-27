package com.sentiance.sdk.crashloop;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk;

/* JADX INFO: loaded from: classes3.dex */
public final class CrashLoopDetector$endCurrentSessionAndClearCache$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk this$0;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.this$0.IconCompatParcelizer.write();
        this.this$0.MediaSessionCompatToken = null;
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashLoopDetector$endCurrentSessionAndClearCache$1(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk) {
        super(1);
        this.this$0 = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk;
    }
}
