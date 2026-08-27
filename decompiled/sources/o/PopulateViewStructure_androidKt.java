package o;

/* JADX INFO: loaded from: classes.dex */
public interface PopulateViewStructure_androidKt extends PopulateViewStructure_androidKtpopulate7 {
    @Override // o.onViewAttachedToWindow
    default Object getValue() {
        return Long.valueOf(((onCreateVirtualViewTranslationRequestsui) this).RemoteActionCompatParcelizer());
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    default void setValue(Object obj) {
        ((onCreateVirtualViewTranslationRequestsui) this).write(((Number) obj).longValue());
    }
}
