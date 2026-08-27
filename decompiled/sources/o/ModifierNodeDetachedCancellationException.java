package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ModifierNodeDetachedCancellationException implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ ModifierNodeDetachedCancellationException(String str, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.IconCompatParcelizer;
        androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
        if (i == 0) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            return createfromparcel;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
        return createfromparcel;
    }
}
