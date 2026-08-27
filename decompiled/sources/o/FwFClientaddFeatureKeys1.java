package o;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientaddFeatureKeys1 {
    public static final removeCustomerProfileAttributesfwf_client_release IconCompatParcelizer = new removeCustomerProfileAttributesfwf_client_release("_root_");
    public final ConcurrentHashMap RemoteActionCompatParcelizer;
    public final getConfigfwf_client_release read;
    public final Scope serializer;
    public final HashSet write;

    public FwFClientaddFeatureKeys1(getConfigfwf_client_release getconfigfwf_client_release) {
        this.read = getconfigfwf_client_release;
        HashSet hashSet = new HashSet();
        this.write = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = concurrentHashMap;
        removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release = IconCompatParcelizer;
        Scope scope = new Scope(removecustomerprofileattributesfwf_client_release, "_root_", true, getconfigfwf_client_release);
        this.serializer = scope;
        hashSet.add(removecustomerprofileattributesfwf_client_release);
        concurrentHashMap.put("_root_", scope);
    }
}
