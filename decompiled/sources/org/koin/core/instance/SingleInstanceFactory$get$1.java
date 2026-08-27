package org.koin.core.instance;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator;
import com.mapbox.maps.threading.AnimationThreadController;
import io.sentry.util.ComponentActivity;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Lambda;
import o.FocusTransactionsKt;
import o.createFromParcel;
import o.getSerializerfwf_client_release;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleInstanceFactory$get$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleInstanceFactory$get$1(Object obj, int i, Object obj2) {
        super(0);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            getSerializerfwf_client_release getserializerfwf_client_release = (getSerializerfwf_client_release) obj2;
            ComponentActivity componentActivity = (ComponentActivity) obj;
            if (getserializerfwf_client_release.RemoteActionCompatParcelizer == null) {
                getserializerfwf_client_release.RemoteActionCompatParcelizer = getserializerfwf_client_release.read(componentActivity);
            }
            return createfromparcel;
        }
        if (i == 1) {
            return TuplesKt.read((Context) obj2, ((FocusTransactionsKt) obj).read);
        }
        if (i == 2) {
            SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
        if (i == 3) {
            return LazyKt__LazyJVMKt.read((Context) obj2, ((FocusTransactionsKt) obj).read);
        }
        if (i != 4) {
            ValueAnimator valueAnimator = (ValueAnimator) obj2;
            Object animatedValue = valueAnimator.getAnimatedValue();
            PuckAnimator puckAnimator = (PuckAnimator) obj;
            puckAnimator.updateLayer(valueAnimator.getAnimatedFraction(), animatedValue);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = puckAnimator.updateListener;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(animatedValue);
            }
            return createfromparcel;
        }
        CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) obj;
        ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj2;
        for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
            if (!(valueAnimator2 instanceof CameraAnimator)) {
                MapboxLogger.logW("Mbgl-CameraManager", "All animators must be CameraAnimator's to be registered!");
                return createfromparcel;
            }
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$registerInternalListener$1((CameraAnimator) valueAnimator2, cameraAnimationsPluginImpl));
        }
        HashSet hashSet = cameraAnimationsPluginImpl.animators;
        ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
        for (ValueAnimator valueAnimator3 : valueAnimatorArr) {
            valueAnimator3.getClass();
            arrayList.add((CameraAnimator) valueAnimator3);
        }
        hashSet.addAll(arrayList);
        return createfromparcel;
    }
}
