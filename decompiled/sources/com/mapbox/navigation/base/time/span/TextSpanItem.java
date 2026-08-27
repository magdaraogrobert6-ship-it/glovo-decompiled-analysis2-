package com.mapbox.navigation.base.time.span;

import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class TextSpanItem {
    public final MetricAffectingSpan span;
    public final String spanText;

    public TextSpanItem(MetricAffectingSpan metricAffectingSpan, String str) {
        str.getClass();
        this.span = metricAffectingSpan;
        this.spanText = str;
    }
}
