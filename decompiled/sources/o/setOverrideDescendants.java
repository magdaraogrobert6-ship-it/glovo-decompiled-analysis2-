package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setOverrideDescendants implements Iterator {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read >= 0;
    }

    public setOverrideDescendants(HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, int i) {
        this.IconCompatParcelizer = i;
        this.write = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1;
        this.RatingCompat = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1;
        this.RemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaBrowserCompatMediaItem;
        this.read = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.isEmpty() ? -1 : 0;
        this.serializer = -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object setdptouchboundsexpansion;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RatingCompat;
        if (hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaBrowserCompatMediaItem != this.RemoteActionCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.read;
        this.serializer = i;
        int i2 = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon2 = this.write;
        if (i2 == 0) {
            Object obj = HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer;
            setdptouchboundsexpansion = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon2.read()[i];
        } else if (i2 != 1) {
            Object obj2 = HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer;
            setdptouchboundsexpansion = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon2.serializer()[i];
        } else {
            setdptouchboundsexpansion = new setDpTouchBoundsExpansion(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon2, i);
        }
        int i3 = this.read + 1;
        if (i3 >= hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaSessionCompatQueueItem) {
            i3 = -1;
        }
        this.read = i3;
        return setdptouchboundsexpansion;
    }

    @Override // java.util.Iterator
    public final void remove() {
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RatingCompat;
        if (hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaBrowserCompatMediaItem != this.RemoteActionCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return;
        }
        TuplesKt.RemoteActionCompatParcelizer(503622116, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{"no calls to next() since the last call to remove()", Boolean.valueOf(this.serializer >= 0)}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -503622113);
        this.RemoteActionCompatParcelizer += 32;
        hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.remove(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.read()[this.serializer]);
        this.read--;
        this.serializer = -1;
    }
}
