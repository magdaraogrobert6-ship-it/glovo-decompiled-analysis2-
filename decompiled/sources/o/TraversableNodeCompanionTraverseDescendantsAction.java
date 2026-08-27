package o;

import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TraversableNodeCompanionTraverseDescendantsAction implements Function, Consumer {
    public final /* synthetic */ ParentDataModifierDefaultImpls IconCompatParcelizer;

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        this.IconCompatParcelizer.IconCompatParcelizer(obj);
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z = th instanceof Exception;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.IconCompatParcelizer;
        if (z) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer((Exception) th);
        } else {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(new RuntimeException(th));
        }
        return MaybeEmpty.IconCompatParcelizer;
    }
}
