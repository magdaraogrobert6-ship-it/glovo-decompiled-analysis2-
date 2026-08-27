package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutStatesetRoot1 extends getSetRootui {
    private static int _init_lambda3 = 1;
    private static int accessensureViewModelStore;
    public static final int[] r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private static byte r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final android.view.accessibility.AccessibilityManager r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static SubcomposeLayoutStatesetRoot1 RemoteActionCompatParcelizer(View view, String str, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        fastForEach fastforeach = (fastForEach) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? com.logistics.rider.glovo.R.layout.design_layout_snackbar_include : com.logistics.rider.glovo.R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        SubcomposeLayoutStatesetRoot1 subcomposeLayoutStatesetRoot1 = new SubcomposeLayoutStatesetRoot1(context, viewGroup, fastforeach, fastforeach);
        ((fastForEach) subcomposeLayoutStatesetRoot1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getChildAt(0)).getMessageView().setText(str);
        subcomposeLayoutStatesetRoot1.ResultReceiver = i;
        return subcomposeLayoutStatesetRoot1;
    }

    public SubcomposeLayoutStatesetRoot1(Context context, ViewGroup viewGroup, fastForEach fastforeach, fastForEach fastforeach2) {
        super(context, viewGroup, fastforeach, fastforeach2);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (android.view.accessibility.AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final void RemoteActionCompatParcelizer(int i) {
        ((fastForEach) this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getChildAt(0)).getActionView().setTextColor(i);
    }

    public final void RemoteActionCompatParcelizer(CharSequence charSequence, View.OnClickListener onClickListener) {
        int i = 0;
        android.widget.Button actionView = ((fastForEach) this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        } else {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(this, i, onClickListener));
        }
    }

    public final void write(int i) {
        ((fastForEach) this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getChildAt(0)).getMessageView().setTextColor(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void RatingCompat() {
        androidx.transition.TransitionValuesMaps transitionValuesMapsMediaDescriptionCompat = androidx.transition.TransitionValuesMaps.MediaDescriptionCompat();
        android.view.accessibility.AccessibilityManager accessibilityManager = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        int recommendedTimeoutMillis = this.ResultReceiver;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else {
            int i = Build.VERSION.SDK_INT;
            boolean z = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (i >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (z ? 4 : 0) | 3);
            } else if (z && accessibilityManager.isTouchExplorationEnabled()) {
                recommendedTimeoutMillis = -2;
            }
        }
        SubcomposeMeasureScope subcomposeMeasureScope = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        synchronized (transitionValuesMapsMediaDescriptionCompat.MediaBrowserCompatMediaItem) {
            if (transitionValuesMapsMediaDescriptionCompat.IconCompatParcelizer(subcomposeMeasureScope)) {
                forEach foreach = (forEach) transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat;
                foreach.write = recommendedTimeoutMillis;
                ((Handler) transitionValuesMapsMediaDescriptionCompat.MediaDescriptionCompat).removeCallbacksAndMessages(foreach);
                transitionValuesMapsMediaDescriptionCompat.RemoteActionCompatParcelizer((forEach) transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat);
                return;
            }
            forEach foreach2 = (forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat;
            if (foreach2 == null || foreach2.read.get() != subcomposeMeasureScope) {
                transitionValuesMapsMediaDescriptionCompat.RatingCompat = new forEach(recommendedTimeoutMillis, subcomposeMeasureScope);
            } else {
                ((forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat).write = recommendedTimeoutMillis;
            }
            forEach foreach3 = (forEach) transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat;
            if (foreach3 == null || !transitionValuesMapsMediaDescriptionCompat.read(foreach3, 4)) {
                transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat = null;
                transitionValuesMapsMediaDescriptionCompat.MediaSessionCompatToken();
            }
        }
    }

    public final void serializer(int i) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    static {
        MediaDescriptionCompat();
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new int[]{com.logistics.rider.glovo.R.attr.snackbarButtonStyle, com.logistics.rider.glovo.R.attr.snackbarTextViewStyle};
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final void RemoteActionCompatParcelizer(int i, View.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        Context context = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String string = context.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i3 = _init_lambda3 + 119;
            accessensureViewModelStore = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            String strIntern = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(strIntern);
                TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                charSequence = spannableString;
            } else {
                int i5 = accessensureViewModelStore + 113;
                _init_lambda3 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                charSequence = strIntern;
            }
        }
        RemoteActionCompatParcelizer(charSequence, onClickListener);
    }

    static void MediaDescriptionCompat() {
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = (byte) -112;
    }
}
