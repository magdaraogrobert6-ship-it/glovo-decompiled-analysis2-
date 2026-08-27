package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.runCached;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetResultCachep {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final Long id;
    public final isPermanentFailureimpl issues;
    public final String paymentEstimationId;
    public final String status;
    public final Map tasks;
    public static final DeliveryRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 7;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return runCached.write;
            }
            runCached runcached = runCached.write;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(2)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Companion] */
    static {
        int i = read + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ accessgetResultCachep(int i, Long l, String str, isPermanentFailureimpl ispermanentfailureimpl, Map map, String str2) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 2) == 0) {
            int i2 = serializer + 45;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.status = null;
                int i3 = 79 / 0;
            } else {
                this.status = null;
            }
        } else {
            this.status = str;
        }
        if ((i & 4) == 0) {
            int i4 = RemoteActionCompatParcelizer + 85;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.issues = null;
                int i5 = 89 / 0;
            } else {
                this.issues = null;
            }
        } else {
            this.issues = ispermanentfailureimpl;
        }
        if ((i & 8) == 0) {
            this.tasks = null;
        } else {
            this.tasks = map;
            int i6 = 2 % 2;
        }
        if ((i & 16) != 0) {
            this.paymentEstimationId = str2;
            return;
        }
        int i7 = serializer + 103;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            this.paymentEstimationId = null;
        } else {
            this.paymentEstimationId = null;
            int i8 = 56 / 0;
        }
    }

    public accessgetResultCachep(String str, isPermanentFailureimpl ispermanentfailureimpl, Map map) {
        this.id = null;
        this.status = str;
        this.issues = ispermanentfailureimpl;
        this.tasks = map;
        this.paymentEstimationId = null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryRequestBody(id=");
        sb.append(this.id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", issues=");
        sb.append(this.issues);
        sb.append(", tasks=");
        sb.append(this.tasks);
        sb.append(", paymentEstimationId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.paymentEstimationId, ")");
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 109;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.id;
        if (l == null) {
            int i5 = i2 + 89;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        String str = this.status;
        if (str == null) {
            int i7 = serializer + 7;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 29;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 2 / 4;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        isPermanentFailureimpl ispermanentfailureimpl = this.issues;
        int iHashCode4 = ispermanentfailureimpl == null ? 0 : ispermanentfailureimpl.hashCode();
        Map map = this.tasks;
        if (map == null) {
            int i12 = RemoteActionCompatParcelizer + 7;
            int i13 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i13;
            iHashCode3 = i12 % 2 == 0 ? 1 : 0;
            int i14 = i13 + 111;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            iHashCode3 = map.hashCode();
        }
        String str2 = this.paymentEstimationId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 57;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof accessgetResultCachep)) {
            return false;
        }
        accessgetResultCachep accessgetresultcachep = (accessgetResultCachep) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, accessgetresultcachep.id}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, accessgetresultcachep.status}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.issues, accessgetresultcachep.issues}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tasks, accessgetresultcachep.tasks}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentEstimationId, accessgetresultcachep.paymentEstimationId}, getCieXyz.write())).booleanValue();
            }
            int i4 = RemoteActionCompatParcelizer + 61;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = RemoteActionCompatParcelizer + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
