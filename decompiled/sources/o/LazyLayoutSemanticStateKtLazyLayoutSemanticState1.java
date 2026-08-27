package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutSemanticStateKtLazyLayoutSemanticState1 {
    public final androidx.compose.ui.unit.Density IconCompatParcelizer;
    public final Context RemoteActionCompatParcelizer;
    public final long read;
    public final SwitchKt serializer;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.serializer.hashCode() + MediaSessionCompatQueueItem.IconCompatParcelizer((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31, 31, this.read);
    }

    public LazyLayoutSemanticStateKtLazyLayoutSemanticState1(Context context, androidx.compose.ui.unit.Density density, long j, SwitchKt switchKt) {
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = density;
        this.read = j;
        this.serializer = switchKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LazyLayoutSemanticStateKtLazyLayoutSemanticState1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LazyLayoutSemanticStateKtLazyLayoutSemanticState1 lazyLayoutSemanticStateKtLazyLayoutSemanticState1 = (LazyLayoutSemanticStateKtLazyLayoutSemanticState1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || !androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.read)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.serializer}, getCieXyz.write())).booleanValue();
    }
}
