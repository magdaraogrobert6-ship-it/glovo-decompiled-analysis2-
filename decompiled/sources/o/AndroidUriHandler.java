package o;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.zzz;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidUriHandler {
    public static final Object IconCompatParcelizer = new Object();
    public static AndroidUriHandler read;
    public getPositionnOccac write;

    public static AndroidUriHandler serializer() {
        AndroidUriHandler androidUriHandler;
        synchronized (IconCompatParcelizer) {
            accessgetSystemNavigationDowncp.serializer("MlKitContext has not been initialized", read != null);
            androidUriHandler = read;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(androidUriHandler);
        }
        return androidUriHandler;
    }

    public static AndroidUriHandler serializer(Context context, Executor executor) {
        AndroidUriHandler androidUriHandler;
        synchronized (IconCompatParcelizer) {
            accessgetSystemNavigationDowncp.serializer("MlKitContext is already initialized", read == null);
            AndroidUriHandler androidUriHandler2 = new AndroidUriHandler();
            read = androidUriHandler2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayList = new zzbv(context, 14, new zzz(initialValue.class)).read();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            getAlignmentLinesMap getalignmentlinesmap = isPlacedUnderMotionFrameOfReference.RemoteActionCompatParcelizer;
            arrayList2.addAll(arrayList);
            arrayList3.add(getHasMeasureResult.IconCompatParcelizer(context, Context.class, new Class[0]));
            arrayList3.add(getHasMeasureResult.IconCompatParcelizer(androidUriHandler2, AndroidUriHandler.class, new Class[0]));
            getPositionnOccac getpositionnoccac = new getPositionnOccac(executor, arrayList2, arrayList3, getalignmentlinesmap);
            androidUriHandler2.write = getpositionnoccac;
            getpositionnoccac.IconCompatParcelizer(true);
            androidUriHandler = read;
        }
        return androidUriHandler;
    }

    public final Context IconCompatParcelizer() {
        return (Context) IconCompatParcelizer(Context.class);
    }

    public final Object IconCompatParcelizer(Class cls) {
        accessgetSystemNavigationDowncp.serializer("MlKitContext has been deleted", read == this);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(this.write);
        return this.write.read(cls);
    }
}
