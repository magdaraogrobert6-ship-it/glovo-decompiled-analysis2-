package o;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getBt2020Primariesui_graphics extends ExtendedSrgblambda0 {
    public final getPositions _init_lambda1;
    public final accessgetCentercp _init_lambda3;
    public final getBt2020 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @Override // o.ExtendedSrgblambda0
    public final getExponentimpl write() {
        getExponentimpl getexponentimpl = this.PlaybackStateCompat.IconCompatParcelizer;
        return getexponentimpl != null ? getexponentimpl : this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.PlaybackStateCompat.IconCompatParcelizer;
    }

    public getBt2020Primariesui_graphics(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb, getBt2020 getbt2020, StrokeJoinCompanion strokeJoinCompanion) {
        super(accessgetmirrorcp, getadobergb);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getbt2020;
        accessgetCentercp accessgetcentercp = new accessgetCentercp(accessgetmirrorcp, this, new rcpResponse("__container", getadobergb.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, false), strokeJoinCompanion);
        this._init_lambda3 = accessgetcentercp;
        List list = Collections.EMPTY_LIST;
        accessgetcentercp.RemoteActionCompatParcelizer(list, list);
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.PlaybackStateCompat.RemoteActionCompatParcelizer;
        if (dropShadowEffect != null) {
            this._init_lambda1 = new getPositions(this, this, dropShadowEffect);
        }
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        this._init_lambda3.read(rectF, this.write, z);
    }

    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        getPositions getpositions = this._init_lambda1;
        if (getpositions != null) {
            geta = getpositions.write(matrix, i);
        }
        this._init_lambda3.RemoteActionCompatParcelizer(canvas, matrix, i, geta);
    }
}
