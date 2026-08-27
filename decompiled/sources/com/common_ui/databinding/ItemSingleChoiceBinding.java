package com.common_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuversList;
import o.accessgetPositiveInfinitycp;
import o.drawWithRotationAndOffsetubNVwUQ;
import o.getDefaultJoinLxFBmk8;
import o.getImmutablePendingIntentFlags;
import o.getOnLoggedCallbackannotations;
import o.getSUPPRESSannotations;
import o.updateLayerElements;
import o.z7ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ItemSingleChoiceBinding implements accessgetPositiveInfinitycp {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final ViewGroup RemoteActionCompatParcelizer;
    public final View read;
    public final Object serializer;
    public final Object write;

    public ItemSingleChoiceBinding(drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq, TextView textView, TextView textView2, TextView textView3) {
        this.IconCompatParcelizer = 4;
        this.RemoteActionCompatParcelizer = drawwithrotationandoffsetubnvwuq;
        this.serializer = textView;
        this.write = textView2;
        this.read = textView3;
    }

    public /* synthetic */ ItemSingleChoiceBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = view;
        this.serializer = view2;
        this.write = view3;
    }

    public ItemSingleChoiceBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8, z7ExternalSyntheticLambda0 z7externalsyntheticlambda0) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = frameLayout;
        this.serializer = getdefaultjoinlxfbmk8;
        this.read = imageView;
        this.write = z7externalsyntheticlambda0;
    }

    public ItemSingleChoiceBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, MapboxManeuversList mapboxManeuversList) {
        this.IconCompatParcelizer = 3;
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = constraintLayout2;
        this.serializer = constraintLayout3;
        this.write = mapboxManeuversList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[PHI: r3
  0x0022: PHI (r3v16 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[PHI: r3
  0x002c: PHI (r3v14 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[PHI: r3
  0x002f: PHI (r3v12 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[PHI: r3
  0x0032: PHI (r3v10 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[PHI: r3
  0x0035: PHI (r3v8 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[PHI: r3
  0x0038: PHI (r3v6 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x003b A[PHI: r3
  0x003b: PHI (r3v4 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x003e A[PHI: r3
  0x003e: PHI (r3v2 android.view.ViewGroup) = (r3v1 android.view.ViewGroup), (r3v18 android.view.ViewGroup) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 109;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = this.IconCompatParcelizer;
            viewGroup = this.RemoteActionCompatParcelizer;
            switch (i4) {
                case 0:
                    return (ConstraintLayout) viewGroup;
                case 1:
                    return (getOnLoggedCallbackannotations) viewGroup;
                case 2:
                    return (FrameLayout) viewGroup;
                case 3:
                    return (ConstraintLayout) viewGroup;
                case 4:
                    return (drawWithRotationAndOffsetubNVwUQ) viewGroup;
                case 5:
                    return (ConstraintLayout) viewGroup;
                case 6:
                    updateLayerElements updatelayerelements = (updateLayerElements) viewGroup;
                    int i5 = i2 + 5;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return updatelayerelements;
                default:
                    return (ConstraintLayout) viewGroup;
            }
        }
        int i7 = this.IconCompatParcelizer;
        viewGroup = this.RemoteActionCompatParcelizer;
        int i8 = 34 / 0;
        switch (i7) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (getOnLoggedCallbackannotations) viewGroup;
            case 2:
                return (FrameLayout) viewGroup;
            case 3:
                return (ConstraintLayout) viewGroup;
            case 4:
                return (drawWithRotationAndOffsetubNVwUQ) viewGroup;
            case 5:
                return (ConstraintLayout) viewGroup;
            case 6:
                updateLayerElements updatelayerelements2 = (updateLayerElements) viewGroup;
                int i9 = i2 + 5;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return updatelayerelements2;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public ConstraintLayout serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 41;
        RatingCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.RemoteActionCompatParcelizer;
        int i4 = i2 + 71;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r11
  0x002e: PHI (r11v2 android.view.View) = (r11v1 android.view.View), (r11v9 android.view.View) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static ItemSingleChoiceBinding read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate;
        getSUPPRESSannotations getsuppressannotations;
        Button button;
        getImmutablePendingIntentFlags getimmutablependingintentflags;
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = R.id.noticeDescription;
        if (i3 == 0) {
            viewInflate = layoutInflater.inflate(R.layout.fragment_request_break, viewGroup, false);
            if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.noticeDescription, viewInflate)) != null) {
                i4 = R.id.noticeTitle;
                if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.noticeTitle, viewInflate)) != null) {
                    i4 = R.id.selectDurationDropDown;
                    getsuppressannotations = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.selectDurationDropDown, viewInflate);
                    if (getsuppressannotations != null) {
                        i4 = R.id.selectDurationTitle;
                        if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.selectDurationTitle, viewInflate)) != null) {
                            i4 = R.id.sendRequestButton;
                            button = (Button) ExtrasKt.RemoteActionCompatParcelizer(R.id.sendRequestButton, viewInflate);
                            if (button != null) {
                                i4 = R.id.toolbar;
                                getimmutablependingintentflags = (getImmutablePendingIntentFlags) ExtrasKt.RemoteActionCompatParcelizer(R.id.toolbar, viewInflate);
                                if (getimmutablependingintentflags != null) {
                                    ItemSingleChoiceBinding itemSingleChoiceBinding = new ItemSingleChoiceBinding((ConstraintLayout) viewInflate, getsuppressannotations, button, getimmutablependingintentflags, 7);
                                    int i5 = RatingCompat + 47;
                                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                                    int i6 = i5 % 2;
                                    return itemSingleChoiceBinding;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.fragment_request_break, viewGroup, false);
            if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.noticeDescription, viewInflate)) != null) {
                i4 = R.id.noticeTitle;
                if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.noticeTitle, viewInflate)) != null) {
                    i4 = R.id.selectDurationDropDown;
                    getsuppressannotations = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.selectDurationDropDown, viewInflate);
                    if (getsuppressannotations != null) {
                        i4 = R.id.selectDurationTitle;
                        if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.selectDurationTitle, viewInflate)) != null) {
                            i4 = R.id.sendRequestButton;
                            button = (Button) ExtrasKt.RemoteActionCompatParcelizer(R.id.sendRequestButton, viewInflate);
                            if (button != null) {
                                i4 = R.id.toolbar;
                                getimmutablependingintentflags = (getImmutablePendingIntentFlags) ExtrasKt.RemoteActionCompatParcelizer(R.id.toolbar, viewInflate);
                                if (getimmutablependingintentflags != null) {
                                    ItemSingleChoiceBinding itemSingleChoiceBinding2 = new ItemSingleChoiceBinding((ConstraintLayout) viewInflate, getsuppressannotations, button, getimmutablependingintentflags, 7);
                                    int i7 = RatingCompat + 47;
                                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                                    int i8 = i7 % 2;
                                    return itemSingleChoiceBinding2;
                                }
                            }
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        return null;
    }
}
