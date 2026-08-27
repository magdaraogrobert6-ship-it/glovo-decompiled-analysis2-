package o;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRectKt implements setTextClassifier {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ RoundRectKt(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.setTextClassifier
    public final Object read(Object obj) {
        int i = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return (androidx.activity.result.ActivityResultRegistry) obj2;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj2;
        Object obj3 = fragment._init_lambda4;
        return obj3 instanceof onMultiWindowModeChanged ? ((onMultiWindowModeChanged) obj3).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
