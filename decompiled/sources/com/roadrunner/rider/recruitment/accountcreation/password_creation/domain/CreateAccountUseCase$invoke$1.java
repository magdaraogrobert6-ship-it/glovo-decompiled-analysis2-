package com.roadrunner.rider.recruitment.accountcreation.password_creation.domain;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateAccountUseCase$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ C$b read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAccountUseCase$invoke$1(C$b c$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = c$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5074invokebMdYcbs$implementation = this.read.m5074invokebMdYcbs$implementation(null, null, null, null, null, null, this);
        if (objM5074invokebMdYcbs$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5074invokebMdYcbs$implementation);
        }
        int i4 = RemoteActionCompatParcelizer + 119;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM5074invokebMdYcbs$implementation;
        }
        throw null;
    }
}
