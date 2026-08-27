package kotlinx.datetime.serializers;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime$Companion;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.InAppMessageOperationCompanion;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalTimeIso8601Serializer implements setGraphicModalMaxWidthDp {
    public static final LocalTimeIso8601Serializer RemoteActionCompatParcelizer = new LocalTimeIso8601Serializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion serializer = RangesKt.read("LocalTime");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        LocalTime$Companion localTime$Companion = InAppMessageOperationCompanion.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        localTime$Companion.getClass();
        strResultReceiver.getClass();
        try {
            return new InAppMessageOperationCompanion(LocalTime.parse(strResultReceiver));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        InAppMessageOperationCompanion inAppMessageOperationCompanion = (InAppMessageOperationCompanion) obj;
        inAppMessageOperationCompanion.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(inAppMessageOperationCompanion.toString());
    }
}
