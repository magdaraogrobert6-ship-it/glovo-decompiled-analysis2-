package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class invokepweu1eQ implements setGraphicModalMaxWidthDp {
    public static final invokepweu1eQ RemoteActionCompatParcelizer = new invokepweu1eQ();
    public static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA IconCompatParcelizer = new resetLayoutParamsIfAppropriate(displayInAppMessagelambda1.serializer(getCacheBitmapConfig_sVssgQui.class)).getDescriptor();

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer;
        getCacheBitmapConfig_sVssgQui getcachebitmapconfig_svssgqui = (getCacheBitmapConfig_sVssgQui) obj;
        getcachebitmapconfig_svssgqui.getClass();
        if (!(defaultInAppMessageViewWrapperFactory instanceof BackgroundInAppMessagePreparer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Base can only be serialized as JSON");
            return;
        }
        if (getcachebitmapconfig_svssgqui instanceof getIntrinsicColorFilterui) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(getIntrinsicColorFilterui.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else if (getcachebitmapconfig_svssgqui instanceof VectorComposeKtGroup11) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(VectorComposeKtGroup11.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else if (getcachebitmapconfig_svssgqui instanceof VectorComposeKtPath21) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(VectorComposeKtPath21.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else if (getcachebitmapconfig_svssgqui instanceof VectorComposeKtGroup26) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(VectorComposeKtGroup26.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else if (getcachebitmapconfig_svssgqui instanceof setIntrinsicColorFilterui) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(setIntrinsicColorFilterui.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else if (getcachebitmapconfig_svssgqui instanceof VectorComposeKtPath22) {
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(VectorComposeKtPath22.Companion.serializer(), getcachebitmapconfig_svssgqui);
        } else {
            if (!(getcachebitmapconfig_svssgqui instanceof VectorComposeKtGroup23)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.IconCompatParcelizer(VectorComposeKtGroup23.Companion.serializer(), getcachebitmapconfig_svssgqui);
        }
        Map mapSerializer = onMove.serializer(TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionIconCompatParcelizer), new onViewAttachedToWindowlambda0("type", TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(getcachebitmapconfig_svssgqui.serializer())));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapSerializer.entrySet()) {
            String str = (String) entry.getKey();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "messageType"}, iWrite3)).booleanValue()) {
                int iWrite4 = getCieXyz.write();
                int iWrite5 = getCieXyz.write();
                int iWrite6 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "bridgeMessageID"}, iWrite6)).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        ((BackgroundInAppMessagePreparer) defaultInAppMessageViewWrapperFactory).IconCompatParcelizer(new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(linkedHashMap));
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getViewportSizeNHjbRcui.IconCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getCacheBitmapConfig_sVssgQui.Companion.serializer();
        r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
        strResultReceiver.getClass();
        return (getCacheBitmapConfig_sVssgQui) r8lambda3kmch7yklpui_5smgazrgczhglc.IconCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, (SwipeDismissTouchListenerVerticalDismissDirection) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(strResultReceiver, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer));
    }
}
