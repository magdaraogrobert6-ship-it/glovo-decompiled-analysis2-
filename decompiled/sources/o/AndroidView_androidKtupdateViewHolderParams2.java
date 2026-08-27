package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptDetails$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidView_androidKtupdateViewHolderParams4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidView_androidKtupdateViewHolderParams2 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final Map acceptData;
    public final String url;
    public static final StateV3$AcceptData$AcceptDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptDetails$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 93;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidView_androidKtupdateViewHolderParams4.write;
            }
            int i3 = 53 / 0;
            return AndroidView_androidKtupdateViewHolderParams4.write;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(21))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptDetails$Companion] */
    static {
        int i = read + 43;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidView_androidKtupdateViewHolderParams2(int i, String str, Map map) {
        if (3 == (i & 3)) {
            this.url = str;
            this.acceptData = map;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidView_androidKtupdateViewHolderParams4.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.url.hashCode();
            iHashCode = this.acceptData.hashCode();
            i = iHashCode2 << 98;
        } else {
            int iHashCode3 = this.url.hashCode();
            iHashCode = this.acceptData.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AndroidView_androidKtupdateViewHolderParams2(String str, Map map) {
        str.getClass();
        this.url = str;
        this.acceptData = map;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AcceptDetails(url=" + this.url + ", acceptData=" + this.acceptData + ")";
        int i2 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AndroidView_androidKtupdateViewHolderParams2)) {
            return false;
        }
        AndroidView_androidKtupdateViewHolderParams2 androidView_androidKtupdateViewHolderParams2 = (AndroidView_androidKtupdateViewHolderParams2) obj;
        Object[] objArr = {this.url, androidView_androidKtupdateViewHolderParams2.url};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.acceptData, androidView_androidKtupdateViewHolderParams2.acceptData};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 33;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 55;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
