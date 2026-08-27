package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNodeonAttach11 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbNodeonAttach11(float f, float f2, float f3, float f4, int i) {
        super(1);
        this.read = i;
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
        this.IconCompatParcelizer = f3;
        this.serializer = f4;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.serializer;
        float f2 = this.IconCompatParcelizer;
        float f3 = this.RemoteActionCompatParcelizer;
        float f4 = this.write;
        if (i != 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("requiredSizeIn");
            MediaSessionCompatQueueItem.serializer(f2, MediaSessionCompatQueueItem.serializer(f3, MediaSessionCompatQueueItem.serializer(f4, inspectorInfo.getProperties(), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        androidx.compose.ui.platform.InspectorInfo inspectorInfo2 = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo2.setName("sizeIn");
        MediaSessionCompatQueueItem.serializer(f2, MediaSessionCompatQueueItem.serializer(f3, MediaSessionCompatQueueItem.serializer(f4, inspectorInfo2.getProperties(), "minWidth", inspectorInfo2), "minHeight", inspectorInfo2), "maxWidth", inspectorInfo2).set("maxHeight", androidx.compose.ui.unit.Dp.m3671boximpl(f));
        return createfromparcel;
    }
}
