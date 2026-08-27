package o;

import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class setHasOptionsMenu {
    public final StateFlow IconCompatParcelizer;
    public final setInitialSavedState serializer;

    public setHasOptionsMenu(setInitialSavedState setinitialsavedstate) {
        this.serializer = setinitialsavedstate;
        this.IconCompatParcelizer = setinitialsavedstate.read;
    }
}
