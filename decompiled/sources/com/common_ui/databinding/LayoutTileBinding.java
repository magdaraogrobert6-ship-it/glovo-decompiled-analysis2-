package com.common_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxPrimaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxSecondaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxStepDistance;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxTurnIconManeuver;
import com.ui.common.widget.calendar.CalendarView;
import o.AsyncImagePainterKt;
import o.AsyncImagePainterStateLoading;
import o.IntentUtils;
import o.SimpleInnerShadowElement;
import o.WindowCallbackWrapper;
import o.accessgetPositiveInfinitycp;
import o.accessgetReuseDeactivationViaHostcp;
import o.createDatedefault;
import o.createHandler;
import o.divUQTWf7w;
import o.getDefaultJoinLxFBmk8;
import o.getImmutablePendingIntentFlags;
import o.getNetworkTimeClockannotations;
import o.getSUPPRESSannotations;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutTileBinding implements accessgetPositiveInfinitycp {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final View MediaDescriptionCompat;
    public final View RemoteActionCompatParcelizer;
    public final Object read;
    public final View serializer;
    public final View write;

    public LayoutTileBinding(createHandler createhandler, getSUPPRESSannotations getsuppressannotations, TextView textView, ImageView imageView, TextView textView2) {
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = createhandler;
        this.RemoteActionCompatParcelizer = getsuppressannotations;
        this.read = textView;
        this.write = imageView;
        this.serializer = textView2;
    }

    public /* synthetic */ LayoutTileBinding(View view, View view2, View view3, View view4, View view5, int i) {
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = view;
        this.RemoteActionCompatParcelizer = view2;
        this.read = view3;
        this.serializer = view4;
        this.write = view5;
    }

    public LayoutTileBinding(getNetworkTimeClockannotations getnetworktimeclockannotations, TextView textView, ImageView imageView, createDatedefault createdatedefault, TextView textView2) {
        this.IconCompatParcelizer = 3;
        this.MediaDescriptionCompat = getnetworktimeclockannotations;
        this.read = textView;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = createdatedefault;
        this.serializer = textView2;
    }

    public LayoutTileBinding(ConstraintLayout constraintLayout, ComposeView composeView, getSUPPRESSannotations getsuppressannotations, getSUPPRESSannotations getsuppressannotations2, TextView textView) {
        this.IconCompatParcelizer = 6;
        this.MediaDescriptionCompat = constraintLayout;
        this.serializer = composeView;
        this.RemoteActionCompatParcelizer = getsuppressannotations;
        this.write = getsuppressannotations2;
        this.read = textView;
    }

    public LayoutTileBinding(ConstraintLayout constraintLayout, accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp2, FrameLayout frameLayout) {
        this.IconCompatParcelizer = 4;
        this.MediaDescriptionCompat = constraintLayout;
        this.RemoteActionCompatParcelizer = accessgetreusedeactivationviahostcp;
        this.read = appCompatImageView2;
        this.serializer = accessgetreusedeactivationviahostcp2;
        this.write = frameLayout;
    }

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 25;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        View view = this.MediaDescriptionCompat;
        switch (i5) {
            case 0:
                createHandler createhandler = (createHandler) view;
                int i6 = i3 + 113;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createhandler;
            case 1:
                return (CalendarView) view;
            case 2:
                return (createDatedefault) view;
            case 3:
                return (getNetworkTimeClockannotations) view;
            case 4:
                return (ConstraintLayout) view;
            case 5:
                return view;
            case 6:
                return (ConstraintLayout) view;
            case 7:
                return (LinearLayout) view;
            default:
                return (ConstraintLayout) view;
        }
    }

    public ConstraintLayout serializer() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        if (i2 == 4) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.MediaDescriptionCompat;
            int i3 = MediaMetadataCompat + 69;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return constraintLayout;
        }
        if (i2 != 6) {
            return (ConstraintLayout) this.MediaDescriptionCompat;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.MediaDescriptionCompat;
        int i5 = MediaMetadataCompat + 35;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return constraintLayout2;
    }

    public LinearLayout write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) this.MediaDescriptionCompat;
        if (i3 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public LayoutTileBinding(LinearLayout linearLayout, getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8, AsyncImagePainterStateLoading asyncImagePainterStateLoading, getSUPPRESSannotations getsuppressannotations, AsyncImagePainterKt asyncImagePainterKt) {
        this.IconCompatParcelizer = 7;
        this.MediaDescriptionCompat = linearLayout;
        this.read = getdefaultjoinlxfbmk8;
        this.serializer = asyncImagePainterStateLoading;
        this.RemoteActionCompatParcelizer = getsuppressannotations;
        this.write = asyncImagePainterKt;
    }

    public LayoutTileBinding(createDatedefault createdatedefault, getSUPPRESSannotations getsuppressannotations, WindowCallbackWrapper windowCallbackWrapper, IntentUtils intentUtils, TextView textView) {
        this.IconCompatParcelizer = 2;
        this.MediaDescriptionCompat = createdatedefault;
        this.RemoteActionCompatParcelizer = getsuppressannotations;
        this.serializer = windowCallbackWrapper;
        this.write = intentUtils;
        this.read = textView;
    }

    public static LayoutTileBinding read(View view) {
        int i = 2 % 2;
        int i2 = R.id.errorScreen;
        ComposeView composeView = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.errorScreen, view);
        if (composeView != null) {
            i2 = R.id.progressBar;
            divUQTWf7w divuqtwf7w = (divUQTWf7w) ExtrasKt.RemoteActionCompatParcelizer(R.id.progressBar, view);
            if (divuqtwf7w != null) {
                int i3 = MediaMetadataCompat + 5;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                i2 = R.id.toolbar;
                getImmutablePendingIntentFlags getimmutablependingintentflags = (getImmutablePendingIntentFlags) ExtrasKt.RemoteActionCompatParcelizer(R.id.toolbar, view);
                if (getimmutablependingintentflags != null) {
                    i2 = R.id.webView;
                    WebView webView = (WebView) ExtrasKt.RemoteActionCompatParcelizer(R.id.webView, view);
                    if (webView != null) {
                        LayoutTileBinding layoutTileBinding = new LayoutTileBinding((ConstraintLayout) view, composeView, divuqtwf7w, getimmutablependingintentflags, webView, 8);
                        int i5 = MediaMetadataCompat + 7;
                        RatingCompat = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        return layoutTileBinding;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
        return null;
    }

    public static LayoutTileBinding bind(ConstraintLayout constraintLayout) {
        int i = 2 % 2;
        int i2 = R.id.mainManeuverGuideline;
        if (((SimpleInnerShadowElement) ExtrasKt.RemoteActionCompatParcelizer(R.id.mainManeuverGuideline, constraintLayout)) != null) {
            i2 = R.id.maneuverIcon;
            MapboxTurnIconManeuver mapboxTurnIconManeuver = (MapboxTurnIconManeuver) ExtrasKt.RemoteActionCompatParcelizer(R.id.maneuverIcon, constraintLayout);
            if (mapboxTurnIconManeuver != null) {
                int i3 = MediaMetadataCompat + 95;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                i2 = R.id.primaryManeuverText;
                MapboxPrimaryManeuver mapboxPrimaryManeuver = (MapboxPrimaryManeuver) ExtrasKt.RemoteActionCompatParcelizer(R.id.primaryManeuverText, constraintLayout);
                if (mapboxPrimaryManeuver != null) {
                    i2 = R.id.secondaryManeuverText;
                    MapboxSecondaryManeuver mapboxSecondaryManeuver = (MapboxSecondaryManeuver) ExtrasKt.RemoteActionCompatParcelizer(R.id.secondaryManeuverText, constraintLayout);
                    if (mapboxSecondaryManeuver != null) {
                        i2 = R.id.stepDistance;
                        MapboxStepDistance mapboxStepDistance = (MapboxStepDistance) ExtrasKt.RemoteActionCompatParcelizer(R.id.stepDistance, constraintLayout);
                        if (mapboxStepDistance != null) {
                            return new LayoutTileBinding(constraintLayout, mapboxTurnIconManeuver, mapboxPrimaryManeuver, mapboxSecondaryManeuver, mapboxStepDistance, 5);
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i2)));
        int i5 = MediaMetadataCompat + 35;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static LayoutTileBinding IconCompatParcelizer(View view) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = R.id.acceptRateProgress;
        Object obj = null;
        if (i3 == 0) {
            throw null;
        }
        ComposeView composeView = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.acceptRateProgress, view);
        if (composeView != null) {
            int i5 = MediaMetadataCompat + 45;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i4 = R.id.buttonAccept;
            getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.buttonAccept, view);
            if (getsuppressannotations != null) {
                i4 = R.id.buttonDecline;
                getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.buttonDecline, view);
                if (getsuppressannotations2 != null) {
                    int i7 = MediaMetadataCompat + 39;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i4 = R.id.icSheetHandle;
                    if (((ImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.icSheetHandle, view)) != null) {
                        int i9 = RatingCompat + 71;
                        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        i4 = R.id.tvHeadingText;
                        if (i10 == 0) {
                            throw null;
                        }
                        TextView textView = (TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.tvHeadingText, view);
                        if (textView != null) {
                            LayoutTileBinding layoutTileBinding = new LayoutTileBinding((ConstraintLayout) view, composeView, getsuppressannotations, getsuppressannotations2, textView);
                            int i11 = RatingCompat + 87;
                            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 != 0) {
                                return layoutTileBinding;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[PHI: r4
  0x0088: PHI (r4v3 int) = (r4v2 int), (r4v8 int), (r4v8 int) binds: [B:7:0x002d, B:18:0x0070, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public static LayoutTileBinding write(LayoutInflater layoutInflater) {
        FrameLayout frameLayout;
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.view_map_pin, (ViewGroup) null, false);
        int i2 = R.id.bubbleView;
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) ExtrasKt.RemoteActionCompatParcelizer(R.id.bubbleView, viewInflate);
        if (accessgetreusedeactivationviahostcp != null) {
            int i3 = MediaMetadataCompat + 117;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = R.id.imageViewBadge;
            if (i4 == 0) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewBadge, viewInflate);
                if (appCompatImageView != null) {
                    i2 = R.id.imageViewPin;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewPin, viewInflate);
                    if (appCompatImageView2 != null) {
                        int i6 = RatingCompat + 99;
                        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        i2 = R.id.pinPoint;
                        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp2 = (accessgetReuseDeactivationViaHostcp) ExtrasKt.RemoteActionCompatParcelizer(R.id.pinPoint, viewInflate);
                        if (accessgetreusedeactivationviahostcp2 != null) {
                            int i8 = RatingCompat + 97;
                            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            i5 = R.id.pinString;
                            if (i9 != 0) {
                                if (((AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.pinString, viewInflate)) != null) {
                                    i2 = R.id.viewBadge;
                                    frameLayout = (FrameLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.viewBadge, viewInflate);
                                    if (frameLayout != null) {
                                        return new LayoutTileBinding((ConstraintLayout) viewInflate, accessgetreusedeactivationviahostcp, appCompatImageView, appCompatImageView2, accessgetreusedeactivationviahostcp2, frameLayout);
                                    }
                                } else {
                                    i2 = i5;
                                }
                            } else {
                                int i10 = 64 / 0;
                                if (((AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.pinString, viewInflate)) != null) {
                                    i2 = R.id.viewBadge;
                                    frameLayout = (FrameLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.viewBadge, viewInflate);
                                    if (frameLayout != null) {
                                        return new LayoutTileBinding((ConstraintLayout) viewInflate, accessgetreusedeactivationviahostcp, appCompatImageView, appCompatImageView2, accessgetreusedeactivationviahostcp2, frameLayout);
                                    }
                                } else {
                                    i2 = i5;
                                }
                            }
                        }
                    }
                } else {
                    i2 = i5;
                }
            } else {
                throw null;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        int i11 = RatingCompat + 27;
        MediaMetadataCompat = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return null;
    }

    public static LayoutTileBinding read(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_order_details, (ViewGroup) null, false);
        int i2 = R.id.history_order_details_header;
        View viewRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_header, viewInflate);
        if (viewRemoteActionCompatParcelizer != null) {
            int i3 = RatingCompat + 91;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8Serializer = getDefaultJoinLxFBmk8.serializer(viewRemoteActionCompatParcelizer);
            i2 = R.id.history_order_details_header_container;
            if (((FrameLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_header_container, viewInflate)) != null) {
                i2 = R.id.history_order_details_journey;
                AsyncImagePainterStateLoading asyncImagePainterStateLoading = (AsyncImagePainterStateLoading) ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_journey, viewInflate);
                if (asyncImagePainterStateLoading != null) {
                    i2 = R.id.history_order_details_order_details_section_action;
                    getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_order_details_section_action, viewInflate);
                    if (getsuppressannotations != null) {
                        i2 = R.id.history_order_details_order_details_section_title;
                        if (((TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_order_details_section_title, viewInflate)) != null) {
                            int i5 = RatingCompat + 25;
                            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            i2 = R.id.history_order_details_order_items;
                            AsyncImagePainterKt asyncImagePainterKt = (AsyncImagePainterKt) ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_order_items, viewInflate);
                            if (asyncImagePainterKt != null) {
                                i2 = R.id.history_order_details_section_divider;
                                if (ExtrasKt.RemoteActionCompatParcelizer(R.id.history_order_details_section_divider, viewInflate) != null) {
                                    LayoutTileBinding layoutTileBinding = new LayoutTileBinding((LinearLayout) viewInflate, getdefaultjoinlxfbmk8Serializer, asyncImagePainterStateLoading, getsuppressannotations, asyncImagePainterKt);
                                    int i7 = MediaMetadataCompat + 39;
                                    RatingCompat = i7 % Fields.SpotShadowColor;
                                    if (i7 % 2 != 0) {
                                        int i8 = 17 / 0;
                                    }
                                    return layoutTileBinding;
                                }
                            }
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        int i9 = MediaMetadataCompat + 123;
        RatingCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return null;
    }
}
