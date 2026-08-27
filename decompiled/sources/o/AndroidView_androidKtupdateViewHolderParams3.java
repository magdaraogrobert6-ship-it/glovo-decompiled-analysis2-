package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptButton$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidView_androidKtupdateViewHolderParams1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = HttpHeaders.ACCEPT)
public final class AndroidView_androidKtupdateViewHolderParams3 extends accessgetCurrentlyFocusedRect {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3$AcceptData$AcceptButton$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptButton$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                AndroidView_androidKtupdateViewHolderParams1 androidView_androidKtupdateViewHolderParams1 = AndroidView_androidKtupdateViewHolderParams1.RemoteActionCompatParcelizer;
                throw null;
            }
            AndroidView_androidKtupdateViewHolderParams1 androidView_androidKtupdateViewHolderParams2 = AndroidView_androidKtupdateViewHolderParams1.RemoteActionCompatParcelizer;
            int i3 = write + 59;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return androidView_androidKtupdateViewHolderParams2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final List acceptDetails;
    public final List events;
    public final String style;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptButton$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(19)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(20)), null};
        int i = RemoteActionCompatParcelizer + 71;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 111;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.style;
        int i4 = i2 + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 83;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        List list = this.events;
        int i4 = i2 + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ AndroidView_androidKtupdateViewHolderParams3(int i, String str, String str2, List list, List list2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.acceptDetails = list;
            if ((i & 4) == 0) {
                this.events = instance_delegatelambda0.write;
            } else {
                this.events = list2;
                int i2 = read + 55;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 8) == 0) {
                int i5 = read + 105;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    this.style = null;
                    return;
                } else {
                    this.style = null;
                    throw null;
                }
            }
            this.style = str2;
            int i6 = IconCompatParcelizer + 89;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidView_androidKtupdateViewHolderParams1.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.events, c8$$ExternalSyntheticOutline0.m(this.acceptDetails, this.title.hashCode() * 31, 31), 31);
        String str = this.style;
        if (str == null) {
            int i2 = read + 101;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = read + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("AcceptButton(title=", this.title, ", acceptDetails=", this.acceptDetails, ", events=");
        sbSerializer.append(this.events);
        sbSerializer.append(", style=");
        sbSerializer.append(this.style);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = IconCompatParcelizer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public AndroidView_androidKtupdateViewHolderParams3(List list, String str, List list2, String str2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.title = str;
        this.acceptDetails = list;
        this.events = list2;
        this.style = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidView_androidKtupdateViewHolderParams3)) {
            return false;
        }
        AndroidView_androidKtupdateViewHolderParams3 androidView_androidKtupdateViewHolderParams3 = (AndroidView_androidKtupdateViewHolderParams3) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidView_androidKtupdateViewHolderParams3.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.acceptDetails, androidView_androidKtupdateViewHolderParams3.acceptDetails}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.events, androidView_androidKtupdateViewHolderParams3.events}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidView_androidKtupdateViewHolderParams3.style}, getCieXyz.write())).booleanValue();
            }
            int i3 = IconCompatParcelizer + 37;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 125;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 79;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
