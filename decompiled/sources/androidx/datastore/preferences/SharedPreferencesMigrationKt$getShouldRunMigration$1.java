package androidx.datastore.preferences;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.forEachItemAfter;
import o.getNoActiveChildannotations;
import o.isRoot;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Set write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.serializer == 0) {
            SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.write, shortNewsContentCardView, 0);
            sharedPreferencesMigrationKt$getShouldRunMigration$1.read = obj;
            return sharedPreferencesMigrationKt$getShouldRunMigration$1;
        }
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$2 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.write, shortNewsContentCardView, 1);
        sharedPreferencesMigrationKt$getShouldRunMigration$2.read = obj;
        int i3 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return sharedPreferencesMigrationKt$getShouldRunMigration$2;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i3 = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        Object objInvokeSuspend = ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Set set = this.write;
        if (i4 != 0) {
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Iterator it = RangesKt.RemoteActionCompatParcelizer(backwardfocussearch.read().keySet(), (Iterable) set).iterator();
            while (it.hasNext()) {
                backwardfocussearch.read((isRoot) it.next());
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i5 = RemoteActionCompatParcelizer + 97;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return createfromparcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Set setKeySet = ((getNoActiveChildannotations) this.read).read().keySet();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            int i6 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                arrayList.add(((isRoot) it2.next()).IconCompatParcelizer);
                int i7 = 80 / 0;
            } else {
                arrayList.add(((isRoot) it2.next()).IconCompatParcelizer);
            }
        }
        if (set == forEachItemAfter.IconCompatParcelizer) {
            z = true;
            break;
        }
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                if (!arrayList.contains((String) it3.next())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
