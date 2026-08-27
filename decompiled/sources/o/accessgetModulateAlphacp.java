package o;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetModulateAlphacp {
    public static final ThreadLocal IconCompatParcelizer;
    public static final r8lambdaMCOmJu2vENBCibZhFN9r_uvJk0 read;
    public static final ArrayList serializer;

    static {
        r8lambdaMCOmJu2vENBCibZhFN9r_uvJk0 r8lambdamcomju2venbcibzhfn9r_uvjk0 = new r8lambdaMCOmJu2vENBCibZhFN9r_uvJk0();
        r8lambdamcomju2venbcibzhfn9r_uvjk0.IconCompatParcelizer = false;
        r8lambdamcomju2venbcibzhfn9r_uvjk0.serializer(new androidColorSpace(2));
        r8lambdamcomju2venbcibzhfn9r_uvjk0.serializer(new ColorProducer());
        r8lambdamcomju2venbcibzhfn9r_uvjk0.serializer(new androidColorSpace(1));
        read = r8lambdamcomju2venbcibzhfn9r_uvjk0;
        IconCompatParcelizer = new ThreadLocal();
        serializer = new ArrayList();
    }

    public static ImageKt IconCompatParcelizer() {
        ImageKt imageKt;
        ThreadLocal threadLocal = IconCompatParcelizer;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) threadLocal.get();
        if (weakReference != null && (imageKt = (ImageKt) weakReference.get()) != null) {
            return imageKt;
        }
        ImageKt imageKt2 = new ImageKt(0);
        threadLocal.set(new java.lang.ref.WeakReference(imageKt2));
        return imageKt2;
    }

    public static void serializer(ViewGroup viewGroup, ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        ArrayList arrayList = serializer;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 == null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0 = read;
        }
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Clone = colorSpaceVerificationHelperExternalSyntheticLambda0.clone();
        write(viewGroup, colorSpaceVerificationHelperExternalSyntheticLambda0Clone);
        viewGroup.setTag(com.logistics.rider.glovo.R.id.transition_current_scene, null);
        accessgetAutocp accessgetautocp = new accessgetAutocp();
        accessgetautocp.serializer = colorSpaceVerificationHelperExternalSyntheticLambda0Clone;
        accessgetautocp.RemoteActionCompatParcelizer = viewGroup;
        viewGroup.addOnAttachStateChangeListener(accessgetautocp);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(accessgetautocp);
    }

    public static void write(ViewGroup viewGroup, ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        ArrayList arrayList = (ArrayList) IconCompatParcelizer().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it.next()).RemoteActionCompatParcelizer(viewGroup);
            }
        }
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(viewGroup, true);
        }
        if (viewGroup.getTag(com.logistics.rider.glovo.R.id.transition_current_scene) == null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }
}
