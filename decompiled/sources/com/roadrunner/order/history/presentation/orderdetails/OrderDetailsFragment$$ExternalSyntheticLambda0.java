package com.roadrunner.order.history.presentation.orderdetails;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.ui.common.widget.LoadingDialogFullScreen;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import io.sentry.hints.MediaSessionCompatQueueItem;
import o.AsyncImage76YX9Dk;
import o.AsyncImageKt;
import o.AsyncImagePainter;
import o.AsyncImagePainterKt;
import o.AsyncImagePainterStateError;
import o.AsyncImagePainterStateLoading;
import o.AsyncImagePainterStateSuccess;
import o.createFromParcel;
import o.ddefault;
import o.div7Ah8Wj8;
import o.dlambda0;
import o.getDefaultJoinLxFBmk8;
import o.getSUPPRESSannotations;
import o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1;
import o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1;
import o.invokeSuspendcomroadrunneroverlaybubblepermissionOverlayPermissionLifecycleObserverImplonCreate1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.rememberAsyncImagePainter5jETZwI;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OrderDetailsFragment$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ OrderDetailsFragment IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ OrderDetailsFragment$$ExternalSyntheticLambda0(OrderDetailsFragment orderDetailsFragment, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = orderDetailsFragment;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LoadingDialogFullScreen loadingDialogFullScreen;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        OrderDetailsFragment orderDetailsFragment = this.IconCompatParcelizer;
        Object obj2 = null;
        if (i4 != 0) {
            if (i4 == 1) {
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj;
                asyncImagePainter.getClass();
                ClipData clipDataNewPlainText = ClipData.newPlainText("copied", asyncImagePainter.RemoteActionCompatParcelizer);
                ClipboardManager clipboardManager = orderDetailsFragment.getSavedStateRegistry;
                if (clipboardManager == null) {
                    removeNodeAtDepth.serializer("clipboardManager");
                    throw null;
                }
                int i5 = write + 111;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
                dlambda0 dlambda0Var = orderDetailsFragment.onBackPressed;
                if (dlambda0Var == null) {
                    removeNodeAtDepth.serializer("snackBarManager");
                    throw null;
                }
                View viewRequireView = orderDetailsFragment.requireView();
                viewRequireView.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, asyncImagePainter.read, ddefault.RemoteActionCompatParcelizer, 0, null, null, 56);
                return createfromparcel;
            }
            if (i4 == 2) {
                AsyncImageKt asyncImageKt = (AsyncImageKt) obj;
                asyncImageKt.getClass();
                orderDetailsFragment.startActivity(asyncImageKt.IconCompatParcelizer);
                FragmentKt.write(orderDetailsFragment).write();
                return createfromparcel;
            }
            AsyncImagePainterStateError asyncImagePainterStateError = (AsyncImagePainterStateError) obj;
            asyncImagePainterStateError.getClass();
            div7Ah8Wj8 childFragmentManager = orderDetailsFragment.getChildFragmentManager();
            childFragmentManager.getClass();
            Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("LoadingDialogFullScreen");
            if (fragmentFindFragmentByTag == null) {
                loadingDialogFullScreen = new LoadingDialogFullScreen();
            } else if (fragmentFindFragmentByTag instanceof LoadingDialogFullScreen) {
                loadingDialogFullScreen = (LoadingDialogFullScreen) fragmentFindFragmentByTag;
            } else {
                Timber.RemoteActionCompatParcelizer.write(new IllegalStateException(c8$$ExternalSyntheticOutline0.m("we expected LoadingDialogFullScreen but got ", fragmentFindFragmentByTag, " for the tag LoadingDialogFullScreen")));
                int i7 = RemoteActionCompatParcelizer + 37;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 5;
                }
                loadingDialogFullScreen = new LoadingDialogFullScreen();
            }
            div7Ah8Wj8 childFragmentManager2 = orderDetailsFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            loadingDialogFullScreen.read(childFragmentManager2, asyncImagePainterStateError.RemoteActionCompatParcelizer);
            String str = asyncImagePainterStateError.IconCompatParcelizer;
            if (str != null) {
                orderDetailsFragment.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                FragmentKt.write(orderDetailsFragment).write();
            }
            AsyncImagePainterStateSuccess asyncImagePainterStateSuccess = asyncImagePainterStateError.read;
            if (asyncImagePainterStateSuccess != null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(asyncImagePainterStateSuccess.IconCompatParcelizer, new Object[0]);
                MediaSessionCompatQueueItem.IconCompatParcelizer(asyncImagePainterStateSuccess.write, asyncImagePainterStateSuccess.RemoteActionCompatParcelizer, asyncImagePainterStateSuccess.read, null, null, false, false, true, 376).RemoteActionCompatParcelizer(orderDetailsFragment.getChildFragmentManager(), "history_order_details_phone_call_error_dialog");
            }
            int i9 = RemoteActionCompatParcelizer + 115;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return createfromparcel;
        }
        AsyncImage76YX9Dk asyncImage76YX9Dk = (AsyncImage76YX9Dk) obj;
        asyncImage76YX9Dk.getClass();
        LayoutTileBinding layoutTileBinding = orderDetailsFragment.getOnBackPressedDispatcher;
        layoutTileBinding.getClass();
        ((TextView) ((getDefaultJoinLxFBmk8) layoutTileBinding.read).write).setText(asyncImage76YX9Dk.write);
        LayoutTileBinding layoutTileBinding2 = orderDetailsFragment.getOnBackPressedDispatcher;
        layoutTileBinding2.getClass();
        ((ImageButton) ((getDefaultJoinLxFBmk8) layoutTileBinding2.read).read).setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(11, orderDetailsFragment));
        LayoutTileBinding layoutTileBinding3 = orderDetailsFragment.getOnBackPressedDispatcher;
        layoutTileBinding3.getClass();
        ((getSUPPRESSannotations) layoutTileBinding3.RemoteActionCompatParcelizer).setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(12, asyncImage76YX9Dk));
        LayoutTileBinding layoutTileBinding4 = orderDetailsFragment.getOnBackPressedDispatcher;
        layoutTileBinding4.getClass();
        AsyncImagePainterStateLoading asyncImagePainterStateLoading = (AsyncImagePainterStateLoading) layoutTileBinding4.serializer;
        rememberAsyncImagePainter5jETZwI rememberasyncimagepainter5jetzwi = asyncImage76YX9Dk.RemoteActionCompatParcelizer;
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = asyncImagePainterStateLoading.serializer;
        AsyncImagePainterStateLoading.RemoteActionCompatParcelizer((invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1) getdefaultjoinlxfbmk8.write, rememberasyncimagepainter5jetzwi.serializer, true);
        AsyncImagePainterStateLoading.RemoteActionCompatParcelizer((invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1) getdefaultjoinlxfbmk8.read, rememberasyncimagepainter5jetzwi.IconCompatParcelizer, false);
        LayoutTileBinding layoutTileBinding5 = orderDetailsFragment.getOnBackPressedDispatcher;
        layoutTileBinding5.getClass();
        AsyncImagePainterKt asyncImagePainterKt = (AsyncImagePainterKt) layoutTileBinding5.write;
        invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 invokesuspendcomroadrunnermapcontainerenabledpresentationmapboxfragmentonviewcreated1 = asyncImage76YX9Dk.read;
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk9 = asyncImagePainterKt.RemoteActionCompatParcelizer;
        ((TextView) getdefaultjoinlxfbmk9.write).setText(invokesuspendcomroadrunnermapcontainerenabledpresentationmapboxfragmentonviewcreated1.RemoteActionCompatParcelizer);
        LinearLayout linearLayout = (LinearLayout) getdefaultjoinlxfbmk9.read;
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(asyncImagePainterKt.getContext());
        int i11 = 0;
        for (Object obj3 : invokesuspendcomroadrunnermapcontainerenabledpresentationmapboxfragmentonviewcreated1.serializer) {
            if (i11 < 0) {
                SQLite.serializer();
                throw null;
            }
            invokeSuspendcomroadrunneroverlaybubblepermissionOverlayPermissionLifecycleObserverImplonCreate1 invokesuspendcomroadrunneroverlaybubblepermissionoverlaypermissionlifecycleobserverimploncreate1 = (invokeSuspendcomroadrunneroverlaybubblepermissionOverlayPermissionLifecycleObserverImplonCreate1) obj3;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_order_items_item, (ViewGroup) null, false);
            int i12 = R.id.layout_order_items_item_description;
            TextView textView = (TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_order_items_item_description, viewInflate);
            if (textView != null) {
                i12 = R.id.layout_order_items_item_quantity;
                TextView textView2 = (TextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_order_items_item_quantity, viewInflate);
                if (textView2 != null) {
                    int i13 = RemoteActionCompatParcelizer + 31;
                    write = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    Space space = (Space) ExtrasKt.RemoteActionCompatParcelizer(R.id.layout_order_items_item_space, viewInflate);
                    if (space != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        space.setVisibility(i11 != 0 ? 0 : 8);
                        textView2.setText(invokesuspendcomroadrunneroverlaybubblepermissionoverlaypermissionlifecycleobserverimploncreate1.IconCompatParcelizer);
                        textView.setText(invokesuspendcomroadrunneroverlaybubblepermissionoverlaypermissionlifecycleobserverimploncreate1.RemoteActionCompatParcelizer);
                        linearLayout.addView(constraintLayout);
                        i11++;
                    } else {
                        i12 = R.id.layout_order_items_item_space;
                    }
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
            return null;
        }
        return createfromparcel;
    }
}
