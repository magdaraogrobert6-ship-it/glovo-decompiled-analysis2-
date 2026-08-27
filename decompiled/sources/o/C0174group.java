package o;

import coil3.Extras$Key;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: o.group, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0174group extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ Extras$Key RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174group(Extras$Key extras$Key, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = extras$Key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.getNextEvents(this);
    }
}
