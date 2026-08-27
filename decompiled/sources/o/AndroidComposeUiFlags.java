package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeUiFlags extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ equals read;
    public final /* synthetic */ boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeUiFlags(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, equals equalsVar, boolean z) {
        super(1);
        this.read = equalsVar;
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
        this.serializer = z;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo.setName("textFieldScrollable");
        inspectorInfo.getProperties().set("scrollerPosition", this.read);
        inspectorInfo.getProperties().set("interactionSource", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set(com.braze.models.FeatureFlag.ENABLED, Boolean.valueOf(this.serializer));
        return createFromParcel.INSTANCE;
    }
}
