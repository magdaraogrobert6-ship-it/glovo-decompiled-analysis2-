package o;

import kotlinx.datetime.DateTimeUnit$Companion;
import kotlinx.serialization.Serializable;
import o.getGraphicModalMaxWidthDpannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = getGraphicModalMaxWidthDpannotations.class)
public abstract class setCustomHtmlInAppMessageActionListener {
    public static final DateTimeUnit$Companion Companion = new Object() { // from class: kotlinx.datetime.DateTimeUnit$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getGraphicModalMaxWidthDpannotations.IconCompatParcelizer;
        }
    };
    public static final setCustomInAppMessageAnimationFactory DAY;
    public static final setCustomInAppMessageViewWrapperFactory MINUTE;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.DateTimeUnit$Companion] */
    static {
        setCustomInAppMessageViewWrapperFactory setcustominappmessageviewwrapperfactory = new setCustomInAppMessageViewWrapperFactory(1L).read(1000).read(1000).read(1000).read(60);
        MINUTE = setcustominappmessageviewwrapperfactory;
        setcustominappmessageviewwrapperfactory.read(60);
        DAY = new setCustomInAppMessageAnimationFactory(1);
        new setCustomInAppMessageAnimationFactory(Math.multiplyExact(1, 7));
        new setCustomInAppMessageViewFactory(1);
        new setCustomInAppMessageViewFactory(Math.multiplyExact(1, 3));
        int iMultiplyExact = Math.multiplyExact(1, 12);
        new setCustomInAppMessageViewFactory(iMultiplyExact);
        new setCustomInAppMessageViewFactory(Math.multiplyExact(iMultiplyExact, 100));
    }

    public static String RemoteActionCompatParcelizer(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
