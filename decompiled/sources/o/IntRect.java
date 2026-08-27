package o;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class IntRect implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getExtendedTouchPaddinghWWAJMo serializer;

    public /* synthetic */ IntRect(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getextendedtouchpaddinghwwajmo;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = this.serializer;
        if (i4 == 0) {
            Context context = (Context) obj;
            context.getClass();
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = new AndroidEdgeEffectOverscrollEffect(context);
            androidEdgeEffectOverscrollEffect.setScaleType(pullBottomk4lQ0M.FILL_CENTER);
            androidEdgeEffectOverscrollEffect.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            androidEdgeEffectOverscrollEffect.setController(getextendedtouchpaddinghwwajmo);
            return androidEdgeEffectOverscrollEffect;
        }
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = (AndroidEdgeEffectOverscrollEffect) obj;
        androidEdgeEffectOverscrollEffect2.getClass();
        Object[] objArr = {androidEdgeEffectOverscrollEffect2.getController(), getextendedtouchpaddinghwwajmo};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i5 = write + 117;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                androidEdgeEffectOverscrollEffect2.setController(getextendedtouchpaddinghwwajmo);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            androidEdgeEffectOverscrollEffect2.setController(getextendedtouchpaddinghwwajmo);
        }
        return createFromParcel.INSTANCE;
    }
}
