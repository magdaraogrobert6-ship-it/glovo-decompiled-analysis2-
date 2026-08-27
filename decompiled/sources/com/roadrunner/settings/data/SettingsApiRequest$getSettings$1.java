package com.roadrunner.settings.data;

import androidx.compose.ui.graphics.Fields;
import io.socket.parser.IOParser$Decoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsApiRequest$getSettings$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ IOParser$Decoder serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsApiRequest$getSettings$1(IOParser$Decoder iOParser$Decoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = iOParser$Decoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5142getSettingsIoAF18A = this.serializer.m5142getSettingsIoAF18A(this);
        if (objM5142getSettingsIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5142getSettingsIoAF18A);
        }
        int i4 = IconCompatParcelizer + 101;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM5142getSettingsIoAF18A;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
