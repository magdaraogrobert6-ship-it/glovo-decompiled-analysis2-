package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@InternalTextApi
public final class URLSpanCache {
    public static final int $stable = 8;
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan toClickableSpan(AnnotatedString.Range<LinkAnnotation> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> weakHashMap = this.linkSpansWithListenerByAnnotation;
        ComposeClickableSpan composeClickableSpan = weakHashMap.get(range);
        if (composeClickableSpan == null) {
            ComposeClickableSpan composeClickableSpan2 = new ComposeClickableSpan(range.getItem());
            weakHashMap.put(range, composeClickableSpan2);
            composeClickableSpan = composeClickableSpan2;
        }
        return composeClickableSpan;
    }

    public final URLSpan toURLSpan(AnnotatedString.Range<LinkAnnotation.Url> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(range);
        if (uRLSpan == null) {
            URLSpan uRLSpan2 = new URLSpan(range.getItem().getUrl());
            weakHashMap.put(range, uRLSpan2);
            uRLSpan = uRLSpan2;
        }
        return uRLSpan;
    }

    public final URLSpan toURLSpan(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
