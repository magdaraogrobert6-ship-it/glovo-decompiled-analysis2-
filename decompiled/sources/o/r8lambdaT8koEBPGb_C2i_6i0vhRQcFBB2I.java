package o;

import io.grpc.StatusException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I.class.getName());
    public boolean IconCompatParcelizer;
    public long MediaDescriptionCompat;
    public final visitSubtreeYYKmhodefault MediaSessionCompatQueueItem;
    public final long RemoteActionCompatParcelizer;
    public LinkedHashMap read = new LinkedHashMap();
    public StatusException serializer;

    public final void IconCompatParcelizer() {
        synchronized (this) {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            long jRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
            this.MediaDescriptionCompat = jRemoteActionCompatParcelizer;
            LinkedHashMap linkedHashMap = this.read;
            this.read = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U((getLocalHtmlUrlFromRemoteUrllambda4) entry.getKey(), jRemoteActionCompatParcelizer));
                } catch (Throwable th) {
                    write.log(Level.SEVERE, "Failed to execute PingCallback", th);
                }
            }
        }
    }

    public final void IconCompatParcelizer(getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4, Executor executor) {
        synchronized (this) {
            if (!this.IconCompatParcelizer) {
                this.read.put(getlocalhtmlurlfromremoteurllambda4, executor);
                return;
            }
            StatusException statusException = this.serializer;
            r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U r8lambdamsir4yjkmf1qkduetrtfwaoe89u = statusException != null ? new r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U(getlocalhtmlurlfromremoteurllambda4, statusException) : new r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U(getlocalhtmlurlfromremoteurllambda4, this.MediaDescriptionCompat);
            try {
                executor.execute(r8lambdamsir4yjkmf1qkduetrtfwaoe89u);
            } catch (Throwable th) {
                write.log(Level.SEVERE, "Failed to execute PingCallback", th);
            }
        }
    }

    public final long serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void serializer(StatusException statusException) {
        synchronized (this) {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.serializer = statusException;
            LinkedHashMap linkedHashMap = this.read;
            this.read = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                read((getLocalHtmlUrlFromRemoteUrllambda4) entry.getKey(), (Executor) entry.getValue(), statusException);
            }
        }
    }

    public static void read(getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4, Executor executor, StatusException statusException) {
        try {
            executor.execute(new r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U(getlocalhtmlurlfromremoteurllambda4, statusException));
        } catch (Throwable th) {
            write.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I(long j, visitSubtreeYYKmhodefault visitsubtreeyykmhodefault) {
        this.RemoteActionCompatParcelizer = j;
        this.MediaSessionCompatQueueItem = visitsubtreeyykmhodefault;
    }
}
