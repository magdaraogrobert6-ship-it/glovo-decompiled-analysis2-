package o;

import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setDocumentLocator extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ WebChatNativeAssetRepositoryImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDocumentLocator(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = webChatNativeAssetRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.downloadAsset(null, this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.read.downloadAsset(null, this);
        throw null;
    }
}
