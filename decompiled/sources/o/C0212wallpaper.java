package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.PinAttemptsUiItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PreviewFontScale;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.wallpaper, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class C0212wallpaper {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final mapTreeWithStitching errorMessage;
    public final int maxAttempts;
    public final List trackingEvents;
    public static final PinAttemptsUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PinAttemptsUiItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 115;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PreviewFontScale previewFontScale = PreviewFontScale.write;
            int i4 = write + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return previewFontScale;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(4))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.PinAttemptsUiItem$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 77;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ C0212wallpaper(int i, int i2, mapTreeWithStitching maptreewithstitching, List list) {
        if (7 == (i & 7)) {
            this.maxAttempts = i2;
            this.errorMessage = maptreewithstitching;
            this.trackingEvents = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, PreviewFontScale.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode = Integer.hashCode(this.maxAttempts);
            return this.trackingEvents.hashCode() / ((this.errorMessage.hashCode() / (iHashCode * 71)) << 72);
        }
        int iHashCode2 = Integer.hashCode(this.maxAttempts);
        return this.trackingEvents.hashCode() + ((this.errorMessage.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public C0212wallpaper(int i, mapTreeWithStitching maptreewithstitching, List list) {
        list.getClass();
        this.maxAttempts = i;
        this.errorMessage = maptreewithstitching;
        this.trackingEvents = list;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PinAttemptsUiItem(maxAttempts=");
        sb.append(this.maxAttempts);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.trackingEvents, ")");
        int i2 = read + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 55;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 67;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof C0212wallpaper)) {
            return false;
        }
        C0212wallpaper c0212wallpaper = (C0212wallpaper) obj;
        if (this.maxAttempts != c0212wallpaper.maxAttempts) {
            return false;
        }
        Object[] objArr = {this.errorMessage, c0212wallpaper.errorMessage};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.trackingEvents, c0212wallpaper.trackingEvents};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = IconCompatParcelizer + 101;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
