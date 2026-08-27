package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutexMutator implements Iterator, Map.Entry {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ImageKt read;
    public boolean serializer;
    public int write = -1;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write < this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }

    public MutatorMutexMutator(ImageKt imageKt) {
        this.read = imageKt;
        this.RemoteActionCompatParcelizer = imageKt.MediaMetadataCompat - 1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.serializer) {
            return this.read.IconCompatParcelizer(this.write);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.serializer) {
            return this.read.write(this.write);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.serializer) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        this.read.RemoteActionCompatParcelizer(this.write);
        this.write--;
        this.RemoteActionCompatParcelizer--;
        this.serializer = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.serializer) {
            return this.read.write(this.write, obj);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.write;
            ImageKt imageKt = this.read;
            Object[] objArr = {key, imageKt.IconCompatParcelizer(i)};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {entry.getValue(), imageKt.write(this.write)};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.write;
        ImageKt imageKt = this.read;
        Object objIconCompatParcelizer = imageKt.IconCompatParcelizer(i);
        Object objWrite = imageKt.write(this.write);
        return (objIconCompatParcelizer == null ? 0 : objIconCompatParcelizer.hashCode()) ^ (objWrite != null ? objWrite.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.write++;
        this.serializer = true;
        return this;
    }
}
