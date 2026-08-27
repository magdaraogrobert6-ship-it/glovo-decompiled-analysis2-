package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class r8lambdaw7i6Ue6vGtr8Hj57qLdCk4Lw0c extends r8lambdaPLaRsxctQ2Ot0mjLZvGlNFVAnM implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final HashSet read = new HashSet();
    private final migrateTriggersReeligibilityToJsonlambda1<List<r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA>> serializer = new r8lambdavlnlMp_6y3xKJ4vG9hXznTIAPE(this);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public static ArrayList IconCompatParcelizer(r8lambdaw7i6Ue6vGtr8Hj57qLdCk4Lw0c r8lambdaw7i6ue6vgtr8hj57qldck4lw0c) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(Arrays.asList(new Class[0]));
        arrayList2.addAll(r8lambdaw7i6ue6vgtr8hj57qldck4lw0c.read);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add((r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA) setPushUniqueId.read((Class) it.next()));
        }
        return arrayList;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.serializer.write();
        this.read.clear();
    }

    @Override // o.r8lambdaPLaRsxctQ2Ot0mjLZvGlNFVAnM
    public final List<r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA> read() {
        return this.serializer.read();
    }

    @Override // o.r8lambdaPLaRsxctQ2Ot0mjLZvGlNFVAnM
    public final void RemoteActionCompatParcelizer(Class<? extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA> cls) {
        this.read.add(cls);
    }
}
