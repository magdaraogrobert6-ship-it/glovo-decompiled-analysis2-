package o;

import com.ui.common.widget.calendar.CalendarView;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class brazeLogTag implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ CalendarView serializer;

    public /* synthetic */ brazeLogTag(CalendarView calendarView, int i) {
        this.read = i;
        this.serializer = calendarView;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CalendarView calendarView = this.serializer;
        if (i != 0) {
            calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(((Integer) obj).intValue());
            return createfromparcel;
        }
        LocalDate localDate = (LocalDate) obj;
        int i2 = CalendarView.RemoteActionCompatParcelizer;
        localDate.getClass();
        calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(localDate);
        return createfromparcel;
    }
}
