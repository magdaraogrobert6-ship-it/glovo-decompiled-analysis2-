package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;
import o.animateToHidden;
import o.getCieXyz;
import o.isMaxVisibleEQwtKwdefault;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    public final animateToHidden read;
    public final AnchoredDraggableState serializer;

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(Object obj, Object obj2) {
        animateToHidden animatetohidden = this.read;
        Object[] objArr = {animatetohidden.write(obj), animatetohidden.write(obj2)};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        AnchoredDraggableState anchoredDraggableState = this.serializer;
        anchoredDraggableState.RemoteActionCompatParcelizer();
        isMaxVisibleEQwtKwdefault set = slotIdsSet.getSet();
        Object[] objArr = set.RemoteActionCompatParcelizer;
        long[] jArr = set.MediaMetadataCompat;
        int i = set.RatingCompat;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objWrite = this.read.write(obj);
            int iSerializer = anchoredDraggableState.serializer(objWrite);
            int i3 = iSerializer >= 0 ? anchoredDraggableState.MediaMetadataCompat[iSerializer] : 0;
            if (i3 == 7) {
                slotIdsSet.remove(obj);
            } else {
                anchoredDraggableState.write(i3 + 1, objWrite);
            }
            i = i2;
        }
    }

    public LazyLayoutItemReusePolicy(animateToHidden animatetohidden) {
        this.read = animatetohidden;
        AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
        this.serializer = new AnchoredDraggableState();
    }
}
