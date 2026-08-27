package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import o.div7Ah8Wj8;
import o.getConicEvaluation;
import o.isAdapterPositionOnScreen;
import o.isInfiniteannotations;
import o.makeTransparentStops;
import o.next;
import o.relativeMoveTo;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    public int IconCompatParcelizer;
    public boolean read;
    public final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new CoroutineLiveData$$ExternalSyntheticLambda0(29, this));
    public View write;

    public final relativeMoveTo IconCompatParcelizer() {
        return (relativeMoveTo) this.serializer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.read) {
            div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(parentFragmentManager);
            isinfiniteannotations.RemoteActionCompatParcelizer(this);
            isinfiniteannotations.read();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.write;
        if (view != null && getConicEvaluation.IconCompatParcelizer(view) == IconCompatParcelizer()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.write = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, next.NavHost);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.IconCompatParcelizer = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, makeTransparentStops.NavHostFragment);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.read = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (this.read) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, IconCompatParcelizer());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.write = view2;
            if (view2.getId() == getId()) {
                View view3 = this.write;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, IconCompatParcelizer());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IconCompatParcelizer();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.read = true;
            div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(parentFragmentManager);
            isinfiniteannotations.RemoteActionCompatParcelizer(this);
            isinfiniteannotations.read();
        }
        super.onCreate(bundle);
    }
}
