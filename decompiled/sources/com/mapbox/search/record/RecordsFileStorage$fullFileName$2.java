package com.mapbox.search.record;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final class RecordsFileStorage$fullFileName$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordsFileStorage$fullFileName$2(String str, int i) {
        super(0);
        this.$r8$classId = i;
        this.$fileName = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Value value;
        int i = this.$r8$classId;
        String str = this.$fileName;
        if (i == 0) {
            Expected<String, Value> expected = SettingsServiceFactory.getInstance(SettingsServiceStorageType.PERSISTENT).get("com.mapbox.search.internal.experimental.records_files_ext");
            Object contents = (expected == null || (value = expected.getValue()) == null) ? null : value.getContents();
            String str2 = contents instanceof String ? (String) contents : null;
            if (str2 == null) {
                str2 = ".bin";
            }
            return str.concat(str2);
        }
        if (i != 1) {
            return "Unknown result type: " + str;
        }
        return "Unknown result type: " + str;
    }
}
