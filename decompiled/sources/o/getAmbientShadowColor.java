package o;

import com.deliveryhero.contract.model.Translations$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public abstract class getAmbientShadowColor {
    public final boolean shouldShowOriginalWithTranslated;
    public final List supportedTranslationsList;
    public static final Translations$Companion Companion = new Translations$Companion();
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), null};
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, RenderNodeVerificationHelper23.MediaDescriptionCompat);

    public getAmbientShadowColor(List list) {
        this.supportedTranslationsList = list;
        this.shouldShowOriginalWithTranslated = false;
    }

    public /* synthetic */ getAmbientShadowColor(List list, boolean z) {
        this.supportedTranslationsList = list;
        this.shouldShowOriginalWithTranslated = z;
    }
}
