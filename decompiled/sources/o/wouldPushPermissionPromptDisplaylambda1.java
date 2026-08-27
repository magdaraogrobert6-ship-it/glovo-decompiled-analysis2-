package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wouldPushPermissionPromptDisplaylambda1 {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer;
    public static wouldPushPermissionPromptDisplaylambda1 serializer;
    public static final List write;
    public final LinkedHashSet IconCompatParcelizer = new LinkedHashSet();
    public final LinkedHashMap read = new LinkedHashMap();

    public final void IconCompatParcelizer() {
        synchronized (this) {
            this.read.clear();
            for (wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 : this.IconCompatParcelizer) {
                String str = wouldpushpermissionpromptdisplaylambda3.read();
                if (((wouldPushPermissionPromptDisplaylambda3) this.read.get(str)) == null) {
                    this.read.put(str, wouldpushpermissionpromptdisplaylambda3);
                }
            }
        }
    }

    public final wouldPushPermissionPromptDisplaylambda3 read(String str) {
        wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3;
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.read;
            TextStreamsKt.serializer(str, "policy");
            wouldpushpermissionpromptdisplaylambda3 = (wouldPushPermissionPromptDisplaylambda3) linkedHashMap.get(str);
        }
        return wouldpushpermissionpromptdisplaylambda3;
    }

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(wouldPushPermissionPromptDisplaylambda1.class.getName());
        RemoteActionCompatParcelizer = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = BrazeWebViewActivitycreateWebViewClient1.read;
            arrayList.add(BrazeWebViewActivitycreateWebViewClient1.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(r8lambdayUW13Mxe2fvymD1dKYxwIACIuwY.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        write = Collections.unmodifiableList(arrayList);
    }

    public static wouldPushPermissionPromptDisplaylambda1 read() {
        wouldPushPermissionPromptDisplaylambda1 wouldpushpermissionpromptdisplaylambda1;
        synchronized (wouldPushPermissionPromptDisplaylambda1.class) {
            if (serializer == null) {
                List<wouldPushPermissionPromptDisplaylambda3> listRemoteActionCompatParcelizer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(wouldPushPermissionPromptDisplaylambda3.class, write, wouldPushPermissionPromptDisplaylambda3.class.getClassLoader(), new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(6));
                serializer = new wouldPushPermissionPromptDisplaylambda1();
                for (wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 : listRemoteActionCompatParcelizer) {
                    RemoteActionCompatParcelizer.fine("Service loader found " + wouldpushpermissionpromptdisplaylambda3);
                    wouldPushPermissionPromptDisplaylambda1 wouldpushpermissionpromptdisplaylambda2 = serializer;
                    synchronized (wouldpushpermissionpromptdisplaylambda2) {
                        wouldpushpermissionpromptdisplaylambda3.getClass();
                        wouldpushpermissionpromptdisplaylambda2.IconCompatParcelizer.add(wouldpushpermissionpromptdisplaylambda3);
                    }
                }
                serializer.IconCompatParcelizer();
            }
            wouldpushpermissionpromptdisplaylambda1 = serializer;
        }
        return wouldpushpermissionpromptdisplaylambda1;
    }
}
