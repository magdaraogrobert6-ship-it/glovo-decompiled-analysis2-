package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accesscreatePrecomposedSlotHandle {
    public final Boolean IconCompatParcelizer;
    public final Float MediaSessionCompatQueueItem;
    public final LayoutNodeSubcompositionsState RemoteActionCompatParcelizer;
    public final accessgetApproachMeasureScopep read;
    public final accessdisposePrecomposedSlot serializer;
    public final LayoutModifierKt write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.write, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem});
    }

    public /* synthetic */ accesscreatePrecomposedSlotHandle(androidx.lifecycle.BlockRunner blockRunner) {
        this.serializer = (accessdisposePrecomposedSlot) blockRunner.read;
        this.write = (LayoutModifierKt) blockRunner.serializer;
        this.read = (accessgetApproachMeasureScopep) blockRunner.RatingCompat;
        this.RemoteActionCompatParcelizer = (LayoutNodeSubcompositionsState) blockRunner.write;
        this.IconCompatParcelizer = (Boolean) blockRunner.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = (Float) blockRunner.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accesscreatePrecomposedSlotHandle)) {
            return false;
        }
        accesscreatePrecomposedSlotHandle accesscreateprecomposedslothandle = (accesscreatePrecomposedSlotHandle) obj;
        return TuplesKt.write(this.serializer, accesscreateprecomposedslothandle.serializer) && TuplesKt.write(this.write, accesscreateprecomposedslothandle.write) && TuplesKt.write(this.read, accesscreateprecomposedslothandle.read) && TuplesKt.write(this.RemoteActionCompatParcelizer, accesscreateprecomposedslothandle.RemoteActionCompatParcelizer) && TuplesKt.write(this.IconCompatParcelizer, accesscreateprecomposedslothandle.IconCompatParcelizer) && TuplesKt.write(this.MediaSessionCompatQueueItem, accesscreateprecomposedslothandle.MediaSessionCompatQueueItem);
    }
}
