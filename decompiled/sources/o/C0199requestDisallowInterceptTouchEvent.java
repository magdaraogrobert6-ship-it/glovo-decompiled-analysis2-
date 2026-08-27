package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setOnDensityChangedui;

/* JADX INFO: renamed from: o.requestDisallowInterceptTouchEvent, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "picture_upload")
public final class C0199requestDisallowInterceptTouchEvent implements insetValue {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final List components;
    public final int pictureLimit;
    public final setReset request;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 1;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setOnDensityChangedui setondensitychangedui = setOnDensityChangedui.write;
            int i4 = read + 13;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setondensitychangedui;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(10))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$Companion] */
    static {
        int i = serializer + 97;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ C0199requestDisallowInterceptTouchEvent(int i, int i2, setReset setreset, List list) {
        if (3 == (i & 3)) {
            this.pictureLimit = i2;
            this.request = setreset;
            if ((i & 4) == 0) {
                this.components = instance_delegatelambda0.write;
                int i3 = write + 67;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.components = list;
            int i4 = write + 81;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setOnDensityChangedui.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.pictureLimit);
        int iHashCode2 = this.components.hashCode() + ((this.request.hashCode() + (iHashCode * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PictureUpload(pictureLimit=");
        sb.append(this.pictureLimit);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", components=");
        String str = MediaSessionCompatQueueItem.read(sb, this.components, ")");
        int i2 = RemoteActionCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 95;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof C0199requestDisallowInterceptTouchEvent) {
            C0199requestDisallowInterceptTouchEvent c0199requestDisallowInterceptTouchEvent = (C0199requestDisallowInterceptTouchEvent) obj;
            if (this.pictureLimit == c0199requestDisallowInterceptTouchEvent.pictureLimit) {
                Object[] objArr = {this.request, c0199requestDisallowInterceptTouchEvent.request};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    int i4 = RemoteActionCompatParcelizer + 65;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                Object[] objArr2 = {this.components, c0199requestDisallowInterceptTouchEvent.components};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i6 = write + 37;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = RemoteActionCompatParcelizer + 35;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = write + 71;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
