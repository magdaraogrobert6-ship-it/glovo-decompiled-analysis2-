package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class TextNvy7gAk extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextNvy7gAk(float f, int i) {
        super(1);
        this.write = i;
        this.RemoteActionCompatParcelizer = f;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("size");
            inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i == 1) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo2 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo2.setName("height");
            inspectorInfo2.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i == 2) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo3 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo3.setName("requiredSize");
            inspectorInfo3.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        if (i != 3) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo4 = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo4.setName("width");
            inspectorInfo4.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
            return createfromparcel;
        }
        androidx.compose.ui.platform.InspectorInfo inspectorInfo5 = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo5.setName("requiredWidth");
        inspectorInfo5.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
        return createfromparcel;
    }
}
