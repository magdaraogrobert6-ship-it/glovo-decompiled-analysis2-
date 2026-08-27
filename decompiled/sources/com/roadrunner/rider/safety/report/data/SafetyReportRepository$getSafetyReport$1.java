package com.roadrunner.rider.safety.report.data;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SafetyReportRepository$getSafetyReport$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ C$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyReportRepository$getSafetyReport$1(C$b c$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = c$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.write.m5073getSafetyReportIoAF18A$implementation(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5073getSafetyReportIoAF18A$implementation = this.write.m5073getSafetyReportIoAF18A$implementation(this);
        if (objM5073getSafetyReportIoAF18A$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5073getSafetyReportIoAF18A$implementation);
        }
        int i3 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM5073getSafetyReportIoAF18A$implementation;
    }
}
