package com.roadrunner.phonenumber.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneNumberRepository$getPhoneNumber$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ GetAppStateImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberRepository$getPhoneNumber$1(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5007getPhoneNumbergIAlus$implementation = this.serializer.m5007getPhoneNumbergIAlus$implementation(0L, this);
        if (objM5007getPhoneNumbergIAlus$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5007getPhoneNumbergIAlus$implementation);
        }
        int i4 = write + 1;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return objM5007getPhoneNumbergIAlus$implementation;
    }
}
