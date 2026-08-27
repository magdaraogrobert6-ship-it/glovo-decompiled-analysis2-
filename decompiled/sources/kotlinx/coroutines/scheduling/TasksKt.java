package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.SystemPropsKt;
import o.getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_releaseannotations;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TasksKt {
    public static final long IconCompatParcelizer;
    public static final getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_releaseannotations MediaSessionCompatQueueItem;
    public static final long RemoteActionCompatParcelizer;
    public static final int read;
    public static final int serializer;
    public static final String write;

    static {
        String strRemoteActionCompatParcelizer = SystemPropsKt.RemoteActionCompatParcelizer("kotlinx.coroutines.scheduler.default.name");
        if (strRemoteActionCompatParcelizer == null) {
            strRemoteActionCompatParcelizer = "DefaultDispatcher";
        }
        write = strRemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer = SystemPropsKt.write("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int iSerializer = SystemPropsKt.serializer();
        if (iSerializer < 2) {
            iSerializer = 2;
        }
        read = SystemPropsKt.IconCompatParcelizer(iSerializer, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        serializer = SystemPropsKt.IconCompatParcelizer(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        IconCompatParcelizer = TimeUnit.SECONDS.toNanos(SystemPropsKt.write("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        MediaSessionCompatQueueItem = getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_releaseannotations.IconCompatParcelizer;
    }
}
