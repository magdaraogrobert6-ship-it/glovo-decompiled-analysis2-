package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class performDismissTeardown implements io.sentry.util.runtime.read {
    public final /* synthetic */ File read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ performDismissTeardown(File file, int i) {
        this.serializer = i;
        this.read = file;
    }

    @Override // io.sentry.util.runtime.read
    public final Object A_() {
        int i = this.serializer;
        File file = this.read;
        if (i == 0) {
            return Boolean.valueOf(file.mkdirs());
        }
        if (i == 1) {
            return Boolean.valueOf(file.mkdirs());
        }
        if (i != 2) {
            return i != 3 ? Boolean.valueOf(file.delete()) : Boolean.valueOf(file.exists());
        }
        return Boolean.valueOf(file.mkdirs());
    }
}
