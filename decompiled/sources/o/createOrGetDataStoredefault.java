package o;

import com.sentiance.sdk.task.TaskManager;

/* JADX INFO: loaded from: classes3.dex */
public final class createOrGetDataStoredefault extends getLatitudeannotations<addBannerViewMonitor> {
    final /* synthetic */ TaskManager RemoteActionCompatParcelizer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<addBannerViewMonitor> getlongitudeannotations) {
        TaskManager taskManager = this.RemoteActionCompatParcelizer;
        TaskManager.read(taskManager);
        TaskManager.IconCompatParcelizer(taskManager);
        TaskManager.write(taskManager);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createOrGetDataStoredefault(TaskManager taskManager, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "task-manager");
        this.RemoteActionCompatParcelizer = taskManager;
    }
}
