package com.ui.common.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;
import o.PlaceableKt;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseInjectionBottomSheet extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    public constructJsonArray onCreate;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        Dialog dialogWrite = super.write(bundle);
        PlaceableKt placeableKt = (PlaceableKt) dialogWrite;
        placeableKt.IconCompatParcelizer().setState(3);
        placeableKt.IconCompatParcelizer().setDraggable(false);
        return dialogWrite;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        constructJsonArray constructjsonarray = this.onCreate;
        if (constructjsonarray != null) {
            return constructjsonarray;
        }
        removeNodeAtDepth.serializer("androidInjector");
        throw null;
    }
}
