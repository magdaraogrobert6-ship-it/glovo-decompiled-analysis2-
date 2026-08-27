package o;

import android.content.Context;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.k7$$ExternalSyntheticLambda2;
import coil3.RealImageLoader$execute$2$job$1;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setEnableExtraAssertions {
    public static final isRoot IconCompatParcelizer = new isRoot("fire-global");
    public static final isRoot serializer = new isRoot("fire-count");
    public static final isRoot write = new isRoot("last-used-date");
    public final swap read;

    public final isRoot RemoteActionCompatParcelizer(backwardFocusSearch backwardfocussearch, String str) {
        synchronized (this) {
            for (Map.Entry entry : backwardfocussearch.read().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            String str2 = ((isRoot) entry.getKey()).IconCompatParcelizer;
                            str2.getClass();
                            return new isRoot(str2);
                        }
                    }
                }
            }
            return null;
        }
    }

    public final String read(long j) {
        String str;
        synchronized (this) {
            str = new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return str;
    }

    public final ArrayList read() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            String str = read(System.currentTimeMillis());
            swap swapVar = this.read;
            swapVar.getClass();
            for (Map.Entry entry : ((Map) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new BlockRunner$cancel$1(swapVar, (ShortNewsContentCardView) null, 29))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(str);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(voteFrameRate.write(((isRoot) entry.getKey()).IconCompatParcelizer, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.read.serializer(new k7$$ExternalSyntheticLambda2(jCurrentTimeMillis, 5));
            }
            return arrayList;
        }
        return arrayList;
    }

    public final void serializer(backwardFocusSearch backwardfocussearch, String str) {
        synchronized (this) {
            isRoot isrootRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(backwardfocussearch, str);
            if (isrootRemoteActionCompatParcelizer == null) {
                return;
            }
            Object[] objArr = {backwardfocussearch, isrootRemoteActionCompatParcelizer, new HashSet()};
            Object objIconCompatParcelizer = LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
            Object obj = objIconCompatParcelizer;
            HashSet hashSet = new HashSet((Collection) objIconCompatParcelizer);
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                backwardfocussearch.read(isrootRemoteActionCompatParcelizer);
            } else {
                backwardfocussearch.serializer(isrootRemoteActionCompatParcelizer, hashSet);
            }
        }
    }

    public final boolean serializer(isRoot isroot, long j) {
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc;
        boolean zEquals;
        synchronized (this) {
            swap swapVar = this.read;
            swapVar.getClass();
            isroot.getClass();
            RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1(swapVar, isroot, (ShortNewsContentCardView) null, 14);
            r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            long jLongValue = ((Long) BuildersKt.serializer(r8lambda2qmxd75iptxkfld4rjabqemoamc, realImageLoader$execute$2$job$1)).longValue();
            synchronized (this) {
                zEquals = read(jLongValue).equals(read(j));
            }
        }
        if (zEquals) {
            return false;
        }
        swap swapVar2 = this.read;
        swapVar2.getClass();
        return true;
    }

    public setEnableExtraAssertions(Context context, String str) {
        this.read = new swap(context, "FirebaseHeartBeat".concat(str));
    }
}
