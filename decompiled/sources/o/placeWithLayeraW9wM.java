package o;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class placeWithLayeraW9wM extends placeRelativeWithLayer {
    public final /* synthetic */ PlaceableKt IconCompatParcelizer;

    @Override // o.placeRelativeWithLayer
    public final void read(View view, float f) {
    }

    public placeWithLayeraW9wM(PlaceableKt placeableKt) {
        this.IconCompatParcelizer = placeableKt;
    }

    @Override // o.placeRelativeWithLayer
    public final void read(int i, View view) {
        if (i == 5) {
            this.IconCompatParcelizer.cancel();
        }
    }
}
