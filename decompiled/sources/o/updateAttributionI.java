package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class updateAttributionI extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ com.airbnb.lottie.parser.DropShadowEffect write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateAttributionI(com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = dropShadowEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objHasTimeRemaining = this.write.hasTimeRemaining(null, this);
        int i4 = IconCompatParcelizer + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objHasTimeRemaining;
    }
}
