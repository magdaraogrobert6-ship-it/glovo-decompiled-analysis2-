package o;

import android.app.ActivityManager;
import com.sentiance.sdk.memory.MemoryDecisionReason;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class getEventName {
    private final CartUpdatedAction read;
    private final ActivityManager write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final setSubtitleGravity IconCompatParcelizer(long j) {
        CartUpdatedAction cartUpdatedAction = this.read;
        long jSerializer = cartUpdatedAction.serializer() - (cartUpdatedAction.IconCompatParcelizer() - cartUpdatedAction.write());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.write.getMemoryInfo(memoryInfo);
        if (memoryInfo.lowMemory) {
            return new setSubtitleGravity(false, MemoryDecisionReason.SYSTEM_MEMORY_LOW, jSerializer, j);
        }
        return (j <= 9223372036844290047L && jSerializer >= 10485760 + j) ? new setSubtitleGravity(true, MemoryDecisionReason.OK, jSerializer, j) : new setSubtitleGravity(false, MemoryDecisionReason.INSUFFICIENT_HEAP_HEADROOM, jSerializer, j);
    }

    static {
        new IconCompatParcelizer(null);
    }

    public getEventName(ActivityManager activityManager, CartUpdatedAction cartUpdatedAction) {
        activityManager.getClass();
        cartUpdatedAction.getClass();
        this.write = activityManager;
        this.read = cartUpdatedAction;
    }
}
