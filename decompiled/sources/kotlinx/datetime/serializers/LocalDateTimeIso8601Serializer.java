package kotlinx.datetime.serializers;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime$Companion;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDateTimeIso8601Serializer implements setGraphicModalMaxWidthDp {
    public static final LocalDateTimeIso8601Serializer write = new LocalDateTimeIso8601Serializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion serializer = RangesKt.read("LocalDateTime");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        LocalDateTime$Companion localDateTime$Companion = setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        localDateTime$Companion.getClass();
        strResultReceiver.getClass();
        try {
            return new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(LocalDateTime.parse(strResultReceiver));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = (setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release) obj;
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.toString());
    }
}
