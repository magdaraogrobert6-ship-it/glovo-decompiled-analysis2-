package io.sentry.instrumentation.file;

import java.io.File;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer extends InputStreamReader {
    public IconCompatParcelizer(String str) {
        super(new write(write.write(str != null ? new File(str) : null, null)));
    }
}
