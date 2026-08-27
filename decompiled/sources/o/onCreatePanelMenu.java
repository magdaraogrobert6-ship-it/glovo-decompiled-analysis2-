package o;

/* JADX INFO: loaded from: classes.dex */
public final class onCreatePanelMenu extends onBackPressed {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ onNewIntent read;
    public final /* synthetic */ androidx.activity.result.ActivityResultRegistry write;

    public /* synthetic */ onCreatePanelMenu(androidx.activity.result.ActivityResultRegistry activityResultRegistry, String str, onNewIntent onnewintent, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = activityResultRegistry;
        this.IconCompatParcelizer = str;
        this.read = onnewintent;
    }

    @Override // o.onBackPressed
    public final void serializer() {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.IconCompatParcelizer;
        androidx.activity.result.ActivityResultRegistry activityResultRegistry = this.write;
        if (i != 0) {
            activityResultRegistry.unregister$activity(str);
        } else {
            activityResultRegistry.unregister$activity(str);
        }
    }

    @Override // o.onBackPressed
    public final void write(Object obj) throws Exception {
        int i = this.RemoteActionCompatParcelizer;
        onNewIntent onnewintent = this.read;
        String str = this.IconCompatParcelizer;
        androidx.activity.result.ActivityResultRegistry activityResultRegistry = this.write;
        if (i != 0) {
            Object obj2 = activityResultRegistry.read.get(str);
            if (obj2 == null) {
                DrawableTransformation.serializer("Attempting to launch an unregistered ActivityResultLauncher with contract ", onnewintent, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            }
            int iIntValue = ((Number) obj2).intValue();
            activityResultRegistry.write.add(str);
            try {
                activityResultRegistry.onLaunch(iIntValue, onnewintent, obj, null);
                return;
            } catch (Exception e) {
                activityResultRegistry.write.remove(str);
                throw e;
            }
        }
        Object obj3 = activityResultRegistry.read.get(str);
        if (obj3 == null) {
            DrawableTransformation.serializer("Attempting to launch an unregistered ActivityResultLauncher with contract ", onnewintent, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue2 = ((Number) obj3).intValue();
        activityResultRegistry.write.add(str);
        try {
            activityResultRegistry.onLaunch(iIntValue2, onnewintent, obj, null);
        } catch (Exception e2) {
            activityResultRegistry.write.remove(str);
            throw e2;
        }
    }
}
