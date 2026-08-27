package o;

import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class addGroup extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ DefaultPerseusConfigProvider serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addGroup(DefaultPerseusConfigProvider defaultPerseusConfigProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = defaultPerseusConfigProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.getConfig(this);
    }
}
