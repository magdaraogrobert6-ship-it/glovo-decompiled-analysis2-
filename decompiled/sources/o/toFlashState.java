package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class toFlashState implements getCurrentContentInsetLeft {
    public final int IconCompatParcelizer;

    @Override // o.getCurrentContentInsetLeft
    public final ArrayList read(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FocusMeteringAction focusMeteringAction = (FocusMeteringAction) it.next();
            coil3.util.UtilsKt.IconCompatParcelizer("The camera info doesn't contain internal implementation.", focusMeteringAction instanceof FocusMeteringAction);
            if (focusMeteringAction.MediaBrowserCompatMediaItem() == this.IconCompatParcelizer) {
                arrayList.add(focusMeteringAction);
            }
        }
        return arrayList;
    }

    public toFlashState(int i) {
        this.IconCompatParcelizer = i;
    }
}
