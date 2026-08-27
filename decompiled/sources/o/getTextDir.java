package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedLocation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPaint;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "selected_location")
public final class getTextDir extends getLineSpacingExtra {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String hint;
    public final onActivityPreCreated location;
    public final List trackingEvents;
    public static final LastStopScreen$LastStopScreenComponent$SelectedLocation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedLocation$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPaint getpaint = getPaint.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getpaint;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(21))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedLocation$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 41;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents;
        }
        int i3 = 61 / 0;
        return this.trackingEvents;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.hint;
        int i5 = i3 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final onActivityPreCreated write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.location;
        }
        int i3 = 60 / 0;
        return this.location;
    }

    public /* synthetic */ getTextDir(int i, String str, onActivityPreCreated onactivityprecreated, List list) {
        if (1 == (i & 1)) {
            this.hint = str;
            if ((i & 2) == 0) {
                this.location = null;
                int i2 = IconCompatParcelizer + 117;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.location = onactivityprecreated;
            }
            if ((i & 4) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
                return;
            }
            this.trackingEvents = list;
            int i5 = write + 115;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getPaint.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.hint.hashCode();
        onActivityPreCreated onactivityprecreated = this.location;
        int iHashCode2 = this.trackingEvents.hashCode() + (((iHashCode * 31) + (onactivityprecreated == null ? 0 : onactivityprecreated.hashCode())) * 31);
        int i4 = write + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SelectedLocation(hint=");
        sb.append(this.hint);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.trackingEvents, ")");
        int i2 = write + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getTextDir)) {
                return false;
            }
            getTextDir gettextdir = (getTextDir) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hint, gettextdir.hint}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, gettextdir.location}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, gettextdir.trackingEvents}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    int i2 = IconCompatParcelizer + 121;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = IconCompatParcelizer + 11;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 31;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 29;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
