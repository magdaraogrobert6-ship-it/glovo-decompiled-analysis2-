package o;

import com.huawei.location.ut;

/* JADX INFO: loaded from: classes2.dex */
public final class internalOnLayoutui extends internalOnMeasureui {
    public createComposition RemoteActionCompatParcelizer;
    public onAttachedToWindow read;

    @Override // o.internalOnMeasureui
    public final onAttachedToWindow write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof internalOnLayoutui)) {
            return false;
        }
        internalOnLayoutui internalonlayoutui = (internalOnLayoutui) obj;
        createComposition createcomposition = internalonlayoutui.RemoteActionCompatParcelizer;
        if (hashCode() != internalonlayoutui.hashCode()) {
            return false;
        }
        createComposition createcomposition2 = this.RemoteActionCompatParcelizer;
        return (createcomposition2 != null || createcomposition == null) && (createcomposition2 == null || createcomposition2.equals(createcomposition)) && this.read.equals(internalonlayoutui.read);
    }

    public final int hashCode() {
        createComposition createcomposition = this.RemoteActionCompatParcelizer;
        return this.read.read.hashCode() + (createcomposition != null ? createcomposition.hashCode() : 0);
    }

    public internalOnLayoutui(ut utVar, com.google.firebase.inappmessaging.model.MessageType messageType) {
        super(utVar, messageType);
    }
}
