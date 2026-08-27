package o;

import android.content.Context;
import android.os.Process;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class swap {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] serializer;
    public final ThreadLocal IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final performCustomExitMxy_nc0 write;

    /* JADX WARN: Type inference failed for: r0v2, types: [o.forward4l5_RBY] */
    public swap(Context context, String str) {
        context.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new ThreadLocal();
        final int i = 0;
        final int i2 = 1;
        this.write = (performCustomExitMxy_nc0) DelayKt.write(str, new accessgetAlwayscp(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.forward4l5_RBY
            public final /* synthetic */ swap RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i;
                swap swapVar = this.RemoteActionCompatParcelizer;
                if (i3 != 0) {
                    Context context2 = (Context) obj;
                    context2.getClass();
                    return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{forEachItemAfter.IconCompatParcelizer(context2, swapVar.RemoteActionCompatParcelizer, forEachItemAfter.IconCompatParcelizer)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                }
                androidx.datastore.core.CorruptionException corruptionException = (androidx.datastore.core.CorruptionException) obj;
                corruptionException.getClass();
                SentryLogcatAdapter.write(displayInAppMessagelambda1.serializer(swap.class).IconCompatParcelizer(), "CorruptionException in " + swapVar.RemoteActionCompatParcelizer + " DataStore running in process " + Process.myPid(), corruptionException);
                return setNativeShader.read();
            }
        }), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.forward4l5_RBY
            public final /* synthetic */ swap RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i2;
                swap swapVar = this.RemoteActionCompatParcelizer;
                if (i3 != 0) {
                    Context context2 = (Context) obj;
                    context2.getClass();
                    return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{forEachItemAfter.IconCompatParcelizer(context2, swapVar.RemoteActionCompatParcelizer, forEachItemAfter.IconCompatParcelizer)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                }
                androidx.datastore.core.CorruptionException corruptionException = (androidx.datastore.core.CorruptionException) obj;
                corruptionException.getClass();
                SentryLogcatAdapter.write(displayInAppMessagelambda1.serializer(swap.class).IconCompatParcelizer(), "CorruptionException in " + swapVar.RemoteActionCompatParcelizer + " DataStore running in process " + Process.myPid(), corruptionException);
                return setNativeShader.read();
            }
        }, 8).getValue(context, serializer[0]);
    }

    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
    }

    static {
        createBrazeUserChangeEventSubscriberlambda00 createbrazeuserchangeeventsubscriberlambda00 = new createBrazeUserChangeEventSubscriberlambda00(swap.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        serializer = new registerInAppMessageManagerlambda2[]{createbrazeuserchangeeventsubscriberlambda00};
    }
}
