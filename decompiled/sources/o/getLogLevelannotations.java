package o;

import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class getLogLevelannotations extends ViewOutlineProvider {
    public final int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final float write;

    public /* synthetic */ getLogLevelannotations(float f, int i, int i2) {
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = i;
        this.write = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, android.graphics.Outline outline) {
        int i = this.serializer;
        int i2 = this.RemoteActionCompatParcelizer;
        float f = this.write;
        if (i != 0) {
            if (outline != null) {
                outline.setAlpha(f);
            }
            if (view != null) {
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 < 0) {
                    if (outline != null) {
                        outline.setRoundRect(0, i3, view.getWidth(), view.getHeight(), 0.0f);
                        return;
                    }
                    return;
                } else {
                    if (outline != null) {
                        outline.setRoundRect(0, 0, view.getWidth(), i2 + view.getHeight(), 0.0f);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (outline != null) {
            outline.setAlpha(f);
        }
        if (view instanceof RectRulersImpl) {
            int i4 = this.RemoteActionCompatParcelizer;
            if (i4 < 0) {
                if (outline != null) {
                    RectRulersImpl rectRulersImpl = (RectRulersImpl) view;
                    outline.setRoundRect(0, i4, rectRulersImpl.getWidth(), rectRulersImpl.getHeight(), rectRulersImpl.getRadius());
                    return;
                }
                return;
            }
            if (outline != null) {
                RectRulersImpl rectRulersImpl2 = (RectRulersImpl) view;
                outline.setRoundRect(0, 0, rectRulersImpl2.getWidth(), i2 + rectRulersImpl2.getHeight(), rectRulersImpl2.getRadius());
            }
        }
    }
}
