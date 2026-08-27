package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.PickUpDropOffTaskUiItem$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public interface uiMode extends showBackground {
    public static final PickUpDropOffTaskUiItem$Companion Companion = PickUpDropOffTaskUiItem$Companion.IconCompatParcelizer;

    String IconCompatParcelizer();

    boolean read();

    boolean write();
}
