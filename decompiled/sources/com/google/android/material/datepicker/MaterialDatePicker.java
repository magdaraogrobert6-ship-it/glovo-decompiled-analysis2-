package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import coil3.util.ContextsKt;
import coil3.util.IntPair;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.DataStoreUtils;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.FocusPropertiesNode;
import o.FocusRestorerElement;
import o.ImageResources_androidKt;
import o.SubcomposeSlotReusePolicy;
import o.accessgetCancelcp;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetResumePausedcp;
import o.accessmergeRulerValues;
import o.div7Ah8Wj8;
import o.getOnExitannotations;
import o.isAppSetIdReadingEnabled;
import o.isInfiniteannotations;
import o.mergeRulerValues;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setFocusRequester;
import o.setMeasuredSizeozmzZPI;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    private static int peekAvailableContext = 1;
    private static int registerForActivityResult = 0;
    private static byte removeOnConfigurationChangedListener = -112;
    public MaterialCalendar getNavigationEventDispatcher;
    public SubcomposeSlotReusePolicy getOnBackPressedDispatcher;
    public CalendarConstraints getSavedStateRegistry;
    public boolean initializeViewTreeOwners;
    public CharSequence invalidateMenu;
    public Button onActivityResult;
    public DateSelector onBackPressed;
    public boolean onConfigurationChanged;
    public CharSequence onCreate;
    public CheckableImageButton onCreatePanelMenu;
    public int onMenuItemSelected;
    public TextView onMultiWindowModeChanged;
    public TextView onNewIntent;
    public int onPreparePanel;
    public int onRetainCustomNonConfigurationInstance;
    public int onRetainNonConfigurationInstance;
    public PickerFragment onSaveInstanceState;
    public CharSequence onTrimMemory;
    public CharSequence onUserLeaveHint;
    public int removeMenuProvider;
    public CharSequence removeOnContextAvailableListener;
    public final LinkedHashSet onRequestPermissionsResult = new LinkedHashSet();
    public final LinkedHashSet onPanelClosed = new LinkedHashSet();
    public final LinkedHashSet onPictureInPictureUiStateChanged = new LinkedHashSet();
    public final LinkedHashSet onPictureInPictureModeChanged = new LinkedHashSet();

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialDatePicker$4, reason: invalid class name */
    public final class AnonymousClass4 {
        public final /* synthetic */ Fragment RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;

        public /* synthetic */ AnonymousClass4(Fragment fragment, int i) {
            this.read = i;
            this.RemoteActionCompatParcelizer = fragment;
        }

        public final void read() {
            int i = this.read;
            Fragment fragment = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                ((MaterialDatePicker) fragment).onActivityResult.setEnabled(false);
                return;
            }
            Iterator it = ((MaterialTextInputPicker) fragment).MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                ((AnonymousClass4) it.next()).read();
            }
        }

        public final void serializer(Object obj) {
            int i = this.read;
            Fragment fragment = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                Iterator it = ((MaterialTextInputPicker) fragment).MediaSessionCompatResultReceiverWrapper.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass4) it.next()).serializer(obj);
                }
            } else {
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) fragment;
                materialDatePicker.write(materialDatePicker.MediaDescriptionCompat());
                materialDatePicker.onActivityResult.setEnabled(((SingleDateSelector) materialDatePicker.serializer()).IconCompatParcelizer != null);
            }
        }
    }

    public static boolean write(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(R.attr.materialCalendarStyle), MaterialCalendar.class.getCanonicalName()};
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(((TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, objArr, iRemoteActionCompatParcelizer)).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.onPictureInPictureUiStateChanged.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.onPictureInPictureModeChanged.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.onSaveInstanceState.MediaSessionCompatResultReceiverWrapper.clear();
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int i = this.onRetainNonConfigurationInstance;
        if (i == 0) {
            ((SingleDateSelector) serializer()).getClass();
            Object[] objArr = {contextRequireContext2, Integer.valueOf(R.attr.materialCalendarTheme), MaterialDatePicker.class.getCanonicalName()};
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            i = ((TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, objArr, iRemoteActionCompatParcelizer)).data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.onConfigurationChanged = write(context, android.R.attr.windowFullscreen);
        this.getOnBackPressedDispatcher = new SubcomposeSlotReusePolicy(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, setMeasuredSizeozmzZPI.MaterialCalendar, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.getOnBackPressedDispatcher.write(context);
        this.getOnBackPressedDispatcher.MediaBrowserCompatMediaItem(ColorStateList.valueOf(color));
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.getOnBackPressedDispatcher;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(decorView.getElevation());
        return dialog;
    }

    public final void write(String str) {
        TextView textView = this.onMultiWindowModeChanged;
        DateSelector dateSelectorSerializer = serializer();
        Context contextRequireContext = requireContext();
        SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelectorSerializer;
        singleDateSelector.getClass();
        Resources resources = contextRequireContext.getResources();
        Long l = singleDateSelector.IconCompatParcelizer;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : accessmergeRulerValues.write(l.longValue())));
        this.onMultiWindowModeChanged.setText(str);
    }

    public final class Builder {
        public CalendarConstraints RemoteActionCompatParcelizer;
        public int serializer = 0;
        public final SingleDateSelector write;

        public Builder(SingleDateSelector singleDateSelector) {
            this.write = singleDateSelector;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0053  */
        /* JADX WARN: Code duplicated, block: B:22:0x0070  */
        public final MaterialDatePicker read() {
            Month month;
            CalendarConstraints calendarConstraints;
            Month month2;
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new CalendarConstraints.Builder().serializer();
            }
            if (this.serializer == 0) {
                this.serializer = R.string.mtrl_picker_date_header_title;
            }
            CalendarConstraints calendarConstraints2 = this.RemoteActionCompatParcelizer;
            Month month3 = calendarConstraints2.read;
            SingleDateSelector singleDateSelector = this.write;
            if (month3 == null) {
                if (singleDateSelector.read().isEmpty()) {
                    month = new Month(accessgetDeactivateOutOfFramecp.write());
                    calendarConstraints = this.RemoteActionCompatParcelizer;
                    if (month.compareTo(calendarConstraints.RemoteActionCompatParcelizer) >= 0) {
                        month2 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    } else {
                        month2 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    }
                } else {
                    month2 = Month.read(((Long) singleDateSelector.read().iterator().next()).longValue());
                    CalendarConstraints calendarConstraints3 = this.RemoteActionCompatParcelizer;
                    if (month2.compareTo(calendarConstraints3.RemoteActionCompatParcelizer) < 0 || month2.compareTo(calendarConstraints3.IconCompatParcelizer) > 0) {
                        month = new Month(accessgetDeactivateOutOfFramecp.write());
                        calendarConstraints = this.RemoteActionCompatParcelizer;
                        if (month.compareTo(calendarConstraints.RemoteActionCompatParcelizer) >= 0 || month.compareTo(calendarConstraints.IconCompatParcelizer) > 0) {
                            month2 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                        } else {
                            month2 = month;
                        }
                    }
                }
                calendarConstraints2.read = month2;
            }
            MaterialDatePicker materialDatePicker = new MaterialDatePicker();
            Bundle bundle = new Bundle();
            bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
            bundle.putParcelable("DATE_SELECTOR_KEY", singleDateSelector);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.RemoteActionCompatParcelizer);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.serializer);
            bundle.putCharSequence("TITLE_TEXT_KEY", null);
            bundle.putInt("INPUT_MODE_KEY", 0);
            bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
            bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
            bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
            bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
            materialDatePicker.setArguments(bundle);
            return materialDatePicker;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        ContextsKt focusRestorerElement;
        ContextsKt focusRestorerElement2;
        super.onStart();
        Window window = y_().getWindow();
        if (this.onConfigurationChanged) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.getOnBackPressedDispatcher);
            if (!this.initializeViewTreeOwners) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iWrite = mergeRulerValues.write(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(iWrite);
                }
                SentryUUID.read(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = mergeRulerValues.IconCompatParcelizer(0) || mergeRulerValues.IconCompatParcelizer(numValueOf.intValue());
                FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    focusRestorerElement = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                } else {
                    focusRestorerElement = i >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                }
                focusRestorerElement.write(z2);
                boolean z3 = mergeRulerValues.IconCompatParcelizer(0) || mergeRulerValues.IconCompatParcelizer(iWrite);
                FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    focusRestorerElement2 = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1);
                } else {
                    focusRestorerElement2 = i2 >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1);
                }
                focusRestorerElement2.read(z3);
                ImageResources_androidKt imageResources_androidKt = new ImageResources_androidKt(viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop(), viewFindViewById);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                accessgetCancelcp.write(viewFindViewById, imageResources_androidKt);
                this.initializeViewTreeOwners = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.getOnBackPressedDispatcher, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new accessgetResumePausedcp(y_(), rect));
        }
        RatingCompat();
    }

    public final String MediaDescriptionCompat() {
        DateSelector dateSelectorSerializer = serializer();
        Context context = getContext();
        SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelectorSerializer;
        singleDateSelector.getClass();
        Resources resources = context.getResources();
        Long l = singleDateSelector.IconCompatParcelizer;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, accessmergeRulerValues.write(l.longValue()));
    }

    public final void RatingCompat() {
        Context contextRequireContext = requireContext();
        int i = this.onRetainNonConfigurationInstance;
        if (i == 0) {
            ((SingleDateSelector) serializer()).getClass();
            i = ((TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, new Object[]{contextRequireContext, Integer.valueOf(R.attr.materialCalendarTheme), MaterialDatePicker.class.getCanonicalName()}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).data;
        }
        DateSelector dateSelectorSerializer = serializer();
        CalendarConstraints calendarConstraints = this.getSavedStateRegistry;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorSerializer);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.read);
        materialCalendar.setArguments(bundle);
        this.getNavigationEventDispatcher = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.onMenuItemSelected == 1) {
            DateSelector dateSelectorSerializer2 = serializer();
            CalendarConstraints calendarConstraints2 = this.getSavedStateRegistry;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorSerializer2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.onSaveInstanceState = pickerFragment;
        this.onNewIntent.setText((this.onMenuItemSelected == 1 && getResources().getConfiguration().orientation == 2) ? this.onTrimMemory : this.invalidateMenu);
        write(MediaDescriptionCompat());
        div7Ah8Wj8 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(childFragmentManager);
        isinfiniteannotations.IconCompatParcelizer(R.id.mtrl_calendar_frame, this.onSaveInstanceState, null);
        isinfiniteannotations.RemoteActionCompatParcelizer();
        this.onSaveInstanceState.RemoteActionCompatParcelizer(new AnonymousClass4(this, 0));
    }

    public final DateSelector serializer() {
        if (this.onBackPressed == null) {
            this.onBackPressed = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.onBackPressed;
    }

    public final void IconCompatParcelizer(CheckableImageButton checkableImageButton) {
        this.onCreatePanelMenu.setContentDescription(this.onMenuItemSelected == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.onRetainNonConfigurationInstance);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.onBackPressed);
        CalendarConstraints calendarConstraints = this.getSavedStateRegistry;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(0);
        builder.RatingCompat = CalendarConstraints.Builder.serializer;
        builder.IconCompatParcelizer = CalendarConstraints.Builder.write;
        builder.MediaSessionCompatQueueItem = new DateValidatorPointForward(Long.MIN_VALUE);
        builder.RatingCompat = calendarConstraints.RemoteActionCompatParcelizer.MediaMetadataCompat;
        builder.IconCompatParcelizer = calendarConstraints.IconCompatParcelizer.MediaMetadataCompat;
        builder.read = Long.valueOf(calendarConstraints.read.MediaMetadataCompat);
        builder.RemoteActionCompatParcelizer = calendarConstraints.serializer;
        builder.MediaSessionCompatQueueItem = calendarConstraints.MediaSessionCompatQueueItem;
        MaterialCalendar materialCalendar = this.getNavigationEventDispatcher;
        Month month = materialCalendar == null ? null : materialCalendar.write;
        if (month != null) {
            builder.read = Long.valueOf(month.MediaMetadataCompat);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.serializer());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.removeMenuProvider);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.removeOnContextAvailableListener);
        bundle.putInt("INPUT_MODE_KEY", this.onMenuItemSelected);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.onRetainCustomNonConfigurationInstance);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.onUserLeaveHint);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.onPreparePanel);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.onCreate);
    }

    public static int RemoteActionCompatParcelizer(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(accessgetDeactivateOutOfFramecp.write());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.write;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    private void b(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ removeOnConfigurationChangedListener);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e9 A[PHI: r5
  0x00e9: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:17:0x00b4, B:19:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0112 A[PHI: r2
  0x0112: PHI (r2v8 java.lang.CharSequence[]) = (r2v7 java.lang.CharSequence[]), (r2v12 java.lang.CharSequence[]) binds: [B:30:0x0110, B:27:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArrSplit;
        int i = 2 % 2;
        int i2 = registerForActivityResult + 5;
        peekAvailableContext = i2 % Fields.SpotShadowColor;
        CharSequence charSequence = null;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            throw null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            int i3 = registerForActivityResult + 59;
            peekAvailableContext = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                getArguments();
                charSequence.hashCode();
                throw null;
            }
            bundle = getArguments();
        }
        this.onRetainNonConfigurationInstance = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.onBackPressed = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.getSavedStateRegistry = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
            return;
        }
        int i4 = peekAvailableContext + 99;
        registerForActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        this.removeMenuProvider = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.removeOnContextAvailableListener = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.onMenuItemSelected = bundle.getInt("INPUT_MODE_KEY");
        this.onRetainCustomNonConfigurationInstance = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.onUserLeaveHint = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.onPreparePanel = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.onCreate = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence2 = this.removeOnContextAvailableListener;
        if (charSequence2 != null) {
            int i6 = registerForActivityResult + 107;
            peekAvailableContext = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            Resources resources = requireContext().getResources();
            int i8 = this.removeMenuProvider;
            String string = resources.getString(i8);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                b(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i8);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    charSequence2 = spannableString;
                } else {
                    charSequence2 = string;
                }
            } else {
                charSequence2 = string;
            }
        }
        this.invalidateMenu = charSequence2;
        if (charSequence2 != null) {
            int i9 = peekAvailableContext + 107;
            registerForActivityResult = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                charSequenceArrSplit = TextUtils.split(String.valueOf(charSequence2), "\n");
                if (charSequenceArrSplit.length > 1) {
                    int i10 = registerForActivityResult + 11;
                    peekAvailableContext = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    charSequence = charSequenceArrSplit[0];
                } else {
                    charSequence = charSequence2;
                }
            } else {
                charSequenceArrSplit = TextUtils.split(String.valueOf(charSequence2), "\n");
                if (charSequenceArrSplit.length > 1) {
                    int i12 = registerForActivityResult + 11;
                    peekAvailableContext = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    charSequence = charSequenceArrSplit[0];
                } else {
                    charSequence = charSequence2;
                }
            }
        }
        this.onTrimMemory = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ed  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        String strIntern;
        int i2 = 2 % 2;
        final int i3 = 1;
        if (!this.onConfigurationChanged) {
            int i4 = peekAvailableContext + 39;
            registerForActivityResult = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = R.layout.mtrl_picker_dialog;
        } else {
            i = R.layout.mtrl_picker_fullscreen;
        }
        View viewInflate = layoutInflater.inflate(i, viewGroup);
        Context context = viewInflate.getContext();
        if (this.onConfigurationChanged) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(RemoteActionCompatParcelizer(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(RemoteActionCompatParcelizer(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.onMultiWindowModeChanged = textView;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        textView.setAccessibilityLiveRegion(1);
        this.onCreatePanelMenu = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.onNewIntent = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.onCreatePanelMenu.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.onCreatePanelMenu;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, IntPair.write(context, R.drawable.material_ic_calendar_black_24dp));
        final int i6 = 0;
        stateListDrawable.addState(new int[0], IntPair.write(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.onCreatePanelMenu.setChecked(this.onMenuItemSelected != 0);
        FocusPropertiesNode.write(this.onCreatePanelMenu, (AccessibilityDelegateCompat) null);
        IconCompatParcelizer(this.onCreatePanelMenu);
        this.onCreatePanelMenu.setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(5, this));
        this.onActivityResult = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (((SingleDateSelector) serializer()).IconCompatParcelizer != null) {
            int i7 = peekAvailableContext + 121;
            registerForActivityResult = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Button button = this.onActivityResult;
        if (z) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.onActivityResult.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence3 = this.onUserLeaveHint;
        if (charSequence3 != null) {
            this.onActivityResult.setText(charSequence3);
        } else {
            int i8 = this.onRetainCustomNonConfigurationInstance;
            if (i8 != 0) {
                Button button2 = this.onActivityResult;
                Context context2 = button2.getContext();
                String string = context2.getString(i8);
                if (!(!string.startsWith("%('"))) {
                    Object[] objArr = new Object[1];
                    b(string.substring(3), objArr);
                    String strIntern2 = ((String) objArr[0]).intern();
                    CharSequence text = context2.getText(i8);
                    if (text instanceof Spanned) {
                        charSequence = string;
                        SpannableString spannableString = new SpannableString(strIntern2);
                        TextUtils.copySpansFrom((SpannedString) text, 0, strIntern2.length(), Object.class, spannableString, 0);
                        int i9 = peekAvailableContext + 107;
                        registerForActivityResult = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        charSequence = spannableString;
                    } else {
                        charSequence = string;
                        int i11 = peekAvailableContext + 89;
                        registerForActivityResult = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        charSequence = strIntern2;
                    }
                }
                charSequence = string;
                button2.setText(charSequence);
            }
        }
        this.onActivityResult.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            public final /* synthetic */ MaterialDatePicker IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i6;
                MaterialDatePicker materialDatePicker = this.IconCompatParcelizer;
                if (i13 != 0) {
                    Iterator it = materialDatePicker.onPanelClosed.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    materialDatePicker.read(false, false);
                    return;
                }
                for (DataStoreUtils dataStoreUtils : materialDatePicker.onRequestPermissionsResult) {
                    dataStoreUtils.RemoteActionCompatParcelizer.invoke(((SingleDateSelector) materialDatePicker.serializer()).IconCompatParcelizer);
                }
                materialDatePicker.read(false, false);
            }
        });
        Button button3 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button3.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence4 = this.onCreate;
        if (charSequence4 != null) {
            int i13 = registerForActivityResult + 119;
            peekAvailableContext = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            button3.setText(charSequence4);
        } else {
            int i15 = this.onPreparePanel;
            if (i15 != 0) {
                Context context3 = button3.getContext();
                String string2 = context3.getString(i15);
                if (string2.startsWith("%('")) {
                    int i16 = peekAvailableContext + 13;
                    registerForActivityResult = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    Object[] objArr2 = new Object[1];
                    b(string2.substring(3), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    CharSequence text2 = context3.getText(i15);
                    if (text2 instanceof Spanned) {
                        charSequence2 = string2;
                        charSequence2 = strIntern;
                        SpannableString spannableString2 = new SpannableString(strIntern);
                        TextUtils.copySpansFrom((SpannedString) text2, 0, strIntern.length(), Object.class, spannableString2, 0);
                        charSequence2 = spannableString2;
                    }
                }
                charSequence2 = string2;
                charSequence2 = strIntern;
                charSequence2 = string2;
                button3.setText(charSequence2);
            }
        }
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            public final /* synthetic */ MaterialDatePicker IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i3;
                MaterialDatePicker materialDatePicker = this.IconCompatParcelizer;
                if (i18 != 0) {
                    Iterator it = materialDatePicker.onPanelClosed.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    materialDatePicker.read(false, false);
                    return;
                }
                for (DataStoreUtils dataStoreUtils : materialDatePicker.onRequestPermissionsResult) {
                    dataStoreUtils.RemoteActionCompatParcelizer.invoke(((SingleDateSelector) materialDatePicker.serializer()).IconCompatParcelizer);
                }
                materialDatePicker.read(false, false);
            }
        });
        return viewInflate;
    }
}
