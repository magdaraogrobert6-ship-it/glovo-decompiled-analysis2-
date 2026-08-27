package bo.app;

import android.content.Context;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class t4 {
    public final void a(Context context) {
        context.getClass();
        try {
            File file = new File(context.getCacheDir(), DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 2), 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(10), 4, (Object) null);
        }
    }

    public static final String a(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Deleting lru image cache directory at: ", file.getAbsolutePath());
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }

    public static File a(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(af$$ExternalSyntheticOutline0.m(context.getCacheDir().getPath(), File.separator, str));
    }
}
