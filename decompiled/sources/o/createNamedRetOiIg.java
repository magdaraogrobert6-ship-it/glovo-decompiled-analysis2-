package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$MapComponent$Navigation$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PlatformTypefacesApi;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "navigation")
public final class createNamedRetOiIg extends getDefaultui_text {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String actionTitle;
    public final List destinations;
    public final String title;
    public static final StepComponent$Map$MapComponent$Navigation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$MapComponent$Navigation$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 23;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlatformTypefacesApi platformTypefacesApi = PlatformTypefacesApi.serializer;
            int i4 = read + 69;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return platformTypefacesApi;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(25)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$MapComponent$Navigation$Companion] */
    static {
        int i = read + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    public /* synthetic */ createNamedRetOiIg(int i, String str, String str2, List list) {
        int i2;
        if (1 == (i & 1)) {
            this.destinations = list;
            if ((i & 2) == 0) {
                this.title = "";
                int i3 = IconCompatParcelizer + 91;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                }
                if ((i & 4) == 0) {
                    this.actionTitle = str2;
                    return;
                }
                i2 = serializer + 95;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    this.actionTitle = "";
                    int i4 = 42 / 0;
                    return;
                } else {
                    this.actionTitle = "";
                    return;
                }
            }
            this.title = str;
            int i5 = 2 % 2;
            if ((i & 4) == 0) {
                this.actionTitle = str2;
                return;
            }
            i2 = serializer + 95;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.actionTitle = "";
                int i6 = 42 / 0;
                return;
            } else {
                this.actionTitle = "";
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PlatformTypefacesApi.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.actionTitle.hashCode() + af$$ExternalSyntheticOutline0.m(this.destinations.hashCode() * 31, 31, this.title);
        int i4 = serializer + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Navigation(destinations=");
        sb.append(this.destinations);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", actionTitle=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.actionTitle, ")");
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 107;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createNamedRetOiIg)) {
            int i4 = IconCompatParcelizer + 59;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        createNamedRetOiIg createnamedretoiig = (createNamedRetOiIg) obj;
        Object[] objArr = {this.destinations, createnamedretoiig.destinations};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 47;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr2 = {this.title, createnamedretoiig.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.actionTitle, createnamedretoiig.actionTitle};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = IconCompatParcelizer + 81;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
