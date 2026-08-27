package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho {
    public static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] serializer = new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0];

    public static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] write(List list) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (r8lambda92m0p9sit5uf70mvjf4rwmrudaArr = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) list.toArray(new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0])) == null) ? serializer : r8lambda92m0p9sit5uf70mvjf4rwmrudaArr;
    }

    public static final String read(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        String strIconCompatParcelizer = ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            strIconCompatParcelizer = "<local class name not available>";
        }
        return ff$$ExternalSyntheticOutline0.m("Serializer for class '", strIconCompatParcelizer, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final Set serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda instanceof InAppMessageJavascriptInterfacerequestPushPermission11) {
            return ((InAppMessageJavascriptInterfacerequestPushPermission11) r8lambda92m0p9sit5uf70mvjf4rwmruda).MediaSessionCompatQueueItem();
        }
        HashSet hashSet = new HashSet(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer());
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            hashSet.add(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i));
        }
        return hashSet;
    }

    public static final getUnregisteredInAppMessageannotations read(registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50) {
        getUnregisteredInAppMessageannotations getunregisteredinappmessageannotationsRemoteActionCompatParcelizer = registerinappmessagemanagerlambda50.RemoteActionCompatParcelizer();
        if (getunregisteredinappmessageannotationsRemoteActionCompatParcelizer instanceof getUnregisteredInAppMessageannotations) {
            return getunregisteredinappmessageannotationsRemoteActionCompatParcelizer;
        }
        Gson$$ExternalSyntheticBUOutline0.m(getunregisteredinappmessageannotationsRemoteActionCompatParcelizer, "Only KClass supported as classifier, got ");
        return null;
    }
}
