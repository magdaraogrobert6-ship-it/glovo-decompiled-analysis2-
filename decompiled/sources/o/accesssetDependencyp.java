package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.github.gcacace.signaturepad.views.SignaturePad;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetDependencyp implements accessgetPositiveInfinitycp {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final View IconCompatParcelizer;
    public final View MediaBrowserCompatMediaItem;
    public final View MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final View read;
    public final TextView serializer;
    public final View write;

    public accesssetDependencyp(LinearLayout linearLayout, getSUPPRESSannotations getsuppressannotations, getSUPPRESSannotations getsuppressannotations2, TextView textView, SignaturePad signaturePad, getImmutablePendingIntentFlags getimmutablependingintentflags) {
        this.RemoteActionCompatParcelizer = 2;
        this.read = linearLayout;
        this.MediaSessionCompatQueueItem = getsuppressannotations;
        this.serializer = getsuppressannotations2;
        this.IconCompatParcelizer = textView;
        this.write = signaturePad;
        this.MediaBrowserCompatMediaItem = getimmutablependingintentflags;
    }

    public /* synthetic */ accesssetDependencyp(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, TextView textView, View view, View view2, View view3, View view4, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = constraintLayout;
        this.serializer = textView;
        this.read = view;
        this.IconCompatParcelizer = view2;
        this.write = view3;
        this.MediaBrowserCompatMediaItem = view4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return (android.widget.LinearLayout) r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r2 = (androidx.constraintlayout.widget.ConstraintLayout) r5.MediaSessionCompatQueueItem;
        r1 = r1 + 113;
        o.accesssetDependencyp.MediaMetadataCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 != 1) goto L11;
     */
    @Override // o.accessgetPositiveInfinitycp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getRoot() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accesssetDependencyp.RatingCompat
            int r2 = r1 + 71
            int r3 = r2 % 128
            o.accesssetDependencyp.MediaMetadataCompat = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 == 0) goto L1a
            int r2 = r5.RemoteActionCompatParcelizer
            r4 = 17
            int r4 = r4 / 0
            if (r2 == 0) goto L31
            if (r2 == r3) goto L25
            goto L20
        L1a:
            int r2 = r5.RemoteActionCompatParcelizer
            if (r2 == 0) goto L31
            if (r2 == r3) goto L25
        L20:
            android.view.View r0 = r5.read
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            return r0
        L25:
            android.view.View r2 = r5.MediaSessionCompatQueueItem
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r1 = r1 + 113
            int r3 = r1 % 128
            o.accesssetDependencyp.MediaMetadataCompat = r3
            int r1 = r1 % r0
            return r2
        L31:
            android.view.View r2 = r5.MediaSessionCompatQueueItem
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r1 = r1 + 111
            int r3 = r1 % 128
            o.accesssetDependencyp.MediaMetadataCompat = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L3f
            return r2
        L3f:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetDependencyp.getRoot():android.view.View");
    }

    public androidx.constraintlayout.widget.ConstraintLayout read() {
        int i = 2 % 2;
        if (this.RemoteActionCompatParcelizer != 0) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) this.MediaSessionCompatQueueItem;
            int i2 = RatingCompat + 95;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return constraintLayout;
            }
            throw null;
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) this.MediaSessionCompatQueueItem;
        int i3 = MediaMetadataCompat + 13;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return constraintLayout2;
        }
        throw null;
    }

    public LinearLayout RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 55;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        LinearLayout linearLayout = (LinearLayout) this.read;
        int i5 = i2 + 125;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[PHI: r1
  0x0032: PHI (r1v10 o.getSUPPRESSannotations) = (r1v9 o.getSUPPRESSannotations), (r1v23 o.getSUPPRESSannotations) binds: [B:10:0x0030, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062 A[PHI: r1
  0x0062: PHI (r1v17 android.widget.TextView) = (r1v16 android.widget.TextView), (r1v20 android.widget.TextView) binds: [B:19:0x0060, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    public static accesssetDependencyp serializer(View view) {
        getSUPPRESSannotations getsuppressannotations;
        getSUPPRESSannotations getsuppressannotations2;
        getSUPPRESSannotations getsuppressannotations3;
        int i;
        TextView textView;
        TextView textView2;
        TextView textView3;
        int i2 = 2 % 2;
        int i3 = com.logistics.rider.glovo.R.id.buttonAccept;
        getSUPPRESSannotations getsuppressannotations4 = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonAccept, view);
        if (getsuppressannotations4 != null) {
            int i4 = MediaMetadataCompat + 81;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = com.logistics.rider.glovo.R.id.buttonCancel;
            if (i5 == 0) {
                getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonCancel, view);
                int i7 = 74 / 0;
                if (getsuppressannotations != null) {
                    getsuppressannotations2 = getsuppressannotations;
                    i3 = com.logistics.rider.glovo.R.id.buttonConfirm;
                    getsuppressannotations3 = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonConfirm, view);
                    if (getsuppressannotations3 != null) {
                        int i8 = MediaMetadataCompat + 87;
                        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        i = i8 % 2;
                        i6 = com.logistics.rider.glovo.R.id.tvHeadingText;
                        if (i == 0) {
                            textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvHeadingText, view);
                            int i9 = 54 / 0;
                            if (textView != null) {
                                textView2 = textView;
                                i3 = com.logistics.rider.glovo.R.id.tvMessage;
                                textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvMessage, view);
                                if (textView3 != null) {
                                    return new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) view, getsuppressannotations4, getsuppressannotations2, getsuppressannotations3, textView2, textView3, 1);
                                }
                            }
                        } else {
                            textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvHeadingText, view);
                            if (textView != null) {
                                textView2 = textView;
                                i3 = com.logistics.rider.glovo.R.id.tvMessage;
                                textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvMessage, view);
                                if (textView3 != null) {
                                    return new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) view, getsuppressannotations4, getsuppressannotations2, getsuppressannotations3, textView2, textView3, 1);
                                }
                            }
                        }
                    }
                }
            } else {
                getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonCancel, view);
                if (getsuppressannotations != null) {
                    getsuppressannotations2 = getsuppressannotations;
                    i3 = com.logistics.rider.glovo.R.id.buttonConfirm;
                    getsuppressannotations3 = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonConfirm, view);
                    if (getsuppressannotations3 != null) {
                        int i10 = MediaMetadataCompat + 87;
                        RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        i = i10 % 2;
                        i6 = com.logistics.rider.glovo.R.id.tvHeadingText;
                        if (i == 0) {
                            textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvHeadingText, view);
                            int i11 = 54 / 0;
                            if (textView != null) {
                                textView2 = textView;
                                i3 = com.logistics.rider.glovo.R.id.tvMessage;
                                textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvMessage, view);
                                if (textView3 != null) {
                                    return new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) view, getsuppressannotations4, getsuppressannotations2, getsuppressannotations3, textView2, textView3, 1);
                                }
                            }
                        } else {
                            textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvHeadingText, view);
                            if (textView != null) {
                                textView2 = textView;
                                i3 = com.logistics.rider.glovo.R.id.tvMessage;
                                textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvMessage, view);
                                if (textView3 != null) {
                                    return new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) view, getsuppressannotations4, getsuppressannotations2, getsuppressannotations3, textView2, textView3, 1);
                                }
                            }
                        }
                    }
                }
            }
            i3 = i6;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        int i12 = RatingCompat + 59;
        MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    public static accesssetDependencyp read(LayoutInflater layoutInflater) {
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp;
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp2;
        androidx.appcompat.widget.AppCompatImageView appCompatImageView;
        accesssetDependencyp accesssetdependencyp;
        int i;
        int i2 = 2 % 2;
        View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.view_map_ring_icon_v3_pin, (ViewGroup) null, false);
        int i3 = com.logistics.rider.glovo.R.id.badgeCountText;
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.badgeCountText, viewInflate);
        if (appCompatTextView != null) {
            int i4 = RatingCompat + 55;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i3 = com.logistics.rider.glovo.R.id.bubble;
            LinearLayout linearLayout = (LinearLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.bubble, viewInflate);
            if (linearLayout != null) {
                int i6 = MediaMetadataCompat + 13;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 19 / 0;
                    if (((dropShadow) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.bubbleBottomBarrier, viewInflate)) != null) {
                        i3 = com.logistics.rider.glovo.R.id.icon;
                        accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.icon, viewInflate);
                        if (accessgetreusedeactivationviahostcp != null) {
                            i3 = com.logistics.rider.glovo.R.id.pinPoint;
                            accessgetreusedeactivationviahostcp2 = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinPoint, viewInflate);
                            if (accessgetreusedeactivationviahostcp2 != null) {
                                int i8 = RatingCompat + 71;
                                MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i9 = i8 % 2;
                                i3 = com.logistics.rider.glovo.R.id.pinString;
                                appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinString, viewInflate);
                                if (appCompatImageView != null) {
                                    accesssetdependencyp = new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) viewInflate, appCompatTextView, linearLayout, accessgetreusedeactivationviahostcp, accessgetreusedeactivationviahostcp2, appCompatImageView, 0);
                                    i = RatingCompat + 29;
                                    MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i % 2 == 0) {
                                        return accesssetdependencyp;
                                    }
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i3 = com.logistics.rider.glovo.R.id.bubbleBottomBarrier;
                    }
                } else if (((dropShadow) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.bubbleBottomBarrier, viewInflate)) != null) {
                    i3 = com.logistics.rider.glovo.R.id.icon;
                    accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.icon, viewInflate);
                    if (accessgetreusedeactivationviahostcp != null) {
                        i3 = com.logistics.rider.glovo.R.id.pinPoint;
                        accessgetreusedeactivationviahostcp2 = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinPoint, viewInflate);
                        if (accessgetreusedeactivationviahostcp2 != null) {
                            int i10 = RatingCompat + 71;
                            MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            i3 = com.logistics.rider.glovo.R.id.pinString;
                            appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinString, viewInflate);
                            if (appCompatImageView != null) {
                                accesssetdependencyp = new accesssetDependencyp((androidx.constraintlayout.widget.ConstraintLayout) viewInflate, appCompatTextView, linearLayout, accessgetreusedeactivationviahostcp, accessgetreusedeactivationviahostcp2, appCompatImageView, 0);
                                i = RatingCompat + 29;
                                MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i % 2 == 0) {
                                    return accesssetdependencyp;
                                }
                                throw null;
                            }
                        }
                    }
                } else {
                    i3 = com.logistics.rider.glovo.R.id.bubbleBottomBarrier;
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054 A[PHI: r11
  0x0054: PHI (r11v15 com.github.gcacace.signaturepad.views.SignaturePad) = 
  (r11v13 com.github.gcacace.signaturepad.views.SignaturePad)
  (r11v18 com.github.gcacace.signaturepad.views.SignaturePad)
 binds: [B:15:0x005e, B:11:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    public static accesssetDependencyp read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SignaturePad signaturePad;
        SignaturePad signaturePad2;
        getImmutablePendingIntentFlags getimmutablependingintentflags;
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.fragment_customer_signature, viewGroup, false);
        int i2 = com.logistics.rider.glovo.R.id.buttonClearSignature;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonClearSignature, viewInflate);
        if (getsuppressannotations != null) {
            int i3 = RatingCompat + 75;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i2 = com.logistics.rider.glovo.R.id.buttonDone;
            getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.buttonDone, viewInflate);
            if (getsuppressannotations2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i2 = com.logistics.rider.glovo.R.id.signature_description;
                TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.signature_description, viewInflate);
                if (textView != null) {
                    int i5 = RatingCompat + 69;
                    MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        signaturePad = (SignaturePad) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.signature_pad, viewInflate);
                        int i6 = 96 / 0;
                        if (signaturePad != null) {
                            signaturePad2 = signaturePad;
                            i2 = com.logistics.rider.glovo.R.id.toolbar;
                            getimmutablependingintentflags = (getImmutablePendingIntentFlags) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.toolbar, viewInflate);
                            if (getimmutablependingintentflags != null) {
                                return new accesssetDependencyp(linearLayout, getsuppressannotations, getsuppressannotations2, textView, signaturePad2, getimmutablependingintentflags);
                            }
                        } else {
                            i2 = com.logistics.rider.glovo.R.id.signature_pad;
                        }
                    } else {
                        signaturePad = (SignaturePad) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.signature_pad, viewInflate);
                        if (signaturePad != null) {
                            signaturePad2 = signaturePad;
                            i2 = com.logistics.rider.glovo.R.id.toolbar;
                            getimmutablependingintentflags = (getImmutablePendingIntentFlags) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.toolbar, viewInflate);
                            if (getimmutablependingintentflags != null) {
                                return new accesssetDependencyp(linearLayout, getsuppressannotations, getsuppressannotations2, textView, signaturePad2, getimmutablependingintentflags);
                            }
                        } else {
                            i2 = com.logistics.rider.glovo.R.id.signature_pad;
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
