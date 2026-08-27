package o;

import com.google.android.gms.internal.gtm.zzbv;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class getEEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final int read;
    public final zzbv serializer;

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
        try {
            getCtrlLeftEK5gGoQ getctrlleftek5ggoq = setNativeShader.read(new JSONArray(((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer).getJSONArray(0));
            getctrlleftek5ggoq.write = this.serializer;
            return this.read == 0 ? gethelpek5ggoq : getctrlleftek5ggoq.RemoteActionCompatParcelizer(zzbvVar, new getFunctionEK5gGoQ[0]);
        } catch (JSONException e) {
            getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Unable to convert Custom Pixie to instruction", e);
            return gethelpek5ggoq;
        }
    }

    public getEEK5gGoQ(int i, zzbv zzbvVar) {
        this.read = i;
        this.serializer = zzbvVar;
    }
}
