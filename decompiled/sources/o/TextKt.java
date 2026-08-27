package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class TextKt extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextKt(float f, float f2, int i) {
        super(1);
        this.IconCompatParcelizer = i;
        this.write = f;
        this.read = f2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.read;
        float f2 = this.write;
        if (i == 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("size");
            MediaSessionCompatQueueItem.serializer(f2, inspectorInfo.getProperties(), "width", inspectorInfo).set("height", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i == 1) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo2 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo2.setName("heightIn");
            MediaSessionCompatQueueItem.serializer(f2, inspectorInfo2.getProperties(), "min", inspectorInfo2).set("max", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i == 2) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo3 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo3.setName("requiredHeightIn");
            MediaSessionCompatQueueItem.serializer(f2, inspectorInfo3.getProperties(), "min", inspectorInfo3).set("max", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i == 3) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo4 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo4.setName("requiredSize");
            MediaSessionCompatQueueItem.serializer(f2, inspectorInfo4.getProperties(), "width", inspectorInfo4).set("height", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i != 4) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo5 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo5.setName("widthIn");
            MediaSessionCompatQueueItem.serializer(f2, inspectorInfo5.getProperties(), "min", inspectorInfo5).set("max", androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        androidx.compose.ui.platform.InspectorInfo inspectorInfo6 = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo6.setName("requiredWidthIn");
        MediaSessionCompatQueueItem.serializer(f2, inspectorInfo6.getProperties(), "min", inspectorInfo6).set("max", androidx.compose.ui.unit.Dp.m3671boximpl(f));
        return createfromparcel;
    }
}
