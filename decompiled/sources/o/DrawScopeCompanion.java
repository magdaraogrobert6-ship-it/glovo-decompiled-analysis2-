package o;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class DrawScopeCompanion implements offsetSizePENXr5M, accessclearShadowCache {
    public final supportsColorMatrixQuery IconCompatParcelizer;
    public final HashSet RemoteActionCompatParcelizer = new HashSet();

    @Override // o.offsetSizePENXr5M
    public final void IconCompatParcelizer(getDefaultFilterQualityfv9h1I getdefaultfilterqualityfv9h1i) {
        this.RemoteActionCompatParcelizer.add(getdefaultfilterqualityfv9h1i);
        toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) this.IconCompatParcelizer).RatingCompat;
        if (tocolorlong8_81lla == toColorLong8_81llA.DESTROYED) {
            getdefaultfilterqualityfv9h1i.RemoteActionCompatParcelizer();
        } else if (tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.STARTED)) {
            getdefaultfilterqualityfv9h1i.write();
        } else {
            getdefaultfilterqualityfv9h1i.serializer();
        }
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_DESTROY)
    public void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        Iterator it = Fill.read(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((getDefaultFilterQualityfv9h1I) it.next()).RemoteActionCompatParcelizer();
        }
        accessisrendernodecompatiblecp.getLifecycle().read(this);
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_START)
    public void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        Iterator it = Fill.read(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((getDefaultFilterQualityfv9h1I) it.next()).write();
        }
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_STOP)
    public void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        Iterator it = Fill.read(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((getDefaultFilterQualityfv9h1I) it.next()).serializer();
        }
    }

    @Override // o.offsetSizePENXr5M
    public final void read(getDefaultFilterQualityfv9h1I getdefaultfilterqualityfv9h1i) {
        this.RemoteActionCompatParcelizer.remove(getdefaultfilterqualityfv9h1i);
    }

    public DrawScopeCompanion(supportsColorMatrixQuery supportscolormatrixquery) {
        this.IconCompatParcelizer = supportscolormatrixquery;
        supportscolormatrixquery.IconCompatParcelizer(this);
    }
}
