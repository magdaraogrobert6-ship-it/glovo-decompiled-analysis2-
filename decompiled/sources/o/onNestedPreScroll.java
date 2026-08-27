package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onStartNestedScroll;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "picture_report")
public final class onNestedPreScroll implements insetValue {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String actionTitle;
    public final List components;
    public final String subtitle;
    public final String title;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 103;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                onStartNestedScroll onstartnestedscroll = onStartNestedScroll.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onStartNestedScroll onstartnestedscroll2 = onStartNestedScroll.read;
            int i3 = serializer + 63;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return onstartnestedscroll2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ onNestedPreScroll(int i, String str, String str2, String str3, List list) {
        Object obj = null;
        if (7 == (i & 7)) {
            this.title = str;
            this.subtitle = str2;
            this.actionTitle = str3;
            if ((i & 8) == 0) {
                this.components = instance_delegatelambda0.write;
                int i2 = serializer + 27;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.components = list;
            int i3 = write + 7;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, onStartNestedScroll.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("PictureReport(title=", this.title, ", subtitle=", this.subtitle, ", actionTitle="), this.actionTitle, ", components=", this.components, ")");
            int i3 = serializer + 1;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("PictureReport(title=", this.title, ", subtitle=", this.subtitle, ", actionTitle="), this.actionTitle, ", components=", this.components, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.components.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.actionTitle);
        int i4 = write + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onNestedPreScroll)) {
            return false;
        }
        onNestedPreScroll onnestedprescroll = (onNestedPreScroll) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, onnestedprescroll.title}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, onnestedprescroll.subtitle}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionTitle, onnestedprescroll.actionTitle}, getCieXyz.write())).booleanValue())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, onnestedprescroll.components}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = serializer + 93;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
                int i5 = serializer + 35;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 != 0;
            }
            int i6 = serializer + 39;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = serializer + 87;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 43 / 0;
        }
        return false;
    }
}
