package com.roadrunner.rider.recruitment.accountcreation.password_creation.data;

import androidx.compose.ui.graphics.Fields;
import io.sentry.util.network.NetworkBody;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationRepository$createAccount$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ NetworkBody serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCreationRepository$createAccount$1(NetworkBody networkBody, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = networkBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5141createAccountbMdYcbs$implementation = this.serializer.m5141createAccountbMdYcbs$implementation(null, null, null, null, null, null, this);
        if (objM5141createAccountbMdYcbs$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 1;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return objM5141createAccountbMdYcbs$implementation;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5141createAccountbMdYcbs$implementation);
        int i3 = write + 121;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
