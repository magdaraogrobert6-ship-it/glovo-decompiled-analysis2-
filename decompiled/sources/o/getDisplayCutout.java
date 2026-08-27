package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDisplayCutout extends androidx.constraintlayout.widget.ConstraintLayout {
    public final SubcomposeSlotReusePolicy _init_lambda2;
    public final RxWorker$1$$ExternalSyntheticLambda0 _init_lambda3;
    public int _init_lambda4;

    public abstract void serializer();

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this._init_lambda2.MediaBrowserCompatMediaItem(ColorStateList.valueOf(i));
    }

    public getDisplayCutout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.material_radial_view_group, this);
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy();
        this._init_lambda2 = subcomposeSlotReusePolicy;
        SubcomposeLayoutKtReusedSlotId1 subcomposeLayoutKtReusedSlotId1 = new SubcomposeLayoutKtReusedSlotId1(0.5f);
        I$b i$bWrite = subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat.write();
        i$bWrite.RemoteActionCompatParcelizer = subcomposeLayoutKtReusedSlotId1;
        i$bWrite.MediaDescriptionCompat = subcomposeLayoutKtReusedSlotId1;
        i$bWrite.RatingCompat = subcomposeLayoutKtReusedSlotId1;
        i$bWrite.MediaMetadataCompat = subcomposeLayoutKtReusedSlotId1;
        subcomposeSlotReusePolicy.setShapeAppearanceModel(i$bWrite.IconCompatParcelizer());
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(ColorStateList.valueOf(-1));
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setBackground(subcomposeSlotReusePolicy);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.RadialViewGroup, com.logistics.rider.glovo.R.attr.materialClockStyle, 0);
        this._init_lambda4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this._init_lambda3 = new RxWorker$1$$ExternalSyntheticLambda0(17, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = this._init_lambda3;
            handler.removeCallbacks(rxWorker$1$$ExternalSyntheticLambda0);
            handler.post(rxWorker$1$$ExternalSyntheticLambda0);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        serializer();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = this._init_lambda3;
            handler.removeCallbacks(rxWorker$1$$ExternalSyntheticLambda0);
            handler.post(rxWorker$1$$ExternalSyntheticLambda0);
        }
    }
}
