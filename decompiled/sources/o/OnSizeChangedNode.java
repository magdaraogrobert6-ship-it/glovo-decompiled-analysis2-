package o;

import android.os.Bundle;
import android.os.RemoteException;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class OnSizeChangedNode implements minWidth {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ OnSizeChangedNode(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.minWidth
    public final void write(long j, Bundle bundle, String str, String str2) {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            try {
                ((onVisibilityChangedNodedefault) obj).IconCompatParcelizer(j, bundle, str, str2);
                return;
            } catch (RemoteException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                return;
            }
        }
        if (i != 1) {
            if (str == null || addRulerReader.RemoteActionCompatParcelizer.contains(str2)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            ((captureRulersOSxE8f4default) obj).IconCompatParcelizer.RemoteActionCompatParcelizer(3, bundle2);
            return;
        }
        captureRulersOSxE8f4 capturerulersosxe8f4 = (captureRulersOSxE8f4) obj;
        if (capturerulersosxe8f4.serializer.contains(str2)) {
            Bundle bundle3 = new Bundle();
            undelegateUnprotectedui undelegateunprotectedui = addRulerReader.RemoteActionCompatParcelizer;
            Object[] objArr = {str2, Measured.RemoteActionCompatParcelizer, Measured.IconCompatParcelizer};
            String str3 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
            if (str3 != null) {
                str2 = str3;
            }
            bundle3.putString("events", str2);
            capturerulersosxe8f4.IconCompatParcelizer.RemoteActionCompatParcelizer(2, bundle3);
        }
    }
}
