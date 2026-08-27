package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.DragGestureNodestartListeningForEvents1;
import o.OnPlacedModifier;
import o.accessgetSystemNavigationDowncp;
import o.accessprocessDragStart;
import o.getNativeAlpha;
import o.getNativeAntiAlias;
import o.getNativeColor;
import o.getNativeStrokeJoin;
import o.getOnPlaced;
import o.isInterested;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends Fragment implements getNativeAlpha {
    public String IconCompatParcelizer;
    public Context MediaSessionCompatQueueItem;
    public zzo RemoteActionCompatParcelizer;
    public ListView read;
    public getOnPlaced serializer;
    public OnPlacedModifier write;

    @Override // o.getNativeAlpha
    public final zzm RemoteActionCompatParcelizer() {
        return new zzm(this.MediaSessionCompatQueueItem, this.serializer);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnPlacedModifier onPlacedModifier = this.write;
        return layoutInflater.inflate(onPlacedModifier.RemoteActionCompatParcelizer.getIdentifier("license_menu_fragment", "layout", onPlacedModifier.IconCompatParcelizer), viewGroup, false);
    }

    @Override // o.getNativeAlpha
    public final void serializer() {
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.notifyDataSetChanged();
    }

    @Override // o.getNativeAlpha
    public final /* synthetic */ void write(Object obj) {
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll((List) obj);
        this.RemoteActionCompatParcelizer.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.MediaSessionCompatQueueItem = context;
        this.serializer = getOnPlaced.IconCompatParcelizer(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getNativeColor getnativecolor = ((getNativeAntiAlias) activity.getSupportLoaderManager()).RemoteActionCompatParcelizer;
            boolean z = getnativecolor.IconCompatParcelizer;
            accessprocessDragStart accessprocessdragstart = getnativecolor.write;
            if (z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Called while creating a loader");
                return;
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("destroyLoader must be called on the main thread");
                return;
            }
            accessprocessdragstart.getClass();
            getNativeStrokeJoin getnativestrokejoin = (getNativeStrokeJoin) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, 54321);
            if (getnativestrokejoin != null) {
                getnativestrokejoin.write();
                accessprocessdragstart.getClass();
                int iSerializer = DragGestureNodestartListeningForEvents1.serializer(accessprocessdragstart.IconCompatParcelizer, accessprocessdragstart.serializer, 54321);
                if (iSerializer >= 0) {
                    Object[] objArr = accessprocessdragstart.read;
                    Object obj = objArr[iSerializer];
                    Object obj2 = isInterested.IconCompatParcelizer;
                    if (obj != obj2) {
                        objArr[iSerializer] = obj2;
                        accessprocessdragstart.write = true;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        activity.getSupportLoaderManager().serializer(54321, this);
        OnPlacedModifier onPlacedModifier = this.write;
        this.read = (ListView) view.findViewById(onPlacedModifier.RemoteActionCompatParcelizer.getIdentifier("license_list", "id", onPlacedModifier.IconCompatParcelizer));
        zzo zzoVar = new zzo(this, activity);
        this.RemoteActionCompatParcelizer = zzoVar;
        this.read.setAdapter((ListAdapter) zzoVar);
        this.read.setOnItemClickListener(new zzn(0, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.IconCompatParcelizer = arguments.getString("license_activity_package_name");
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.MediaSessionCompatQueueItem.getPackageName();
        }
        this.write = getOnPlaced.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, this.IconCompatParcelizer);
    }
}
