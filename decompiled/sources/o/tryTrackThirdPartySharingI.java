package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class tryTrackThirdPartySharingI extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public final /* synthetic */ com.airbnb.lottie.parser.DropShadowEffect serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tryTrackThirdPartySharingI(com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = dropShadowEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.startOrResume(null, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        this.serializer.startOrResume(null, this);
        obj2.hashCode();
        throw null;
    }
}
