package o;

import android.os.Message;
import com.sentiance.sdk.task.TaskManager;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetDataStoreScopeMapcp implements writeData {
    final /* synthetic */ TaskManager write;

    private void read() {
        TaskManager taskManager = this.write;
        for (Map.Entry entry : taskManager.IconCompatParcelizer().entrySet()) {
            createOrGetDataStorelambda00 createorgetdatastorelambda00 = (createOrGetDataStorelambda00) entry.getKey();
            createOrGetDataStorelambda01 createorgetdatastorelambda01 = (createOrGetDataStorelambda01) entry.getValue();
            if (createorgetdatastorelambda01.IconCompatParcelizer() && !createorgetdatastorelambda01.serializer() && taskManager.serializer(createorgetdatastorelambda01.write()) <= 0) {
                TaskManager.serializer(taskManager, createorgetdatastorelambda00);
            }
        }
    }

    public accessgetDataStoreScopeMapcp(TaskManager taskManager) {
        this.write = taskManager;
    }

    @Override // o.writeData
    public final void handleMessage(Message message) {
        if (message.what == 9) {
            synchronized (this.write) {
                if (TaskManager.RemoteActionCompatParcelizer(this.write)) {
                    read();
                } else {
                    TaskManager taskManager = this.write;
                    for (Map.Entry entry : taskManager.IconCompatParcelizer().entrySet()) {
                        createOrGetDataStorelambda01 createorgetdatastorelambda01 = (createOrGetDataStorelambda01) entry.getValue();
                        if (createorgetdatastorelambda01.IconCompatParcelizer() && !createorgetdatastorelambda01.serializer()) {
                            TaskManager.serializer(taskManager, (createOrGetDataStorelambda00) entry.getKey());
                        }
                    }
                }
            }
            this.write.serializer(false);
        }
    }
}
