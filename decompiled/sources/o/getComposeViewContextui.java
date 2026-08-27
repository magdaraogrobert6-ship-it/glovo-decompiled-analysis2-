package o;

import com.huawei.location.ut;

/* JADX INFO: loaded from: classes2.dex */
public final class getComposeViewContextui extends internalOnMeasureui {
    public final String IconCompatParcelizer;
    public final setParentCompositionContext RemoteActionCompatParcelizer;
    public final onAttachedToWindow read;
    public final createComposition serializer;
    public final setParentCompositionContext write;

    public final int hashCode() {
        setParentCompositionContext setparentcompositioncontext = this.RemoteActionCompatParcelizer;
        int iHashCode = setparentcompositioncontext != null ? setparentcompositioncontext.hashCode() : 0;
        onAttachedToWindow onattachedtowindow = this.read;
        int iHashCode2 = onattachedtowindow != null ? onattachedtowindow.read.hashCode() : 0;
        createComposition createcomposition = this.serializer;
        return this.IconCompatParcelizer.hashCode() + this.write.hashCode() + iHashCode + iHashCode2 + (createcomposition != null ? createcomposition.hashCode() : 0);
    }

    @Override // o.internalOnMeasureui
    public final onAttachedToWindow write() {
        return this.read;
    }

    public getComposeViewContextui(ut utVar, setParentCompositionContext setparentcompositioncontext, setParentCompositionContext setparentcompositioncontext2, onAttachedToWindow onattachedtowindow, createComposition createcomposition, String str) {
        super(utVar, com.google.firebase.inappmessaging.model.MessageType.BANNER);
        this.write = setparentcompositioncontext;
        this.RemoteActionCompatParcelizer = setparentcompositioncontext2;
        this.read = onattachedtowindow;
        this.serializer = createcomposition;
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getComposeViewContextui)) {
            return false;
        }
        getComposeViewContextui getcomposeviewcontextui = (getComposeViewContextui) obj;
        createComposition createcomposition = getcomposeviewcontextui.serializer;
        onAttachedToWindow onattachedtowindow = getcomposeviewcontextui.read;
        setParentCompositionContext setparentcompositioncontext = getcomposeviewcontextui.RemoteActionCompatParcelizer;
        if (hashCode() != getcomposeviewcontextui.hashCode()) {
            return false;
        }
        setParentCompositionContext setparentcompositioncontext2 = this.RemoteActionCompatParcelizer;
        if ((setparentcompositioncontext2 == null && setparentcompositioncontext != null) || (setparentcompositioncontext2 != null && !setparentcompositioncontext2.equals(setparentcompositioncontext))) {
            return false;
        }
        onAttachedToWindow onattachedtowindow2 = this.read;
        if ((onattachedtowindow2 == null && onattachedtowindow != null) || (onattachedtowindow2 != null && !onattachedtowindow2.equals(onattachedtowindow))) {
            return false;
        }
        createComposition createcomposition2 = this.serializer;
        return (createcomposition2 != null || createcomposition == null) && (createcomposition2 == null || createcomposition2.equals(createcomposition)) && this.write.equals(getcomposeviewcontextui.write) && this.IconCompatParcelizer.equals(getcomposeviewcontextui.IconCompatParcelizer);
    }
}
