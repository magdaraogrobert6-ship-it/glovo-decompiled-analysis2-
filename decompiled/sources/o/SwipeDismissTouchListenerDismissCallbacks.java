package o;

import kotlin.ranges.RangesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SwipeDismissTouchListenerDismissCallbacks implements setGraphicModalMaxWidthDp {
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk RemoteActionCompatParcelizer;
    public final getAppropriateModalView write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.write;
    }

    public abstract setGraphicModalMaxWidthDp read(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection);

    public SwipeDismissTouchListenerDismissCallbacks(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        this.RemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.write = RangesKt.read("JsonContentPolymorphicSerializer<" + r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer() + '>', createInAppMessageViewlambda0.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        obj.getClass();
        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem = defaultInAppMessageViewWrapperFactory.MediaSessionCompatQueueItem();
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = this.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem.read(r8lambdaucgighn8fiyv_vccodeafjfpedk, obj);
        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer == null && (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer((getUnregisteredInAppMessageannotations) displayInAppMessagelambda1.serializer(obj.getClass()))) == null) {
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(obj.getClass());
            String strIconCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.IconCompatParcelizer();
            if (strIconCompatParcelizer == null) {
                strIconCompatParcelizer = String.valueOf(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer);
            }
            DrawableTransformation.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Class '", strIconCompatParcelizer, "' is not registered for polymorphic serialization ", "in the scope of '" + r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            return;
        }
        setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer.serialize(defaultInAppMessageViewWrapperFactory, obj);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        setTouchListener settouchlistenerRemoteActionCompatParcelizer = ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion);
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = settouchlistenerRemoteActionCompatParcelizer.read();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = read(swipeDismissTouchListenerVerticalDismissDirection);
        setgraphicmodalmaxwidthdp.getClass();
        return settouchlistenerRemoteActionCompatParcelizer.serializer().IconCompatParcelizer(setgraphicmodalmaxwidthdp, swipeDismissTouchListenerVerticalDismissDirection);
    }
}
