package o;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationIdlambda0 {
    public static FwFClientsyncClientsyncResult1 write(File file, FwFClientstartUpdater1 fwFClientstartUpdater1, parseLonglambda0 parselonglambda0) {
        file.getClass();
        parselonglambda0.getClass();
        try {
            return fwFClientstartUpdater1 == null ? new FwFClientsyncClientsyncResult1(file, null) : new FwFClientsyncClientsyncResult1(file, fwFClientstartUpdater1);
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to initialize interpreter", new Object[0]);
            return null;
        }
    }
}
