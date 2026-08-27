package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.transition.Transition$3;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class removeIf extends updateModifier {
    public android.view.accessibility.AccessibilityManager IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public ValueAnimator MediaSessionCompatQueueItem;
    public final ThrottledButton$$ExternalSyntheticLambda0 MediaSessionCompatResultReceiverWrapper;
    public final DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 MediaSessionCompatToken;
    public final DateSelector$$ExternalSyntheticLambda0 PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public ValueAnimator RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final TimeInterpolator read;
    public AutoCompleteTextView serializer;
    public final int write;

    @Override // o.updateModifier
    public final DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 MediaBrowserCompatMediaItem() {
        return this.MediaSessionCompatToken;
    }

    @Override // o.updateModifier
    public final boolean MediaMetadataCompat() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.updateModifier
    public final int RemoteActionCompatParcelizer() {
        return com.logistics.rider.glovo.R.drawable.mtrl_dropdown_arrow;
    }

    @Override // o.updateModifier
    public final View.OnFocusChangeListener read() {
        return this.PlaybackStateCompat;
    }

    @Override // o.updateModifier
    public final View.OnClickListener serializer() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.updateModifier
    public final void setUp() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.read;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.RemoteActionCompatParcelizer);
        int i = 5;
        valueAnimatorOfFloat.addUpdateListener(new TileMode(i, this));
        this.RatingCompat = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.write);
        valueAnimatorOfFloat2.addUpdateListener(new TileMode(i, this));
        this.MediaSessionCompatQueueItem = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new Transition$3(8, this));
        this.IconCompatParcelizer = (android.view.accessibility.AccessibilityManager) this.ParcelableVolumeInfo.getSystemService("accessibility");
    }

    @Override // o.updateModifier
    public final int write() {
        return com.logistics.rider.glovo.R.string.exposed_dropdown_menu_content_description;
    }

    @Override // o.updateModifier
    public final boolean write(int i) {
        return i != 0;
    }

    @Override // o.updateModifier
    public final void afterEditTextChanged() {
        if (this.IconCompatParcelizer.isTouchExplorationEnabled() && this.serializer.getInputType() != 0 && !this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.hasFocus()) {
            this.serializer.dismissDropDown();
        }
        this.serializer.post(new RxWorker$1$$ExternalSyntheticLambda0(16, this));
    }

    @Override // o.updateModifier
    public final void read(AccessibilityEvent accessibilityEvent) {
        if (this.IconCompatParcelizer.isEnabled() && this.serializer.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.PlaybackStateCompatCustomAction && !this.serializer.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                MediaSessionCompatQueueItem();
                this.MediaDescriptionCompat = true;
                this.MediaMetadataCompat = System.currentTimeMillis();
            }
        }
    }

    @Override // o.updateModifier
    public final void serializer(FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        if (this.serializer.getInputType() == 0) {
            focusRestorerKtsaveFocusedChild11.read(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    public final void serializer(boolean z) {
        if (this.PlaybackStateCompatCustomAction != z) {
            this.PlaybackStateCompatCustomAction = z;
            this.RatingCompat.cancel();
            this.MediaSessionCompatQueueItem.start();
        }
    }

    public final void MediaSessionCompatQueueItem() {
        if (this.serializer == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.MediaMetadataCompat;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.MediaDescriptionCompat = false;
        }
        if (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = false;
            return;
        }
        serializer(!this.PlaybackStateCompatCustomAction);
        boolean z = this.PlaybackStateCompatCustomAction;
        AutoCompleteTextView autoCompleteTextView = this.serializer;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.serializer.showDropDown();
        }
    }

    @Override // o.updateModifier
    public final void RatingCompat() {
        AutoCompleteTextView autoCompleteTextView = this.serializer;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.serializer.setOnDismissListener(null);
        }
    }

    @Override // o.updateModifier
    public final void write(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.serializer = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o.retainAll
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    removeIf removeif = this.IconCompatParcelizer;
                    long j = jCurrentTimeMillis - removeif.MediaMetadataCompat;
                    if (j < 0 || j > 300) {
                        removeif.MediaDescriptionCompat = false;
                    }
                    removeif.MediaSessionCompatQueueItem();
                    removeif.MediaDescriptionCompat = true;
                    removeif.MediaMetadataCompat = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.serializer.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.toArray
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                removeIf removeif = this.write;
                removeif.MediaDescriptionCompat = true;
                removeif.MediaMetadataCompat = System.currentTimeMillis();
                removeif.serializer(false);
            }
        });
        this.serializer.setThreshold(0);
        TextInputLayout textInputLayout = this.ResultReceiver;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.IconCompatParcelizer.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    public removeIf(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.MediaSessionCompatResultReceiverWrapper = new ThrottledButton$$ExternalSyntheticLambda0(7, this);
        this.PlaybackStateCompat = new DateSelector$$ExternalSyntheticLambda0(2, this);
        this.MediaSessionCompatToken = new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(0, this);
        this.MediaMetadataCompat = Long.MAX_VALUE;
        this.RemoteActionCompatParcelizer = SentryUUID.write(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort3, 67);
        this.write = SentryUUID.write(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort3, 50);
        this.read = SentryUUID.IconCompatParcelizer(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionEasingLinearInterpolator, handleMotionFrameOfReferencePlacement.write);
    }
}
