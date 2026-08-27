package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setSlingshotDistance implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setSlingshotDistance(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, int i) {
        this.read = i;
        this.IconCompatParcelizer = androidEdgeEffectOverscrollEffect;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Context context = (Context) obj;
        if (i4 == 0 || i4 != 1) {
            context.getClass();
        } else {
            context.getClass();
        }
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.IconCompatParcelizer;
        int i5 = write + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return androidEdgeEffectOverscrollEffect;
    }
}
