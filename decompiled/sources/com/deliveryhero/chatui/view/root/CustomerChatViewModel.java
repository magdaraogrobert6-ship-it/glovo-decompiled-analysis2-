package com.deliveryhero.chatui.view.root;

import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.LayerSnapshotV21;
import o.ShortNewsContentCardView;
import o.VectorPainterKtrememberVectorPainter211;
import o.drawChildui_graphics;
import o.getMayRenderInSoftware;
import o.onImageAvailable;
import o.rgbEqualOWjLjI;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerChatViewModel extends ViewModel {
    public final StateFlow IconCompatParcelizer;
    public final onImageAvailable RemoteActionCompatParcelizer;
    public final rgbEqualOWjLjI read;
    public final LayerSnapshotV21 serializer;
    public final MutableStateFlow write;

    public final void IconCompatParcelizer() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        do {
            mutableStateFlow = this.write;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getMayRenderInSoftware.read((getMayRenderInSoftware) obj, true, false, null, null, 8)));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new VectorPainterKtrememberVectorPainter211(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this), null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 17), 2);
    }

    public CustomerChatViewModel(LayerSnapshotV21 layerSnapshotV21, rgbEqualOWjLjI rgbequalowjlji, onImageAvailable onimageavailable) {
        this.serializer = layerSnapshotV21;
        this.read = rgbequalowjlji;
        this.RemoteActionCompatParcelizer = onimageavailable;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new getMayRenderInSoftware());
        this.write = mutableStateFlow;
        this.IconCompatParcelizer = FlowKt.write(mutableStateFlow);
        drawChildui_graphics.RemoteActionCompatParcelizer(layerSnapshotV21.read);
    }
}
