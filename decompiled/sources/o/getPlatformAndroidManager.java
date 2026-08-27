package o;

/* JADX INFO: loaded from: classes.dex */
public interface getPlatformAndroidManager extends PopulateViewStructure_androidKtpopulate7 {
    @Override // o.onViewAttachedToWindow
    default Object getValue() {
        return Integer.valueOf(((onHideTranslationui) this).serializer());
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    default void setValue(Object obj) {
        ((onHideTranslationui) this).serializer(((Number) obj).intValue());
    }
}
