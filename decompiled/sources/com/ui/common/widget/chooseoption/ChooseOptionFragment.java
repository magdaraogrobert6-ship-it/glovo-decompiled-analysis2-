package com.ui.common.widget.chooseoption;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.logistics.rider.glovo.R;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import com.ui.common.widget.chooseoption.entity.ChooseOptionFragmentArguments;
import o.getDefaultJoinLxFBmk8;
import o.getIntrinsicSizeNHjbRc;
import o.r8lambdai_bKyus5xY50_p3euqtSxFzYhbs;
import o.resizeToBitmapDimensionslambda3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ChooseOptionFragment extends BottomSheetDialogFragment {
    public getDefaultJoinLxFBmk8 getSavedStateRegistry;

    public abstract ChooseOptionFragmentArguments MediaMetadataCompat();

    public abstract GetAppStateImpl serializer();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = getDefaultJoinLxFBmk8.read(layoutInflater, viewGroup);
        this.getSavedStateRegistry = getdefaultjoinlxfbmk8;
        return getdefaultjoinlxfbmk8.IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = this.getSavedStateRegistry;
        getdefaultjoinlxfbmk8.getClass();
        RecyclerView recyclerView = (RecyclerView) getdefaultjoinlxfbmk8.read;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext()) { // from class: com.ui.common.widget.chooseoption.ChooseOptionFragment.onViewCreated.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
                rect.getClass();
                view2.getClass();
                getintrinsicsizenhjbrc.getClass();
                RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                if ((childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1) == getintrinsicsizenhjbrc.serializer() - 1) {
                    rect.setEmpty();
                    return;
                }
                Drawable drawable = this.write;
                if (drawable == null) {
                    rect.set(0, 0, 0, 0);
                } else if (this.read == 1) {
                    rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                } else {
                    rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                }
            }
        };
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        Drawable drawableWrite = resizeToBitmapDimensionslambda3.write(contextRequireContext, R.drawable.divider_grey);
        if (drawableWrite != null) {
            dividerItemDecoration.write(drawableWrite);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk9 = this.getSavedStateRegistry;
        getdefaultjoinlxfbmk9.getClass();
        ((ImageButton) ((getDefaultJoinLxFBmk8) getdefaultjoinlxfbmk9.write).read).setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(13, this));
        ChooseOptionFragmentArguments chooseOptionFragmentArgumentsMediaMetadataCompat = MediaMetadataCompat();
        r8lambdai_bKyus5xY50_p3euqtSxFzYhbs r8lambdai_bkyus5xy50_p3euqtsxfzyhbs = new r8lambdai_bKyus5xY50_p3euqtSxFzYhbs(chooseOptionFragmentArgumentsMediaMetadataCompat.getSelectionMode(), serializer());
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk10 = this.getSavedStateRegistry;
        getdefaultjoinlxfbmk10.getClass();
        ((TextView) ((getDefaultJoinLxFBmk8) getdefaultjoinlxfbmk10.write).write).setText(chooseOptionFragmentArgumentsMediaMetadataCompat.getTitle());
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk11 = this.getSavedStateRegistry;
        getdefaultjoinlxfbmk11.getClass();
        ((RecyclerView) getdefaultjoinlxfbmk11.read).setAdapter(r8lambdai_bkyus5xy50_p3euqtsxfzyhbs);
        r8lambdai_bkyus5xy50_p3euqtsxfzyhbs.read(chooseOptionFragmentArgumentsMediaMetadataCompat.getOptions());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.getSavedStateRegistry = null;
    }
}
