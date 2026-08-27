package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class encodePointList implements getPackedValueannotations, encodeColorList {
    public final getTransformui_graphics IconCompatParcelizer;
    public final Bt2020Pqlambda0 RatingCompat;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public final getTransformui_graphics read;
    public final boolean serializer;
    public final ArrayList write = new ArrayList();

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
    }

    @Override // o.encodeColorList
    public final void serializer() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.write;
            if (i >= arrayList.size()) {
                return;
            }
            ((encodeColorList) arrayList.get(i)).serializer();
            i++;
        }
    }

    public final void serializer(encodeColorList encodecolorlist) {
        this.write.add(encodecolorlist);
    }

    public encodePointList(ExtendedSrgblambda0 extendedSrgblambda0, Bt2020Hlglambda1 bt2020Hlglambda1) {
        this.serializer = bt2020Hlglambda1.RemoteActionCompatParcelizer;
        this.RatingCompat = bt2020Hlglambda1.serializer;
        getTransformui_graphics gettransformui_graphicsWrite = bt2020Hlglambda1.write.write();
        this.RemoteActionCompatParcelizer = gettransformui_graphicsWrite;
        getTransformui_graphics gettransformui_graphicsWrite2 = bt2020Hlglambda1.read.write();
        this.read = gettransformui_graphicsWrite2;
        getTransformui_graphics gettransformui_graphicsWrite3 = bt2020Hlglambda1.IconCompatParcelizer.write();
        this.IconCompatParcelizer = gettransformui_graphicsWrite3;
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite2);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite3);
        gettransformui_graphicsWrite.write(this);
        gettransformui_graphicsWrite2.write(this);
        gettransformui_graphicsWrite3.write(this);
    }
}
