package com.roadrunner.settings.data;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsRepository$fetchSettings$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ N$b read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepository$fetchSettings$1(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 11;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5078fetchSettingsIoAF18A = this.read.m5078fetchSettingsIoAF18A(this);
        if (objM5078fetchSettingsIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5078fetchSettingsIoAF18A);
        }
        int i4 = serializer + 35;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5078fetchSettingsIoAF18A;
    }
}
