package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class resetTransientState {
    public static final isVerticalSwipeInAllowedDirection read = new isVerticalSwipeInAllowedDirection(new SwipeDismissTouchListener1(false, false, false, false, true, "    ", false, "type", true, false, false, lambdaperformDismiss0.POLYMORPHIC), prepareInAppMessageWithZippedAssetHtmllambda2.serializer);
    public final SwipeDismissTouchListener1 IconCompatParcelizer;
    public final prepareInAppMessageWithZippedAssetHtml RemoteActionCompatParcelizer;
    public final io.sentry.logger.serializer write = new io.sentry.logger.serializer(1);

    public resetTransientState(SwipeDismissTouchListener1 swipeDismissTouchListener1, prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml) {
        this.IconCompatParcelizer = swipeDismissTouchListener1;
        this.RemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtml;
    }

    public final Object IconCompatParcelizer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        DefaultInAppMessageModalViewFactoryCompanion handlelocalimagelambda0;
        setgraphicmodalmaxwidthdp.getClass();
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        String str = null;
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            handlelocalimagelambda0 = new prepareInAppMessagelambda1(this, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirection, str, 12);
        } else if (swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept) {
            handlelocalimagelambda0 = new prepareInAppMessage(this, (requestDisallowParentIntercept) swipeDismissTouchListenerVerticalDismissDirection);
        } else {
            if (!(swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) && !swipeDismissTouchListenerVerticalDismissDirection.equals(r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            handlelocalimagelambda0 = new handleLocalImagelambda0(this, (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection);
        }
        return handlelocalimagelambda0.write(setgraphicmodalmaxwidthdp);
    }

    public final SwipeDismissTouchListenerVerticalDismissDirection IconCompatParcelizer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        setgraphicmodalmaxwidthdp.getClass();
        return prepareInAppMessageWithBitmapDownloadlambda2.IconCompatParcelizer(this, obj, setgraphicmodalmaxwidthdp);
    }

    public final Object serializer(String str, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        setgraphicmodalmaxwidthdp.getClass();
        str.getClass();
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = new applyDisplayCutoutMarginsToCloseButtonlambda0(str);
        Object objWrite = new StreamingJsonDecoder(this, prepareInAppMessageWithHtmllambda1.OBJ, applydisplaycutoutmarginstoclosebuttonlambda0, setgraphicmodalmaxwidthdp.getDescriptor(), null).write(setgraphicmodalmaxwidthdp);
        if (applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer() == 10) {
            return objWrite;
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected EOF after parsing, but had " + str.charAt(applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String RemoteActionCompatParcelizer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        char[] cArr;
        setgraphicmodalmaxwidthdp.getClass();
        CSSParseException cSSParseException = new CSSParseException(8, (char) 0);
        r8lambdakUrnAtXdiHljPizoNhWOREUrS_M r8lambdakurnatxdihljpizonhworeurs_m = r8lambdakUrnAtXdiHljPizoNhWOREUrS_M.write;
        synchronized (r8lambdakurnatxdihljpizonhworeurs_m) {
            BrazeContentCardsManager brazeContentCardsManager = r8lambdakurnatxdihljpizonhworeurs_m.read;
            cArr = null;
            char[] cArr2 = (char[]) (brazeContentCardsManager.isEmpty() ? null : brazeContentCardsManager.removeLast());
            if (cArr2 != null) {
                r8lambdakurnatxdihljpizonhworeurs_m.serializer -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[androidx.compose.ui.graphics.Fields.SpotShadowColor];
        }
        cSSParseException.RemoteActionCompatParcelizer = cArr;
        try {
            UrlUtils.read(this, cSSParseException, setgraphicmodalmaxwidthdp, obj);
            return cSSParseException.toString();
        } finally {
            cSSParseException.RemoteActionCompatParcelizer();
        }
    }
}
