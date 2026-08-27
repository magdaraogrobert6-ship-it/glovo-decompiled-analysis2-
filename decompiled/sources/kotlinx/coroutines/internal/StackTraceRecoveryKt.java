package kotlinx.coroutines.internal;

import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import o.MediaMetadataCompat;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes4.dex */
public final class StackTraceRecoveryKt {
    public static final /* synthetic */ int serializer = 0;

    static {
        Object isitemdismissable;
        Object isitemdismissable2;
        MediaMetadataCompat.read();
        try {
            isitemdismissable = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (onItemDismiss.serializer(isitemdismissable) != null) {
            isitemdismissable = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            isitemdismissable2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            isitemdismissable2 = new isItemDismissable(th2);
        }
        if (onItemDismiss.serializer(isitemdismissable2) != null) {
            isitemdismissable2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
