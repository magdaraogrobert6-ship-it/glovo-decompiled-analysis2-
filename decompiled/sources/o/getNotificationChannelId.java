package o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getNotificationChannelId implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 read;
    private final Object serializer;
    private final com.sentiance.sdk.util.c write;

    public final void RemoteActionCompatParcelizer(List<Long> list) {
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        synchronized (this.serializer) {
            getNotificationExtras getnotificationextrasIconCompatParcelizer = IconCompatParcelizer();
            getnotificationextrasIconCompatParcelizer.RemoteActionCompatParcelizer().addAll(list);
            this.write.RemoteActionCompatParcelizer("RECORDED_FEEDBACK_TIMESTAMPS", getnotificationextrasIconCompatParcelizer.write());
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return instance_delegatelambda0.write;
    }

    public Integer read() {
        return null;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        synchronized (this.serializer) {
            getNotificationExtras getnotificationextrasIconCompatParcelizer = IconCompatParcelizer();
            if (getnotificationextrasIconCompatParcelizer.write(j)) {
                this.write.RemoteActionCompatParcelizer("RECORDED_FEEDBACK_TIMESTAMPS", getnotificationextrasIconCompatParcelizer.write());
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.read();
    }

    public final boolean read(long j) {
        boolean zContains;
        synchronized (this.serializer) {
            zContains = IconCompatParcelizer().RemoteActionCompatParcelizer().contains(Long.valueOf(j));
        }
        return zContains;
    }

    public getNotificationChannelId(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        cVar.getClass();
        parselonglambda0.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.write = cVar;
        this.read = parselonglambda0;
        this.serializer = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getNotificationExtras IconCompatParcelizer() {
        com.sentiance.sdk.util.c cVar = this.write;
        String strWrite = cVar.write("RECORDED_FEEDBACK_TIMESTAMPS", (String) null);
        getNotificationExtras getnotificationextras = new getNotificationExtras(null, 1, 0 == true ? 1 : 0);
        if (strWrite != null) {
            try {
                getnotificationextras.RemoteActionCompatParcelizer(strWrite);
                Integer num = read();
                if (num != null) {
                    if (getnotificationextras.write(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(num.intValue()))) {
                        cVar.RemoteActionCompatParcelizer("RECORDED_FEEDBACK_TIMESTAMPS", getnotificationextras.write());
                        return getnotificationextras;
                    }
                }
            } catch (JSONException e) {
                this.read.IconCompatParcelizer(false, e, "Failed to parse recorded timestamps", new Object[0]);
            }
        }
        return getnotificationextras;
    }

    public final void serializer(long j) {
        synchronized (this.serializer) {
            getNotificationExtras getnotificationextrasIconCompatParcelizer = IconCompatParcelizer();
            getnotificationextrasIconCompatParcelizer.RemoteActionCompatParcelizer().add(Long.valueOf(j));
            this.write.RemoteActionCompatParcelizer("RECORDED_FEEDBACK_TIMESTAMPS", getnotificationextrasIconCompatParcelizer.write());
        }
    }
}
