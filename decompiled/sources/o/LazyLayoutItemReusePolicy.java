package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyLayoutItemReusePolicy {
    public static final androidx.compose.ui.Modifier write(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        androidx.compose.ui.Modifier getslotstoretain;
        if (z) {
            getslotstoretain = new getSlotsToRetain(mutableInteractionSourceImpl);
        } else {
            getslotstoretain = androidx.compose.ui.Modifier.Companion;
        }
        return modifier.then(getslotstoretain);
    }
}
