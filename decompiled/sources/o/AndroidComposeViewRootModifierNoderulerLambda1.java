package o;

import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.SimpleActor$offer$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewRootModifierNoderulerLambda1 {
    public static performCustomExitMxy_nc0 read(performRequestFocus performrequestfocus, accessgetAlwayscp accessgetalwayscp, ContextScope contextScope, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        try {
            System.loadLibrary("datastore_shared_counter");
            return MultiProcessDataStoreFactory.INSTANCE.create(performrequestfocus, accessgetalwayscp, instance_delegatelambda0Var, contextScope, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            Object[] objArr = {new SimpleActor$offer$2(instance_delegatelambda0Var, (ShortNewsContentCardView) null, 4)};
            int iSerializer = getQueryParameterslambda2.serializer();
            return new androidx.datastore.core.SingleProcessDataStore(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, performrequestfocus, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer), accessgetalwayscp, contextScope);
        }
    }

    public static void read(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parentFile.getName(), "firebaseSessions"}, getCieXyz.write())).booleanValue() && !parentFile.delete()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(parentFile, "Failed to delete conflicting file: ");
                return;
            }
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }
}
