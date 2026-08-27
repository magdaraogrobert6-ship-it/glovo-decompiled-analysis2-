package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.DestinationLocation;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$GetDirections$Companion;
import kotlinx.serialization.Serializable;
import o.getW100annotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "get_directions")
public final class getThinannotations extends getMediumannotations {
    public static final ScrollableComponent$GetDirections$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$GetDirections$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 57;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getW100annotations.write;
            }
            int i3 = 65 / 0;
            return getW100annotations.write;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final DestinationLocation destinationLocation;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$GetDirections$Companion] */
    static {
        int i = IconCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getThinannotations(int i, String str, DestinationLocation destinationLocation) {
        if (3 == (i & 3)) {
            this.title = str;
            this.destinationLocation = destinationLocation;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getW100annotations.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.destinationLocation.hashCode() << (this.title.hashCode() << 61);
        } else {
            iHashCode = (this.title.hashCode() * 31) + this.destinationLocation.hashCode();
        }
        int i3 = read + 31;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GetDirections(title=" + this.title + ", destinationLocation=" + this.destinationLocation + ")";
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getThinannotations)) {
            return false;
        }
        getThinannotations getthinannotations = (getThinannotations) obj;
        Object[] objArr = {this.title, getthinannotations.title};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.destinationLocation, getthinannotations.destinationLocation};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i4 = read + 93;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 41 / 0;
                }
                return true;
            }
            int i6 = RemoteActionCompatParcelizer + 87;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 61;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i10 = RemoteActionCompatParcelizer + 9;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
