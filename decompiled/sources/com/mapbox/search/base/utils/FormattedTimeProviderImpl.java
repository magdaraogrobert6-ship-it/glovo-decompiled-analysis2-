package com.mapbox.search.base.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;
import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final class FormattedTimeProviderImpl {
    static {
        new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.search.base.utils.FormattedTimeProviderImpl$Companion$ISO_8601_DATE_FORMATTER$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH);
            }
        });
    }
}
