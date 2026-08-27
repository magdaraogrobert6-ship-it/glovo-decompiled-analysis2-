package o;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerScopeKt extends skewRad {
    public final graphicsLayersKFY_QEdefault read;

    public GraphicsLayerScopeKt(graphicsLayersKFY_QEdefault graphicslayerskfy_qedefault) {
        graphicslayerskfy_qedefault.getClass();
        this.read = graphicslayerskfy_qedefault;
    }

    @Override // o.skewRad
    public final void read(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        uncheckedColor.serializer();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            ((getClipannotations) this.read).getClass();
            sb.append(System.currentTimeMillis() - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            uncheckedColor.RemoteActionCompatParcelizer(sb.toString());
            uncheckedColor.MediaSessionCompatResultReceiverWrapper();
        } finally {
            uncheckedColor.MediaMetadataCompat();
        }
    }
}
