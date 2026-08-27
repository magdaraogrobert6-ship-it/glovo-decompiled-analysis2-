package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo extends r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo(WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9, getEMAIL_ADDRESS_MAX_LENGTHannotations getemail_address_max_lengthannotations) {
        super(webContentUtilsExternalSyntheticLambda9.MediaSessionCompatQueueItem);
        this.write = getemail_address_max_lengthannotations;
    }

    @Override // o.r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA
    public final void RemoteActionCompatParcelizer() {
        List list;
        if (this.RemoteActionCompatParcelizer == 0) {
            ((WebContentUtilsExternalSyntheticLambda9) this.write).IconCompatParcelizer();
            return;
        }
        getEMAIL_ADDRESS_MAX_LENGTHannotations getemail_address_max_lengthannotations = (getEMAIL_ADDRESS_MAX_LENGTHannotations) this.write;
        getemail_address_max_lengthannotations.getClass();
        List arrayList = new ArrayList();
        while (true) {
            synchronized (getemail_address_max_lengthannotations) {
                if (getemail_address_max_lengthannotations.serializer.isEmpty()) {
                    getemail_address_max_lengthannotations.serializer = null;
                    getemail_address_max_lengthannotations.IconCompatParcelizer = true;
                    return;
                } else {
                    list = getemail_address_max_lengthannotations.serializer;
                    getemail_address_max_lengthannotations.serializer = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo(WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9, setResourcePackageName setresourcepackagename) {
        super(setresourcepackagename);
        this.write = webContentUtilsExternalSyntheticLambda9;
    }
}
