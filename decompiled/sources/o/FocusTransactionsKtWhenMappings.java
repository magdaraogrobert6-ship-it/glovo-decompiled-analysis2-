package o;

import android.app.Application;
import android.content.Context;
import coil3.ImageLoader$Builder;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.sentry.JsonObjectSerializer;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferedChannel;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTransactionsKtWhenMappings extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusTransactionsKtWhenMappings(Object obj, int i, Object obj2) {
        super(1);
        this.write = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        createFromParcel createfromparcel;
        int i = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        int i2 = 0;
        if (i == 0) {
            Throwable th = (Throwable) obj;
            ((RootViewsSpy$Companion$install$1$1) obj3).invoke(th);
            BufferedChannel bufferedChannel = (BufferedChannel) ((ImageLoader$Builder) obj2).read;
            bufferedChannel.read(th, false);
            do {
                Object objRemoteActionCompatParcelizer = logUnregisterActivity.RemoteActionCompatParcelizer(bufferedChannel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                if (objRemoteActionCompatParcelizer == null) {
                    createfromparcel = null;
                } else {
                    requestOwnerFocusEtdf9zwdefault requestownerfocusetdf9zwdefault = (requestOwnerFocusEtdf9zwdefault) objRemoteActionCompatParcelizer;
                    if (requestownerfocusetdf9zwdefault instanceof findActiveFocusNode) {
                        ((findActiveFocusNode) requestownerfocusetdf9zwdefault).read.IconCompatParcelizer(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                    }
                    createfromparcel = createfromparcel2;
                }
            } while (createfromparcel != null);
            return createfromparcel2;
        }
        if (i != 1) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.getClass();
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read((String) obj3, "domain_name");
            List list = (List) obj2;
            if (!list.isEmpty()) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(onContentCardDismissed.IconCompatParcelizer(list, null, null, null, io.sentry.okhttp.IconCompatParcelizer.serializer, 31), "dns_addresses");
            }
            return createfromparcel2;
        }
        getCacheImplementationfwf_client_release getcacheimplementationfwf_client_release = (getCacheImplementationfwf_client_release) obj;
        getcacheimplementationfwf_client_release.getClass();
        Context context = (Context) obj3;
        getConfigfwf_client_release getconfigfwf_client_release = getcacheimplementationfwf_client_release.read;
        JsonObjectSerializer jsonObjectSerializer = getconfigfwf_client_release.read;
        getProvidedCachefwf_client_release getprovidedcachefwf_client_release = getProvidedCachefwf_client_release.INFO;
        if (jsonObjectSerializer.write(getprovidedcachefwf_client_release)) {
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.write(getprovidedcachefwf_client_release);
        }
        if (context instanceof Application) {
            getconfigfwf_client_release.read((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{ModuleDSLKt.RemoteActionCompatParcelizer(new RootViewsSpy$Companion$install$1$1(14, context))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), true);
        } else {
            getconfigfwf_client_release.read((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{ModuleDSLKt.RemoteActionCompatParcelizer(new closeAsync(context, i2))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), true);
        }
        List list2 = (List) obj2;
        boolean z = getcacheimplementationfwf_client_release.RemoteActionCompatParcelizer;
        list2.getClass();
        if (jsonObjectSerializer.write(getprovidedcachefwf_client_release)) {
            System.nanoTime();
            getconfigfwf_client_release.read(list2, z);
            System.nanoTime();
            ((ConcurrentHashMap) getconfigfwf_client_release.RemoteActionCompatParcelizer.write).size();
        } else {
            getconfigfwf_client_release.read(list2, z);
        }
        return createfromparcel2;
    }
}
