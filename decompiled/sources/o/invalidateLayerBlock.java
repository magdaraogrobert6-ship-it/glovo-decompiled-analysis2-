package o;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class invalidateLayerBlock extends BlendModeColorFilterxETnrds {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView write;

    @Override // o.BlendModeColorFilterxETnrds
    public final void IconCompatParcelizer() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.onCreatePanelMenu.PlaybackStateCompatCustomAction = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.ParcelableVolumeInfo.serializer()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        recyclerView.assertNotInLayoutOrScroll(null);
        accessgetModulatecp accessgetmodulatecp = recyclerView.ParcelableVolumeInfo;
        ArrayList arrayList = (ArrayList) accessgetmodulatecp.write;
        if (i2 < 1) {
            return;
        }
        arrayList.add(accessgetmodulatecp.read(4, i, i2, obj));
        accessgetmodulatecp.IconCompatParcelizer |= 4;
        if (arrayList.size() == 1) {
            write();
        }
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void read() {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        if (recyclerView.addOnUserLeaveHintListener == null || (adapter = recyclerView.MediaSessionCompatResultReceiverWrapper) == null || !adapter.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void write() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        if (!recyclerView.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs || !recyclerView.accessensureViewModelStore) {
            recyclerView.PlaybackStateCompat = true;
            recyclerView.requestLayout();
        } else {
            getSrcAtop0nO6VwU getsrcatop0no6vwu = recyclerView.onPictureInPictureModeChanged;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            recyclerView.postOnAnimation(getsrcatop0no6vwu);
        }
    }

    public invalidateLayerBlock(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.write = recyclerView;
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void IconCompatParcelizer(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        recyclerView.assertNotInLayoutOrScroll(null);
        accessgetModulatecp accessgetmodulatecp = recyclerView.ParcelableVolumeInfo;
        ArrayList arrayList = (ArrayList) accessgetmodulatecp.write;
        if (i == i2) {
            return;
        }
        arrayList.add(accessgetmodulatecp.read(8, i, i2, null));
        accessgetmodulatecp.IconCompatParcelizer |= 8;
        if (arrayList.size() == 1) {
            write();
        }
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        recyclerView.assertNotInLayoutOrScroll(null);
        accessgetModulatecp accessgetmodulatecp = recyclerView.ParcelableVolumeInfo;
        ArrayList arrayList = (ArrayList) accessgetmodulatecp.write;
        if (i2 < 1) {
            return;
        }
        arrayList.add(accessgetmodulatecp.read(2, i, i2, null));
        accessgetmodulatecp.IconCompatParcelizer |= 2;
        if (arrayList.size() == 1) {
            write();
        }
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void serializer(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.write;
        recyclerView.assertNotInLayoutOrScroll(null);
        accessgetModulatecp accessgetmodulatecp = recyclerView.ParcelableVolumeInfo;
        ArrayList arrayList = (ArrayList) accessgetmodulatecp.write;
        if (i2 < 1) {
            return;
        }
        arrayList.add(accessgetmodulatecp.read(1, i, i2, null));
        accessgetmodulatecp.IconCompatParcelizer |= 1;
        if (arrayList.size() == 1) {
            write();
        }
    }
}
