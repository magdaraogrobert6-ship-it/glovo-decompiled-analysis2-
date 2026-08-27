package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListKt extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.graphics.Shape RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.graphics.Brush read;
    public final /* synthetic */ float serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt(float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape) {
        super(1);
        this.serializer = f;
        this.read = brush;
        this.RemoteActionCompatParcelizer = shape;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo.setName("background");
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.serializer));
        inspectorInfo.getProperties().set("brush", this.read);
        inspectorInfo.getProperties().set("shape", this.RemoteActionCompatParcelizer);
        return createFromParcel.INSTANCE;
    }
}
