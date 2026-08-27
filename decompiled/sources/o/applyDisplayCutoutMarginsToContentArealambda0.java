package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class applyDisplayCutoutMarginsToContentArealambda0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final ArrayList write;

    public void IconCompatParcelizer(Object obj, String str) {
        this.write.add(str + ContainerUtils.KEY_VALUE_DELIMITER + obj);
    }

    public void RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.write;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public RemoveFromSubscriptionGroupStep serializer() {
        ArrayList arrayList = this.write;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (RemoveFromSubscriptionGroupStep) af$$ExternalSyntheticOutline0.m(1, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void serializer(SetCustomUserAttributeStep setCustomUserAttributeStep) {
        boolean zWrite;
        int[] iArr = OpenLinkInWebViewStep.write;
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setCustomUserAttributeStep.serializer;
        int i = iArr[remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().ordinal()];
        ArrayList arrayList = this.write;
        switch (i) {
            case 1:
                setCustomUserAttributeStep.RemoteActionCompatParcelizer();
                arrayList.add(new RemoveFromCustomAttributeArrayStep());
                serializer(setCustomUserAttributeStep);
            case 2:
                setCustomUserAttributeStep.IconCompatParcelizer();
                zWrite = write();
                break;
            case 3:
                setCustomUserAttributeStep.write();
                arrayList.add(new r8lambdalTZRNPHqVJD_dycYi9keUvBgOQ());
                serializer(setCustomUserAttributeStep);
            case 4:
                setCustomUserAttributeStep.serializer();
                zWrite = write();
                break;
            case 5:
                arrayList.add(new r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8(remoteActionCompatParcelizer.MediaSessionCompatToken()));
                serializer(setCustomUserAttributeStep);
            case 6:
                zWrite = read(new OpenLinkExternallyStep(setCustomUserAttributeStep, 0));
                break;
            case 7:
                zWrite = read(new OpenLinkExternallyStep(this, setCustomUserAttributeStep));
                break;
            case 8:
                zWrite = read(new OpenLinkExternallyStep(setCustomUserAttributeStep, 2));
                break;
            case 9:
                remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
                zWrite = read(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(8));
                break;
            case 10:
                return;
            default:
                serializer(setCustomUserAttributeStep);
        }
        if (zWrite) {
            return;
        }
        serializer(setCustomUserAttributeStep);
    }

    public boolean write() {
        if (this.write.size() == 1) {
            return true;
        }
        RemoveFromSubscriptionGroupStep removeFromSubscriptionGroupStepSerializer = serializer();
        RemoteActionCompatParcelizer();
        if (!(serializer() instanceof r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8)) {
            if (!(serializer() instanceof RemoveFromCustomAttributeArrayStep)) {
                return false;
            }
            RemoveFromCustomAttributeArrayStep removeFromCustomAttributeArrayStep = (RemoveFromCustomAttributeArrayStep) serializer();
            if (removeFromSubscriptionGroupStepSerializer == null || removeFromCustomAttributeArrayStep == null) {
                return false;
            }
            removeFromCustomAttributeArrayStep.serializer.add(removeFromSubscriptionGroupStepSerializer.RemoteActionCompatParcelizer());
            return false;
        }
        r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8 r8lambdagexxcru6algajmcumvazubozjh8 = (r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8) serializer();
        RemoteActionCompatParcelizer();
        r8lambdalTZRNPHqVJD_dycYi9keUvBgOQ r8lambdaltzrnphqvjd_dycyi9keuvbgoq = (r8lambdalTZRNPHqVJD_dycYi9keUvBgOQ) serializer();
        if (r8lambdagexxcru6algajmcumvazubozjh8 == null || removeFromSubscriptionGroupStepSerializer == null || r8lambdaltzrnphqvjd_dycyi9keuvbgoq == null) {
            return false;
        }
        r8lambdaltzrnphqvjd_dycyi9keuvbgoq.RemoteActionCompatParcelizer.put(r8lambdagexxcru6algajmcumvazubozjh8.IconCompatParcelizer, removeFromSubscriptionGroupStepSerializer.RemoteActionCompatParcelizer());
        return false;
    }

    public void RemoteActionCompatParcelizer(String str, String str2) {
        str.getClass();
        str2.getClass();
        DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(str);
        DelayKt.write(this, str, str2);
    }

    public String read(String str) {
        str.getClass();
        ArrayList arrayList = this.write;
        int size = arrayList.size() - 2;
        int i = TuplesKt.read(size, 0, -2);
        if (i > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == i) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public resetMessageMarginslambda00 read() {
        return new resetMessageMarginslambda00((String[]) this.write.toArray(new String[0]));
    }

    public void serializer(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.write;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public void write(String str, String str2) {
        str.getClass();
        str2.getClass();
        DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(str);
        DelayKt.serializer(str2, str);
        DelayKt.write(this, str, str2);
    }

    public void RemoteActionCompatParcelizer(String str) {
        str.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.write;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public boolean read(r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM r8lambda3v1_hwirqm7t2xqroc_y0y5jpxm) {
        Object obj = r8lambda3v1_hwirqm7t2xqroc_y0y5jpxm.read();
        if (serializer() == null && obj != null) {
            this.write.add(new SetEmailSubscriptionStep(obj));
            return true;
        }
        if (serializer() instanceof r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8) {
            r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8 r8lambdagexxcru6algajmcumvazubozjh8 = (r8lambdaGEXxCRU6aLGajMCUMVAzUBOZjh8) serializer();
            RemoteActionCompatParcelizer();
            ((r8lambdalTZRNPHqVJD_dycYi9keUvBgOQ) serializer()).RemoteActionCompatParcelizer.put(r8lambdagexxcru6algajmcumvazubozjh8.IconCompatParcelizer, obj);
            return false;
        }
        if (!(serializer() instanceof RemoveFromCustomAttributeArrayStep)) {
            return false;
        }
        ((RemoveFromCustomAttributeArrayStep) serializer()).serializer.add(obj);
        return false;
    }

    public applyDisplayCutoutMarginsToContentArealambda0(byte b, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 2) {
            this.write = new ArrayList();
        } else if (i != 3) {
            this.write = new ArrayList(20);
        } else {
            this.write = new ArrayList();
        }
    }

    public void serializer(String str) {
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ':', 1, false, 4);
        if (iWrite != -1) {
            DelayKt.write(this, str.substring(0, iWrite), str.substring(iWrite + 1));
        } else if (str.charAt(0) == ':') {
            DelayKt.write(this, "", str.substring(1));
        } else {
            DelayKt.write(this, "", str);
        }
    }

    public String toString() {
        return this.RemoteActionCompatParcelizer != 2 ? super.toString() : this.write.toString();
    }

    public void IconCompatParcelizer(Object obj) {
        this.write.add(obj);
    }

    public applyDisplayCutoutMarginsToContentArealambda0(int i) {
        this.RemoteActionCompatParcelizer = 4;
        this.write = new ArrayList(i);
    }

    public /* synthetic */ applyDisplayCutoutMarginsToContentArealambda0(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = 1;
        this.write = arrayList;
    }
}
