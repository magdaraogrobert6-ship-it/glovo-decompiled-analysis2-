package o;

import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaremoveGlobalCallbackParameters28 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public TokenRegistryApiRequest IconCompatParcelizer;
    public final /* synthetic */ TokenRegistryApiRequest read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaremoveGlobalCallbackParameters28(TokenRegistryApiRequest tokenRegistryApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = tokenRegistryApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objUpdatePushToken = this.read.updatePushToken(null, this);
        int i4 = MediaMetadataCompat + 113;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objUpdatePushToken;
    }
}
