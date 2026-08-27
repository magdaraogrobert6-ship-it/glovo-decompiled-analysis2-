package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class SmallPersistentVector {
    public static final androidx.compose.ui.Modifier write(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl) {
        return modifier.then(new PersistentVector(bringIntoViewRequesterImpl));
    }
}
