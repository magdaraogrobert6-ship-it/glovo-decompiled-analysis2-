package o;

import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class AndroidViewHolder {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Companion Companion = new DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(1));

    static {
        int i = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }
}
