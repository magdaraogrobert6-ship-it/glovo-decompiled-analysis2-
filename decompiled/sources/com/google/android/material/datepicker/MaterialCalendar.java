package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.preference.PreferenceGroupAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.glovo.R;
import com.sentiance.core.model.thrift.k$c;
import java.util.ArrayList;
import java.util.Calendar;
import o.BlurEffect;
import o.FocusOwnerImplmoveFocusfocusSearchSuccess1;
import o.FocusPropertiesNode;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonExit1;
import o.PlaceableKt;
import o.RemeasurementModifier;
import o.SubcomposeLayoutStatesetRoot1;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetModulatecp;
import o.accessgetSubcomposecp;
import o.getCalculateui;
import o.getEndX;
import o.getIntrinsicSizeNHjbRc;
import o.getSetRootui;
import o.isAppSetIdReadingEnabled;
import o.outermostOf;
import o.provides;
import o.providesRelative;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public k$c IconCompatParcelizer;
    public View MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public View MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public View ParcelableVolumeInfo;
    public RecyclerView PlaybackStateCompat;
    public RecyclerView RatingCompat;
    public CalendarConstraints RemoteActionCompatParcelizer;
    public IconCompatParcelizer read;
    public DateSelector serializer;
    public Month write;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$6, reason: invalid class name */
    public final class AnonymousClass6 extends AccessibilityDelegateCompat {
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;

        public /* synthetic */ AnonymousClass6(int i, Object obj) {
            this.RemoteActionCompatParcelizer = i;
            this.read = obj;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (this.RemoteActionCompatParcelizer != 4) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.read).MediaMetadataCompat);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = this.RemoteActionCompatParcelizer;
            Object obj = this.read;
            if (i2 == 1) {
                return ((getEndX) obj).serializer.performAccessibilityAction(view, i, bundle);
            }
            if (i2 != 2) {
                if (i2 != 6) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                if (i != 1048576) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                ((SubcomposeLayoutStatesetRoot1) ((getSetRootui) obj)).IconCompatParcelizer(3);
                return true;
            }
            if (i == 1048576) {
                PlaceableKt placeableKt = (PlaceableKt) obj;
                if (placeableKt.RatingCompat) {
                    placeableKt.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            int i = this.RemoteActionCompatParcelizer;
            Object obj = this.read;
            if (i == 0) {
                super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                focusRestorerKtsaveFocusedChild11.write.setHintText(materialCalendar.MediaBrowserCompatMediaItem.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
            }
            int absoluteAdapterPosition = -1;
            if (i == 1) {
                getEndX getendx = (getEndX) obj;
                getendx.serializer.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                RecyclerView recyclerView = getendx.write;
                recyclerView.getClass();
                RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                absoluteAdapterPosition = childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter instanceof PreferenceGroupAdapter) {
                    ((PreferenceGroupAdapter) adapter).read(absoluteAdapterPosition);
                    return;
                }
                return;
            }
            if (i == 2) {
                super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                if (!((PlaceableKt) obj).RatingCompat) {
                    focusRestorerKtsaveFocusedChild11.write.setDismissable(false);
                    return;
                } else {
                    focusRestorerKtsaveFocusedChild11.write(1048576);
                    focusRestorerKtsaveFocusedChild11.write.setDismissable(true);
                    return;
                }
            }
            if (i != 3) {
                if (i == 4) {
                    super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                    CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                    focusRestorerKtsaveFocusedChild11.write.setCheckable(checkableImageButton.serializer);
                    focusRestorerKtsaveFocusedChild11.write.setChecked(checkableImageButton.MediaMetadataCompat);
                    return;
                }
                if (i == 5) {
                    super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                    focusRestorerKtsaveFocusedChild11.write.setCheckable(((accessgetSubcomposecp) obj).RatingCompat);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                    focusRestorerKtsaveFocusedChild11.write(1048576);
                    focusRestorerKtsaveFocusedChild11.write.setDismissable(true);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            outermostOf outermostof = (outermostOf) obj;
            int i2 = outermostOf.serializer;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                for (int i4 = 0; i4 < outermostof.getChildCount(); i4++) {
                    if (outermostof.getChildAt(i4) == view) {
                        absoluteAdapterPosition = i3;
                        break;
                    }
                    if ((outermostof.getChildAt(i4) instanceof MaterialButton) && outermostof.IconCompatParcelizer(i4)) {
                        i3++;
                    }
                }
            }
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(0, 1, absoluteAdapterPosition, 1, ((MaterialButton) view).MediaSessionCompatQueueItem));
        }
    }

    public enum IconCompatParcelizer {
        DAY,
        YEAR
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void RemoteActionCompatParcelizer(MaterialDatePicker.AnonymousClass4 anonymousClass4) {
        this.MediaSessionCompatResultReceiverWrapper.add(anonymousClass4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.MediaSessionCompatQueueItem);
        this.IconCompatParcelizer = new k$c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        final int i3 = 1;
        final int i4 = 0;
        if (MaterialDatePicker.write(contextThemeWrapper, android.R.attr.windowFullscreen)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = MonthAdapter.serializer;
        viewInflate.setMinimumHeight(dimensionPixelOffset2 + dimensionPixelOffset + dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        FocusPropertiesNode.write(gridView, new providesRelative(i4));
        int i6 = this.RemoteActionCompatParcelizer.serializer;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new getCalculateui(i6) : new getCalculateui()));
        gridView.setNumColumns(month.write);
        gridView.setEnabled(false);
        this.RatingCompat = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.RatingCompat.setLayoutManager(new LinearLayoutManager(i2) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void IconCompatParcelizer(RecyclerView recyclerView, int i7) {
                RemeasurementModifier remeasurementModifier = new RemeasurementModifier(recyclerView.getContext());
                remeasurementModifier.MediaSessionCompatResultReceiverWrapper = i7;
                write(remeasurementModifier);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, int[] iArr) {
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                RecyclerView recyclerView = materialCalendar.RatingCompat;
                if (i2 == 0) {
                    iArr[0] = recyclerView.getWidth();
                    iArr[1] = materialCalendar.RatingCompat.getWidth();
                } else {
                    iArr[0] = recyclerView.getHeight();
                    iArr[1] = materialCalendar.RatingCompat.getHeight();
                }
            }
        });
        this.RatingCompat.setTag("MONTHS_VIEW_GROUP_TAG");
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.serializer, this.RemoteActionCompatParcelizer, new provides(this));
        this.RatingCompat.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.PlaybackStateCompat = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.PlaybackStateCompat.setLayoutManager(new GridLayoutManager(integer));
            this.PlaybackStateCompat.setAdapter(new YearGridAdapter(this));
            this.PlaybackStateCompat.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
                public final Calendar serializer = accessgetDeactivateOutOfFramecp.write((Calendar) null);
                public final Calendar read = accessgetDeactivateOutOfFramecp.write((Calendar) null);

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void onDraw(Canvas canvas, RecyclerView recyclerView2, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
                    if ((recyclerView2.getAdapter() instanceof YearGridAdapter) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        ((SingleDateSelector) materialCalendar.serializer).getClass();
                        for (FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 : new ArrayList()) {
                            Object obj = focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer;
                            Object obj2 = focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer;
                            if (obj2 != null) {
                                long jLongValue = ((Long) obj).longValue();
                                Calendar calendar = this.serializer;
                                calendar.setTimeInMillis(jLongValue);
                                long jLongValue2 = ((Long) obj2).longValue();
                                Calendar calendar2 = this.read;
                                calendar2.setTimeInMillis(jLongValue2);
                                int i7 = calendar.get(1) - yearGridAdapter.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RatingCompat;
                                int i8 = calendar2.get(1) - yearGridAdapter.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RatingCompat;
                                View viewMediaBrowserCompatMediaItem = gridLayoutManager.MediaBrowserCompatMediaItem(i7);
                                View viewMediaBrowserCompatMediaItem2 = gridLayoutManager.MediaBrowserCompatMediaItem(i8);
                                int i9 = gridLayoutManager.ParcelableVolumeInfo;
                                int i10 = i7 / i9;
                                int i11 = i8 / i9;
                                for (int i12 = i10; i12 <= i11; i12++) {
                                    View viewMediaBrowserCompatMediaItem3 = gridLayoutManager.MediaBrowserCompatMediaItem(gridLayoutManager.ParcelableVolumeInfo * i12);
                                    if (viewMediaBrowserCompatMediaItem3 != null) {
                                        int top = viewMediaBrowserCompatMediaItem3.getTop();
                                        int i13 = ((Rect) ((accessgetModulatecp) materialCalendar.IconCompatParcelizer.read).MediaDescriptionCompat).top;
                                        int bottom = viewMediaBrowserCompatMediaItem3.getBottom();
                                        int i14 = ((Rect) ((accessgetModulatecp) materialCalendar.IconCompatParcelizer.read).MediaDescriptionCompat).bottom;
                                        canvas.drawRect((i12 != i10 || viewMediaBrowserCompatMediaItem == null) ? 0 : (viewMediaBrowserCompatMediaItem.getWidth() / 2) + viewMediaBrowserCompatMediaItem.getLeft(), top + i13, (i12 != i11 || viewMediaBrowserCompatMediaItem2 == null) ? recyclerView2.getWidth() : (viewMediaBrowserCompatMediaItem2.getWidth() / 2) + viewMediaBrowserCompatMediaItem2.getLeft(), bottom - i14, (Paint) materialCalendar.IconCompatParcelizer.MediaDescriptionCompat);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            final MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            FocusPropertiesNode.write(materialButton, new AnonymousClass6(i4, this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.MediaDescriptionCompat = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.MediaMetadataCompat = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.ParcelableVolumeInfo = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.MediaBrowserCompatMediaItem = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            read(IconCompatParcelizer.DAY);
            materialButton.setText(this.write.serializer());
            this.RatingCompat.addOnScrollListener(new BlurEffect() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
                @Override // o.BlurEffect
                public final void IconCompatParcelizer(RecyclerView recyclerView2, int i7, int i8) {
                    CalendarConstraints calendarConstraints = monthsPagerAdapter.RemoteActionCompatParcelizer;
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    RecyclerView recyclerView3 = materialCalendar.RatingCompat;
                    int iMediaMetadataCompat = i7 < 0 ? ((LinearLayoutManager) recyclerView3.getLayoutManager()).MediaMetadataCompat() : ((LinearLayoutManager) recyclerView3.getLayoutManager()).MediaDescriptionCompat();
                    Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(calendarConstraints.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                    calendarIconCompatParcelizer.add(2, iMediaMetadataCompat);
                    materialCalendar.write = new Month(calendarIconCompatParcelizer);
                    Calendar calendarIconCompatParcelizer2 = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(calendarConstraints.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                    calendarIconCompatParcelizer2.add(2, iMediaMetadataCompat);
                    materialButton.setText(new Month(calendarIconCompatParcelizer2).serializer());
                }

                @Override // o.BlurEffect
                public final void RemoteActionCompatParcelizer(RecyclerView recyclerView2, int i7) {
                    if (i7 == 0) {
                        recyclerView2.announceForAccessibility(materialButton.getText());
                    }
                }
            });
            materialButton.setOnClickListener(new Toolbar.AnonymousClass4(4, this));
            this.MediaMetadataCompat.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                public final /* synthetic */ MaterialCalendar write;

                {
                    this.write = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i7 = i4;
                    MonthsPagerAdapter monthsPagerAdapter2 = monthsPagerAdapter;
                    MaterialCalendar materialCalendar = this.write;
                    if (i7 != 0) {
                        int iMediaDescriptionCompat = ((LinearLayoutManager) materialCalendar.RatingCompat.getLayoutManager()).MediaDescriptionCompat() - 1;
                        if (iMediaDescriptionCompat >= 0) {
                            Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(monthsPagerAdapter2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                            calendarIconCompatParcelizer.add(2, iMediaDescriptionCompat);
                            materialCalendar.write(new Month(calendarIconCompatParcelizer));
                            return;
                        }
                        return;
                    }
                    int iMediaMetadataCompat = ((LinearLayoutManager) materialCalendar.RatingCompat.getLayoutManager()).MediaMetadataCompat() + 1;
                    if (iMediaMetadataCompat < materialCalendar.RatingCompat.getAdapter().getItemCount()) {
                        Calendar calendarIconCompatParcelizer2 = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(monthsPagerAdapter2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                        calendarIconCompatParcelizer2.add(2, iMediaMetadataCompat);
                        materialCalendar.write(new Month(calendarIconCompatParcelizer2));
                    }
                }
            });
            this.MediaDescriptionCompat.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                public final /* synthetic */ MaterialCalendar write;

                {
                    this.write = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i7 = i3;
                    MonthsPagerAdapter monthsPagerAdapter2 = monthsPagerAdapter;
                    MaterialCalendar materialCalendar = this.write;
                    if (i7 != 0) {
                        int iMediaDescriptionCompat = ((LinearLayoutManager) materialCalendar.RatingCompat.getLayoutManager()).MediaDescriptionCompat() - 1;
                        if (iMediaDescriptionCompat >= 0) {
                            Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(monthsPagerAdapter2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                            calendarIconCompatParcelizer.add(2, iMediaDescriptionCompat);
                            materialCalendar.write(new Month(calendarIconCompatParcelizer));
                            return;
                        }
                        return;
                    }
                    int iMediaMetadataCompat = ((LinearLayoutManager) materialCalendar.RatingCompat.getLayoutManager()).MediaMetadataCompat() + 1;
                    if (iMediaMetadataCompat < materialCalendar.RatingCompat.getAdapter().getItemCount()) {
                        Calendar calendarIconCompatParcelizer2 = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(monthsPagerAdapter2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                        calendarIconCompatParcelizer2.add(2, iMediaMetadataCompat);
                        materialCalendar.write(new Month(calendarIconCompatParcelizer2));
                    }
                }
            });
        }
        if (!MaterialDatePicker.write(contextThemeWrapper, android.R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.RatingCompat);
        }
        this.RatingCompat.scrollToPosition(monthsPagerAdapter.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(this.write));
        FocusPropertiesNode.write(this.RatingCompat, new providesRelative(i3));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.MediaSessionCompatQueueItem);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.serializer);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.RemoteActionCompatParcelizer);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.write);
    }

    public final void read(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
        if (iconCompatParcelizer == IconCompatParcelizer.YEAR) {
            this.PlaybackStateCompat.getLayoutManager().RatingCompat(this.write.RatingCompat - ((YearGridAdapter) this.PlaybackStateCompat.getAdapter()).read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RatingCompat);
            this.ParcelableVolumeInfo.setVisibility(0);
            this.MediaBrowserCompatMediaItem.setVisibility(8);
            this.MediaDescriptionCompat.setVisibility(8);
            this.MediaMetadataCompat.setVisibility(8);
            return;
        }
        if (iconCompatParcelizer == IconCompatParcelizer.DAY) {
            this.ParcelableVolumeInfo.setVisibility(8);
            this.MediaBrowserCompatMediaItem.setVisibility(0);
            this.MediaDescriptionCompat.setVisibility(0);
            this.MediaMetadataCompat.setVisibility(0);
            write(this.write);
        }
    }

    public final void write(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.RatingCompat.getAdapter();
        int iWrite = monthsPagerAdapter.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(month);
        int iWrite2 = iWrite - monthsPagerAdapter.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(this.write);
        int i = 3;
        boolean z = Math.abs(iWrite2) > 3;
        boolean z2 = iWrite2 > 0;
        this.write = month;
        if (z && z2) {
            this.RatingCompat.scrollToPosition(iWrite - 3);
            this.RatingCompat.post(new CallbackWrapper$2(this, iWrite, i));
            return;
        }
        RecyclerView recyclerView = this.RatingCompat;
        if (!z) {
            recyclerView.post(new CallbackWrapper$2(this, iWrite, i));
        } else {
            recyclerView.scrollToPosition(iWrite + 3);
            this.RatingCompat.post(new CallbackWrapper$2(this, iWrite, i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.MediaSessionCompatQueueItem = bundle.getInt("THEME_RES_ID_KEY");
        this.serializer = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.RemoteActionCompatParcelizer = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.write = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }
}
