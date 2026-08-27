package o;

import com.huawei.location.ut;

/* JADX INFO: loaded from: classes2.dex */
public final class isTransitionGroup extends internalOnMeasureui {
    public final createComposition IconCompatParcelizer;
    public final createComposition MediaMetadataCompat;
    public final setParentCompositionContext RatingCompat;
    public final setParentCompositionContext RemoteActionCompatParcelizer;
    public final onAttachedToWindow read;
    public final onAttachedToWindow serializer;
    public final String write;

    public final int hashCode() {
        setParentCompositionContext setparentcompositioncontext = this.RemoteActionCompatParcelizer;
        int iHashCode = setparentcompositioncontext != null ? setparentcompositioncontext.hashCode() : 0;
        createComposition createcomposition = this.MediaMetadataCompat;
        int iHashCode2 = createcomposition != null ? createcomposition.hashCode() : 0;
        onAttachedToWindow onattachedtowindow = this.serializer;
        int iHashCode3 = onattachedtowindow != null ? onattachedtowindow.read.hashCode() : 0;
        onAttachedToWindow onattachedtowindow2 = this.read;
        return this.IconCompatParcelizer.hashCode() + this.write.hashCode() + this.RatingCompat.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (onattachedtowindow2 != null ? onattachedtowindow2.read.hashCode() : 0);
    }

    @Override // o.internalOnMeasureui
    public final onAttachedToWindow write() {
        return this.serializer;
    }

    public isTransitionGroup(ut utVar, setParentCompositionContext setparentcompositioncontext, setParentCompositionContext setparentcompositioncontext2, onAttachedToWindow onattachedtowindow, onAttachedToWindow onattachedtowindow2, String str, createComposition createcomposition, createComposition createcomposition2) {
        super(utVar, com.google.firebase.inappmessaging.model.MessageType.CARD);
        this.RatingCompat = setparentcompositioncontext;
        this.RemoteActionCompatParcelizer = setparentcompositioncontext2;
        this.serializer = onattachedtowindow;
        this.read = onattachedtowindow2;
        this.write = str;
        this.IconCompatParcelizer = createcomposition;
        this.MediaMetadataCompat = createcomposition2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isTransitionGroup)) {
            return false;
        }
        isTransitionGroup istransitiongroup = (isTransitionGroup) obj;
        onAttachedToWindow onattachedtowindow = istransitiongroup.read;
        onAttachedToWindow onattachedtowindow2 = istransitiongroup.serializer;
        createComposition createcomposition = istransitiongroup.MediaMetadataCompat;
        setParentCompositionContext setparentcompositioncontext = istransitiongroup.RemoteActionCompatParcelizer;
        if (hashCode() != istransitiongroup.hashCode()) {
            return false;
        }
        setParentCompositionContext setparentcompositioncontext2 = this.RemoteActionCompatParcelizer;
        if ((setparentcompositioncontext2 == null && setparentcompositioncontext != null) || (setparentcompositioncontext2 != null && !setparentcompositioncontext2.equals(setparentcompositioncontext))) {
            return false;
        }
        createComposition createcomposition2 = this.MediaMetadataCompat;
        if ((createcomposition2 == null && createcomposition != null) || (createcomposition2 != null && !createcomposition2.equals(createcomposition))) {
            return false;
        }
        onAttachedToWindow onattachedtowindow3 = this.serializer;
        if ((onattachedtowindow3 == null && onattachedtowindow2 != null) || (onattachedtowindow3 != null && !onattachedtowindow3.equals(onattachedtowindow2))) {
            return false;
        }
        onAttachedToWindow onattachedtowindow4 = this.read;
        return (onattachedtowindow4 != null || onattachedtowindow == null) && (onattachedtowindow4 == null || onattachedtowindow4.equals(onattachedtowindow)) && this.RatingCompat.equals(istransitiongroup.RatingCompat) && this.IconCompatParcelizer.equals(istransitiongroup.IconCompatParcelizer) && this.write.equals(istransitiongroup.write);
    }
}
