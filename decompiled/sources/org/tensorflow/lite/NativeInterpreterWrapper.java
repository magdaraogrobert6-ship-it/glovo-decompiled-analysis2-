package org.tensorflow.lite;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Machine$Queue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.FwFClientgetEvaluations1;
import o.FwFClientstartUpdater1;
import o.addKeysfwf_client_release;
import o.getAccessTokenfwf_client_release;
import org.tensorflow.lite.annotations.UsedByReflection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeInterpreterWrapper implements AutoCloseable {
    public final TensorImpl[] IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public final ArrayList MediaMetadataCompat;
    public final TensorImpl[] MediaSessionCompatQueueItem;
    public final ArrayList RemoteActionCompatParcelizer;

    @UsedByReflection
    private long inferenceDurationNanoseconds = -1;
    public long read;
    public long serializer;
    public boolean write;

    static {
        addKeysfwf_client_release addkeysfwf_client_release = addKeysfwf_client_release.APPLICATION;
    }

    private static native long allocateTensors(long j, long j2);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, List<Long> list);

    private static native long createModel(String str, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getInputCount(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    public NativeInterpreterWrapper(String str, FwFClientstartUpdater1 fwFClientstartUpdater1) {
        this.write = false;
        ArrayList<getAccessTokenfwf_client_release> arrayList = new ArrayList();
        this.RemoteActionCompatParcelizer = arrayList;
        this.MediaMetadataCompat = new ArrayList();
        TensorFlowLite.read();
        long jCreateErrorReporter = createErrorReporter(Fields.RotationY);
        long jCreateModel = createModel(str, jCreateErrorReporter);
        Machine$Queue machine$Queue = fwFClientstartUpdater1 == null ? new Machine$Queue() : fwFClientstartUpdater1;
        ArrayList arrayList2 = (ArrayList) machine$Queue.serializer;
        this.read = jCreateErrorReporter;
        this.MediaBrowserCompatMediaItem = jCreateModel;
        ArrayList arrayList3 = new ArrayList();
        long jCreateInterpreter = createInterpreter(jCreateModel, jCreateErrorReporter, machine$Queue.read, true, arrayList3);
        this.serializer = jCreateInterpreter;
        if (hasUnresolvedFlexOp(jCreateInterpreter)) {
            List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            try {
                Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
                Iterator it = listUnmodifiableList.iterator();
                do {
                    if (!it.hasNext()) {
                        break;
                    }
                } while (!cls.isInstance((getAccessTokenfwf_client_release) it.next()));
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            }
        }
        for (getAccessTokenfwf_client_release getaccesstokenfwf_client_release : Collections.unmodifiableList(arrayList2)) {
            if (((FwFClientgetEvaluations1) machine$Queue.IconCompatParcelizer) != FwFClientgetEvaluations1.FROM_APPLICATION_ONLY) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
                throw null;
            }
            arrayList.add(getaccesstokenfwf_client_release);
        }
        Iterator it2 = Collections.unmodifiableList((ArrayList) machine$Queue.write).iterator();
        if (it2.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it2);
        }
        for (getAccessTokenfwf_client_release getaccesstokenfwf_client_release2 : arrayList) {
        }
        arrayList3.ensureCapacity(arrayList.size());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((getAccessTokenfwf_client_release) it3.next()).getClass();
            arrayList3.add(0L);
        }
        if (!arrayList3.isEmpty()) {
            delete(0L, 0L, this.serializer);
            this.serializer = createInterpreter(jCreateModel, jCreateErrorReporter, machine$Queue.read, true, arrayList3);
        }
        this.IconCompatParcelizer = new TensorImpl[getInputCount(this.serializer)];
        this.MediaSessionCompatQueueItem = new TensorImpl[getOutputCount(this.serializer)];
        allocateTensors(this.serializer, jCreateErrorReporter);
        this.write = true;
    }

    public final TensorImpl RemoteActionCompatParcelizer(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.IconCompatParcelizer;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.serializer;
                TensorImpl tensorImplSerializer = TensorImpl.serializer(getInputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplSerializer;
                return tensorImplSerializer;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid input Tensor index: "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    public final void RemoteActionCompatParcelizer(Object[] objArr, Map map) {
        int[] iArr;
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Input error: Inputs should not be null or empty.");
            return;
        }
        if (map == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Input error: Outputs should not be null.");
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            TensorImpl tensorImplRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            Object obj = objArr[i];
            if (obj == null || (obj instanceof Buffer)) {
                iArr = null;
            } else {
                tensorImplRemoteActionCompatParcelizer.IconCompatParcelizer(obj);
                iArr = tensorImplRemoteActionCompatParcelizer.read(obj);
                if (Arrays.equals(tensorImplRemoteActionCompatParcelizer.write, iArr)) {
                    iArr = null;
                }
            }
            if (iArr != null) {
                read(iArr, i);
            }
        }
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer(objArr[i2]);
        }
        long jNanoTime = System.nanoTime();
        run(this.serializer, this.read);
        long jNanoTime2 = System.nanoTime();
        if (zIconCompatParcelizer) {
            for (TensorImpl tensorImpl : this.MediaSessionCompatQueueItem) {
                if (tensorImpl != null) {
                    tensorImpl.IconCompatParcelizer();
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                serializer(((Integer) entry.getKey()).intValue()).serializer(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2 - jNanoTime;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.IconCompatParcelizer;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.RemoteActionCompatParcelizer();
                tensorImplArr[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.MediaSessionCompatQueueItem;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.RemoteActionCompatParcelizer();
                tensorImplArr2[i2] = null;
            }
            i2++;
        }
        delete(this.read, this.MediaBrowserCompatMediaItem, this.serializer);
        deleteCancellationFlag(0L);
        this.read = 0L;
        this.MediaBrowserCompatMediaItem = 0L;
        this.serializer = 0L;
        this.write = false;
        this.RemoteActionCompatParcelizer.clear();
        ArrayList arrayList = this.MediaMetadataCompat;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((getAccessTokenfwf_client_release) it.next()).close();
        }
        arrayList.clear();
    }

    public final void read(int[] iArr, int i) {
        if (resizeInput(this.serializer, this.read, i, iArr, false)) {
            this.write = false;
            TensorImpl tensorImpl = this.IconCompatParcelizer[i];
            if (tensorImpl != null) {
                tensorImpl.IconCompatParcelizer();
            }
        }
    }

    public final TensorImpl serializer(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.MediaSessionCompatQueueItem;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.serializer;
                TensorImpl tensorImplSerializer = TensorImpl.serializer(getOutputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplSerializer;
                return tensorImplSerializer;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid output Tensor index: "));
        return null;
    }

    public final String[] write() {
        return getSignatureKeys(this.serializer);
    }

    public final boolean IconCompatParcelizer() {
        if (this.write) {
            return false;
        }
        this.write = true;
        allocateTensors(this.serializer, this.read);
        for (TensorImpl tensorImpl : this.MediaSessionCompatQueueItem) {
            if (tensorImpl != null) {
                tensorImpl.IconCompatParcelizer();
            }
        }
        return true;
    }
}
