package com.deliveryhero.fwf_customer_profile;

import com.deliveryhero.fwf_client.model.SyncResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ShortNewsContentCardView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CustomerProfileClient$startUserProfileTimer$userProfileTimer$1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        return ((CustomerProfileClient) this.MediaMetadataCompat).loadUserProfile(shortNewsContentCardView);
    }

    public CustomerProfileClient$startUserProfileTimer$userProfileTimer$1(Object obj) {
        super(1, 0, CustomerProfileClient.class, obj, "loadUserProfile", "loadUserProfile(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }
}
