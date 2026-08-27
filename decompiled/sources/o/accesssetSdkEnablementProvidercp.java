package o;

import coil3.ComponentRegistry$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetSdkEnablementProvidercp extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ComponentRegistry$Builder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssetSdkEnablementProvidercp(ComponentRegistry$Builder componentRegistry$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$zoneBoundary = ComponentRegistry$Builder.access$zoneBoundary(this.write, null, this);
        int i4 = RemoteActionCompatParcelizer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$zoneBoundary;
    }
}
