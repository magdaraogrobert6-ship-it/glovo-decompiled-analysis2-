package o;

import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getNotificationEK5gGoQ implements pin {
    public final Object IconCompatParcelizer;
    public final Object serializer;

    @Override // o.pin
    public /* synthetic */ void onCanceled() {
        try {
            ((zzdz) this.IconCompatParcelizer).serializer((accessgetNumPadEntercp) this.serializer, true, new ParentDataModifierDefaultImpls());
        } catch (RemoteException unused) {
        }
    }

    public getNotificationEK5gGoQ(String str, String str2) {
        FwFClientgetEvaluation1 fwFClientgetEvaluation1;
        Object e = null;
        try {
            Constructor<?> declaredConstructor = Class.forName(str.concat(".InterpreterFactoryImpl")).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            fwFClientgetEvaluation1 = (FwFClientgetEvaluation1) declaredConstructor.newInstance(null);
            try {
                if (fwFClientgetEvaluation1 != null) {
                    TensorFlowLite.RemoteActionCompatParcelizer.info("Found " + str2 + " TF Lite runtime client in " + str);
                } else {
                    TensorFlowLite.RemoteActionCompatParcelizer.warning("Failed to construct TF Lite runtime client from ".concat(str));
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (IllegalAccessException e3) {
                e = e3;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (IllegalArgumentException e4) {
                e = e4;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (InstantiationException e5) {
                e = e5;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (NoSuchMethodException e6) {
                e = e6;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (SecurityException e7) {
                e = e7;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            } catch (InvocationTargetException e8) {
                e = e8;
                TensorFlowLite.RemoteActionCompatParcelizer.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e9) {
            fwFClientgetEvaluation1 = null;
            e = e9;
        }
        this.serializer = e;
        this.IconCompatParcelizer = fwFClientgetEvaluation1;
    }

    public /* synthetic */ getNotificationEK5gGoQ(zzdz zzdzVar, accessgetNumPadEntercp accessgetnumpadentercp) {
        this.IconCompatParcelizer = zzdzVar;
        this.serializer = accessgetnumpadentercp;
    }
}
