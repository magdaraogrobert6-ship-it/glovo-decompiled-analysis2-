package o;

import java.util.Collection;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class asVectorGroup {
    public static final CaptionedImageContentCardView IconCompatParcelizer;

    static {
        CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView();
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) new ensureSubscribedToInAppMessageEventslambda4('a', 'z'), (Collection) captionedImageContentCardView);
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) new ensureSubscribedToInAppMessageEventslambda4('A', 'Z'), (Collection) captionedImageContentCardView);
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) new ensureSubscribedToInAppMessageEventslambda4('0', '9'), (Collection) captionedImageContentCardView);
        IconCompatParcelizer = RangesKt.IconCompatParcelizer(captionedImageContentCardView);
    }
}
