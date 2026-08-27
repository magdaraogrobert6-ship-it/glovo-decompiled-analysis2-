package bo.app;

import androidx.fragment.app.FragmentActivity;
import com.braze.storage.ICardStorageProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.ddefault;
import o.deleteRegisteredGeofenceCachelambda0;
import o.deleteRegisteredGeofenceCachelambda1;
import o.deserializeContentCardlambda0;
import o.deserializeContentCardlambda1;
import o.isRoot;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setEnableExtraAssertions;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ q3$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        if (i == 0) {
            return q3.a((i9) this.f$0, (ICardStorageProvider) this.f$1, (m9) this.f$2, (JSONArray) this.f$3, obj);
        }
        if (i != 1) {
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.f$0;
            FragmentActivity fragmentActivity = (FragmentActivity) this.f$1;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.f$2;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.f$3;
            deserializeContentCardlambda0 deserializecontentcardlambda0 = (deserializeContentCardlambda0) obj;
            deserializecontentcardlambda0.getClass();
            if (deserializecontentcardlambda0 instanceof deleteRegisteredGeofenceCachelambda0) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(fragmentActivity, ((deleteRegisteredGeofenceCachelambda0) deserializecontentcardlambda0).RemoteActionCompatParcelizer());
            } else if (deserializecontentcardlambda0 instanceof deserializeContentCardlambda1) {
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((deserializeContentCardlambda1) deserializecontentcardlambda0).IconCompatParcelizer(), ddefault.IconCompatParcelizer, 0);
            } else if (deserializecontentcardlambda0 instanceof deleteRegisteredGeofenceCachelambda1) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(fragmentActivity, new EquipmentBottomSheetParams(true, ((deleteRegisteredGeofenceCachelambda1) deserializecontentcardlambda0).write()));
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            return createFromParcel.INSTANCE;
        }
        setEnableExtraAssertions setenableextraassertions = (setEnableExtraAssertions) this.f$0;
        String str = (String) this.f$1;
        String str2 = (String) this.f$2;
        isRoot isroot = (isRoot) this.f$3;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
        Object[] objArr = {backwardfocussearch, setEnableExtraAssertions.write, ""};
        if (((String) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr)).equals(str)) {
            isRoot isrootRemoteActionCompatParcelizer = setenableextraassertions.RemoteActionCompatParcelizer(backwardfocussearch, str);
            if (isrootRemoteActionCompatParcelizer == null || isrootRemoteActionCompatParcelizer.IconCompatParcelizer.equals(str2)) {
                return null;
            }
            synchronized (setenableextraassertions) {
                setenableextraassertions.serializer(backwardfocussearch, str);
                Object[] objArr2 = {backwardfocussearch, isroot, new HashSet()};
                Object objIconCompatParcelizer = LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                Object obj2 = objIconCompatParcelizer;
                HashSet hashSet = new HashSet((Collection) objIconCompatParcelizer);
                hashSet.add(str);
                backwardfocussearch.serializer(isroot, hashSet);
            }
            return null;
        }
        isRoot isroot2 = setEnableExtraAssertions.serializer;
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        long jLongValue = ((Long) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{backwardfocussearch, isroot2, 0L})).longValue();
        if (jLongValue + 1 == 30) {
            synchronized (setenableextraassertions) {
                int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                Object objIconCompatParcelizer2 = LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{backwardfocussearch, isroot2, 0L});
                Object obj3 = objIconCompatParcelizer2;
                long jLongValue2 = ((Long) objIconCompatParcelizer2).longValue();
                String str3 = "";
                Set hashSet2 = new HashSet();
                String str4 = null;
                for (Map.Entry entry : backwardfocussearch.read().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        Set<String> set = (Set) entry.getValue();
                        for (String str5 : set) {
                            if (str4 == null || str4.compareTo(str5) > 0) {
                                str3 = ((isRoot) entry.getKey()).IconCompatParcelizer;
                                hashSet2 = set;
                                str4 = str5;
                            }
                        }
                    }
                }
                HashSet hashSet3 = new HashSet(hashSet2);
                hashSet3.remove(str4);
                str3.getClass();
                backwardfocussearch.serializer(new isRoot(str3), hashSet3);
                jLongValue = jLongValue2 - 1;
                backwardfocussearch.write(setEnableExtraAssertions.serializer, Long.valueOf(jLongValue));
            }
        }
        Object[] objArr3 = {backwardfocussearch, isroot, new HashSet()};
        HashSet hashSet4 = new HashSet((Collection) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3));
        hashSet4.add(str);
        backwardfocussearch.serializer(isroot, hashSet4);
        backwardfocussearch.write(setEnableExtraAssertions.serializer, Long.valueOf(jLongValue + 1));
        backwardfocussearch.write(setEnableExtraAssertions.write, str);
        return null;
    }
}
