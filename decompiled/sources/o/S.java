package o;

import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class S {
    private static int read = 1;
    private static int write;
    public final E IconCompatParcelizer;
    public final RecenterMapTriggerImpl RemoteActionCompatParcelizer;
    public final dg serializer;

    public S(RecenterMapTriggerImpl recenterMapTriggerImpl, E e, dg dgVar) {
        recenterMapTriggerImpl.getClass();
        e.getClass();
        dgVar.getClass();
        this.RemoteActionCompatParcelizer = recenterMapTriggerImpl;
        this.IconCompatParcelizer = e;
        this.serializer = dgVar;
    }

    public final C0215z serializer(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        getcontentviewgroupparentlayout.getClass();
        C0215z c0215z = new C0215z(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, getcontentviewgroupparentlayout);
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return c0215z;
        }
        throw null;
    }
}
