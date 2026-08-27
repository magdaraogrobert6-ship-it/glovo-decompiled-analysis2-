package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchPreFlingQWom1Mo extends getNumPadInsertEK5gGoQ {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dispatchPreFlingQWom1Mo(String str, int i) {
        super(str);
        this.read = i;
    }

    @Override // o.getNumPadInsertEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        int i = this.read;
        getOEK5gGoQ getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        if (i == 1 || i == 2) {
            return this;
        }
        return i != 3 ? getoek5ggoq : new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(0.0d));
    }
}
