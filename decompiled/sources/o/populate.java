package o;

/* JADX INFO: loaded from: classes.dex */
public interface populate extends PopulateViewStructure_androidKtpopulate7 {
    @Override // o.onViewAttachedToWindow
    default Object getValue() {
        return Float.valueOf(((getContentCaptureSessionui) this).serializer());
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    default void setValue(Object obj) {
        ((getContentCaptureSessionui) this).IconCompatParcelizer(((Number) obj).floatValue());
    }
}
