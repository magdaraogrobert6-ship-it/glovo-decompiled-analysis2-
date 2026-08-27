package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureOnly extends MeasurePassDelegatelayoutChildrenBlock14 {
    public getPreviousPlaceOrderui IconCompatParcelizer;
    public String MediaSessionCompatQueueItem;
    public long RatingCompat;
    public MeasurePassDelegateWhenMappings RemoteActionCompatParcelizer;
    public MeasureScopeWithLayoutNodeKt read;
    public MeasurePassDelegatelayoutChildrenBlock1 serializer;
    public byte write;

    public final remeasureIfNeededdefault read() {
        String str;
        getPreviousPlaceOrderui getpreviousplaceorderui;
        MeasurePassDelegatelayoutChildrenBlock1 measurePassDelegatelayoutChildrenBlock1;
        if (this.write == 1 && (str = this.MediaSessionCompatQueueItem) != null && (getpreviousplaceorderui = this.IconCompatParcelizer) != null && (measurePassDelegatelayoutChildrenBlock1 = this.serializer) != null) {
            return new remeasureIfNeededdefault(this.RatingCompat, str, getpreviousplaceorderui, measurePassDelegatelayoutChildrenBlock1, this.RemoteActionCompatParcelizer, this.read);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.write) == 0) {
            sb.append(" timestamp");
        }
        if (this.MediaSessionCompatQueueItem == null) {
            sb.append(" type");
        }
        if (this.IconCompatParcelizer == null) {
            sb.append(" app");
        }
        if (this.serializer == null) {
            sb.append(" device");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
