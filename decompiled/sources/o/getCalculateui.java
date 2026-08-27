package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class getCalculateui extends BaseAdapter {
    public final Calendar IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(com.logistics.rider.glovo.R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.serializer;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.IconCompatParcelizer;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(com.logistics.rider.glovo.R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, java.util.Locale.getDefault())));
        return textView;
    }

    public getCalculateui() {
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        this.IconCompatParcelizer = calendarWrite;
        this.RemoteActionCompatParcelizer = calendarWrite.getMaximum(7);
        this.serializer = calendarWrite.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.serializer;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public getCalculateui(int i) {
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        this.IconCompatParcelizer = calendarWrite;
        this.RemoteActionCompatParcelizer = calendarWrite.getMaximum(7);
        this.serializer = i;
    }
}
