package o;

import com.roadrunner.delivery.common.data.model.tasks.ConfirmationTask$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class DeviceFontFamilyNameFontKt implements FontKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public static final ConfirmationTask$Companion Companion = new ConfirmationTask$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(4));

    static {
        int i = RemoteActionCompatParcelizer + 93;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
