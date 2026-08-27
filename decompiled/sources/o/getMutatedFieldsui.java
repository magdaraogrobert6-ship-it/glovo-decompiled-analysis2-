package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.koin.androidx.viewmodel.GetViewModelKt;

/* JADX INFO: loaded from: classes.dex */
public final class getMutatedFieldsui extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return GetViewModelKt.access$toRequest(null, this);
    }

    public getMutatedFieldsui(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
