package com.google.android.gms.common;

import android.content.Context;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.ColorSpaceVerificationHelperExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw {
    public Object RemoteActionCompatParcelizer;
    public boolean read;
    public boolean write;

    public void read() {
        synchronized (this) {
            if (this.write) {
                return;
            }
            this.write = true;
            this.read = true;
            PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = (PreviewView$1$$ExternalSyntheticLambda2) this.RemoteActionCompatParcelizer;
            if (previewView$1$$ExternalSyntheticLambda2 != null) {
                try {
                    Runnable runnable = (Runnable) previewView$1$$ExternalSyntheticLambda2.serializer;
                    ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) previewView$1$$ExternalSyntheticLambda2.read;
                    Runnable runnable2 = (Runnable) previewView$1$$ExternalSyntheticLambda2.IconCompatParcelizer;
                    if (runnable == null) {
                        colorSpaceVerificationHelperExternalSyntheticLambda0.read();
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.read = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.read = false;
                notifyAll();
            }
        }
    }

    public boolean write() {
        return this.read;
    }

    public zzp zzb(Context context) {
        return new zzp((String) this.RemoteActionCompatParcelizer, this.write, false, new ObjectWrapper(context), false, true, false);
    }
}
