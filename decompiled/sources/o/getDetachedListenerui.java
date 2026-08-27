package o;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class getDetachedListenerui {
    public final TextClassification IconCompatParcelizer;
    public final CharSequence serializer;
    public final long write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((androidx.compose.ui.text.TextRange.m3077hashCodeimpl(this.write) + (iHashCode * 31)) * 31);
    }

    public getDetachedListenerui(CharSequence charSequence, long j, TextClassification textClassification) {
        this.serializer = charSequence;
        this.write = j;
        this.IconCompatParcelizer = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDetachedListenerui)) {
            return false;
        }
        getDetachedListenerui getdetachedlistenerui = (getDetachedListenerui) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getdetachedlistenerui.serializer}, getCieXyz.write())).booleanValue() || !androidx.compose.ui.text.TextRange.m3069equalsimpl0(this.write, getdetachedlistenerui.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getdetachedlistenerui.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.serializer) + ", selection=" + ((Object) androidx.compose.ui.text.TextRange.m3079toStringimpl(this.write)) + ", textClassification=" + this.IconCompatParcelizer + ')';
    }
}
