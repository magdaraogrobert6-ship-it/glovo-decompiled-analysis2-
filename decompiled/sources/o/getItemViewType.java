package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getItemViewType implements notifyItemChanged, hasObservers {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final notifyDataSetChanged IconCompatParcelizer;
    public final createViewHolder RemoteActionCompatParcelizer;
    public final Float read;
    public final String write;

    public getItemViewType(String str, notifyDataSetChanged notifydatasetchanged, Float f, createViewHolder createviewholder) {
        str.getClass();
        notifydatasetchanged.getClass();
        this.write = str;
        this.IconCompatParcelizer = notifydatasetchanged;
        this.read = f;
        this.RemoteActionCompatParcelizer = createviewholder;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Float f = this.read;
        if (f == null) {
            int i3 = serializer + 15;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode3 = f.hashCode();
            int i4 = MediaSessionCompatQueueItem + 59;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return this.RemoteActionCompatParcelizer.hashCode() + ((((iHashCode2 + (iHashCode * 31)) * 31) + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonViewEntity(text=" + this.write + ", style=" + this.IconCompatParcelizer + ", weight=" + this.read + ", actionData=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 11;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 61;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 103;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else if (obj instanceof getItemViewType) {
            getItemViewType getitemviewtype = (getItemViewType) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getitemviewtype.write}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != getitemviewtype.IconCompatParcelizer) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getitemviewtype.read}, getCieXyz.write())).booleanValue() || (!this.RemoteActionCompatParcelizer.equals(getitemviewtype.RemoteActionCompatParcelizer))) {
                return false;
            }
        } else {
            int i8 = i4 + 103;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            int i9 = 5 / 2;
            return false;
        }
        return true;
    }
}
