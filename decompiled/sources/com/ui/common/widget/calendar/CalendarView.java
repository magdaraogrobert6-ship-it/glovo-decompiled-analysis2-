package com.ui.common.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import coil3.ExtrasKt;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.ui.common.widget.calendar.CalendarView;
import java.util.ArrayList;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.DataStoreUtilsa;
import o.DataStoreUtilsb;
import o.DateTimeUtils;
import o.DefaultContentCardView;
import o.brazeLogTag;
import o.getSUPPRESSannotations;
import o.installForLifecyclelambda1;
import o.r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs;
import o.r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.roundslo4al4;
import o.stringToMap;
import o.toJsonString;
import o.toStringMap;
import o.wdefault;

/* JADX INFO: loaded from: classes4.dex */
public final class CalendarView extends ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final LayoutTileBinding ResultReceiver;
    public wdefault r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final DateTimeUtils r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnDateSelected() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new stringToMap();
        brazeLogTag brazelogtag = new brazeLogTag(this, 0);
        r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs r8lambdagywmiypdgdzbhiy16f9ihdmrys = new r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs(new r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms(0));
        r8lambdagywmiypdgdzbhiy16f9ihdmrys.IconCompatParcelizer.write(new installForLifecyclelambda1(new DefaultContentCardView(25), new DataStoreUtilsb(3), new DataStoreUtilsa(brazelogtag, 0), toJsonString.RemoteActionCompatParcelizer));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdagywmiypdgdzbhiy16f9ihdmrys;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new DateTimeUtils(new brazeLogTag(this, 1));
        View.inflate(context, R.layout.layout_calendar, this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.component_padding_calendar_vertical);
        setPadding(getPaddingLeft(), dimensionPixelOffset, getPaddingRight(), dimensionPixelOffset);
        int i = R.id.layout_calendar_primary_action;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_calendar_primary_action, this);
        if (getsuppressannotations != null) {
            i = R.id.layout_calendar_secondary_action;
            getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_calendar_secondary_action, this);
            if (getsuppressannotations2 != null) {
                i = R.id.layout_calendar_week_day_titles;
                toStringMap tostringmap = (toStringMap) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_calendar_week_day_titles, this);
                if (tostringmap != null) {
                    i = R.id.layout_calendar_week_pager;
                    ViewPager2 viewPager2 = (ViewPager2) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_calendar_week_pager, this);
                    if (viewPager2 != null) {
                        this.ResultReceiver = new LayoutTileBinding(this, getsuppressannotations, getsuppressannotations2, tostringmap, viewPager2, 1);
                        hookBehaviour();
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new BrazeInAppMessageManagerExternalSyntheticLambda45(22);
                        return;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setCalendarBehaviour(wdefault wdefaultVar) {
        wdefaultVar.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = wdefaultVar;
        hookBehaviour();
    }

    public final void setOnDateSelected(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void hookBehaviour() {
        wdefault wdefaultVar = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i = 1;
        int i2 = 0;
        JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(i, this, CalendarView.class, "onWeekWindowUpdated", "onWeekWindowUpdated(Lcom/ui/common/widget/calendar/CalendarView$WeekListViewEntity;)V", i2, 24);
        wdefaultVar.getClass();
        wdefaultVar.MediaSessionCompatQueueItem = jobKt__JobKt$invokeOnCompletion$1;
        wdefault wdefaultVar2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(i, this, CalendarView.class, "onDateSelected", "onDateSelected(Lorg/joda/time/LocalDate;)V", i2, 25);
        wdefaultVar2.getClass();
        wdefaultVar2.RemoteActionCompatParcelizer = jobKt__JobKt$invokeOnCompletion$2;
        LayoutTileBinding layoutTileBinding = this.ResultReceiver;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer;
        wdefault wdefaultVar3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        String str = wdefaultVar3.write.format(wdefaultVar3.MediaMetadataCompat.toDate());
        str.getClass();
        getsuppressannotations.setText(str);
        final int i3 = 0;
        ((getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer).setOnClickListener(new View.OnClickListener(this) { // from class: o.BrazeLoggerPriority
            public final /* synthetic */ CalendarView write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                CalendarView calendarView = this.write;
                if (i4 != 0) {
                    calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer();
                } else {
                    calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                }
            }
        });
        getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) layoutTileBinding.read;
        getsuppressannotations2.setText(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RatingCompat());
        final int i4 = 1;
        getsuppressannotations2.setOnClickListener(new View.OnClickListener(this) { // from class: o.BrazeLoggerPriority
            public final /* synthetic */ CalendarView write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                CalendarView calendarView = this.write;
                if (i5 != 0) {
                    calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer();
                } else {
                    calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                }
            }
        });
        ViewPager2 viewPager2 = (ViewPager2) layoutTileBinding.write;
        viewPager2.setAdapter(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        roundslo4al4 roundslo4al4Var = viewPager2.IconCompatParcelizer;
        ArrayList arrayList = (ArrayList) roundslo4al4Var.write;
        DateTimeUtils dateTimeUtils = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        arrayList.remove(dateTimeUtils);
        ((ArrayList) roundslo4al4Var.write).add(dateTimeUtils);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read();
    }
}
