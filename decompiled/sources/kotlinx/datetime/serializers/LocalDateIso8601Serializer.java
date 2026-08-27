package kotlinx.datetime.serializers;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate$Companion;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.InAppMessageManagerBaseExternalSyntheticLambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDateIso8601Serializer implements setGraphicModalMaxWidthDp {
    public static final LocalDateIso8601Serializer IconCompatParcelizer = new LocalDateIso8601Serializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion write = RangesKt.read("LocalDate");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        LocalDate$Companion localDate$Companion = InAppMessageManagerBaseExternalSyntheticLambda1.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        localDate$Companion.getClass();
        strResultReceiver.getClass();
        try {
            return new InAppMessageManagerBaseExternalSyntheticLambda1(LocalDate.parse(strResultReceiver));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1 = (InAppMessageManagerBaseExternalSyntheticLambda1) obj;
        inAppMessageManagerBaseExternalSyntheticLambda1.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(inAppMessageManagerBaseExternalSyntheticLambda1.toString());
    }
}
