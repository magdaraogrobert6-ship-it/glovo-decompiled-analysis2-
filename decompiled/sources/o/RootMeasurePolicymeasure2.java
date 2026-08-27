package o;

import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class RootMeasurePolicymeasure2 extends ViewOutlineProvider {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ RootMeasurePolicymeasure2(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, android.graphics.Outline outline) {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i5 == 0) {
            RulerScope rulerScope = ((RootMeasurePolicy) obj).RatingCompat;
            if (rulerScope == null) {
                outline.setAlpha(0.0f);
                return;
            }
            int i6 = serializer + 75;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                rulerScope.getOutline(outline);
                return;
            } else {
                rulerScope.getOutline(outline);
                throw null;
            }
        }
        view.getClass();
        outline.getClass();
        gh ghVar = (gh) obj;
        int i7 = ghVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i8 = ghVar.MediaSessionCompatToken;
        if (i8 < 1) {
            int i9 = serializer + 85;
            int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 85;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i = 1;
        } else {
            i = i8;
        }
        int i14 = ghVar.PlaybackStateCompat;
        int i15 = i7 + 1;
        outline.setRoundRect(0, i7, i, i14 < i15 ? i15 : i14, ghVar.ParcelableVolumeInfo);
    }
}
