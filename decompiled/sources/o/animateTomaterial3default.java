package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class animateTomaterial3default extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ expand RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ animateTomaterial3default(expand expandVar, int i) {
        super(1);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = expandVar;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        expand expandVar = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("height");
            inspectorInfo.getProperties().set("intrinsicSize", expandVar);
            return createfromparcel;
        }
        androidx.compose.ui.platform.InspectorInfo inspectorInfo2 = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo2.setName("width");
        inspectorInfo2.getProperties().set("intrinsicSize", expandVar);
        return createfromparcel;
    }
}
