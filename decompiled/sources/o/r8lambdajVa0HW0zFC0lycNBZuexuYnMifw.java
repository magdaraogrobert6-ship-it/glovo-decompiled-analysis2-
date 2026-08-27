package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdajVa0HW0zFC0lycNBZuexuYnMifw implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private List<r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA> serializer;

    public final List<r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA> RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.serializer);
        return r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.write(arrayList);
    }

    public r8lambdajVa0HW0zFC0lycNBZuexuYnMifw(List<r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA> list) {
        this.serializer = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdajVa0HW0zFC0lycNBZuexuYnMifw)) {
            return false;
        }
        HashSet hashSet = new HashSet(this.serializer);
        HashSet hashSet2 = new HashSet(((r8lambdajVa0HW0zFC0lycNBZuexuYnMifw) obj).serializer);
        return hashSet.size() == hashSet2.size() && hashSet.containsAll(hashSet2);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("OnDeviceMLModels{models="), (List) this.serializer, '}');
    }

    public r8lambdajVa0HW0zFC0lycNBZuexuYnMifw() {
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        this.serializer = r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.RemoteActionCompatParcelizer(r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA.class, str, null);
    }
}
