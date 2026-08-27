package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath24 implements setGraphicModalMaxWidthDp {
    public static final VectorComposeKtPath24 write = new VectorComposeKtPath24();
    public static final getAppropriateModalView IconCompatParcelizer = RangesKt.IconCompatParcelizer("BridgeMessage", new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    public static PathNodeLineTo IconCompatParcelizer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8k.get("payload");
        if (swipeDismissTouchListenerVerticalDismissDirection != null) {
            return (PathNodeLineTo) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection).toString(), PathNodeLineTo.Companion.serializer());
        }
        DrawableTransformation.serializer("Missing field payload");
        return null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        getY2 gety2 = (getY2) obj;
        gety2.getClass();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getViewportSizeNHjbRcui.IconCompatParcelizer;
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(r8lambda3kmch7yklpui_5smgazrgczhglc.RemoteActionCompatParcelizer(pauseWebviewIfNecessarylambda10.IconCompatParcelizer(r8lambda3kmch7yklpui_5smgazrgczhglc.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(getY2.class)), gety2));
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        String strIconCompatParcelizer;
        Object resizenodedata;
        if (!(defaultInAppMessageModalViewFactoryCompanion instanceof setTouchListener)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Base can only be deserialized as JSON");
            return null;
        }
        r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(((setTouchListener) defaultInAppMessageModalViewFactoryCompanion).read());
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("type");
        String strIconCompatParcelizer2 = swipeDismissTouchListenerVerticalDismissDirection != null ? TouchAwareSwipeDismissTouchListener.read(swipeDismissTouchListenerVerticalDismissDirection).IconCompatParcelizer() : null;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("id");
        if (swipeDismissTouchListenerVerticalDismissDirection2 == null || (strIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.read(swipeDismissTouchListenerVerticalDismissDirection2).IconCompatParcelizer()) == null) {
            DrawableTransformation.serializer("Missing field id");
            return null;
        }
        if (strIconCompatParcelizer2 != null) {
            switch (strIconCompatParcelizer2) {
                case "HELPCENTER_ASKS_FOR_SHUTDOWN":
                    resizenodedata = new resizeNodeData(strIconCompatParcelizer);
                    break;
                case "CLIENT_ASKS_FOR_CHAT_CONFIG":
                    resizenodedata = new getY3(strIconCompatParcelizer);
                    break;
                case "HELPCENTER_CHAT_STARTED":
                    resizenodedata = new PathNodeQuadTo(strIconCompatParcelizer, IconCompatParcelizer(r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer));
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_OPEN":
                    resizenodedata = new getDy3(strIconCompatParcelizer);
                    break;
                case "HELPCENTER_INIT_IS_DONE":
                    resizenodedata = new insertBottomUp(strIconCompatParcelizer);
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_CALL_BUTTON_CLICK":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection3 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection3 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new getDy1(strIconCompatParcelizer, (getDx3) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection3).toString(), getDx3.Companion.serializer()));
                    break;
                case "HELPCENTER_INIT_STARTED":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection4 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection4 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new insertTopDown(strIconCompatParcelizer, (accessgetRootScaleYp) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection4).toString(), accessgetRootScaleYp.Companion.serializer()));
                    break;
                case "HELPCENTER_CHAT_ENDED":
                    resizenodedata = new getX2(strIconCompatParcelizer, IconCompatParcelizer(r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer));
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_MESSAGE_SENT":
                    resizenodedata = new PathNodeRelativeReflectiveCurveTo(strIconCompatParcelizer);
                    break;
                case "CLIENT_CRITICAL_CONTENT_RENDERED":
                    resizenodedata = new PathNodeRelativeCurveTo(strIconCompatParcelizer);
                    break;
                case "HELPCENTER_WONT_HANDLE_BACK_NAVIGATION":
                    resizenodedata = new toRadians(strIconCompatParcelizer);
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_QUICK_REPLY_SENT":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection5 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection5 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new PathNodeKt(strIconCompatParcelizer, (pathMoveNodeFromArgs) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection5).toString(), pathMoveNodeFromArgs.Companion.serializer()));
                    break;
                case "HELPCENTER_WILL_HANDLE_BACK_NAVIGATION":
                    resizenodedata = new arcToBezier(strIconCompatParcelizer);
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_LOCATION_MESSAGE_CLICK":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection6 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection6 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new PathNodeRelativeReflectiveQuadTo(strIconCompatParcelizer, (getDy) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection6).toString(), getDy.Companion.serializer()));
                    break;
                case "HELPCENTER_INIT_WILL_START":
                    resizenodedata = new accessdoInvalidate(strIconCompatParcelizer);
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_CLOSE":
                    resizenodedata = new getDx(strIconCompatParcelizer);
                    break;
                case "HELPCENTER_INIT_FAILED":
                    resizenodedata = new getEmptyArray(strIconCompatParcelizer);
                    break;
                case "CLIENT_CHAT_NOTIFIES_ABOUT_TRANSLATION_TOGGLE_CLICK":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection7 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection7 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new getArcStartDx(strIconCompatParcelizer, (PathNodeReflectiveQuadTo) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection7).toString(), PathNodeReflectiveQuadTo.Companion.serializer()));
                    break;
                case "HELPCENTER_ASKS_FOR_NEW_ACCESS_TOKEN":
                    resizenodedata = new toNodes(strIconCompatParcelizer);
                    break;
                case "HELPCENTER_ENCOUNTERED_ERROR":
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection8 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("payload");
                    if (swipeDismissTouchListenerVerticalDismissDirection8 == null) {
                        DrawableTransformation.serializer("Missing field payload");
                        return null;
                    }
                    resizenodedata = new pathNodesFromArgs(strIconCompatParcelizer, (pathStringToNodes) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection8).toString(), pathStringToNodes.Companion.serializer()));
                    break;
                default:
                    resizenodedata = null;
                    break;
            }
        } else {
            resizenodedata = null;
        }
        if (strIconCompatParcelizer2 != null && setCarryoverInAppMessage.read(strIconCompatParcelizer2, "_ACK", false)) {
            SentryLogcatAdapter.serializer("BridgeMessage", "Unknown BridgeMessageType ".concat(strIconCompatParcelizer2));
            IBraze$$ExternalSyntheticBUOutline0.m("Deserialization not supported for ACK Messages");
            return null;
        }
        if (resizenodedata != null) {
            return resizenodedata;
        }
        DrawableTransformation.serializer("Unsupported Bridge Message");
        return null;
    }
}
