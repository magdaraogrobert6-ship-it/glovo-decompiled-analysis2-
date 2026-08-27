package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.JsonObjectSerializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.androidx.scope.ScopeActivity;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class getConfigfwf_client_release {
    public final FwFClientaddFeatureKeys1 IconCompatParcelizer = new FwFClientaddFeatureKeys1(this);
    public final io.sentry.util.ComponentActivity RemoteActionCompatParcelizer = new io.sentry.util.ComponentActivity(this);
    public final JsonObjectSerializer read;

    public final Scope write(String str, setTimerfwf_client_release settimerfwf_client_release, ScopeActivity scopeActivity) {
        FwFClientaddFeatureKeys1 fwFClientaddFeatureKeys1 = this.IconCompatParcelizer;
        ConcurrentHashMap concurrentHashMap = fwFClientaddFeatureKeys1.RemoteActionCompatParcelizer;
        getConfigfwf_client_release getconfigfwf_client_release = fwFClientaddFeatureKeys1.read;
        JsonObjectSerializer jsonObjectSerializer = getconfigfwf_client_release.read;
        jsonObjectSerializer.getClass();
        getProvidedCachefwf_client_release getprovidedcachefwf_client_release = getProvidedCachefwf_client_release.DEBUG;
        jsonObjectSerializer.serializer(getprovidedcachefwf_client_release, "|- (+) Scope - id:'" + str + "' q:" + settimerfwf_client_release);
        HashSet hashSet = fwFClientaddFeatureKeys1.write;
        if (!hashSet.contains(settimerfwf_client_release)) {
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.WARNING, "| Scope '" + settimerfwf_client_release + "' not defined. Creating it ...");
            hashSet.add(settimerfwf_client_release);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new ScopeAlreadyCreatedException(ff$$ExternalSyntheticOutline0.m("Scope with id '", str, "' is already created"));
        }
        Scope scope = new Scope(settimerfwf_client_release, str, false, getconfigfwf_client_release);
        if (scopeActivity != null) {
            scopeActivity.toString();
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.write(getprovidedcachefwf_client_release);
            scope.RemoteActionCompatParcelizer = scopeActivity;
        }
        onContentCardDismissed.serializer(scope.RatingCompat, new Scope[]{fwFClientaddFeatureKeys1.serializer});
        concurrentHashMap.put(str, scope);
        return scope;
    }

    public getConfigfwf_client_release() {
        new ConcurrentHashMap();
        new HashMap();
        getProvidedCachefwf_client_release getprovidedcachefwf_client_release = getProvidedCachefwf_client_release.NONE;
        getprovidedcachefwf_client_release.getClass();
        JsonObjectSerializer jsonObjectSerializer = new JsonObjectSerializer((byte) 0, 15);
        jsonObjectSerializer.jsonReflectionObjectSerializer = getprovidedcachefwf_client_release;
        this.read = jsonObjectSerializer;
    }

    public final void read(List list, boolean z) throws DefinitionOverrideException {
        list.getClass();
        LinkedHashSet<syncClientfwf_client_release> linkedHashSet = new LinkedHashSet();
        pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(list, linkedHashSet);
        io.sentry.util.ComponentActivity componentActivity = this.RemoteActionCompatParcelizer;
        componentActivity.getClass();
        for (syncClientfwf_client_release syncclientfwf_client_release : linkedHashSet) {
            for (Map.Entry entry : syncclientfwf_client_release.write.entrySet()) {
                String str = (String) entry.getKey();
                getLoggerfwf_client_release getloggerfwf_client_release = (getLoggerfwf_client_release) entry.getValue();
                JsonObjectSerializer jsonObjectSerializer = ((getConfigfwf_client_release) componentActivity.serializer).read;
                str.getClass();
                getloggerfwf_client_release.getClass();
                getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = getloggerfwf_client_release.write;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) componentActivity.write;
                if (concurrentHashMap.containsKey(str)) {
                    if (!z) {
                        throw new DefinitionOverrideException("Already existing definition for " + getexposurehandlerfwf_client_release + " at " + str);
                    }
                    jsonObjectSerializer.getClass();
                    jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.WARNING, "(+) override index '" + str + "' -> '" + getexposurehandlerfwf_client_release + '\'');
                }
                jsonObjectSerializer.getClass();
                jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, "(+) index '" + str + "' -> '" + getexposurehandlerfwf_client_release + '\'');
                concurrentHashMap.put(str, getloggerfwf_client_release);
            }
            for (getLoggerfwf_client_release getloggerfwf_client_release2 : syncclientfwf_client_release.IconCompatParcelizer) {
                ((HashMap) componentActivity.read).put(Integer.valueOf(getloggerfwf_client_release2.write.hashCode()), getloggerfwf_client_release2);
            }
        }
        FwFClientaddFeatureKeys1 fwFClientaddFeatureKeys1 = this.IconCompatParcelizer;
        fwFClientaddFeatureKeys1.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            fwFClientaddFeatureKeys1.write.addAll(((syncClientfwf_client_release) it.next()).read);
        }
    }
}
