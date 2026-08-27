package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.ApiCall$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.NoopState_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UnsupportedSearchInfo extends getNoopState {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final Map data;
    public final String method;
    public final String path;
    public static final ApiCall$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.ApiCall$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 79;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            NoopState_androidKt noopState_androidKt = NoopState_androidKt.write;
            int i4 = IconCompatParcelizer + 51;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return noopState_androidKt;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(0)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.ApiCall$Companion] */
    static {
        int i = serializer + 51;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ UnsupportedSearchInfo(String str, int i, Map map, String str2) {
        if (7 == (i & 7)) {
            this.data = map;
            this.method = str;
            this.path = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, NoopState_androidKt.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.path.hashCode() % af$$ExternalSyntheticOutline0.m(this.data.hashCode() >>> 65, 29, this.method);
        }
        return this.path.hashCode() + af$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.method);
    }

    public UnsupportedSearchInfo(Map map, String str, String str2) {
        map.getClass();
        str.getClass();
        str2.getClass();
        this.data = map;
        this.method = str;
        this.path = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ApiCall(data=");
        sb.append(this.data);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", path=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.path, ")");
        int i2 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UnsupportedSearchInfo)) {
            return false;
        }
        UnsupportedSearchInfo unsupportedSearchInfo = (UnsupportedSearchInfo) obj;
        Object[] objArr = {this.data, unsupportedSearchInfo.data};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.method, unsupportedSearchInfo.method};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.path, unsupportedSearchInfo.path};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
