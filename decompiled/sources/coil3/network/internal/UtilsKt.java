package coil3.network.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.RegistryMissingComponentException;
import o.createFromParcel;
import o.getLayoutDirectionui;
import o.setMutatedFieldsui;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class UtilsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object readBuffer(getLayoutDirectionui getlayoutdirectionui, ContinuationImpl continuationImpl) {
        setMutatedFieldsui setmutatedfieldsui;
        getLayoutDirectionui getlayoutdirectionui2;
        Throwable th;
        RegistryMissingComponentException registryMissingComponentException;
        if (continuationImpl instanceof setMutatedFieldsui) {
            setmutatedfieldsui = (setMutatedFieldsui) continuationImpl;
            int i = setmutatedfieldsui.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setmutatedfieldsui.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setmutatedfieldsui = new setMutatedFieldsui(continuationImpl);
            }
        } else {
            setmutatedfieldsui = new setMutatedFieldsui(continuationImpl);
        }
        Object obj = setmutatedfieldsui.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setmutatedfieldsui.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                registryMissingComponentException = new RegistryMissingComponentException();
                setmutatedfieldsui.write = getlayoutdirectionui;
                setmutatedfieldsui.serializer = registryMissingComponentException;
                setmutatedfieldsui.RemoteActionCompatParcelizer = 1;
                getlayoutdirectionui.serializer.RemoteActionCompatParcelizer(registryMissingComponentException);
                if (createFromParcel.INSTANCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Okio.RemoteActionCompatParcelizer(getlayoutdirectionui, null);
                return registryMissingComponentException;
            } catch (Throwable th2) {
                getlayoutdirectionui2 = getlayoutdirectionui;
                th = th2;
                throw th;
            }
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        RegistryMissingComponentException registryMissingComponentException2 = setmutatedfieldsui.serializer;
        getlayoutdirectionui2 = setmutatedfieldsui.write;
        try {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            registryMissingComponentException = registryMissingComponentException2;
            getlayoutdirectionui = getlayoutdirectionui2;
            Okio.RemoteActionCompatParcelizer(getlayoutdirectionui, null);
            return registryMissingComponentException;
        } catch (Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (Throwable th4) {
                Okio.RemoteActionCompatParcelizer(getlayoutdirectionui2, th);
                throw th4;
            }
        }
    }
}
