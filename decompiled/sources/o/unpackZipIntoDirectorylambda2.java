package o;

import io.grpc.Status;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class unpackZipIntoDirectorylambda2 implements Runnable {
    public final /* synthetic */ getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ unpackZipIntoDirectorylambda2(getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = getmaxunpackedzipentrysizebytesandroid_sdk_base_release;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (this.serializer == 0) {
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release = this.IconCompatParcelizer;
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = getmaxunpackedzipentrysizebytesandroid_sdk_base_release.write;
            AtomicReference atomicReference = getmaxunpackedzipentrysizebytesandroid_sdk_base_release.read;
            if (hastoomanyzipentrieslambda0.menuHostHelperlambda0 == null) {
                if (atomicReference.get() == hasTooManyZipEntrieslambda0.IconCompatParcelizer) {
                    atomicReference.set(null);
                }
                getmaxunpackedzipentrysizebytesandroid_sdk_base_release.write.getDefaultViewModelCreationExtras.serializer(hasTooManyZipEntrieslambda0.RemoteActionCompatParcelizer);
                return;
            }
            return;
        }
        if (this.IconCompatParcelizer.read.get() == hasTooManyZipEntrieslambda0.IconCompatParcelizer) {
            this.IconCompatParcelizer.read.set(null);
        }
        LinkedHashSet linkedHashSet = this.IconCompatParcelizer.write.menuHostHelperlambda0;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((WebContentUtilsExternalSyntheticLambda9) it.next()).read("Channel is forcefully shutdown", (Throwable) null);
            }
        }
        CallTracer callTracer = this.IconCompatParcelizer.write.getDefaultViewModelCreationExtras;
        Status status = hasTooManyZipEntrieslambda0.write;
        callTracer.serializer(status);
        synchronized (callTracer.RemoteActionCompatParcelizer) {
            arrayList = new ArrayList((HashSet) callTracer.write);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0) it2.next()).RemoteActionCompatParcelizer(status);
        }
        ((hasTooManyZipEntrieslambda0) callTracer.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(status);
    }
}
