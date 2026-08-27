package o;

/* JADX INFO: loaded from: classes.dex */
public final class getCenter {
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl IconCompatParcelizer;
    public final getPlatformAndroidManager serializer = androidx.compose.runtime.CompositionKt.read(0);

    public final boolean IconCompatParcelizer() {
        return (((onHideTranslationui) this.serializer).serializer() & 4) != 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (((onHideTranslationui) this.serializer).serializer() & 1) != 0;
    }

    public final boolean serializer() {
        return (((onHideTranslationui) this.serializer).serializer() & 2) != 0;
    }

    public getCenter(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.IconCompatParcelizer = mutableInteractionSourceImpl;
    }
}
