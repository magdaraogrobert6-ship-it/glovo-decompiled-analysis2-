package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsTouchModeRequiredForHtmlInAppMessages implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;
    public static final setIsTouchModeRequiredForHtmlInAppMessages write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setIsTouchModeRequiredForHtmlInAppMessages setistouchmoderequiredforhtmlinappmessages = new setIsTouchModeRequiredForHtmlInAppMessages();
        write = setistouchmoderequiredforhtmlinappmessages;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.LineSegment", setistouchmoderequiredforhtmlinappmessages, 1);
        oncloseactionlambda1.read("points", false);
        RemoteActionCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setIsHtmlInAppMessageApplyWindowInsetsEnabled.b;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], objIconCompatParcelizer);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setIsHtmlInAppMessageApplyWindowInsetsEnabled(i, (onViewAttachedToWindowlambda0) objIconCompatParcelizer);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setIsHtmlInAppMessageApplyWindowInsetsEnabled setishtmlinappmessageapplywindowinsetsenabled = (setIsHtmlInAppMessageApplyWindowInsetsEnabled) obj;
        setishtmlinappmessageapplywindowinsetsenabled.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setIsHtmlInAppMessageApplyWindowInsetsEnabled.b[0], setishtmlinappmessageapplywindowinsetsenabled.a);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{setIsHtmlInAppMessageApplyWindowInsetsEnabled.b[0]};
    }
}
