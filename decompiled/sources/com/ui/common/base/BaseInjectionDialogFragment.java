package com.ui.common.base;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseInjectionDialogFragment extends DialogFragment implements convertStringJsonArrayToList {
    public constructJsonArray removeOnUserLeaveHintListener;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        constructJsonArray constructjsonarray = this.removeOnUserLeaveHintListener;
        if (constructjsonarray != null) {
            return constructjsonarray;
        }
        removeNodeAtDepth.serializer("androidInjector");
        throw null;
    }
}
