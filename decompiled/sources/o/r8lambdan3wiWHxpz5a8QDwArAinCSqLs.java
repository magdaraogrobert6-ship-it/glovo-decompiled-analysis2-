package o;

import com.sentiance.sdk.InjectUsing;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "CrashLoopCache", componentName = "CrashLoopCache")
public final class r8lambdan3wiWHxpz5a8QDwArAinCSqLs {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int RemoteActionCompatParcelizer() {
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        int iWrite = cVar.write("startup_crash_count", 0) + 1;
        cVar.IconCompatParcelizer(iWrite, "startup_crash_count");
        return iWrite;
    }

    static {
        new serializer(null);
    }

    public r8lambdan3wiWHxpz5a8QDwArAinCSqLs(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        cVar.getClass();
        parselonglambda0.getClass();
        this.IconCompatParcelizer = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    public final void write(r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4) {
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        if (r8lambdawomqpehnmpryek66bisvjgio9j4 == null) {
            cVar.read("unprocessed_init_session_json");
            return;
        }
        try {
            cVar.RemoteActionCompatParcelizer("unprocessed_init_session_json", r8lambdawomqpehnmpryek66bisvjgio9j4.write());
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to serialize unprocessed init session to cache", new Object[0]);
        }
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.write("startup_crash_count", 0);
    }

    public final r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 serializer() {
        String strWrite = this.IconCompatParcelizer.write("unprocessed_init_session_json", (String) null);
        if (strWrite != null) {
            try {
                return (r8lambdawomQpeHNmpRYEK66BISVJgiO9j4) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdawomQpeHNmpRYEK66BISVJgiO9j4.class, strWrite);
            } catch (Exception e) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to parse unprocessed init session from cache", new Object[0]);
            }
        }
        return null;
    }

    public final void write() {
        this.IconCompatParcelizer.read();
    }
}
