package com.incognia.internal;

import com.incognia.RequestTokenWithStatus;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class oqk extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ createInAppMessageEventSubscriber BGx;
    public final /* synthetic */ CountDownLatch mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqk(createInAppMessageEventSubscriber createinappmessageeventsubscriber, CountDownLatch countDownLatch) {
        super(1);
        this.BGx = createinappmessageeventsubscriber;
        this.mbG = countDownLatch;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.BGx.IconCompatParcelizer = (RequestTokenWithStatus) obj;
        this.mbG.countDown();
        return createFromParcel.INSTANCE;
    }
}
