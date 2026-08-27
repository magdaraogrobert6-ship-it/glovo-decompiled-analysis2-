package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapper implements Comparable {
    public final long RemoteActionCompatParcelizer;

    public static final long RemoteActionCompatParcelizer(long j, long j2) {
        int i = BrazeInAppMessageManagerWhenMappings.IconCompatParcelizer;
        setUnregisteredInAppMessage setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
        setunregisteredinappmessage.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            if ((1 | (j - 1)) != Long.MAX_VALUE) {
                return RangesKt.IconCompatParcelizer(j, j2, setunregisteredinappmessage);
            }
            Object[] objArr = {Long.valueOf(j)};
            int iWrite = BackspaceCommand.write();
            return ((Long) RangesKt.read(-903966784, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 903966784, iWrite)).longValue();
        }
        if (j == j2) {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            return 0L;
        }
        Object[] objArr2 = {Long.valueOf(j2)};
        int iWrite2 = BackspaceCommand.write();
        return BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(((Long) RangesKt.read(-903966784, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), 903966784, iWrite2)).longValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return restoreFocusedChild.serializer(this, (DefaultInAppMessageViewWrapper) obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer);
    }

    public static long serializer(long j) {
        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
        setUnregisteredInAppMessage setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
        setunregisteredinappmessage.getClass();
        if ((1 | (j - 1)) != Long.MAX_VALUE) {
            return RangesKt.IconCompatParcelizer(jWrite, j, setunregisteredinappmessage);
        }
        Object[] objArr = {Long.valueOf(j)};
        int iWrite = BackspaceCommand.write();
        return BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(((Long) RangesKt.read(-903966784, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 903966784, iWrite)).longValue());
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.RemoteActionCompatParcelizer + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DefaultInAppMessageViewWrapper) {
            return this.RemoteActionCompatParcelizer == ((DefaultInAppMessageViewWrapper) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }
}
