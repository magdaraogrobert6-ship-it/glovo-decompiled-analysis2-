package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.data.model.delivery.Shift$Companion;
import java.util.Calendar;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.drawui_graphics;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class setSizeozmzZPI {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Shift$Companion Companion = new Object() { // from class: com.data.model.delivery.Shift$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return drawui_graphics.read;
        }
    };
    public final String area;
    public final Calendar endedAt;
    public final Long id;
    public final boolean isCurrentShift;
    public final Calendar startedAt;

    public final int hashCode() {
        Calendar calendar = this.startedAt;
        int iHashCode = calendar == null ? 0 : calendar.hashCode();
        Calendar calendar2 = this.endedAt;
        int iHashCode2 = calendar2 == null ? 0 : calendar2.hashCode();
        String str = this.area;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Long l = this.id;
        return Boolean.hashCode(this.isCurrentShift) + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.data.model.delivery.Shift$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new setRectOutlinetz77jQwdefault(0)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new setRectOutlinetz77jQwdefault(22)), null, null, null};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSizeozmzZPI)) {
            return false;
        }
        setSizeozmzZPI setsizeozmzzpi = (setSizeozmzZPI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedAt, setsizeozmzzpi.startedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endedAt, setsizeozmzzpi.endedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.area, setsizeozmzzpi.area}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, setsizeozmzzpi.id}, getCieXyz.write())).booleanValue() && this.isCurrentShift == setsizeozmzzpi.isCurrentShift;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shift(startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", area=");
        sb.append(this.area);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isCurrentShift=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.isCurrentShift, ")");
    }

    public /* synthetic */ setSizeozmzZPI(int i, Calendar calendar, Calendar calendar2, String str, Long l, boolean z) {
        if ((i & 1) == 0) {
            this.startedAt = null;
        } else {
            this.startedAt = calendar;
        }
        if ((i & 2) == 0) {
            this.endedAt = null;
        } else {
            this.endedAt = calendar2;
        }
        if ((i & 4) == 0) {
            this.area = null;
        } else {
            this.area = str;
        }
        if ((i & 8) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 16) == 0) {
            this.isCurrentShift = false;
        } else {
            this.isCurrentShift = z;
        }
    }
}
