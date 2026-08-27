package com.sentiance.sdk.ondevice.datasyncing.upload;

import kotlin.jvm.internal.Lambda;
import o.r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4;
import o.r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    final /* synthetic */ r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s this$0;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object objInvoke;
        if (this.this$0.IconCompatParcelizer().MediaDescriptionCompat()) {
            return Boolean.FALSE;
        }
        final r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer = this.this$0.IconCompatParcelizer();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.ondevice.datasyncing.upload.DataSyncPayloadUploadRequest$nextUnfinishedChunk$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                Object obj = null;
                if (r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer.MediaDescriptionCompat()) {
                    return null;
                }
                for (Object obj2 : r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer.MediaBrowserCompatMediaItem) {
                    if (!((r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read) obj2).MediaSessionCompatQueueItem()) {
                        obj = obj2;
                        break;
                    }
                }
                return (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read) obj;
            }

            {
                super(0);
            }
        };
        synchronized (r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer) {
            objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read readVar = (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read) objInvoke;
        if (readVar == null) {
            return Boolean.TRUE;
        }
        this.this$0.RemoteActionCompatParcelizer.IconCompatParcelizer("Uploading chunk: " + readVar, new Object[0]);
        readVar.IconCompatParcelizer().serializer(new r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.RemoteActionCompatParcelizer(this.this$0, readVar));
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s) {
        super(0);
        this.this$0 = r8lambdaezb9gs4ufatot1smgrrnpet3m3s;
    }
}
