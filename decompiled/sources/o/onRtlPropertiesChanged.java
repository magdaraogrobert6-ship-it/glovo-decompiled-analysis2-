package o;

import com.huawei.location.ut;

/* JADX INFO: loaded from: classes2.dex */
public final class onRtlPropertiesChanged extends internalOnMeasureui {
    public final setParentCompositionContext IconCompatParcelizer;
    public final setParentCompositionContext RemoteActionCompatParcelizer;
    public final createComposition read;
    public final String serializer;
    public final onAttachedToWindow write;

    public final int hashCode() {
        setParentCompositionContext setparentcompositioncontext = this.RemoteActionCompatParcelizer;
        int iHashCode = setparentcompositioncontext != null ? setparentcompositioncontext.hashCode() : 0;
        createComposition createcomposition = this.read;
        int iHashCode2 = createcomposition != null ? createcomposition.hashCode() : 0;
        onAttachedToWindow onattachedtowindow = this.write;
        return this.serializer.hashCode() + this.IconCompatParcelizer.hashCode() + iHashCode + iHashCode2 + (onattachedtowindow != null ? onattachedtowindow.read.hashCode() : 0);
    }

    @Override // o.internalOnMeasureui
    public final onAttachedToWindow write() {
        return this.write;
    }

    public onRtlPropertiesChanged(ut utVar, setParentCompositionContext setparentcompositioncontext, setParentCompositionContext setparentcompositioncontext2, onAttachedToWindow onattachedtowindow, createComposition createcomposition, String str) {
        super(utVar, com.google.firebase.inappmessaging.model.MessageType.MODAL);
        this.IconCompatParcelizer = setparentcompositioncontext;
        this.RemoteActionCompatParcelizer = setparentcompositioncontext2;
        this.write = onattachedtowindow;
        this.read = createcomposition;
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onRtlPropertiesChanged)) {
            return false;
        }
        onRtlPropertiesChanged onrtlpropertieschanged = (onRtlPropertiesChanged) obj;
        onAttachedToWindow onattachedtowindow = onrtlpropertieschanged.write;
        createComposition createcomposition = onrtlpropertieschanged.read;
        setParentCompositionContext setparentcompositioncontext = onrtlpropertieschanged.RemoteActionCompatParcelizer;
        if (hashCode() != onrtlpropertieschanged.hashCode()) {
            return false;
        }
        setParentCompositionContext setparentcompositioncontext2 = this.RemoteActionCompatParcelizer;
        if ((setparentcompositioncontext2 == null && setparentcompositioncontext != null) || (setparentcompositioncontext2 != null && !setparentcompositioncontext2.equals(setparentcompositioncontext))) {
            return false;
        }
        createComposition createcomposition2 = this.read;
        if ((createcomposition2 == null && createcomposition != null) || (createcomposition2 != null && !createcomposition2.equals(createcomposition))) {
            return false;
        }
        onAttachedToWindow onattachedtowindow2 = this.write;
        return (onattachedtowindow2 != null || onattachedtowindow == null) && (onattachedtowindow2 == null || onattachedtowindow2.equals(onattachedtowindow)) && this.IconCompatParcelizer.equals(onrtlpropertieschanged.IconCompatParcelizer) && this.serializer.equals(onrtlpropertieschanged.serializer);
    }
}
