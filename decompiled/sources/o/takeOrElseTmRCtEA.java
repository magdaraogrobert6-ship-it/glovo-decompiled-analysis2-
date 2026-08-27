package o;

/* JADX INFO: loaded from: classes.dex */
public final class takeOrElseTmRCtEA extends android.transition.Transition.EpicenterCallback {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ android.graphics.Rect read;

    public /* synthetic */ takeOrElseTmRCtEA(int i, android.graphics.Rect rect) {
        this.IconCompatParcelizer = i;
        this.read = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        int i = this.IconCompatParcelizer;
        android.graphics.Rect rect = this.read;
        if (i == 0 || !rect.isEmpty()) {
            return rect;
        }
        return null;
    }
}
