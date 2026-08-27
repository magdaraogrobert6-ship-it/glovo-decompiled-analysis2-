package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$TimerState$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Setting;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontVariation {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String description;
    public final getWindowTitle stateChangeAction;
    public static final UtccComponent$TimerCard$TimerState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$TimerState$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 19;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Setting setting = Setting.RemoteActionCompatParcelizer;
            int i4 = serializer + 93;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setting;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(17))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$TimerState$Companion] */
    static {
        Object obj = null;
        int i = serializer + 3;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final getWindowTitle RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.stateChangeAction;
        }
        throw null;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            str = this.description;
            int i4 = 65 / 0;
        } else {
            str = this.description;
        }
        int i5 = i3 + 27;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public /* synthetic */ FontVariation(int i, String str, getWindowTitle getwindowtitle) {
        if ((i & 1) != 0) {
            this.description = str;
            int i2 = write + 67;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                this.stateChangeAction = null;
                return;
            }
            this.stateChangeAction = getwindowtitle;
            int i3 = write + 109;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.description = null;
        int i5 = RemoteActionCompatParcelizer + 95;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        if ((i & 2) == 0) {
            this.stateChangeAction = null;
            return;
        }
        this.stateChangeAction = getwindowtitle;
        int i8 = write + 109;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.description;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = write + 65;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        getWindowTitle getwindowtitle = this.stateChangeAction;
        if (getwindowtitle == null) {
            int i4 = write + 83;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = getwindowtitle.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TimerState(description=" + this.description + ", stateChangeAction=" + this.stateChangeAction + ")";
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontVariation) {
            FontVariation fontVariation = (FontVariation) obj;
            Object[] objArr = {this.description, fontVariation.description};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i2 = write + 37;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            Object[] objArr2 = {this.stateChangeAction, fontVariation.stateChangeAction};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 9;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 3;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
