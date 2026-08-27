package o;

import kotlinx.serialization.internal.NothingSerializer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onOtherUrlActionlambda4 {
    public static final safeSetClipToOutline IconCompatParcelizer;

    static {
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(String.class), beforeInAppMessageViewClosed.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Character.TYPE), DefaultInAppMessageViewLifecycleListener.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(char[].class), DefaultInAppMessageManagerListener.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Double.TYPE), r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(double[].class), r8lambdaHA_wc_r_7vD2ey5sILtbkrKVmLU.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Float.TYPE), onClickedlambda0.serializer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(float[].class), beforeClosedlambda0.serializer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Long.TYPE), onDismissed.write);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(long[].class), beforeClosed.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(describeContents.class), handleHorizontalActionUp.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Integer.TYPE), afterClosed.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(int[].class), performInAppMessageButtonClicked.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(replaceCards.class), IInAppMessageViewLifecycleListener.read);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Short.TYPE), afterInAppMessageViewClosed.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(short[].class), onCustomEventFired.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(DefaultContentCardsUpdateHandler.class), NestfgetmToken.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Byte.TYPE), r8lambda1VgBO9VidiFdX4WL52nRFDgX4.RemoteActionCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(byte[].class), InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(setImpressedCardIds.class), onInAppMessageClicked.read);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Boolean.TYPE), getWasCloseMessageCalled.write);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(boolean[].class), r8lambdapYHTBFf8mZBZdsTWcnikNeYLg.write);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(createFromParcel.class), NestfgetmCallbacks.IconCompatParcelizer);
        safesetcliptooutline.put(displayInAppMessagelambda1.serializer(Void.class), NothingSerializer.write);
        try {
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.class);
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            safesetcliptooutline.put(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, afterClosedlambda0.write);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            safesetcliptooutline.put(displayInAppMessagelambda1.serializer(EmptyContentCardsAdapter.class), onInAppMessageDismissed.write);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            safesetcliptooutline.put(displayInAppMessagelambda1.serializer(ContentCardAdapterExternalSyntheticLambda6.class), SwipeDismissTouchListener.RemoteActionCompatParcelizer);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            safesetcliptooutline.put(displayInAppMessagelambda1.serializer(DefaultContentCardsUpdateHandlerCompanion.class), r8lambdaZyjUdpl8k8CsYRkQ_udSuHMGpvg.IconCompatParcelizer);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            safesetcliptooutline.put(displayInAppMessagelambda1.serializer(ContentCardAdapterCardListDiffCallback.class), onInAppMessageButtonClicked.serializer);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            safesetcliptooutline.put(displayInAppMessagelambda1.serializer(r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y.class), handleVerticalActionUp.serializer);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(accesscontainsPushPermissionPrompt.class);
            accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt = accesscontainsPushPermissionPrompt.RemoteActionCompatParcelizer;
            safesetcliptooutline.put(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2, onDismissedlambda0.serializer);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        IconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
    }
}
