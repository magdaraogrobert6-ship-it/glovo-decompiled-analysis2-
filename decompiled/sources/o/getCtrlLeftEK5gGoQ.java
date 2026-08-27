package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getCtrlLeftEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final String IconCompatParcelizer;
    public final ArrayList read;
    public final ArrayList serializer;
    public zzbv write = null;

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        try {
            zzbv zzbvVar2 = this.write;
            zzbvVar2.getClass();
            int i = 0;
            zzbv zzbvVar3 = new zzbv(i, zzbvVar2);
            while (true) {
                ArrayList arrayList = this.read;
                if (i >= arrayList.size()) {
                    break;
                }
                if (getfunctionek5ggoqArr.length > i) {
                    zzbvVar3.serializer(getfunctionek5ggoqArr[i], (String) arrayList.get(i));
                } else {
                    zzbvVar3.serializer((getFunctionEK5gGoQ) gethelpek5ggoq, (String) arrayList.get(i));
                }
                i++;
            }
            zzbvVar3.serializer((getFunctionEK5gGoQ) new getHenkanEK5gGoQ(Arrays.asList(getfunctionek5ggoqArr)), "arguments");
            Iterator it = this.serializer.iterator();
            while (it.hasNext()) {
                getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = androidx.room.Room.IconCompatParcelizer(zzbvVar3, (getIEK5gGoQ) it.next());
                if (getfunctionek5ggoqIconCompatParcelizer instanceof getHelpEK5gGoQ) {
                    getHelpEK5gGoQ gethelpek5ggoq2 = (getHelpEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer;
                    if (gethelpek5ggoq2.MediaBrowserCompatMediaItem) {
                        return gethelpek5ggoq2.MediaSessionCompatQueueItem;
                    }
                }
            }
            return gethelpek5ggoq;
        } catch (RuntimeException e) {
            getButtonThumbLeftEK5gGoQ.write("Internal error - Function call: " + this.IconCompatParcelizer + "\n" + e.getMessage());
            return gethelpek5ggoq;
        }
    }

    public final String toString() {
        String string = this.read.toString();
        String string2 = this.serializer.toString();
        StringBuilder sb = new StringBuilder();
        c8$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "\n\tparams: ", string, "\n\t: statements: ");
        sb.append(string2);
        return sb.toString();
    }

    public getCtrlLeftEK5gGoQ(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.IconCompatParcelizer = str;
        this.read = arrayList;
        this.serializer = arrayList2;
    }
}
