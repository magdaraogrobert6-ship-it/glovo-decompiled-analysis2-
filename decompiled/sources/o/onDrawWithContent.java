package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class onDrawWithContent {
    public setContentDrawScopeui IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public onDrawBehind read;
    public boolean serializer;

    public final boolean RemoteActionCompatParcelizer(Object obj) {
        this.serializer = true;
        onDrawBehind ondrawbehind = this.read;
        boolean z = ondrawbehind != null && ondrawbehind.serializer.write(obj);
        if (z) {
            this.RemoteActionCompatParcelizer = null;
            this.read = null;
            this.IconCompatParcelizer = null;
        }
        return z;
    }

    public final void serializer() {
        this.serializer = true;
        onDrawBehind ondrawbehind = this.read;
        if (ondrawbehind == null || !ondrawbehind.serializer.cancel(true)) {
            return;
        }
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
        this.IconCompatParcelizer = null;
    }

    public final boolean serializer(Throwable th) {
        this.serializer = true;
        onDrawBehind ondrawbehind = this.read;
        boolean z = ondrawbehind != null && ondrawbehind.serializer.IconCompatParcelizer(th);
        if (z) {
            this.RemoteActionCompatParcelizer = null;
            this.read = null;
            this.IconCompatParcelizer = null;
        }
        return z;
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        setContentDrawScopeui setcontentdrawscopeui = this.IconCompatParcelizer;
        if (setcontentdrawscopeui != null) {
            setcontentdrawscopeui.RemoteActionCompatParcelizer(runnable, executor);
        }
    }

    public final void finalize() {
        setContentDrawScopeui setcontentdrawscopeui;
        onDrawBehind ondrawbehind = this.read;
        if (ondrawbehind != null && !ondrawbehind.serializer.isDone()) {
            ondrawbehind.write(new accessstartTrackingTable("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.RemoteActionCompatParcelizer, 2));
        }
        if (this.serializer || (setcontentdrawscopeui = this.IconCompatParcelizer) == null) {
            return;
        }
        setcontentdrawscopeui.write((Object) null);
    }
}
