package com.braze;

import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$Companion$$ExternalSyntheticLambda8 implements FilenameFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Braze$Companion$$ExternalSyntheticLambda8(int i) {
        this.$r8$classId = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.$r8$classId;
        if (i == 0) {
            return Braze.Companion.clearSharedPreferencesData$lambda$0(file, str);
        }
        if (i != 1) {
            return str.startsWith(ActivityRecognitionConstants.LOCATION_MODULE) && str.endsWith(".log") && str.length() == 28 && BundleUtil.UNDERLINE_TAG.equals(String.valueOf(str.charAt(17)));
        }
        return str.startsWith(ActivityRecognitionConstants.LOCATION_MODULE) && str.endsWith(".csv") && str.length() == 28 && BundleUtil.UNDERLINE_TAG.equals(String.valueOf(str.charAt(17)));
    }
}
