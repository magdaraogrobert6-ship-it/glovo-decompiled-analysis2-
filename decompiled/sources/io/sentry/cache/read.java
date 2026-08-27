package io.sentry.cache;

import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class read implements FilenameFilter {
    public final /* synthetic */ int read;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.read;
        if (i == 0) {
            return str.endsWith(".envelope");
        }
        if (i == 1) {
            return str.startsWith("aqs.");
        }
        if (i == 2) {
            return str.startsWith(".ae");
        }
        if (i != 3) {
            return str.startsWith("event") && !str.endsWith(BundleUtil.UNDERLINE_TAG);
        }
        return str.startsWith("event");
    }
}
