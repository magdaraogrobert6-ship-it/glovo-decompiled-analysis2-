package o;

import com.sentiance.core.model.datasync.Payload;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getNotificationStyle {
    public static final serializer write = new serializer(null);
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    private final List<Payload> read;
    private final boolean serializer;

    public final List<Payload> read() {
        return this.read;
    }

    public final boolean serializer() {
        return this.serializer;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        boolean z = this.serializer;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.IconCompatParcelizer.hashCode() + (((iHashCode * 31) + r1) * 31);
    }

    public /* synthetic */ getNotificationStyle(List list, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? instance_delegatelambda0.write : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.sentiance.sdk.ondevice.datasyncing.ProcessedEventResult$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final /* bridge */ /* synthetic */ Object invoke() {
                return createFromParcel.INSTANCE;
            }
        } : r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNotificationStyle)) {
            return false;
        }
        getNotificationStyle getnotificationstyle = (getNotificationStyle) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getnotificationstyle.read}, getCieXyz.write())).booleanValue() || this.serializer != getnotificationstyle.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getnotificationstyle.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ProcessedEventResult(payloads=" + this.read + ", isRequested=" + this.serializer + ", onFinishProcessingPayloads=" + this.IconCompatParcelizer + ')';
    }

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static getNotificationStyle IconCompatParcelizer() {
            return new getNotificationStyle(null, false, null, 7, null);
        }
    }

    public getNotificationStyle(List<Payload> list, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        list.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.read = list;
        this.serializer = z;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public getNotificationStyle() {
        this(null, false, null, 7, null);
    }
}
