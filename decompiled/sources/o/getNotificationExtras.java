package o;

import com.sentiance.sdk.feedback.consumer.TimestampInfo$deleteAllTimestampsOlderThan$1;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class getNotificationExtras implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private final java.util.SortedSet<Long> serializer;

    public final java.util.SortedSet<Long> RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.serializer.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).longValue());
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNotificationExtras)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((getNotificationExtras) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TimestampInfo(timestamps=" + this.serializer + ')';
    }

    public /* synthetic */ getNotificationExtras(java.util.SortedSet sortedSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TreeSet() : sortedSet);
    }

    public getNotificationExtras(java.util.SortedSet<Long> sortedSet) {
        sortedSet.getClass();
        this.serializer = sortedSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getNotificationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            this.serializer.add(Long.valueOf(jSONArray.getLong(i)));
        }
    }

    public final boolean write(long j) {
        final TimestampInfo$deleteAllTimestampsOlderThan$1 timestampInfo$deleteAllTimestampsOlderThan$1 = new TimestampInfo$deleteAllTimestampsOlderThan$1(j);
        return this.serializer.removeIf(new Predicate() { // from class: o.getNotificationSound
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) ((TimestampInfo$deleteAllTimestampsOlderThan$1) timestampInfo$deleteAllTimestampsOlderThan$1).invoke(obj)).booleanValue();
            }
        });
    }
}
