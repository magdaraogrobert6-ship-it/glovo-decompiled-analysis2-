package bo.app;

import android.content.Context;
import android.os.Process;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.BrazeInternalLocationApi;
import com.braze.location.IBrazeLocationApi;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    public static int serializer;
    public static int write;
    public final IBrazeLocationApi a;

    public d2(Context context, EnumSet enumSet, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        enumSet.getClass();
        brazeConfigurationProvider.getClass();
        IBrazeLocationApi iBrazeLocationApi = null;
        try {
            BrazeInternalLocationApi.Companion companion = BrazeInternalLocationApi.Companion;
            Object objNewInstance = BrazeInternalLocationApi.class.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            iBrazeLocationApi = (IBrazeLocationApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, enumSet, brazeConfigurationProvider);
        }
    }

    public static int write() {
        int i = serializer;
        int i2 = i % 5124721;
        serializer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        write = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
