package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getDataStore extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public String IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ androidx.lifecycle.BlockRunner serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDataStore(androidx.lifecycle.BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.invoke(null, null, this);
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(null, null, this);
        int i3 = MediaMetadataCompat + 25;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
