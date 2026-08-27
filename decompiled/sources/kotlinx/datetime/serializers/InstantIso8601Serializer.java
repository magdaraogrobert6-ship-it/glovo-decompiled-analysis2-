package kotlinx.datetime.serializers;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.Instant$Companion;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;
import o.setShouldNextUnregisterBeSkipped;

/* JADX INFO: loaded from: classes4.dex */
public final class InstantIso8601Serializer implements setGraphicModalMaxWidthDp {
    public static final InstantIso8601Serializer read = new InstantIso8601Serializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion write = RangesKt.read("Instant");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        Instant$Companion instant$Companion = setShouldNextUnregisterBeSkipped.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        instant$Companion.getClass();
        strResultReceiver.getClass();
        try {
            int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) strResultReceiver, 'T', 0, true, 2);
            if (iWrite != -1) {
                int length = strResultReceiver.length() - 1;
                if (length < 0) {
                    length = -1;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    char cCharAt = strResultReceiver.charAt(length);
                    if (cCharAt == '+' || cCharAt == '-') {
                        break;
                    }
                    if (i < 0) {
                        length = -1;
                        break;
                    }
                    length = i;
                }
                if (length >= iWrite && hideCurrentlyDisplayingInAppMessage.write((CharSequence) strResultReceiver, ':', length, false, 4) == -1) {
                    strResultReceiver = strResultReceiver + ":00";
                }
            }
            Instant instant = OffsetDateTime.parse(strResultReceiver).toInstant();
            instant.getClass();
            return new setShouldNextUnregisterBeSkipped(instant);
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped = (setShouldNextUnregisterBeSkipped) obj;
        setshouldnextunregisterbeskipped.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(setshouldnextunregisterbeskipped.toString());
    }
}
