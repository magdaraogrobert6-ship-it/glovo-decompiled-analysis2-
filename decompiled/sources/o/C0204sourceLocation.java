package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScannedItemsDialog$Companion;
import kotlinx.serialization.Serializable;
import o.nextSourceLocation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.sourceLocation, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class C0204sourceLocation {
    public static final MultipleCodeScanTaskUiItem$ScannedItemsDialog$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScannedItemsDialog$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 123;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return nextSourceLocation.IconCompatParcelizer;
            }
            nextSourceLocation nextsourcelocation = nextSourceLocation.IconCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final ComposeAnimationState closeButton;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScannedItemsDialog$Companion] */
    static {
        int i = write + 39;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ C0204sourceLocation(int i, String str, ComposeAnimationState composeAnimationState) {
        if (3 == (i & 3)) {
            this.title = str;
            this.closeButton = composeAnimationState;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, nextSourceLocation.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.closeButton.hashCode() % (this.title.hashCode() / 20);
        }
        return this.closeButton.hashCode() + (this.title.hashCode() * 31);
    }

    public C0204sourceLocation(String str, ComposeAnimationState composeAnimationState) {
        str.getClass();
        this.title = str;
        this.closeButton = composeAnimationState;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ScannedItemsDialog(title=" + this.title + ", closeButton=" + this.closeButton + ")";
        int i2 = read + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof C0204sourceLocation))) {
            C0204sourceLocation c0204sourceLocation = (C0204sourceLocation) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, c0204sourceLocation.title}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.closeButton, c0204sourceLocation.closeButton}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 45;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return false;
        }
        int i4 = read + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
