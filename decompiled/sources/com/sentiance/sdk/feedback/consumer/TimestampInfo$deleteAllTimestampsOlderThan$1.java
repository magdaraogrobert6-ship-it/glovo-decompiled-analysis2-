package com.sentiance.sdk.feedback.consumer;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class TimestampInfo$deleteAllTimestampsOlderThan$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ long $time;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        l.getClass();
        return Boolean.valueOf(l.longValue() < this.$time);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampInfo$deleteAllTimestampsOlderThan$1(long j) {
        super(1);
        this.$time = j;
    }
}
