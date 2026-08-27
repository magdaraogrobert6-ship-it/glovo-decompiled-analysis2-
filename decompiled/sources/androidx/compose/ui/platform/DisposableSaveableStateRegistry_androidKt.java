package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AndroidContentCaptureManager;
import o.alpha;
import o.createFromParcel;
import o.getBlock;
import o.getGreen0d7_KjU;
import o.getLightGray0d7_KjU;
import o.getRed0d7_KjU;
import o.getShape;
import o.getTransparent0d7_KjU;
import o.isInvalidIndex;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setColor8_81llA;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String str, getTransparent0d7_KjU gettransparent0d7_kju) {
        final boolean z;
        final String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SaveableStateRegistry:", str);
        final getLightGray0d7_KjU savedStateRegistry = gettransparent0d7_kju.getSavedStateRegistry();
        Bundle bundleWrite = savedStateRegistry.write(strSerializer);
        Map<String, List<Object>> map = bundleWrite != null ? toMap(bundleWrite) : null;
        DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj));
            }
        };
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getBlock.read;
        final getShape getshape = new getShape(map, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
        if (savedStateRegistry.IconCompatParcelizer(strSerializer) != null) {
            z = false;
        } else {
            try {
                savedStateRegistry.RemoteActionCompatParcelizer(strSerializer, new getGreen0d7_KjU() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$$ExternalSyntheticLambda0
                    @Override // o.getGreen0d7_KjU
                    public final Bundle saveState() {
                        return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(getshape);
                    }
                });
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            }
        }
        return new DisposableSaveableStateRegistry(getshape, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2734invoke() {
                if (z) {
                    getLightGray0d7_KjU getlightgray0d7_kju = savedStateRegistry;
                    String str2 = strSerializer;
                    getlightgray0d7_kju.getClass();
                    str2.getClass();
                    getRed0d7_KjU getred0d7_kju = getlightgray0d7_kju.IconCompatParcelizer;
                    synchronized (getred0d7_kju.RemoteActionCompatParcelizer) {
                    }
                }
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2734invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            parcelableArrayList.getClass();
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(alpha alphaVar) {
        return toBundle(alphaVar.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof setColor8_81llA) {
            setColor8_81llA setcolor8_81lla = (setColor8_81llA) obj;
            if (setcolor8_81lla.write() == AndroidContentCaptureManager.RemoteActionCompatParcelizer || setcolor8_81lla.write() == AndroidContentCaptureManager.write || setcolor8_81lla.write() == AndroidContentCaptureManager.read) {
                Object value = setcolor8_81lla.getValue();
                if (value == null) {
                    return true;
                }
                return canBeSavedToBundle(value);
            }
        } else if (!(obj instanceof isInvalidIndex) || !(obj instanceof Serializable)) {
            for (Class<? extends Object> cls : AcceptableClasses) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, getTransparent0d7_KjU gettransparent0d7_kju) {
        Object parent = view.getParent();
        parent.getClass();
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, gettransparent0d7_kju);
    }
}
