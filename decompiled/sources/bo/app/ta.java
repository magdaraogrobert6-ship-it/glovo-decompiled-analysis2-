package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ta {
    public final da a;
    public final ga b;
    public final IInAppMessage c;
    public final String d;

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.c.hashCode();
        String str = this.d;
        return ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.c.forJsonPut());
        String str = ((ah) this.b).a;
        da daVar = this.a;
        String str2 = this.d;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n        ", prettyPrintedString, "\n        Triggered Action Id: ", str, "\n        Trigger Event: ");
        sbM.append(daVar);
        sbM.append("\n        User Id: ");
        sbM.append(str2);
        sbM.append("\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString());
    }

    public ta(da daVar, ga gaVar, IInAppMessage iInAppMessage, String str) {
        daVar.getClass();
        gaVar.getClass();
        iInAppMessage.getClass();
        this.a = daVar;
        this.b = gaVar;
        this.c = iInAppMessage;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, taVar.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, taVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, taVar.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, taVar.d}, getCieXyz.write())).booleanValue();
    }
}
