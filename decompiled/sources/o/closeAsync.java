package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.core.MapboxNavigation;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class closeAsync extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ closeAsync(Context context, int i) {
        super(1);
        this.serializer = i;
        this.write = context;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        Context context = this.write;
        if (i != 0) {
            ((Context) obj).getClass();
            return new accessgetClearcp(context, 0);
        }
        syncClientfwf_client_release syncclientfwf_client_release = (syncClientfwf_client_release) obj;
        syncclientfwf_client_release.getClass();
        MapboxNavigation.AnonymousClass11 anonymousClass11 = new MapboxNavigation.AnonymousClass11(5, context);
        getTimerfwf_client_release gettimerfwf_client_release = getTimerfwf_client_release.Singleton;
        ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(FwFClientaddFeatureKeys1.IconCompatParcelizer, displayInAppMessagelambda1.serializer(Context.class), null, anonymousClass11, gettimerfwf_client_release), syncclientfwf_client_release);
        return createFromParcel.INSTANCE;
    }
}
