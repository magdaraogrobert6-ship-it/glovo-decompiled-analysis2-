package o;

import java.util.Calendar;
import kotlin.ranges.RangesKt;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetOldDependencyp implements setGraphicModalMaxWidthDp {
    public final DefaultInAppMessageWebViewClientListenerCompanion read;
    public final /* synthetic */ int serializer;

    public accesssetOldDependencyp(int i) {
        this.serializer = i;
        if (i != 1) {
            this.read = RangesKt.read("Calendar");
        } else {
            this.read = RangesKt.read("DateTime");
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        if (this.serializer != 0) {
            DateTime dateTime = ISODateTimeFormat.dateTimeParser().withOffsetParsed().parseDateTime(defaultInAppMessageModalViewFactoryCompanion.ResultReceiver());
            dateTime.getClass();
            return dateTime;
        }
        long j = Long.parseLong(defaultInAppMessageModalViewFactoryCompanion.ResultReceiver());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.serializer != 0 ? this.read : this.read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        if (this.serializer == 0) {
            Calendar calendar = (Calendar) obj;
            calendar.getClass();
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(String.valueOf(calendar.getTimeInMillis()));
        } else {
            DateTime dateTime = (DateTime) obj;
            dateTime.getClass();
            String strPrint = ISODateTimeFormat.dateTime().print(dateTime);
            strPrint.getClass();
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(strPrint);
        }
    }
}
