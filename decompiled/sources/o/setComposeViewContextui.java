package o;

import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$BannerMessage;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$CardMessage;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.firebase.inappmessaging.MessagesProto$ImageOnlyMessage;
import com.google.firebase.inappmessaging.MessagesProto$ModalMessage;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.huawei.location.Vw$Vw;
import com.huawei.location.ut;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setComposeViewContextui {
    public static internalOnMeasureui RemoteActionCompatParcelizer(MessagesProto$Content messagesProto$Content, String str, String str2, boolean z) {
        onAttachedToWindow onattachedtowindow;
        onAttachedToWindow onattachedtowindow2;
        onAttachedToWindow onattachedtowindow3;
        onAttachedToWindow onattachedtowindow4;
        onAttachedToWindow onattachedtowindow5;
        TextStreamsKt.serializer(messagesProto$Content, "FirebaseInAppMessaging content cannot be null.");
        TextStreamsKt.serializer(str, "FirebaseInAppMessaging campaign id cannot be null.");
        TextStreamsKt.serializer(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        messagesProto$Content.toString();
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        int i = 9;
        ut utVar = new ut(i, str2, str, z);
        int i2 = setViewCompositionStrategy.RemoteActionCompatParcelizer[messagesProto$Content.getMessageDetailsCase().ordinal()];
        if (i2 == 1) {
            MessagesProto$BannerMessage banner = messagesProto$Content.getBanner();
            String backgroundHexColor = !TextUtils.isEmpty(banner.getBackgroundHexColor()) ? banner.getBackgroundHexColor() : null;
            if (TextUtils.isEmpty(banner.getImageUrl())) {
                onattachedtowindow = null;
            } else {
                String imageUrl = banner.getImageUrl();
                if (TextUtils.isEmpty(imageUrl)) {
                    imageUrl = null;
                }
                if (TextUtils.isEmpty(imageUrl)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageData model must have an imageUrl");
                    return null;
                }
                onattachedtowindow = new onAttachedToWindow(imageUrl);
            }
            createComposition createcompositionWrite = banner.hasAction() ? serializer(banner.getAction()).write() : null;
            setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer = banner.hasBody() ? RemoteActionCompatParcelizer(banner.getBody()) : null;
            setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer2 = banner.hasTitle() ? RemoteActionCompatParcelizer(banner.getTitle()) : null;
            if (setparentcompositioncontextRemoteActionCompatParcelizer2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Banner model must have a title");
                return null;
            }
            if (!TextUtils.isEmpty(backgroundHexColor)) {
                return new getComposeViewContextui(utVar, setparentcompositioncontextRemoteActionCompatParcelizer2, setparentcompositioncontextRemoteActionCompatParcelizer, onattachedtowindow, createcompositionWrite, backgroundHexColor);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Banner model must have a background color");
            return null;
        }
        if (i2 == 2) {
            MessagesProto$ImageOnlyMessage imageOnly = messagesProto$Content.getImageOnly();
            if (TextUtils.isEmpty(imageOnly.getImageUrl())) {
                onattachedtowindow2 = null;
            } else {
                String imageUrl2 = imageOnly.getImageUrl();
                if (TextUtils.isEmpty(imageUrl2)) {
                    imageUrl2 = null;
                }
                if (TextUtils.isEmpty(imageUrl2)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageData model must have an imageUrl");
                    return null;
                }
                onattachedtowindow2 = new onAttachedToWindow(imageUrl2);
            }
            createComposition createcompositionWrite2 = imageOnly.hasAction() ? serializer(imageOnly.getAction()).write() : null;
            if (onattachedtowindow2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageOnly model must have image data");
                return null;
            }
            internalOnLayoutui internalonlayoutui = new internalOnLayoutui(utVar, com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY);
            internalonlayoutui.read = onattachedtowindow2;
            internalonlayoutui.RemoteActionCompatParcelizer = createcompositionWrite2;
            return internalonlayoutui;
        }
        if (i2 == 3) {
            MessagesProto$ModalMessage modal = messagesProto$Content.getModal();
            String backgroundHexColor2 = !TextUtils.isEmpty(modal.getBackgroundHexColor()) ? modal.getBackgroundHexColor() : null;
            if (TextUtils.isEmpty(modal.getImageUrl())) {
                onattachedtowindow3 = null;
            } else {
                String imageUrl3 = modal.getImageUrl();
                if (TextUtils.isEmpty(imageUrl3)) {
                    imageUrl3 = null;
                }
                if (TextUtils.isEmpty(imageUrl3)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageData model must have an imageUrl");
                    return null;
                }
                onattachedtowindow3 = new onAttachedToWindow(imageUrl3);
            }
            createComposition createcompositionSerializer = modal.hasAction() ? serializer(modal.getAction(), modal.getActionButton()) : null;
            setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer3 = modal.hasBody() ? RemoteActionCompatParcelizer(modal.getBody()) : null;
            setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer4 = modal.hasTitle() ? RemoteActionCompatParcelizer(modal.getTitle()) : null;
            if (setparentcompositioncontextRemoteActionCompatParcelizer4 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Modal model must have a title");
                return null;
            }
            if (createcompositionSerializer != null && createcompositionSerializer.serializer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Modal model action must be null or have a button");
                return null;
            }
            if (!TextUtils.isEmpty(backgroundHexColor2)) {
                return new onRtlPropertiesChanged(utVar, setparentcompositioncontextRemoteActionCompatParcelizer4, setparentcompositioncontextRemoteActionCompatParcelizer3, onattachedtowindow3, createcompositionSerializer, backgroundHexColor2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Modal model must have a background color");
            return null;
        }
        if (i2 != 4) {
            return new setTransitionGroup(new ut(i, str2, str, z), com.google.firebase.inappmessaging.model.MessageType.UNSUPPORTED);
        }
        MessagesProto$CardMessage card = messagesProto$Content.getCard();
        setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer5 = card.hasTitle() ? RemoteActionCompatParcelizer(card.getTitle()) : null;
        setParentCompositionContext setparentcompositioncontextRemoteActionCompatParcelizer6 = card.hasBody() ? RemoteActionCompatParcelizer(card.getBody()) : null;
        String backgroundHexColor3 = !TextUtils.isEmpty(card.getBackgroundHexColor()) ? card.getBackgroundHexColor() : null;
        createComposition createcompositionSerializer2 = (card.hasPrimaryAction() || card.hasPrimaryActionButton()) ? serializer(card.getPrimaryAction(), card.getPrimaryActionButton()) : null;
        createComposition createcompositionSerializer3 = (card.hasSecondaryAction() || card.hasSecondaryActionButton()) ? serializer(card.getSecondaryAction(), card.getSecondaryActionButton()) : null;
        if (TextUtils.isEmpty(card.getPortraitImageUrl())) {
            onattachedtowindow4 = null;
        } else {
            String portraitImageUrl = card.getPortraitImageUrl();
            if (TextUtils.isEmpty(portraitImageUrl)) {
                portraitImageUrl = null;
            }
            if (TextUtils.isEmpty(portraitImageUrl)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageData model must have an imageUrl");
                return null;
            }
            onattachedtowindow4 = new onAttachedToWindow(portraitImageUrl);
        }
        if (TextUtils.isEmpty(card.getLandscapeImageUrl())) {
            onattachedtowindow5 = null;
        } else {
            String landscapeImageUrl = card.getLandscapeImageUrl();
            if (TextUtils.isEmpty(landscapeImageUrl)) {
                landscapeImageUrl = null;
            }
            if (TextUtils.isEmpty(landscapeImageUrl)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ImageData model must have an imageUrl");
                return null;
            }
            onattachedtowindow5 = new onAttachedToWindow(landscapeImageUrl);
        }
        if (createcompositionSerializer2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model must have a primary action");
            return null;
        }
        if (createcompositionSerializer2.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model must have a primary action button");
            return null;
        }
        if (createcompositionSerializer3 != null && createcompositionSerializer3.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model secondary action must be null or have a button");
            return null;
        }
        if (setparentcompositioncontextRemoteActionCompatParcelizer5 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model must have a title");
            return null;
        }
        if (onattachedtowindow4 == null && onattachedtowindow5 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model must have at least one image");
            return null;
        }
        if (!TextUtils.isEmpty(backgroundHexColor3)) {
            return new isTransitionGroup(utVar, setparentcompositioncontextRemoteActionCompatParcelizer5, setparentcompositioncontextRemoteActionCompatParcelizer6, onattachedtowindow4, onattachedtowindow5, backgroundHexColor3, createcompositionSerializer2, createcompositionSerializer3);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Card model must have a background color");
        return null;
    }

    public static createComposition serializer(MessagesProto$Action messagesProto$Action, MessagesProto$Button messagesProto$Button) {
        setParentCompositionContext setparentcompositioncontext;
        Vw$Vw vw$VwSerializer = serializer(messagesProto$Action);
        if (!messagesProto$Button.equals(MessagesProto$Button.getDefaultInstance())) {
            String buttonHexColor = !TextUtils.isEmpty(messagesProto$Button.getButtonHexColor()) ? messagesProto$Button.getButtonHexColor() : null;
            if (messagesProto$Button.hasText()) {
                MessagesProto$Text text = messagesProto$Button.getText();
                String text2 = !TextUtils.isEmpty(text.getText()) ? text.getText() : null;
                String hexColor = !TextUtils.isEmpty(text.getHexColor()) ? text.getHexColor() : null;
                if (!TextUtils.isEmpty(hexColor)) {
                    setparentcompositioncontext = new setParentCompositionContext(text2, hexColor);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Text model must have a color");
                    return null;
                }
            } else {
                setparentcompositioncontext = null;
            }
            if (TextUtils.isEmpty(buttonHexColor)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Button model must have a color");
                return null;
            }
            if (setparentcompositioncontext != null) {
                vw$VwSerializer.IconCompatParcelizer = new getAutoClearFocusBehavior4UtRPd4(setparentcompositioncontext, buttonHexColor);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Button model must have text");
                return null;
            }
        }
        return vw$VwSerializer.write();
    }

    public static setParentCompositionContext RemoteActionCompatParcelizer(MessagesProto$Text messagesProto$Text) {
        String hexColor = !TextUtils.isEmpty(messagesProto$Text.getHexColor()) ? messagesProto$Text.getHexColor() : null;
        String text = !TextUtils.isEmpty(messagesProto$Text.getText()) ? messagesProto$Text.getText() : null;
        if (!TextUtils.isEmpty(hexColor)) {
            return new setParentCompositionContext(text, hexColor);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Text model must have a color");
        return null;
    }

    public static Vw$Vw serializer(MessagesProto$Action messagesProto$Action) {
        Vw$Vw vw$Vw = new Vw$Vw(8, (char) 0);
        if (!TextUtils.isEmpty(messagesProto$Action.getActionUrl())) {
            String actionUrl = messagesProto$Action.getActionUrl();
            if (!TextUtils.isEmpty(actionUrl)) {
                vw$Vw.serializer = actionUrl;
            }
        }
        return vw$Vw;
    }
}
