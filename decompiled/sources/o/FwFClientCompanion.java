package o;

import java.util.concurrent.ConcurrentHashMap;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FwFClientCompanion {
    public static final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();

    public static final String IconCompatParcelizer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        ConcurrentHashMap concurrentHashMap = IconCompatParcelizer;
        String str = (String) concurrentHashMap.get(getunregisteredinappmessageannotations);
        if (str != null) {
            return str;
        }
        String name = Options.Companion.read(getunregisteredinappmessageannotations).getName();
        concurrentHashMap.put(getunregisteredinappmessageannotations, name);
        return name;
    }
}
