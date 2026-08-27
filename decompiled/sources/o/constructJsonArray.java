package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class constructJsonArray implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 {
    public final Map read;

    public constructJsonArray(accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp) {
        boolean zIsEmpty = accessgetlookaheadandancestormeasuresetp.isEmpty();
        Map mapUnmodifiableMap = accessgetLookaheadAndAncestorMeasureSetp.write;
        if (!zIsEmpty) {
            int i = accessgetlookaheadandancestormeasuresetp.MediaDescriptionCompat;
            LinkedHashMap linkedHashMap = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
            linkedHashMap.putAll(mapUnmodifiableMap);
            for (Map.Entry entry : accessgetlookaheadandancestormeasuresetp.entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        }
        this.read = mapUnmodifiableMap;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public final void inject(Object obj) {
        String name = obj.getClass().getName();
        Map map = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = (r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) map.get(name);
        if (r8lambdaktwlyipskq3tfa9ey3gatonixfq != null) {
            areJsonObjectsEqual arejsonobjectsequal = (areJsonObjectsEqual) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            try {
                arejsonobjectsequal.serializer(obj).inject(obj);
                return;
            } catch (ClassCastException e) {
                final String strM = m1$$ExternalSyntheticOutline0.m(arejsonobjectsequal.getClass().getCanonicalName(), " does not implement AndroidInjector.Factory<", obj.getClass().getCanonicalName(), ">");
                throw new RuntimeException(strM, e) { // from class: dagger.android.DispatchingAndroidInjector$InvalidInjectorBindingException
                };
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (map.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? ff$$ExternalSyntheticOutline0.m("No injector factory bound for Class<", obj.getClass().getCanonicalName(), ">") : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }
}
